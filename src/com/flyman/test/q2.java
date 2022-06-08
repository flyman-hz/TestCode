package com.flyman.test;

public class q2 {
    public static void main(String[] args) {
        AdvertisementBoard adv = new AdvertisementBoard();
        adv.show(new WhiteCloudCorp());
        adv.show(new BlackLandCorp());
    }
}
interface Advertisement {
    public void showAdvertisement();
    public String getCorpName();
}

class AdvertisementBoard {
    public void show(Advertisement advertisement) {
        System.out.println(advertisement.getCorpName() + "广告词如下：");
        advertisement.showAdvertisement();//显示广告词
    }
}

class WhiteCloudCorp implements Advertisement {

    @Override
    public void showAdvertisement() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("飞机中的战斗机");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
    }

    @Override
    public String getCorpName() {
        return "白云有限公司";
    }
}
class BlackLandCorp implements Advertisement {

    @Override
    public void showAdvertisement() {
        System.out.println("-----------------");
        System.out.println("劳动是爹");
        System.out.println("劳动是妈");
        System.out.println("abb");
        System.out.println("-----------------");
    }

    @Override
    public String getCorpName() {
        return "黑土集团";
    }
}
