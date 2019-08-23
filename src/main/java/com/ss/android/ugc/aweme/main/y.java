package com.ss.android.ugc.aweme.main;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;

public final /* synthetic */ class y implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55004a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f55005b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f55006c;

    y(MainFragment mainFragment, Activity activity) {
        this.f55005b = mainFragment;
        this.f55006c = activity;
    }

    public final Object then(i iVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f55004a, false, 57327, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f55004a, false, 57327, new Class[]{i.class}, Object.class);
        }
        MainFragment mainFragment = this.f55005b;
        Activity activity = this.f55006c;
        if (mainFragment.isViewValid()) {
            k a2 = k.a();
            if (PatchProxy.isSupport(new Object[]{a2}, mainFragment, MainFragment.f3515a, false, 57274, new Class[]{Context.class}, Boolean.TYPE)) {
                MainFragment mainFragment2 = mainFragment;
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{a2}, mainFragment2, MainFragment.f3515a, false, 57274, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                z = ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(a2);
            }
            if (!z && (activity instanceof MainActivity)) {
                mainFragment.b(false);
            }
        }
        return null;
    }
}
