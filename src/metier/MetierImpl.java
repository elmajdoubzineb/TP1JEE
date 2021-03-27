package metier;
import dao.IDAO;
public  class MetierImpl implements IMetier {
 private IDAO dao;
	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double d=dao.getData();
		double res=d*33;
		System.out.println("Calcul métier avec data="+d);
		return res;
			
	}

	public void setDao(IDAO dao){
		this.dao = dao ;
	}
}
