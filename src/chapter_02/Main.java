package src.chapter_02;
import java.util.Scanner;

public class Main {

    /**1. Name, Age, and Annual Income
     Write a program that declares the following:
     • a String variable named name
     • an int variable named age
     • a double variable named annualPay
     Store your age, name, and desired annual income as literals in these variables. The program
     should display these values on the screen in a manner similar to the following:
     My name is Joe Mahoney, my age is 26, and
     I hope to earn $100000.0 per year.*/
    static void Question1() {

        String name;
        int age;
        double annualPay;

        name = "Affaf";
        age = 23;
        annualPay = 100000;

        System.out.println("My name is " + name + ", my age is " + age + " and");
        System.out.println("I hope to earn $" + annualPay + " per year.");
    }

    /**2. Name and Initials
     Write a program that has the following String variables: firstName, middleName, and
     lastName. Initialize these with your first, middle, and last names. The program should also
     have the following char variables: firstInitial, middleInitial, and lastInitial. Store
     your first, middle, and last initials in these variables. The program should display the contents
     of these variables on the screen.*/
    static void Question2() {

        String firstName = "M";
        String middleName = "Affaf";
        String lastName = "Khan";

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println(firstName + " " + middleName + " " + lastName +
                " (" + firstInitial + middleInitial + lastInitial + ")");

    }

    /**3. Personal Information
     Write a program that displays the following information, each on a separate line:
     • Your name
     • Your address, with city, state, and ZIP
     • Your telephone number
     • Your college major
     Although these items should be displayed on separate output lines, use only a single println
     statement in your program.*/
    static void Question3() {

        String name = "Affaf Khan";
        String address = "109D, Gujranwala, Punjab (05240)";
        int telephone = 4217069;
        String major = "Computer Science";

        System.out.println("Name : " + name + "\nAddress : " + address + "\nTelephone number : "
                + telephone + "\nMajor : " + major);


    }

    /**4. Star Pattern
     Write a program that displays the following pattern:
        *
       ***
      *****
     *******
      *****
       ***
        *
     */
    static void Question4() {

        System.out.println(
                """
                           *
                          ***
                         *****
                        *******
                         *****
                          ***
                           *""");
    }

    /**5. Sales Prediction
     The East Coast sales division of a company generates 62 percent of total sales. Based on
     that percentage, write a program that will predict how much the East Coast division will
     generate if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to
     represent 62 percent.*/
    static void Question5() {

        float TotalSale = 4.6F;
        float EastCostPercentage = 0.62F; // 0.62 represents 62%

        float EastCostSAle = TotalSale * EastCostPercentage;

        System.out.println("Total sale of East Coast sales division is $" + EastCostSAle + " million");
    }

    /**6. Land Calculation
     One acre of land is equivalent to 43,560 square feet. Write a program that calculates the
     number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the
     tract of land by the size of an acre to get the number of acres.*/
    static void Question6() {

        int OneAcre = 43560;
        int SqFt = 389767;

        int UnknownAcre = SqFt / OneAcre;

        System.out.println("389,767 square feet = " + UnknownAcre + " Acre.");
    }

    /**7. Sales Tax
     Write a program that will ask the user to enter the amount of a purchase. The program
     should then compute the state and county sales tax. Assume the state sales tax is 4 percent
     and the county sales tax is 2 percent. The program should display the amount of the purchase,
     the state sales tax, the county sales tax, the total sales tax, and the total of the sale
     (which is the sum of the amount of purchase plus the total sales tax). Hint: Use the value
     0.02 to represent 2 percent, and 0.04 to represent 4 percent.*/
    static void Question7() {

        double PurchaseAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of purchase : ");
        PurchaseAmount = input.nextDouble();

        double StateSalesTax = PurchaseAmount * 0.04;
        double CountySalesTax = PurchaseAmount * .02;
        float TotalTax = (float) (StateSalesTax + CountySalesTax);
        float TotalSale = (float) (PurchaseAmount + TotalTax);

        System.out.println("Amount of purchase = " + PurchaseAmount);
        System.out.println("State sales tax = " + StateSalesTax + " (4%)");
        System.out.println("County sales tax = " + CountySalesTax + " (2%)");
        System.out.println("Total sales tax = " + TotalTax);
        System.out.println("Total of the sale = " + TotalSale);

    }

    /**8. Cookie Calories
     A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
     10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
     user enter the number of cookies he or she actually ate and then reports the number of total
     calories consumed.*/
    static void Question8() {

        int cookiesPerBag = 40;
        int servingsPerBag = 10;
        int caloriesPerBag = 300;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cookies you ate: ");
        int cookiesEaten = input.nextInt();

        double fractionOfBag = (double) cookiesEaten / cookiesPerBag;
        int totalCalories = (int) (fractionOfBag * servingsPerBag * caloriesPerBag);

        System.out.println("You consumed " + totalCalories + " calories.");

    }

