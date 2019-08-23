package com.ss.android.ugc.aweme.newfollow.util;

import android.net.ConnectivityManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.freeflowcard.b;
import com.ss.android.ugc.aweme.g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/util/BackGroundTimeWatcher;", "Lcom/ss/android/ugc/aweme/ActivityMonitor$AppLifecycleCallback;", "()V", "mEnterBackgroundTime", "", "dealEnterForeground", "", "backgroundTime", "onAppEnterBackGround", "onAppEnterForeground", "onMainActivityResumed", "updateNetWork", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57406a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f57407b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final a f57408c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private long f57409d = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/util/BackGroundTimeWatcher$Companion;", "", "()V", "firstEnterForeground", "", "getFirstEnterForeground", "()Z", "setFirstEnterForeground", "(Z)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void c() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57406a, false, 61874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57406a, false, 61874, new Class[0], Void.TYPE);
            return;
        }
        this.f57409d = System.currentTimeMillis();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57406a, false, 61871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57406a, false, 61871, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (d.a() != null) {
                if (!f57407b) {
                    IAccountUserService a2 = d.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                    if (a2.isLogin()) {
                        ParentalPlatformManager.f2599b.a((ParentalPlatformManager.a) null);
                    }
                    f57407b = false;
                    if (PatchProxy.isSupport(new Object[0], this, f57406a, false, 61872, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57406a, false, 61872, new Class[0], Void.TYPE);
                    } else {
                        try {
                            Object systemService = GlobalContext.getContext().getSystemService("connectivity");
                            if (systemService != null) {
                                m.a().a(((ConnectivityManager) systemService).getActiveNetworkInfo());
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (this.f57409d != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - this.f57409d;
                        if (PatchProxy.isSupport(new Object[]{new Long(currentTimeMillis)}, this, f57406a, false, 61873, new Class[]{Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(currentTimeMillis)}, this, f57406a, false, 61873, new Class[]{Long.TYPE}, Void.TYPE);
                        } else if (TimeUnit.MILLISECONDS.toHours(currentTimeMillis) >= 2) {
                            b.a().j = false;
                        }
                        this.f57409d = -1;
                        return;
                    }
                    return;
                }
            }
            f57407b = false;
        } catch (Exception unused2) {
        }
    }
}
