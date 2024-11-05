import java.util.ArrayList;

public abstract class Schema
{
    protected ArrayList<Integer> aGrades;
    protected ArrayList<Integer> qGrades;
    protected ArrayList<Integer> mGrades;
    private int fGrade;
    private double aWeight;
    private double qWeight;
    private double mWeight;
    private double fWeight;

    public Schema(final double aWeight, final double qWeight, final double mWeight, final double fWeight, final int numofAssignments, final int numofQuizzes, final int numofmGrades) {
        this.mWeight = mWeight;
        this.fWeight = fWeight;
        this.aWeight = aWeight;
        this.qWeight = qWeight;
        this.aGrades = new ArrayList<Integer>(numofAssignments);
        this.qGrades = new ArrayList<Integer>(numofQuizzes);
        this.mGrades = new ArrayList<Integer>(numofmGrades);
    }

    public void addMidterm(final int grade) {
        this.mGrades.add(grade);
    }

    public void addQuiz(final int grade) {
        this.qGrades.add(grade);
    }

    public void addAssignment(final int grade) {
        this.aGrades.add(grade);
    }

    public void setfGrade(final int fGrade) {
        this.fGrade = fGrade;
    }

    public int getAssignmentGrade(final int index) {
        return this.aGrades.get(index);
    }

    public int getQuizGrade(final int index) {
        return this.qGrades.get(index);
    }

    public int getMidterm(final int index) {
        return this.mGrades.get(index);
    }

    public int getfGrade() {
        return this.fGrade;
    }

    private double calcAvarage(final ArrayList<Integer> list) {
        double sum = 0.0;
        final int size = list.size();
        for (int i = 0; i < size; ++i) {
            sum += list.get(i);
        }
        return sum / size;
    }

    private double calcWeight() {
        final double assignmentAvg = this.calcAvarage(this.aGrades);
        final double quizAvg = this.calcAvarage(this.qGrades);
        final double midtermAvg = this.calcAvarage(this.mGrades);
        final double finalAvg = this.fGrade;
        return assignmentAvg * this.aWeight + quizAvg * this.qWeight + midtermAvg * this.mWeight + finalAvg * this.fWeight;
    }

    public String[] toTable() {
        final String[] res = { this.aWeight + "", this.qWeight + "", this.mWeight + "", this.fWeight + "" };
        return res;
    }

    public String letterGrades() {
        final double avg = this.calcWeight();
        if (avg >= 96.0 && avg <= 100.0) {
            return "A";
        }
        if (avg >= 91.0 && avg <= 95.0) {
            return "A-";
        }
        if (avg >= 84.0 && avg <= 90.0) {
            return "B+";
        }
        if (avg >= 77.0 && avg <= 83.0) {
            return "B";
        }
        if (avg >= 70.0 && avg <= 76.0) {
            return "B-";
        }
        if (avg >= 65.0 && avg <= 69.0) {
            return "C+";
        }
        if (avg >= 60.0 && avg <= 64.0) {
            return "C";
        }
        if (avg >= 0.0 && avg <= 59.0) {
            return "F";
        }
        return "0";
    }
}