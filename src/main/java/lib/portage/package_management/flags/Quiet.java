package lib.portage.package_management.flags;

import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.EmergePackage;

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
