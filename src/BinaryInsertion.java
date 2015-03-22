//My binary Insertion @@still with bugs
//****************************************************
/*public class BinaryInsertion {
  public static void main(String[] args)
  {
	  int[] c={154,58,5,542,5,84,96,35,954,269,516,169,503,85,695,415,492};//
		System.out.println("原始顺序：");
		printA(c);
		binaryInsertion(c);
		System.out.println("排序顺序：");
		printA(c);
  }
  public static void printA(int[] a)
	{
		for(int i=0 ; i< a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}		
	}
  public static void binaryInsertion(int[] a)
  {
	  int temp,L=0 , H=0,mid =0;
	  int[] c = a;
	  
	  for(int i =1 ; i < c.length;i++)
	  {
		  temp = c[i];
		  L=0;H=i-1;
		  while(L<H)
		  {
			  mid = (int) Math.floor((L+H)/2);
			  if(c[mid]>=temp)   
			  {
				  H=mid;
			   if(L==mid)
			   {
				 H=L;     //L==mid 时，进行终止
			   }
			  }

			  else if(H==i-1&&L==mid)
			  {
				  H=i;L=H;
			  }
			  
			  else if(L==H-1)
			  {
				  L=H;    //当L==H-1时，进行终止
			  }
			  else L=mid;
			  //if(L==H-1) break;
		  }
		  for(int j = i ;j>H ; j--)
		  {
			  c[j]=c[j-1];
		  }
		  c[H] = temp;
	  }	  
  }
	
}*/

//*********************************************************************
//  blog 
public class BinaryInsertion {  
  
    public int[] binSort(int r[], int n) {  
          
        for(int i=1;i<n;i++)  
        {  
            int temp=r[i];  
            int low=0;  
            int high=i-1;  
              
            while(low<=high)  
            {  
                int mid=(low+high)/2;               //折半  
                if(temp<r[mid])high=mid-1;         //插入点在低半区  
                else low=mid+1;                      //插入点在高半区  
            }  
              
            System.out.println("low:"+low+" high:"+high);  
              
            for(int j=i-1;j>=high+1;j--)  
            {  
                r[j+1]=r[j];  
            }  
              
            r[high+1]=temp;  
        }  
          
        return r;  
    }  
  
    public static void main(String[] args) {  
        int[] test = { 3, 9, 8, 55, 97, 33, 6, 1 };  
  
        test = new BinaryInsertion().binSort(test, test.length);  
  
        for (int i : test) {  
            System.out.print(i+" ");  
        }  
    }  
}  
