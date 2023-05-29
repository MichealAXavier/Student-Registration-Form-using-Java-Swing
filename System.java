import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class System {
public static void main(String[] args){
JTabbedPane tabbedPane=new JTabbedPane();
JFrame frame=new JFrame();
frame.add(tabbedPane);
frame.setSize(700,700);
frame.setVisible(true);
JPanel personalPanel, educationPanel, additionalPanel;
JLabel nameLabel, regnoLabel, dobLabel,phnoLabel, genderLabel,addressLabel, 
ugLabel,deptLabel,perctLabel,passLabel, 
nccLabel,sportsLabel,accomadationLabel,skillsLabel,hobbyLabel,languageLabel,courseLabel;
JTextField nameField,regnoField,phnoField, ugField,deptField,perctField,passField, skillsField,hobbyField, 
languageField,courseField;
JComboBox dayCombo, monthCombo, yearCombo;
JRadioButton male,female,others,nccyes,nccno,sportsyes,sportsno,dayscholar,hosteller;
ButtonGroup select;
JTextArea address;
JButton submitButton;
 
 // Initialize the personal panel
 personalPanel = new JPanel();
 personalPanel.setLayout(null);
 personalPanel.setVisible(true);
//Name
 nameLabel = new JLabel("Name:");
 nameLabel.setBounds(30, 20, 100, 30);
 nameField = new JTextField();
 nameField.setBounds(120, 20, 150, 30);
 personalPanel.add(nameLabel);
 personalPanel.add(nameField);
//Reg. No.
 regnoLabel = new JLabel("Reg. No.:");
 regnoLabel.setBounds(30, 60, 100, 30);
 regnoField = new JTextField();
 regnoField.setBounds(120, 60, 150, 30);
 personalPanel.add(regnoLabel);
 personalPanel.add(regnoField); 
//dob
 dobLabel = new JLabel("Date of Birth:");
 dobLabel.setBounds(30,100,100,40);
 personalPanel.add(dobLabel);
// Initialize the day combobox
 dayCombo = new JComboBox();
 for (int i = 1; i <= 31; i++) {
 dayCombo.addItem(i);
 }
 dayCombo.setBounds(110, 100, 50, 30);
 personalPanel.add(dayCombo);
// Initialize the month combobox
 monthCombo = new JComboBox();
 monthCombo.addItem("Jan");
 monthCombo.addItem("Feb");
 monthCombo.addItem("Mar");
 monthCombo.addItem("Apr");
 monthCombo.addItem("May");
 monthCombo.addItem("Jun");
 monthCombo.addItem("Jul");
 monthCombo.addItem("Aug");
 monthCombo.addItem("Sept");
 monthCombo.addItem("Oct");
 monthCombo.addItem("Nov");
 monthCombo.addItem("Dec");
 monthCombo.setBounds(165, 100, 70, 30);
 personalPanel.add(monthCombo);
// Initialize the year combobox
 yearCombo = new JComboBox();
 for (int i = 2000; i <= 2030; i++) {
 yearCombo.addItem(i);
 }
 yearCombo.setBounds(235, 100, 70, 30);
 personalPanel. add(yearCombo);
//gender
 genderLabel = new JLabel("Gender:");
 genderLabel.setBounds(30, 140, 100, 30); 
 male= new JRadioButton("Male");
 male.setBounds(120,140,150,30);
 female= new JRadioButton("Female");
 female.setBounds(120,160,150,30);
 others= new JRadioButton("Others");
 others.setBounds(120,180,150,30);
 select=new ButtonGroup();
 select.add(male);
 select.add(female);
 select.add(others);
 personalPanel.add(genderLabel);
 personalPanel.add(male); 
 personalPanel.add(female); 
 personalPanel.add(others); 
//phone no.
 phnoLabel = new JLabel("Phone No.:");
 phnoLabel.setBounds(30, 210, 100, 30);
 phnoField = new JTextField();
 phnoField.setBounds(120, 210, 150, 30);
 personalPanel.add(phnoLabel);
 personalPanel.add(phnoField); 
//address
 addressLabel = new JLabel("Address:");
 addressLabel.setBounds(30, 250, 100, 30);
 address= new JTextArea();
 address.setBounds(120,250,200,80);
 personalPanel.add(addressLabel);
 personalPanel.add(address); 
// Initialize the education panel
 educationPanel = new JPanel();
 educationPanel.setLayout(null);
//ug 
 ugLabel = new JLabel("UG Qualification:");
 ugLabel.setBounds(30, 20, 100, 30);
 ugField = new JTextField();
 ugField.setBounds(170, 20, 200, 30);
 educationPanel.add(ugLabel);
 educationPanel.add(ugField);
//dept
 deptLabel = new JLabel("Department:");
 deptLabel.setBounds(30, 60, 100, 30);
 deptField = new JTextField();
 deptField.setBounds(170, 60, 200, 30);
 educationPanel.add(deptLabel);
 educationPanel.add(deptField);
//perct
 perctLabel = new JLabel("Percentage:");
 perctLabel.setBounds(30, 100, 100, 30);
 perctField = new JTextField();
 perctField.setBounds(170, 100, 200, 30);
 educationPanel.add(perctLabel);
 educationPanel.add(perctField);
//pass
 passLabel = new JLabel("Year of Passing:");
 passLabel.setBounds(30, 140, 100, 30);
 passField = new JTextField();
 passField.setBounds(170, 140, 200, 30);
 educationPanel.add(passLabel);
 educationPanel.add(passField);
// Initialize the additional panel
 additionalPanel = new JPanel();
 additionalPanel.setLayout(null);
//NCC
 nccLabel = new JLabel("NCC:");
 nccLabel.setBounds(30, 30, 100, 30); 
 nccyes= new JRadioButton("Yes");
 nccyes.setBounds(170,30,150,30);
 nccno= new JRadioButton("No");
 nccno.setBounds(170,60,150,30);
 select.add(nccyes);
 select.add(nccno);
 additionalPanel.add(nccLabel);
 additionalPanel.add(nccyes); 
 additionalPanel.add(nccno); 
//Sports
 sportsLabel = new JLabel("Sports:");
 sportsLabel.setBounds(30, 100, 100, 30); 
 sportsyes= new JRadioButton("Yes");
 sportsyes.setBounds(170,100,150,30);
 sportsno= new JRadioButton("No");
 sportsno.setBounds(170,130,150,30);
 select.add(sportsyes);
 select.add(sportsno);
 additionalPanel.add(sportsLabel);
 additionalPanel.add(sportsyes); 
 additionalPanel.add(sportsno); 
//Accomadation
 accomadationLabel = new JLabel("Accomadation:");
 accomadationLabel.setBounds(30, 170, 100, 30); 
 dayscholar= new JRadioButton("Day Scholar");
 dayscholar.setBounds(170,170,150,30);
 hosteller= new JRadioButton("Hosteller");
 hosteller.setBounds(170,200,150,30);
 select.add(dayscholar);
 select.add(hosteller);
 additionalPanel.add(accomadationLabel);
 additionalPanel.add(dayscholar); 
 additionalPanel.add(hosteller); 
//TechnicalSkills
 skillsLabel = new JLabel("Technical Skills:");
 skillsLabel.setBounds(30, 240, 100, 30);
 skillsField = new JTextField();
 skillsField.setBounds(170, 240, 150, 30);
 additionalPanel.add(skillsLabel);
 additionalPanel.add(skillsField);
//Hobby
 hobbyLabel = new JLabel("Hobbies:");
 hobbyLabel.setBounds(30, 280, 100, 30);
 hobbyField = new JTextField();
 hobbyField.setBounds(170, 280, 150, 30);
 additionalPanel.add(hobbyLabel);
 additionalPanel.add(hobbyField);
//Languages Known
 languageLabel = new JLabel("Languages Known:");
 languageLabel.setBounds(30, 320, 100, 30);
 languageField = new JTextField();
 languageField.setBounds(170, 320, 150, 30);
 additionalPanel.add(languageLabel);
 additionalPanel.add(languageField);
//Extra courses
 courseLabel = new JLabel("Extra Courses:");
 courseLabel.setBounds(30, 360, 100, 30);
 courseField = new JTextField();
 courseField.setBounds(170, 360, 150, 30);
 additionalPanel.add(courseLabel);
 additionalPanel.add(courseField);
 // Add the panels to the tabbed pane
 tabbedPane.addTab("Personal", personalPanel);
 tabbedPane.addTab("Education", educationPanel);
 tabbedPane.addTab("Additional", additionalPanel);
 // Initialize the submit button
 submitButton = new JButton("UPLOAD");
 submitButton.setBounds(100, 400, 150, 30);
 additionalPanel.add(submitButton);
//JOptionPane Show Message Dialog
 submitButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 JOptionPane.showMessageDialog(null,"Student Information Uploaded Successfully");
 }
 });
 
}
}
