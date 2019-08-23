package com.xiaomi.push;

import android.content.Context;

public final class fl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f82062a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f391a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f392a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f82063b;

    fl(Context context, String str, int i, String str2) {
        this.f391a = context;
        this.f392a = str;
        this.f82062a = i;
        this.f82063b = str2;
    }

    public final void run() {
        fk.c(this.f391a, this.f392a, this.f82062a, this.f82063b);
    }
}
