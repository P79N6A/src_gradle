package com.bytedance.apm.i.b;

import com.bytedance.apm.c;
import com.bytedance.apm.d.d;
import com.bytedance.frameworks.baselib.a.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    b f2004a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f2005b;

    /* renamed from: c  reason: collision with root package name */
    boolean f2006c;

    /* renamed from: d  reason: collision with root package name */
    int f2007d;

    public final boolean a() {
        if (this.f2005b == 1800000) {
            return true;
        }
        return false;
    }

    public a(final String str) {
        this.f2004a = new b(c.a(), new b.a() {
            public final String a() {
                return str;
            }

            public final int c() {
                return com.bytedance.apm.i.a.c.f2003a.b();
            }

            public final List<String> b() {
                return com.bytedance.apm.i.a.c.f2003a.a(str);
            }

            public final long d() {
                return (long) (com.bytedance.apm.i.a.c.f2003a.c() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            }
        }, new b.c() {
            public final boolean a() {
                return com.bytedance.apm.i.a.c.f2003a.e();
            }

            public final long b() {
                return a.this.f2005b;
            }

            public final boolean c() {
                return a.this.f2006c;
            }

            public final long d() {
                return com.bytedance.apm.i.a.c.f2003a.d() * 1000;
            }
        }) {
            public final boolean a(String str, byte[] bArr) {
                boolean z;
                if (d.a() != null) {
                    e a2 = d.a().a(str, bArr);
                    if (a2.f19020a > 0) {
                        a.this.f2006c = false;
                        if (a2.f19020a != 200 || a2.f19021b == null) {
                            if (500 <= a2.f19020a && a2.f19020a <= 600) {
                                a.this.a(false);
                                return false;
                            }
                        } else if ("success".equals(a2.f19021b.opt("message"))) {
                            a aVar = a.this;
                            aVar.f2007d = 0;
                            aVar.f2005b = 0;
                            d.a().f1975a = false;
                            com.bytedance.apm.i.c.a().a(true, 0);
                            return true;
                        } else {
                            if (a2.f19021b.optInt("is_crash", 0) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean equals = "drop data".equals(a2.f19021b.opt("message"));
                            if (z || equals) {
                                a.this.a(true);
                                return false;
                            }
                            a.this.a(false);
                            return false;
                        }
                    } else {
                        a.this.f2006c = true;
                    }
                }
                return false;
            }
        };
    }

    public final boolean a(String str) {
        if (c.d()) {
            new String[1][0] = str;
        }
        return this.f2004a.a(str);
    }

    public final void a(boolean z) {
        if (z) {
            this.f2005b = 1800000;
            this.f2007d = 3;
        } else if (this.f2007d == 0) {
            this.f2005b = 300000;
            this.f2007d++;
        } else if (this.f2007d == 1) {
            this.f2005b = 900000;
            this.f2007d++;
        } else {
            int i = this.f2007d;
            this.f2005b = 1800000;
            this.f2007d++;
        }
        d.a().f1975a = true;
        com.bytedance.apm.i.c.a().a(false, this.f2005b);
    }
}
