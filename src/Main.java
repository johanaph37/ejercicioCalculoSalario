import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado ="", documentoEmpleado="";
        double salarioBruto =0, salarioNeto =0, cantidadHoras = 0, deduccionSalud = 0, deduccionPension =0, horasExtra =0, valorHorasExtra =0, bonificacion =0, fondoSolidaridadPensional =0, valorRetencionFuente =0, auxilioTransporte =0, salariominimo =0;

        System.out.println("Ingrese el nombre del empleado");
        nombreEmpleado = sc.nextLine();

        System.out.println("Ingrese el documento del empleado");
        documentoEmpleado = sc.nextLine();

        System.out.println("Ingrese el valor de la hora");
        valorHora = sc.nextDouble();

        System.out.println("Ingrese la cantidad de las horas");
        cantidadHoras = sc.nextDouble();

        System.out.println("Ingrese el valor del salario minimo actual");
        salariominimo= sc.nextDouble();

if(cantidadHoras>=24) {
    System.out.println("Se le puede pagar al empleado");
    salarioBruto = valorHora * cantidadHoras;

    deduccionPension = salarioBruto * 0.04;
    deduccionSalud = salarioBruto * 0.04;

    if (salarioBruto <= (salariominimo * 2)) {
        auxilioTransporte = 200000;
        bonificacion = salarioBruto * 0.1;
    }
        else {
            auxilioTransporte = 0;
        }
if(cantidadHoras >96){
    horasExtra = cantidadHoras - 96;
    valorHorasExtra = (valorHora * 0.25) * horasExtra;
}
    System.out.println("Detalle de pago " + nombreEmpleado);
    System.out.println("La deducion por pensión es: $" + deduccionPension);
    System.out.println("la deduciión por salud es: $" + deduccionSalud);
    System.out.println("El salario bruto del empleado es: " + nombreEmpleado + " es $" + salarioBruto);
    System.out.println("El auxilio de transporte es: " + auxilioTransporte);
    System.out.println("La bonificación es: " + bonificacion);
    System.out.println("El valor de las horas extra son: " + valorHorasExtra);
    System.out.println("El salario neto es: "+ (salarioBruto - deduccionPension - deduccionSalud + auxilioTransporte + valorHorasExtra + bonificacion));
    }
else{
        System.out.println("Le faltan " + (24 - cantidadHoras) + " horas de trabajo");
         }
       }
    }




