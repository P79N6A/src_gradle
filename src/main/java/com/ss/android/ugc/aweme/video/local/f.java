package com.ss.android.ugc.aweme.video.local;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76167a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalVideoPlayerManager.a f76168b;

    /* renamed from: c  reason: collision with root package name */
    private final String f76169c;

    f(LocalVideoPlayerManager.a aVar, String str) {
        this.f76168b = aVar;
        this.f76169c = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f76167a, false, 89160, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f76167a, false, 89160, new Class[]{i.class}, Object.class);
        }
        LocalVideoPlayerManager.a aVar = this.f76168b;
        String str = this.f76169c;
        if (iVar.d()) {
            aVar.a();
        } else {
            aVar.a(str);
        }
        return null;
    }
}
