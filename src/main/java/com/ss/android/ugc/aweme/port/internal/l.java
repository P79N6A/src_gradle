package com.ss.android.ugc.aweme.port.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.monitor.d;
import com.ss.android.ttve.monitor.e;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.port.in.aq;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.ai;
import com.ss.android.vesdk.i;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.runtime.a.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class l implements aq {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61182a;

    /* renamed from: b  reason: collision with root package name */
    VEListener.n f61183b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f61184c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61182a, false, 67204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61182a, false, 67204, new Class[0], Void.TYPE);
        } else if (this.f61184c) {
            e.a(ai.f77889a);
        }
    }

    public final void a(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f61182a, false, 67203, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f61182a, false, 67203, new Class[]{i.class}, Void.TYPE);
        } else if (!this.f61184c) {
            d.a("user_id", iVar.f78000b);
            d.a("device_id", iVar.f78001c);
            a.a().a("KEY_DEVICEID", iVar.f78001c, true);
            d.a("app_version", iVar.f77999a);
            AnonymousClass1 r0 = new VEListener.n() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61185a;

                public final void a(String str, JSONObject jSONObject) {
                    if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f61185a, false, 67205, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f61185a, false, 67205, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                        return;
                    }
                    n.a(str, jSONObject);
                }
            };
            this.f61183b = r0;
            VERuntime a2 = VERuntime.a();
            a2.j = new WeakReference<>(r0);
            e.f31256c = new WeakReference<>(a2.k);
            this.f61184c = true;
        }
    }
}
