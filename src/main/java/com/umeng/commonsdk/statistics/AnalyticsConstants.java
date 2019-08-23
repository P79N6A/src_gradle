package com.umeng.commonsdk.statistics;

import com.umeng.commonsdk.statistics.common.ULog;

public class AnalyticsConstants {
    public static String[] APPLOG_URL_LIST = {UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    public static boolean CHECK_DEVICE = true;
    public static boolean SUB_PROCESS_EVENT;
    public static final boolean UM_DEBUG = ULog.DEBUG;
    private static int commonDeviceType = 1;

    public static synchronized int getDeviceType() {
        int i;
        synchronized (AnalyticsConstants.class) {
            i = commonDeviceType;
        }
        return i;
    }

    public static void setDeviceType(int i) {
        commonDeviceType = i;
    }
}
