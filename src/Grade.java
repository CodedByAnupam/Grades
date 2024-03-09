public class Grade {
    private int grade;

    public Grade(int grade){
        this.grade = grade;

    }
    public int getGrade(){
        return this.grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int round(){
        if(grade >= 38){
            int diff = 5 - grade % 5;
            if(diff < 3){
                grade += diff;
            }
            return grade;
        }
        return grade;

    }

}
