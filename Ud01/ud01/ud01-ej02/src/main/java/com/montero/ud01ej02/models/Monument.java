package com.montero.ud01ej02.models;


public class Monument {

    private final long id;
    private final String code;
    private final String countryName;
    private final String cityName;
    private final String location;
    private final String name;
    private final String photoURL;

    public Monument(long id, String code, String countryName, String cityName, String location, String name, String photoURL) {
        this.id = id;
        this.code = code;
        this.countryName = countryName;
        this.cityName = cityName;
        this.location = location;
        this.name = name;
        this.photoURL = photoURL;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getPhotoURL() {
        return photoURL;
    }
}
