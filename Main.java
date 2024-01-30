import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> Users = new ArrayList<>();

        while (true) {

            System.out.println("1-SignIn\n2-SignUp\n3-logout");
            int InputLoginMenu = scanner.nextInt();
            String LineConsumer = scanner.nextLine();

            if(InputLoginMenu == 1)
            {
                System.out.print("\033[H\033[2J");
                System.out.println("Give input with this format\nYourusername Password");
                String Input = scanner.nextLine();
                String[] SplitedInput = Input.split(" ");

                Boolean IsUserExists = UserExists(SplitedInput[0], SplitedInput[1], Users);
                if (IsUserExists) 
                {
                    while(true){
                        System.out.print("\033[H\033[2J");
                        System.out.println("Success!\n1-For Platform\n2-For Recipe Searcher\n3-Go back to Menu");
                        int MechanismInput = scanner.nextInt();
                        LineConsumer = scanner.nextLine();

                        if(MechanismInput == 1)
                        {

                        }
                        else if(MechanismInput == 2)
                        {
                            System.out.print("\033[H\033[2J");
                            System.out.println("What you have in the Fridge?");
                            String SecondMechanismInput = scanner.nextLine();
                            ChatGPTAPIExample temp = new ChatGPTAPIExample();
                            String SecondMechanismOutput = temp.APICall(SecondMechanismInput);
                        }
                        else if (MechanismInput == 3) 
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Undefined Input");
                        }
                    }
                }
                else{
                    System.out.println("This User Doesn't exist");
                }
            }
            else if(InputLoginMenu == 2)
            {
                System.out.println("Give input with this format\nYourusername Password Description");
                String Input = scanner.nextLine();
                String[] SplitedInput = Input.split(" ");
                if (SplitedInput.length == 3) 
                {
                    User newUser = new User(SplitedInput[0], Users.size(), SplitedInput[1], SplitedInput[2]);
                    Users.add(newUser);
                    System.out.println("User Created!");
                }
                else
                {
                    System.out.println("Undefined Input");
                }

            }
            else if (InputLoginMenu == 3) 
            {
                System.out.println("Succesfully Loged Out!");
                break;
            }
            else
            {
                System.out.println("Undefined Input");
            }

        }
    }
    public static boolean UserExists(String username, String password, ArrayList<User> Users) 
    {
        for (User user : Users) 
        {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) 
            {
                return true;
            }
        }
        return false;
    }

}
