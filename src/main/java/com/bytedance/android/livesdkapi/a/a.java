package com.bytedance.android.livesdkapi.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18613a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f18614b = com.bytedance.android.live.utility.a.f8737a.booleanValue();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f18615c = "fg".equals("douyin");

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f18616d = "vigo".equals("douyin");

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f18617e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f18618f;
    public static final boolean g = "douyin".equals("hotsoon");
    public static final String h;
    public static final String i;
    public static final String[] j = {"dm16.byteoversea.com", "dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};
    public static final String[] k = {"wo", "SAMSUNG", "google", "91dingzhi"};
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;

    static {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if ("musically".equals("douyin") || "tiktok".equals("douyin")) {
            z = true;
        } else {
            z = false;
        }
        f18618f = z;
        if (PatchProxy.isSupport(new Object[0], null, f18613a, true, 14909, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], null, f18613a, true, 14909, new Class[0], String.class);
        } else if (!f18614b) {
            str = "huoshan_android";
        } else if (TextUtils.equals("fg", "douyin")) {
            str = "flipagram_android";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str = "hypstar_android";
        } else {
            str = "hypstar_android";
        }
        h = str;
        if (PatchProxy.isSupport(new Object[0], null, f18613a, true, 14908, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], null, f18613a, true, 14908, new Class[0], String.class);
        } else if (!f18614b) {
            str2 = " live_stream_";
        } else if (TextUtils.equals("fg", "douyin")) {
            str2 = " flipagram_i18n_";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str2 = " live_i18n_";
        } else {
            str2 = " ive_i18n_";
        }
        i = str2;
        if (f18614b) {
            str3 = "https://www.hypstar.com/hotsoon/in_app/faq_delete/";
        } else {
            str3 = "https://www.huoshan.com/inapp/faq/";
        }
        l = str3;
        if (f18614b) {
            str4 = "https://www.hypstar.com/hotsoon/in_app/faq/";
        } else {
            str4 = "https://www.huoshan.com/inapp/faq/";
        }
        m = str4;
        if (PatchProxy.isSupport(new Object[0], null, f18613a, true, 14910, new Class[0], String.class)) {
            str5 = (String) PatchProxy.accessDispatch(new Object[0], null, f18613a, true, 14910, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str5 = "1570022200";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str5 = "1541836912";
        } else {
            str5 = "";
        }
        n = str5;
        if (PatchProxy.isSupport(new Object[0], null, f18613a, true, 14911, new Class[0], String.class)) {
            str6 = (String) PatchProxy.accessDispatch(new Object[0], null, f18613a, true, 14911, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str6 = "472064670264-p830d2k61ivgab1ihaq1oe5u50jf54q9.apps.googleusercontent.com";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str6 = "908812512490-tqgub82rl7tuj6g8n7qvac1e21nqsiop.apps.googleusercontent.com";
        } else {
            str6 = "";
        }
        o = str6;
        if (PatchProxy.isSupport(new Object[0], null, f18613a, true, 14912, new Class[0], String.class)) {
            str7 = (String) PatchProxy.accessDispatch(new Object[0], null, f18613a, true, 14912, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str7 = "WfP3mPeebrOwgRseDaoA9A";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str7 = "ZhcvKT9ZDltWNGqO7s5weH0aY";
        } else {
            str7 = "";
        }
        p = str7;
        if (PatchProxy.isSupport(new Object[0], null, f18613a, true, 14913, new Class[0], String.class)) {
            str8 = (String) PatchProxy.accessDispatch(new Object[0], null, f18613a, true, 14913, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str8 = "P0LoW03UNFPR8oHUBJJPYX7nws3LEba3MbGnzhVrVZ0";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str8 = "IfpxAJzlJ9sFeX5WNWLF1otayTvSFfXFO9JXNmkfCQ7Lh2Bmkt";
        } else {
            str8 = "";
        }
        q = str8;
    }
}
