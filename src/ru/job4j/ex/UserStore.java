package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i])) {
                rsl = i;
                break;
            }
            if (rsl == -1) {
                throw new UserNotFoundException("User not found.");
            }
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() == false) {
            throw new UserInvalidException("User is not validate");
            if (user(String.length(username)) < 3) {
                throw new UserInvalidException("Name is too short.")
            }
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }
        catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
        }

    }
