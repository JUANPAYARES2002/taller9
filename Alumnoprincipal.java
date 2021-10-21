/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import java.util.ArrayList;

/**
 *
 * @author Juan Payares
 */
public class Alumnoprincipal {
    public static void main(String[] args) {

        ArrayList<Alumno>Lista = new ArrayList();
        
        Alumno al1 =new Alumno ("Juan",  "payares", "sexto" ,"masculino" ,4);
        Lista.add(al1);
        Alumno al2 =new Alumno ("Lucas",  "Cisneros", "octabo" ,"masculino" ,3);
        Lista.add(al2);
        Alumno al3 =new  Alumno ("Daniel",  "Perez", "septimo" ,"masculino" ,2);
        Lista.add(al3);
        
        System.out.println("Listado de alumnos");
        Lista.forEach((a) -> {
            System.out.println( a.getNombre()+ "  "+a.getApellido()+" "+a.getPadron()+" "+a.getSexo()+" "+a.getCondicion()+" "+a.getNotafinal());
        });
        
        }
     }
    

