package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.f;
import com.bytedance.crash.i;
import com.bytedance.crash.runtime.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.d.d;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.b.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.CustomErrorActivity;
import com.ss.android.ugc.aweme.lego.LegoTask;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class NpthTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53133a;

        public final Map<String, Object> a() {
            if (PatchProxy.isSupport(new Object[0], this, f53133a, false, 55284, new Class[0], Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[0], this, f53133a, false, 55284, new Class[0], Map.class);
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            NetUtil.putCommonParams(hashMap2, true);
            hashMap.putAll(hashMap2);
            return hashMap;
        }

        public final String b() {
            if (!PatchProxy.isSupport(new Object[0], this, f53133a, false, 55285, new Class[0], String.class)) {
                return d.b();
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f53133a, false, 55285, new Class[0], String.class);
        }

        public final long c() {
            if (PatchProxy.isSupport(new Object[0], this, f53133a, false, 55286, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], this, f53133a, false, 55286, new Class[0], Long.TYPE)).longValue();
            }
            long j = 0;
            try {
                j = Long.parseLong(AppLog.getUserId());
            } catch (NumberFormatException unused) {
            }
            return j;
        }

        public final String d() {
            if (!PatchProxy.isSupport(new Object[0], this, f53133a, false, 55287, new Class[0], String.class)) {
                return AwemeAppData.p().am;
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f53133a, false, 55287, new Class[0], String.class);
        }

        private a() {
        }

        /* synthetic */ a(NpthTask npthTask, byte b2) {
            this();
        }
    }

    static final /* synthetic */ void lambda$run$0$NpthTask(@NonNull com.bytedance.crash.d dVar, @Nullable String str, @Nullable Thread thread) {
    }

    @NotNull
    public com.ss.android.ugc.aweme.lego.f type() {
        return com.ss.android.ugc.aweme.lego.f.BACKGROUND;
    }

    public void installCustomActivityOnCrash() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55280, new Class[0], Void.TYPE);
            return;
        }
        cat.ereza.customactivityoncrash.a.a(CustomErrorActivity.class);
        cat.ereza.customactivityoncrash.a.a((Context) k.a());
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55279, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55279, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.g.a.a()) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53129a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f53129a, false, 55282, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53129a, false, 55282, new Class[0], Void.TYPE);
                        return;
                    }
                    NpthTask.this.installCustomActivityOnCrash();
                }
            });
        }
        com.ss.android.ugc.aweme.framework.a.a.a("NpthTask");
        i.a(f.f53154b, com.bytedance.crash.d.ANR);
        i.a(k.a(), new a(this, (byte) 0), true, true, !com.ss.android.ugc.aweme.g.a.a());
        if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.i18n.a.f29721a, true, 49937, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.i18n.a.f29721a, true, 49937, new Class[0], Void.TYPE);
            } else {
                Thread.setDefaultUncaughtExceptionHandler(new com.ss.android.ugc.aweme.i18n.a(Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
        i.b().m = false;
        b b2 = i.b();
        if (!TextUtils.isEmpty("")) {
            b2.f19536d = "";
        }
        b b3 = i.b();
        if (!TextUtils.isEmpty("")) {
            b3.f19534b = "";
        }
        b b4 = i.b();
        if (!TextUtils.isEmpty("")) {
            b4.f19535c = "";
        }
        i.a((com.bytedance.crash.a) new com.ss.android.ugc.aweme.app.b.b(new c()), com.bytedance.crash.d.ALL);
        if (ToolUtils.isMainProcess(k.a())) {
            new AnrTask().run(k.a());
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53131a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53131a, false, 55283, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53131a, false, 55283, new Class[0], Void.TYPE);
                    return;
                }
                new com.ss.android.ugc.aweme.app.b.a().run();
            }
        }, 200);
    }
}
