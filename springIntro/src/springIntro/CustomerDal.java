package springIntro;

public class CustomerDal implements ICustomerDal {
	String conncectionString;
	
	public String getConncectionString() {
		return conncectionString;
	}

	public void setConncectionString(String conncectionString) {
		this.conncectionString = conncectionString;
	}

	public void add() {
		System.out.println("Conncection String :" + this.conncectionString);
		System.out.println("Oracle veritabanına eklendi");
	}

}
