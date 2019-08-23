package com.loc;

import android.content.Context;
import android.text.TextUtils;

public final class bi extends bj {

    /* renamed from: b  reason: collision with root package name */
    private int f25526b;

    /* renamed from: c  reason: collision with root package name */
    private long f25527c;

    /* renamed from: d  reason: collision with root package name */
    private String f25528d;

    /* renamed from: e  reason: collision with root package name */
    private Context f25529e;

    public bi(Context context, int i, String str, bj bjVar) {
        super(bjVar);
        this.f25526b = i;
        this.f25528d = str;
        this.f25529e = context;
    }

    public final void a(boolean z) {
        super.a(z);
        if (z) {
            String str = this.f25528d;
            long currentTimeMillis = System.currentTimeMillis();
            this.f25527c = currentTimeMillis;
            g.a(this.f25529e, str, String.valueOf(currentTimeMillis));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        long j = 0;
        if (this.f25527c == 0) {
            String a2 = g.a(this.f25529e, this.f25528d);
            if (!TextUtils.isEmpty(a2)) {
                j = Long.parseLong(a2);
            }
            this.f25527c = j;
        }
        return System.currentTimeMillis() - this.f25527c >= ((long) this.f25526b);
    }
}
