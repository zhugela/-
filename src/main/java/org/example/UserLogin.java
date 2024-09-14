package org.example;

import javax.swing.*;
import java.awt.*;

public class UserLogin extends JFrame {
    //创建文本输入框
    private JTextField filedAccount = new JTextField();
    //隐藏用户输入的密码信息
    private JPasswordField fieldPassword = new JPasswordField();
    private JButton ButtonLogin = new JButton("登 陆");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UserLogin::new);
    }
    public UserLogin(){
        //用户登录主界面
        this.setTitle("用户登录");
        this.setLocation(400,300);
        this.setSize(400,300);
         //设置关闭程序是点x号，程序会停止运行
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗口不可调整大小
        this.setResizable(true);
        // 设置布局管理器为 null，手动控制组件位置
        this.setLayout(null);
        //用于显示文本“账 号”，表示账号输入框的提示
        JLabel labelAccount = new JLabel("账 号");

        labelAccount.setBounds(50,50,100,30);
        filedAccount.setBounds(150,50,150,30);
        //将文本框添加到面板上去
        this.getContentPane().add(labelAccount);
        this.getContentPane().add(filedAccount);
        //用于显示文本“密码”，表示账号输入框的提示
        JLabel labelPwd= new JLabel("密  码");
        labelPwd.setBounds(50,100,100,30);
        fieldPassword.setBounds(150,100,150,30);
        //将文本框添加到面板上去
        this.getContentPane().add(labelPwd);
        this.getContentPane().add(fieldPassword);
        //登录按钮
        ButtonLogin.setBounds(125,180,150,30);
        this.getContentPane().add(ButtonLogin);
        //zhuc
        this.setVisible(true);
    }
}
