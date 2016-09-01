/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventariopeluchitos;

import java.util.Scanner;

/**
 *
 * @author YolimaAndrea
 */
public class Menu {
    
    public static void main(String[] args) {
        
        
        System.out.println("Digite el número de la opción deseada");
        System.out.println("1 Agregar producto");
        System.out.println("2 Buscar producto");
        System.out.println("3 Eliminar producto");
        System.out.println("4 Mostrar inventario");
        System.out.println("5 Realizar venta");
        System.out.println("6 Mostrar ganancias totales");
        System.out.println("7 Salir");
        
       Scanner lector = new Scanner(System.in);
        int valopcion=lector.nextInt();
        
        if(valopcion==1){
           
            System.out.println("Ingrese el nombre: ");
            String nom=lector.next();
            System.out.println("Ingrese la cantidad: ");
            int cant=lector.nextInt();
            System.out.println("Ingrese el valor: ");
            double val=lector.nextDouble();
            
           AgregarProducto agregar=new AgregarProducto(nom,cant,val);
            
           
        }
    }
}
