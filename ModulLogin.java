import java.util.Scanner;

public class ModulLogin
{
	public static void main( String args[] )
	{

	for (;;)
	
	{
		String nama, keyword;
		String[] username;
		username = new String[10];
		String[] password;
		password = new String [10];

		username[0] =" Anung";
		password[0] ="usakti";

		Scanner input = new Scanner (System.in);
		
		for ( int i = 0; i < username.length; i++)
		{
			System.out.println("======SILAHKAN LOGIN======="+"");
			System.out.println(" Masukkan username = ");
			nama = input.nextLine();
			System.out.println("Masukkan password = ");
			keyword = input.nextLine();

			if (usename[i].equals(nama) && password[i].equals(keyword) )
			{
			System.out.println("login sukses");
				break;
			}
			else 
			{
				System.out.println.(Login gagal, Silahkan coba lagi");
		}	}
	}

}
}