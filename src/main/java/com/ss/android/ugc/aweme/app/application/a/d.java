package com.ss.android.ugc.aweme.app.application.a;

import a.g;
import a.i;
import android.os.Bundle;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33920a;

    /* renamed from: b  reason: collision with root package name */
    static final g f33921b = new d();

    private d() {
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, this, f33920a, false, 23235, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f33920a, false, 23235, new Class[]{i.class}, Object.class);
        }
        if (((Bundle) iVar.e()).getBoolean("need_restart", false)) {
            new Handler().postDelayed(new e(iVar2), 500);
        }
        return null;
    }
}
