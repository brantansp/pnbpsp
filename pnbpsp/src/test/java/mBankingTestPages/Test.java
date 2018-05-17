package mBankingTestPages;

public class Test {

	  public static void main (String args [])
	  {
		  int a[] =  {1,2,2,3,4,4,5,5,6,7};
		  
		  for(int i=0; i< a.length; i++)
		  {
			  for(int j = 0; j<i; j++)
			  {
				  if (a[i]==a[j])
				  {
					  Integer.valueOf(a[i]).equals(Integer.valueOf(a[j]));
					  break;
				  }
			  }
			  System.out.println(a[i]);
		  }
		  
	  }
}
