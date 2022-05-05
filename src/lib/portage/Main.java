package lib.portage;

import java.util.ArrayList;
import java.util.List;

import lib.portage.enums.EmergeFlags;
import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.EmergePackage;
import lib.portage.package_management.flags.Quiet;


public class Main {
	//F
	public static List<FlagFeature> flags = new ArrayList<FlagFeature>();

	public static void main(String[] args) {
		EmergePackage ppackage = new EmergePackage(args[args.length - 1]);
		for(String o : args) {
			for(EmergeFlags p : EmergeFlags.values()) {
				System.out.println("Arg: " + o + "\n" +
			    		"Enum: " + p.toString());
				if(o.equals(p.flag) || o.equals(p.shortflag)) {
				    getFlagById(p.flagId).deployFlag(ppackage);
				    
				} else {continue;}
			}
		}
		
	}
	public static FlagFeature getFlagById(int id) {
		for(FlagFeature o : flags) {
			if(o.flagId() == id) {
				return o;
			}else {
				continue;
			}
		}
		return null;
	}
}
