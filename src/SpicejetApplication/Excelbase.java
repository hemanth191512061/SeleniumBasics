package SpicejetApplication;

import java.io.IOException;
import java.util.ArrayList;

public class Excelbase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excelsheet base=new Excelsheet();
		ArrayList<String> arraylist=base.getData("Nani");
		//System.out.println(arraylist.get(0));
		//System.out.println(arraylist.get(1));
		//System.out.println(arraylist.get(2));
		//System.out.println(arraylist.get(3));
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}

	}

}
