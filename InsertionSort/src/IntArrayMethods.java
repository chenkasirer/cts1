//****************************************************************************
//Course	: Programming 1 (CTS1)
//Task  	: Monitored assignment 2
//Professor : Kratzer
//Authors	: Alex Simeonova, Chen Kasirer, Jason Kiesl
//****************************************************************************
//Base Converter converts between counting bases using two main public methods
//****************************************************************************
//insertionSort(int[] list)
//Parameters:
//list = an array of int numbers to sort
//Return value: none
//Usage: IntArrayMethods.insertionSort(values);
//****************************************************************************
import java.util.Random;

public class IntArrayMethods {
	
	// Sorts an array using the
	public static void insertionSort(int[] list)
	{
		//  For each unsorted integer
		for (int i= 1; i< list.length ; i++)
		{
			//   keep swapping with its left neighbor 
			//  until it is larger or equal to left neighbor
			int temp;
			for (int j = i; j > 0 && list[j-1] > list[j]; j--)
			{
				temp  = list[j-1];
				list[j-1] = list[j];
				list[j]   = temp;
			}
		}  
	}

	// Initializes array with random integer values
	public static void randomlyInitialize(int[] arr, int upperBound) {
		Random random = new Random();
		// initializes all components of array with initialValue
		for (int i = 0; i < arr.length; ++i)
			arr[i] = random.nextInt(upperBound);
	}

	// Checks if an array is sorted or not 
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length-1; ++i)
			if (arr[i] > arr[i+1])
				return false;
		return true;
	}
}