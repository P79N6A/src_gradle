package com.ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77034a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77035b;

    /* renamed from: c  reason: collision with root package name */
    private final int f77036c;

    /* renamed from: d  reason: collision with root package name */
    private final int f77037d;

    /* renamed from: e  reason: collision with root package name */
    private final int f77038e;

    /* renamed from: f  reason: collision with root package name */
    private final int f77039f;
    private final Handler.Callback g;

    o(int i, int i2, int i3, int i4, int i5, Handler.Callback callback) {
        this.f77035b = i;
        this.f77036c = i2;
        this.f77037d = i3;
        this.f77038e = i4;
        this.f77039f = i5;
        this.g = callback;
    }

    public final boolean handleMessage(Message message) {
        if (!PatchProxy.isSupport(new Object[]{message}, this, f77034a, false, 90236, new Class[]{Message.class}, Boolean.TYPE)) {
            return PushInitializer.a(this.f77035b, this.f77036c, this.f77037d, this.f77038e, this.f77039f, this.g, message);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f77034a, false, 90236, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
    }
}
