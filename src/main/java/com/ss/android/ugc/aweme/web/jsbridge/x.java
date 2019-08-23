package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class x implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76840a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76841b;

    public x(WeakReference<Context> weakReference) {
        this.f76841b = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76840a, false, 90006, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76840a, false, 90006, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (this.f76841b != null && this.f76841b.get() != null) {
            r.a("qr_code_scan_enter", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "h5").f34114b);
            QRCodePermissionActivity.a((Context) this.f76841b.get(), false);
            JSONObject jSONObject2 = null;
            if (hVar.f20623d.has("args")) {
                jSONObject2 = hVar.f20623d.getJSONObject("args");
            }
            if (jSONObject2 != null && jSONObject2.has("should_close_self") && hVar.f20623d.getBoolean("should_close_self")) {
                Context context = (Context) this.f76841b.get();
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }
    }
}
