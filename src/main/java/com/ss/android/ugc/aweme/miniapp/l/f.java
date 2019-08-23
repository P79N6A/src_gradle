package com.ss.android.ugc.aweme.miniapp.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55825a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55826b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55827c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f55828d;

    /* renamed from: e  reason: collision with root package name */
    private final HostMethodManager.ResponseCallBack f55829e;

    f(String str, long j, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) {
        this.f55826b = str;
        this.f55827c = j;
        this.f55828d = jSONObject;
        this.f55829e = responseCallBack;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f55825a, false, 59551, new Class[0], Object.class)) {
            return e.a(this.f55826b, this.f55827c, this.f55828d, this.f55829e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f55825a, false, 59551, new Class[0], Object.class);
    }
}
