package com.ss.android.ugc.aweme.fe.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.newmedia.e;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44408a;

    public static void a(Context context, JSONObject jSONObject) {
        Activity activity;
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, jSONObject2}, null, f44408a, true, 39878, new Class[]{Context.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, jSONObject2}, null, f44408a, true, 39878, new Class[]{Context.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
            } else {
                activity = null;
            }
            if (activity != null) {
                if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                    String optString = jSONObject2.optString("type");
                    if (!StringUtils.isEmpty(optString) && optString.indexOf(58) < 0) {
                        i iVar = new i("sslocal://" + optString);
                        a(jSONObject2.optJSONObject("args"), iVar);
                        String a2 = iVar.a();
                        Logger.debug();
                        e.b(activity, a2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void a(JSONObject jSONObject, i iVar) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, iVar2}, null, f44408a, true, 39879, new Class[]{JSONObject.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, iVar2}, null, f44408a, true, 39879, new Class[]{JSONObject.class, i.class}, Void.TYPE);
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
