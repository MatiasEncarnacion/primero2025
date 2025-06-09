/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler.repaso;

import controler.Utilidades;
import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Clase que contiene metodos de repaso para la clase de teoria de la
 * programacion
 *
 * @author nicof
 */
public class Repaso {

    private static Scanner sc = new Scanner(System.in);
    Utilidades u = new Utilidades();

    //ejercicio 14 for
    /**
     * Metodo que permite conocer la raiz de un número
     *
     * @param num Numero al cual se le sacará la raiz
     * @return Raiz del numero insertado
     */
    public int raizEntera(int num) {
        int raiz = 0;
        int div = 1;
        for (int i = 1; i <= num; i++) {
            raiz = num / i;
            div = i;
            if (raiz == div) {
                break;
            }
        }

        return raiz;
    }

    // ejercicio 13 de los for
    /**
     * Metodo que permite crear un reloj digital que va de 00:00:00 a 23:59:59
     *
     * @param orden Funcion que permite dar inicio sin insertar algún dato
     * @return Reloj digital
     */
    public int relojDigital(int orden) {
        for (int horas = 0; horas <= 23; horas++) {
            for (int minutos = 0; minutos <= 59; minutos++) {
                for (int segundos = 0; segundos <= 59; segundos++) {
                    System.out.printf("%02d:%02d:%02d:\n", horas, minutos, segundos);
                }
            }
        }
        return 0;
    }

    //ejercicio 9 for Calcular el factorial de varios números en un rango dado.
    /**
     * Metodo que permite sacar el factorial de los numeros de un rango
     * @param numI Funcion del numero inicial del rango
     * @param numF Funcion del numero final del rango
     * @return Valores de los factoriales
     */
    public int factorialRango(int numI, int numF) {
        int factorial = 1;
        for (numI = numI + 1 - 1; numI <= numF; numI++) {
            factorial = u.factorial(numI);
            System.out.println(numI + "! = " + factorial);
        }
        return factorial;
    }

    //ejercicio 8 for Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5.
    /**
     * Metodo que permite sacar los numeros divisibles tanto para 3 y 5
     * @param inicio Funcion que permite iniciar sin la necesidad de datos de entrada
     */
    public void numerosDivisiblesPara3y5(int inicio) {
        int resultado3 = 1;
        int resultado5 = 1;
        int definicion = 0;
        for (int i = 1; i <= 100; i++) {
            resultado3 = i % 3;
            resultado5 = i % 5;
            definicion = resultado3 + resultado5;
            if (definicion != 0) {
            
            } else {
                System.out.println(i + " Es un numero divisible para 3 y 5");
            }
        }
    }

    //ejercicio 1 while Ingresar numeros hasta que la suma supere 1000
    /**
     * Metodo que suma numeros aleatorios en un rango de 1 a 100 hasta que sea mayor a 1000
     * @param numero Funcion del numero inicial de la suma
     * @return Suma total mayor a 1000
     */
    public float suma1000(double numero) {
        while (numero < 1000) {
            numero = numero + random() * 100;
            System.out.println(numero);
        }
        System.out.println("La suma da un valor de: " + (int) numero + " Y su valor exacto es de: " + numero);
        return (float) numero;
    }

