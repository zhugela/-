package org.example;

import sun.util.resources.de.CalendarData_de;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

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
          new TIcketBooker(user);
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
     private JTable resulttable = null;
     public TIcketBooker(User user){
          this.setTitle("车票预订");
          this.setLocation(400,300);
          this.setSize(400,600);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setLayout(null);
          //设置布局，页面分为上中下
          JPanel upper = new JPanel();
          JPanel middle = new JPanel();
          JPanel bottom = new JPanel();
          upper.setLocation(0,0);
          upper.setSize(400,100);
          middle.setLocation(0,100);
          middle.setSize(400,400);
          bottom.setLocation(0,500);
          bottom.setSize(400,50);
          //在顶部面板添加元素
          upper.setLayout(new FlowLayout());
          upper.add(new JLabel("路线"));
          JCB_Starting.setToolTipText("起点");
          upper.add(JCB_Starting);
          JCB_Ending.setToolTipText("终点");
          upper.add(JCB_Ending);
          JCB_Year.setToolTipText("年");
          upper.add(JCB_Year);
          JCB_Month.setToolTipText("月");
          upper.add(JCB_Month);
          JCB_Day.setToolTipText("日");
          upper.add(JCB_Day);

          Calendar calendar = Calendar.getInstance();
          Date date = calendar.getTime();

// 获取当前年份并计算索引
          int currentYear = date.getYear() + 1900; // 获取实际年份
          int yearIndex = currentYear - Integer.parseInt(arrayYear[0]); // 计算选中索引

// 检查年份索引的有效性
          if (yearIndex >= 0 && yearIndex < arrayYear.length) {
               JCB_Year.setSelectedIndex(yearIndex); // 设置年份索引
          } else {
               JCB_Year.setSelectedIndex(0); // 默认选中第一个
          }

// 获取并设置月份索引
          int monthIndex = date.getMonth(); // 0-11
          if (monthIndex >= 0 && monthIndex < arrayMonth.length) {
               JCB_Month.setSelectedIndex(monthIndex);
          } else {
               JCB_Month.setSelectedIndex(0); // 默认选中第一个
          }

// 获取并设置日期索引
          int dayIndex = date.getDate() - 1; // 1-31 转换为 0-30
          if (dayIndex >= 0 && dayIndex < arrayDay.length) {
               JCB_Day.setSelectedIndex(dayIndex);
          } else {
               JCB_Day.setSelectedIndex(0); // 默认选中第一个
          }

          upper.add(new JLabel());
          upper.add(buttonSearch);
          this.add(upper);

          middle.setLayout(new BorderLayout());
          createResultTable();
          JScrollPane scroll = new JScrollPane(resulttable);
          middle.add(scroll);
          this.add(middle);

          bottom.setLayout(new BorderLayout());
          bottom.add(buttonBook, BorderLayout.CENTER);
          this.add(bottom);

          this.setVisible(true);
     }

     private void createResultTable() {
               Object[][] data = {};
              String[] name = {"时间","票价","剩余票数"};
               resulttable = new JTable(data,name);
          }
     }



