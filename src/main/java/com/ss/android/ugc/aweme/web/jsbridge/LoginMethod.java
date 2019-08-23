package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.login.a.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoginMethod implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76649a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.ies.f.a.a f76650b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f76651c;

    public static class LoginProxyFragment extends Fragment {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4310a;

        /* renamed from: b  reason: collision with root package name */
        public a f4311b;

        public void onHiddenChanged(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4310a, false, 89992, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4310a, false, 89992, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.onHiddenChanged(z);
            FragmentInstrumentation.onHiddenChanged(this, z);
        }

        public void onPause() {
            if (PatchProxy.isSupport(new Object[0], this, f4310a, false, 89994, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4310a, false, 89994, new Class[0], Void.TYPE);
                return;
            }
            super.onPause();
            FragmentInstrumentation.onPause(this);
        }

        public void onResume() {
            if (PatchProxy.isSupport(new Object[0], this, f4310a, false, 89993, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4310a, false, 89993, new Class[0], Void.TYPE);
                return;
            }
            super.onResume();
            FragmentInstrumentation.onResume(this);
        }

        public void setUserVisibleHint(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4310a, false, 89995, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4310a, false, 89995, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.setUserVisibleHint(z);
            FragmentInstrumentation.setUserVisibleHint(this, z);
        }

        public void onDestroy() {
            if (PatchProxy.isSupport(new Object[0], this, f4310a, false, 89988, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4310a, false, 89988, new Class[0], Void.TYPE);
                return;
            }
            super.onDestroy();
            bg.d(this);
        }

        public void onCreate(@Nullable Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, f4310a, false, 89987, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, f4310a, false, 89987, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.onCreate(bundle);
            bg.c(this);
        }

        @Subscribe
        public void onEvent(b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f4310a, false, 89989, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f4310a, false, 89989, new Class[]{b.class}, Void.TYPE);
            } else if (this.f4311b != null && this.f4311b.f76652a != null) {
                a aVar = this.f4311b;
                this.f4311b = null;
                com.bytedance.ies.f.a.a aVar2 = (com.bytedance.ies.f.a.a) aVar.f76652a.get();
                if (aVar2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        ae.a(jSONObject);
                    } catch (JSONException unused) {
                    }
                    aVar2.a(aVar.f76653b, jSONObject);
                    if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4310a, false, 89990, new Class[]{com.bytedance.ies.f.a.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4310a, false, 89990, new Class[]{com.bytedance.ies.f.a.a.class}, Void.TYPE);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("code", 1);
                        } catch (JSONException unused2) {
                        }
                        a(aVar2, "loginCanceled", jSONObject2);
                    }
                }
            }
        }

        private void a(com.bytedance.ies.f.a.a aVar, String str, JSONObject jSONObject) {
            com.bytedance.ies.f.a.a aVar2 = aVar;
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            if (PatchProxy.isSupport(new Object[]{aVar2, str2, jSONObject2}, this, f4310a, false, 89991, new Class[]{com.bytedance.ies.f.a.a.class, String.class, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2, str2, jSONObject2}, this, f4310a, false, 89991, new Class[]{com.bytedance.ies.f.a.a.class, String.class, JSONObject.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("type", str2);
                jSONObject3.put("args", jSONObject2);
            } catch (JSONException unused) {
            }
            if (aVar2 != null) {
                aVar2.b("H5_nativeEvent", jSONObject3);
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<com.bytedance.ies.f.a.a> f76652a;

        /* renamed from: b  reason: collision with root package name */
        public final String f76653b;

        public a(WeakReference<com.bytedance.ies.f.a.a> weakReference, String str) {
            this.f76652a = weakReference;
            this.f76653b = str;
        }
    }

    public LoginMethod(@NonNull com.bytedance.ies.f.a.a aVar, @NonNull Activity activity) {
        this.f76650b = aVar;
        this.f76651c = activity;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76649a, false, 89986, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76649a, false, 89986, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        hVar.f20625f = false;
        if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            if (this.f76651c instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) this.f76651c).getSupportFragmentManager();
                LoginProxyFragment loginProxyFragment = (LoginProxyFragment) supportFragmentManager.findFragmentByTag("LoginProxyFragmentForLoginMethod");
                if (loginProxyFragment == null) {
                    loginProxyFragment = new LoginProxyFragment();
                    supportFragmentManager.beginTransaction().add((Fragment) loginProxyFragment, "LoginProxyFragmentForLoginMethod").commitNowAllowingStateLoss();
                }
                hVar.f20625f = false;
                loginProxyFragment.f4311b = new a(new WeakReference(this.f76650b), hVar.f20621b);
            }
            e.a(this.f76651c, "h5", "");
            return;
        }
        ae.a(jSONObject);
    }
}
