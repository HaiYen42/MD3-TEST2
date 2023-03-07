import java.util.Scanner;

public class Student {
    //Property
    private String studentId, studentName, phone, address;
    int age;
    String sex;
    float html, css, javascript, avgMark;

    //Constructor
    public Student(){
    }
    public Student(String studentId, String studentName, String phone,
                   String address, int age, String sex, float html, float css,
                   float javascript, float avgMark){
        this.studentId=studentId;
        this.studentName= studentName;
        this.phone=phone;
        this.address=address;
        this.age=age;
        this.sex=sex;
        this.html=html;
        this.css=css;
        this.javascript=javascript;
        this.avgMark=avgMark;
    }
    //Method
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String isSex() {
        return sex;
    }

    public float getHtml() {
        return html;
    }

    public float getCss() {
        return css;
    }
    public float getJavascript() {
        return javascript;
    }
    public float getAvgMark() {
        return avgMark;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setHtml(float html) {
        this.html = html;
    }
    public void setCss(float css) {
        this.css = css;
    }
    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public void inputData(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter StudentId: ");
        this.setStudentId(input.nextLine());
        System.out.print("Enter Student Name: ");
        this.setStudentName(input.nextLine());
        System.out.print("Enter Student Phone: ");
        this.setPhone(input.nextLine());
        System.out.print("Enter Student Address: ");
        this.setAddress(input.nextLine());
        System.out.print("Enter Student Age: ");
        this.setAge(input.nextInt());
        input.nextLine();
        System.out.print("Enter Student Sex: ");
        this.setSex(input.nextLine());
        System.out.print("Enter Student's Html score: ");
        this.setHtml(input.nextFloat());
        System.out.print("Enter Student's Css score: ");
        this.setCss(input.nextFloat());
        System.out.print("Enter Student's Javascript score: ");
        this.setJavascript(input.nextFloat());
    }
    public float calAvgMark(){
        float avgMark;
        float css= getCss();
        float html=getHtml();
        float javaScrip=getJavascript();
        avgMark= (html+css+2*javaScrip)/4;
//        System.out.println("Điểm trung bình là "+ avgMark);
        return avgMark;

    }
    public void displayData() {
        calAvgMark();
//        int currentYear = Year.now().getValue();
//        int birthYear = currentYear - getAge();
        System.out.printf("%-20s%-20s%-20s%-20s\n" +
                        "%-20s%-20d%-20s%-20s%-20s%-20s\n" +
                        "%-20s%-60s%-20s%-20.2f",
                "Mã sinh viên: ", getStudentId(), "Tên sinh viên: ", getStudentName(),
                "Số tuổi : ", getAge(), "Giới tính: ", isSex(), "Điện thoại: ", getPhone(),
                "Địa chỉ: ", getAddress(), "Điểm trung bình: ", calAvgMark());
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", html=" + html +
                ", css=" + css +
                ", javascript=" + javascript +
                ", avgMark=" + avgMark +
                '}';
    }


}
