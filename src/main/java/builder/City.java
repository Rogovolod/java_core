package builder;

import java.util.Date;

public class City {

    private String country;
    private String name;
    private double square;
    private long amountCitizen;
    private Date founded;
    private String climate;

    @Override
    public String toString() {
        return "City{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", square=" + square +
                ", amountCitizen=" + amountCitizen +
                ", founded=" + founded +
                ", climate='" + climate + '\'' +
                '}';
    }

    static class Builder {
        private String country;
        private String name;
        private double square;
        private long amountCitizen;
        private Date founded;
        private String climate;

        Builder buildCountry(String country) {
            this.country = country;
            return this;
        }

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSquare(double square) {
            this.square = square;
            return this;
        }

        Builder buildAmountCitizen(long amountCitizen) {
            this.amountCitizen = amountCitizen;
            return this;
        }

        Builder buildFounded(Date founded) {
            this.founded = founded;
            return this;
        }

        Builder buildClimate(String climate) {
            this.climate = climate;
            return this;
        }

        City build() {
            City city = new City();
            city.name = name;
            city.country = country;
            city.square = square;
            city.amountCitizen = amountCitizen;
            city.founded = founded;
            city.climate = climate;
            return city;
        }

    }

    public static void main(String[] args) {
        City city = new Builder()
                .buildName("Yakutsk")
                .buildClimate("Very bad")
                .buildAmountCitizen(330615L)
                .buildCountry("Ru")
                .buildSquare(122)
                .buildFounded(new Date(-10660643616000L))
                .build();
        System.out.println(city);
    }

}