import javax.swing.*;
import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.lang.module.ResolutionException;  
class GUICL {

    public static void main(String args[]){
        //setup pannel
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        //boxlayout
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));    
         

        //textfield define
        JTextField t1,t2,t3;  
        t1=new JTextField("num1");  
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("operator");  
        t2.setBounds(50,150, 200,30);   
        t3=new JTextField("num2");  
        t3.setBounds(50,150, 200,30);   
        //button define
        JButton jb1 = new JButton("=");
        JLabel label = new JLabel(":", JLabel.CENTER);
        //add ele to frame
        panel.add(label);
        panel.add(t1);
        panel.add(t2);
        panel.add(t3);
        panel.add(jb1);
      
        //textfields action listener
        t1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String n1 = t1.getText();
                System.out.println("number 1 is : " + n1);
            }
        });
        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String operator = t2.getText();
                System.out.println("operator is: " + operator);
            }
        });
        t3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String n2 = t3.getText();
                System.out.println("number 2 is : " + n2);
            }
        });        
        jb1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    System.out.println("Calculating...");
                    String operator = t2.getText();
                    String n1 = t1.getText();
                    String n2 = t3.getText();
                    System.out.println(operator);
                    if(operator.equals("+")){
                        try{
                            int int1 = Integer.parseInt(n1);
                            int int2 = Integer.parseInt(n2);
                            int resp = int1 + int2;
                            System.out.println("="+resp);
                            String response=String.valueOf(resp);
                            label.setText(":" + response);
;
                        }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: one of the two number is not an integer");
                        }
                        
                    }
                    if(operator.equals("-")){
                        try{
                            int int1 = Integer.parseInt(n1);
                            int int2 = Integer.parseInt(n2);
                            int resp = int1 - int2;
                            System.out.println("="+resp);
                            String response2=String.valueOf(resp);
                            label.setText(":" + response2);
                        }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: one of the two number is not an integer");
                        }
                    }                    
                    if(operator.equals("*")){
                        try{
                            int int1 = Integer.parseInt(n1);
                            int int2 = Integer.parseInt(n2);
                            int resp = int1 * int2;
                            System.out.println("="+resp);
                            String response3=String.valueOf(resp);
                            label.setText(":" + response3);
                        }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: one of the two number is not an integer");
                        }
                    }
                    if(operator.equals("/")){
                        try{
                            int int1 = Integer.parseInt(n1);
                            int int2 = Integer.parseInt(n2);
                            int resp = int1 / int2;
                            System.out.println("="+resp);
                            String response4=String.valueOf(resp);
                            label.setText(":" + response4);
                        }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: one of the two number is not an integer");
                        }
                    }
                    if(operator.equals("^")){
                        try{
                            int int1 = Integer.parseInt(n1);
                            int int2 = Integer.parseInt(n2);
                            //int resp = int1 ** 2;
                            double resp = Math.pow(int1, int2);
                            String response5=String.valueOf(resp);
                            System.out.println("="+resp);
                            label.setText(":" + response5);
                        }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: one of the two number is not an integer");
                        }
                    }
                    if(operator.equals("#")){
                        try{
                            int int1 = Integer.parseInt(n1);
                        // int int2 = Integer.parseInt(n2);
                            //int resp = int1 ** 2;
                        
                            double resp = Math.sqrt(int1);
                            String response6=String.valueOf(resp);
                            System.out.println("="+resp);
                            label.setText(":" + response6);
                        }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: Your first number is not an Integer");
                        }
                    }
                    if(operator.equals("!")){
                        try{
                            int int1 = Integer.parseInt(n1);
                            int i,fact=1;
                            int number=int1;// notre nombre pour faire les calculs nécessaires dans la classe Factorial
                            for(i=1;i<=number;i++){
                                fact=fact*i;
                            }
                            System.out.println("="+fact);
                            String response7=String.valueOf(fact);
                            label.setText(":" + response7);
                            }
                        catch (NumberFormatException ex){
                            System.out.println("ERROR: Your first number is not an Integer");
                        }
                        
                    }
                }  
            });
        
        //frame.show()
        frame.add(panel);
        frame.pack();
        frame.setVisible(true); 
        System.out.println(t1.getText());
        }
    


}
























/*        JFrame f=new JFrame("Button Example");  
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(4,2); // 4 rows, 2 columns
        panel.setLayout(gl);
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);  
        final JTextField tf2=new JTextField();
        tf.setBounds(100,50, 200,20); 



        JButton b=new JButton("Equal");  
        b.setBounds(50,100,95,30);  
        b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
                //tf.setText("Welcome to Javatpoint.");  
            }  
        });  
        f.add(b);f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
        } */