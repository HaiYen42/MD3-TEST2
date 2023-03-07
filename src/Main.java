import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("****************HACKATHON-JAVA-ADVANCE-1-MENU***************\n"+
                "1. Nhập số sinh viên và thông tin cho các sinh viên \n"+
                "2. In thông tin các sinh viên đang quản lý \n"+
                "3. Sắp xếp các sinh viên theo điểm trung bình tăng dần\n"+
                "4. Nhập vào tên sinh viên và tìm kiếm sinh viên theo tên\n"+
                "5. Thống kê số sinh viên nam, nữ đang quản lý\n"+
                "6. In ra thông tin các sinh viên xếp loại giỏi và trung bình\n"+
                "7. Thoát "
                  );
        System.out.print("Vui lòng chọn 1 lựa chọn " );
        int option= input.nextInt();
        Student[] studentArray = new Student[200];
        int size= 0;

        switch (option){
            case 1:
                //Nhập thông tin của SV
                System.out.print("Enter number of Student ");
                size = input.nextInt();
                inputStudentInfo(studentArray, size);
                break;
            case 2:
                //In ra thông tin các SV đang quản lý
                System.out.print("Enter number of Student ");
                size = input.nextInt();
                inputStudentInfo(studentArray, size);
                printStudentInfo(studentArray, size);
                break;
            case 3:
                System.out.print("Enter number of Student ");
                size = input.nextInt();
                sortStudent(studentArray, size);
                break;
            case 4:
                break;
            case 5:
                System.out.print("Enter number of Student ");
                size = input.nextInt();
                GenderOfStudent(studentArray, size);
                break;
            case 6:
                System.out.print("Enter number of Student ");
                size = input.nextInt();
                RatingStudent(studentArray, size);
                break;
            case 7:
                System.out.println("Bạn đã thoát khỏi chương trình");
                break;
        }
    }
    //Option 1:
    public static void inputStudentInfo(Student[] studentArray, int size){
        for (int i = 0; i < size; i++) {
            System.out.println("Enter info for Student no."+ (i+1));
            studentArray[i]= new Student();
            studentArray[i].inputData();
            studentArray[i].calAvgMark();
        }
    }

    //Option2:
    public static void printStudentInfo(Student[] studentArray, int size){

        for (int i = 0; i < size; i++) {
            studentArray[i].displayData();
            System.out.println("\n");
        }
    }
    public static void sortStudent(Student[] studentArray, int size){
        inputStudentInfo(studentArray, size);
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (studentArray[i].calAvgMark()>studentArray[j].calAvgMark()){
                    Student temp=studentArray[j];
                    studentArray[j]=studentArray[i];
                    studentArray[i]=temp;
                }
            }
        }
        printStudentInfo(studentArray, size);
    }
    public static void RatingStudent(Student[] studentArray, int size){
        inputStudentInfo(studentArray, size);
        System.out.println("Học sinh xếp loại giỏi là: ");
        for (int i = 0; i < size; i++) {
            if (studentArray[i].calAvgMark()>=8&&studentArray[i].calAvgMark()<=9){
                studentArray[i].displayData();
                System.out.println("\n");
            }
        }
        System.out.println("Học sinh xếp loại trung bình: ");
        for (int i = 0; i < size; i++) {
            if (studentArray[i].calAvgMark()>=5&&studentArray[i].calAvgMark()<7){
                studentArray[i].displayData();
                System.out.println("\n");
            }
        }
    }
    public static void GenderOfStudent(Student[] studentArray, int size){
        inputStudentInfo(studentArray, size);
        System.out.println("Học sinh nữ là ");
        for (int i = 0; i < size; i++) {
            if (studentArray[i].isSex().equalsIgnoreCase("nữ")){
                studentArray[i].displayData();
                System.out.println("\n");
            }
        }
        System.out.println("Học sinh nam là ");
        for (int i = 0; i < size; i++) {
            if (studentArray[i].isSex().equalsIgnoreCase("nam")){
                studentArray[i].displayData();
                System.out.println("\n");
            }
        }
    }
}