package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class be implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67099a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67100b;

    /* renamed from: c  reason: collision with root package name */
    private final String f67101c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67102d;

    /* renamed from: e  reason: collision with root package name */
    private final int f67103e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f67104f;

    be(VEVideoPublishEditActivity vEVideoPublishEditActivity, String str, int i, int i2, boolean z) {
        this.f67100b = vEVideoPublishEditActivity;
        this.f67101c = str;
        this.f67102d = i;
        this.f67103e = i2;
        this.f67104f = z;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f67099a, false, 76481, new Class[0], Object.class)) {
            return this.f67100b.a(this.f67101c, this.f67102d, this.f67103e, this.f67104f);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f67099a, false, 76481, new Class[0], Object.class);
    }
}
