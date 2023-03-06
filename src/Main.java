public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, Мир!");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper  = 763789;
        System.out.println(paper);
        dog =dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper +4;
        System.out.println(paper);
        paper = paper -7639;
        System.out.println(paper);
        cat =cat -1.6;
        System.out.println(cat);
        dog =  dog -3.5;
        System.out.println(dog);
        var frient = 19;
        System.out.println(frient);
        frient =frient +2;
        System.out.println(frient);
        frient = frient / 7;
        System.out.println(frient);
        var frog = 3.5;
        System.out.println(frog);
        frog =frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog =frog +4;
        System.out.println(frog);
        var MikeTyson =72.2;
        var MohamedAli = 82.7;
        var capacityLeft = MikeTyson + MohamedAli;
        System.out.println("общий вес "+ capacityLeft);
        var LeftWeight = MohamedAli - MikeTyson;
        System.out.println("разница в весе "+LeftWeight+"кг! ");
        var Overload = MohamedAli % MikeTyson;
        System.out.println("разница в весе с остатком деления "+Overload + "кг! ");
        var hours = 640;
        var SlavaTime = 8;
        var NumberSlaves = hours / SlavaTime;
        System.out.println("Всего работников в компании"+NumberSlaves + "человек " );
        var slave = 94;
        var SommonSlaves = NumberSlaves + slave;
        System.out.println("Общее количество " + SommonSlaves + "работника ");
        var workingHours = hours / SommonSlaves;
        System.out.println("Если в компании работает" + SommonSlaves + "человек,то всего" + workingHours + "часов работы может быть поделено между сотрудниками" );











    }
}