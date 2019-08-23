package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;

public class en implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81984a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f317a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ em f318a;

    en(em emVar, Context context, Intent intent) {
        this.f318a = emVar;
        this.f81984a = context;
        this.f317a = intent;
    }

    public void run() {
        this.f318a.b(this.f81984a, this.f317a);
    }
}
