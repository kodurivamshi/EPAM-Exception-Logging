package InterestCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Epam.Exception_Logging.ClientMain;

public class CalculateInterest extends JFrame {
		JFrame window;
		JPanel panel;
		JTextField principalTextfield,rateTextfield,yearTextfield,interestTextfield;
		JButton simpleInterest,compoundInterest;
		//CalculateInterest interest=new CalculateInterest();
		Logger LOGGER = LogManager.getLogger(ClientMain.class); 
		
		public CalculateInterest() {
			
			LOGGER.info("Calculator window got created...");
			
			window=new JFrame("Simple & Compond Interest Calculator");
			this.addPanel();
			this.addTextfields();
			this.addButtons();
			
			
			
			window.getContentPane().add(panel);
			window.setSize(250, 250);
			window.setVisible(true);
		}
		private void addButtons() {
			simpleInterest=new JButton("SimpleInterest");
			panel.add(simpleInterest);
			
			final JTextField interestTextfield=new JTextField("Interest",15);
			interestTextfield.setFont(new Font("Verdana", Font.BOLD,12));
			
			simpleInterest.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					LOGGER.info("The SIMPLE INTEREST is calculated.....");
					
					String s=e.getActionCommand();
					double amount =Double.parseDouble(principalTextfield.getText());
					double rateOfInterest=Double.parseDouble(rateTextfield.getText());
					double years=Double.parseDouble(yearTextfield.getText());
					
					SimpleInterest si=new SimpleInterest(amount, rateOfInterest, years);
					
					
					double calculatedInterest=si.Simpleinterest();
					s=Double.toString(calculatedInterest);
					interestTextfield.setText(s);	
					
				}
			});
			
			
			compoundInterest=new JButton("CompoundInterest");
			compoundInterest.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					LOGGER.info("the COMPOUND INTEREST is...calculated.....");
					
					String s=e.getActionCommand();
					double amount =Double.parseDouble(principalTextfield.getText());
					double rateOfInterest=Double.parseDouble(rateTextfield.getText());
					double years=Double.parseDouble(yearTextfield.getText());
					
					CompoundInterest si=new CompoundInterest(amount, rateOfInterest, years);
					
					
					double calculatedInterest=si.Compoundinterest();
					s=Double.toString(calculatedInterest);
					interestTextfield.setText(s);	
				}
			});
			panel.add(compoundInterest);
			
			
			
			panel.add(interestTextfield);
			
		}
		private void addTextfields() {
			JLabel principal,rate,year;
			
			JLabel title=new JLabel("Simple & Compound Interest Calculator");
			title.setForeground(Color.blue);
			
			panel.add(title);
			
			LOGGER.info("Enter the Principal Amount or borrowed amount..");
			
			principal=new JLabel("Amount:");
			principalTextfield=new JTextField(10);
			panel.add(principal);
			panel.add(principalTextfield);
			
			LOGGER.info("Enter the Rate of Interest...");
			
			rate=new JLabel("Rate of Interest:");
			rateTextfield=new JTextField(10);
			panel.add(rate);
			panel.add(rateTextfield);
			
			LOGGER.info("Enter the number of years as a part of interest borrowed..");
			
			year=new JLabel("Years:");
			yearTextfield=new JTextField(10);
			panel.add(year);
			panel.add(yearTextfield);
			
			
			window.getContentPane().add(panel);
			
			/*interest=new JLabel("Interest");
			interestTextfield=new JTextField(10);
			panel.add(interest);
			panel.add(interestTextfield);*/
			
			
		}
		private void addPanel() {
			panel=new JPanel();
		}
		
		
}
