package com.umeng.message.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;
import com.umeng.message.common.UmengMessageDeviceConfig;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f81327a;

    /* renamed from: b  reason: collision with root package name */
    public static Uri f81328b;

    /* renamed from: c  reason: collision with root package name */
    public static Uri f81329c;

    /* renamed from: d  reason: collision with root package name */
    public static Uri f81330d;

    /* renamed from: e  reason: collision with root package name */
    public static Uri f81331e;

    /* renamed from: f  reason: collision with root package name */
    public static Uri f81332f;
    public static Uri g;
    public static Uri h;
    public static Uri i;
    public static Uri j;
    public static Uri k;
    private static Context l;
    private static a m;
    private static String n;

    /* renamed from: com.umeng.message.provider.a$a  reason: collision with other inner class name */
    public static class C0869a implements BaseColumns {
        private C0869a() {
        }
    }

    private a() {
    }

    public static a a(Context context) {
        l = context;
        if (m == null) {
            m = new a();
            n = UmengMessageDeviceConfig.getPackageName(context);
            f81327a = n + ".umeng.message";
            f81328b = Uri.parse("content://" + f81327a + "/MessageStores/");
            f81329c = Uri.parse("content://" + f81327a + "/MsgTemps/");
            f81330d = Uri.parse("content://" + f81327a + "/MsgAlias/");
            f81331e = Uri.parse("content://" + f81327a + "/MsgAliasDeleteAll/");
            f81332f = Uri.parse("content://" + f81327a + "/MsgLogStores/");
            g = Uri.parse("content://" + f81327a + "/MsgLogIdTypeStores/");
            h = Uri.parse("content://" + f81327a + "/MsgLogStoreForAgoos/");
            i = Uri.parse("content://" + f81327a + "/MsgLogIdTypeStoreForAgoos/");
            j = Uri.parse("content://" + f81327a + "/MsgConfigInfos/");
            k = Uri.parse("content://" + f81327a + "/InAppLogStores/");
        }
        return m;
    }
}
