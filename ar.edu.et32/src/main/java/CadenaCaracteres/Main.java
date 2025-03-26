package CadenaCaracteres;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra = "LinKevin";
		
		palabra.charAt(5); //Agarra un caracter X
		palabra.compareTo("Kevin"); // False compara un texto completo
		palabra.compareToIgnoreCase("linkevin"); //True
		palabra.concat("/profile"); //Agrega texto al final
		palabra.contains("Ke"); //Devuelve si existe el texto
		palabra.indexOf('\n'); //Lo mmismo que el charAt pero busca un caracater
		palabra.indexOf("Ke"); //Ubicacion de esa palabra devuelve 3
		palabra.length(); //largo total de la cadena
		palabra.lastIndexOf('i'); //Ultima paaricion de un texto o caracter
		palabra.replace("Kevin", "Roman");
		palabra.replace("i", "X"); // LXKevin
		palabra.replaceAll("i", "x.X"); //Lx.XnKex.Xn
		palabra.toString();
		palabra.valueOf(5); //Transforma a texto
		palabra.trim(); //Quita espacions en blNCO delante y al final
		palabra.toLowerCase();
		palabra.toUpperCase();
		
		palabra.toCharArray(); //Convierte un string en un vector
		// ['L', 'i', 'n', 'K', 'e', 'v', 'i', 'n']
		palabra.split("K");
		palabra.substring(2,4); // LinKevin -> nKev
		
	}

}
