

//import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sin = new Scanner(System.in);
        /*
        int a1 = sin.nextInt(),b1 = sin.nextInt(),c1 = sin.nextInt(); // цена товара
        int a2 = sin.nextInt(),b2 = sin.nextInt(),c2 = sin.nextInt(); // сумма чела
        */
        int a1 = 5, b1 = 5, c1 = 5 // цена товара
        int a2 = 5, b2 = 5, c2 = 5 //сумма чела
        int sumDif = (((a2*12)+b2)*20+c2) - (((a1*12)+b1)*20+c1);
        System.out.println(sumDif > 0 ?
                (sumDif / 240) + " фунт " + ((sumDif % 240) / 20) + " шиллинг " + (((sumDif % 240 )% 20) ) + " пенс "
                :(sumDif == 0  ?
                "Сдачи нет"
                : "Ошибка"));
    }
}
