public class Applicant
{
    private String lastName;
    private String firstName;
    private int score1;
    private int score2;
    private int score3;

    public Applicant(String lastName, String firstName, int score1, int score2, int score3)
    {
        if (lastName == null || lastName.trim().isEmpty() || lastName.length() > 20)
        {
            throw new IllegalArgumentException("Фамилия должна быть не пустой и не более 20 символов.");
        }
        if (firstName == null || firstName.trim().isEmpty() || firstName.length() > 15)
        {
            throw new IllegalArgumentException("Имя должно быть не пустым и не более 15 символов.");
        }
        if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100 || score3 < 0 || score3 > 100)
        {
            throw new IllegalArgumentException("Оценки должны быть от 0 до 100.");
        }
        this.lastName = lastName;
        this.firstName = firstName;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public int getScore1() 
    {
        return score1;
    }

    public int getScore2()
    {
        return score2;
    }

    public int getScore3()
    {
        return score3;
    }

    public boolean isAdmitted()
    {
        return score1 >= 30 && score2 >= 30 && score3 >= 30 && (score1 + score2 + score3) >= 140;
    }

    @Override
    public String toString()
    {
        return "Applicant{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                '}';
    }
}
