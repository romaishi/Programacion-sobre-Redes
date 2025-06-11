package Files;

import java.io.PrintStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream(System.out);
		Archivos arch = new Archivos("consorti.txt");
		
		arch.crearFileConBuffer(arch.getFiles(), "hola mundo");
		
		arch.LeerFileConBuffer(arch.getFiles());
		
		
		arch.modificarArchivoTemporalLinea(arch.getFiles(), "hola", "chau");
		
	}

}
