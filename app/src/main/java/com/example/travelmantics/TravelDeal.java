package com.example.travelmantics;

public class TravelDeal {
    private String id;
    private String title;
    private String description;
    private String price;
    private  String imageUrl; /*select all variables + right click + refactor + encapsulate + check all to refactor and get /set values*/

    public TravelDeal (){} /*with reference to manifest and listactivity ,otherwise ww will receive an error*/


    public TravelDeal(String title, String description, String price, String imageUrl) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
        this.setPrice(price);
        this.setImageUrl(imageUrl);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    /*Alt + Enter and select all +enter to get the constructor*/

}
