import javax.swing.JOptionPane;

public class CodeQuiz1 {

public static void main(String[] args) {
String codequiz=JOptionPane.showInputDialog("Enter a word");
	String codequiz1=JOptionPane.showInputDialog("Enter a number?");
	int Codequiz=Integer.parseInt(codequiz1);	
	for(int i=0;i<Codequiz;i++){
		if(i% Codequiz==0){
	System.out.println(i);
		}
			System.out.println(codequiz);
			

}	
}                         
}                                    