package com.ss.android.ugc.aweme.miniapp.i;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.c.h;
import com.ss.android.ugc.aweme.miniapp.l.e;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import com.tt.miniapphost.hostmethod.IHostMethod;
import com.tt.miniapphost.process.HostProcessBridge;
import org.json.JSONObject;

public class a implements IHostMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55779a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55780b = "a";

    /* renamed from: c  reason: collision with root package name */
    private long f55781c;

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public boolean shouldHandleActivityResult(JSONObject jSONObject) {
        return false;
    }

    private long a() {
        if (PatchProxy.isSupport(new Object[0], this, f55779a, false, 59475, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f55779a, false, 59475, new Class[0], Long.TYPE)).longValue();
        }
        if (HostProcessBridge.getUserInfo() != null) {
            try {
                this.f55781c = Long.parseLong("userId");
            } catch (NumberFormatException unused) {
            }
        }
        return this.f55781c;
    }

    public String callSync(Activity activity, JSONObject jSONObject) throws Exception {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, jSONObject}, this, f55779a, false, 59474, new Class[]{Activity.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{activity2, jSONObject}, this, f55779a, false, 59474, new Class[]{Activity.class, JSONObject.class}, String.class);
        }
        a();
        String a2 = h.a(activity);
        if (TextUtils.isEmpty(a2)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("failed", "token is empty");
            return jSONObject2.toString();
        }
        e.a(activity2, a2, a(), b.f55783b);
        return null;
    }

    public void call(Activity activity, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) throws Exception {
        Activity activity2 = activity;
        HostMethodManager.ResponseCallBack responseCallBack2 = responseCallBack;
        if (PatchProxy.isSupport(new Object[]{activity2, jSONObject, responseCallBack2}, this, f55779a, false, 59476, new Class[]{Activity.class, JSONObject.class, HostMethodManager.ResponseCallBack.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, jSONObject, responseCallBack2}, this, f55779a, false, 59476, new Class[]{Activity.class, JSONObject.class, HostMethodManager.ResponseCallBack.class}, Void.TYPE);
            return;
        }
        e.a(activity2, h.a(activity), a(), responseCallBack2);
    }
}
