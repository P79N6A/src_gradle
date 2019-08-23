package com.ss.android.ugc.aweme.fe.base;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.sdk.c.a.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseOpenMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44424a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f44425b;

    public final void a(JSONObject jSONObject) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f44424a, false, 39723, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f44424a, false, 39723, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            Activity activity = null;
            if (this.f44425b != null) {
                context = (Context) this.f44425b.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            if (activity != null) {
                if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                    String optString = jSONObject.optString("type");
                    if (!StringUtils.isEmpty(optString) && !optString.contains(":")) {
                        i iVar = new i(b.a().getSSLocalScheme() + "://" + optString);
                        a(jSONObject.optJSONObject("args"), iVar);
                        String a2 = iVar.a();
                        Logger.debug();
                        b.a().startAdsAppActivity(activity, a2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public BaseOpenMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f44425b = weakReference;
    }

    private void a(JSONObject jSONObject, i iVar) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, iVar2}, this, f44424a, false, 39724, new Class[]{JSONObject.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, iVar2}, this, f44424a, false, 39724, new Class[]{JSONObject.class, i.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (obj instanceof Integer) {
                    iVar2.a(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    iVar2.a(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    iVar2.a(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    iVar2.a(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj, iVar2);
                }
            }
        }
    }
}
