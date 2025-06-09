/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.util.Scanner;

/**
 *
 * @author nicof
 */
public class Utilidades {
    private static Scanner sc = new Scanner(System.in);
    public int factorial(int numero){
        int resp =1;
         for(int i= 1 ; i<=numero ; i++){
           resp = resp*i;    
          }
         return resp;
    }
    public int fibonacci(int posicion){
        int a = 1;
        int b = 0;
        int fibo = 0;
        for (int i = 0; i <posicion; i++){
            fibo = a+b;
            a = b;
            b=fibo;
        }
        return fibo;
    }
    public String serie(int num){
        String resp="";
        Utilidades u = new Utilidades();
        int suma = 0;
        for(int i = 1; i <=num; i++){
            int par = i*2;
            int fact = u.factorial(par);
            int fibo = u.fibonacci(i);
            int signo = 1;
            char s = '-';
            if(i % 2 == 0){
                signo *= -1;
                s = '+';
            }
            suma += ((Math.pow(fact, fibo))*signo);
            resp +="("+par+"!)^"+fibo+" "+s;
        }
        resp = resp.substring(0, resp.length() -1);
        resp += "\n"+"La respuesta es: "+suma;
        return resp;
    }
    public boolean verifyPrimo(int num){
        int cont = 0;
        for(int i = 2; i<num ; i++){
            if(num % i == 0){
                cont++;
                break;
            }
        }
        return cont == 0;
    }
    //ejercicio 12 while validar contraseña en 3 intentos
    public String contraseña3Intentos(String inicio){
        String contraseña = "programacion";
        String validacion = "";
        boolean salida = false;
        int contador = 0;
        int contadorT = 0;
        if (validacion == contraseña){
            salida = true;
        } else {
        while(salida = false){
            System.out.println("Valide la contraseña ingresandola de nuevo: ");
            validacion = sc.next();
            contadorT = contador + 1;
            if(contadorT !=3){
                 System.out.println("Valor del contador: "+contadorT);
                 if(validacion == contraseña){
                     System.out.println("Contraseña validada correctamente");
                     salida = true;
                 } else{
                     System.out.println("Intente de nuevo porfavor");
                 }
                 } else {
                System.out.println("No se ha podido validar la contraseña");
                salida = true;
               }
        
                
            }
        }
         System.out.println("Numero de intentos: "+contador);
        return contraseña;
           }
}