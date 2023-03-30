package com.regex;

    import java.util.Scanner;

    public class UserRegistrationMain {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Welcome to the user registration problem:-) ");
            /** in main method
             * taking integer choose variable  using switch case to calling methods
             * taking integer want variable using do while loop to repeat the switch case
             */
            UserRegistrationProblem operations = new UserRegistrationProblem();
            int choose;
            int want;
            do {
                System.out.println("Press 1 to Check your first name is valid or not. \nPress 2 to Check your last name is valid or not");
                System.out.println("Press 3 to Check your Email Id is valid or not");
                System.out.println("Press 4 to Check your Phone number is valid or not");
                System.out.println("Press 5 to Check your password is valid or not");
                System.out.println("Press 6 to Check EmailId is valid or not");
                choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        operations.validFirstName();
                        break;
                    case 2:
                        operations.validLastName();
                        break;
                    case 3:
                        operations.validEmailId();
                        break;
                    case 4:
                        operations.validPhoneNumber();
                        break;
                    case 5:
                        operations.validPassword();
                        break;
                    case 6:
                        operations.validAllEmailId();
                        break;
                    default:
                        System.out.println("enter valid input");
                        break;
                }
                System.out.println("if you want to continue press 1. And if you don't then press anything and hit enter. ");
                want = sc.nextInt();
            } while (want == 1);
        }
    }


