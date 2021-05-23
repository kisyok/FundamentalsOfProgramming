
package lab9.pkg2;
//@author Kisyok Indran Veerasamy
public class Lab92 {

    public static void main(String[] args) {
        Student s=new Student("Ali",'M',"20 Dec 1999","test_1");
        s.getGrade(s.readFile());
        System.out.println(s.toString());
//        Lecturer l=new Lecturer("Amina",'F',"20 Dec 1979");

}
}
