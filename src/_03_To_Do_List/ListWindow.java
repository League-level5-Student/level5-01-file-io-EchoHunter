package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListWindow implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addTask = new JButton();
JButton viewTask = new JButton();
JButton removeTask = new JButton();
JButton saveList = new JButton();
JButton loadList = new JButton();

public void run() {
	panel.add(addTask);
	panel.add(viewTask);
	panel.add(removeTask);
	panel.add(saveList);
	panel.add(loadList);
	frame.add(panel);
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
	
}
}
