package poo;
import java.util.Scanner;
public class CuentaBancaria {

	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		ClaseBancaria cb=new ClaseBancaria();
		int mn,saldo;
		String nom,numcuenta, telefono,email;
		System.out.println("Bienvenido a BancaUNI");
		do {
			System.out.println("Que desea hacer hoy?");
			System.out.println("\n1.Registrarse"
					+"\n 2.Retiro de saldo"
					+"\n3.Deposito de saldo");
			mn=lec.nextInt();
		}while(mn<=0 || mn>3);

		
		switch(mn) {
		case 1:
			System.out.println("Ingrese su nombre: ");
			nom=lec.next();
			System.out.println("Ingrese su N° Telefono:");
			telefono=lec.next();
			System.out.println("Ingrese su Correo Electronico:");
			email=lec.next();
			System.out.println("Ingrese su N° De Cuenta");
			numcuenta=lec.next();
			System.out.println("Ingrese la cantidad de su saldo");
			saldo=lec.nextInt();
			
			
			cb.ponerNomCliente(nom);
			cb.ponerNumTelefono(telefono);
			cb.ponerEmail(email);
			cb.ponerNumCuenta(numcuenta);
			cb.ponerSaldo(saldo);
			break;
		case 2:
			break;
		case 3:
			break;
		
		}
		
		
		
		

		
		
		
		
		
		
		

	}

}
