package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class et implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10648a;

    /* renamed from: b  reason: collision with root package name */
    private final es f10649b;

    et(es esVar) {
        this.f10649b = esVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10648a, false, 4912, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10648a, false, 4912, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        es esVar = this.f10649b;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            q qVar = (q) kVData.getData();
            if (PatchProxy.isSupport(new Object[]{qVar}, esVar, es.f10638a, false, 4905, new Class[]{q.class}, Void.TYPE)) {
                es esVar2 = esVar;
                PatchProxy.accessDispatch(new Object[]{qVar}, esVar2, es.f10638a, false, 4905, new Class[]{q.class}, Void.TYPE);
                return;
            }
            if (esVar.b() != null) {
                int i = qVar.f10192a;
                if (i != 5) {
                    switch (i) {
                        case 0:
                            esVar.a();
                            return;
                        case 1:
                            esVar.c();
                            return;
                    }
                } else {
                    esVar.g();
                }
            }
        }
    }
}
