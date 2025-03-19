import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correoRegistro = "", contraseñaRegistro = "", correoInicioSesion = "", contraseñaInicioSesion = "", confirmarContraseña, nombreUsuario = "null";
        boolean encenderPrograma = true;

        // Comienzo del programa
        System.out.println("*******BIENVENIDO AL PROGRAMA*******");
        while (encenderPrograma) {
            System.out.println("Quiere registrarse(1), iniciar sesion(2) o salir(3). Elija con el numero correspondiente");
            int elegirAccion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt()

            switch (elegirAccion) {
                case 1:
                    boolean condition = false;

                    System.out.println("Ha elegido registrarse");
                    System.out.println("Empiece dandonos su correo electrónico");
                    correoRegistro = scanner.nextLine();
                    System.out.println("Denos su nombre de usuario");
                    nombreUsuario = scanner.nextLine();

                    System.out.println("Ahora denos su edad");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de nextInt()

                    while (!condition) {
                        System.out.println("Denos su contraseña");
                        contraseñaRegistro = scanner.nextLine();
                        System.out.println("Confirme la contraseña");
                        confirmarContraseña = scanner.nextLine();

                        if (confirmarContraseña.equals(contraseñaRegistro)) {
                            System.out.println("¡Registro exitoso!");
                            condition = true;
                        } else {
                            System.out.println("La contraseña no es igual, vuelva a colocar las contraseñas.");
                        }
                }
                    break;
                case 2:
                    if (correoRegistro.isEmpty() || contraseñaRegistro.isEmpty()) {
                        System.out.println("No hay ningun usuario/a registrado");
                        break;
                    }

                    boolean condition2 = false;
                    System.out.println("Ha elegido la opcion de inicio de sesion");
                    while (condition2 == false) {
                        System.out.println("Denos su correo electronico");
                        correoInicioSesion = scanner.nextLine();
                        System.out.println("Ahora la contraseña");
                        contraseñaInicioSesion = scanner.nextLine();

                        if (correoInicioSesion.equals(correoRegistro) && contraseñaInicioSesion.equals(contraseñaRegistro)) {
                            condition2 = true;
                            System.out.println("Inicio de sesion exitoso");
                            System.out.println("Hola "+nombreUsuario);

                            double masaCorporal, altura;


                            boolean encernderPrograma = true;

                            while (encernderPrograma) {
                                System.out.println("Vamos a calcular su IMC (Indice de masa corporal)");
                                System.out.println("Deme su masa corporal");
                                masaCorporal = scanner.nextDouble();
                                System.out.println("Deme su altura en metros");
                                altura = scanner.nextDouble();
                                double IMC = calculoIMC(masaCorporal, altura);
                                System.out.println("Su IPM es: "+IMC);

                                if (IMC < 18.5) {
                                    System.out.println("Usted tiene un peso por debajo de lo normal");
                                }else if (IMC > 18.5 && IMC < 24.9) {
                                    System.out.println("Usted tiene un peso normal");
                                }else if (IMC >25 && IMC <29.9) {
                                    System.out.println("Usted tiene sobrepeso, cuide su alimentacion");
                                }else{
                                    System.out.println("Usted tiene obesidad, vaya al medico");
                                }

                                System.out.println("¿Quiere apagar el programa? 1 = SI/ 2 = NO ");
                                int apagarPrograma = scanner.nextInt();

                                switch (apagarPrograma) {
                                    case 1:
                                        System.out.println("Apagando programa...");
                                        encernderPrograma = false;
                                        break;
                                    case 2:
                                        System.out.println("No se ha apagado el programa");
                                        break;
                                    default:
                                        System.out.println("ERROR, no ha elegido una opcion correcta ❌❌");
                                        encernderPrograma = false;
                                        break;
                                }

                            }

                            
                        }else{
                            System.out.println("El correo o la contraseña no son correctos"); 
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    encenderPrograma = false;
                    break;
                default:
                    System.out.println("❌ERROR, no ha elegido una opcion correcta");
                    break;
            }
        }
        scanner.close();
    }
    public static double calculoIMC(double num1, double num2) {
        double IMC = num1/ (num2*num2);
        return IMC;
    }
}
