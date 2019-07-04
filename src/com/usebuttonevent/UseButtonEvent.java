package com.usebuttonevent;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UseButtonEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("理解事件");
		frm.setLayout(new BorderLayout());
		
		//创建按钮对象和注册监听器进行授权，参数为（事件处理者，有时也称为监听器）对象
		JButton btn = new JButton("请单击本按钮");
		frm.getContentPane().add(btn);
		ButtonHandler btnHandler = new ButtonHandler();
		btn.addActionListener(btnHandler);	//与单击事件相关的授权处理方法，参数为事件处理者对象
		
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
