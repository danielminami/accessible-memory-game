package com.minamid.accessiblememorygame.util;

public class Config {
    private static final Config ourInstance = new Config();

    /*
    public static final String url = "https://shopicruit.myshopify.com/";
    public static final String imageEndPoint = "/admin/products.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6";
    */
    public static final String URL = "https://api.imgur.com";
    public static final String IMAGE_LIST_ENDPOINT = "/3/album/AoJOSZl";
    public static final String CLIENT_ID = "Client-ID 5d0704704a62d33";


    public static final int timeBoardRevealed = 60;

    public static Config getInstance() {
        return ourInstance;
    }

    private Config() {

    }

}
