package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.main.bp;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter;

public final /* synthetic */ class aq implements b.C0400b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75524a;

    /* renamed from: b  reason: collision with root package name */
    private final ap.a f75525b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f75526c;

    aq(ap.a aVar, Activity activity) {
        this.f75525b = aVar;
        this.f75526c = activity;
    }

    public final void a(String[] strArr, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f75524a, false, 88115, new Class[]{String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f75524a, false, 88115, new Class[]{String[].class, int[].class}, Void.TYPE);
            return;
        }
        ap.a aVar = this.f75525b;
        Activity activity = this.f75526c;
        if (aVar != null && iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                aVar.a();
                PermissionStateReporter.d().e();
                return;
            }
            aVar.b();
            ((bp) c.a(activity, bp.class)).c(true);
        }
    }
}