    // ejercicio 4 while leer enteros insertados por el usuario hasta que se inserte un multiplo de 7
    /**
     * Metodo que escanea enteros insertados por el usuario hasta que se inserte un multiplo de 7 y termina la operacion
     * @param entero Funcion del numero entero insertado por el usuario
     * @return Mensaje de confirmacion de que si es multiplo de 7
     */
    public int multiploDe7(int entero) {
        while (entero % 7 != 0) {
            System.out.println("Ingrese el valor hasta que sea multiplo de 7: ");
            entero = sc.nextInt();
        }
        System.out.println("El numero ingresado es multiplo de 7");
        return entero;
    }
    //ejercicio 14 while calculadora hasta que se ingrese salir
    /**
     * Metodo que genera una calculadora que repite comandos de suma, resta, multiplicacion y division hasta que se ingrese salir
     * @param comando Funcion string que se lee para definir que funcion entre suma, resta, multiplicacion, division se van a usar
     */
    public void calculadoraHastaSalir(String comando) {
        String orden = "entrar";
        while (orden != "salir") {
            System.out.println("Ingrese la operacion matematica que desea realizar: ");
            System.out.println("suma");
            System.out.println("resta");
            System.out.println("multiplicacion");
            System.out.println("division");
            orden = sc.next();
            switch (orden) {
                case "suma":
                    System.out.println("Ingrese los valores de la suma: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La respuesta de la suma es de: " + suma);
                    break;
                case "resta":
                    System.out.println("Ingrese los valores de la resta: ");
                    int Rnum1 = sc.nextInt();
                    int Rnum2 = sc.nextInt();
                    int resta = Rnum1 - Rnum2;
                    System.out.println("La respuesta de la resta es de: " + resta);
                    break;
                case "multiplicacion":
                    System.out.println("Ingrese los valores de la multiplicacion: ");
                    int Mnum1 = sc.nextInt();
                    int Mnum2 = sc.nextInt();
                    int mult = Mnum1 * Mnum2;
                    System.out.println("La respuesta de la multiplicacion es de: " + mult);
                    break;
                case "division":
                    System.out.println("Ingrese los valores de la division: ");
                    float Dnum1 = sc.nextInt();
                    float Dnum2 = sc.nextInt();
                    float Div = Dnum1 / Dnum2;
                    System.out.println("La respuesta de la division es de: " + Div);
                    break;
                case "salir":
                    orden = "salir";
                default:
            }
        }
        System.out.println("Gracias por usar la calculadora lo esperamos de nuevo");
    }

    //ejercicio while 17 sumar todos los multiplos de 4 menores a un numero dado
    /**
     * Metodo que calcula los multiplos de 4 menores a un numero insertado por el usuario
     * @param menorA Funcion que define el numero limite de la suma de los multiplos de 4
     * @return Suma de los multiplos de 4
     */
    public int sumaMultiplosde4(int menorA) {
        int sumaM = 0;
        int suma = 0;
        int contador = 0;
        int comprobacion = 0;
        while (contador < menorA - 1) {
            contador = contador + 1;
            comprobacion = contador % 4;
            if (comprobacion != 0) {
                System.out.println("El numero " + contador + " No es multiplo de 4");
            } else {
                suma = suma + 4;
                sumaM = sumaM + suma;
                System.out.println("El numero " + contador + " es multiplo de 4 por ende se suma");
            }
        }
        return sumaM;
    }
    //ejercicio 5 do while leer notas hasta que se ingrese -1 y calcular promedio
    /**
     * Metodo que calcula notas y las promedia hasta que se ingrese -1
     * @param notas Funcion que insertan notas para luego ser promediadas
     * @return Promedio de las notas insertadas
     */
    public float promedioNotas(float notas) {
        int contador = 0;
        float promedio = 0.0f;
        float valorS = 0.0f;
        do {
            notas = notas + valorS;
            contador = contador + 1;
            System.out.println("Valor actual del contador: " + contador);
            System.out.println("Ingrese notas y cuando termine de escribirlas ingrese -1");
            valorS = sc.nextFloat();
        } while (valorS != -1);
        promedio = notas / contador;
        System.out.println("El promedio de las notas ingresadas es de: " + promedio);
        return notas;
    }

    //ejercicio 10 de do while mostrar la tabla de potencia de 2 hasta que sea mayor de 1000
    /**
     * Metodo que muestra la tabla de las potencias de 2 hasta sus resultados que superen el numero 1000
     * @param contador Funcion que cuenta la cantidad de digitos en la tabla de potencias
     * @return Resultado final de la tabla de las potencias de 2
     */
    public int tablaPotencias2(int contador) {
        int tabla = 1;
        int resultado = 0;
        int b = 2;
        do {
            resultado = (int) Math.pow(tabla, 2);
            System.out.println(tabla + "^" + b + " = " + resultado);
            contador = contador + 1;
            tabla = tabla + 1;
        } while (resultado <= 1000);
        return resultado;
    }

    //ejercicio 14 do while sumar numeros aleatorios hasta dar un total minimo
    /**
     * Metodo que realiza suma de numeros aleatorios hasta alcanzar un total minimo establecido por el usuario
     * @param minimo Funcion que define el limite de las sumas aleatorias
     */
    public void nAleatorioMinimoFinal(int minimo) {
        float suma = 0.0f;
        do {
            suma = (float) (suma + random() * 10);
            System.out.println(suma);
        } while (suma <= minimo);
        System.out.println("El valor final de la suma es de: " + suma);
    }

