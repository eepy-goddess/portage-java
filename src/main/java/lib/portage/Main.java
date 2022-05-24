package lib.portage;

import java.util.ArrayList;
import java.util.List;

import lib.portage.configuration.MakeconfReader;
import lib.portage.enums.EmergeFlags;
import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.Emerge;
import lib.portage.package_management.EmergePackage;

public class Main {
	//F
	public static List<FlagFeature> flags = new ArrayList<FlagFeature>();

	public static void main(String[] args) throws Exception {
		MakeconfReader conf = new MakeconfReader("./etc/portage/make.conf");
		Emerge.command(args);
		
		
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
