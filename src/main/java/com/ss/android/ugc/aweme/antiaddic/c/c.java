package com.ss.android.ugc.aweme.antiaddic.c;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.antiaddic.a;
import com.ss.android.ugc.aweme.antiaddic.e;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.ad;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33382a;

    public final boolean a(long j, long j2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f33382a, false, 22105, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f33382a, false, 22105, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!ToolUtils.isMainProcess(d.a()) || com.ss.android.ugc.aweme.account.d.a().isLogin() || j4 < 0) {
            return false;
        } else {
            x.a().ah().a(Long.valueOf(((Long) x.a().ah().c()).longValue() + ((long) e.d())));
            if (PatchProxy.isSupport(new Object[0], null, b.f33381a, true, 22101, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, b.f33381a, true, 22101, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                Activity e2 = p.a().e();
                if (AbTestManager.a().by()) {
                    if (PatchProxy.isSupport(new Object[0], null, b.f33381a, true, 22103, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, b.f33381a, true, 22103, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (!((Boolean) x.a().ai().c()).booleanValue() || !AbTestManager.a().bx()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2 && e2 != null && !e2.isFinishing() && !com.ss.android.ugc.aweme.account.c.b().isLoginActivity(e2) && AbTestManager.a().T() == 0) {
                        long longValue = ((Long) x.a().ah().c()).longValue();
                        AbTestManager a2 = AbTestManager.a();
                        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71966, new Class[0], Integer.TYPE)) {
                            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71966, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            AbTestModel d2 = a2.d();
                            if (d2 == null) {
                                i = 0;
                            } else {
                                i = d2.antiAddictedContinuousUseTime;
                            }
                        }
                        if (longValue > ((long) (i * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
                            long longValue2 = ((Long) x.a().ag().c()).longValue();
                            AbTestManager a3 = AbTestManager.a();
                            if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71965, new Class[0], Integer.TYPE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71965, new Class[0], Integer.TYPE)).intValue();
                            } else {
                                AbTestModel d3 = a3.d();
                                if (d3 == null) {
                                    i2 = 0;
                                } else {
                                    i2 = d3.getAntiAddictedTotalUseTime();
                                }
                            }
                            if (longValue2 > ((long) (i2 * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
            }
            if (z) {
                com.ss.android.ugc.aweme.login.e.a(p.a().e(), "", "forced_login", ad.a().a("is_force_login", true).f75487b);
                x.a().ai().a(Boolean.TRUE);
            }
            return false;
        }
    }
}
