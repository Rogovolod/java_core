package core.array;

import java.util.ArrayList;
import java.util.List;

public class ParseArray {

    public static void main(String[] args) {
        String v1 = "[[[44.7028987,55.7636437],[44.7046341,55.7631999],[44.7063603,55.7629597],[44.7066666,55.7627561],[44.7079194,55.7632103],[44.7077338,55.7634296],[44.7087083,55.7635601],[44.7095064,55.7639935],[44.7109078,55.7632208],[44.7094043,55.7623906],[44.7104066,55.7616439],[44.7124947,55.762495],[44.7114924,55.7630171],[44.7162348,55.7652153],[44.7161698,55.7653719],[44.7144715,55.7665936],[44.7150933,55.7669538],[44.7159378,55.7672932],[44.7164668,55.767643],[44.7166338,55.767951],[44.7162719,55.7686454],[44.7163276,55.7689273],[44.7164575,55.7691413],[44.7163276,55.769371],[44.7147685,55.7703577],[44.7139332,55.7703942],[44.7119008,55.7693554],[44.7095992,55.7686297],[44.708467,55.7680554],[44.7062861,55.7669591],[44.7051631,55.7663326],[44.7035576,55.7647088],[44.7028987,55.7636437]]]";
        String v2 = "[104.817039,50.757633]";
        ParseArray parseArray = new ParseArray();
        System.out.println(parseArray.parseToArray(v2)); // [104.817039,50.757633]
        System.out.println(parseArray.parseToArray(v1)); //

    }

    public List<Coordinates> parseToArray(String string) {
        String[] arrayOfDouble = string.replaceAll("[\\[\\]]", "").split(",");
        List<Coordinates> rsl = new ArrayList<>();
        for (int i = 0; i < arrayOfDouble.length - 1; i++) {
            Coordinates coordinates = new Coordinates();
            if (i % 2 == 0) {
                coordinates.setLng(Double.parseDouble(arrayOfDouble[i]));
                coordinates.setLat(Double.parseDouble(arrayOfDouble[i + 1]));
                rsl.add(coordinates);
            }
        }
        return rsl;
    }

    public class Coordinates {
        private Double lng;
        private Double lat;

        public Double getLng() {
            return lng;
        }

        public void setLng(Double lng) {
            this.lng = lng;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        @Override
        public String toString() {
            return "Coordinates{" +
                    "lng=" + lng +
                    ", lat=" + lat +
                    '}';
        }
    }

}
