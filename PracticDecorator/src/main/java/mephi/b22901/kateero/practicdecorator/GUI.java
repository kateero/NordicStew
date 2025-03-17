package mephi.b22901.kateero.practicdecorator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI {

    private int selectedCount = 0; // Счетчик выбранных чекбоксов

    public void run() {
        // Создание нового окна
        JFrame frame = new JFrame("Приём заказа");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 1));

        JCheckBox checkBox1 = new JCheckBox("Огненный соус");
        JCheckBox checkBox2 = new JCheckBox("Двойная порция оленины");
        JCheckBox checkBox3 = new JCheckBox("Снежные ягоды");
        JCheckBox checkBox4 = new JCheckBox("Нордская лепешка");

        JButton button = new JButton("Заказать");
 
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox source = (JCheckBox) e.getSource();
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (selectedCount == 3) {
                        source.setSelected(false);
                        JOptionPane.showMessageDialog(frame, "Вы можете выбрать не более трех опций.", "Предупреждение", JOptionPane.WARNING_MESSAGE);
                    } else {
                        selectedCount++;
                    }
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    selectedCount--;
                }
            }
        };

        checkBox1.addItemListener(itemListener);
        checkBox2.addItemListener(itemListener);
        checkBox3.addItemListener(itemListener);
        checkBox4.addItemListener(itemListener);

        
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(checkBox4);
        frame.add(button);

        frame.setVisible(true);
    }
}