    //ejercicio 11 do while leer edades y determinar la cantidad de mayores de edad
    /**
     * Metodo que lee edad de personas y cuenta el numero de personas mayorees de edad separandolas de los menores de edad
     * @param personas Funcion que define la edad de la persona
     * @return El numero total de personas mayores de edad
     */
    public int cantidadMayores(int personas) {
        int edad = personas;
        int personasM = 0;
        int personasMen = 0;
        do {
            if (edad >= 18) {
                personasM = personasM + 1;
                System.out.println("Valor actual de personas mayores: " + personasM);
            } else {
                personasMen = personasMen + 1;
                System.out.println("Valor actual de personas menores: " + personasMen);
            }
            System.out.println("Ingrese la edad de la persona, en caso de querer finalizar ingrese -1");
            edad = sc.nextInt();
        } while (edad != -1);
        System.out.println("El numero de personas mayores es de: " + personasM);
        return edad;
    }

    //ejercicio 6 switch determinar la estacion del año segun el numero del mes
    /**
     * Metodo que permite conocer la estacion del año segun el numero de mes insertado por el usuario
     * @param mes Funcion que define el mes del año
     */
    public void estacionAño(int mes) {
        switch (mes) {
            case 1:
                System.out.println("En Enero la estacion del año es Verano");
                break;
            case 2:
                System.out.println("En Febrero la estacion del año es Verano");
                break;
            case 3:
                System.out.println("En Marzo la estacion del año es Otoño");
                break;
            case 4:
                System.out.println("En Abril la estacion del año es Otoño");
                break;
            case 5:
                System.out.println("En Mayo la estacion del año es Otoño");
                break;
            case 6:
                System.out.println("En Junio la estacion del año es Invierno");
                break;
            case 7:
                System.out.println("En Julio la estacion del año es Invierno");
                break;
            case 8:
                System.out.println("En Agosto la estacion del año es Invierno");
                break;
            case 9:
                System.out.println("En Septiembre la estacion del año es Primavera");
                break;
            case 10:
                System.out.println("En Octubre la estacion del año es Primavera");
                break;
            case 11:
                System.out.println("En Noviembre la estacion del año es Primavera");
                break;
            case 12:
                System.out.println("En Diciembre la estacion del año es Verano");
                break;
            default:
                System.out.println("El numero de mes insertado no es valido");
        }
    }

