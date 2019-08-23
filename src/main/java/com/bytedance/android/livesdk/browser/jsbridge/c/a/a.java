package com.bytedance.android.livesdk.browser.jsbridge.c.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.browser.jsbridge.c.f;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f9447c;

    /* renamed from: d  reason: collision with root package name */
    private WebDialogFragment f9448d;

    public a(WeakReference<Context> weakReference, WebDialogFragment webDialogFragment) {
        super(weakReference);
        this.f9448d = webDialogFragment;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f9447c, false, 3658, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f9447c, false, 3658, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        super.call(hVar, jSONObject);
        if (TextUtils.equals(hVar2.f20623d.optString("type"), "gift_panel")) {
            this.f9448d.dismissAllowingStateLoss();
        }
    }
}
