package bank;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Класс описывает аккаунт, который принадлежит пользователю
 * У одного пользователя может быть несколько аккаунтов
 * @author Rogovolod
 * @version 1.0
 */
public class Account {
    /**
     * поле requisite хранит реквизиты аккаунта
     */
    private String requisite;
    /**
     * поле balance отображает баланс доступных средств на счету пользователя
     */
    private BigDecimal balance;

    public Account(String requisite, BigDecimal balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    @Override
    public String toString() {
        return "Account{"
                + "requisite = '" + requisite + '\''
                + ", balance = " + balance
                + '}';
    }
}