import com.fuzzytech.ftrun.FtrunInstantiationException;

public class Main {
    public static void main(String[] args) throws FtrunInstantiationException {

        // args[0] => crcl
        // args[1] => ibw
        // args[2] => drugInteractivity
        // output => dose
        DIGOXIN digoxin = new DIGOXIN();

        double crcl = Double.parseDouble(args[0]);
        double ibw = Double.parseDouble(args[1]);
        double drugInteractivity = Double.parseDouble(args[2]);

        digoxin.setcrcl(crcl);
        digoxin.setideal_kilo(ibw);
        digoxin.setilac_etkilesimi(drugInteractivity);

        // Expected to give an output between -30 and 30 kW.
        //System.out.println(crane.getPower());
        System.out.println(digoxin.getdigoxin_doz());
    }
}
