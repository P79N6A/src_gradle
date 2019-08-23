package com.bytedance.android.livesdk.feed;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13986a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f13987b = c.f14064a.booleanValue();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f13988c = "fg".equals("douyin");

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f13989d = "vigo".equals("douyin");

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f13990e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f13991f = "douyin".equals("hotsoon");
    public static final String g;
    public static final String h;
    public static final String[] i = {"dm16.byteoversea.com", "dm.toutiao.com", "dm.bytedance.com", "dm.pstatp.com"};
    public static final String[] j = {"wo", "SAMSUNG", "google", "91dingzhi"};
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (PatchProxy.isSupport(new Object[0], null, f13986a, true, 8352, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], null, f13986a, true, 8352, new Class[0], String.class);
        } else if (!f13987b) {
            str = "huoshan_android";
        } else if (TextUtils.equals("fg", "douyin")) {
            str = "flipagram_android";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str = "hypstar_android";
        } else {
            str = "hypstar_android";
        }
        g = str;
        if (PatchProxy.isSupport(new Object[0], null, f13986a, true, 8351, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], null, f13986a, true, 8351, new Class[0], String.class);
        } else if (!f13987b) {
            str2 = " live_stream_";
        } else if (TextUtils.equals("fg", "douyin")) {
            str2 = " flipagram_i18n_";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str2 = " live_i18n_";
        } else {
            str2 = " ive_i18n_";
        }
        h = str2;
        if (f13987b) {
            str3 = "https://www.hypstar.com/hotsoon/in_app/faq_delete/";
        } else {
            str3 = "https://www.huoshan.com/inapp/faq/";
        }
        k = str3;
        if (f13987b) {
            str4 = "https://www.hypstar.com/hotsoon/in_app/faq/";
        } else {
            str4 = "https://www.huoshan.com/inapp/faq/";
        }
        l = str4;
        if (PatchProxy.isSupport(new Object[0], null, f13986a, true, 8353, new Class[0], String.class)) {
            str5 = (String) PatchProxy.accessDispatch(new Object[0], null, f13986a, true, 8353, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str5 = "1570022200";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str5 = "1541836912";
        } else {
            str5 = "";
        }
        m = str5;
        if (PatchProxy.isSupport(new Object[0], null, f13986a, true, 8354, new Class[0], String.class)) {
            str6 = (String) PatchProxy.accessDispatch(new Object[0], null, f13986a, true, 8354, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str6 = "472064670264-p830d2k61ivgab1ihaq1oe5u50jf54q9.apps.googleusercontent.com";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str6 = "908812512490-tqgub82rl7tuj6g8n7qvac1e21nqsiop.apps.googleusercontent.com";
        } else {
            str6 = "";
        }
        n = str6;
        if (PatchProxy.isSupport(new Object[0], null, f13986a, true, 8355, new Class[0], String.class)) {
            str7 = (String) PatchProxy.accessDispatch(new Object[0], null, f13986a, true, 8355, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str7 = "WfP3mPeebrOwgRseDaoA9A";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str7 = "ZhcvKT9ZDltWNGqO7s5weH0aY";
        } else {
            str7 = "";
        }
        o = str7;
        if (PatchProxy.isSupport(new Object[0], null, f13986a, true, 8356, new Class[0], String.class)) {
            str8 = (String) PatchProxy.accessDispatch(new Object[0], null, f13986a, true, 8356, new Class[0], String.class);
        } else if (TextUtils.equals("fg", "douyin")) {
            str8 = "P0LoW03UNFPR8oHUBJJPYX7nws3LEba3MbGnzhVrVZ0";
        } else if (TextUtils.equals("vigo", "douyin")) {
            str8 = "IfpxAJzlJ9sFeX5WNWLF1otayTvSFfXFO9JXNmkfCQ7Lh2Bmkt";
        } else {
            str8 = "";
        }
        p = str8;
    }
}
