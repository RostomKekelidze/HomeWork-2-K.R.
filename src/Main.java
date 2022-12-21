
public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        box=box*3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println (" еще можно положить " + capacityLeft + " кг вещей ");

        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println ("общий вес фруктов" + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var pepperWeight = 2;
        var zucchiniWeight =2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + pepperWeight + zucchiniWeight;

        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println ( "общий вес продуктов"  + productsWeight + " кг! ");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println ( " места осталось" + leftWeight + "кг! " );

        productsWeight = productsWeight * 2;
        System.out.println ( " вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println ( " nеперь  места осталось " + leftWeight + " кг! " );

        var overload = ( stuffWeight + productsWeight ) % liftingCapacity;
        System.out.println ( "перегруз на" + overload + " кг! ");

        var productsInOnCar = productsWeight / 2;
        System.out.println ( " Продуктов в одной машине теперь" +  productsInOnCar );

        var bleuBokserWeight = 78.2;
        System.out.println(bleuBokserWeight);
        var redBokserWeight = 82.7;
        System.out.println(redBokserWeight);
        var boksersWeight = bleuBokserWeight + redBokserWeight;
        System.out.println ( "общий вес спортсменов"  + boksersWeight + " кг! ");

        var differenceBoksersWeight = redBokserWeight - bleuBokserWeight;
        System.out.println ( differenceBoksersWeight );

         differenceBoksersWeight  = ( bleuBokserWeight - redBokserWeight ) % liftingCapacity;
        System.out.println ( "разница в весе спортсменов" + differenceBoksersWeight + " кг! ");

        var totalTime = 640;
        System.out.println (totalTime);
        var workers = totalTime / 8;
        System.out.println ("Всего работников в компании" + workers + "человек!");
        var newWorkers = workers + 94;
        System.out.println (newWorkers);
        var workTime = totalTime / newWorkers;
        System.out.println ( "«Если в компании работает 174 человек, то всего" + workTime + "часов работы может быть поделено между сотрудниками");;














    }
}