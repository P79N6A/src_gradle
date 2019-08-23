package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONException;
import org.json.JSONObject;

public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44445a;

    public EnterUserPostFeedsMethod(a aVar) {
        super(aVar);
    }

    public EnterUserPostFeedsMethod(ReactContext reactContext) {
        super(reactContext);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        Context context;
        String str;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44445a, false, 39748, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44445a, false, 39748, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        Activity activity = null;
        if (this.f3123e != null) {
            context = (Context) this.f3123e.get();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                String optString = jSONObject.optString("user_id");
                int optInt = jSONObject.optInt("task");
                h a2 = h.a();
                j a3 = j.a("aweme://aweme/detail/0");
                if (TextUtils.equals(d.a().getCurUserId(), optString)) {
                    str = "from_profile_self";
                } else {
                    str = "from_profile_other";
                }
                a2.a(activity, a3.a("video_from", str).a("video_type", 0).a("userid", optString).a("task_type", optInt).a());
            }
        }
    }
}
