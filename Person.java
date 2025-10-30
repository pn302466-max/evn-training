import java.util.lang;
public class person{
private String name;
private int age;
public person( String name,int age)
this.name=name;
this.age=age;
}
public void DisplayInfo(){
System.out.println("Name:" +name);
System.out println("Age:" +age);
}
public void setAge(int age){
if(age>0){
this.age=age;
}
else{
System,out,println("Age must be positive.");
}
}
public String getName(){
return name;
}
public int getAge(){
return age;
}

