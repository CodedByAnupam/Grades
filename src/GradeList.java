import java.util.ArrayList;
import java.util.List;

public class GradeList {
    private List<Grade> grades;

    public GradeList(){
        this.grades = new ArrayList<>();
    }

    public void add(int grade){
        this.grades.add(new Grade(grade));
    }

    public List<Integer> roundgrades(){
        List<Integer> roundedList = new ArrayList<>();
        for(Grade grade:this.grades){

            roundedList.add(grade.round());
        }
        return roundedList;

    }

}
