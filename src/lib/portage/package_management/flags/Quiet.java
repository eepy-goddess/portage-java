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
		pack.setVerboseMode(false);
		return false;
	}

}
