import javax.swing.*;
import java.awt.event.*;
public class Puzzle extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,next;
    String name;
    Puzzle(){
      super("Puzzle Game");
      name=JOptionPane.showInputDialog(this,"Enter the name");
      b1=new JButton("1");
      b2=new JButton("2");
      b3=new JButton("3");
      b4=new JButton("4");
      b5=new JButton("5");
      b6=new JButton("6");
      b7=new JButton("7");
      b8=new JButton("8");
      b9=new JButton("9");
      b10=new JButton("10");
      b11=new JButton("11");
      b12=new JButton("12");
      b13=new JButton("13");
      b14=new JButton("14");
      b15=new JButton(" ");
      b16=new JButton("15");
      next=new JButton("next");
      b1.setBounds(10,30,100,100);
      b2.setBounds(120,30,100,100);
      b3.setBounds(230,30,100,100);
      b4.setBounds(340,30,100,100);
      b5.setBounds(10,140,100,100);
      b6.setBounds(120,140,100,100);
      b7.setBounds(230,140,100,100);
      b8.setBounds(340,140,100,100);
      b9.setBounds(10,250,100,100);
      b10.setBounds(120, 250, 100, 100);
      b11.setBounds(230, 250, 100, 100);
      b12.setBounds(340, 250, 100, 100);
      b13.setBounds(10, 360, 100, 100);
      b14.setBounds(120, 360, 100, 100);
      b15.setBounds(230, 360, 100, 100);
      b16.setBounds(340, 360, 100, 100);
      next.setBounds(150,500,150,50);
      add(b1);add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8); add(b9); add(next);
      add(b10);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this); 
      b9.addActionListener(this);
      b10.addActionListener(this);
      b11.addActionListener(this);
      b12.addActionListener(this);
      b13.addActionListener(this);
      b14.addActionListener(this);
      b15.addActionListener(this);
      b16.addActionListener(this);
      next.addActionListener(this);
      
      setLayout(null);
      setVisible(true);
      setSize(475,600);
      setLocation(100,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
    String s = b1.getText();
    if(b2.getText().equals(" ")){
    b2.setText(s);
    b1.setText(" ");
 }
    else if(b5.getText().equals(" ")){
    b1.setText(" ");
    b5.setText(s);
}   
}
if(e.getSource()==b2){
    String s= b2.getText();
    if(b1.getText().equals(" ")){
      b1.setText(s);
      b2.setText(" ");
    }
    else if (b3.getText().equals(" ")){
      b3.setText(s);
      b2.setText(" ");
    }
    else if(b5.getText().equals(" ")){
      b6.setText(s);
      b2.setText(" ");
    }
}
if(e.getSource()==b3){
    String s=b3.getText();
    if(b2.getText().equals(" "))
    {
       b2.setText(s);
       b3.setText(" ");
    }
    else if(b4.getText().equals(" "))
    {
      b4.setText(s);
      b3.setText(" ");
    }
    else if(b7.getText().equals(" "))
    {
      b7.setText(s);
      b3.setText(" ");
    }
    
}
if(e.getSource()==b4){
    String s=b4.getText();
    if(b3.getText().equals(" "))
    {
       b3.setText(s);
       b4.setText(" ");
    }
    else if(b8.getText().equals(" "))
    {
        b8.setText(s);
        b4.setText(" ");
    }   
}
if(e.getSource()==b5){
    String s=b5.getText();
    if(b1.getText().equals(" ")){
      b1.setText(s);
      b5.setText(" ");
    }
    else if(b6.getText().equals(" ")){
      b6.setText(s);
      b5.setText(" ");
    }
     else if(b9.getText().equals(" ")){
      b9.setText(s);
      b5.setText(" ");
    }
    
}
if(e.getSource()==b6){
    String s=b6.getText();
    if(b2.getText().equals(" ")){
      b2.setText(s);
      b6.setText(" ");
    }
    else if(b5.getText().equals(" ")){
      b5.setText(s);
      b6.setText(" ");
    }
    else if(b7.getText().equals(" ")){
      b7.setText(s);
      b6.setText(" ");
    }
    else if(b10.getText().equals(" ")){
      b10.setText(s);
      b6.setText(" ");
    }    
}
if(e.getSource()==b7){
    String s=b7.getText();
    if(b3.getText().equals(" ")){
      b3.setText(s);
      b7.setText(" ");
    }
    else if(b6.getText().equals(" ")){
      b6.setText(s);
      b7.setText(" ");
    }
    else if(b8.getText().equals(" ")){
      b8.setText(s);
      b7.setText(" ");
    }
    else if(b11.getText().equals(" ")){
      b11.setText(s);
      b7.setText(" ");
    }
    
}
if(e.getSource()==b8){
    String s=b8.getText();
    if(b4.getText().equals(" ")){
      b4.setText(s);
      b8.setText(" ");
    }
    else if(b7.getText().equals(" ")){
      b7.setText(s);
      b8.setText(" ");
    }
    else if(b12.getText().equals(" ")){
      b12.setText(s);
      b8.setText(" ");
    }   
}
if(e.getSource()==b9){
    String s=b9.getText();
    if(b5.getText().equals(" ")){
      b5.setText(s);
      b9.setText(" ");
    }
    else if(b10.getText().equals(" ")){
      b10.setText(s);
      b9.setText(" ");
    }
    else if(b13.getText().equals(" ")){
      b13.setText(s);
      b9.setText(" ");
    }
}
if(e.getSource()==b10){
    String s=b10.getText();
    if(b6.getText().equals(" ")){
      b6.setText(s);
      b10.setText(" ");
    }
   else if(b9.getText().equals(" ")){
      b9.setText(s);
      b10.setText(" ");
    }
     else if(b11.getText().equals(" ")){
      b11.setText(s);
      b10.setText(" ");
    }
     else if(b14.getText().equals(" ")){
      b14.setText(s);
      b10.setText(" ");
    }
}
if(e.getSource()==b11){
    String s=b11.getText();
    if(b7.getText().equals(" ")){
      b7.setText(s);
      b11.setText(" ");
    }
    else if(b10.getText().equals(" ")){
      b10.setText(s);
      b11.setText(" ");
    }
     else if(b11.getText().equals(" ")){
      b12.setText(s);
      b11.setText(" ");
    }
     else if(b15.getText().equals(" ")){
      b15.setText(s);
      b11.setText(" ");
    }
    else if(b12.getText().equals(" ")){
      b12.setText(s);
      b11.setText(" ");
    }
}
if(e.getSource()==b12){
    String s=b12.getText();
    if(b8.getText().equals(" ")){
      b8.setText(s);
      b12.setText(" ");
    }
    else if(b11.getText().equals(" ")){
      b11.setText(s);
      b12.setText(" ");
    }
    else if(b16.getText().equals(" ")){
      b16.setText(s);
      b12.setText(" ");
    }
}
if(e.getSource()==b13){
    String s=b13.getText();
    if(b9.getText().equals(" ")){
      b9.setText(s);
      b13.setText(" ");
    }
    else if(b14.getText().equals(" ")){
      b14.setText(s);
      b13.setText(" ");
    }
}
if(e.getSource()==b14){
    String s=b14.getText();
    if(b10.getText().equals(" ")){
      b10.setText(s);
      b14.setText(" ");
    }
    else if(b13.getText().equals(" ")){
      b13.setText(s);
      b14.setText(" ");
    }
    else if(b15.getText().equals(" ")){
      b15.setText(s);
      b14.setText(" ");
    }
}
if(e.getSource()==b15){
    String s=b15.getText();
    if(b11.getText().equals(" ")){
      b11.setText(s);
      b15.setText(" ");
    }
    else if(b14.getText().equals(" ")){
      b14.setText(s);
      b15.setText(" ");
    }
    else if(b16.getText().equals(" ")){
      b16.setText(s);
      b15.setText(" ");
    }
}
if(e.getSource()==b16){
    String s=b16.getText();
    if(b12.getText().equals(" ")){
      b12.setText(s);
      b16.setText(" ");
    }
    else if(b15.getText().equals(" ")){
      b15.setText(s);
      b16.setText(" ");
    }
      if(b1.getText().equals("1")&&b2.getText().equals("2")&&
            b3.getText().equals("3")&&b4.getText().equals("4")&&
            b5.getText().equals("5")&&b6.getText().equals("6")&&
            b7.getText().equals("7")&&b8.getText().equals("8")&&
            b9.getText().equals("9")&&b10.getText().equals("10")&&
             b11.getText().equals("11")&&b12.getText().equals("12")&&
             b13.getText().equals("13")&&b14.getText().equals("14")&&
             b15.getText().equals("15")&&b16.getText().equals(" "))
    {
      JOptionPane.showMessageDialog(this, name+"  !!!You won the game");  
    }   
}
if(e.getSource()==next){
    String s1=b1.getText();
    b1.setText(b5.getText());
    b5.setText(s1);
    String s2=b4.getText();
    b4.setText(b9.getText());
    b9.setText(s2);
    String s3=b2.getText();
    b2.setText(b7.getText());
    b7.setText(s3);
    String s4=b3.getText();
    b3.setText(b4.getText());
    b4.setText(s4);
    String s5=b8.getText();
    b8.setText(b12.getText());
    b12.setText(s5);
    String s6=b14.getText();
    b14.setText(b10.getText());
    b14.setText(s6);
    String s7=b13.getText();
    b13.setText(b15.getText());
    b13.setText(s7);
    String s8=b10.getText();
    b10.setText(b15.getText());
    b15.setText(s8);
    String s9=b7.getText();
    b7.setText(b15.getText());
    b15.setText(s9);
    String s10=b5.getText();
    b5.setText(b11.getText());
    b11.setText(s10);
    String s11=b3.getText();
    b3.setText(b16.getText());
    b16.setText(s11);
    }
}
         public static void main(String[] args) {
      new Puzzle();
    }
    
}
