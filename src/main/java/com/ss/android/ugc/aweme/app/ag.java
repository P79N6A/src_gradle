package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public class ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33748a;

    /* renamed from: c  reason: collision with root package name */
    private static ag f33749c;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<ah> f33750b = new ArrayList<>();

    public static ag a() {
        if (PatchProxy.isSupport(new Object[0], null, f33748a, true, 22560, new Class[0], ag.class)) {
            return (ag) PatchProxy.accessDispatch(new Object[0], null, f33748a, true, 22560, new Class[0], ag.class);
        }
        if (f33749c == null) {
            synchronized (ag.class) {
                if (f33749c == null) {
                    f33749c = new ag();
                }
            }
        }
        return f33749c;
    }

    public final void a(ah ahVar) {
        if (PatchProxy.isSupport(new Object[]{ahVar}, this, f33748a, false, 22561, new Class[]{ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar}, this, f33748a, false, 22561, new Class[]{ah.class}, Void.TYPE);
            return;
        }
        if (this.f33750b != null) {
            this.f33750b.add(ahVar);
        }
    }
}
