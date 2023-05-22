
package com.example;

import com.example.BloqueoAutomatico;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        Scanner sc = new Scanner(System.in);
        String clave;
        BloqueoAutomatico bloqueo = new BloqueoAutomatico();

        System.out.println("Ingresa la clave a revisar");
        clave = sc.next();
        bloqueo.intentoFallido(clave);
    }
}

