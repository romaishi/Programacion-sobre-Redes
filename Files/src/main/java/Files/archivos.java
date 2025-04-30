package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivos {

	PrintStream ps;
	File file;
	
	public archivos()
	{
		ps = new PrintStream(System.out);
		//c:\\user\\gonza\\miArchivo.txt
		file = new File("miArchivo.txt"); 
		/*
		file.createNewFile();
		file.delete();
		file.deleteOnExit();
		file.exists();
		file.getAbsoluteFile();
		file.getName();
		file.getParent();
		file.getTotalSpace();
		file.isHidden();
		file.isFile();
		file.isDirectory();
		file.list();
		file.listFiles();
		file.mkdir();
		file.length();
		file.renameTo(new File("nuevoNombre.txt"));
		*/
		this.rutaFiles(file);
		this.crearFileConPrintStreamEasy(file);
	}
	
	
	
	
	
	
	/**
	 * ESTE TEXTO NO TIENE NINGUNA ETIQUETA DE IDENTIFICACION. ESTO NO VA A
	 * AAPARECER :( Tambien se puede agregar referencias a class o methodos o
	 * atributos con la instruccion: {
	 *
	 * @ por ejemplo: {@code <html></html>} o usar {@link String}
	 *
	 * @param f Este metodo recibe un archivo.
	 * @see FlujoDeDatos.File.
	 * @since v1.0
	 */
	public void rutaFiles(File f)
	{
		
	}

	public void crearFileConPrintStreamEasy(File f) 
	{
		FileOutputStream fos = null;
		PrintStream fs = null;
		
		try {
			fos = new FileOutputStream(f);
			fs = new PrintStream(fos);
			
			fs.print("Una linea");
			fs.println("Nueva linea");
			fs.write('d');
			fs.append("Consorti");
			
			fs.flush();
		} catch (FileNotFoundException e) {
			Logger.getLogger(archivos.class.getName()).log(Level.WARNING,null,e);
		} finally {
			try {
				if(fs != null)
					fs.close();

				if(fos != null)
					fos.close();
			} catch (IOException e){
				Logger.getLogger(archivos.class.getName()).log(Level.WARNING,null,e);
			}
			

		}
	}
	
	public void crearFileConPrinter(File f) 
	{
		
	}

	/**
	*
	* @param f
	*/
	public void crearFileConBuffer(File f) {
	}
	/**
	*
	* @param f
	*/
	public void crearFileConBuffer(File f) {
	}
	/**
	 * Descripcion
	 *
	 * @param f un archivo al leer
	 * @return Todo el texto leido.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String LeerFileConBuffer(File f) throws FileNotFoundException, IOException {
	}

	public void leerFileCaracterAcaractet(File f) {
	}
}
