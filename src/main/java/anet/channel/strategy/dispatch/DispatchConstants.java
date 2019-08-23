package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.utils.c;

public class DispatchConstants {
    public static String[] AMDC_SERVER_DOMAIN = {"amdc.m.taobao.com", "amdc.wapa.taobao.com", "amdc.taobao.net"};
    public static String[][] AMDC_SERVER_FIX_IP = {new String[]{c.a(203119206064L), c.a(203119211219L)}, new String[]{c.a(106011052006L)}, null};
    public static String[] initHostArray = new String[0];

    public static String getAmdcServerDomain() {
        return AMDC_SERVER_DOMAIN[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static String[] getAmdcServerFixIp() {
        return AMDC_SERVER_FIX_IP[GlobalAppRuntimeInfo.getEnv().getEnvMode()];
    }

    public static boolean isAmdcServerDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase(getAmdcServerDomain());
    }

    public static void setAmdcServerFixIp(String[][] strArr) {
        if (strArr == null || strArr.length < 2) {
            throw new IllegalArgumentException("ips is null or length < 2");
        }
        AMDC_SERVER_FIX_IP = strArr;
    }

    public static void setAmdcServerDomain(String[] strArr) {
        if (strArr == null || strArr.length < 2) {
            throw new IllegalArgumentException("domains is null or length < 2");
        }
        int i = 0;
        while (i < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i])) {
                i++;
            } else {
                throw new IllegalArgumentException("domains[" + i + "] is null or empty");
            }
        }
        AMDC_SERVER_DOMAIN = strArr;
    }
}
