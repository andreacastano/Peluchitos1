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
import java.util.Scanner;

public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int contadorProductosDistintos=0;
		int condicionParaSalir=0;
		boolean casoUnoEjecutado=false;
		
		AgregarProducto bancoProductos=new AgregarProducto();
		
		
		while(condicionParaSalir==0){
			
			
		System.out.println("Digite el número de la opción deseada: ");
		System.out.println("1.Agregar producto");
		System.out.println("2.Buscar producto");
		System.out.println("3.Eliminar producto");
		System.out.println("4.Mostrar inventario");
		System.out.println("5.Realizar venta");
		System.out.println("6.Mostrar ganancias totales");
		System.out.println("7.Salir");
		
		Scanner lector=new Scanner(System.in);
		int opcionSeleccionada=lector.nextInt();
		
		switch(opcionSeleccionada){
		
		case 1:
			
			casoUnoEjecutado=true;
			System.out.println("Ingrese el nombre del producto: ");
			String nomprod=lector.next();
			System.out.println("Ingrese la cantidad de productos: ");
			int cantidadprod=lector.nextInt();
			System.out.println("Ingrese el valor del producto");
			double valprod=lector.nextDouble();
			
			bancoProductos.setAgregarProducto(nomprod, cantidadprod, valprod,contadorProductosDistintos);
			contadorProductosDistintos++;
			
			break;
			
		case 2:
			if(casoUnoEjecutado!=false){
				System.out.println("Ingrese el nombre del producto a buscar: ");
				String nombre=lector.next();
				
				bancoProductos.buscarPro(nombre, contadorProductosDistintos);
				
				System.out.println("Ingrese cero para continuar: ");
				String continuar=lector.next();
			}else{
				
				System.out.println("No hay productos registrados");
				System.out.println("Ingrese cero para continuar: ");
				String continuar=lector.next();
			}
			 
			
			break;
			
		case 3:
			
			if(casoUnoEjecutado!=false){
				System.out.println("Ingrese el nombre del producto a eliminar: ");
				String proeliminar=lector.next();
				short indiceeliminar=bancoProductos.buscarPro(proeliminar, contadorProductosDistintos);
				
				if(indiceeliminar>=0){
				bancoProductos.setAgregarProducto("---", 0, 0, indiceeliminar);
				System.out.println("El registro fue eliminado ");
				System.out.println("Ingrese cero para continuar: ");
				String continuar=lector.next();
				}else{
					
			
					System.out.println("Ingrese cero para continuar: ");
					String continuar=lector.next();
					
				}
				
				
			}else{
				
				System.out.println("No hay productos registrados.");
				System.out.println("Ingrese cero para continuar: ");
				String continuar=lector.next();
			}
			break;
			
		case 4: 
			
			
			if(casoUnoEjecutado!=false){
				
				bancoProductos.getProductos(contadorProductosDistintos);
				System.out.println("Ingrese cero para continuar");
				String teclacontinuar=lector.next();
			}else{
				
				System.out.println("No existen productos registrados.");
				
				System.out.println("Ingrese cero para continuar");
				String teclacontinuar=lector.next();
			}
			
			break;
		
		case 5:
			if(casoUnoEjecutado!=false){
				
				System.out.println("Ingrese el nombre del producto a vender: ");
				String provender=lector.next();
				short indicevender=bancoProductos.buscarPro(provender, contadorProductosDistintos);
				if(indicevender>=0){
					System.out.println("Ingrese la cantidad del producto a vender: ");
					int cantidadAVender=lector.nextInt();
					
					bancoProductos.setAgregarVenta(cantidadAVender,indicevender);
					System.out.println("La cantidad vendida fue registrada con éxito.");
					
					System.out.println("Ingrese cero para continuar");
					String teclacontinuar=lector.next();
				}else{
				
					
					System.out.println("Ingrese cero para continuar");
					String teclacontinuar=lector.next();
					
				}
			}else{
				System.out.println("No existen productos registrados.");
				System.out.println("Ingrese cero para continuar");
				String teclacontinuar=lector.next();
			}
			
			break;
			
		case 6:
			double total=0;
			System.out.println("Producto   Cantidad Ventas    Valor Venta");
			for(int z=0;z<contadorProductosDistintos;z++){
				
				double valtotalp=(bancoProductos.valorproducto[z]*bancoProductos.cantidadavender[z]);
				
				total=total+valtotalp;
			System.out.print(bancoProductos.nombreproducto[z]+"                ");
			System.out.print(bancoProductos.cantidadavender[z]+"                ");
			System.out.println(valtotalp);
			}
			
			System.out.println("Las ventas totales suman:  "+total);
			System.out.println("Ingrese cero para continuar");
			String teclacontinuar=lector.next();
			break;
			
		case 7:
			
			condicionParaSalir=1;
			
			break;
			
		default:
			
			System.out.println("Valor incorrecto, intente de nuevo");
			System.out.println("Ingrese cero para continuar");
			String continuarfin=lector.next();
			break;
			
			
		}
		
	}
	}

}