    //ejercicio 5 switch conversor de monedas (USD, EUR, MXN, COL, ARG)
    /**
     * Metodo que permite la conversion de moneda entre los valores de: dolares, euros, pesos mexicanos, pesos colombianos y pesos argentinos
     * @param dinero Funcion que define el valor del dinero a convertir
     * @return Dinero convertido al tipo de moneda elegida por el usuario
     */
    public float conversorMonedas(float dinero) {
        System.out.println("Ingrese en que currencia se encuentra el dinero");
        System.out.println("USD");
        System.out.println("EUR");
        System.out.println("MXN");
        System.out.println("COL");
        System.out.println("ARG");
        String currencia = sc.next();
        switch (currencia) {
            case "USD":
                System.out.println("A que moneda desea convertir los dolares?");
                System.out.println("EUR");
                System.out.println("MXN");
                System.out.println("COL");
                System.out.println("ARG");
                String USD = sc.next();
                switch (USD) {
                    case "EUR":
                        dinero = dinero * 0.88f;
                        System.out.println("El valor es de " + dinero + " Euros");
                        break;
                    case "MXN":
                        dinero = dinero * 19.43f;
                        System.out.println("El valor es de " + dinero + " Pesos mexicanos");
                        break;
                    case "COL":
                        dinero = dinero * 4155.0f;
                        System.out.println("El valor es de " + dinero + " Pesos colombianos");
                        break;
                    case "ARG":
                        dinero = dinero * 1183.65f;
                        System.out.println("El valor es de " + dinero + " Pesos argentinos");
                        break;
                    default:
                        System.out.println("Currencia a convertir desconocida");
                }
                break;
            case "EUR":
                System.out.println("A que moneda desea convertir los euros?");
                System.out.println("USD");
                System.out.println("MXN");
                System.out.println("COL");
                System.out.println("ARG");
                String EUR = sc.next();
                switch (EUR) {
                    case "USD":
                        dinero = dinero * 1.13f;
                        System.out.println("El valor es de " + dinero + " Dolares");
                        break;
                    case "MXN":
                        dinero = dinero * 22.03f;
                        System.out.println("El valor es de " + dinero + " Pesos mexicanos");
                        break;
                    case "COL":
                        dinero = dinero * 4669.40f;
                        System.out.println("El valor es de " + dinero + " Pesos colombianos");
                        break;
                    case "ARG":
                        dinero = dinero * 1343.35f;
                        System.out.println("El valor es de " + dinero + " Pesos argentinos");
                        break;
                    default:
                        System.out.println("Currencia a convertir desconocida");
                }
                break;
            case "MXN":
                System.out.println("A que moneda desea convertir los pesos mexicanos?");
                System.out.println("USD");
                System.out.println("EUR");
                System.out.println("COL");
                System.out.println("ARG");
                String MXN = sc.next();
                switch (MXN) {
                    case "USD":
                        dinero = dinero * 0.051f;
                        System.out.println("El valor es de " + dinero + " Dolares");
                        break;
                    case "EUR":
                        dinero = dinero * 0.045f;
                        System.out.println("El valor es de " + dinero + " Euros");
                        break;
                    case "COL":
                        dinero = dinero * 213.74f;
                        System.out.println("El valor es de " + dinero + " pesos colombianos");
                        break;
                    case "ARG":
                        dinero = dinero * 61.52f;
                        System.out.println("El valor es de " + dinero + " pesos argentinos");
                        break;
                    default:
                        System.out.println("Currencia a convertir desconocida");
                }
                break;
            case "COL":
                System.out.println("A que moneda desea convertir los pesos colombianos?");
                System.out.println("USD");
                System.out.println("EUR");
                System.out.println("MXN");
                System.out.println("ARG");
                String COL = sc.next();
                switch (COL) {
                    case "USD":
                        dinero = dinero * 0.00024f;
                        System.out.println("El valor es de " + dinero + " Dolares");
                        break;
                    case "EUR":
                        dinero = dinero * 0.00021f;
                        System.out.println("El valor es de " + dinero + " Euros");
                        break;
                    case "MXN":
                        dinero = dinero * 0.0047f;
                        System.out.println("El valor es de " + dinero + " Pesos mexicanos");
                        break;
                    case "ARG":
                        dinero = dinero * 0.29f;
                        System.out.println("El valor es de " + dinero + " Pesos argentinos");
                        break;
                    default:
                        System.out.println("Currencia a convertir desconocida");
                }
                break;
            case "ARG":
                System.out.println("A que moneda desea convertir los pesos argentinos?");
                System.out.println("USD");
                System.out.println("EUR");
                System.out.println("MXN");
                System.out.println("COL");
                String ARG = sc.next();
                switch (ARG) {
                    case "USD":
                        dinero = dinero * 0.00084f;
                        System.out.println("El valor es de " + dinero + " Dolares");
                        break;
                    case "EUR":
                        dinero = dinero * 0.00074f;
                        System.out.println("El valor es de " + dinero + " Euros");
                        break;
                    case "MXN":
                        dinero = dinero * 0.016f;
                        System.out.println("El valor es de " + dinero + " Pesos mexicanos");
                        break;
                    case "COL":
                        dinero = dinero * 3.48f;
                        System.out.println("El valor es de " + dinero + " Pesos colombianos");
                        break;
                    default:
                        System.out.println("Currencia a convertir desconocida");
                }
                break;
            default:
                System.out.println("Currencia de moneda no reconocida");
        }
        return dinero;
    }

