/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controler.repaso.Repaso;
import java.util.Scanner;

/**
 *
 * @author nicof
 */
public class Preguntas_ensayo {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Repaso rp = new Repaso();
        System.out.println("1. Ejemplo estructura mientras");
        System.out.println("2. Ejemplo estructura hacer mientras");
        System.out.println("3. funciones con paso de parametros por valor");
        System.out.println("4. funciones con paso de parametros por referencia");
        System.out.println("5. Correccion de bloque de codigo");
        int option = sc.nextInt();
        do{
            switch (option){
                case 1:
                    System.out.println("Ingrese la cantidad que vaya a usar para la secuencia de numeros de 1 hasta 10");
                    int salto = sc.nextInt();
                    int bucles = rp.numero1a10(salto);
                    System.out.println("La cantidad de bucles realizados es de: "+bucles);
                    break;
                case 2:
                    System.out.println("Ingrese el numero");
                    int num = sc.nextInt();
                    int verificador = rp.tablaMultPar(num);
                    if (verificador == 0) {
                        boolean bandera = true;
                        System.out.println("Valor de bandera: "+bandera);
                    } else {
                        boolean bandera = false;
                        System.out.println("Valor de bandera: "+bandera);
                    }
                    break;
                case 3:                    
                    //parametro por valor una funcion solicita los servicios de otra
                    System.out.println("Ingrese los numeros a los que desea conocer sus divisores comun en un rango de 1 a 100");
                    int inicio1 = sc.nextInt();
                    int inicio2 = sc.nextInt();
                    rp.numerosDivisiblesPara2num(inicio1, inicio2);
                    break;
                case 4:
                    //parametro por referencia: los cambios realizados dentro de la funcion le afectarán tambien afuera
                    System.out.println("Ingrese un numero");
                    int parametro = sc.nextInt();
                    parametro = rp.randomizerParametro(parametro);
                    System.out.println("El valor de su numero ha sido cambiado a: "+parametro);
                    break;
                case 5:
                    System.out.println("Correcion del codigo");
                    System.out.println("Ingrese el numero del dia de la semana:");
                    int dia = sc.nextInt();
                    if(dia > 0 && dia <= 7){
                        String mensaje = rp.correccion(dia);
                        System.out.println(mensaje);
                    } else{
                        System.out.println("Dia no valido");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Si desea salir presione 0");
            option = sc.nextInt();
        } while (option !=0);
    }
}
