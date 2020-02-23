package HouseConstructionCostEstimator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Houseconstructioncostestimator {
	JFrame window;
	JPanel panel;
	JRadioButton option1,option2,option3,option4;
	JTextField areaTextfield;
	Logger LOGGER=LogManager.getLogger(Houseconstructioncostestimator.class);
	public Houseconstructioncostestimator() {
		LOGGER.info("House Construction Cost Estimator Window is Created..");
		window=new JFrame("House Construction Cost Estimator");
		
		panel=new JPanel();
		//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		this.addRadioButtons();
		this.addAreaTextField();
		this.addButton();
		
		window.getContentPane().add(panel);
		window.setSize(400, 400);
		window.setVisible(true);
	}
	
	private void addButton() {
		JButton costEstimator=new JButton("house cost estimator");
		final JTextField housecost=new JTextField("the house cost is",13);
		housecost.setFont(new Font("Verdana", Font.BOLD,15));
		
		
		costEstimator.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(option1.isSelected()) {
					LOGGER.info("Standard Materials is selected");
					LOGGER.info("House Construction Cost Estimation is DONE...");
					
					housecost.setText(Double.parseDouble(areaTextfield.getText())*1200+" INR");
				}
				if(option2.isSelected()) {
					LOGGER.info("Above Standard Materials is selected...");
					LOGGER.info("House Construction Cost Estimation is DONE...");
					
					housecost.setText(Double.parseDouble(areaTextfield.getText())*1500+" INR");
				}
				if(option3.isSelected()) {
					LOGGER.info("High standard Materials are selected...");
					LOGGER.info("House Construction Cost Estimation is DONE...");
					
					housecost.setText(Double.parseDouble(areaTextfield.getText())*1800+" INR");
				}
				if(option4.isSelected()) {
					LOGGER.info("High standard and Fully Automated House is selected...");
					LOGGER.info("House Construction Cost Estimation is DONE...");
					
					housecost.setText(Double.parseDouble(areaTextfield.getText())*2500+" INR");
				}
			}
		});
		
		panel.add(costEstimator);
		panel.add(housecost);
	}

	private void addAreaTextField() {
		LOGGER.info("Enter the area reqiured in (feets)..");
		JLabel area=new JLabel("enter the Area in (feets)..");
		area.setForeground(Color.red);
		panel.add(area);
		areaTextfield=new JTextField(10);
		//areaTextfield.setSize(10, 10);
		panel.add(areaTextfield);
	}

	private void addRadioButtons() {
		JLabel title=new JLabel("House Construction Cost Estimator");
		title.setFont(new Font("Verdana", Font.ROMAN_BASELINE, 18));
		title.setForeground(Color.blue);
		panel.add(title);
		
		JLabel statement=new JLabel("Select the Material required for construction..");
		statement.setForeground(Color.red);
		panel.add(statement);
		
		LOGGER.info("selection of Materials must be done....");
		option1=new JRadioButton("Standard Materials.");
		option2=new JRadioButton("Above Standard Materials.");
		option3=new JRadioButton("High Standard Materials.");
		option4=new JRadioButton("High Standard and Fully Automated House.");
		
		ButtonGroup radiobuttongroup=new ButtonGroup();
		radiobuttongroup.add(option1);
		radiobuttongroup.add(option2);
		radiobuttongroup.add(option3);
		radiobuttongroup.add(option4);
		
		panel.add(option1);
		panel.add(option2);
		panel.add(option3);
		panel.add(option4);
	}
}
