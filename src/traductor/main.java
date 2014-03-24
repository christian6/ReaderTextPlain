/**
 * 
 */
package traductor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


/**
 * @author christian
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hola mundo.");
			// cargamos el archivo diccionario.txt
			List<diccionario> lista = new ArrayList<diccionario>();
			lista = new apptranslate().diccionario();
			// pedimos el ingreso por teclado
			String entrada = "";
			entrada = JOptionPane.showInputDialog("Ingrese la palabra a traducdir : >");
			// realizamos la busqueda
			String traduccion = "";
			System.out.println("lista size "+lista.size());
			for (int i = 0; i < lista.size(); i++) {
				// preguntamos si se encuentra conincidencias con la palabra
				// si no mostramos un mensaje "Oh, tengo que aprehender mas palabras "
				System.out.println("de lista "+lista.get(i).getClave());
				if(lista.get(i).getClave().toLowerCase().trim().equals(entrada.toLowerCase().trim())){
					traduccion = lista.get(i).getTraduccion();
					break;
				}
				/*if(lista.get(i).getClave().toLowerCase().trim() == ''){
					traduccion = lista.get(i).getTraduccion(); 
				}*/
			}
			System.out.println(traduccion);
			JOptionPane.showMessageDialog(null, traduccion,"Traducción",JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
}
