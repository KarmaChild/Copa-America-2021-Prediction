//Name : Adithya Mattappily
//NSID : adm115
//Student # 11289810
//Course number : CMPT 270, 01


import javax.swing.*;

public class DialogIO extends AbstractDialogIO{
    /**
     * Display a prompt and read the string entered.
     *
     * @param prompt the string to be displayed as a prompt
     * @return the String read
     */
    @Override
    public String readString(String prompt) {
        String input = JOptionPane.showInputDialog(prompt);
        return input;
    }

    /**
     * Display a prompt and read the int entered.
     *
     * @param prompt the string to be displayed as a prompt
     * @return the int read
     */
    @Override
    public int readInt(String prompt) {
        String input = JOptionPane.showInputDialog(prompt);
        return Integer.parseInt(input);
    }

    /**
     * Output the String parameter.
     *
     * @param outString the string whose value is to be displayed
     */
    @Override
    public void outputString(String outString) {
        JOptionPane.showMessageDialog(null,outString);
    }

    public static void main(String[] args){
        DialogIO io = new DialogIO();
        io.readString("Enter your name: ");
        io.readInt("Enter your age: ");
        String[] val = {"1","2","3"};
        io.readChoice(val);
        io.outputString("Thank you!");
    }
}
