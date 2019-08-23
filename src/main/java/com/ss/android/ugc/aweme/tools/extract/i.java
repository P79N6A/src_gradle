package com.ss.android.ugc.aweme.tools.extract;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.extract.h;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class i implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74713a;

    /* renamed from: b  reason: collision with root package name */
    private final h.AnonymousClass1 f74714b;

    /* renamed from: c  reason: collision with root package name */
    private final String f74715c;

    /* renamed from: d  reason: collision with root package name */
    private final int f74716d;

    i(h.AnonymousClass1 r1, String str, int i) {
        this.f74714b = r1;
        this.f74715c = str;
        this.f74716d = i;
    }

    public final Object invoke(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f74713a, false, 87069, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f74713a, false, 87069, new Class[]{Object.class}, Object.class);
        }
        h.AnonymousClass1 r0 = this.f74714b;
        String str = this.f74715c;
        int i2 = this.f74716d;
        int currentTimeMillis = (int) (System.currentTimeMillis() - h.this.h);
        a.i.a((Callable<TResult>) new j<TResult>(r0, (Integer) obj, str), a.i.f1052b);
        h hVar = h.this;
        Runnable a2 = h.this.a(i2 + 1);
        if (currentTimeMillis <= 2000) {
            i = 2000 - currentTimeMillis;
        }
        hVar.a(a2, i);
        return Unit.INSTANCE;
    }
}
