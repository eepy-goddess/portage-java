package main.lib.portage.package_management.flags;

import main.lib.portage.interfaces.FlagFeature;
import main.lib.portage.package_management.EmergePackage;

public class Update implements FlagFeature {
	
	@Override
	public int flagId() {
		return 0;
	}

	@Override
	public boolean deployFlag(EmergePackage packag) {
		System.out.println("yo, i be updating");
		return true;
	}

}
