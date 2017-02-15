/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.cadena;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class MetodosCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner (System.in);
        
        int v;
        
               
        System.out.println("Creado de metodos. Inserte una opcion para probar.");
        System.out.println("1. Metodo de String");
        System.out.println("2. Metodo de Double");
        System.out.println("3. Metodo de Long ");
        System.out.println("4. Metodo de Char");
        
        v = kb.nextInt();
        
        switch(v)  {
        
        case 1:   
                 metodoStr("Inserta un dato String");
                 break;
        case 2:
              metodoDou("Inserta un dato Double");
              break;
        case 3:
              metodoLon("Inserta un dato Long");
              break;
        case 4:
        metodoCha("Inserta un dato Char");
        break;
        
        default: 
            System.out.println("No te entiendo, vuelve a intentarlo");
            
            System.exit(0);
            
        }
      }
    public static String metodoStr(String mensaje) {
   Scanner kb = new Scanner (System.in);
        String x;
        boolean flag = false;
        
        
        System.out.println("Inserta un dato tipo String");
        x = kb.nextLine();
       
   do {
       System.out.println("Correcto"); 
       
       try {
       flag = true;
       
       }
       
       catch (Exception ex) {
           
           System.out.println("No es un dato tipo String "+ ex );
           
           
                          }
   
   }

while (flag == false);
   
  return x;
   
   }
    
    public static Double metodoDou(String mensaje) {
    
    Scanner kb = new Scanner (System.in);
    double x;
    boolean flag = false;
    
        System.out.println("Introduce un dato tipo Double");
        x = kb.nextDouble();
        do {
            System.out.println("Correcto");
            
            try {
                flag = false;
            
            }
        catch (Exception ex) {
            
            System.out.println("No es un dato tipo Double." + ex);
            
                
            }
        }
            
            while  (flag ==false);
 
        return x;
    }
    
    public static long metodoLon(String mensaje) {
    Scanner kb = new Scanner (System.in);
    long x;
    boolean flag = false;
    
       do { System.out.println("Introduce un dato tipo Long");
    x = kb.nextLong();
    try {
    flag =true;
    
    }
    catch (Exception ex) {
        
        System.out.println("No es un dato tipo Long");
               
           }
       }
    while (flag == false);
        
       
    
    
  return x;
    
    }
    
    
    public static char  metodoCha (String mensaje) {
    Scanner kb = new Scanner (System.in);
    
    char x;
    boolean flag = true;
    
     do{    System.out.println("Introduce un dato tipo char.");
        x = kb.next().charAt(0);
         try {
             flag = false;
         }
         catch (Exception ex) {
             
             System.out.println("No es un dato tipo char");
             
         }
     }
         while (flag == true);
         
       
     
     return x;
       
        
        
        
    }
    
} 
    
    
    
    

