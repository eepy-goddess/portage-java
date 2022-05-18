package main.lib.portage.package_management.flags;

import main.lib.portage.interfaces.FlagFeature;
import main.lib.portage.package_management.EmergePackage;

public class Deep implements FlagFeature {

	@Override
	public int flagId() {
		return 2;
	}

	@Override
	public boolean deployFlag(EmergePackage packag) {
		System.out.println("what do thou know about rolling in the deep");
		return true;
	}

}
