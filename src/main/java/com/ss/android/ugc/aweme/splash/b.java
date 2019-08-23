package com.ss.android.ugc.aweme.splash;

import android.support.v4.app.AccessibilityUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/splash/MobClickReporter;", "Lcom/ss/android/ugc/aweme/ActivityMonitor$AppLifecycleCallback;", "()V", "onAppEnterBackGround", "", "onAppEnterForeground", "onMainActivityResumed", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71587a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f71588b = new b();

    public final void b() {
    }

    public final void c() {
    }

    private b() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71587a, false, 81815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71587a, false, 81815, new Class[0], Void.TYPE);
            return;
        }
        if (!a.a()) {
            r.a("sys_status", (Map) d.a().a("voiceover", AccessibilityUtil.isAccessibilityEnabled(com.ss.android.ugc.aweme.base.utils.d.a()) ? 1 : 0).f34114b);
        }
    }
}
