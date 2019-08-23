package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ed implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10608a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10609b;

    ed(ec ecVar) {
        this.f10609b = ecVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10608a, false, 4874, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10608a, false, 4874, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10609b;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null) {
            q qVar = (q) kVData.getData();
            if (PatchProxy.isSupport(new Object[]{qVar}, ecVar, ec.f10602a, false, 4866, new Class[]{q.class}, Void.TYPE)) {
                ec ecVar2 = ecVar;
                PatchProxy.accessDispatch(new Object[]{qVar}, ecVar2, ec.f10602a, false, 4866, new Class[]{q.class}, Void.TYPE);
                return;
            }
            if (qVar.f10192a == 0 && ecVar.b() != null) {
                ecVar.a();
            }
        }
    }
}
