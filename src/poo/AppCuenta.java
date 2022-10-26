package poo;

public class AppCuenta {
	public static void main(String[] args) {
		ClaseBancaria cb=new ClaseBancaria();
		
		cb.ponerNomCliente("Juan Martinez");
		cb.ponerNumCuenta("54789865");
		cb.ponerEmail("juan.martinez@gmail.com");
		cb.ponerNumTelefono("88956578");
		
		cb.Retirar(50.00);
		cb.Depositar(150.00);
		cb.Depositar(500.00);
		cb.Retirar(50.00);
		
		ClaseBancaria cb1=new ClaseBancaria("4535785", 0.00 ,"Maria Jimenez", "maria.jimenez@gmail.com", "80823923");
		cb1.MostrarDatos();
		
		ClaseBancaria cb2=new ClaseBancaria();
		cb2.MostrarDatos();
	}
}
