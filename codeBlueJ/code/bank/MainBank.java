public class MainBank{
		
    public static void main (String args[]){
    		Person NaimEnPersona=new Person("Naim ","Gonzalez");
    		Person MauricioEnPersona=new Person("Mauricio ","Herrero");
    		
    		BankAccount cuentaDeNaim=new BankAccount(NaimEnPersona, 777);
    		BankAccount cuentaDeMauricio=new BankAccount(MauricioEnPersona, 1000);
    		
    		cuentaDeNaim.deposit(300);
    		cuentaDeMauricio.withdraw(300);
    		
    		System.out.println(cuentaDeNaim.toString());
    		System.out.println(cuentaDeMauricio.toString());
    		
    		
    }
    
}
