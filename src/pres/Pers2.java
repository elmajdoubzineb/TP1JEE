package pres;
import dao.IDAO;
import dao.DaoImpl;
import metier.IMetier;
import metier.MetierImpl;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pers2 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner (new File("config.txt"));
		String daoClassName = scanner.nextLine();
		Class cDAo = Class.forName(daoClassName);
		IDAO dao = (IDAO)cDAo.newInstance();
		//System.out.println(dao.getData());
		
		String metierClassName =scanner.nextLine();
		Class cMetier = Class.forName(metierClassName);
		IMetier metier = (IMetier) cMetier.newInstance();
		/* faire appel*/
		 
		Method m = cMetier.getMethod("setDao", IDAO.class);
		m.invoke(metier, dao);
		System.out.println("Res: "+metier.calcul());
		
	}
	}

