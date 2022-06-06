package lib.portage.package_management.flags;

import lib.portage.interfaces.FlagFeature;
import lib.portage.package_management.EmergePackage;

public class Help implements FlagFeature {
    @Override
    public int flagId() {
        return 4;
    }

    @Override
    public boolean deployFlag(EmergePackage packag) {
        System.out.println("emerge: command-line interface to the Portage system\n" +
                "Usage:\n" +
                "   emerge [ options ] [ action ] [ ebuild | tbz2 | file | @set | atom ] [ ... ]\n" +
                "   emerge [ options ] [ action ] < @system | @world >\n" +
                "   emerge < --sync | --metadata | --info >\n" +
                "   emerge --resume [ --pretend | --ask | --skipfirst ]\n" +
                "   emerge --help\n" +
                "Options: -[abBcCdDefgGhjkKlnNoOpPqrsStuUvVwW]\n" +
                "          [ --color < y | n >            ] [ --columns    ]\n" +
                "          [ --complete-graph             ] [ --deep       ]\n" +
                "          [ --jobs JOBS ] [ --keep-going ] [ --load-average LOAD            ]\n" +
                "          [ --newrepo   ] [ --newuse     ] [ --noconfmem  ] [ --nospinner   ]\n" +
                "          [ --oneshot   ] [ --onlydeps   ] [ --quiet-build [ y | n ]        ]\n" +
                "          [ --reinstall changed-use      ] [ --with-bdeps < y | n >         ]\n" +
                "Actions:  [ --depclean | --list-sets | --search | --sync | --version        ]\n" +
                "\n" +
                "   For more help consult the man page.");
        return true;
    }
}
