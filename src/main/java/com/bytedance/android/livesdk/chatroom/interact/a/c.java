package com.bytedance.android.livesdk.chatroom.interact.a;

import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10270a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10271b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10272c;

    c(a aVar, long j) {
        this.f10271b = aVar;
        this.f10272c = j;
    }

    public final void accept(Object obj) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10270a, false, 4610, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10270a, false, 4610, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10271b;
        long j = this.f10272c;
        long longValue = ((Long) obj).longValue();
        if (PatchProxy.isSupport(new Object[]{new Long(j), new Long(longValue)}, aVar, a.f10262a, false, 4608, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j), new Long(longValue)};
            ChangeQuickRedirect changeQuickRedirect = a.f10262a;
            a aVar2 = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect2, false, 4608, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        LinkPKApi b2 = j.q().d().b();
        if (longValue != ((long) aVar.f10265c)) {
            i = 0;
        }
        b2.autoMatch(j, i).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(aVar, longValue), g.f10281b);
    }
}
