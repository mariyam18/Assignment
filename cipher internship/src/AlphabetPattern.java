
public class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5; 
			char k='A';
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row+col>=n+1) {
					System.out.print(k++);
				}
				else {
					System.out.print(" ");
				}
				
			}
				System.out.println();
		
		}
	}

}
