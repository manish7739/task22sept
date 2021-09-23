package task22sept;

public class Students {
private int rollNo;
private String StudentName;
private String batch;
private String stream;
private String ph_number;
private String address;
public void setRollNo(int rollNo) {
	this.rollNo=rollNo;
}
public int getRollNo( ) {
	return this.rollNo;
}
public void setStudentName(String StudentName) {
	this.StudentName=StudentName;	
}
public String getStudentName() {
	return this.StudentName;	
}
public void setBatch(String batch) {
	this.batch=batch;	
}
public String getBatch( ) {
	return this.batch;	
}
public void setStream(String stream) {
	this.stream=stream;	
}
public String getStream() {
	return this.stream;	
}
public void setPhNumber(String phnum) {
	this.ph_number=phnum;	
}
public String getPhnumber() {
	return this.ph_number;	
}
public void setAddress(String add) {
	this.address=add;	
}
public String getAddress() {
	return this.address;	
}

public static void main(String args[]) {
	Students s=new Students();
	s.setRollNo(1);
	s.setStudentName("Manish Kumar");
	s.setBatch("2k16");
	s.setStream("CS/IT");
	s.setPhNumber("7739251434");
	s.setAddress("New delhi");
	
	System.out.println("Name : " + s.getStudentName() );
	System.out.println("Roll Number : " +s.getRollNo());
	System.out.println("Batch : " + s.getBatch() );
	System.out.println("Stream : " + s.getStream() );
	System.out.println("Phone Number : " + s.getPhnumber() );
	System.out.println("Address: " + s.getAddress() );
	System.out.println("===============================" );
	Students s1=new Students();
	s1.setRollNo(2);
	s1.setStudentName("Rabish Kumar");
	s1.setBatch("2k16");
	s1.setStream("CS/IT");
	s1.setPhNumber("7739875467");
	s1.setAddress("Hydrabad");
	
	System.out.println("Name : " + s1.getStudentName() );
	System.out.println("Roll Number : " +s1.getRollNo());
	System.out.println("Batch : " + s1.getBatch() );
	System.out.println("Stream : " + s1.getStream() );
	System.out.println("Phone Number : " + s1.getPhnumber() );
	System.out.println("Address: " + s1.getAddress() );
	
	System.out.println("===============================" );
	Students s2=new Students();
	s2.setRollNo(3);
	s2.setStudentName("Raushan ");
	s2.setBatch("2k17");
	s2.setStream("CS/IT");
	s2.setPhNumber("7734365467");
	s2.setAddress("patna");
	
	System.out.println("Name : " +       s2.getStudentName() );
	System.out.println("Roll Number : " +s2.getRollNo());
	System.out.println("Batch : " +      s2.getBatch() );
	System.out.println("Stream : " +     s2.getStream() );
	System.out.println("Phone Number : " + s2.getPhnumber() );
	System.out.println("Address: " + s2.getAddress() );
	
	
	System.out.println("===============================" );
	Students s3=new Students();
	s3.setRollNo(4);
	s3.setStudentName("Jaykal ");
	s3.setBatch("2k18");
	s3.setStream("CS/IT");
	s3.setPhNumber("7765765467");
	s3.setAddress("Illahabad");
	
	System.out.println("Name : " +       s3.getStudentName() );
	System.out.println("Roll Number : " +s3.getRollNo());
	System.out.println("Batch : " +      s3.getBatch() );
	System.out.println("Stream : " +     s3.getStream() );
	System.out.println("Phone Number : "+s3.getPhnumber() );
	System.out.println("Address: " +     s3.getAddress() );
	
	System.out.println("===============================" );
	Students s4=new Students();
	s4.setRollNo(5);
	s4.setStudentName("Akash");
	s4.setBatch("2k16");
	s4.setStream("CS/IT");
	s4.setPhNumber("7738756340");
	s4.setAddress("Amritsar");
	
	System.out.println("Name : " +       s4.getStudentName() );
	System.out.println("Roll Number : " +s4.getRollNo());
	System.out.println("Batch : " +      s4.getBatch() );
	System.out.println("Stream : " +     s4.getStream() );
	System.out.println("Phone Number : " + s4.getPhnumber() );
	System.out.println("Address: " + s4.getAddress() );
}
}