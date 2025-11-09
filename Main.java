import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Punto de entrada principal de la aplicación.
     * @param arg
     */
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        ArrayList <Vehiculo> inventario = new ArrayList<>(); // ArrayList para guardar los coches creados en el inventario
        
        try {
            /**
             *  * 3 Objetos creados por defecto, 2 coches y una moto 
             *  */
            Coche coche1 = new Coche("AFD-2684","Nissan","March 1.6 ",80,4);
            Coche coche2 = new Coche("CCB-8457","Chevrolet","Spark GT 1.2",60,4);
            Motocicleta motocicleta1 = new Motocicleta("PFF-8854", "Honda", "Honda CB190R", 30, 500);

            //Añadimos al inventario
            inventario.add(coche1);
            inventario.add(coche2);
            inventario.add(motocicleta1);

            /**
             * Sistema para el alquiler de un vehiculo ya registrado
             */
            System.out.println("\n-------- BIENVENIDO AL SISTEMA DE ALQUILER DE VEHICULOS -----------\n");
            System.out.println("----- Vehiculos disponibles -----");

            //Bucle for para mostrar los vehiculos con su marca y numero de placas 
            for (Vehiculo v : inventario) {
                System.out.println("Marca: "+v.getMarca()+", Placa: "+v.getPlaca());
            }
            
            System.out.println("---------------------------------");

            //Elegir que vehiculo quiere alquilar mediante la placa
            System.out.print("\nIngrese la placa del vihiculo para alquilar: ");
            String placaBuscada = scanner.nextLine();

            //Ingresa los dias que va alquilar el vehiculo
            System.out.print("Ingrese el dia que desea alquilar: ");
            int diasAlquiler = scanner.nextInt();

            //Mensaje error si no son negativos los dias 
            if (diasAlquiler <= 0) {
                throw new DatosInvalidosException("Error: los dia nos pueden ser negativos");
            }
            
            boolean encontrado = false;
            /**
             * Un bucle for para realizar el recibo, bucamos en el inventario la placa
             * y realizamos el repectivo calculo para cuantos dias alquilo el vehiculo
             */ 
            for (Vehiculo v : inventario) {
                if (v.getPlaca().equalsIgnoreCase(placaBuscada)) {
                    encontrado = true;
                    int total = v.getPrecioDia() * diasAlquiler;
                    
                    System.out.println("\n----- RECIBO DE ALQUILER -----");
                    System.out.println("Vehiculo: "+v.getMarca());
                    System.out.println("Modelo: "+v.getModelo());
                    System.out.println("Placa: "+v.getPlaca());
                    System.out.println("Precios por dias: "+v.getPrecioDia());
                    System.out.println("Dias de alquiler: "+diasAlquiler);
                    System.out.println("----------------------------------");
                    System.out.println("Total: "+total);
                    break; //salimos del buble for
                }
            }
            //indicamos UN mensaje de error si no se encuentra el vehiculo mediante la placa
            if(!encontrado){
                System.out.println("Error: no se ha encontrado ningun vehiculos con este numero de placa: "+placaBuscada);
            }
        //Excepciones con mensajes de error si no se cumple las validaciones al ingreso de datos
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un numero valido para los dias");
        }catch(DatosInvalidosException e){
            System.out.println("Error: "+e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Error al crear el vihiculo: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Error inesperado: "+e.getMessage());
        }finally{
            System.out.println("Fin de la simulacion, muchas gracias :)");
            scanner.close(); //cerramos el scanner
        }
    }
}
