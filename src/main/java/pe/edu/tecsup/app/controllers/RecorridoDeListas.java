package pe.edu.tecsup.app.controllers;

import java.util.ArrayList;
import java.util.List;

public class RecorridoDeListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nombres = new ArrayList<String>();
		
		nombres.add("Roberto");
		nombres.add("Jose");
		nombres.add("Julia");
		
		for (String s : nombres) {
			System.out.println(s);
		}

	}

}
