package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumber {
public static void main(String[] args) {

String number = "";
for(int i=0;i<6;i++) {
	Random gen = new Random();	
	int r = gen.nextInt(100);
	number+=r+", ";
}
JOptionPane.showMessageDialog(null,number);

}
}
