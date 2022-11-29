public class Main {
    public static void main(String[] args) {
        //1
        person Maxim = new person(1988,"Максим", "Минск","бренд-менеджер");
        person Anya = new person(1993,"Аня", "Москва","методист образовательных программ");
        person Katya = new person(1992,"Катя", "Калининград","продакт-менеджер");
        person Artyom = new person(1995,"", "Москва","директор по развитию бизнеса");
        System.out.println(Maxim.toString());
        System.out.println(Anya.toString());
        System.out.println(Katya.toString());
        System.out.println(Artyom.toString());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        //2
        car LadaGranta = new car("Lada","Granta",0,"жёлтый",2015,"Россия");
        car AudiA8 = new car("Audi", "A8", 3.0, "чёрный",2020,"Германия");
        car BmwZ8 = new car("BMW", "Z8", 3.0,"чёрный",2021,"Германия");
        car KiaSportage = new car("Kia", "Sportage", 2.4,"красный",2018,"Южная Корея");
        car HyundaiAvante = new car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        System.out.println(LadaGranta.toString());
        System.out.println(AudiA8.toString());
        System.out.println(BmwZ8.toString());
        System.out.println(KiaSportage.toString());
        System.out.println(HyundaiAvante.toString());

    }
}
