package com.ss.android.ugc.aweme.miniapp.k;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.ss.android.ugc.aweme.miniapp_api.model.j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.option.media.HostOptionMediaDepend;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3590a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3591b;

    /* renamed from: c  reason: collision with root package name */
    public HostOptionMediaDepend.ExtendScanCodeCallBack f3592c;

    /* renamed from: d  reason: collision with root package name */
    private NativeModule.NativeModuleCallback f3593d;

    public final String getName() {
        return "DMTscanCode";
    }

    public b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    @Subscribe
    public final void onEvent(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f3590a, false, 59522, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f3590a, false, 59522, new Class[]{j.class}, Void.TYPE);
            return;
        }
        String str = jVar.f56035a;
        String str2 = jVar.f56036b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", str);
            jSONObject.put("scanType", str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        if (!TextUtils.isEmpty(jSONObject2) && this.f3593d != null) {
            this.f3593d.onNativeModuleCall(jSONObject2);
            this.f3593d = null;
        }
        if (!TextUtils.isEmpty(jSONObject2) && this.f3592c != null) {
            this.f3592c.onScanResult(str, str2);
            this.f3592c = null;
        }
        c.a().c(this);
    }

    public final String invoke(String str, NativeModule.NativeModuleCallback nativeModuleCallback) throws Exception {
        if (PatchProxy.isSupport(new Object[]{str, nativeModuleCallback}, this, f3590a, false, 59520, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, nativeModuleCallback}, this, f3590a, false, 59520, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        this.f3591b = true;
        f fVar = q.a().i;
        if (fVar != null) {
            fVar.a((Context) getCurrentActivity(), true);
            if (!c.a().b((Object) this)) {
                c.a().a((Object) this);
            }
        }
        this.f3593d = nativeModuleCallback;
        return null;
    }

    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (!this.f3591b) {
            return false;
        }
        this.f3591b = false;
        return true;
    }
}
