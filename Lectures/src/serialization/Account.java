package serialization;

import java.io.Serializable;

public class Account implements Serializable{ //Serializable - marker interface which makes class eligible to travel through network, basically converts a object into binary stream
	private int accNo;
	private String accType;
	private transient float accBal; //transient keyword is used to skip a data member while serializing, it will ignore original value and use default value while serializing
	private static int series = 501000;
	public Account(String accType, float accBal) {
		super();
		this.accNo = series;
		series++;
		this.accType = accType;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", accBal=" + accBal + "]";
	}
}
