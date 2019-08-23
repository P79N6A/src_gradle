package com.ss.android.experiencekit.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Process;
import com.huawei.emui.hiexperience.hwperf.thumbnailmanager.HwPerfThumbnailManager;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdk;
import com.ss.android.experiencekit.b.c;
import com.ss.android.experiencekit.c.c;
import com.ss.android.experiencekit.c.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public IAwareAppSdk f29070a;

    /* renamed from: b  reason: collision with root package name */
    public Context f29071b;

    interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f29072a = new c(1, "app启动");

        /* renamed from: b  reason: collision with root package name */
        public static final c f29073b = new c(2, "Activity切换");

        /* renamed from: c  reason: collision with root package name */
        public static final c f29074c = new c(3, "发布上传视频");

        /* renamed from: d  reason: collision with root package name */
        public static final c f29075d = new c(4, "loading");

        /* renamed from: e  reason: collision with root package name */
        public static final c f29076e = new c(5, "图片、视频处理");

        /* renamed from: f  reason: collision with root package name */
        public static final c f29077f = new c(6, "发收消息");
        public static final c g = new c(7, "使用相机");
    }

    /* renamed from: com.ss.android.experiencekit.b.b$b  reason: collision with other inner class name */
    public static class C0347b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final HwPerfThumbnailManager f29078a;

        public C0347b(HwPerfThumbnailManager hwPerfThumbnailManager) {
            this.f29078a = hwPerfThumbnailManager;
        }

        public final Bitmap a(int i, long j, int i2, int i3, BitmapFactory.Options options) {
            return this.f29078a.getThumbnail(i, j, 1, 2, null);
        }
    }

    public final boolean a(Context context, String str) {
        this.f29070a = new IAwareAppSdk();
        this.f29071b = context;
        return this.f29070a.registerApp(str);
    }

    private boolean a(com.ss.android.experiencekit.c.c cVar, d dVar) {
        if (this.f29070a == null) {
            return false;
        }
        try {
            this.f29070a.notifyAppScene(cVar.a(), dVar.getStatus());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a(com.ss.android.experiencekit.c.b bVar, d dVar, Bundle bundle) {
        if (bVar == com.ss.android.experiencekit.c.a.f29092f) {
            return a(a.f29075d, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29087a) {
            return a(a.f29072a, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29088b) {
            return a(a.g, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.j) {
            return a(a.f29073b, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29089c) {
            return a(a.f29073b, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29090d) {
            return a(a.f29074c, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.f29091e) {
            return a(a.f29075d, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.g) {
            return a(a.f29076e, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.i) {
            return a(a.f29077f, dVar);
        }
        if (bVar == com.ss.android.experiencekit.c.a.l) {
            if (this.f29070a == null) {
                return false;
            }
            if (dVar == d.BEGIN) {
                this.f29070a.addVipThreads(new long[]{(long) Process.myTid()});
            } else {
                this.f29070a.cancelVipThreads(new long[]{(long) Process.myTid()});
            }
            return true;
        } else if (bVar != com.ss.android.experiencekit.c.a.h) {
            return false;
        } else {
            boolean a2 = a(a.f29076e, dVar);
            boolean a3 = a(a.f29074c, dVar);
            if (!a2 || !a3) {
                return false;
            }
            return true;
        }
    }
}
