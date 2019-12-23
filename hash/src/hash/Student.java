package hash;

public class Student{
private String idNum;
private String name;
private int mark;
private static int nextID=1;  
{
  nextID++;
}

public Student(String name,int mark) {
  this.name=name;
  this.mark=mark;
}

public Student(String name, String idNum) {
  this.name = name;
  this.idNum = idNum;
}
public String getIdNum() {
  return idNum;
}
public String getName() {
  return name;
}

public int getMark() {
  return mark;
}

public String toString() {
  return "ID: "+getIdNum()+" Name: "+getName()+" Mark: "+getMark();
}

public boolean equals(Object eblan) {
  if(eblan instanceof Student) {
    Student vlad = (Student)eblan;
    if(vlad.getIdNum().equals(((Student) eblan).getIdNum())) {
      return true;
    }
  }
  return false;
}

public int hashCode() {
  return 17 * this.hashCode();
}
}