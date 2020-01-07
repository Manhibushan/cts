package array;

public class Myarr {
	public static void main(String[] args) {
		
	 int arr[][] = new int[3][4];
	 int arr2[][]=new int[3][4];
	 int arr3[][]=new int[3][4];
	
     int i, j, num=1;
	  
     for(i=0; i<3; i++)
     {
         for(j=0; j<4; j++)
         {
            
                 arr[i][j] = num;
                 num++;
            
         }
     }
     
	  
      for(i=0; i<3; i++)
     {
         for(j=0; j<4; j++)
         {
            
                 System.out.print("arr[" +i+ "][" +j+ "] = " +arr[i][j]+ "\t");
            
             
         }
         System.out.println();
     }
  }

}
