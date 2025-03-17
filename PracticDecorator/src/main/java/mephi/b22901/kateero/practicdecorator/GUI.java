package mephi.b22901.kateero.practicdecorator;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;



public class GUI {

public void run(){
        // Создание нового окна
        JFrame frame = new JFrame("Приём заказа");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5,1));

        // Создание чекбоксов
        JCheckBox checkBox1 = new JCheckBox("Огненный соус");
        JCheckBox checkBox2 = new JCheckBox("Двойная порция оленины");
        JCheckBox checkBox3 = new JCheckBox("Снежные ягоды");
        JCheckBox checkBox4 = new JCheckBox("Нордская лепешка");

      
        JButton button = new JButton("Заказать");
        
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                
//                StringBuilder selectedOptions = new StringBuilder("Выберите добавки: ");
//                
//                if (checkBox1.isSelected()) selectedOptions.append("Огненный соус");
//                if (checkBox2.isSelected()) selectedOptions.append("Двойная порция оленины");
//                if (checkBox3.isSelected()) selectedOptions.append("Снежные ягоды");
//                if (checkBox4.isSelected()) selectedOptions.append("Нордская лепешка");
//                
//            }
//        });

        frame.add(button);
 
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);

        frame.setVisible(true);
    }

}
