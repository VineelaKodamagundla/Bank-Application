import java.util.*;

public class BankApp {
	private String name;
	private String surname;
	private String email;
	private int accno;
	private int balance;
	private long phone;
	
	public BankApp() {
		
	}
	
	public BankApp(String name,String surname,String email,int accno,int balance,long phone) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.accno = accno;
		this.balance = balance;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getEmail() {
		return email;
	}
	public int getAccno() {
		return accno;
	}
	public int getBalance() {
		return balance;
	}
	public long getPhone() {
		return phone;
	}
	
	public void putMoney(int money) {
		balance += money;
		System.out.println("Balance = "+balance);
	}
	public void getMoney(int money) {
		balance -= money;
		System.out.println("Balance = "+balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0;
		System.out.println("Enter Info :\n");
		System.out.println("Enter name: ");
		String bname = sc.nextLine();
		System.out.println("Enter Surname: ");
		String bsname = sc.nextLine();
		System.out.println("Enter mail_ID: ");
		String bmail = sc.nextLine();
		System.out.println("Enter Account number: ");
		int acc = sc.nextInt();
		System.out.println("Enter Balance: ");
		int bbalance = sc.nextInt();
		System.out.println("Enter Phone number: ");
		long bphone = sc.nextLong();
		BankApp ba = new BankApp(bname,bsname,bmail,acc,bbalance,bphone);
		System.out.println("\nAccount Holder's Details:\n");
		System.out.println("Name: "+ba.getName()+" "+ba.getSurname());
		System.out.println("Mail: "+ba.getEmail());
		System.out.println("Account number: "+ba.getAccno());
		System.out.println("Account Balance: "+ba.getBalance());
		System.out.println("Phone number: "+ba.getPhone());
		
		do{
			System.out.println("Enter 1 for Deposit and 2 for Withdrawal and 3 to end transaction\n");
			choice = sc.nextInt();
			if(choice == 1){
				System.out.println("Enter the amount to Deposit:\n");
				int a = sc.nextInt();
				ba.putMoney(a);
			}
			else if (choice == 2){
				System.out.println("Enter the amount to Witdraw:\n");
				int a = sc.nextInt();
				ba.getMoney(a);
			}
			else
				return;
		}while(choice != 3);
}

}