	import java.util.Scanner;
	public class Menu{
		public void menu(){
	 		int opc;
			scanner lee=new Scanner(System.int);
			Banco obj2=new Banco (200);
			do{
			   System.out.println("1.- Deposito");
			   System.out.println("2.- Retiro");
			   System.out.println("3.- Saldo");
			   System.out.println("4.- Salir");
			   System.out.println("\n\n Ingrese la opcion: ");
			   opc=lee.nextInt();
			   System.out.println("\n\n Ingrese el monto");
			   monto=lee.nextFloat();
			   if(opc==1){
				obj2.calcular(monto,opc);
				}
			  if(opc==2){
				obj2.calcular(monto,opc);
				}
			  if(opc==3){
				System.out.println("El saldo a la fecha
				}
			   
}