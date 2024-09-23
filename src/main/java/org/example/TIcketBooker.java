package org.example;

import javax.swing.*;

public class TIcketBooker extends JFrame {
     private static final long serialVersionUID = 123456789;

     public TIcketBooker() {
          JPanel upper = new JPanel();
          JPanel middle = new JPanel();
          JPanel bottom = new JPanel();

     }

     public static void main(String[] args) {
          User user = new User();
          user.setId(1001);
          user.setName("user");
          user.setStuNum("1001");
          new TIcketBooker();
     }

     private Ticket ticket = new Ticket();
     private static final String arrayStarting[] = {"中大", "南方学院"};
     private JComboBox JCB_Starting = new JComboBox(arrayStarting);
     private JComboBox JCB_Ending = new JComboBox(arrayStarting);
     private static final String arrayYear[] = {"2014", "2015", "2016"};
     private static final String  arrayMonth[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
     public static final String arrayDay[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17," +
             "18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
     private JComboBox JCB_Year = new JComboBox(arrayYear);
     private JComboBox JCB_Month = new JComboBox(arrayMonth);
     private JComboBox JCB_Day = new JComboBox(arrayDay);
     private JButton buttonSearch = new JButton("查询");
     private JButton buttonBook = new JButton("预订");
     private JTable result

}
