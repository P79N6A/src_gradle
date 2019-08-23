package com.ss.android.experiencekit.b;

import android.content.Context;
import android.os.Bundle;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.experiencekit.c;
import com.ss.android.experiencekit.c.b;
import com.ss.android.experiencekit.c.c;
import com.ss.android.experiencekit.c.d;
import com.tencent.bugly.CrashModule;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private Context f29079a;

    interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f29080a = new c(1, "app启动");

        /* renamed from: b  reason: collision with root package name */
        public static final c f29081b = new c(2, "Activity切换");

        /* renamed from: c  reason: collision with root package name */
        public static final c f29082c = new c(3, "发布上传视频");

        /* renamed from: d  reason: collision with root package name */
        public static final c f29083d = new c(5, "合成视频");

        /* renamed from: e  reason: collision with root package name */
        public static final c f29084e = new c(6, "发收消息");

        /* renamed from: f  reason: collision with root package name */
        public static final c f29085f = new c(7, "使用相机");
        public static final c g = new c(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, "底tab切换");
        public static final c h = new c(1003, "直播");
        public static final c i = new c(CrashModule.MODULE_ID, "视频详情页");
        public static final c j = new c(1005, "视频缓冲");
        public static final c k = new c(1006, "同时合成和上传视频");
    }

    public final boolean a(Context context, String str) {
        com.b.a.c.a();
        String b2 = com.b.a.c.b();
        this.f29079a = context.getApplicationContext();
        if (b2 != null) {
            return true;
        }
        return false;
    }

    private static boolean a(c cVar, d dVar, Bundle bundle) {
        try {
            com.b.a.c.a();
            c.a a2 = new c.a().a("sceneId", (long) cVar.a()).a("status", (long) dVar.getStatus()).a("time_stamp", System.currentTimeMillis()).a("desc", cVar.f29093a.intern());
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    a2.a(str, String.valueOf(bundle.get(str)));
                }
            }
            return com.b.a.c.a(a2.toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a(b bVar, d dVar, Bundle bundle) {
        if (bVar == com.ss.android.experiencekit.c.a.f29092f) {
            return a(a.j, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29087a) {
            return a(a.f29080a, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.j) {
            return a(a.g, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29088b) {
            return a(a.f29085f, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29089c) {
            return a(a.f29081b, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29090d) {
            return a(a.f29082c, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29091e) {
            return a(a.i, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.g) {
            return a(a.f29083d, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.i) {
            return a(a.f29084e, dVar, bundle);
        }
        if (bVar == com.ss.android.experiencekit.c.a.h) {
            boolean a2 = a(a.f29083d, dVar, (Bundle) null);
            boolean a3 = a(a.f29082c, dVar, (Bundle) null);
            if (!a2 || !a3) {
                return false;
            }
            return true;
        } else if (bVar == com.ss.android.experiencekit.c.a.k) {
            return a(a.h, dVar, bundle);
        } else {
            return false;
        }
    }
}
