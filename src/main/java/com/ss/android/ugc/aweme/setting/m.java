package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.detail.api.a;
import com.ss.android.ugc.aweme.detail.api.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63988a;

    /* renamed from: b  reason: collision with root package name */
    public static final Callable f63989b = new m();

    private m() {
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f63988a, false, 72059, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f63988a, false, 72059, new Class[0], Object.class);
        } else if (PatchProxy.isSupport(new Object[0], null, a.f41158a, true, 34729, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, a.f41158a, true, 34729, new Class[0], b.class);
        } else {
            return (b) ((AVApi) ServiceManager.get().getService(AVApi.class)).executeGetJSONObject(new i(a.f41160c).toString(), b.class, null);
        }
    }
}
