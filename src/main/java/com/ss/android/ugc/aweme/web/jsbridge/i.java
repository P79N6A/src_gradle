package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76789a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<Context> f76790b;

    /* renamed from: c  reason: collision with root package name */
    a f76791c;

    public i(WeakReference<Context> weakReference, a aVar) {
        this.f76790b = weakReference;
        this.f76791c = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76789a, false, 89942, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76789a, false, 89942, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.d.a().queryUser();
        bg.a(new com.ss.android.ugc.aweme.fe.a.a(1));
    }
}
