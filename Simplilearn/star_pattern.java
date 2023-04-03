package Simplilearn;

class star_pattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=0;
		int k=0;
		int n=5;
		for (int i=0;i<n;i++)
		{
			j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			
			while(j<=n-i)
			{
				System.out.print(" ");
				j++;
			}
			System.out.println();
			
		}

	}

}

