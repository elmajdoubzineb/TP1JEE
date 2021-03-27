package ext;

import dao.IDAO;

public class DaoImplV2 implements IDAO {

	
	@Override
	public double getData() {
		// TODO Auto-generated method stub
		double data= 44.0;
		System.out.println("get data v2 ws :"+data);
		return data;
	}

}
