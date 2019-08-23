package com.umeng.message;

public class MsgConstant {
    public static String ALIAS_ENDPOINT = null;
    public static String ALIAS_EXCLUSIVE_ENDPOINT = null;
    public static String ALIAS_LOG = null;
    public static String CARD_MSG_ENDPOINT = (h + "getmsg");
    public static final String DEFAULT_INTENT_SERVICE_CLASS_NAME = UmengIntentService.class.getName();
    public static String DELETE_ALIAS_ENDPOINT = (ALIAS_ENDPOINT + "/delete");
    public static String LAUNCH_ENDPOINT = null;
    public static String LBS_ENDPOINT = null;
    public static String LOC_ENDPOINT = null;
    public static String LOG_ENDPOINT = null;
    public static String REGISTER_ENDPOINT = null;
    public static String SPLASH_MSG_ENDPOINT = null;
    public static String STATS_ENDPOINT = (h + "stats");
    public static String TAG_ENDPOINT = null;
    public static String WEIGHTED_TAG_ENDPOINT = null;

    /* renamed from: b  reason: collision with root package name */
    static long f81065b = 300000;

    /* renamed from: e  reason: collision with root package name */
    private static String f81066e = "msg.umengcloud.com";

    /* renamed from: f  reason: collision with root package name */
    private static String f81067f = null;
    private static String g = "https";
    private static String h = (g + "://" + f81066e + "/admsg/v2/");

    static {
        String str = g + "://" + f81066e + "/";
        LOG_ENDPOINT = str + "push_logs";
        REGISTER_ENDPOINT = str + "register";
        ALIAS_ENDPOINT = str + "alias";
        ALIAS_EXCLUSIVE_ENDPOINT = str + "alias/set";
        LAUNCH_ENDPOINT = str + "launch";
        TAG_ENDPOINT = str + "tag";
        WEIGHTED_TAG_ENDPOINT = str + "tagplus";
        ALIAS_LOG = str + "da";
        LBS_ENDPOINT = str + "lbs";
        LOC_ENDPOINT = str + "loc";
        StringBuilder sb = new StringBuilder();
        sb.append(h);
        sb.append("launch");
        SPLASH_MSG_ENDPOINT = sb.toString();
    }
}
