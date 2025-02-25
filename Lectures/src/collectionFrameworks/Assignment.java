package collectionFrameworks;

public class Assignment {
	public static void main(String[] args) {
		Account[] accountArr = new Account[3];
		accountArr[0] = new Account("Savings", 6845.6f);
		accountArr[1] = new Account("Current", 68856.6f);
		accountArr[2] = new Account("Demat", 65654.6f);
		Account acc1 = findByAccNumber(5010043, accountArr);
		Account acc2 = findByAccNumber(5010040, accountArr);
		System.out.println(acc1);
		System.out.println(acc2);
		printAll(accountArr);
	}
	
	public static void printAll(Account[] accountArr) {
		for(int i=0; i<accountArr.length; i++) {
			System.out.println(accountArr[i]);
		}
	}
	
	public static Account findByAccNumber(int accNo, Account[] accountArr) {
		for(int i=0; i<accountArr.length; i++) {
			if(accountArr[i].getAccNo() == accNo) {
				return accountArr[i];
			}
		}
		return null;
	}
}
