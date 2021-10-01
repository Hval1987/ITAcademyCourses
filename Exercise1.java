
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Hval
 * Date: 29.09.21
 * Time: 22:47
 * To change this template use File | Settings | File Templates.
 */
public class Exercise1 {
    static void waity() throws InterruptedException {
        for(int i=0;i<11;i++) {
            System.out.print("..");
            Thread.sleep(150);
        }
        System.out.println();
    }
    static boolean task1(int x){
        int value=x;
        int arr[]=new int[4];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=value%10;
            value=value/10;
        }
        for(int iter:arr){
            System.out.print(iter+ "-");
        }
        System.out.println();
        if((arr[0]+arr[1])==(arr[2]+arr[3]))
            return true;
        else
            return false;




    }
    static double task2(int a,int b, int c){

        return ((b+Math.sqrt(b*b+4*(a*c)))/2*a ) -(a*a*a*c+b*b) ;
    }
    static void task3(double x,double y){

        double square= x*y/2;
        double perim=Math.sqrt(x*x+y*y)+x+y;
        System.out.println("Площадь треугольника равна= "+square);
        System.out.println("Периметр треугольника равен="+perim);
    }
    static boolean task4(double x, double y){
        if(y>0 & y<=4)
            if(x>=-2 & x<=2)
                return true;

        else if(y>=-3 & y<=0)
            if(x>=-4 & x<=4)
                return true;
        else
            return false;

      return false;
    }
    static void task5(double x, double y, double z){
        //проверяем  первое чило
        if(x<0)
            x=Math.pow(x,4) ;
        else
            x=Math.pow(x,2) ;
        //проверяем второе число
        if(y<0)
            y=Math.pow(y,4) ;
        else
            y=Math.pow(y,2);
        //проверяем  третье число
        if(z<0)
            z=Math.pow(z,4) ;
        else
            z=Math.pow(z,2);
        //выводим результат
        System.out.println("итоговые значения") ;
        System.out.println("x=>>"+x+"\t   y=>>"+y+"\t    z=>>"+z);
    }
    static double task6(double x,double y,double z){
        double min=x;
        double max=x;
        //ищем меньшее число
        if(y<min)
            min=y;
        if(z<min)
            min=z;
        //ищем максимальное
        if(y>max)
            max=y;
        if(z>max)
            max=z;
        return max+min;
    }
    static void  task7(double a, double b,int h){
        double result;
        for(double i=a;i<=b;i=i+h){
            result=Math.sin(i)*Math.sin(i)-Math.cos(2*i)*Math.cos(2*i);
            System.out.printf("\t%4.1f\t%4.1f\n", i, result);
            System.out.println();

        }

    }
    static double task8(int A[],int k){
        double sum=0;
        for(int i=0;i<A.length; i++){
            if (A[i]%k==0)
                sum+=A[i];
        }
        return sum;
    }
    static int[] task9(int[] arr1,int[] arr2, int pos ){
        System.arraycopy(arr1,pos,arr2,0,arr2.length);


        return arr1;

    }
    static void task10(int n) {
        int arr[] = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    arr[j] = j;

                }
                System.out.println(Arrays.toString(arr));
            } else
                for (int j = 0; j < n; j++) {
                    arr[j] = n - j;


                }
            System.out.println(Arrays.toString(arr));


        }
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner menu=new Scanner(System.in);
        int choise;

        do
        {
            System.out.println("\n***************************************");
            System.out.println("Введите номер задания(1-10), для выхода нажмите 0: ");
            while(!menu.hasNextInt()){
                System.out.println("вы ввели некорректное число");
                menu.nextLine();
            }
            choise=menu.nextInt();
            if(choise==0)
                break;
            switch (choise){
                case 1:{
                    System.out.println("введите 4-х значное число");
                    Scanner test1=new Scanner(System.in);
                    try{
                        int value=test1.nextInt();
                        if(value<10000)
                            System.out.println("Сумма двух первых цифр  числа\n"  +value +
                                    " равна сумме двух его последних цифр --->"+task1(value));

                        else {
                            System.out.println("с числом явно что-то не то(((. BYE");
                        } }
                    catch(Exception exc ){
                        System.out.println("ай-яй-яй!!!");
                    }
                    break;}

                case 2:{
                    Scanner test2=new Scanner(System.in);
                    System.out.println("введите вводные данные");
                    while(!test2.hasNextInt()){
                        test2.nextLine();
                        System.out.println("Вы ввели некоректное число...Попробуйте еще: ");
                    }
                    int a=test2.nextInt();

                    while(!test2.hasNextInt()) {
                        test2.nextLine();
                        System.out.println("Вы ввели некоректное число...Попробуйте еще: ");
                    }
                    int b=test2.nextInt();

                    while(!test2.hasNextInt()) {
                            test2.nextLine();
                            System.out.println("Вы ввели некоректное число...Попробуйте еще: ");
                        }
                    int c=test2.nextInt();

                    if(a==0) {
                        System.out.println("увы деление на 0 невозможно");

                        break;  }
                    System.out.println("значение выражения равно " + task2(a, b, c));
                    break;

                }
                case 3:{
                    System.out.println(" введите размеры катетов ");
                    Scanner test3=new Scanner(System.in);
                    while(!test3.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test3.nextLine();
                    }
                    double a=test3.nextDouble();

                    while(!test3.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test3.nextLine();
                    }
                    double b=test3.nextDouble();
                    if(a==0||b==0) {
                        System.out.println("треугольников с нулевыми сторонами НЕ БЫВАЕТ!!!");
                        break;}
                    task3(a,b);

                    break;
                }
                case 4:{
                    System.out.println("введите координаты Х и Y  :");
                    Scanner test4=new Scanner(System.in);
                    while(!test4.hasNextDouble()) {
                        System.out.println("введите корректную координату :");
                        test4.nextLine();
                    }
                    double x=test4.nextDouble();

                    while(!test4.hasNextDouble()) {
                        System.out.println("введите корректную координату :");
                        test4.nextLine();
                    }
                    double y=test4.nextDouble();
                    if(task4(x,y))
                        System.out.println("Введенные координаты лежат в нужной области  :)");
                    else
                        System.out.println("Введенные координаты НЕ лежат в нужной области  :(");

                    break;

                }
                case 5:{
                    Scanner test5=new Scanner(System.in);
                    System.out.println("введите действительные числа");
                    while(!test5.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test5.nextLine();
                    }
                    double a=test5.nextDouble();

                    while(!test5.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test5.nextLine();
                    }
                    double b=test5.nextDouble();

                    while(!test5.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test5.nextLine();
                    }
                    double c=test5.nextDouble();
                    task5(a,b,c);

                    break;

                }
                case 6:{
                    Scanner test6=new Scanner(System.in);
                    System.out.println("введите вводные данные");
                    while(!test6.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test6.nextLine();
                    }
                    double a=test6.nextDouble();

                    while(!test6.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test6.nextLine();
                    }
                    double b=test6.nextDouble();

                    while(!test6.hasNextDouble()){
                        System.out.println("введены некоректные данные, повторите >");
                        test6.nextLine();
                    }
                    double c=test6.nextDouble();
                    System.out.println("сумма макс и мин чисел равна " + task6(a, b, c));

                    break;

                }
                case 7:{
                    System.out.println("Введите интервал А-В");
                    Scanner test7=new Scanner(System.in);
                    int a=test7.nextInt();
                    int b=test7.nextInt();
                    System.out.println("Введите шаг");
                    int h=test7.nextInt();
                    task7(a,b,h);

                    break;

                }
                case 8:{
                    System.out.println("введите размер массива");
                    Scanner test8=new Scanner(System.in);
                    while(!test8.hasNextInt()){
                        test8.nextLine();
                        System.out.println("некорректное число..");
                    }
                    int arr[]=new int[test8.nextInt()];
                    System.out.println("размер массива -"+arr.length);
                    System.out.println("а теперь введите  целочисленные элементы массива >>");
                    for(int x=0;x<arr.length;x++) {
                        while (!test8.hasNextInt()) {
                            test8.nextLine();
                            System.out.println("некорректное число..");
                        }
                        arr[x]=test8.nextInt();
                    }
                    System.out.println("ваш массив -"+Arrays.toString(arr));
                    System.out.println("введите целочисленное число К:");
                    while(!test8.hasNextInt()){
                        test8.nextLine();
                        System.out.println("некорректное число..");
                    }
                    int k=test8.nextInt();
                    System.out.println("сумма кратных К элементов массива равна -> "+task8(arr,k));
                    System.out.println();

                    break;
                }
                case 9:{
                    System.out.println("здеся всего один стандартный метод System.arraycopy ...в чем подвох?)");
                    break;
                }
                case 10:{
                    task10(5);
                    System.out.println("Загрузка");
                    waity();

                    System.out.println("в разработке  :(");
                    break;
                }

            }

        }while(choise>0||choise<11);


    }



}

