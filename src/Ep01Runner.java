import javax.swing.*;

/**
 * Created by Isl0m13
 * valyuta hajmlari  - 28.04.2023 sanasi bilan belgilangan */

public class Ep01Runner {
    public static void main(String[] args) {
        Ep01Function f = new Ep01Function();
        Object[] option1 = {"UZS","EUR","RUB", "KRW", "YEN", "Chiqish"};
        Object[] option2 = {"Qaytadan", "Chiqish"};

        while(true){
            String input = JOptionPane.showInputDialog("Iltimos valyuta hajmini kiriting",null );
            System.out.println(input);

            if(f.check(input) == true){
                double Minput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Qaysi valyuta ayirboshlashni hohlaysiz", "Valyuta konvertori",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                if(choice1 ==0){
                    f.dollarToUzs(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "Nima qilishdi hohlaysiz?", "Valyuta konvertori",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){

                    } else { break; }
                }else if(choice1 == 1){
                    f.dollarToEur(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "Nima qilishdi hohlaysiz?", "Valyuta konvertori",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){

                    } else { break; }
                }else if(choice1 == 2){
                    f.dollarToRub(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "Nima qilishdi hohlaysiz?", "Valyuta konvertori",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);


                    if(choice2 == 0){

                    } else { break; }
                }else if(choice1 == 3){
                    f.dollarToNok(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "Nima qilishdi hohlaysiz?", "Valyuta konvertori",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){

                    } else { break; }
                } else if (choice1 == 4) {
                    f.dollarToJPY(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "Nima qilishdi hohlaysiz?", "Valyuta konvertori",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){

                    } else { break; }
                }else {break;}

            }
            else{
                JOptionPane.showMessageDialog(null, "Hato");
            }
        }
    }
}