    // ejercicio 17 switch calcular precio de boletos según edad (niño, adulto, mayor).
    /**
     * Metodo que permite conocer el precio a pagar según la edad de la persona leida
     * @param edadS Funcion que define la edad de la persona
     * @return Valor de dinero a pagar acorde a los valores definidos del precio según la edad
     */
    public float precioB(int edadS) {
        float precio = 1.0f;
        if (edadS < 60) {
            switch (edadS) {
                case 1:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 2:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 3:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 4:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 5:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 6:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 7:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 8:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 9:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 10:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 11:
                    System.out.println("Niño paga 1$");
                    precio = 1.0f;
                    break;
                case 12:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                case 13:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                case 14:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                case 15:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                case 16:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                case 17:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                case 18:
                    System.out.println("Adolescente paga 1.50$");
                    precio = 1.5f;
                    break;
                default:
                    System.out.println("Adulto paga 1.50$");
                    precio = 1.5f;
            }

        } else {
            System.out.println("Adulto mayor paga 0.80$");
            precio = 0.80f;
        }

        return precio;
    }
    //Ejercicio 20 switch Simular un semaforo
    /**
     * Metodo que permite simular el transito mediante un semaforo hasta que se ingrese "salir"
     * @param semaforo Funcion que define el estado del semaforo y si se sigue realizando cambios o no(verde,rojo,amarillo y salir)
     * @return Estado final del semaforo al salir de la simulacion
     */
    public String semaforo(String semaforo) {
        String estadof = "";
        int boleano = 1;
        do {
            System.out.println("Ingrese el estado al que desea cambiar el semaforo");
            System.out.println("rojo");
            System.out.println("amarillo");
            System.out.println("verde");
            System.out.println("Escriba salir una vez finalice");
            semaforo = sc.next();
            switch (semaforo) {
                case "rojo":
                    System.out.println("El transito se detendra y la luz será roja");
                    estadof = "rojo";
                    break;
                case "amarillo":
                    System.out.println("El transito se ralentizara con cuidado y la luz será amarilla");
                    estadof = "amarillo";
                    break;
                case "verde":
                    System.out.println("El transito avanzará y la luz será verde");
                    estadof = "verde";
                    break;
                case "salir":
                    System.out.println("Proceso finalizado");
                    boleano = boleano + 1;
                    break;
                default:
                    System.out.println("Estado no reconocido");
            }

        } while (boleano == 1);
        return estadof;
    }

    /*ejercicio 4 de la practica 2 Un formulario recoge ventas diarias de 30 vendedores durante un mes (30 días).
    Se generara las ventas de forma aleatoria de $1 hasta $1000: si un vendedor supera la meta diaria ($500),
    contar como “día excelente”; si un vendedor supera la meta diaria ($900), contar como “día millonario”; 
    si está por debajo de $100, marcar “bajo rendimiento”. Generar informe por vendedor.
     */
    /**
     * Metodo que genera valores de ventas aleatorias y las clasifica en bajo rendimiento, dia excelente y dia millonario si se encuentran en un rango especifico de valores
     * @param vendedores Funcion que define el numero de vendedores que se simularan por 30 dias (en el caso del ejercicio planteado 30 vendedores)
     */
    public void vendedores(int vendedores) {
        double ventas = 1.0;
        double informe = 1.0;
        for (int i = 1; i <= vendedores; i++) {
            for (int j = 1; j <= 30; j++) {
                ventas = random() * 1000;
                informe = informe + ventas;
                if (ventas < 100) {
                    System.out.println("El dia " + j + " tuvo un bajo rendimiento con " + (String.format("%.2f", ventas)) + "$");
                } else if (ventas >= 100 && ventas < 500) {
                    System.out.println("El dia " + j + " generó " + (String.format("%.2f", ventas)) + "$");
                } else if (ventas >= 500 && ventas < 900) {
                    System.out.println("El dia " + j + " tuvo un dia excelente con " + (String.format("%.2f", ventas)) + "$");
                } else if (ventas >= 900) {
                    System.out.println("El dia " + j + " tuvo un dia millonario con " + (String.format("%.2f", ventas)) + "$");
                }

            }
            System.out.println("");
            System.out.println("El total generado por el vendedor " + i + " en un lapso de 30 dias fue de " + (String.format("%.2f", informe)) + "$");
            System.out.println("");
            informe = 0;
        }
    }

