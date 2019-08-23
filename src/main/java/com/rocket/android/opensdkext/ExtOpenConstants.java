package com.rocket.android.opensdkext;

public class ExtOpenConstants {

    public static class GroupSource {
        public static int DONGCHEDI = 20;
        public static int DOUYIN = 19;
        public static int HUOSHAN = 16;
        public static int TOUTIAO = 21;
        public static int UNKNOWN = 0;
        public static int XIGUA = 15;

        public static boolean isValid(int i) {
            if (i == XIGUA || i == HUOSHAN || i == DOUYIN || i == DONGCHEDI || i == TOUTIAO) {
                return true;
            }
            return false;
        }
    }
}
