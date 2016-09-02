/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariopeluchitos;

/**
 *
 * @author YolimaAndrea
 */
public class AgregarProducto {

    String [] nombreproducto=new String[100];
	
	int [] cantidadproducto=new int[100];
	
	double [] valorproducto=new double[100];
	
	int [] cantidadavender=new int[100];
	
	
	
	void setAgregarProducto(String nom, int cant, double val, int indiceprod){
		
		
		
		 nombreproducto[indiceprod] =nom;
		
		 cantidadproducto[indiceprod]=cant;
		
	     valorproducto[indiceprod] =val;
		
		
			 
	     cantidadavender[indiceprod]=0;
		 
		
		
	}
	
	void getProductos(int indice){
		System.out.println("Nombre     Cantidad     Valor");
		for(int i=0;i<indice;i++){
			
			System.out.println(nombreproducto[i]+"          "+cantidadproducto[i]+"          "+valorproducto[i]);
			
		}
		
	}
	
	
	short buscarPro(String pnom, int indice){
		short indicep=-1;
		boolean valorencontrado=false;
		for(short j=0;j<indice;j++){
			
			if(pnom.equals(nombreproducto[j])){
				
				System.out.println("Nombre: "+ nombreproducto[j]+ "  Cantidad: "+ cantidadproducto[j]+"  Valor: "+ valorproducto[j]);
				valorencontrado=true;
				indicep=j;
			}
				
				
				
			}
		if(valorencontrado==false){
			
			System.out.println("Ningún producto coincide con el valor ingresado");
		}
		
		return indicep;
	}
	
void setAgregarVenta(int cantventa, int indiceventa){
		
		

		 cantidadavender[indiceventa]=cantventa;
		
	}
	
	
	
}
