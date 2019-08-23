package com.bytedance.android.livesdk.sign;

import android.app.Activity;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17226a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f17227b;

    /* renamed from: c  reason: collision with root package name */
    private C0120a f17228c;

    /* renamed from: com.bytedance.android.livesdk.sign.a$a  reason: collision with other inner class name */
    interface C0120a {
        void i();
    }

    public a(Activity activity, C0120a aVar) {
        this.f17227b = activity;
        this.f17228c = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f17226a, false, 13329, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f17226a, false, 13329, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        this.f17227b.startActivity(TTLiveSDKContext.getHostService().o().a(this.f17227b));
        if (this.f17228c != null) {
            this.f17228c.i();
        }
    }
}
