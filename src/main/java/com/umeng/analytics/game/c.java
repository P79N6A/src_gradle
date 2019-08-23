package com.umeng.analytics.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.b;
import com.umeng.analytics.game.b;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.cb;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class c implements bx {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f80321a = MobclickAgent.getAgent();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f80322b = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f80323c = 100;

    /* renamed from: d  reason: collision with root package name */
    private final int f80324d = 1;

    /* renamed from: e  reason: collision with root package name */
    private final int f80325e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final int f80326f = -1;
    private final int g = 1;
    private final String h = "level";
    private final String i = "pay";
    private final String j = "buy";
    private final String k = "use";
    private final String l = "bonus";
    private final String m = "item";
    private final String n = "cash";
    private final String o = "coin";
    private final String p = "source";
    private final String q = "amount";
    private final String r = "user_level";
    private final String s = "bonus_source";
    private final String t = "level";
    private final String u = "status";
    private final String v = "duration";
    private final String w = "curtype";
    private final String x = "orderid";
    private final String y = "UMGameAgent.init(Context) should be called before any game api";
    /* access modifiers changed from: private */
    public Context z;

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        by.b(String.format("Trace sleep time : %b", new Object[]{Boolean.valueOf(z2)}));
        a.f80311a = z2;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i2, double d2, int i3) {
        double d3 = (double) i2;
        Double.isNaN(d3);
        a(d3 * d2, i3);
        a(str, i2, d2);
    }

    public void b() {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (a.f80311a) {
            this.f80322b.a();
        }
    }

    public void a() {
        by.b("App resume from background");
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (a.f80311a) {
            this.f80322b.b();
        }
    }

    public c() {
        a.f80311a = true;
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
        } else {
            a(str, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
        } else {
            a(str, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(final String str) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        this.f80322b.f80312a = str;
        bz.a(new cb() {
            public void a() {
                c.this.f80322b.a(str);
                HashMap hashMap = new HashMap();
                hashMap.put("level", str);
                hashMap.put("status", 0);
                if (c.this.f80322b.f80313b != null) {
                    hashMap.put("user_level", c.this.f80322b.f80313b);
                }
                c.this.f80321a.a(c.this.z, "level", hashMap);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(Context context) {
        if (context == null) {
            by.e("Context is null, can't init GameAgent");
            return;
        }
        this.z = context.getApplicationContext();
        this.f80321a.a((bx) this);
        this.f80322b = new b(this.z);
        this.f80321a.a(context, 1);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f80322b.f80313b = str;
        SharedPreferences a2 = ba.a(this.z);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("userlevel", str);
            edit.commit();
        }
    }

    private void a(final String str, final int i2) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
        } else {
            bz.a(new cb() {
                public void a() {
                    b.a b2 = c.this.f80322b.b(str);
                    if (b2 != null) {
                        long e2 = b2.e();
                        if (e2 <= 0) {
                            by.b("level duration is 0");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("level", str);
                        hashMap.put("status", Integer.valueOf(i2));
                        hashMap.put("duration", Long.valueOf(e2));
                        if (c.this.f80322b.f80313b != null) {
                            hashMap.put("user_level", c.this.f80322b.f80313b);
                        }
                        c.this.f80321a.a(c.this.z, "level", hashMap);
                        return;
                    }
                    by.d(String.format("finishLevel(or failLevel) called before startLevel", new Object[0]));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void a(double d2, int i2) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("coin", Long.valueOf((long) (d2 * 100.0d)));
        hashMap.put("bonus_source", Integer.valueOf(i2));
        if (this.f80322b.f80313b != null) {
            hashMap.put("user_level", this.f80322b.f80313b);
        }
        if (this.f80322b.f80312a != null) {
            hashMap.put("level", this.f80322b.f80312a);
        }
        this.f80321a.a(this.z, "bonus", hashMap);
    }

    /* access modifiers changed from: package-private */
    public void a(double d2, double d3, int i2) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cash", Long.valueOf((long) (d2 * 100.0d)));
        hashMap.put("coin", Long.valueOf((long) (d3 * 100.0d)));
        hashMap.put("source", Integer.valueOf(i2));
        if (this.f80322b.f80313b != null) {
            hashMap.put("user_level", this.f80322b.f80313b);
        }
        if (this.f80322b.f80312a != null) {
            hashMap.put("level", this.f80322b.f80312a);
        }
        this.f80321a.a(this.z, "pay", hashMap);
    }

    /* access modifiers changed from: package-private */
    public void b(String str, int i2, double d2) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item", str);
        hashMap.put("amount", Integer.valueOf(i2));
        double d3 = (double) i2;
        Double.isNaN(d3);
        hashMap.put("coin", Long.valueOf((long) (d3 * d2 * 100.0d)));
        if (this.f80322b.f80313b != null) {
            hashMap.put("user_level", this.f80322b.f80313b);
        }
        if (this.f80322b.f80312a != null) {
            hashMap.put("level", this.f80322b.f80312a);
        }
        this.f80321a.a(this.z, "use", hashMap);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i2, double d2) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item", str);
        hashMap.put("amount", Integer.valueOf(i2));
        double d3 = (double) i2;
        Double.isNaN(d3);
        hashMap.put("coin", Long.valueOf((long) (d3 * d2 * 100.0d)));
        if (this.f80322b.f80313b != null) {
            hashMap.put("user_level", this.f80322b.f80313b);
        }
        if (this.f80322b.f80312a != null) {
            hashMap.put("level", this.f80322b.f80312a);
        }
        this.f80321a.a(this.z, "buy", hashMap);
    }

    /* access modifiers changed from: package-private */
    public void a(double d2, String str, int i2, double d3, int i3) {
        double d4 = (double) i2;
        Double.isNaN(d4);
        a(d2, d3 * d4, i3);
        a(str, i2, d3);
    }

    /* access modifiers changed from: package-private */
    public void a(double d2, String str, double d3, int i2, String str2) {
        if (this.z == null) {
            by.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (d2 >= 0.0d && d3 >= 0.0d) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str) && str.length() > 0 && str.length() <= 3) {
                hashMap.put("curtype", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    int length = str2.getBytes("UTF-8").length;
                    if (length > 0 && length <= 1024) {
                        hashMap.put("orderid", str2);
                    }
                } catch (UnsupportedEncodingException unused) {
                }
            }
            hashMap.put("cash", Long.valueOf((long) (d2 * 100.0d)));
            hashMap.put("coin", Long.valueOf((long) (d3 * 100.0d)));
            hashMap.put("source", Integer.valueOf(i2));
            if (this.f80322b.f80313b != null) {
                hashMap.put("user_level", this.f80322b.f80313b);
            }
            if (this.f80322b.f80312a != null) {
                hashMap.put("level", this.f80322b.f80312a);
            }
            this.f80321a.a(this.z, "pay", hashMap);
        }
    }
}
