package main.lib.portage;

import java.util.ArrayList;
import java.util.List;

import main.lib.portage.configuration.MakeconfReader;
import main.lib.portage.enums.EmergeFlags;
import main.lib.portage.interfaces.FlagFeature;
import main.lib.portage.package_management.EmergePackage;

public class Main {
	//F
	public static List<FlagFeature> flags = new ArrayList<FlagFeature>();

	public static void main(String[] args) throws Exception {
		EmergePackage ppackage = new EmergePackage(args[args.length - 1]);
		MakeconfReader conf = new MakeconfReader("./etc/portage/make.conf");
		for(String o : args) {
			for(EmergeFlags p : EmergeFlags.values()) {
				if(o.equals(p.flag) || o.equals(p.shortflag)) {
				    boolean execution = getFlagById(p.flagId).deployFlag(ppackage);
				    if(!execution) {
				    	throw new Exception("Duplicate flag has been used");
				    }
				} else {
					continue;
			    }
			}
		}
		for(int i = 0; i <= conf.getUseFlags().length - 1; i ++)
		    ppackage.useFlagInstructions(conf.getUseFlags()[i]);
		
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
