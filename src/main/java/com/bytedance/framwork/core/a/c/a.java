package com.bytedance.framwork.core.a.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.a.b;
import com.bytedance.framwork.core.a.a.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    b f20098a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f20099b;

    /* renamed from: c  reason: collision with root package name */
    boolean f20100c;

    /* renamed from: d  reason: collision with root package name */
    int f20101d;

    /* renamed from: e  reason: collision with root package name */
    Context f20102e;

    /* renamed from: f  reason: collision with root package name */
    String f20103f;

    public final boolean a() {
        if (this.f20099b == 1800000) {
            return true;
        }
        return false;
    }

    public final boolean a(String str) {
        return this.f20098a.a(str);
    }

    public a(Context context, final String str) {
        this.f20103f = str;
        this.f20102e = context;
        final String str2 = str;
        AnonymousClass3 r0 = new b(context.getApplicationContext(), new b.a() {
            public final String a() {
                return str + "sdk_monitor";
            }

            public final List<String> b() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f20079b.get(str) == null) {
                    return c.f20078a.c();
                }
                return c.f20079b.get(str).c();
            }

            public final int c() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f20079b.get(str) == null) {
                    return c.f20078a.e();
                }
                return c.f20079b.get(str).e();
            }

            public final long d() {
                int i;
                String str = str;
                if (TextUtils.isEmpty(str) || c.f20079b.get(str) == null) {
                    i = c.f20078a.f() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                } else {
                    i = c.f20079b.get(str).f() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                }
                return (long) i;
            }
        }, new b.c() {
            public final long b() {
                return a.this.f20099b;
            }

            public final boolean c() {
                return a.this.f20100c;
            }

            public final boolean a() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f20079b.get(str) == null) {
                    return c.f20078a.h();
                }
                return c.f20079b.get(str).h();
            }

            public final long d() {
                String str = str;
                if (TextUtils.isEmpty(str) || c.f20079b.get(str) == null) {
                    return c.f20078a.g();
                }
                return c.f20079b.get(str).g();
            }
        }) {
            public final boolean a(String str, byte[] bArr) {
                if (d.a(str2) != null) {
                    e a2 = d.a(str2).a(33554432, str, bArr, 1, "application/json; charset=utf-8");
                    if (a2.f20111a > 0) {
                        a.this.f20100c = false;
                        if (a2.f20111a == 200 && a2.f20112b != null) {
                            if (a2.f20112b.optInt("is_crash", 0) == 1) {
                                a.this.f20099b = 1800000;
                                a.this.f20101d = 3;
                                return false;
                            } else if (a2.f20112b.opt("message").equals("success")) {
                                a.this.f20101d = 0;
                                a.this.f20099b = 0;
                                return true;
                            }
                        }
                        if (500 <= a2.f20111a && a2.f20111a <= 600) {
                            if (a.this.f20101d == 0) {
                                a.this.f20099b = 300000;
                                a.this.f20101d++;
                            } else if (a.this.f20101d == 1) {
                                a.this.f20099b = 900000;
                                a.this.f20101d++;
                            } else {
                                int i2 = a.this.f20101d;
                                a.this.f20099b = 1800000;
                                a.this.f20101d++;
                            }
                            return false;
                        }
                    } else {
                        a.this.f20100c = true;
                    }
                }
                return false;
            }
        };
        this.f20098a = r0;
    }
}
