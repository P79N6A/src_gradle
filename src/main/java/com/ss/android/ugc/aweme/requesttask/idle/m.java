package com.ss.android.ugc.aweme.requesttask.idle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/idle/VEHookMgr;", "", "()V", "isHook", "", "()Z", "setHook", "(Z)V", "hook", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63636a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f63637b;

    /* renamed from: c  reason: collision with root package name */
    public static final m f63638c = new m();

    private m() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63636a, false, 70826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63636a, false, 70826, new Class[0], Void.TYPE);
            return;
        }
        try {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).hookVESDKSO();
        } catch (Exception e2) {
            a.a((Throwable) e2);
        }
    }
}
