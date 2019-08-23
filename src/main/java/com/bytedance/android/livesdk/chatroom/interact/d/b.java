package com.bytedance.android.livesdk.chatroom.interact.d;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10841a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10842b;

    b(a aVar) {
        this.f10842b = aVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10841a, false, 5046, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10841a, false, 5046, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10842b;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            q qVar = (q) kVData.getData();
            if (PatchProxy.isSupport(new Object[]{qVar}, aVar, a.f10835a, false, 5028, new Class[]{q.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{qVar}, aVar2, a.f10835a, false, 5028, new Class[]{q.class}, Void.TYPE);
                return;
            }
            if (aVar.f10840f && 6 == qVar.f10192a && (qVar.f10193b instanceof Long) && !aVar.f10838d) {
                aVar.f10838d = true;
                aVar.h.add(j.q().d().a().contributorRank(aVar.f10839e.getId(), ((Long) qVar.f10193b).longValue(), 0).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(aVar), new e(aVar)));
            }
        }
    }
}
