package poo;

public class ClaseBancaria {
	
	private String NumCuenta;
	private double Saldo;
	private String NomCliente;
	private String email;
	private String NumTelefono;
	
	
	public ClaseBancaria(){
		this("Desconocido", 0.00 ,"Desconocido", "Desconocido", "Desconocido");
	}
	public ClaseBancaria(String NumCuenta,double Saldo, String NomCliente, String email, String NumTelefono) {
		this.NumCuenta=NumCuenta;
		this.Saldo=Saldo;
		this.NomCliente=NomCliente;
		this.email=email;
		this.NumTelefono=NumTelefono;
	}
	
	public void ponerNumCuenta(String NumCuenta) {
		this.NumCuenta=NumCuenta;
	}
	public void ponerSaldo(double Saldo) {
		this.Saldo=Saldo;
	}
	public void ponerNomCliente(String NomCliente) {
		this.NomCliente=NomCliente;
	}
	public void ponerEmail(String email) {
		this.email=email;
	}
	public void ponerNumTelefono(String NumTelefono) {
		this.NumTelefono=NumTelefono;
	}
	
	public String mostrarNumCuenta() {
		return this.NumCuenta;
	}
	public double mostrarSaldo() {
		return this.Saldo;
	}
	public String mostrarNomCliente() {
		return this.NomCliente;
	}
	public String mostrarEmail() {
		return this.email;
	}
	public String mostrarNumTelefono() {
		return this.NumTelefono;
	}
	
	public void Depositar(double montoDeposito) {
		MostrarDatos();
		this.Saldo+=montoDeposito;
		System.out.println("=====================================");
		System.out.println("El monto depositado fue de C$:"+montoDeposito);
		System.out.println("Su saldo actual es de C$:"+mostrarSaldo());
		System.out.println("=====================================");
	}
	public void Retirar(double montoRetiro) {
		MostrarDatos();
		if(montoRetiro > this.Saldo) {
			System.out.println("=====================================");
			System.out.println("No tiene saldo suficiente");
			System.out.println("Su saldo actual es de C$:"+mostrarSaldo());
			System.out.println("=====================================");
		} else {
			this.Saldo-=montoRetiro;
			System.out.println("=====================================");
			System.out.println("El monto retirado fue de C$:"+montoRetiro);
			System.out.println("Su saldo actual es de C$:"+mostrarSaldo());
			System.out.println("=====================================");
		}
	}
	public void MostrarDatos() {
		System.out.println("=====================================");
		System.out.println("Nombre: "+mostrarNomCliente());
		System.out.println("N° de cuenta:"+mostrarNumCuenta());
		System.out.println("Email: "+mostrarEmail());
		System.out.println("Telefono: "+mostrarNumTelefono());
	}
}
