package lib.portage;

import java.util.ArrayList;
import java.util.List;

import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.Emerge;

public class Main {
	public static List<FlagFeature> flags = new ArrayList<>();

	public static void main(String[] args) {
		Emerge.command(args);
		
		
	}
	public static FlagFeature getFlagById(int id) {
		for(FlagFeature o : flags) {
			if(o.flagId() == id) {
				return o;
			}
		}
		return null;
	}
}
