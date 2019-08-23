package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61130a;

    /* renamed from: b  reason: collision with root package name */
    private final Class[] f61131b;

    d(Class[] clsArr) {
        this.f61131b = clsArr;
    }

    public final boolean apply(Object obj) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f61130a, false, 67130, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f61130a, false, 67130, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        Class[] clsArr = this.f61131b;
        Activity activity = (Activity) obj;
        if (clsArr != null) {
            z = true;
            for (Class isInstance : clsArr) {
                if (isInstance.isInstance(activity)) {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (z) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }
}
