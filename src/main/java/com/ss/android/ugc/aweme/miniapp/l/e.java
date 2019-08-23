package com.ss.android.ugc.aweme.miniapp.l;

import a.g;
import a.i;
import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.api.MicroAppApi;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55824a;

    static void a(JSONObject jSONObject, int i, String str) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, 1, str2}, null, f55824a, true, 59548, new Class[]{JSONObject.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, 1, str2}, null, f55824a, true, 59548, new Class[]{JSONObject.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        jSONObject2.put("status_msg", str2);
        jSONObject2.put("status_code", "failed");
    }

    static final /* synthetic */ com.ss.android.ugc.aweme.miniapp_api.model.e a(String str, long j, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) throws Exception {
        try {
            return MicroAppApi.a(str, j);
        } catch (Exception unused) {
            a(jSONObject, 1, "get_relation_api_fail");
            responseCallBack.callResponse(jSONObject.toString());
            return null;
        }
    }

    public static void a(Activity activity, String str, long j, HostMethodManager.ResponseCallBack responseCallBack) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{activity, str, new Long(j2), responseCallBack}, null, f55824a, true, 59547, new Class[]{Activity.class, String.class, Long.TYPE, HostMethodManager.ResponseCallBack.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, new Long(j2), responseCallBack};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f55824a, true, 59547, new Class[]{Activity.class, String.class, Long.TYPE, HostMethodManager.ResponseCallBack.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        f fVar = new f(str, j, jSONObject, responseCallBack);
        i a2 = i.a((Callable<TResult>) fVar);
        g gVar = new g(activity, j, jSONObject, responseCallBack);
        a2.a((g<TResult, TContinuationResult>) gVar, i.f1052b);
    }
}
