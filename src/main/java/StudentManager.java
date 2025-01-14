import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<String> students = new ArrayList<>();

    // 학생 추가
    public void addStudent(String name) {
        students.add(name);
    }

    // 학생 목록 출력
    public void displayStudents() {
        for(String student : students) {
            System.out.println("Student: " + student);
        }
    }

    // 성적 계산
    public double calculateAverageGrade(List<Integer> grades) {
        int total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    // 파일 저장
    public void saveStudentsToFile(String filename) {
        try(FileWriter fw = new FileWriter(filename)) {
            for(String student : students) {
                fw.write(student + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving students to file: " + e.getMessage());
        }
    }
}
