package es.consejeria.bbdd;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TablaColegio {
    private ArrayList<Colegio> colegios;

	public TablaColegio() {
		super();
		this.colegios= new ArrayList<Colegio>();
		leerDeDisco();
	}
    
	
	public ArrayList<Colegio> getColegios() {
		return colegios;
	}

	public void setColegios(ArrayList<Colegio> colegios) {
		this.colegios = colegios;
	}
    
   public void setColegio(Colegio colegio){
	    colegios.add(colegio);
	    escribirEnDisco();
    }


private void escribirEnDisco() {
	FileOutputStream fos;
	ObjectOutputStream oos;//
	try {
		fos = new FileOutputStream("listaColegios.ser");
		oos = new ObjectOutputStream(fos);//
		oos.writeObject(colegios);//
		oos.close();
	 } catch (FileNotFoundException e) {
		e.printStackTrace();
	 } catch (IOException e) {
	   e.printStackTrace();
	}
}


public void deleteColegio(String nomColegio) {
			int indice=-1;
		    for (int i = 0; i < colegios.size(); i++) {
		    	if(colegios.get(i).getNombre().equals(nomColegio)){
		    	  		indice=i;
		 	   	}
			}
		    if(indice!=-1){
		    	colegios.remove(indice);
		    	escribirEnDisco();
		    }
    }
	public void leerDeDisco(){
		FileInputStream fos;
	    ObjectInputStream oos;//
		try {
			fos = new FileInputStream("listaColegios.ser");
			oos = new ObjectInputStream(fos);//
			colegios = (ArrayList<Colegio>) oos.readObject();//
		    oos.close();
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		 } catch (IOException e) {
		   e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
































