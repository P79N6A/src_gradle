package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class ak implements d, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76707a;

    /* renamed from: b  reason: collision with root package name */
    protected a f76708b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<Context> f76709c;

    /* renamed from: d  reason: collision with root package name */
    private h f76710d;

    public ak(WeakReference<Context> weakReference, a aVar) {
        this.f76708b = aVar;
        this.f76709c = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76707a, false, 90038, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76707a, false, 90038, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        this.f76710d = hVar;
        this.f76710d.f20625f = false;
        if (hVar.f20623d != null) {
            String optString = hVar.f20623d.optString("platform");
            if (this.f76709c != null) {
                context = (Context) this.f76709c.get();
            } else {
                context = null;
            }
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, optString}, this, f76707a, false, 90040, new Class[]{Context.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, optString}, this, f76707a, false, 90040, new Class[]{Context.class, String.class}, Void.TYPE);
            } else if (context2 instanceof com.ss.android.ugc.aweme.base.activity.d) {
                ((com.ss.android.ugc.aweme.base.activity.d) context2).a(this);
                Intent authorizeActivityStartIntent = c.c().getAuthorizeActivityStartIntent(context2);
                authorizeActivityStartIntent.putExtra("platform", optString);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("IS_AUTHORIZE_ONLY", true);
                ((CrossPlatformActivity) context2).startActivityForResult(authorizeActivityStartIntent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
            }
        }
    }

    public final boolean a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f76707a, false, 90039, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f76707a, false, 90039, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        if (i == 1001 && this.f76710d != null && i2 == -1) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("platform", intent2.getStringExtra("platform"));
                jSONObject2.put("code", intent2.getStringExtra("AUTHORIZE_OK_CODE"));
                jSONObject2.put("state", intent2.getStringExtra("AUTHORIZE_OK_STATE"));
                jSONObject2.put("openid", intent2.getStringExtra("AUTHORIZE_OK_OPEN_ID"));
                jSONObject2.put("access_token", intent2.getStringExtra("AUTHORIZE_OK_ACCESS_TOKEN"));
                jSONObject2.put("expires_in", intent2.getStringExtra("AUTHORIZE_OK_EXPIRE_IN"));
                jSONObject.put("code", 0);
                jSONObject.put("response", jSONObject2);
                this.f76708b.a(this.f76710d.f20621b, jSONObject);
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
