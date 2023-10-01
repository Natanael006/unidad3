/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int saldo = 3000, retirar, deposito;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("BIENVENIDO AL CAJERO AUTOMATICO\n");
            System.out.println("-----------------------------------");
            System.out.println("PRESIONE 1 PARA RETIRAR SALDO");
            System.out.println("PRESIONE 2 PARA DEPOSITAR DINERO");
            System.out.println("PRESIONE 3 PARA VERIFICAR SU SALDO");
            System.out.println("PRESIONE 4 PARA SALIR");
            System.out.println("------------------------------------\n");
            System.out.print("POR FAVOR SELECCIONA LA OPERACION QUE DESEAS REALIZAR:");
            int n = s.nextInt();
            switch(n)
            {
                case 1 -> {
                    System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                    retirar = s.nextInt();
                    if(saldo >= retirar)
                    {
                        saldo = saldo - retirar;
                        System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                    }
                    else
                    {
                        System.out.println("\nBALANCE INSUFICIENTE");
                    }
                    
                    System.out.println("");
           }
 
                case 2 -> {
                    System.out.print("\nINGRESA LA CANTIDAD DE DINERO QUE DESEA DEPOSITAR:");
                    deposito = s.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("\nTU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");
           }
 
                case 3 -> System.out.println("SALDO : " + saldo);
 
                case 4 -> {
                    System.out.println("GRACIAS POR USO DE NUESTRO CAJERO AUTOMATICO");
                    System.exit(0);
           }
            }
        }

	}
}