    /**A car’s miles-per-gallon (MPG) can be calculated with the following formula:
     MPG = Miles driven / Gallons of gas used
     Write a program that asks the user for the number of miles driven and the gallons of gas
     used. It should calculate the car’s miles-per-gallon and display the result on the screen.*/
    static void Question9() {

                Scanner input = new Scanner(System.in);

                System.out.print("Enter the number of miles driven: ");
                double miles = input.nextDouble();

                System.out.print("Enter the gallons of gas used: ");
                double gallons = input.nextDouble();

                double mpg = miles / gallons;

                System.out.println("The car's Miles-Per-Gallon (MPG) is: " + mpg);
    }

    /**10. Test Average
     Write a program that asks the user to enter three test scores. The program should display
     each test score, as well as the average of the scores.*/

    static void Question10() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st test score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter 2nd test score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter 3rd test score: ");
        double score3 = input.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.println("1st Test Score: " + score1);
        System.out.println("2nd Test Score: " + score2);
        System.out.println("3rd Test Score: " + score3);
        System.out.println("Average of Scores: " + average);

    }

    /**11. Circuit Board Profit
     An electronics company sells circuit boards at a 40 percent profit. If you know the retail
     price of a circuit board, you can calculate its profit with the following formula:
     Profit = Retail price × 0.4
     Write a program that asks the user for the retail price of a circuit board, calculates the
     amount of profit earned for that product, and displays the results on the screen.*/
    static void Question11() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the retail price of the circuit board: ");
        double retailPrice = input.nextDouble();

        double profit = retailPrice * 0.4;

        System.out.println("Profit Earned : " + profit);

    }

    /**12. String Manipulator
     Write a program that asks the user to enter the name of his or her favorite city. Use a String
     variable to store the input. The program should display the following:
     • The number of characters in the city name
     • The name of the city in all uppercase letters
     • The name of the city in all lowercase letters
     • The first character in the name of the city*/
    static void Question12() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of your favorite city: ");
        String favoriteCity = input.nextLine();

        System.out.println("Number of characters in city name: " + favoriteCity.length());
        System.out.println("City name in uppercase: " + favoriteCity.toUpperCase());
        System.out.println("City name in lowercase: " + favoriteCity.toLowerCase());
        System.out.println("First character of city name: " + favoriteCity.charAt(0));

    }

    /**13. Restaurant Bill
     Write a program that computes the tax and tip on a restaurant bill. The program should ask
     the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
     The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
     amount, tip amount, and total bill on the screen.*/
    static void Question13() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the charge for the meal: ");
        double mealCharge = scanner.nextDouble();

        double taxAmount = mealCharge * 0.0675; // 6.75%
        double totalAfterTax = mealCharge + taxAmount;
        double tipAmount = totalAfterTax * 0.20; // 20%
        double totalBill = mealCharge + taxAmount + tipAmount;

        System.out.println("Meal charge: " + mealCharge);
        System.out.println("Tax amount: " + taxAmount);
        System.out.println("Tip amount: " + tipAmount);
        System.out.println("Total bill: " + totalBill);

    }

    /**14. 14. Male and Female Percentages
     Write a program that asks the user for the number of males and the number of females registered
     in a class. The program should display the percentage of males and females in the class.*/
    static void Question14() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of males in the class: ");
        int males = input.nextInt();

        System.out.print("Enter the number of females in the class: ");
        int females = input.nextInt();

        int totalStudents = males + females;

        double percentageOfMales = (double) males / totalStudents * 100.0;
        double percentageOfFemales = (double) females / totalStudents * 100.0;

        System.out.println("Percentage of males: " + percentageOfMales + "%");
        System.out.println("Percentage of females: " + percentageOfFemales + "%");

    }

    /**15. Stock Commission
     Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stockbroker
     a 2 percent commission for the transaction. Write a program that calculates and
     displays the following:
     • The amount paid for the stock alone (without the commission)
     • The amount of the commission
     • The total amount paid (for the stock plus the commission)*/

    static void Question15() {

        int shares = 600;
        double sharePrice = 21.77;
        double commission = 0.02; // 2%

        double stockAmount = shares * sharePrice;
        double commissionAmount = stockAmount * commission;
        double totalAmountPaid = stockAmount + commissionAmount;

        System.out.println("Amount paid for the stock: $" + stockAmount);
        System.out.println("Amount of commission: $" + commissionAmount);
        System.out.println("Total amount paid: $" + totalAmountPaid);
    }

    /**16. Energy Drink Consumption
     A soft drink company recently surveyed 12,467 of its customers and found that approximately
     14 percent of those surveyed purchase one or more energy drinks per week. Of those
     customers who purchase energy drinks, approximately 64 percent of them prefer citrus-flavored
     energy drinks. Write a program that displays the following:
     • The approximate number of customers in the survey who purchase one or more
     energy drinks per week
     • The approximate number of customers in the survey who prefer citrus-flavored
     energy drinks*/
    static void Question16() {

        int totalCustomers = 12467;
        double energyDrinkPercentage = 0.14;
        double citrusPercentage = 0.64;

        double energyDrinkCustomers = totalCustomers * energyDrinkPercentage;
        double citrusCustomers = energyDrinkCustomers * citrusPercentage;

        System.out.println("Approximate number of customers who purchase energy drinks: " + (int) energyDrinkCustomers);
        System.out.println("Approximate number of customers who prefer citrus-flavored energy drinks: " + (int) citrusCustomers);

    }

    /**17. Ingredient Adjuster
     A cookie recipe calls for the following ingredients:
     • 1.5 cups of sugar
     • 1 cup of butter
     • 2.75 cups of flour
     The recipe produces 48 cookies with these amounts of the ingredients. Write a program
     that asks the user how many cookies he or she wants to make, and then displays the number
     of cups of each ingredient needed for the specified number of cookies.*/
    static void Question17() {

        double sugarPerCookie = 1.5 / 48; // cups of sugar per cookie
        double butterPerCookie = 1.0 / 48; // cups of butter per cookie
        double flourPerCookie = 2.75 / 48; // cups of flour per cookie

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cookies you want to make: ");
        int numberOfCookies = input.nextInt();

        // Calculate the amount of each ingredient needed for the specified number of cookies
        double sugar = sugarPerCookie * numberOfCookies;
        double butter = butterPerCookie * numberOfCookies;
        double flour = flourPerCookie * numberOfCookies;

        System.out.println("For " + numberOfCookies + " cookies, you will need:");
        System.out.println("Sugar: " + sugar + " cups");
        System.out.println("Butter: " + butter + " cups");
        System.out.println("Flour: " + flour + " cups");

    }

    /**18. Word Game
     Write a program that plays a word game with the user. The program should ask the user to
     enter the following:
     • His or her name
     • His or her age
     • The name of a city
     • The name of a college
     • A profession
     • A type of animal
     • A pet’s name
     After the user has entered these items, the program should display the following story,
     inserting the user’s input into the appropriate locations:
     There once was a person named NAME who lived in CITY. At the age of AGE,
     NAME went to college at COLLEGE. NAME graduated and went to work as a
     PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
     happily ever after!*/
    static void Question18() {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their information
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter the name of a city: ");
        String city = input.nextLine();

        System.out.print("Enter the name of a college: ");
        String college = input.nextLine();

        System.out.print("Enter a profession: ");
        String profession = input.nextLine();

        System.out.print("Enter a type of animal: ");
        String animal = input.nextLine();

        System.out.print("Enter a pet's name: ");
        String petName = input.nextLine();

        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!");

    }

    /**19. Stock Transaction Program
     Last month Joe purchased some stock in Acme Software, Inc. Here are the details of
     the purchase:
     • The number of shares that Joe purchased was 1,000.
     • When Joe purchased the stock, he paid $32.87 per share.
     • Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
     for the stock.
     Two weeks later Joe sold the stock. Here are the details of the sale:
     • The number of shares that Joe sold was 1,000.
     • He sold the stock for $33.92 per share.
     • He paid his stockbroker another commission that amounted to 2% of the amount he
     received for the stock.
     Write a program that displays the following information:
     • The amount of money Joe paid for the stock.
     • The amount of commission Joe paid his broker when he bought the stock.
     • The amount that Joe sold the stock for.
     • The amount of commission Joe paid his broker when he sold the stock.
     • Display the amount of profit that Joe made after selling his stock and paying the two
     commissions to his broker. (If the amount of profit that your program displays is a
     negative number, then Joe lost money on the transaction.)*/
    static void Question19() {

        int sharesPurchased = 1000;
        double purchasePrice = 32.87;
        double purchaseCommissionRate = 0.02; // 2%
        double salePrice = 33.92;
        double saleCommissionRate = 0.02; // 2%

        double purchaseAmount = sharesPurchased * purchasePrice;
        double purchaseCommission = purchaseAmount * purchaseCommissionRate;
        double totalAmountPaid = purchaseAmount + purchaseCommission;

        double saleAmount = sharesPurchased * salePrice;
        double saleCommission = saleAmount * saleCommissionRate;

        double profitOrLoss = saleAmount - totalAmountPaid - saleCommission;

        System.out.println("Amount Joe paid for the stock: $" + totalAmountPaid);
        System.out.println("Commission Joe paid his broker when he bought the stock: $" + purchaseCommission);
        System.out.println("Amount Joe sold the stock for: $" + saleAmount);
        System.out.println("Commission Joe paid his broker when he sold the stock: $" + saleCommission);
        System.out.println("Joe's profit or loss: $" + profitOrLoss);

    }

    public static void main(String[] args) {

        //Question1();
        //Question2();
        //Question3();
        //Question4();
        //Question5();
        //Question6();
        //Question7();
        //Question8();
        //Question9();
        //Question10();
        //Question11();
        //Question12();
        //Question13();
        //Question14();
        //Question15();
        //Question16();
        //Question17();
        //Question18();
        Question19();
    }
}
