package models;

import java.util.ArrayList;

    public class Hotel {
        private String name;
        private  String country;
        private  String city;
        private  double stars;
        private  ArrayList<Room> rooms;

        public Hotel (String name, String country, String city,Double stars){
            this.name = name;
            this.country = country;
            this.city = city;
            this.stars = stars;
        }

        public  String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public  String getCountry() {
            return country;
        }

        public  void setCountry(String country) {
            this.country = country;
        }

        public  String getCity() {
            return city;
        }

        public  void setCity(String city) {
            this.city = city;
        }

        public  double getStars() {
            return stars;
        }

        public  void setStars(double stars) {
            this.stars = stars;
        }



}
