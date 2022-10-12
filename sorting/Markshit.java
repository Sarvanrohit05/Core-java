package sorting;

public class Markshit implements Comparable<Markshit> {
	private String rollno;
	private String fname;
	private String lname;
	private int phycics;
	private int chemistry;
	private int math;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhycics() {
		return phycics;
	}
	public void setPhycics(int phycics) {
		this.phycics = phycics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
   public int compareto(Markshit m) {
	return this.rollno.compareTo(m.rollno);
	   
	
   }
@Override
public int compareTo(Markshit m) {
	return this.rollno.compareTo(m.rollno);
	
}
}
  