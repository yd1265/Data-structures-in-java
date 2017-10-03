package Lab1;

public class Lab1 {
	private int numberElements;
	private int [] myArrays;
	
	/*
	 *  this is the contructor for the lab1
	 */
	public Lab1(int elemets) {
		myArrays=new int[elemets];
		  numberElements=0;
		
	}
	/*
	 * this function allow to add an element in the array
	 */
	public void insertElements(int element) {
		 myArrays[numberElements]=element;
		  numberElements++;
	}

	/*
	 * this function allow the swape
	 */
	public void swape(int a, int b) {
		 int temp=a;
		 a=b;
		 b=temp;
	}
	/*
	 * this is the implementation of buble sort
	 */
	public void bubleSort() {
		int n=myArrays.length;
		int temp=0;
		for(int i=0;i< n; i++) {
			for(int j=1;j<(n-1);j++) {
			 if(myArrays[j-1] > myArrays[j]) {
			 	temp=myArrays[j-1];
			 	 myArrays[j-1]=myArrays[j];
			 	 myArrays[j]=temp;
		     }
			}
		}
	
	}
	
	/*
	 * this is the implementation on of the insertion sort
	 */
	public void insertitionSort() {
		int in,out;
		
		for( out=1; out <numberElements; out++) {
			int temp=myArrays[out];
			in =out;
			while( in > 0 && myArrays[in-1] >=temp) {
				myArrays[in]=myArrays[in-1];
				
				in--;
			}
			myArrays[in]=temp;
		}
	}
	
	/*
	 * this an implementation of selection sort
	 */
	public void selectionSort() {
		 int n=myArrays.length;
		for(int i=0;i<(n-1);i++) {  
			 // find the minimun element
			int min=i;
			for(int j=i+1; j<n; j++)  // inner loop
				if(myArrays[j] < myArrays[min]) 
					    min=j;
			  int temp=myArrays[min];
			   myArrays[min]=myArrays[i];
			   myArrays[i]=temp;
				
			
		}
		
	}
	
	/*
	 * this is function display  my values
	 */
	public void display() {
		String s=" ";
		for( int i=0; i <myArrays.length; i++) {
			System.out.print(s+ myArrays[i]);
		}
		
	}
	
}
