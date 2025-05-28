package Files;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivos arch = new Archivos("consorti.txt");
		
		arch.crearFileConBuffer(arch.getFiles(), "hola mundo");
		
	}

}
