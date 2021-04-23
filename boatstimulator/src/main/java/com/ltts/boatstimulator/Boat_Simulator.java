package com.ltts.boatstimulator;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;

import org.aspectj.apache.bcel.classfile.Module.Open;

import com.ltts.model.BoatEssentials;
import com.ltts.model.BoatLocation;

import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Boat_Simulator extends JFrame {

	private JPanel loc;
	private JPanel showspeed;;
	private JLabel lblNewLabel_1;
	private JTextField HULL_ID;
	private JTextField IMEI;
	private JTextField LOG;
	private JTextField LAT;
	private JLabel img; 
	private JTextField bloc;
	private JCheckBox opencbx;
	private JCheckBox closecbx;
	
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boat_Simulator frame = new Boat_Simulator();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	 int hull_id;
	 int imei;
	
	public Boat_Simulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 543);
		loc = new JPanel();
		loc.setBackground(new Color(135, 206, 250));
		loc.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(loc);
		loc.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Connected Boat Simulator");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(206, 30, 284, 38);
		loc.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Boat HULL ID -");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setBounds(42, 116, 130, 25);
		loc.add(lblNewLabel_1);
		
		HULL_ID = new JTextField();
		HULL_ID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  hull_id=Integer.parseInt(HULL_ID.getText());
				 //System.out.println("Boat HULL ID - "+hull_id);
			}
		});
		HULL_ID.setBounds(182, 121, 149, 19);
		loc.add(HULL_ID);
		HULL_ID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Boat IMEI No - ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(375, 116, 159, 25);
		loc.add(lblNewLabel_2);
		
		IMEI = new JTextField();
		IMEI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 imei=Integer.parseInt(IMEI.getText());
				 
			}
		});
		IMEI.setBounds(544, 121, 149, 19);
		loc.add(IMEI);
		IMEI.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 216, 652, 12);
		loc.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(42, 404, 652, 19);
		loc.add(separator_1);
		
		JButton Start_boat = new JButton("Start Boat");
		Start_boat.setBackground(new Color(127, 255, 0));
		Start_boat.setFont(new Font("Arial Black", Font.BOLD, 17));
		Start_boat.setBounds(76, 433, 159, 38);
		loc.add(Start_boat);
		
		JButton stop_boat = new JButton("Stop Boat");
		stop_boat.setFont(new Font("Arial Black", Font.BOLD, 17));
		stop_boat.setBackground(new Color(255, 69, 0));
		stop_boat.setBounds(286, 433, 159, 38);
		loc.add(stop_boat);
		
		JLabel lblNewLabel_1_1 = new JLabel("Boat Speed -");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(42, 340, 130, 25);
		loc.add(lblNewLabel_1_1);
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				float speed=slider.getValue();
				
				// showspeed.setText("Value : " + ((JSpinner)e.getSource()).getValue());
			}
		});
		slider.setValue(0);
		slider.setPaintLabels(true);
		slider.setBounds(155, 340, 485, 54);
		loc.add(slider);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Boat Temperature -");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(375, 237, 174, 25);
		loc.add(lblNewLabel_1_1_1);
		
		JSpinner TEMP = new JSpinner();
		TEMP.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				
			}
		});
		TEMP.setBounds(554, 242, 66, 20);
		loc.add(TEMP);
		
		JLabel lblNewLabel_1_2 = new JLabel("Boat Door - ");
		lblNewLabel_1_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(42, 293, 130, 25);
		loc.add(lblNewLabel_1_2);
		
		 opencbx = new JCheckBox("Open");
		 opencbx.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(opencbx.isSelected())
		 		{
		 			closecbx.setSelected(false);
		 		}
		 	}
		 });
		opencbx.setBounds(155, 297, 93, 21);
		loc.add(opencbx);
		
		 closecbx = new JCheckBox("Closed");
		 closecbx.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(closecbx.isSelected())
		 		{
		 			opencbx.setSelected(false);
		 		}
		 	}
		 });
		closecbx.setBounds(264, 297, 93, 21);
		loc.add(closecbx);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" LOG -");
		lblNewLabel_1_2_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(375, 293, 66, 25);
		loc.add(lblNewLabel_1_2_1);
		
		LOG = new JTextField();
		LOG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float log=Integer.parseInt(LOG.getText());
				
			}
		});
		LOG.setBounds(434, 298, 60, 19);
		loc.add(LOG);
		LOG.setColumns(10);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel(" LAT -");
		lblNewLabel_1_2_1_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1_2_1_1.setBounds(500, 293, 66, 25);
		loc.add(lblNewLabel_1_2_1_1);
		
		LAT = new JTextField();
		LAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float lat=Integer.parseInt(LAT.getText());
			}
		});
		LAT.setColumns(10);
		LAT.setBounds(554, 298, 60, 19);
		loc.add(LAT);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(135, 206, 250));
	//	lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("/img/img/img2.png")));
		lblNewLabel_3.setBounds(482, 20, 84, 52);
		loc.add(lblNewLabel_3);
		
		HashMap<String,BoatEssentials> boatList = new HashMap();
		
	
		
		
		
		JButton stop_boat_1 = new JButton("Update");
		stop_boat_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				System.out.println("--------- BOAT DATA  ---------");
				 System.out.println("Boat HULL ID - "+HULL_ID.getText());
				 System.out.println("Boat IMEI NO - "+IMEI.getText());
				 System.out.println("Boat Location - "+bloc.getText());
				 System.out.println("Longitude - "+LOG.getText());
				 System.out.println("Latitude - "+LAT.getText());
				 
				 System.out.println("Boat Temperature - "+TEMP.getValue());
				 System.out.println("Boat Speed - "+slider.getValue());
				 
				 boatList.put(HULL_ID.getText(),(new BoatEssentials(HULL_ID.getText(),IMEI.getText(),slider.getValue(),(new BoatLocation(LOG.getText(),LAT.getText())))));
				
				 System.out.println(boatList);
				
				
				
				if(opencbx.isSelected())
				{
					System.out.println("Door is Open");
					
				}
				if(closecbx.isSelected())
				{
					System.out.println("Door is Closed");
				
				}
				
			}
		});
		stop_boat_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		stop_boat_1.setBackground(new Color(30, 144, 255));
		stop_boat_1.setBounds(490, 433, 159, 38);
		loc.add(stop_boat_1);
		
		JLabel location = new JLabel("Boat Location - ");
		location.setFont(new Font("Verdana", Font.BOLD, 15));
		location.setBounds(42, 238, 149, 25);
		loc.add(location);
		
		bloc = new JTextField();
		bloc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int bloc=Integer.parseInt(bloc.);
			}
		});
		bloc.setColumns(10);
		bloc.setBounds(182, 238, 149, 19);
		loc.add(bloc);
		
		
		
		
	}
}