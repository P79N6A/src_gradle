package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ah implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9555a;

    /* renamed from: b  reason: collision with root package name */
    private final af f9556b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9557c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f9558d;

    ah(af afVar, a aVar, Context context) {
        this.f9556b = afVar;
        this.f9557c = aVar;
        this.f9558d = context;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9555a, false, 3739, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9555a, false, 3739, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9556b.a(this.f9557c, this.f9558d);
    }
}
