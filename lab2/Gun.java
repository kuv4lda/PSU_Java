import static java.lang.System.out;

public class Gun
{
    private int bullets;

    public int getBullets()
    {
        return bullets;
    }

    public Gun()
    {
        this.bullets = 5;
    }

    public Gun(int bullets)
    {
        this.bullets = bullets;
    }

    public void shoot()
    {
        if (bullets > 0)
        {
            out.println("Бах!");
            bullets--;
        }
        else
        {
            out.println("Клац!");
        }
    }
}
