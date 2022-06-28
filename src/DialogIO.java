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
    public int readInt(String prompt, String round) {
        String input = JOptionPane.showInputDialog(null,prompt,round,JOptionPane.QUESTION_MESSAGE);
        return Integer.parseInt(input);
    }

    /**
     * Output the String parameter.
     *
     * @param outString the string whose value is to be displayed
     */
    @Override
    public void outputString(String outString) {
        ImageIcon icon = new ImageIcon("src/leo.jpg");
        JOptionPane.showMessageDialog(null,outString,null,JOptionPane.INFORMATION_MESSAGE,icon);
    }

    public static void main(String[] args){
    }
}
