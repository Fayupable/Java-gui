package springIntro;

public class CustomerManager implements ICustomerService {
	
	
	
	private ICustomerDal customerDal;
	
	
	//Constructor injection
//	public CustomerManager(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

	//Setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}


	public void add() {
		
		customerDal.add();
		
			
		
	}
}



