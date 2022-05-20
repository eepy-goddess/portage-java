package lib.portage.package_management.flags;

import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.EmergePackage;

public class Deep implements FlagFeature {

	@Override
	public int flagId() {
		return 2;
	}

	@Override
	public boolean deployFlag(EmergePackage packag) {
		System.out.println("deep flag active");
		return true;
	}

}
