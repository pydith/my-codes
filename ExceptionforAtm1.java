import java.util.*;
class mye extends Exception

{

	String s;

	mye(String s)

	{

		super(s);

	}

}

public class ExceptionforAtm1 {

public static void main(String[] args)throws Exception {

	ArrayList<String> cardno=new ArrayList<>();

	cardno.add("146465164663");

	cardno.add("788545532486");

	ArrayList<String> password=new ArrayList<>();

	password.add("456456");

	password.add("12334");

	ArrayList<Integer> balance=new ArrayList<>();

	balance.add(25000);

	balance.add(30000);

	Scanner sc=new Scanner(System.in);

	try

	{

		System.out.println("Enter your cardno:");

	    String card=sc.nextLine();

	    if(cardno.contains(card))

	    {

	    	int index=cardno.indexOf(card);

	    	System.out.println("Choose 1-for cash withdraw"+" 2-for Balance Enquiry"+" 3-for Money deposit"+"4- for exit");

	    	int n=sc.nextInt();

	    	sc.nextLine();

	    	switch(n)

	    	{

	    	case 1:

	    		System.out.println("Enter amount to withdraw :");

	    		int withdraw=sc.nextInt();

	    		sc.nextLine();

	    		if(balance.get(index)>=withdraw)

	    		{

	    		System.out.println("Enter your password:");

	    		String ps=sc.nextLine();

	    		if(password.get(index).equals(ps))

	    		{

	    			int cbal=balance.get(index)-withdraw;

	    			System.out.println(withdraw+" is debited");

	    			balance.set(index, cbal);

	    			System.out.println("current balance is: "+balance.get(index));

	    		}

	    		else

	    		{

	    			throw new mye("password incorrect");

	    		}

	    		}

	    		else

	    		{

	    			throw new mye("Insufficient funds");

	    		}

	    		break;

	    	case 2:

	    		System.out.println("Enter your password :");

	    		String ps=sc.nextLine();

	    		if(password.get(index).equals(ps))

	    		{

	    			System.out.println("your account balance is :"+balance.get(index));

	    		}

	    		else

	    		{

	    			throw new mye("password Incorrect");

	    		}

	    		break;

	    	case 3:

	    		System.out.println("Enter amount to deposit :");

	    		int dep=sc.nextInt();

	    		sc.nextLine();

	    		System.out.println("Enter your password : ");

	    		String ps1=sc.nextLine();

	    		if(password.get(index).equals(ps1))

	    		{

	    		int upbal=balance.get(index)+dep;

	    		balance.set(index, upbal);

	    		System.out.println("Current balance is :"+balance.get(index));

	    		}

	    		else

	    		{

	    			throw new mye("password Incorrect");

	    		}

	    		break;
			}
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

