/*array:
=>it is an container where we can store the data
=>syntax:
  int a[]={};
=>it start with index value 0

  dis-adv :
   =>we can only store the homogenous type of data 

  if we try to store the hetrogenous type - imcompatible type error

  examples:
    =>static array:*/

 // =>retriving values from static array:
       public class Task1 {
	public static void main(String [] args) {
		int a[]= {12,13,14,15,16};
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}



  
