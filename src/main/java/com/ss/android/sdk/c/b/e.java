package com.ss.android.sdk.c.b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.ss.android.common.util.i;
import com.ss.android.sdk.c.a.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements d {
    protected WeakReference<Context> mContextRef;

    public e(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
    }

    protected static Activity contextToActivity(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public void open(JSONObject jSONObject) {
        Context context;
        try {
            Activity activity = null;
            if (this.mContextRef != null) {
                context = (Context) this.mContextRef.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            if (activity == null) {
                activity = contextToActivity(context);
            }
            if (activity != null && ((AbsActivity) activity).isActive()) {
                String optString = jSONObject.optString("type");
                if (!StringUtils.isEmpty(optString) && optString.indexOf(58) < 0) {
                    i iVar = new i(b.a().getSSLocalScheme() + "://" + optString);
                    generateUrl(jSONObject.optJSONObject("args"), iVar);
                    b.a().startAdsAppActivity(activity, iVar.a());
                }
            }
        } catch (Exception unused) {
        }
    }

    public void call(h hVar, JSONObject jSONObject) throws Exception {
        open(hVar.f20623d);
        jSONObject.put("code", 1);
    }

    private void generateUrl(JSONObject jSONObject, i iVar) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    iVar.a(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    iVar.a(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    iVar.a(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    iVar.a(next, (String) obj);
                } else if (obj instanceof JSONObject) {
                    generateUrl((JSONObject) obj, iVar);
                }
            }
        }
    }
}
