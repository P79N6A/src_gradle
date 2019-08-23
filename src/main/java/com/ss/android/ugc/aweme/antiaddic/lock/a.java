package com.ss.android.ugc.aweme.antiaddic.lock;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.antiaddic.c;
import com.ss.android.ugc.aweme.antiaddic.e;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.ui.session.a;

public final class a extends com.ss.android.ugc.aweme.antiaddic.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33410a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.antiaddic.a.a f33411b = new com.ss.android.ugc.aweme.antiaddic.a.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33413a;

        public final an<Long> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33413a, false, 21726, new Class[0], an.class)) {
                return SharePrefCache.inst().getLastLockedTime();
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, f33413a, false, 21726, new Class[0], an.class);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.antiaddic.a.a f33412c = new com.ss.android.ugc.aweme.antiaddic.a.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33415a;

        public final an<Long> a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33415a, false, 21727, new Class[0], an.class)) {
                return SharePrefCache.inst().getLastUnlockTime();
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, f33415a, false, 21727, new Class[0], an.class);
        }
    };

    private an<Long> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f33410a, false, 21724, new Class[0], an.class)) {
            return SharePrefCache.inst().getTodayVideoPlayTime();
        }
        return (an) PatchProxy.accessDispatch(new Object[0], this, f33410a, false, 21724, new Class[0], an.class);
    }

    public final boolean a(long j, long j2) {
        long j3;
        long j4 = j;
        long j5 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f33410a, false, 21722, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f33410a, false, 21722, new Class[]{Long.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (TimeLockRuler.isRuleValid() && TimeLockRuler.isTimeLockOn()) {
            long d2 = (long) e.d();
            if (PatchProxy.isSupport(new Object[]{new Long(d2)}, this, f33410a, false, 21723, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(d2)}, this, f33410a, false, 21723, new Class[]{Long.TYPE}, Void.TYPE);
            } else if (d2 >= 0 && this.f33412c.b(System.currentTimeMillis())) {
                if (this.f33411b.b(System.currentTimeMillis())) {
                    a().a(0L);
                    this.f33411b.a(System.currentTimeMillis());
                }
                long longValue = d2 + ((Long) a().c()).longValue();
                a().a(Long.valueOf(longValue));
                if (PatchProxy.isSupport(new Object[0], this, f33410a, false, 21725, new Class[0], Long.TYPE)) {
                    j3 = ((Long) PatchProxy.accessDispatch(new Object[0], this, f33410a, false, 21725, new Class[0], Long.TYPE)).longValue();
                } else {
                    c a2 = c.a();
                    if (PatchProxy.isSupport(new Object[0], a2, c.f33371a, false, 21690, new Class[0], Long.TYPE)) {
                        j3 = ((Long) PatchProxy.accessDispatch(new Object[0], a2, c.f33371a, false, 21690, new Class[0], Long.TYPE)).longValue();
                    } else {
                        int lockTimeInMin = TimeLockRuler.getLockTimeInMin() * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        if (c.b()) {
                            lockTimeInMin /= 10;
                        }
                        j3 = (long) lockTimeInMin;
                    }
                }
                if (longValue > j3) {
                    if (PatchProxy.isSupport(new Object[0], null, d.f33446a, true, 21794, new Class[0], Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[0], null, d.f33446a, true, 21794, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        d.a((a.C0450a<Boolean>) null, "");
                    }
                }
            }
        }
        return false;
    }
}
