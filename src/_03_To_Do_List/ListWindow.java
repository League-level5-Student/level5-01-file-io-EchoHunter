package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ListWindow implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addTask = new JButton();
JButton viewTask = new JButton();
JButton removeTask = new JButton();
JButton saveList = new JButton();
JButton loadList = new JButton();
ArrayList<String> list;

public void run() {
	panel.add(addTask);
	panel.add(viewTask);
	panel.add(removeTask);
	panel.add(saveList);
	panel.add(loadList);
	frame.add(panel);
	list = new ArrayList<String>();
	addTask.setText("Add Task");
	viewTask.setText("View Task");
	removeTask.setText("Remove Task");
	saveList.setText("Save List");
	loadList.setText("Load List");
	addTask.addActionListener(this);
	viewTask.addActionListener(this);
	removeTask.addActionListener(this);
	saveList.addActionListener(this);
	loadList.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String input = "";
	if(arg0.getSource() == addTask) {
		input = JOptionPane.showInputDialog("Input what task to add");
		list.add(input);
		JOptionPane.showMessageDialog(null, "Task Added");
	}else if(arg0.getSource() == viewTask) {
		JOptionPane.showMessageDialog(null, "Task List: " + list);
	}else if(arg0.getSource() == removeTask) {
		input = JOptionPane.showInputDialog("Which task would you like to remove?: " + list);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(input)) {
				list.remove(i);
			}
		}
		JOptionPane.showMessageDialog(null, "Task Removed");
	}else if(arg0.getSource() == saveList) {
		try {
			FileWriter wr = new FileWriter("/Level5-Module1/src/_03_To_Do_List/saveText",true);
			wr.append("/n" + list);
		}catch(Exception e){
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "List Saved");
	}else if(arg0.getSource() == loadList) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Level5-Module1/src/_03_To_Do_List/saveText"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "List Loaded");
	}
}
}
