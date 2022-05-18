package main.lib.portage.package_management.flags;

import main.lib.portage.interfaces.FlagFeature;
import main.lib.portage.package_management.EmergePackage;

public class Quiet implements FlagFeature {
	@Override
	public int flagId() {
		return 1;
	}

	@Override
	public boolean deployFlag(EmergePackage pack) {
		if(!pack.getVerboseMode()) {
			System.out.println("bro, quiet flag is already active");
			return false;
		}
		pack.setVerboseMode(false);
		System.out.println("i be quiet");
		return true;
	}

}
