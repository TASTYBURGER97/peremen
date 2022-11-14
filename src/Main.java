public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);

        //Task2
        System.out.println("Task2");
        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println (cat);
        paper = paper + 4;
        System.out.println (paper);

        //Task3
        System.out.println("Task3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println (dog1);
        cat = cat - 1.6;
        System.out.println (cat);
        paper = paper - 7639;
        System.out.println (paper);

        //Task4
        System.out.println("Task4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        //Task5
        System.out.println("Task5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        //Task6
        System.out.println("Task6");
        var fighter1Weight = 78.2;
        System.out.println (fighter1Weight);
        var fighter2Weight = 82.7;
        System.out.println (fighter2Weight);
        System.out.println("Общий вес бойцов: " + (fighter1Weight + fighter2Weight + " кг "));
        System.out.println("Разница веса бойцов: " + (fighter2Weight - fighter1Weight + " кг "));


        //Task7
        System.out.println("Task7");
        System.out.println("Разница веса двух бойцов (метод 1): " + (fighter2Weight - fighter1Weight + " кг "));
        System.out.println("Разница веса двух бойцов (метод 2): " + (fighter2Weight % fighter1Weight + " кг "));

        //Task8
        System.out.println("Task8");
        var commonJobHours = 640;
        var dailyJobHours = 8;
        var totalEmployees = commonJobHours/ dailyJobHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        commonJobHours = totalEmployees * dailyJobHours;
        System.out.println ("Если в компании работает " + totalEmployees + " человека, то всего " + commonJobHours + " часов работы может быть поделено между сотрудниками");















    }
}
