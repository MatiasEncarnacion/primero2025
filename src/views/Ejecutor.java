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
public class Ejecutor {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //para repaso transformar nota
        Repaso rp = new Repaso();
        System.out.println("Ejercicios de for:");
        System.out.println(" 1. Raiz entera");
        System.out.println(" 2. Reloj digital de 00:00:00 a 23:59:59");
        System.out.println(" 3. Numeros divisibles para 3 y 5 en un rango de 100");
        System.out.println(" 4. Factorial de numeros en un rango dado");
        System.out.println("Ejercicios de while:");
        System.out.println(" 5. Suma de numeros consecutiva hasta que sea mayor de 1000");
        System.out.println(" 6. Ingreso de numeros hasta ser un multiplo de 7");
        System.out.println(" 7. Calculadora hasta que se ingrese salir");
        System.out.println(" 8. Suma de multiplos de 4 menores a un n dado");
        System.out.println("Ejercicios de do while:");
        System.out.println(" 9. Leer notas hasta que se ingrese -1 y calcular promedio");
        System.out.println(" 10. Mostrar la tabla de potencia de 2 hasta que supere 1000");
        System.out.println(" 11. Sumar numeros aleatorios hasta alcanzar un total minimo");
        System.out.println(" 12. Leer edades y determinar la cantidad de mayores de edad");
        System.out.println("Ejercicios de switch:");
        System.out.println(" 13. Estacion del año según el numero del mes");
        System.out.println(" 14. Conversor de dinero");
        System.out.println(" 15. Calcular precio del boleto según edad");
        System.out.println(" 16. Control de semaforo según estado");
        System.out.println("Ejercicios para la practica 2:");
        System.out.println(" 17. Evaluación de desempeño de vendedores");
        System.out.println(" 18. Seguimiento de entregas de paqueteria");
        System.out.println(" 19. Generar y resolver n terminos de una serie");
        System.out.println(" 20. Optimización de riego en cultivo");
        System.out.println(" 21. Simulacion fila de banco");
        int option = sc.nextInt();
        do{
            switch (option){
            //conocer raiz de que numero es el numero insertado
            case 1:
               System.out.println("Ingrese el numero al que desea conocer su raiz: ");
               int num = sc.nextInt();
               int raiz = rp.raizEntera(num);
               System.out.println("La raiz de "+num+" es de: "+raiz);
                break;
            //Simular reloj que va de 00:00:00 a 23:59:59
            case 2:   
               System.out.println("Hora inicial de: 0 horas con 0 minutos y 0 segundos");
               int reloj = rp.relojDigital(1);
               System.out.println(reloj);
               break;
            //Numeros divisibles para 3 y 5 a la vez
            case 3:
                System.out.println("En un rango de 100 encontrar numeros divisibles para 3 y 5");
                int inicio35 = 1;
                rp.numerosDivisiblesPara3y5(inicio35);
                break;
            //factorial de numeros en un rango dado
            case 4:
                System.out.println("Numero inicial del rango: ");
                int numI = sc.nextInt();
                System.out.println("Numero final del rango: ");
                int numF = sc.nextInt();
                rp.factorialRango(numI, numF);
                break;
                //Ejercicios de while
                //suma de numeros consecutiva hasta dar un resultado mayor a 1000
            case 5:
                System.out.println("Ingrese el numero inicial: ");
                double nInicial = sc.nextDouble();
                rp.suma1000(nInicial);
                break;
            //Ingreso de numeros hasta leer un multiplo de 7
            case 6:
                System.out.println("Ingrese el valor hasta que sea multiplo de 7: ");
                int entero = sc.nextInt();
                rp.multiploDe7(entero);
                break;
            //calculadora hasta que se ingrese la palabra "salir"
            case 7:
                rp.calculadoraHastaSalir("entrar");
                break;
            //suma de multiplos de 4 menores a un numero leido
            case 8:
                System.out.println("Suma de multiplos de 4 menores al numero que usted ingrese: ");
                int menorA = sc.nextInt();
                int sumaM = rp.sumaMultiplosde4(menorA);
                System.out.println("la suma de los multiplos de 4 menores a "+menorA+" es de "+sumaM);
                break;
            //Leer notas hasta que se ingrese -1 y calcular promedio
            case 9:
                System.out.println("Ingrese notas y cuando termine de escribirlas ingrese -1");
                float notas = sc.nextFloat();
                if (notas <= -1){
                    System.out.println("No puede terminar la operacion antes de iniciarla");
                } else {
                rp.promedioNotas(notas);
                }
                break;
            //tabla de la potencia de 2 hasta que sea mayor que 1000
            case 10:
                System.out.println("Tabla de potencia de 2 hasta que se supere 1000");
                int Rfinal = rp.tablaPotencias2(1);
                System.out.println("El resultado final es de: "+Rfinal);
                break;
            //sumar numeros aleatorios hasta alcanzar un total minimo
            case 11:
                System.out.println("Ingrese el valor minimo de la suma: ");
                int minimo = sc.nextInt();
                rp.nAleatorioMinimoFinal(minimo);
                break;
            //Leer edades y determinar mayores de edad
            case 12:
                System.out.println("Sistema para determinar el numero de mayores de edad en un rango indefinido");
                System.out.println("Ingrese la edad de la persona, en caso de querer finalizar ingrese -1");
                int edad = sc.nextInt();
                rp.cantidadMayores(edad);
                break;
            //determinar estacion segun mes del año
            case 13:
                System.out.println("Ingrese el numero del mes para averiguar su estacion del año");
                int mes = sc.nextInt();
                rp.estacionAño(mes);
                break;
            //conversor de moneda
            case 14: 
                System.out.println("Ingrese el valor de dinero");
                float dinero = sc.nextFloat();
                rp.conversorMonedas(dinero);
                break;
            //calcular precio del boleto segun la edad (niño, adulto, mayor)
            case 15:
                System.out.println("Niños pagan 1$ ");
                System.out.println("Adolescentes y adultos pagan 1.50$ ");
                System.out.println("Adultos mayores pagan 0.80$");
                System.out.println("Ingrese la edad de la persona que pagará: ");
                int edadS = sc.nextInt();
                if (edadS > 0 && edadS <122){
                    float precio = rp.precioB(edadS);
                    System.out.println("El precio a pagar es de: "+precio+"$");
                } else {
                    System.out.println("Edad ingresada no valida");
                }
                break;
            // control de semaforo segun estado
            case 16:
                System.out.println("Controle el estado de un semaforo");
                String semaforo = "";
                String estadof = rp.semaforo(semaforo);
                System.out.println("El estado del semaforo al finalizar es en: "+estadof);
                break;
            //Evaluacion de desempeño de vendedores
            case 17:
                System.out.println("Ingrese el numero de vendedores que desea calcular su rendimiento");
                int vendedores = sc.nextInt();
                rp.vendedores(vendedores);
                break;
            //Seguimiento de entregas de paqueteria
            case 18:
                System.out.println("Ingrese la fecha de envio del paquete: ");
                System.out.println("Dia: ");
                int diaE = sc.nextInt();
                System.out.println("Mes: ");
                int mesE = sc.nextInt();
                System.out.printf("%02d/%02d \n", diaE, mesE);
                System.out.println("Ingrese la fecha en la que debió llegar el paquete: ");
                System.out.println("Dia: ");
                int diaL = sc.nextInt();
                System.out.println("Mes: ");
                int mesL = sc.nextInt();
                System.out.printf("%02d/%02d \n", diaL, mesL);
                rp.paqueteria(diaE, mesE, diaL, mesL);
                break;
            //reconocer, generar y resolver una serie con n terminos
            case 19:
                System.out.println("Ingrese el numero de terminos de la serie que desea generar:");
                int terminos = sc.nextInt();
                double tfinal = rp.serie(terminos);
                System.out.println("El resultado final es de: "+tfinal);
                break;
            // optimizacion de riego de cultivo cada 2 horas segun indice de humedad
            case 20:
                System.out.println("Riego de cultivos cada 2 horas en un dia");
                int riegoT = rp.riegoTotal("apagado");
                System.out.println("Las horas de riego total son de: "+riegoT+" horas al dia");
                break;
            //simulacion de fila en banco
            case 21:
                System.out.println("Simulacion de fila en 120 min");
                System.out.println("El servicio de cajero toma 2 min");
                System.out.println("El servicio de asesor toma 5 minutos");
                int clientesT = rp.clientesAtendidos("banco");
                System.out.println("El total de clientes atendidos en la jornada es de: "+clientesT);
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("Si desea salir presione 0, caso contrario cualquier numero");
        option = sc.nextInt();
        } while(option != 0);
    }
}
