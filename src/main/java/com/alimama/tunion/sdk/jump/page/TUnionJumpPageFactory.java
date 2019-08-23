package com.alimama.tunion.sdk.jump.page;

public class TUnionJumpPageFactory {
    public static TUnionJumpDetailPage createJumpDetailPage(String str) {
        TUnionJumpDetailPage tUnionJumpDetailPage = new TUnionJumpDetailPage();
        tUnionJumpDetailPage.f5169a = str;
        return tUnionJumpDetailPage;
    }

    public static TUnionJumpShopPage createJumpShopPage(String str) {
        TUnionJumpShopPage tUnionJumpShopPage = new TUnionJumpShopPage();
        tUnionJumpShopPage.f5170a = str;
        return tUnionJumpShopPage;
    }

    public static TUnionJumpUrlPage createJumpUrlPage(String str) {
        TUnionJumpUrlPage tUnionJumpUrlPage = new TUnionJumpUrlPage();
        tUnionJumpUrlPage.f5171a = str;
        return tUnionJumpUrlPage;
    }
}
