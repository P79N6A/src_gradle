package com.ss.android.newmedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.profile.d.o;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30206a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f30207b;

    g(JSONObject jSONObject) {
        this.f30207b = jSONObject;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f30206a, false, 18364, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f30206a, false, 18364, new Class[0], Object.class);
        }
        JSONObject jSONObject = this.f30207b;
        if (jSONObject.has("dmt_login_config")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("dmt_login_config");
            if (optJSONObject == null || !optJSONObject.has("enable_authorize_instagram_with_english")) {
                n.f(false);
            } else {
                n.f(optJSONObject.optBoolean("enable_authorize_instagram_with_english", false));
            }
            if (optJSONObject == null || !optJSONObject.has("enalbe_youtube_request_server_auth_code")) {
                o.a(false);
            } else {
                o.a(optJSONObject.optBoolean("enalbe_youtube_request_server_auth_code", false));
            }
        } else {
            n.f(false);
            o.a(false);
        }
        return null;
    }
}
