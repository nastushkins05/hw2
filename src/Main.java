public class Main {
    public static void main(String[] args) {
        System.out.println("Number 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(paper);
        System.out.println(cat);
        System.out.println();

        System.out.println("Number 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(paper);
        System.out.println(cat);
        System.out.println();

        System.out.println("Number 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(paper);
        System.out.println(cat);
        System.out.println();

        System.out.println("Number 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Number 5");
        var f = 3.5;
        System.out.println(f);
        f *= 10;
        System.out.println(f);
        f /= 3.5;
        System.out.println(f);
        f += 4;
        System.out.println(f);
        System.out.println();

        System.out.println("Number 6 & 7");
        var b1 = 78.2;
        var b2 = 82.7;
        System.out.println("Общий вес " + (b1 + b2));
        System.out.println("Разница веса 1 способ " + (b2 - b1));
        System.out.println("Разница веса 2 способ " + (b2 % b1));
        System.out.println();

        System.out.println("Number 8");
        var time = 640;
        var timeforone = 8;
        var worker = time / timeforone;
        System.out.println("Всего работников в компании — " + worker + " человек" );

        System.out.println();
        int newworker = worker + 94;
        var newtime = newworker * timeforone;
        System.out.println("Если в компании работает "+ newworker +" человек, то всего "
                + newtime + " часов работы может быть поделено между сотрудниками");

    }
}