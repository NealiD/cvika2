public class ExamRecord
{
    private String name;
    private Fraction score;

    public ExamRecord(Fraction score, String name)
    {
        this.score = score;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Fraction getScore() {
        return score;
    }
}
