/**** Main.java ****/
import java.awt.*;
import java.awt.event.*;
public class awt12 extends Frame implements ActionListener {
 Button btnInfo, btnCGPA;
 awt12() {
 super("Student Details");
 btnInfo = new Button("A");
 btnInfo.setBounds(25, 125, 100, 100);
 btnInfo.addActionListener(this);
 this.add(btnInfo);
 btnCGPA = new Button("B");
 btnCGPA.setBounds(200, 125, 100, 100);
 btnCGPA.addActionListener(this);
 this.add(btnCGPA);
 this.setSize(500, 500);
 this.setLayout(null);
 this.setVisible(true);
 this.setLocationRelativeTo(null);
 this.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 dispose();
 }
 });
 }
 public static void main(String[] args) {
 new awt12();
 }
 @Override
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == btnInfo) {
 new Information(
"Apoorv Pandey",
"MCA ",
"57028",
"College of Technology"
);
 } else if (e.getSource() == btnCGPA) {
 new CGPA("7.6");
 }
 }
}

class Information extends Frame {
 Button btnClose;
 Panel panelForm;
 Label labelName, labelCourse, labelRollNo, labelCollege;
 TextField fieldName, fieldCourse, fieldRollNo, fieldCollege;
 Information(String name, String course, String rollNo, String college) {
 super("Personal Information");
 labelName = new Label("Name:");
 labelName.setBounds(20, 20, 80, 30);
 labelCourse = new Label("Course:");
 labelCourse.setBounds(20, 50, 80, 30);
 labelRollNo = new Label("Roll No.:");
 labelRollNo.setBounds(20, 80, 80, 30);
 labelCollege = new Label("College:");
 labelCollege.setBounds(20, 110, 80, 30);
 fieldName = new TextField(name);
 fieldName.setBounds(100, 22, 200, 24);
 fieldName.setEditable(false);
 fieldCourse = new TextField(course);
 fieldCourse.setBounds(100, 52, 200, 24);
 fieldCourse.setEditable(false);
 fieldRollNo = new TextField(rollNo);
 fieldRollNo.setBounds(100, 82, 200, 24);
 fieldRollNo.setEditable(false);
 fieldCollege = new TextField(college);
 fieldCollege.setBounds(100, 112, 200, 24);
 fieldCollege.setEditable(false);
 btnClose = new Button("Close");
 btnClose.setBounds(100, 150, 125, 30);
 btnClose.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 dispose();
 }
 });
 panelForm = new Panel();
 panelForm.setLayout(null);
 panelForm.add(labelName);
 panelForm.add(fieldName);
 panelForm.add(labelCourse);
 panelForm.add(fieldCourse);
 panelForm.add(labelRollNo);
 panelForm.add(fieldRollNo);
 panelForm.add(labelCollege);
 panelForm.add(fieldCollege);
 panelForm.add(btnClose);
 this.add(panelForm);
 this.setSize(350, 250);
 this.setVisible(true);
 this.setLayout(null);
 this.setLocationRelativeTo(null);
 this.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 dispose();
 }
 });
 }
}

class CGPA extends Frame {
 Label l;
 Button btnClose;
 CGPA(String cgpa) {
 super("Previous Year CGPA");
 l = new Label("Your CGPA was: " + cgpa);
 l.setBounds(10, 50, 280, 30);
 l.setAlignment(Label.CENTER);
 btnClose = new Button("Close");
 btnClose.setBounds(20, 85, 260, 30);
 btnClose.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 dispose();
 }
 });
 this.add(l);
 this.add(btnClose);
 this.setSize(300, 150);
 this.setLayout(null);
 this.setVisible(true);
 this.setLocationRelativeTo(null);
 this.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 dispose();
 }
 });
 }
}