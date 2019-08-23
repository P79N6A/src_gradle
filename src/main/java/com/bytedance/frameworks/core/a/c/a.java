package com.bytedance.frameworks.core.a.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.a.b;
import com.bytedance.frameworks.core.a.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    b f19928a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f19929b;

    /* renamed from: c  reason: collision with root package name */
    boolean f19930c;

    /* renamed from: d  reason: collision with root package name */
    int f19931d;

    /* renamed from: e  reason: collision with root package name */
    Context f19932e;

    /* renamed from: f  reason: collision with root package name */
    String f19933f;

    public final boolean a() {
        if (this.f19929b == 1800000) {
            return true;
        }
        return false;
    }

    public final boolean a(String str) {
        return this.f19928a.a(str);
    }

    public a(Context context, final String str, final String str2) {
        this.f19932e = context;
        this.f19933f = str;
        final String str3 = str;
        AnonymousClass3 r0 = new b(context.getApplicationContext(), new b.a() {
            public final String a() {
                return str + str2;
            }

            public final List<String> b() {
                String str = str;
                String str2 = str2;
                if (TextUtils.isEmpty(str) || c.f19882b.get(str) == null) {
                    return c.f19881a.a(str2);
                }
                return c.f19882b.get(str).a(str2);
            }

            public final int c() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f19882b.get(str) == null) {
                    return c.f19881a.h();
                }
                return c.f19882b.get(str).h();
            }

            public final long d() {
                int i;
                String str = str;
                if (TextUtils.isEmpty(str) || c.f19882b.get(str) == null) {
                    i = c.f19881a.i() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                } else {
                    i = c.f19882b.get(str).i() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                }
                return (long) i;
            }
        }, new b.c() {
            public final long b() {
                return a.this.f19929b;
            }

            public final boolean c() {
                return a.this.f19930c;
            }

            public final boolean a() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f19882b.get(str) == null) {
                    return c.f19881a.k();
                }
                return c.f19882b.get(str).k();
            }

            public final long d() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f19882b.get(str) == null) {
                    return c.f19881a.j();
                }
                return c.f19882b.get(str).j();
            }
        }) {
            public final boolean a(String str, byte[] bArr) {
                if (d.a(str3) != null) {
                    e a2 = d.a(str3).a(33554432, str, bArr, 1, "application/json; charset=utf-8");
                    if (a2.f19942a > 0) {
                        a.this.f19930c = false;
                        if (a2.f19942a == 200 && a2.f19943b != null) {
                            if (a2.f19943b.optInt("is_crash", 0) == 1) {
                                a.this.f19929b = 1800000;
                                a.this.f19931d = 3;
                                return false;
                            } else if (a2.f19943b.opt("message").equals("success")) {
                                a.this.f19931d = 0;
                                a.this.f19929b = 0;
                                return true;
                            }
                        }
                        if (500 <= a2.f19942a && a2.f19942a <= 600) {
                            if (a.this.f19931d == 0) {
                                a.this.f19929b = 300000;
                                a.this.f19931d++;
                            } else if (a.this.f19931d == 1) {
                                a.this.f19929b = 900000;
                                a.this.f19931d++;
                            } else {
                                int i2 = a.this.f19931d;
                                a.this.f19929b = 1800000;
                                a.this.f19931d++;
                            }
                            return false;
                        }
                    } else {
                        a.this.f19930c = true;
                    }
                }
                return false;
            }
        };
        this.f19928a = r0;
    }
}
