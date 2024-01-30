import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> Users = new ArrayList<>();

        while (true) {

            //Menu

            System.out.println("1-SignIn\n2-SignUp\n3-logout");
            int InputLoginMenu = scanner.nextInt();
            String LineConsumer = scanner.nextLine();

            if(InputLoginMenu == 1)
            {
                //Sign In Menu

                System.out.print("\033[H\033[2J");
                System.out.println("Give input with this format\nYourusername Password");
                String Input = scanner.nextLine();
                String[] SplitedInput = Input.split(" ");

                Boolean IsUserExists = UserExists(SplitedInput[0], SplitedInput[1], Users);
                if (IsUserExists) 
                {
                    User CurrentUser = FindUser(SplitedInput[0], SplitedInput[1], Users);

                    while(true){

                        //Mechanism Menu

                        System.out.print("\033[H\033[2J");
                        System.out.println("1-For Platform\n2-For Recipe Searcher\n3-Go back to Menu");
                        int MechanismInput = scanner.nextInt();
                        LineConsumer = scanner.nextLine();

                        if(MechanismInput == 1)
                        {
                            while (true) {
                                System.out.println("1-To Get All of your Contents\n2-To Get All Contents\n3-Create Content\n4-Edit Content\n5-Delete Content\n6-Go back");
                                int PlatformInput = scanner.nextInt();
                                LineConsumer = scanner.nextLine();
    
                                if (PlatformInput == 1) 
                                {
                                    
                                }
                                else if(PlatformInput == 2)
                                {
    
                                }
                                else if(PlatformInput == 3)
                                {
    
                                }
                                else if(PlatformInput == 4)
                                {
    
                                }
                                else if(PlatformInput == 5)
                                {
    
                                }
                                else if(PlatformInput == 6)
                                {
                                    break;
                                }
                            }

                        }
                        else if(MechanismInput == 2)
                        {
                            //API Call On CHATGPT

                            System.out.print("\033[H\033[2J");
                            System.out.println("What you have in the Fridge?");
                            String SecondMechanismInput = scanner.nextLine();
                            ChatGPTAPIExample temp = new ChatGPTAPIExample();
                            String SecondMechanismOutput = temp.APICall(SecondMechanismInput);
                            System.out.println(SecondMechanismOutput);
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
                //Sign Up Menu

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
                //Log out

                System.out.println("Succesfully Loged Out!");
                break;
            }
            else
            {
                System.out.println("Undefined Input");
            }

        }
    }

    //Check If UserExists (For Sign In Menu)
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

    public static User FindUser(String username, String password, ArrayList<User> Users) 
    {
        for (User user : Users) 
        {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) 
            {
                return user;
            }
        }
        return null;
    }

}
