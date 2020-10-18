public class Barman {
    public static void main(String[] args) {

        Person person = new Person("Jan", "Kowalski", 19);

        Drink drink = new Drink("Mojito", 11.99, true);
        
        if (person.getAge() > 18 && drink.isAlcohol() == true) {
            System.out.println(person.getFirstName()
            () + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty " + drink.getPrice());
        } else {
            System.out.println("Jesteś za młody, nie ma picia");
        }

    }
}
