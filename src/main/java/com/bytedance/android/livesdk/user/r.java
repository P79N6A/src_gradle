package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;

public final /* synthetic */ class r implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17502a;

    /* renamed from: b  reason: collision with root package name */
    private final l f17503b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17504c;

    r(l lVar, long j) {
        this.f17503b = lVar;
        this.f17504c = j;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17502a, false, 13576, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f17502a, false, 13576, new Class[]{Object.class}, Object.class);
        }
        l lVar = this.f17503b;
        long j = this.f17504c;
        int i = ((c) ((d) obj).f7871b).f17441a;
        a aVar = new a();
        if (i == 1) {
            aVar.f18692d = 1;
        } else if (i == 2) {
            aVar.f18692d = 2;
        } else {
            aVar.f18692d = 0;
        }
        aVar.f18689a = j;
        lVar.f17467c.a(aVar.f18692d, aVar.f18689a);
        lVar.f17470f.onNext(aVar);
        return aVar;
    }
}
