package springIntro;

public class MsSqlCustomerDal  implements ICustomerDal{
	
String conncectionString;
	
	public String getConncectionString() {
		return conncectionString;
	}

	public void setConncectionString(String conncectionString) {
		this.conncectionString = conncectionString;
	}

	@Override
	public void add() {
		System.out.println("Conncection String :" + this.conncectionString);
		System.out.println("MsSql veritabanına eklendi");
		
	}

}
