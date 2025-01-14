import java.util.List;

public class Student {
    private String name;
    private int age;


    public void setName(String name){
        this.name = name;
    }

    // 성적 계산
    public double calculateGPA(List<Double> grades) {
        double sum = 0;
        for(Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name + " , Age: " + age);
    }
}
