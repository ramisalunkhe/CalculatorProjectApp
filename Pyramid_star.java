
public class Pyramid_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=5;
     for(i=0;i<k;i++)
		{
			for(j=k-i;j>1;j--)
			{
			System.out.print(" ");	
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
     
	}

}
