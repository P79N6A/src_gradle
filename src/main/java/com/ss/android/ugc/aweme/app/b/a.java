package com.ss.android.ugc.aweme.app.b;

import android.text.TextUtils;
import com.bytedance.crash.a.b;
import com.bytedance.crash.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import java.io.File;

public final class a implements com.ss.android.ugc.aweme.app.application.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33969a;

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33969a, false, 23307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33969a, false, 23307, new Class[0], Void.TYPE);
            return;
        }
        if (ALog.isInitSuccess()) {
            String str = ALog.sConfig.f27862d;
            AnonymousClass1 r1 = new c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33970a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f33970a, false, 23308, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f33970a, false, 23308, new Class[0], Void.TYPE);
                        return;
                    }
                    ALog.flush();
                    ALog.forceLogSharding();
                }
            };
            b bVar = new b();
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                com.bytedance.crash.a.a a2 = com.bytedance.crash.a.a.a();
                a2.f19333a = str;
                a2.f19334b = r1;
                a2.f19335c = bVar;
            }
        }
    }
}
