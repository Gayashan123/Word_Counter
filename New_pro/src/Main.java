import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[]args){

        JFrame jFrame = new JFrame("Word Counter");
        jFrame.setLayout(null);
        jFrame.setBounds(200,200,500,500);
        jFrame.setVisible(true);

        JTextArea textarea = new JTextArea();
        textarea.setBounds(50,50,300,200);

       JButton jButton = new JButton("C  H E C K ");
       jButton.setBounds(180,300,100,30);

       jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               // 1 - Get the text from the text atrea

               String text = textarea.getText();

               //2 / Spliting up the string and storing word into

               if(!text.equals("")){
                   String[] word = text.split("\\s");

                   //3 - Display the results of the words
                   JOptionPane.showMessageDialog(jFrame,"Total words:"+word.length);
               }
           }
       });


      jFrame.add(textarea);
      jFrame.add(jButton);

    }


}