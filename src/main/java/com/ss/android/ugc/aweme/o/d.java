package com.ss.android.ugc.aweme.o;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.f;

public final /* synthetic */ class d implements IAccountService.h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58163a;

    /* renamed from: b  reason: collision with root package name */
    private final a f58164b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a f58165c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f58166d;

    d(a aVar, f.a aVar2, Activity activity) {
        this.f58164b = aVar;
        this.f58165c = aVar2;
        this.f58166d = activity;
    }

    public final void a(int i, int i2, Object obj) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f58163a, false, 54506, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f58163a, false, 54506, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f58164b;
        f.a aVar2 = this.f58165c;
        Activity activity = this.f58166d;
        if (aVar2 != null && !aVar.f58158b) {
            aVar.f58158b = true;
            if (i2 == 1) {
                aVar2.a();
            } else {
                aVar2.b();
            }
            activity.getWindow().getDecorView().postDelayed(new e(aVar), 5000);
        }
    }
}
