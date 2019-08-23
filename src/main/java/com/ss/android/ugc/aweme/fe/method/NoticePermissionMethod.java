package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.cx;
import com.ss.android.ugc.aweme.utils.cy;
import org.json.JSONException;
import org.json.JSONObject;

public class NoticePermissionMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44461a;

    public NoticePermissionMethod(a aVar) {
        super(aVar);
    }

    public NoticePermissionMethod(ReactContext reactContext) {
        super(reactContext);
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) throws JSONException {
        Context context;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44461a, false, 39787, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44461a, false, 39787, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
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
                Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("toOpen"));
                boolean a2 = cy.a(context);
                if (!a2 && valueOf.booleanValue()) {
                    try {
                        cx.b(context);
                    } catch (Exception unused) {
                        context.startActivity(new Intent("android.settings.SETTINGS"));
                    }
                }
                if (a2) {
                    aVar.a((Object) "");
                } else {
                    aVar.a(0, "");
                }
            }
        }
    }
}
