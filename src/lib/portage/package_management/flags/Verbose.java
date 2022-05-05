package lib.portage.package_management.flags;

import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.EmergePackage;

public class Verbose implements FlagFeature {

	@Override
	public int flagId() {
		return 3;
	}

	@Override
	public boolean deployFlag(EmergePackage packag) {
		return false;
	}

}
