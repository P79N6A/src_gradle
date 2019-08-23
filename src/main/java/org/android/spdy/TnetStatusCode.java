package org.android.spdy;

public final class TnetStatusCode {
    public static final int getErrno(int i) {
        if (i <= -3800) {
            return 0;
        }
        if (i <= -3500) {
            return -3500 - i;
        }
        if (i <= -3000) {
            return -3000 - i;
        }
        if (i <= -2500) {
            return -2500 - i;
        }
        if (i <= -2300) {
            return -2300 - i;
        }
        if (i <= -2100) {
            return -2100 - i;
        }
        return 0;
    }

    public static final int getStatusCode(int i) {
        if (i <= -3800) {
            return i;
        }
        if (i <= -3500) {
            return -3500;
        }
        if (i <= -3000) {
            return -3000;
        }
        if (i <= -2500) {
            return -2500;
        }
        if (i <= -2300) {
            return -2300;
        }
        if (i <= -2100) {
            return -2100;
        }
        return i;
    }

    public static final int getReqStage(int i) {
        int statusCode = getStatusCode(i);
        if (!(statusCode == -3000 || statusCode == -2500 || statusCode == -2030)) {
            if (statusCode == -2017 || statusCode == -2010) {
                return -3;
            }
            if (!(statusCode == -2003 || statusCode == -2001)) {
                if (statusCode == 0) {
                    return 0;
                }
                switch (statusCode) {
                    case -2037:
                    case -2036:
                        break;
                    default:
                        return -2;
                }
            }
        }
        return -1;
    }
}
