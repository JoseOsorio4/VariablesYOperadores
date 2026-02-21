package variablesyoperadores;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  1 Variables 
        System.out.println("DATOS USUARIO DE ESTUDIANTE");

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Es estudiante (true/false): ");
        boolean estudiante = sc.nextBoolean();

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estudiante: " + estudiante);


        // 2 Operaciones matematicas
        System.out.println("\nOperaciones Matematicas muestra");

        System.out.print("Numero 1: ");
        int num1 = sc.nextInt();

        System.out.print("Numero 2: ");
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2)); // division entera
        } else {
            System.out.println("No se puede dividir entre cero chavo");
        }

        System.out.println(": la division con int elimina decimale");

        // doubles
        System.out.println("\nOPERACIONES CON DOUBLE");
        System.out.print("Numero double 1: ");
        double d1 = sc.nextDouble();

        System.out.print("Numero double 2: ");
        double d2 = sc.nextDouble();

        System.out.println("Division double: " + (d1 / d2));


        // 3 Operaciones Logicas 
        System.out.println("\nOPERACIONES LOGICAS");

        System.out.print("Numero 1: ");
        int a = sc.nextInt();

        System.out.print("Numero 2: ");
        int b = sc.nextInt();

        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Igual: " + (a == b));

        System.out.println("and (Los dos son positiivos): " + (a > 0 && b > 0));
        System.out.println("or (solo un positivo): " + (a > 0 || b > 0));


        // 4 Clasificacion de edad
        System.out.println("\nCLASIFICACION DE EDAD");
        System.out.print("Ingrese edad: ");
        int edadPersona = sc.nextInt();

        if (edadPersona < 12) {
            System.out.println("niñe");
        } else if (edadPersona <= 17) {
            System.out.println("Adolescente");
        } else if (edadPersona <= 60) {
            System.out.println("Adulte");
        } else {
            System.out.println("Ruquito");
        }


        //5 Dia de la semana
        System.out.println("\n DIAS DE LA SEMANA");
        System.out.print("Ingrese numero (1-7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }


        //  6  Login de usuario
        sc.nextLine(); 

        System.out.println("\nLOGIN DE USUARIO");

        String usuarioCorrecto = "Jose";
        String claveCorrecta = "Osorio";

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String clave = sc.nextLine();

        if (usuario.equals(usuarioCorrecto)) {

            if (clave.equals(claveCorrecta)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Contraseña incorrecta");
            }

        } else {
            System.out.println("Usuario no registrado");
        }

        sc.close();
    }
}
