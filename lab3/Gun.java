import static java.lang.System.out;
import java.util.Scanner;

public class Gun
{
    private int bullets;
    private final int maxBullets;

    public int getBullets()
    {
        return bullets;
    }
    
    public int getMaxBullets()
    {
        return maxBullets;
    }
    
    public Gun(int maxBullets)
    {
        if (maxBullets <= 0)
        {
            Scanner in = new Scanner(System.in);
            while(maxBullets < 1)
            {
                out.println("Количество патронов должно быть положительным числом");
                maxBullets = in.nextInt();
            }
        }
        out.println("Пистолет с размером магазина: " + maxBullets);
        this.maxBullets = maxBullets;
        this.bullets = 0; //По умолчанию разряжен
    }
    
    public void reload(int bulletsToAdd)
    {
        if (bulletsToAdd < 0)
        {
            Scanner in = new Scanner(System.in);
            while(bulletsToAdd < 1)
            {
                out.println("Количество патронов должно быть положительным числом");
                bulletsToAdd = in.nextInt();
            }
        }
        int remainingBullets = maxBullets - bullets;
        if (bulletsToAdd <= remainingBullets)
        {
            bullets += bulletsToAdd;
            out.println("Заряжено патронов: " + bulletsToAdd);
        }
        else
        {
            int excessBullets = bulletsToAdd - remainingBullets;
            bullets = maxBullets;
            out.println("Заряжено патронов: " + remainingBullets + ". Патронов возвращено:" + excessBullets);
        }
    }
    
    public int unload()
    {
        int unloadedBullets = bullets;
        bullets = 0;
        out.println("Разряжено патронов:" + unloadedBullets);
        return unloadedBullets;
    }
    
    public boolean isLoaded()
    {
        return bullets > 0;
    }
    
    public void shoot()
    {
        if (bullets > 0)
        {
            bullets--;
            out.println("Бах! (Осталось патронов:" + bullets + ")");
        }
        else
        {
            out.println("Клац!");
        }
    }
}
