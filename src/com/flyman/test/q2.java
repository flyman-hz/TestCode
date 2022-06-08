package com.flyman.test;

public class q2 {
    public static void main(String[] args) {

    }
}
interface Advertisement {
    public void showAdvertisement();
    public String getCorpName();
}

class WhiteCloudCorp implements Advertisement {

    @Override
    public void showAdvertisement() {

    }

    @Override
    public String getCorpName() {
        return "白云有限公司";
    }
}
