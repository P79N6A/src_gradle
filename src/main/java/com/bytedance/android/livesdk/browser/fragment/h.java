package com.bytedance.android.livesdk.browser.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9384a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9385b;

    h(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9385b = tTLiveBrowserFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9384a, false, 3542, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9384a, false, 3542, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.f9385b;
        if (PatchProxy.isSupport(new Object[0], tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3513, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            jSONObject.put("args", jSONObject2);
            tTLiveBrowserFragment.a("H5_loginStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
