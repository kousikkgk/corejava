package corejava.concepts;

class Account {
	private long acc_no;
	private String name, email;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", name=" + name + ", email=" + email + ", amount=" + amount + "]";
	}

	

}

public class ObjectClassMethods extends Object {
	
	public static void main(String[] args) {
		Account acc1=new Account();  
		
		acc1.setAcc_no(12345678L);  
		acc1.setName("Tops Account");  
		acc1.setEmail("sample@topsmarket.com");  
		acc1.setAmount(500000f);
		
		Account acc2=new Account();  
		
		acc2.setAcc_no(12345678L);  
		acc2.setName("Tops Account");  
		acc2.setEmail("sample@topsmarket.com");  
		acc2.setAmount(500000f); 
//		
//		display(acc1);
//		display(acc2);
		
		System.out.println(acc1);
		System.out.println(acc1.equals(acc2));
		System.out.println(acc1==acc2);
		System.out.println("Hascode for Account1: "+acc1.hashCode());
		System.out.println("Hascode for Account2: "+acc2.hashCode());
	}

	private static void display(Account acc) {
		System.out.println("Account No: "+acc.getAcc_no());
		System.out.println("Account Name: "+acc.getName());
		System.out.println("Email: "+acc.getEmail());
		System.out.println("Balance: "+acc.getAmount());  
	}

}
