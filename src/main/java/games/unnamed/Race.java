package games.unnamed;

import java.util.Objects;

public abstract class Race {

    public Race() {
    }

    private String description;
    private int strength;
    private int health;
    private int armor;
    private int agility;
    private int mana;
    private int mastery;
    private boolean isDead;

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }

    @Override
    public String toString() {
        return  ": strength=" + strength +
                ", health=" + health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race)) return false;
        Race race = (Race) o;
        return getStrength() == race.getStrength() && getHealth() == race.getHealth() && getArmor() == race.getArmor() && getAgility() == race.getAgility() && getMana() == race.getMana() && getMastery() == race.getMastery() && isDead() == race.isDead() && Objects.equals(getDescription(), race.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getStrength(), getHealth(), getArmor(), getAgility(), getMana(), getMastery(), isDead());
    }
}
