/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author tomen
 */
public class Topicos {

//    public static void main(String[] args) {
//// split ("\n")
// //       String codigo = "Esto es un mensaje\nEsto es un mensaje";
//        //h G
//        String codigo = "abcdeABCDE1\nabcABC1";
//      //  System.out.println(codigo);
//        
//        Topicos objtopi =new Topicos();
//        System.out.println("Mensaje cifrado\n"+objtopi.cifrar(codigo));
//        System.out.println("--------------------");
//        System.out.println("Mensaje noCifrado\n"+objtopi.noCifrar(objtopi.cifrar(codigo)));
//            System.out.println("        OTRO        ");
//codigo = "Esto es un mensaje\n1Esto es un mensaje1";
//
//        Topicos objtopit =new Topicos();
//     //   System.out.println("Mensaje cifrado\n"+objtopit.cifrar(codigo));
//        System.out.println("--------------------");
//        System.out.println("Mensaje noCifrado\n"+objtopit.noCifrar(objtopit.cifrar(codigo)));
//// 
//        // def D EF1
//        // 1FE D fed
//        // 1FE C edc
//        // declaramos todas la variables
////        String codigoTradu = "";
////        String codigodesi = "";
////        int cambio = 2;
////        int asciiValue;
//        int condicion = codigo.length() / 2;
//        // hacemos que recorra toda la palabra
////        for (int i = 0; i < codigo.length(); i++) {
////
////            asciiValue = codigo.charAt(i);
////            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
////            if (i > condicion) {
////                cambio = 3;
////            }
////            // verificamos que sea una letra para hacer el cambio de valor 
////            if (asciiValue > 64 && asciiValue < 123) {
////                asciiValue = asciiValue + cambio;
////            }
////
////            // System.out.println(cambio);
////            // hacemos que guarde el char del string pero invertido 
////            codigoTradu = (char) asciiValue + codigoTradu;
////        }
////        System.out.println(codigoTradu);
////        cambio = -3;
////
////        for (int i = 0; i < codigoTradu.length(); i++) {
////
////            asciiValue = codigoTradu.charAt(i);
////            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
////            if (i >= condicion) {
////                cambio = -2;
////            }
////            // verificamos que sea una letra para hacer el cambio de valor 
////            if (asciiValue > 64 && asciiValue < 123) {
////                asciiValue = asciiValue + cambio;
////            }
////
////            // System.out.println(cambio);
////            // hacemos que guarde el char del string pero invertido 
////            codigodesi = (char) asciiValue + codigodesi;
////        }
////        System.out.println("traducido-----" + codigodesi);
////        //////
//    }

    String cifrar(String información) {
        String[] infoSeparada = información.split("\n");
        String superCadena="";
        int asciiValue;
        for (int numero = 0; numero < infoSeparada.length; numero++) {
            if(numero!=0){
            superCadena=superCadena+"\n";
            }
        int cambio = 2;
                String codigoTradu = "";
        for (int i = 0; i < infoSeparada[numero].length(); i++) {
        int condicion = infoSeparada[numero].length() / 2;
            asciiValue = infoSeparada[numero].charAt(i);
            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
           
            if (condicion < i) {
                cambio = 3;
            }
            // verificamos que sea una letra para hacer el cambio de valor 
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }

            // System.out.println(cambio);
            // hacemos que guarde el char del string pero invertido 
            codigoTradu = (char) asciiValue + codigoTradu;
             //   codigoTradu=     codigoTradu+ " \n " ;
//             System.out.println(cambio+"+++++++++"+codigoTradu);
        }
      superCadena =superCadena+codigoTradu;
        
        
       
    }            try {
            String ruta = Math.random()*200+1+".txt";
            String contenido = superCadena;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                
                file.createNewFile();
                        JOptionPane.showMessageDialog(null, "Operación realizada "+ ruta);

            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 return superCadena;
    }
String noCifrar(String información) {
        String[] infoSeparada = información.split("\n");
        String superCadena="";
      
        int asciiValue;
        for (int numero = 0; numero < infoSeparada.length; numero++) {
             int cambio = -3;
             if(numero!=0){
            superCadena=superCadena+"\n";
            }
                String codigoTradu = "";
        for (int i = 0; i < infoSeparada[numero].length(); i++) {
        int condicion = infoSeparada[numero].length() / 2;
        //condicion = condicion-1;
         //   System.out.println(infoSeparada[numero].length()+ "   condicion ");    
        asciiValue = infoSeparada[numero].charAt(i);
            //verificamos que llegue a la mitad para hacer el cambio en el incremento 
            if (i  >= condicion ) {
               
                cambio = -2;
            }
            // verificamos que sea una letra para hacer el cambio de valor 
            if (asciiValue > 64 && asciiValue < 123) {
                asciiValue = asciiValue + cambio;
            }
           
            // System.out.println(cambio);
            // hacemos que guarde el char del string pero invertido 
            codigoTradu = (char) asciiValue + codigoTradu;
             //   codigoTradu=     codigoTradu+ " \n " ;
          //   System.out.println(cambio+"+++++++++"+codigoTradu);
        }
      superCadena =superCadena+codigoTradu;
        }
                try {
            String ruta = Math.random()*300+1+" .vge";
            String contenido = superCadena;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                
                file.createNewFile();
                        JOptionPane.showMessageDialog(null, "Operación realizada CIFRADO "+ ruta);

            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return superCadena;
    }

    }
