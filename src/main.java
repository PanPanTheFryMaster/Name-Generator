import java.util.Random;
import java.io.*;
public class main {

	public static void main(String[] args){
		String nome = null, cognome = null;
		int n = 0;
		File file = new File("src/nomi.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Random rand = new Random();
		int i = rand.nextInt(21986);
		while(n != i) {
			try {
				nome = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			n++;
		}
		
		
		try {
			br.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		File file2 = new File("src/cognomi.txt");
		try {
			br = new BufferedReader(new FileReader(file2));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		i = rand.nextInt(1349);
		n = 0;
		while (n != i) {
			try {
				cognome = br.readLine();
			}catch (IOException e){
				e.printStackTrace();
			}
			n++;
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(nome + " " +cognome);
		
	}

}
