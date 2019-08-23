package com.ss.android.ugc.aweme.setting.api;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63842a;

    /* renamed from: b  reason: collision with root package name */
    static final g f63843b = new a();

    private a() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f63842a, false, 72137, new Class[]{i.class}, Object.class)) {
            return AbTestApi.a(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f63842a, false, 72137, new Class[]{i.class}, Object.class);
    }
}
