package facfib;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.lang.*;
import java.io.*;
import static java.lang.Integer.parseInt;
/**
 *
 * @author USUARIO
 * @version 1.0
 */
public class Pantalla extends JFrame implements ActionListener{
    
    JButton calc;
    JTextField num, facFi, fibFi;
    JLabel nu, fa, fi;
    
    public Pantalla(){
        //pantalla
        setLayout(null);
        setBounds(200, 200, 300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Numero
        nu = new JLabel("Numero");
        nu.setBounds(10, 10, 80, 20);
        add(nu);
        
        //Campo del numero
        num = new JTextField();
        num.setBounds(100, 10, 50, 20);
        add(num);
                
        //Boton para calcular
        calc = new JButton("Calcular");
        calc.setBounds(160, 10, 100, 20);
        add(calc);

        //Factorial
        fa = new JLabel("Factorial");
        fa.setBounds(10, 40, 60, 20);
        add(fa);

        //Campo para desplegar la factorial
        facFi = new JTextField();
        facFi.setBounds(80, 40, 200, 20);
        add(facFi);

        //Fibonacci
        fi = new JLabel("Fibonacci");
        fi.setBounds(10, 70, 60, 20);
        add(fi);

        //Campos para desplegar la serie de Fibonacci
        fibFi = new JTextField();
        fibFi.setBounds(80, 70, 200, 20);
        add(fibFi);

        setVisible(true);
    }

    /**
    *
    * @param ActionEvent se concentran las acciones que se realizan con botones
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
        *
        * @param num el numero introducido en el campo de texto
        */
        int numero = parseInt(num.getText());
        
        if(e.getSource() == calc){
            System.out.println(numero);
            int factorial=1, suma, ant=0, act=1;
            String facCad="", fibCad="0, 1";

            //Factorial
            for(int i = numero; i > 0; --i){
                factorial = factorial * i;
                facCad = facCad + " x " + i;
            }

            //Fibonacci
            for(int c = 1; c < numero - 1; ++c){
                suma = ant + act;
                ant = act;
                act = suma;
                fibCad = fibCad + ", " + suma;
            }

            System.out.println("Factorial: " + facCad + " = " + factorial);
            System.out.print("Fibonacci: " + fibCad);

            facFi.setText(facCad + " = " + factorial);
            fibFi.setText(fibCad);
        }
    }
}
