
package numeros.pares.he.impares;

import java.util.Scanner;

public class NumerosParesHeImpares {

  
    public static void main(String[] args) {
        
        int num,i, cant,par,impar;
        int totalpar = 0;
        int totalimpar =0;
        int sumapar = 0;
        int sumaimpar =0;

        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Diguite la catidad de numeros:");
        cant =Teclado.nextInt();
        
        for( i=1; i<=cant; i++)
        {
            System.out.println("ingreso un numero");
            num= Teclado.nextInt();
            
            if(num %2 ==0)
            {
                System.out.println("su neumero es par");
                totalpar= totalpar+1;
                sumapar= sumapar+num;
                
            }
            else
            {
            System.out.println("Su numero es impar"); 
            totalimpar = totalimpar+1;
            sumaimpar =  num+sumaimpar;
            }
           
        }    
            System.out.println("El total de los numeros pares es:"+totalpar);
            System.out.println("El total de numeros impares es"+totalimpar);
            System.out.println("El total de la suma de los números pares es:"+sumapar);
            System.out.println("El total suma de los numeros imperes"+sumaimpar);
    }
    }



        