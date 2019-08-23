package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.property.f;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class ar implements k<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65658a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shortvideo.upload.k f65659b;

    /* renamed from: c  reason: collision with root package name */
    private String f65660c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f65661d;

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f65658a, false, 74046, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f65658a, false, 74046, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        int a2 = cu.a(13, th2);
        JSONObject b2 = c.a().a("exception", com.facebook.common.internal.k.c(th)).b();
        if (this.f65661d) {
            n.a("aweme_mv_publish_error_rate", a2, b2);
        }
        n.a("aweme_movie_publish_error_rate_parallel", a2, b2);
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        at atVar = (at) obj;
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f65658a, false, 74045, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f65658a, false, 74045, new Class[]{at.class}, Void.TYPE);
            return;
        }
        t tVar = new t();
        t a2 = tVar.a("enableHardRecord", f.a());
        JSONObject a3 = a2.a("enableHardSynthetic", f.b()).a();
        if (this.f65661d) {
            n.a("aweme_mv_publish_error_rate", 0, a3);
        }
        n.a("aweme_movie_publish_error_rate_parallel", 0, a3);
        com.ss.android.ugc.aweme.shortvideo.upload.k kVar = this.f65659b;
        long length = new File(this.f65660c).length();
        if (PatchProxy.isSupport(new Object[]{new Long(length)}, kVar, com.ss.android.ugc.aweme.shortvideo.upload.k.f71019a, false, 80782, new Class[]{Long.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.shortvideo.upload.k kVar2 = kVar;
            PatchProxy.accessDispatch(new Object[]{new Long(length)}, kVar2, com.ss.android.ugc.aweme.shortvideo.upload.k.f71019a, false, 80782, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (kVar.f71020b.f2357a) {
            if (PatchProxy.isSupport(new Object[]{new Long(length)}, kVar, com.ss.android.ugc.aweme.shortvideo.upload.k.f71019a, false, 80783, new Class[]{Long.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.upload.k kVar3 = kVar;
                PatchProxy.accessDispatch(new Object[]{new Long(length)}, kVar3, com.ss.android.ugc.aweme.shortvideo.upload.k.f71019a, false, 80783, new Class[]{Long.TYPE}, Void.TYPE);
            } else {
                n.a("publish_log_parallel", bi.a().a("duration", Long.valueOf(kVar.f71020b.a(TimeUnit.MILLISECONDS))).a("upload_speed", Float.valueOf((((float) length) * 1.0f) / ((float) kVar.f71020b.a(TimeUnit.MILLISECONDS)))).b());
            }
            kVar.f71020b.d();
        }
    }

    public ar(com.ss.android.ugc.aweme.shortvideo.upload.k kVar, String str, boolean z) {
        this.f65659b = kVar;
        this.f65660c = str;
        this.f65661d = z;
    }
}
