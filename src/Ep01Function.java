import javax.swing.*;

/**
 * Created by isl0m13
 * valyuta hajmlari  - 28.04.2023 sanasi bilan belgilangan */

public class Ep01Function {

    public boolean check(String Minput){
        try{
            double x = Double.parseDouble(Minput);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public void dollarToUzs(double Minput){
        double uzs = Minput * 11.390;
        JOptionPane.showMessageDialog(null, "UZS Hajmi: "+uzs+" sum");
    }

    public void dollarToEur(double Minput){
        double EUR = Minput * 0.89;
        JOptionPane.showMessageDialog(null, "EUR Hajmi: "+EUR+" eur");
    }

    public void dollarToRub(double Minput){
        double RUB = Minput * 80.45;
        JOptionPane.showMessageDialog(null, "RUB Hajmi: "+RUB+" rub");
    }
    public void dollarToNok(double Minput){
        double nok = Minput * 1338.16;
        JOptionPane.showMessageDialog(null, "KRW Hajmi: "+nok+" won");
    }

    public void dollarToJPY(double Minput){
        double JPY = Minput * 136.30;
        JOptionPane.showMessageDialog(null, "JPY Hajmi: "+JPY+" Yen");
    }

}
