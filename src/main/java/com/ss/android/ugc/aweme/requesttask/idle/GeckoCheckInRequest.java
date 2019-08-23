package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.android.ManifestData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.utils.bs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/idle/GeckoCheckInRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "()V", "run", "", "context", "Landroid/content/Context;", "type", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GeckoCheckInRequest implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63617a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f63618b = new a();

        a() {
        }

        public final void run() {
            boolean z;
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f63617a, false, 70819, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63617a, false, 70819, new Class[0], Void.TYPE);
                return;
            }
            i a2 = i.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AppContextInfoManager.inst()");
            String version = a2.getVersion();
            CharSequence charSequence = version;
            boolean z2 = true;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Context context = GlobalContext.getContext();
                if (context != null) {
                    try {
                        version = ManifestData.getString(context, "SS_VERSION_NAME");
                    } catch (Throwable unused) {
                    }
                    CharSequence charSequence2 = version;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo != null) {
                                str = packageInfo.versionName;
                            } else {
                                str = null;
                            }
                            version = str;
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(AppLog.getServerDeviceId())) {
                bs.b(version);
            }
        }
    }

    @NotNull
    public final f type() {
        return f.BOOT_FINISH;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|(1:8)|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run(@org.jetbrains.annotations.NotNull android.content.Context r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 70818(0x114a2, float:9.9237E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 70818(0x114a2, float:9.9237E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            r0 = 0
            boolean r2 = com.ss.android.g.a.a()     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x004b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x006e }
            r1 = 30
            long r0 = r0.toMillis(r1)     // Catch:{ Exception -> 0x006e }
        L_0x004b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x005d }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Exception -> 0x005d }
            java.lang.Integer r2 = r2.bN()     // Catch:{ Exception -> 0x005d }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x005d }
            long r0 = (long) r2
        L_0x005d:
            android.os.Handler r2 = new android.os.Handler     // Catch:{ Exception -> 0x006e }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x006e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x006e }
            com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest$a r3 = com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest.a.f63618b     // Catch:{ Exception -> 0x006e }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ Exception -> 0x006e }
            r2.postDelayed(r3, r0)     // Catch:{ Exception -> 0x006e }
            return
        L_0x006e:
            r0 = move-exception
            com.ss.android.ugc.aweme.fe.b.e r1 = com.ss.android.ugc.aweme.fe.b.e.f44417b
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest.run(android.content.Context):void");
    }
}
