package bank;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertEquals(bank.findByPassport("3434").get(), user);
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", BigDecimal.valueOf(150D)));
        assertEquals(bank.findByRequisite("34", "5546"), Optional.empty());
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", BigDecimal.valueOf(150D)));
        assertEquals(bank.findByRequisite("3434", "5546").get().getBalance(), BigDecimal.valueOf(150D));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", BigDecimal.valueOf(150D)));
        bank.addAccount(user.getPassport(), new Account("113", BigDecimal.valueOf(50D)));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", BigDecimal.valueOf(150D));
        assertEquals(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), BigDecimal.valueOf(200D));
        assertEquals(bank.findByRequisite(user.getPassport(), "5546").get().getBalance(), BigDecimal.valueOf(0D));
    }

    @Test
    public void add2Accounts() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("1111", BigDecimal.valueOf(150D)));
        bank.addAccount(user.getPassport(), new Account("1122", BigDecimal.valueOf(300D)));
        assertEquals(bank.findByRequisite("3434", "1111").get().getBalance(), BigDecimal.valueOf(150D));
        assertEquals(bank.findByRequisite("3434", "1122").get().getBalance(), BigDecimal.valueOf(300D));
    }
}