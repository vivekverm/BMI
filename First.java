public class First {

    public static void main(String[] args) {
    Patient obj= new Patient("vivek",12,23);
        System.out.println(obj.patientname);
        System.out.println(obj.BMI());


    }}

class Patient {
    String patientname;
    double height;
    double width;
    public Patient(String name,double height,double width){
        this.height=height;
        this.patientname=name;
        this.width=width;

    }
    public double BMI(){

        return width/(height*height);
    }

}
