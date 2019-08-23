package com.alipay.sdk.c;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class e implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f5479a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HashMap f5480b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f5481c;

    public final /* synthetic */ Object call() throws Exception {
        return c.a(this.f5479a, this.f5480b);
    }

    e(c cVar, Context context, HashMap hashMap) {
        this.f5481c = cVar;
        this.f5479a = context;
        this.f5480b = hashMap;
    }
}
