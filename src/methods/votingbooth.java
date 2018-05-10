package methods;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null,"Are you over 18?");
if(answer.equals("Yes")) {
JOptionPane.showMessageDialog(null,"Who the next president should be?");
}
else {
JOptionPane.showMessageDialog(null,"Noboy cares what you said, kids.");
}
}
}

