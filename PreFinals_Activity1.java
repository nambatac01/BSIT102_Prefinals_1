import java.util.*;


public class PreFinals_Activity1

{

    public static void main(String[] args) 
    {
    Scanner scan = new Scanner(System.in);
    String onesarray[] = {" ","one","two","three","four","five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" }; //set of string contains a number one to nineteen
                      
             String secondvalue[] = {" ", "ten", "twenty", "thirty", "fourty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" }; //set of string that contains tens number
                      
             System.out.println("Enter a number: ");
    int num = scan.nextInt(); // it is where the user enter a number
    
    //conditional statement
    if(num <=19)
	{
		//to convert int to string to get the first value
    	int unangnumero = Integer.parseInt(Integer.toString(num).substring(0,1));	
    	//unangnumero is converted number and uses index
    	System.out.println(onesarray[num]);
    }
    else if(num <= 99)
    {
    //to get the first and second number and convert it to string 
    int unangnumero = Integer.parseInt(Integer.toString(num).substring(0,1));
    int pangalawa = Integer.parseInt(Integer.toString(num).substring(1,2));
    //to regulate the positiong of 2 different integer
    System.out.println(secondvalue[unangnumero]+" "+onesarray[pangalawa]);
    }
    else if(num <=999)
    {
    //this is for getting the first, second and third number and changed it to string and get their values
    int unangnumero = Integer.parseInt(Integer.toString(num).substring(0,1));
    int pangalawa = Integer.parseInt(Integer.toString(num).substring(1,2));
    int third = Integer.parseInt(Integer.toString(num).substring(2,3));
    //I used 2 string and 3 integers to incline the position and add the hundred word
    System.out.println(onesarray[unangnumero]+" "+"hundred"+ " " +secondvalue[pangalawa]+" "+ onesarray[third]);
    }
    else
    {
    int unangnumero = Integer.parseInt(Integer.toString(num).substring(0,1));
    //since the limit is one thousand i used only one string and the unangnumero then add the thousand word
    System.out.println(onesarray[unangnumero]+" "+"thousand");
    }
    }
    
    
}
