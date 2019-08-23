package com.ss.android.ugc.aweme.fe.method.auth;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class AuthMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44526a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f44527b;

    public AuthMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f44527b = weakReference;
    }

    public final void a(JSONObject jSONObject, final BaseCommonJavaMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f44526a, false, 39850, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f44526a, false, 39850, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject != null) {
            String optString = jSONObject.optString("type");
            String optString2 = optJSONObject.optString("info_str");
            if (!TextUtils.isEmpty(optString) && this.f44527b.get() != null) {
                ((IWalletService) ServiceManager.get().getService(IWalletService.class)).auth((Context) this.f44527b.get(), optString, optString2, new IWalletService.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44528a;

                    public final void onSuccess(JSONObject jSONObject) {
                        JSONObject jSONObject2 = jSONObject;
                        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f44528a, false, 39851, new Class[]{JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f44528a, false, 39851, new Class[]{JSONObject.class}, Void.TYPE);
                            return;
                        }
                        aVar.a((Object) jSONObject2);
                    }

                    public final void onFail(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f44528a, false, 39852, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f44528a, false, 39852, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        aVar.a(-1, exc.getMessage());
                    }
                });
            }
        }
    }
}
