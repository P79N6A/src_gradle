package com.bytedance.android.livesdk.browser.fragment;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9372a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9373b;

    b(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9373b = tTLiveBrowserFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9372a, false, 3536, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9372a, false, 3536, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.f9373b;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3515, new Class[]{a.class}, Void.TYPE)) {
            TTLiveBrowserFragment tTLiveBrowserFragment2 = tTLiveBrowserFragment;
            PatchProxy.accessDispatch(new Object[]{aVar}, tTLiveBrowserFragment2, TTLiveBrowserFragment.f9357a, false, 3515, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "follow");
                jSONObject2.put("user_id", String.valueOf(aVar.f18689a));
                jSONObject2.put("follow_status", aVar.a());
                jSONObject.put("args", jSONObject2);
                tTLiveBrowserFragment.a("H5_userStatusChange", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
