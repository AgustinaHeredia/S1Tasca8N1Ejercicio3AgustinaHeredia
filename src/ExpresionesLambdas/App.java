package ExpresionesLambdas;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> meses = new ArrayList<String>();
		
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add("Octubre");
		meses.add("Noviembre");
		meses.add("Diciembre");
		
		meses.forEach((name) -> System.out.println(name));
		
	}

}
