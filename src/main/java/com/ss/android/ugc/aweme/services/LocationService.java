package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.framework.services.ILocationService;
import com.ss.android.ugc.aweme.poi.a;
import com.ss.android.ugc.aweme.utils.permission.a;

public class LocationService implements ILocationService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public double[] getLatLng() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71394, new Class[0], double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71394, new Class[0], double[].class);
        }
        af a2 = af.a(GlobalContext.getContext());
        if (PatchProxy.isSupport(new Object[0], a2, af.f2624a, false, 22548, new Class[0], double[].class)) {
            return (double[]) PatchProxy.accessDispatch(new Object[0], a2, af.f2624a, false, 22548, new Class[0], double[].class);
        }
        a f2 = a2.f();
        if (f2 == null || f2.isValid()) {
            return null;
        }
        return new double[]{f2.latitude, f2.longitude};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0092, code lost:
        if (r1 != null) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showNearByLocationDialog(android.app.Activity r20, com.ss.android.ugc.aweme.framework.services.ILocationService.OnPermissionListener r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.ILocationService$OnPermissionListener> r4 = com.ss.android.ugc.aweme.framework.services.ILocationService.OnPermissionListener.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 71395(0x116e3, float:1.00046E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 0
            r16 = 71395(0x116e3, float:1.00046E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.ILocationService$OnPermissionListener> r1 = com.ss.android.ugc.aweme.framework.services.ILocationService.OnPermissionListener.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0094
            java.lang.String[] r2 = com.ss.android.ugc.aweme.app.af.f2626c
            boolean r2 = com.ss.android.ugc.aweme.utils.permission.a.a((android.content.Context) r0, (java.lang.String[]) r2)
            if (r2 != 0) goto L_0x0092
            com.bytedance.ies.dmt.ui.b.a$a r2 = new com.bytedance.ies.dmt.ui.b.a$a
            r2.<init>(r0)
            r3 = 2130840183(0x7f020a77, float:1.7285398E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.c(r3)
            r3 = 2131561064(0x7f0d0a68, float:1.8747518E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.a((int) r3)
            r3 = 2131561062(0x7f0d0a66, float:1.8747514E38)
            com.bytedance.ies.dmt.ui.b.a$a r2 = r2.b((int) r3)
            r3 = 2131561059(0x7f0d0a63, float:1.8747508E38)
            com.ss.android.ugc.aweme.services.LocationService$$Lambda$0 r4 = new com.ss.android.ugc.aweme.services.LocationService$$Lambda$0
            r4.<init>(r0, r1)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r2.a((int) r3, (android.content.DialogInterface.OnClickListener) r4)
            r2 = 2131561058(0x7f0d0a62, float:1.8747506E38)
            com.ss.android.ugc.aweme.services.LocationService$$Lambda$1 r3 = new com.ss.android.ugc.aweme.services.LocationService$$Lambda$1
            r3.<init>(r1)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.b((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.a()
            r0.b()
            return
        L_0x0092:
            if (r1 == 0) goto L_0x0097
        L_0x0094:
            r21.onPermissionGranted()
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.LocationService.showNearByLocationDialog(android.app.Activity, com.ss.android.ugc.aweme.framework.services.ILocationService$OnPermissionListener):void");
    }

    static final /* synthetic */ void lambda$showNearByLocationDialog$1$LocationService(ILocationService.OnPermissionListener onPermissionListener, DialogInterface dialogInterface, int i) {
        if (onPermissionListener != null) {
            onPermissionListener.onPermissionDenied();
        }
    }

    static final /* synthetic */ void lambda$showNearByLocationDialog$0$LocationService(Activity activity, ILocationService.OnPermissionListener onPermissionListener, DialogInterface dialogInterface, int i) {
        com.ss.android.ugc.aweme.utils.permission.a.a(activity, 2, af.f2626c, (a.C0792a) null);
        if (onPermissionListener != null) {
            onPermissionListener.onPermissionGranted();
        }
    }
}
