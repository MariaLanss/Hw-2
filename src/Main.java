public class Main {
    public static void main(String[] args) {
        // write your code here
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var capacityLeft = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + capacityLeft + " кг");

        var difference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров составляет " + difference + " кг!");
        var difference1 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе боксеров составляет " + difference1 + " кг!");

        var commonHours = 640;
        var oneEmployee = 8;
        var totalEmployees = commonHours / oneEmployee;
        System.out.println("Всего работников в компании " + totalEmployees);

        var newEmployees = 94;
        var staff = newEmployees + totalEmployees;
        var hours = staff * oneEmployee;
        var employee = hours / staff;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");

    }

}