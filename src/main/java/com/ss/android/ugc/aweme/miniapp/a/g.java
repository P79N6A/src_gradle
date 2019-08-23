package com.ss.android.ugc.aweme.miniapp.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.miniapp.q;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55437a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55438b = "g";

    /* renamed from: c  reason: collision with root package name */
    public static final String f55439c = (e.f34153c + q.a().f55895b + "://mini_app");

    public interface a {
        void a(boolean z);
    }

    static final /* synthetic */ Object a(long j, String str) throws Exception {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("creative_id", j);
            jSONObject.put("log_extra", str);
            com.ss.android.ugc.aweme.miniapp_api.a.a().f55981f = jSONObject;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        return null;
    }

    @NonNull
    private static JSONObject a(@NonNull Context context, String str) {
        JSONObject jSONObject;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f55437a, true, 59149, new Class[]{Context.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f55437a, true, 59149, new Class[]{Context.class, String.class}, JSONObject.class);
        }
        try {
            jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("log_extra", str2);
                }
                jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                String networkAccessType = NetworkUtils.getNetworkAccessType(context);
                if (!StringUtils.isEmpty(networkAccessType)) {
                    jSONObject.put("nt", networkAccessType);
                }
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = null;
        }
        return jSONObject;
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f55437a, true, 59144, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f55437a, true, 59144, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null) {
            q.a().i.b(context2, str3, str4);
        }
    }

    public static void a(Context context, String str, long j, String str2) {
        Context context2 = context;
        long j2 = j;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str, new Long(j2), str3}, null, f55437a, true, 59148, new Class[]{Context.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, str, new Long(j2), str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f55437a, true, 59148, new Class[]{Context.class, String.class, Long.TYPE, String.class}, Void.TYPE);
        } else if (context2 != null) {
            r.a(context, "landing_ad", str, String.valueOf(j), 0, a(context2, str3));
        }
    }
}
