public class firstSchema extends Schema
{
    public firstSchema(final double aWeight, final double qWeight, final double mWeight, final double fWeight, final int numberOfAssignment, final int numberOfQuiz, final int numberOfMid) {
        super(aWeight,qWeight,mWeight,fWeight,numberOfAssignment,numberOfMid,numberOfQuiz);
    }

    @Override
    public void addMidterm(final int grade) {
        if (this.mGrades.size() < 2) {
            this.mGrades.add(grade);
        }
    }

    @Override
    public void addQuiz(final int grade) {
        if (this.qGrades.size() < 2) {
            this.qGrades.add(grade);
        }
    }

    @Override
    public void addAssignment(final int grade) {
        if (this.aGrades.size() < 4) {
            this.aGrades.add(grade);
        }
    }
}