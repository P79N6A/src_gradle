package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.e.a;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class BindPhoneMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3125a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f3126b;

    @Subscribe
    public void onEvent(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3125a, false, 39738, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3125a, false, 39738, new Class[]{a.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "bindPhone");
                jSONObject2.put("code", true ^ TextUtils.isEmpty(aVar2.f31839a) ? 1 : 0);
                if (!TextUtils.isEmpty(aVar2.f31840b)) {
                    jSONObject2.put("_raw", aVar2.f31840b);
                }
                jSONObject.put("args", jSONObject2);
            } catch (JSONException unused) {
            }
            try {
                a("H5_nativeEvent", jSONObject, 3);
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
        }
        if (PatchProxy.isSupport(new Object[0], this, f3125a, false, 39739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3125a, false, 39739, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    public BindPhoneMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f3126b = weakReference;
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar}, this, f3125a, false, 39737, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar}, this, f3125a, false, 39737, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        bg.c(this);
        com.ss.android.ugc.aweme.fe.b.a.a((Context) this.f3126b.get(), jSONObject2);
    }
}
