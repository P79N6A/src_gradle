package com.ss.android.ugc.aweme.u.b;

import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75095a;

    static final /* synthetic */ Object a(JSONObject jSONObject, String str, String str2, Context context) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put("session_id", AwemeAppData.p().am);
        jSONObject2.put("scene", str2);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }

    public static void a(Context context, String str, String str2, JSONObject jSONObject) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, jSONObject2}, null, f75095a, true, 58979, new Class[]{Context.class, String.class, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context2, str3, str4, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f75095a, true, 58979, new Class[]{Context.class, String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new d<TResult>(jSONObject2, str3, str4, context2));
    }
}
