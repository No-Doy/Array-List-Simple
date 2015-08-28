import java.util.ArrayList;
import java.util.Scanner;

public class firstArrayList {
	//globals
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> myarray = new ArrayList<Integer>();
	
	public static void main (String[] args){
		System.out.println("enter array type 0 when finsihed");
		int in = reader.nextInt();
		while (in != 0)
		{
			myarray.add(in);//add the numbers into array
			in = reader.nextInt(); //ask for other integer until user types 0
		}
		//user types zero
		printArray();
		
		System.out.println("what number would you like to delete?");
		int del = reader.nextInt();
		for(int i = 0; i < myarray.size(); i++)
		{
			if(myarray.get(i) == del){
				myarray.remove(i);
				break;
			}
		}
		//break will put us right here
		printArray();
	}
	public static void printArray(){
		System.out.println("-----");
		for(int i : myarray)//get each item in the array list to print
		{
			//for each variable 'i' inside of myarray 
			System.out.println(i); //spit out each number previously choosen
		}
		
	}
}
