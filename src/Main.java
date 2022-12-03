public class Main {
    public static void main(String[] args) {
        // task 1
            System.out.println("Задача 1");
        int a = 112431;
        byte b = 23;
        short c = 32342;
        long d = 4235436272547L;
        float e = 5.2f;
        double f = 61424.5454876435;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);

        // task 2
            System.out.println("Задача 2");
        float g = 27.12f;
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        // task 3
            System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short lists = 480;
        int listEveryStudent = lists / (class1 + class2 + class3);
            System.out.println("На каждого ученика рассчитано " + listEveryStudent + " листов бумаги");

        // task 4
            System.out.println("Задача 4");
        short bottles = 16;
        short minutes = 2;
        int productivity = bottles / minutes;
        short time1 = 20;
        int productivityTime1 = productivity * time1;
            System.out.println("За " + time1 + " минут машина произвела " + productivityTime1 + " штук бутылок");
        short time2 = 1;
        int productivityTime2 = productivity * time2 * 60 * 24;
            System.out.println("За " + time2 + " сутки машина произвела " + productivityTime2 + " штук бутылок");
        short time3 = 3;
        int productivityTime3 = productivity * time3 * 60 * 24;
            System.out.println("За " + time3 + " суток машина произвела " + productivityTime3 + " штук бутылок");
        short time4 = 1;
        int productivityTime4 = productivity * time4 * 60 * 24 * 31;
            System.out.println("За " + time4 + " месяц машина произвела " + productivityTime4 + " штук бутылок");

        // task 5
            System.out.println("Задача 5");
        short totalColor = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int classroom = whiteColor + brownColor;
        int totalClassroom = totalColor / classroom;
        int totalWhiteColor = totalClassroom * whiteColor;
        int totalBrownColor = totalClassroom * brownColor;
            System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски");

        // task 6
            System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaWeight = 80;
        byte milk100ml = 2;
        byte milkWeight100ml = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggsWeight = 70;
        float cocktailGram = bananas * bananaWeight + milk100ml * milkWeight100ml + iceCream * iceCreamWeight + eggs * eggsWeight;
        float cocktailKilogram = cocktailGram / 1000;
            System.out.println("Вес завтрака " + cocktailGram + " грамм или " + cocktailKilogram + " килограмм");

        // task 7
            System.out.println("Задача 7");
        short loseWeight = 7000;
        short loseWeightPerDay1 = 250;
        short loseWeightPerDay2 = 500;
        int timeLoseWeight1 = loseWeight / loseWeightPerDay1;
        int timeLoseWeight2 = loseWeight / loseWeightPerDay2;
            System.out.println("Чтобы похудеть на " + loseWeight + " грамм, потребуется " + timeLoseWeight1 + " дней, если худеть на " + loseWeightPerDay1 + " грамм в день");
            System.out.println("Чтобы похудеть на " + loseWeight + " грамм, потребуется " + timeLoseWeight2 + " дней, если худеть на " + loseWeightPerDay2 + " грамм в день");
        double loseWeightPerDayAverage = (loseWeightPerDay1 + loseWeightPerDay2) / 2D;
        double timeLoseWeightAverage = loseWeight / loseWeightPerDayAverage;
            System.out.println("В среднем потребуется " + timeLoseWeightAverage + " день");

        // task 8
            System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaNew = (float)masha * 1.1f;
        float denisNew = (float)denis * 1.1f;
        float kristinaNew = (float)kristina * 1.1f;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        double mashaYearNew = mashaNew * 12;
        double denisYearNew = denisNew * 12;
        double kristinaYearNew = kristinaNew * 12;
        double mashaDifference = (float)mashaYearNew - (float)mashaYear;
        double denisDifference = (float)denisYearNew - (float)denisYear;
        double kristinaDifference = (float)kristinaYearNew - (float)kristinaYear;
            System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
            System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
            System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");

    }
}