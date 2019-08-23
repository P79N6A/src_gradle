package com.loc;

import android.content.Context;
import android.text.TextUtils;

public final class bg extends bj {

    /* renamed from: b  reason: collision with root package name */
    private Context f25521b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25522c;

    /* renamed from: d  reason: collision with root package name */
    private int f25523d;

    /* renamed from: e  reason: collision with root package name */
    private int f25524e;

    public bg(Context context, boolean z, int i, int i2) {
        this.f25521b = context;
        this.f25522c = z;
        this.f25523d = i;
        this.f25524e = i2;
    }

    public final void a(int i) {
        if (dc.q(this.f25521b) != 1) {
            String a2 = di.a(System.currentTimeMillis(), "yyyyMMdd");
            String a3 = g.a(this.f25521b, "iKey");
            if (!TextUtils.isEmpty(a3)) {
                String[] split = a3.split("\\|");
                if (split == null || split.length < 2) {
                    g.b(this.f25521b, "iKey");
                } else if (a2.equals(split[0])) {
                    i += Integer.parseInt(split[1]);
                }
            }
            Context context = this.f25521b;
            g.a(context, "iKey", a2 + "|" + i);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        if (dc.q(this.f25521b) == 1) {
            return true;
        }
        if (!this.f25522c) {
            return false;
        }
        String a2 = g.a(this.f25521b, "iKey");
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        String[] split = a2.split("\\|");
        if (split == null || split.length < 2) {
            g.b(this.f25521b, "iKey");
            return true;
        }
        return !di.a(System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || Integer.parseInt(split[1]) < this.f25524e;
    }

    public final int b() {
        int i = (dc.q(this.f25521b) == 1 || this.f25523d <= 0) ? Integer.MAX_VALUE : this.f25523d;
        return this.f25530a != null ? Math.max(i, this.f25530a.b()) : i;
    }
}
