package com.usebuttonevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//实现单击事件监听器接口，称为单击事件ActionEvent的处理者
class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("发生了单击事件");
	}
}
