public class Main {

    public static void main(String[] args) {
        int currentYear = 2022;

        Human maxim = new Human(null, " Минск", 35, " бренд-менеджер");
        Human anya = new Human("Аня", " Москва", 29, null);
        Human katya = new Human("Катя", null, 28, " продакт-менеджер");
        Human artem = new Human("Артем", " Москва", -27, " директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города" + maxim.city + ". Я родился в " + (currentYear - maxim.age) + " году. Я работаю на должности" + maxim.post + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города" + anya.city + ". Я родился в " + (currentYear - anya.age) + " году. Я работаю на должности" + anya.post + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города" + katya.city + ". Я родился в " + (currentYear - katya.age) + " году. Я работаю на должности" + katya.post + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города" + artem.city + ". Я родился в " + (currentYear - artem.age) + " году. Я работаю на должности" + artem.post + ". Будем знакомы!");
    }
}