    //ejercicio 8 de la practica 2 
    /* Se debe proporcionar la fecha de envio del paquete y la fecha en el cual debio llegar. 
    Para cada envío: si estado es “retrasado” y días > 5, marcar “alta prioridad”; si “entregado” 
    en menos de 2 días, felicitar al mensajero. Contar totales. 
     */
    /**
     * Metodo que simula una fecha de entrega aleatoria y la compara con la fecha que deberia haber sido entregado el
     * paquete, las compara y define si el paquete esta atrasado con alta prioridad o no y en caso de haber sido una entrega
     * antes de tiempo felicita al mensajero e indica el numero de dias de atraso o adelantamiento en ambos casos
     * @param diaE Funcion que define el dia que se inicio la entrega del paquete
     * @param mesE Funcion que define el mes que se inicio la entrega del paquete
     * @param diaL Funcion que define el dia en el que se debia haber entregado el paquete
     * @param mesL Funcion que define el mes en el que se debia haber entregado el paquete
     */
    public void paqueteria(int diaE, int mesE, int diaL, int mesL) {
        double estado = random() * 31;
        int estadoE = (int) estado;
        System.out.println("Fecha de entrega: ");
        System.out.printf("%02d/%02d \n", estadoE, mesL);
        if (estadoE > diaL) {
            estadoE = estadoE - diaL;
            if (estadoE > 5) {
                System.out.println("La entrega tiene una alta prioridad con un retraso de: " + estadoE + " dias");
            } else if (estadoE <= 2) {
                System.out.println("Entrega realizada en menos de 2 dias felicidades al mensajero");
            } else {
                System.out.println("La entrega esta atrasada por " + estadoE + " dias");
            }
        } else {
            diaL = diaL - estadoE;
            System.out.println("La entrega se realizo tempranamente en " + diaL + " dias antes de la fecha acordada felicidades al mensajero");
        }

    }

    //ejercicio 11 de la practica 2  Reconozca, genere mediante teclado, y resuelva la siguiente serie
    /*
    (1 / 1)^2 + (1 / 3)^4 - (2 / 5)^6 - (3 / 7)^8 + (5 / 9)^10 + (8 / 11)^12 ….
     */
    /**
     * Metodo que resuelve y grafica la serie de (1 / 1)^2 + (1 / 3)^4 - (2 / 5)^6 - (3 / 7)^8 + (5 / 9)^10 + (8 / 11)^12 ….
     * segun la cantidad n de terminos que desea conocer el usuario
     * @param terminos Funcion que define la cantidad de terminos a conocer de la serie
     * @return 
     */
    public double serie(int terminos) {
        String resp = "";
        double operacion = 0;
        int sumaD = 0;
        int termino = 0;
        for (int i = 1; i <= terminos; i++) {
            sumaD = termino * 2 + 1;
            termino++;
            int par = i * 2;
            int fibo = u.fibonacci(i);
            int signo = 1;
            String signoS = ((i - 1) / 2) % 2 == 0 ? "+" : "-";
            if (signoS == "-") {
                signo = -1;
            }
            double div = (double) fibo / (double) sumaD;
            operacion += (Math.pow(div, par)) * signo;
            resp += signoS + "(" + fibo + "/" + sumaD + ")^" + par + " ";
            System.out.println(resp);
            System.out.println("= " + operacion);
        }
        return operacion;
    }

    // ejercicio 13 de la practica 2
    /*
    Datos de humedad del suelo en varias parcelas leídos cada hora. Recorre x cada 2 horas al dia 
    (valores aleatorios de humedad): si humedad < 30%, encender riego (sumar tiempo de riego);
    si entre 30% y 60%, mantener; si > 60%, apagar. Calcular tiempo total de riego diario.
     */
    /**
     * Metodo que simula cantidades de humedad aleatorias y define si se enciende la regadera o se la apaga y en caso
     * de que den valores donde se tenga que mantenerla prendida o apagada, muestre un mensaje que indique que se la mantiene
     * prendida/apagada y devuelve las horas totales de riego en un dia
     * @param estado Funcion que define el estado de la regadera (encendida, apagada, mantener)
     * @return El valor total de las horas en las que se tuvo la regadera encendida
     */
    public int riegoTotal(String estado) {
        int riegoT = 0;
        estado = "apagado";
        int humedad = 1;
        for (int i = 2; i <= 24; i += 2) {
            if (estado == "encendido") {
                humedad = (int) (random() * 100);
                System.out.println("Humedad del: " + humedad + "%");
                if (humedad < 30) {
                    estado = "encendido";
                    System.out.println("Mantener encendido");
                    riegoT = riegoT + 2;
                } else if (humedad >= 30 && humedad <= 60) {
                    estado = "encendido";
                    System.out.println("Mantener encendido");
                    riegoT = riegoT + 2;
                } else {
                    estado = "apagado";
                    System.out.println("Riego apagado");
                }
            } else {
                humedad = (int) (random() * 100);
                System.out.println("Humedad del: " + humedad + "%");
                if (humedad < 30) {
                    estado = "encendido";
                    System.out.println("Riego encendido");
                    riegoT = riegoT + 2;
                } else if (humedad >= 30 && humedad <= 60) {
                    estado = "apagado";
                    System.out.println("Mantener apagado");
                } else {
                    estado = "apagado";
                    System.out.println("Riego se mantiene apagado");
                }
            }
        }
        return riegoT;
    }

