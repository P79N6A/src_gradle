package com.ss.android.sdk.b;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.C0906R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30693a = new c("sina_weibo", 2130837603, C0906R.string.cb9);

    /* renamed from: b  reason: collision with root package name */
    public static final c f30694b = new c("qq_weibo", 2130837602, C0906R.string.cb5);

    /* renamed from: c  reason: collision with root package name */
    public static final c f30695c = new c("qzone_sns", 2130837600, C0906R.string.cb3);

    /* renamed from: d  reason: collision with root package name */
    public static final c f30696d = new c("mobile", 2130837599, C0906R.string.cb2);

    /* renamed from: e  reason: collision with root package name */
    public static final c f30697e = new c("weixin", 2130837604, C0906R.string.cb_);

    /* renamed from: f  reason: collision with root package name */
    public static final c f30698f = new c("toutiao", 2130839825, C0906R.string.cb6);
    public static final c g = new c("toutiao_v2", 2130839825, C0906R.string.cb6);
    public static final c h = new c("flipchat", 2130837597, C0906R.string.caw);
    public static final c[] i = {f30693a, f30694b, f30695c, f30696d, f30697e, f30698f, g, h};
    public static final c[] j = {f30695c, f30693a, f30694b, f30697e, f30698f, g, h};
    public int k;
    public String l;
    public String[] m;
    public final int n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public long s;
    public long t;
    public long u;

    public static c a(String str) {
        for (c cVar : i) {
            if (TextUtils.equals(cVar.l, str)) {
                return cVar;
            }
        }
        return null;
    }

    private c(String str, int i2, int i3) {
        this(str, i2, i3, null);
    }

    private c(String str, int i2, int i3, String[] strArr) {
        this.u = -1;
        this.k = i2;
        this.l = str;
        this.n = i3;
        this.r = "";
        this.m = null;
    }
}
