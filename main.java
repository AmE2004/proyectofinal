import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] idsDoctores = new String[10];
        String[] nombresDoctores = new String[10];
        String[] especialidades = new String[10];
        String[] idsPacientes = new String[10];
        String[] nombresPacientes = new String[10];
        String[] idsCitas = new String[10];
        String[] fechasCitas = new String[10];
        String[] motivosCitas = new String[10];
        String[] doctorCita = new String[10];
        String[] pacienteCita = new String[10];
        String adminId = "Admin";
        String adminPass = "Admin1";
        String inputId, inputPass;
        int opcion = 0;
        int cantDoctores = 0;
        int cantPacientes = 0;
        int cantCitas = 0;
        System.out.println("Teclea el usuario:");
        inputId = sc.nextLine();
        System.out.println("Teclea la contraseña:");
        inputPass = sc.nextLine();
        if (inputId.equals(adminId) && inputPass.equals(adminPass)) {
            do {
                System.out.println("\nMENU");
                System.out.println("1. Alta de doctor");
                System.out.println("2. Alta de paciente");
                System.out.println("3. Crear una cita");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opción:");
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("ID del doctor:");
                        idsDoctores[cantDoctores] = sc.nextLine();
                        System.out.println("Nombre completo:");
                        nombresDoctores[cantDoctores] = sc.nextLine();
                        System.out.println("Especialidad:");
                        especialidades[cantDoctores] = sc.nextLine();
                        cantDoctores++;
                        System.out.println("Registrado exitosamente");
                        break;
                    case 2:
                        System.out.println("ID del paciente:");
                        idsPacientes[cantPacientes] = sc.nextLine();
                        System.out.println("Nombre completo:");
                        nombresPacientes[cantPacientes] = sc.nextLine();
                        cantPacientes++;
                        System.out.println("Registrado exitosamente");
                        break;
                    case 3:
                        System.out.println("ID de la cita:");
                        idsCitas[cantCitas] = sc.nextLine();
                        System.out.println("Fecha y hora (dd/mm/aaaa hh:mm):");
                        fechasCitas[cantCitas] = sc.nextLine();
                        System.out.println("Motivo de la cita:");
                        motivosCitas[cantCitas] = sc.nextLine();
                        System.out.println("ID del doctor:");
                        doctorCita[cantCitas] = sc.nextLine();
                        System.out.println("ID del paciente:");
                        pacienteCita[cantCitas] = sc.nextLine();
                        cantCitas++;
                        System.out.println("La cita fue realizada satisfactoriamente");
                        break;
                    case 4:
                        System.out.println("Cerrando sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (opcion != 4);
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
        sc.close();
    }
}
