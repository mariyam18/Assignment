
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalrow=5;
		for(int row=1;row<=totalrow;row++)
		{
			for(int col=totalrow-row;col>=1;col--)
			{
					System.out.print("  ");				//here 2 character we take one is star and another is space
			}
			for(int col=1;col<=row;col++)	{
					System.out.print("*   ");		//2 space for better result
				}
			System.out.println();

			}
		
		}
	}

