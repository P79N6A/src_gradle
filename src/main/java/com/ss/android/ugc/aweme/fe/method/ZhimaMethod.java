package com.ss.android.ugc.aweme.fe.method;

import a.g;
import a.i;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.b.a.e;
import com.ss.android.ugc.aweme.base.e.c;
import com.ss.android.ugc.aweme.crossplatform.business.k;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cw;
import com.ss.android.ugc.aweme.verify.a;
import com.ss.android.ugc.aweme.verify.api.ZhimaVerifyApi;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class ZhimaMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3129a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<Context> f3130b;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) throws Exception {
        if (iVar.b()) {
            a(a(1, (String) iVar.e()));
        } else {
            a(a(0, ""));
        }
        return null;
    }

    @Subscribe
    public void onVerifyEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3129a, false, 39839, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3129a, false, 39839, new Class[]{a.class}, Void.TYPE);
            return;
        }
        i.a(i.f44595b).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(this), i.f1052b);
        bg.d(this);
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f3129a, false, 39841, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f3129a, false, 39841, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("type", "zmCert");
            jSONObject3.put("args", jSONObject2);
            try {
                a("H5_nativeEvent", jSONObject3, 3);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
        }
    }

    public ZhimaMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f3130b = weakReference;
    }

    private JSONObject a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f3129a, false, 39840, new Class[]{Integer.TYPE, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f3129a, false, 39840, new Class[]{Integer.TYPE, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("_raw", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void a(JSONObject jSONObject, final BaseCommonJavaMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f3129a, false, 39838, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f3129a, false, 39838, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        Context context = (Context) this.f3130b.get();
        if (context instanceof LifecycleOwner) {
            final Lifecycle lifecycle = ((LifecycleOwner) context).getLifecycle();
            lifecycle.addObserver(new LifecycleObserver() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f3131a;

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public void onResume() {
                    if (PatchProxy.isSupport(new Object[0], this, f3131a, false, 39846, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3131a, false, 39846, new Class[0], Void.TYPE);
                        return;
                    }
                    new cw(new e<String>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f44516a;

                        public final /* synthetic */ Object a() throws Exception {
                            if (!PatchProxy.isSupport(new Object[0], this, f44516a, false, 39847, new Class[0], String.class)) {
                                return ZhimaVerifyApi.a();
                            }
                            return (String) PatchProxy.accessDispatch(new Object[0], this, f44516a, false, 39847, new Class[0], String.class);
                        }
                    }, new c<String>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f44518a;

                        public final void a(Exception exc) {
                            if (PatchProxy.isSupport(new Object[]{exc}, this, f44518a, false, 39849, new Class[]{Exception.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{exc}, this, f44518a, false, 39849, new Class[]{Exception.class}, Void.TYPE);
                                return;
                            }
                            aVar.a(0, "error");
                        }

                        public final /* synthetic */ void a(Object obj) {
                            String str = (String) obj;
                            if (PatchProxy.isSupport(new Object[]{str}, this, f44518a, false, 39848, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str}, this, f44518a, false, 39848, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            aVar.a((Object) str);
                        }
                    }).a();
                    lifecycle.removeObserver(this);
                }
            });
        }
        if (context != null) {
            String optString = jSONObject.optString(PushConstants.WEB_URL);
            if (TextUtils.isEmpty(optString)) {
                a(a(0, ""));
                return;
            }
            i.a((Callable<TResult>) new g<TResult>(this)).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(this, optString, context), i.f1052b);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(String str, Context context, i iVar) throws Exception {
        if (!iVar.b() || !((Boolean) iVar.e()).booleanValue()) {
            com.bytedance.ies.dmt.ui.d.a.c(context, context.getString(C0906R.string.bn9)).a();
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + URLEncoder.encode(str)));
            context.startActivity(intent);
            bg.c(this);
            Activity e2 = p.a().e();
            if (e2 instanceof k) {
                ((k) e2).a().a(true);
            }
        }
        return null;
    }
}
