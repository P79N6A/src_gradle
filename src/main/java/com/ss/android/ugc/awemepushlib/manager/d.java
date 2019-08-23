package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushlib.a.c;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77076a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap[] f77077b;

    /* renamed from: c  reason: collision with root package name */
    private final c f77078c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f77079d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap[] f77080e;

    /* renamed from: f  reason: collision with root package name */
    private final int f77081f;

    d(Bitmap[] bitmapArr, c cVar, Context context, Bitmap[] bitmapArr2, int i) {
        this.f77077b = bitmapArr;
        this.f77078c = cVar;
        this.f77079d = context;
        this.f77080e = bitmapArr2;
        this.f77081f = i;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f77076a, false, 90333, new Class[0], Object.class)) {
            return MessageShowHandler.lambda$proxyShowWithNotification$0$MessageShowHandler(this.f77077b, this.f77078c, this.f77079d, this.f77080e, this.f77081f);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f77076a, false, 90333, new Class[0], Object.class);
    }
}
