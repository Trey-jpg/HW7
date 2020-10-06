import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		ArrayList myNumbers = new ArrayList();
		while(input.hasNext())
		{
			myNumbers.add(input.nextLine());
		}
		input.close();

		for(int i = 0; i < myNumbers.size(); i++)
		{
			System.out.println(myNumbers.get(i).toString());
		}
		
		BibleBook to = new BibleBook();
		System.out.println(to);

		//Need my linearsearch to take in the array of BibleBook and read each line for user input.
		public static int linearSearch(int[] arr, int key){    
			for(int i=0;i<arr.length;i++){    
				if(arr[i] == key){    
					return i;    
				}    
			}    
			return -1;    
		}    
		
	}
}