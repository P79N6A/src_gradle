package com.ss.android.ugc.aweme.ae;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/push/HMSMonitor;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33203a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f33204b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0417a f33205c = new C0417a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/push/HMSMonitor$Companion;", "", "()V", "sHasLaunch", "", "getPackageVersionCode", "", "context", "Landroid/content/Context;", "packageName", "", "launch", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.ae.a$a  reason: collision with other inner class name */
    public static final class C0417a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33206a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.ae.a$a$a  reason: collision with other inner class name */
        public static final class C0418a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33207a;

            /* renamed from: b  reason: collision with root package name */
            public static final C0418a f33208b = new C0418a();

            C0418a() {
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f33207a, false, 70324, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33207a, false, 70324, new Class[0], Void.TYPE);
                    return;
                }
                ThreadPlus.submitRunnable(AnonymousClass1.f33210b);
            }
        }

        private C0417a() {
        }

        public /* synthetic */ C0417a(byte b2) {
            this();
        }

        @JvmStatic
        public final int a(Context context, String str) {
            String str2 = str;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{context, str2}, this, f33206a, false, 70323, new Class[]{Context.class, String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{context, str2}, this, f33206a, false, 70323, new Class[]{Context.class, String.class}, Integer.TYPE)).intValue();
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str2, 16);
                if (packageInfo != null) {
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return i;
        }
    }
}
