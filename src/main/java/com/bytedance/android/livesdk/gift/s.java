package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdk.j.a.a;
import com.bytedance.android.livesdk.j.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final /* synthetic */ class s implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15469a;

    /* renamed from: b  reason: collision with root package name */
    private final q f15470b;

    s(q qVar) {
        this.f15470b = qVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15469a, false, 9314, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15469a, false, 9314, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        q qVar = this.f15470b;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            Iterator<q.a> it2 = qVar.f15402c.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        qVar.f15403d = false;
        String message = th.getMessage();
        if (PatchProxy.isSupport(new Object[]{message}, null, o.f15142a, true, 9289, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, null, o.f15142a, true, 9289, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", message);
        e.a(o.a("ttlive_prop_list_status"), 1, 0, (Map<String, Object>) hashMap);
        e.a(o.b("ttlive_prop_list_status"), 1, (Map<String, Object>) hashMap);
        a.a().a(b.Gift.info, "ttlive_prop_list_status", 1, (Map) hashMap);
    }
}
