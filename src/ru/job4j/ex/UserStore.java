package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(User.getUsername())) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("User not found.");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() == false) {
            throw new UserInvalidException("User is not validate");
        } else {
            rsl = true;
        }
        if (user.getUsername().length < 3) {
                throw new UserInvalidException("Name is too short.");
            } else {
            rsl = true;
        }
        return rsl;
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
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
        }

    }