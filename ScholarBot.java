import java.sql.*;
import java.util.Scanner;

public class ScholarBot {
    private Connection connection;
    private Scanner scanner;

    public ScholarBot() {
        scanner = new Scanner(System.in);
        connectToDatabase();
    }

    private void connectToDatabase() {
        try {
            // Change the connection URL, username, and password as per your database configuration
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholar_bot", "username", "password");
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("Welcome to ScholarBot! How can I assist you today?");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("exit")) {
                System.out.println("Goodbye! Happy studying!");
                break;
            } else if (input.contains("study materials")) {
                askForSubject();
            } else if (input.contains("course planning")) {
                suggestCoursePlan();
            } else if (input.contains("set goal")) {
                setAcademicGoal();
            } else if (input.contains("guidelines")) {
                showGuidelines();
            } else if (input.contains("events")) {
                showEvents();
            } else {
                System.out.println("I'm sorry, I didn't understand that. Try asking about study materials, course planning, setting a goal, guidelines, or events.");
            }
        }
    }

    private void askForSubject() {
        System.out.println("Which subject are you looking for study materials for?");
        String subject = scanner.nextLine();
        String materials = getStudyMaterials(subject);

        if (materials != null) {
            System.out.println("Recommended study materials for " + subject + ": " + materials);
        } else {
            System.out.println("Sorry, I don't have resources for that subject yet.");
        }
    }

    private String getStudyMaterials(String subject) {
        String materials = null;
        String query = "SELECT material, link FROM study_materials WHERE subject = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, subject);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                materials = rs.getString("material") + " (Link: " + rs.getString("link") + ")";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return materials;
    }

    private void suggestCoursePlan() {
        System.out.println("What is your major?");
        String major = scanner.nextLine();
        String courses = getCourses(major);

        if (courses != null) {
            System.out.println("Suggested courses: \n" + courses);
        } else {
            System.out.println("I don't have specific course suggestions for that major yet.");
        }
    }

    private String getCourses(String major) {
        StringBuilder courses = new StringBuilder();
        String query = "SELECT name, description FROM courses WHERE major = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, major);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                courses.append("Course: ").append(rs.getString("name"))
                       .append(", Description: ").append(rs.getString("description")).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses.length() > 0 ? courses.toString() : null;
    }

    private void setAcademicGoal() {
        System.out.println("What is your username?");
        String username = scanner.nextLine();
        System.out.println("What academic goal would you like to set for this semester?");
        String goal = scanner.nextLine();
        saveGoal(username, goal);
        System.out.println("Your academic goal has been set.");
    }

    private void saveGoal(String username, String goal) {
        String query = "INSERT INTO user_goals (username, goal) VALUES (?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, goal);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showGuidelines() {
        String guidelines = getGuidelines();
        if (guidelines != null) {
            System.out.println("Academic Guidelines:\n" + guidelines);
        } else {
            System.out.println("No guidelines found.");
        }
    }

    private String getGuidelines() {
        StringBuilder guidelines = new StringBuilder();
        String query = "SELECT title, content FROM guidelines";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                guidelines.append("Title: ").append(rs.getString("title"))
                          .append(", Content: ").append(rs.getString("content")).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return guidelines.length() > 0 ? guidelines.toString() : null;
    }

    private void showEvents() {
        String events = getEvents();
        if (events != null) {
            System.out.println("Upcoming Events:\n" + events);
        } else {
            System.out.println("No upcoming events found.");
        }
    }

    private String getEvents() {
        StringBuilder events = new StringBuilder();
        String query = "SELECT name, date, description FROM events";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                events.append("Event: ").append(rs.getString("name"))
                      .append(", Date: ").append(rs.getDate("date"))
                      .append(", Description: ").append(rs.getString("description")).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return events.length() > 0 ? events.toString() : null;
    }

    public static void main(String[] args) {
        ScholarBot scholarBot = new ScholarBot();
        scholarBot.start();
    }
}
