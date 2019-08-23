package com.bytedance.android.livesdk.live;

import com.bytedance.android.livesdk.live.d;
import com.bytedance.android.livesdk.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.Locale;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15851a;

    /* renamed from: b  reason: collision with root package name */
    private final d f15852b;

    f(d dVar) {
        this.f15852b = dVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15851a, false, 10270, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15851a, false, 10270, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        d dVar = this.f15852b;
        Long l = (Long) obj;
        if (dVar.b() != null) {
            ((d.a) dVar.b()).a(false, n.a(Locale.CHINA, dVar.f15825b, Long.valueOf((10 - l.longValue()) - 1)));
        }
    }
}
