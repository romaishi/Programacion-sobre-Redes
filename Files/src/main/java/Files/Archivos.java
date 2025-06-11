package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
	
	PrintStream ps;
	File file;
	File filee;
	
	public Archivos(String ruta){
		ps = new PrintStream(System.out);
		file = new File(ruta);
		/**
		file = new File("C:\\Users\\Redes-20\\Desktop\\PornHub.porno");
		file.delete();
		file.deleteOnExit();
		file.exists();
		file.getAbsoluteFile();
		file.getAbsolutePath();
		file.getName();
		file.getParent();
		file.getPath();
		file.getTotalSpace();
		file.isDirectory();
		file.isHidden();
		file.isFile();
		file.list();
		file.listFiles();
		file.mkdir();
		file.renameTo(file);
		 */
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
	 * @exception
	 * @throw
	 * @return
	 * @author Redes-20
	 */
	public File getFiles()
	{
		return this.file;
	}

	public void crearFileConPrintStreamEasy(File f) {
		this.crearFileConPrintStreamEasy(file);
		FileOutputStream fos = null;
		PrintStream fs = null;
	
		try {
			fos = new FileOutputStream(file);
			fs = new PrintStream(fos);
			
			fs.print("Visiten Xvideos.com");
			fs.println("Visiten PornHub.com");
			fs.write('d');
			fs.append(("Gonza gil"));
			fs.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		} finally {
			try {
				if(fs != null) {
					fs.close();
				}
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}
	}//Fin crearFileConPrintStreamEasy
	
	public void crearFileConPrinter(File f) { // Mas optimizado
		FileWriter fw = null; //usa buffered directo
		PrintWriter pw = null;
		try {
			if(!f.exists()) {
				try {
					f.createNewFile();
				}catch(IOException e) {
					Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
				}
			}
			
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
			
			pw.print("Visiten Xvideos.com");
			pw.print("Crearle una cuenta a MonsterCreator");
			pw.println("Visiten PornHub.com");
			pw.write('d');
			pw.append(("Gonza genio"));
			pw.flush();
		}catch(FileNotFoundException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		}catch(IOException e){
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		}finally{
			try{
				if(pw != null) {
					pw.close();
				}
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}//Finally
		
	}
	
	/**
	*
	* @param f
	 * @return 
	*/
	public void crearFileConBuffer(File f, String texto) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(f , false ); //append
			bw = new BufferedWriter(fw);
			
			//bw.append("ss");
			//bw.write("s");
			bw.append(texto);
			bw.newLine();
			bw.flush(); //Opcional Buffered
		}catch(IOException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		}finally {
			try {
				if(fw != null)
					fw.close();
				if(bw != null)
					bw.close();
			}catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}
	}
	
	/**
	 * Descripcion
	 *
	 * @param f un archivo al leer
	 * @return Todo el texto leido.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String LeerFileConBuffer(File f) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader( fr );
			
			String line = "", texto = "";
			while(  (line = br.readLine() ) != null )
			{
				texto.concat( line.concat("\n")  );
			}
			
			return texto;
		} catch (FileNotFoundException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		} catch (IOException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		}finally {
			try {
				if( fr != null)
					fr.close();
				if( br != null)
					br.close();
			}catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
			}
		}
		
		return null;
	}
	public String leerFileCaracterCaracter(File f) {
		
		FileReader fr = null;
		
		try
		{
			fr = new FileReader(f);
			
			int car, EOF = -1;
			String texto = "";
			
			while((car = fr.read()) != EOF) {
			
				if (car == '\n') {					
					texto.concat("\n");
				}else {					
					texto.concat(String.valueOf(car));
				}
				
			}
			return texto;
		}catch (IOException e){
			
		}finally {
			try {
				if(fr != null)
					fr.close();
			}catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}
		return null;
		
	}
	
	
	public void modificarArchivoTemporalLinea(File archivoOriginal, String buscar, String reemplazar)  {    
		File archTemp = new File(archivoOriginal.getAbsoluteFile()+".tmp");
		
		try (
				BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
				BufferedWriter bw = new BufferedWriter(new FileWriter(archTemp));				
			)
		
		{
			String linea = ""; String EOF = null;
			while((linea = br.readLine()) != EOF) 
			{
				
				//La edicion necesaria
				if(linea.contains(buscar))
				{
					linea = linea.replace(buscar, reemplazar);
				}
				
				bw.write(linea);
				bw.newLine();
			}
		if(!archivoOriginal.delete())
			throw new IOException("No se pudo borrar el archivo original");
		
		if(!archTemp.renameTo(archivoOriginal))
			throw new IOException("No se pudo renombrar el archivo temporal");
			
		}catch (Exception e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		}
	}
	
	public void modificarArchivoConLinkedList(File archivoOriginal, String buscar, String reemplazar) {  
		List<String> textoCompleto = new LinkedList<>();
		
		//Leer archivo y volcar los datos en memoria VOLATIL (un array)
		try(BufferedReader br = new BufferedReader(new FileReader(archivoOriginal)))
		{
			String lineas = ""; String EOF = null;
			while((lineas = br.readLine())!= EOF)
			{
				//Puede tener logica para filtrar que entra al Array o no
				textoCompleto.add(lineas);
			}
		
		} catch(IOException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		}
		
		//Modificar lineas que contengan el texto a buscar
		//for completo linea a linea
		for( int i =0; i < textoCompleto.size() ; i++  )
		{
			//Aca logica para modificar lo que necesitemos
			if( textoCompleto.get(i).contains(buscar) )
				textoCompleto.set(i,  textoCompleto.get(i).replace(buscar, reemplazar));
		}
		
		for(String linea : textoCompleto)
		{
			if( linea.contains(buscar) )
				textoCompleto.set(
						textoCompleto.indexOf(linea),//index
						linea.replace(buscar, reemplazar));//dato a modificar
		}
		
		//Escribir de nuevo todo el contenido modificado en el archivo original
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoOriginal)))
		{
			for(String linea : textoCompleto) {
				bw.write(linea);
				bw.newLine();
			}
		} catch (IOException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING, null, e);
		}
	}
}