package traductor;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import sun.misc.Regexp;
import traductor.diccionario;

import javax.swing.JOptionPane;

public class apptranslate {
	
	// funcion que busca y carga el diccionario en un lista
	public List<diccionario> diccionario (){
		List<diccionario> lista = new ArrayList<diccionario>();
		try {
			diccionario dic;
			
			File file = new File("/home/christian/development/traductor/src/traductor/diccionario.txt");
			BufferedReader entrada = new BufferedReader(new FileReader(file));
			String linea;
			System.out.println("Llegamos a qui");
			while (entrada.ready()) {
				dic = new diccionario();
				linea = entrada.readLine();
				//System.out.println(linea);
				String[] kv = linea.split(",");
				System.out.println(kv[0]);
				
				dic.setClave(kv[0].toString());
				dic.setTraduccion(kv[1].toString());
				//System.out.println(linea);
				lista.add(dic);
			}
		} catch (IOException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
			System.err.print(e);
		}
		return lista;
	}
}
