package lib.portage.package_management;

import lib.portage.enums.EmergeFlags;
import lib.portage.Main;
import lib.portage.configuration.MakeconfReader;

public class Emerge {
	public static void command(String[] args) {
		try {
			EmergePackage ppackage = new EmergePackage(args[args.length - 1]);
		
			if(args.length != 1 && args.length != 0) {
				flagExecution(args, ppackage);
			} else if(args.length == 1){
				packageOperation(ppackage);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("no flags");
			//TODO: display help command
		}
	}
	public static void flagExecution(String[] args, EmergePackage pack) {
		for(String o : args) {
			for(EmergeFlags p : EmergeFlags.values()) {
				if(o.equals(p.flag) || o.equals(p.shortflag)) {
				    boolean execution = Main.getFlagById(p.flagId).deployFlag(pack);
				    if(!execution) {
				    	System.out.println("<error handling system goes here>");
				    }
				} else {
					continue;
			    }
			}
		}
		packageOperation(pack);
	}
	public static void packageOperation(EmergePackage pack) {
		System.out.println("Now installing: " + pack.getPath());
		MakeconfReader conf = new MakeconfReader("./etc/portage/make.conf");
		try {
			for(int i = 0; i <= conf.getUseFlags().length - 1; i ++)
				pack.useFlagInstructions(conf.getUseFlags()[i]);
		} catch(Exception e) {
			System.out.println("no use flags found");
		}
	}
}
