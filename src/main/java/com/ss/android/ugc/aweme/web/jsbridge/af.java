package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.profile.ui.du;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class af implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76685a;

    /* renamed from: b  reason: collision with root package name */
    a f76686b;

    /* renamed from: c  reason: collision with root package name */
    WeakReference<Context> f76687c;

    public af(a aVar, WeakReference<Context> weakReference) {
        this.f76686b = aVar;
        this.f76687c = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76685a, false, 90024, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76685a, false, 90024, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        hVar2.f20625f = false;
        du duVar = new du(p.a().e());
        duVar.a();
        duVar.g = new ag(this, hVar2);
    }
}