    //ejercicio 12 de la practica 2 
    /*
    Una cola de clientes llega cada minuto con un servicio requerido (“cajero”, “asesor”). Simula 120 minutos:
    en cada iteración, si servicio “cajero”, atención toma 2 minutos; si “asesor”, 5 minutos. Con bucle anidado,
    procesa atención y cuenta clientes atendidos por tipo.
     */
    /**
     * Metodo que simula aleatoriamente funciones de un banco (cajero,asesor) por clienten donde toman 2 y 5 minutos
     * respectivamente en un tiempo de 120 minutos y registra la cantidad de clientes atendidos por servicio
     * @param estado Funcion que permite iniciar la simulacion sin la necesidad de un dato de entrada
     * @return Numero total de clientes atendidos
     */
    public int clientesAtendidos(String estado) {
        int minutos = 0;
        int clientesC = 0;
        int clientesA = 0;
        int clientesT = 0;
        int B = 0;
        int i = 1;
        do {
            B = (int) (random() * 10);
            if (B < 5) {
                minutos = minutos + 2;
                clientesC = clientesC + 1;
                System.out.println("El cliente " + i + " recibe servicio de cajero");
                i = i + 1;
            } else {
                minutos = minutos + 5;
                clientesA = clientesA + 1;
                System.out.println("El cliente " + i + " recibe servicio de asesor");
                i = i + 1;
            }
            System.out.println("minuto: " + minutos);
        } while (minutos < 120);
        System.out.println("En un tiempo de " + minutos + " minutos se ha atendido a:");
        System.out.println(clientesC + " clientes de servicio cajero");
        System.out.println(clientesA + " clientes de servicio asesor");
        clientesT = clientesC + clientesA;
        return clientesT;
    }
    //2.	Desarrolle un ejemplo de la estructura condicional MIENTRAS con CONTADORES en 
    //Pseudo-código y en lenguaje de programación java
    public int numero1a10(int salto){
        int secuencia = 1;
        int contador = 0;
        while (secuencia <=10){
            System.out.println(secuencia);
            secuencia+=salto;
            contador++;
        }
        return contador;
    }
    /*3.	Desarrolle un ejemplo de la estructura condicional HACER … MIENTRAS (REPETIR .. MIENTRAS)
    con BANDERAS en Pseudo-código y en lenguaje de programación java
    */
    //Leer numeros y si es un numero par sacar su tabla de multiplicacion hasta el 12
    public int tablaMultPar(int num){
        int a = 1;
        if (num % 2 == 0){
            for (int i = 1; i <=12;i++){
                int mult = num*i;
                System.out.println(num+" x "+i+" = "+mult);
                a = 0;
            }
        }
        return a;
    }
    public void numerosDivisiblesPara2num(int inicio1, int inicio2) {
        int resultado1 = 1;
        int resultado2 = 1;
        int definicion = 0;
        for (int i = 1; i <= 100; i++) {
            resultado1 = i % inicio1;
            resultado2 = i % inicio2;
            definicion = resultado1 + resultado2;
            if (definicion != 0) {
            
            } else {
                System.out.println(i + " Es un numero divisible para "+inicio1+" y "+inicio2);
            }
        }
        
    }
    public int randomizerParametro(int parametro){
        parametro = (int) (parametro + random() * 100);
        return parametro;
    }
    public String correccion(int dia){
        String msg = "";
        switch (dia){
            case 1:
                msg = "Lunes, Mal dia";
                break;
            case 2:
                msg = "Martes, Buen dia";
                break;
            case 3:
                msg = "Miercoles, Mal dia";
                break;
            case 4:
                msg = "Jueves, Buen dia";
                break;
            case 5:
                msg = "Viernes, Mal dia";
                break;
            default:
                msg = "Descanso";
        }
        return msg;
    }
}

/* resp = i*num; 
cont = 0; 
para j = 2 hasta num hacer
si (num % j == 0)
cont++;
break;
fin_si
fin_para
primo = ' ';
si (cont == 0)
primo = '*';
fin_si
presentar(numero+primo);
fin_para
} */
