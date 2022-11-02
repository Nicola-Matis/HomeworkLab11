package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        //Animal
        Dog beagle = new Dog("Rex",3, (short)7, (short)5, (short)10, "Steak","Swimming");
        System.out.println("The dog's name that has been rescued is " + beagle.name + ", It is "
                + beagle.age + " years old" + " and its current health state is " + beagle.healthBar + " on a scale to 10.");
        //Adopter
        Adopter dogAdopter = new Adopter ("Mihai", 400.000);
        System.out.println("The last person to adopt an animal from our centre is " + dogAdopter.name + ".");
        //AnimalFood
        AnimalFood dogFood = new AnimalFood("Canidae", 119.99, 560, true);
        System.out.println("Every dog's meal is perfect if " + dogFood.name + " is present at the table or should we say.. in the bowl? " +
                "However, despite the fame of the brand its price is a deciding factor, not everyone affords to pay " + "$" + dogFood.price +
                " for only 10 servings of the dog's favorite food, love can only get you so far!");
        //RecreationalActivities
            RecreationalActivities Activity = new RecreationalActivities("Swimming", 30);
        System.out.println("Rex's favorite activity is " + Activity.name + " and the average session is " + Activity.duration + " minutes long.");
        //Vet
        Vet veterinary = new Vet("Darius",25, "Radiology");
        System.out.println("Ever since Rex has made its way to our shelter he was seen by our dear vet, "+ veterinary.name + " and who was alwayshappy to take care of Rex, up to this moment.");

    }
}
