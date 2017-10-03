package Lab1;
import java.util.Random;
/*
 * this program compare the complexity between 
 * the buble, insertion and selection sort algorithm
 * Programmer Youssouf Diallo
 * email yusufdiallo89@gmail.com
 */
public class Lab1App {
	public static void main(String[] args) {
        Random random=new Random();
        int taille;
        Lab1 myLab1,myLab2, myLab3;
        /*
         * my put my experiment in an array 
         */
   int []experiment={100000,200000,300000,400000,500000};
   System.out.println("We are measuring the complexity of buble, insertion and selection sort algorithm");
	  System.out.println("=================================");
        
   for( int i=0; i<experiment.length;i++) {  
	    taille=experiment[i];
	     myLab1=new Lab1(taille);
		 myLab2=new Lab1(taille);
		 myLab3=new Lab1(taille);
		 
       for(int j=0; j< taille; j++) {
			int n=(int) (random.nextInt(taille));
			myLab1.insertElements(n);
			myLab2.insertElements(n);
			myLab3.insertElements(n);
		}
	double time1=System.currentTimeMillis();
	myLab1.selectionSort();
	 double time2=System.currentTimeMillis();
	 
	 
	 System.out.println("The complexity of this experiment is     ==========    " +experiment[i] );
	  System.out.println(" ================================");
	 System.out.println(" T"
	 		+ "The time for selection sort is  = " + (time2-time1)/1000 +" secondes  " );
	
	 double time11=System.currentTimeMillis();
	myLab2.insertitionSort();
	 double time22=System.currentTimeMillis();

	 System.out.println(" The time for the insertion sort is =  " + (time22-time11)/1000 +" secondes "  );
	  
	 double time33=System.currentTimeMillis();
	 
	myLab3.bubleSort();
	 double time44=System.currentTimeMillis();
	
	 System.out.println(" The time for buble sort is  = " + (time44-time33)/1000 +" secondes "  );
	  System.out.println(" Done with this experiment " +experiment[i]);
	  System.out.println("=================================== ");    
   }
        System.out.println(" I am done with my experiments");		
		
}
}
