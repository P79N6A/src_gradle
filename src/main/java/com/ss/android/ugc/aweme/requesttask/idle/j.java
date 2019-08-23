package com.ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import com.ss.android.ugc.aweme.sec.c.c;
import com.ss.sys.ces.out.ISdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/requesttask/idle/SecSdkRequest;", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "()V", "request", "", "context", "Landroid/content/Context;", "coldBoot", "", "type", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63633a;

    @NotNull
    public final e a() {
        if (PatchProxy.isSupport(new Object[0], this, f63633a, false, 70821, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f63633a, false, 70821, new Class[0], e.class);
        }
        try {
            a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Boolean aK = b2.aK();
            Intrinsics.checkExpressionValueIsNotNull(aK, "SettingsReader.get().disableDelaySecReport");
            aK.booleanValue();
        } catch (Exception unused) {
        }
        return e.IDLE;
    }

    public final void a(@NotNull Context context, boolean z) {
        String str;
        String str2;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63633a, false, 70822, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, this, f63633a, false, 70822, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        com.ss.android.ugc.aweme.sec.a aVar = com.ss.android.ugc.aweme.sec.a.f63724f;
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.sec.a.f63719a, false, 71079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.sec.a.f63719a, false, 71079, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (AppLog.getServerDeviceId() != null) {
            str = AppLog.getServerDeviceId();
        } else {
            str = "";
        }
        if (AppLog.getInstallId() != null) {
            str2 = AppLog.getInstallId();
        } else {
            str2 = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ISdk iSdk = com.ss.android.ugc.aweme.sec.a.f63721c;
        if (iSdk != null) {
            iSdk.setParams(str, str2);
        }
        c cVar = c.f63761b;
        cVar.a("DmtSec", "init setParamsTime = " + (currentTimeMillis2 - currentTimeMillis));
    }
}
