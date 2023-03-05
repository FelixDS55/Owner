package tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestData {
    static Faker faker = new Faker(new Locale("en"));
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
    static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.number().digits(10),
            currentAddress = faker.address().cityName(),
            gender = genderInputData(),
            dayOfBirth = getRandomDay(),
            monthOfBirth = getRandomMonth(),
            yearOfBirth = getRandomYear(),
            subject = subjectInputData(),
            hobby = hobbyInputData(),
            picPath = "src/test/resources/images.png",
            state = "NCR",
            city = getRandomCity();


    public static String genderInputData() {
        String[] genders = {"Male", "Female", "Other"};
        int index = faker.number().numberBetween(0, genders.length);

        return genders[index];
    }

    public static String subjectInputData() {
        String[] subject = {"Maths", "Chemistry", "Computer Science", "Commerce", "Economics"};
        int index = faker.number().numberBetween(0, subject.length);

        return subject[index];
    }

    public static String hobbyInputData() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int index = faker.number().numberBetween(0, hobbies.length);

        return hobbies[index];

    }

    public static String[] stateAndCity() {
        String[][] test = {{"NCR", "Delhi"},
                {"NCR", "Gurgaon"},
                {"NCR", "Noida"},
                {"Uttar Pradesh", "Agra"},
                {"Uttar Pradesh", "Lucknow"},
                {"Uttar Pradesh", "Merrut"},
                {"Haryana", "Karnal"},
                {"Haryana", "Panipat"},
                {"Rajasthan", "Jaipur"},
                {"Rajasthan", "Jaiselmer"}};
        int index = faker.number().numberBetween(0, test.length);
        return test[index] ;
    }

    static public String getRandomDay() {
        int a = randomValue(1, 28);
        String day = a + "";
        return day;
    }

    static private int randomValue(int origin, int bound) {

        return ThreadLocalRandom.current().nextInt(origin, bound);
    }

    static public String getRandomMonth() {
        String[] genderArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int index = new Random().nextInt(genderArray.length);
        String month = genderArray[index];
        return month;
    }

    static public String getRandomYear() {
        int b = randomValue(1980, 2022);
        String year = b + "";
        return year;
    }

    static public String getRandomCity() {
        String[] genderArray = {"Delhi", "Gurgaon", "Noida"};
        int index = new Random().nextInt(genderArray.length);
        String city = genderArray[index];
        return city;
    }
}

