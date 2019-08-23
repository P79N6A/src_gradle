package com.ss.android.ugc.aweme.shortvideo;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.support.v4.os.CancellationSignal;
import android.util.Log;
import com.google.common.a.q;
import com.google.common.a.v;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import dmt.av.video.ah;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class el {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67536a;

    /* renamed from: b  reason: collision with root package name */
    public s<at> f67537b;

    /* renamed from: c  reason: collision with root package name */
    int f67538c;

    /* renamed from: d  reason: collision with root package name */
    public int f67539d;

    /* renamed from: e  reason: collision with root package name */
    eh f67540e = new eh();

    /* renamed from: f  reason: collision with root package name */
    final k f67541f;
    public SynthetiseResult g;
    public CancellationSignal h;
    ei<SynthetiseResult> i;
    public boolean j;
    public final d k = new d();
    public final c l;
    public final ep m;
    public boolean n = false;
    public boolean o;
    public boolean p;
    hi q;
    private String r;
    private long s = 0;
    private double t;
    private String u;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67562a;

        /* renamed from: b  reason: collision with root package name */
        q f67563b;

        a() {
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67564a;

        /* renamed from: b  reason: collision with root package name */
        q f67565b;

        b() {
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67566a;

        /* renamed from: b  reason: collision with root package name */
        k f67567b;

        /* renamed from: c  reason: collision with root package name */
        int f67568c;

        /* renamed from: d  reason: collision with root package name */
        String f67569d;

        /* renamed from: e  reason: collision with root package name */
        int f67570e;

        /* renamed from: f  reason: collision with root package name */
        q f67571f;

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67566a, false, 74489, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67566a, false, 74489, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f67571f = q.a((v) e.f67575b);
            r.a("click_publish_button", (Map) new com.ss.android.ugc.aweme.app.d.d().a("compose_finish", z ? 1 : 0).f34114b);
        }

        c(k kVar, int i, String str, int i2) {
            this.f67567b = kVar;
            this.f67568c = i;
            this.f67569d = str;
            this.f67570e = i2;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67572a;

        /* renamed from: b  reason: collision with root package name */
        q f67573b;

        d() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f67572a, false, 74492, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67572a, false, 74492, new Class[0], Void.TYPE);
                return;
            }
            this.f67573b = q.a((v) e.f67575b);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void b() {
            /*
                r9 = this;
                monitor-enter(r9)
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0061 }
                com.meituan.robust.ChangeQuickRedirect r3 = f67572a     // Catch:{ all -> 0x0061 }
                r4 = 0
                r5 = 74493(0x122fd, float:1.04387E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0061 }
                java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0061 }
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0061 }
                if (r1 == 0) goto L_0x0027
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0061 }
                com.meituan.robust.ChangeQuickRedirect r4 = f67572a     // Catch:{ all -> 0x0061 }
                r5 = 0
                r6 = 74493(0x122fd, float:1.04387E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0061 }
                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0061 }
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0061 }
                monitor-exit(r9)
                return
            L_0x0027:
                com.google.common.a.q r0 = r9.f67573b     // Catch:{ all -> 0x0061 }
                boolean r0 = r0.f2357a     // Catch:{ all -> 0x0061 }
                if (r0 == 0) goto L_0x005f
                com.google.common.a.q r0 = r9.f67573b     // Catch:{ all -> 0x0061 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0061 }
                long r0 = r0.a((java.util.concurrent.TimeUnit) r1)     // Catch:{ all -> 0x0061 }
                com.google.common.a.q r2 = r9.f67573b     // Catch:{ all -> 0x0061 }
                r2.d()     // Catch:{ all -> 0x0061 }
                com.ss.android.ugc.aweme.property.a r2 = com.ss.android.ugc.aweme.port.in.a.M     // Catch:{ all -> 0x0061 }
                com.ss.android.ugc.aweme.property.a$a r3 = com.ss.android.ugc.aweme.property.a.C0682a.QuietlySynthetic     // Catch:{ all -> 0x0061 }
                boolean r2 = r2.a(r3)     // Catch:{ all -> 0x0061 }
                if (r2 == 0) goto L_0x005f
                com.ss.android.ugc.aweme.common.MobClick r2 = com.ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ all -> 0x0061 }
                java.lang.String r3 = "edit_page"
                com.ss.android.ugc.aweme.common.MobClick r2 = r2.setLabelName(r3)     // Catch:{ all -> 0x0061 }
                java.lang.String r3 = "composite_length"
                com.ss.android.ugc.aweme.common.MobClick r2 = r2.setEventName(r3)     // Catch:{ all -> 0x0061 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0061 }
                com.ss.android.ugc.aweme.common.MobClick r0 = r2.setValue(r0)     // Catch:{ all -> 0x0061 }
                com.ss.android.ugc.aweme.common.r.onEvent(r0)     // Catch:{ all -> 0x0061 }
            L_0x005f:
                monitor-exit(r9)
                return
            L_0x0061:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.el.d.b():void");
        }
    }

    static class e extends v {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67574a;

        /* renamed from: b  reason: collision with root package name */
        static e f67575b = new e();

        private e() {
        }

        public final long a() {
            if (!PatchProxy.isSupport(new Object[0], this, f67574a, false, 74494, new Class[0], Long.TYPE)) {
                return TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
            }
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f67574a, false, 74494, new Class[0], Long.TYPE)).longValue();
        }
    }

    public static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a(boolean z, Throwable th, String str, Object obj) {
        String str2;
        String str3;
        Throwable th2 = th;
        String str4 = str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), th2, str4, obj}, this, f67536a, false, 74460, new Class[]{Boolean.TYPE, Throwable.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), th2, str4, obj}, this, f67536a, false, 74460, new Class[]{Boolean.TYPE, Throwable.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        long j2 = 0;
        if (this.s > 0) {
            j2 = e.f67575b.a() - this.s;
        }
        this.s = j2;
        Locale locale = Locale.US;
        double d2 = (double) this.s;
        Double.isNaN(d2);
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("duration", String.format(locale, "%d", new Object[]{Integer.valueOf((int) (d2 / 1000000.0d))})).a("status", (z ? 1 : 0));
        if ("upload".equals(this.u)) {
            str2 = f.i();
        } else {
            str2 = f.h();
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("resolution", str2).a("is_hardcode", f.a() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY).a("bite_rate", f.e()).a("video_quality", f.g()).a("_perf_monitor", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("fps", this.t).a("current_page", str4);
        String str5 = null;
        if (th2 == null) {
            str3 = null;
        } else {
            str3 = th.toString();
        }
        a3.a("fail_info", str3);
        if (th2 instanceof gq) {
            a3.a("error_code", ((gq) th2).getCode());
        }
        if (Publish.c(this.f67538c)) {
            cb cbVar = (cb) obj;
            if (com.ss.android.ugc.aweme.video.b.b(cbVar.mOutputFile)) {
                str5 = String.format(Locale.US, "%d", new Object[]{Long.valueOf(new File(cbVar.mOutputFile).length() / 1024)});
                i2 = ah.c(cbVar.mOutputFile);
            }
            this.o = cbVar.isSyntheticHardEncode;
            a3.a("compose_coding", cbVar.isSyntheticHardEncode ? "hardcoding" : "softcoding").a("file_bitrate", i2).a("file_size", str5);
        }
        r.a("video_compose_end", (Map) a3.f34114b);
        ai.d("uploadSynthetiseEndEvent: " + r0);
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f67536a, false, 74463, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f67536a, false, 74463, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
        } else if (!a(this.f67539d)) {
            this.q.a(z, str, null);
        }
    }

    public final void a(boolean z, com.ss.android.ugc.aweme.app.d.c cVar) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), cVar}, this, f67536a, false, 74468, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.app.d.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), cVar}, this, f67536a, false, 74468, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.app.d.c.class}, Void.TYPE);
            return;
        }
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            com.ss.android.ugc.aweme.k.a.f52926a.a("upload_video_end");
            com.ss.android.ugc.aweme.base.c.a aVar = com.ss.android.ugc.aweme.k.a.f52926a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            sb.append(z ? "_success" : "_failure");
            aVar.a(sb.toString());
            n.a("aweme_upload_video_funnel", a(cVar).a("type", "upload_video_end").a("status", Integer.valueOf(z ^ true ? 1 : 0)).a(PushConstants.EXTRA, com.ss.android.ugc.aweme.k.a.f52926a.a()).a("stack_trace", stackTraceString).b());
            a("upload_video_end", stackTraceString);
        } catch (Exception e2) {
            a((Throwable) e2);
        }
    }

    /* access modifiers changed from: package-private */
    public com.ss.android.ugc.aweme.app.d.c a() {
        if (!PatchProxy.isSupport(new Object[0], this, f67536a, false, 74465, new Class[0], com.ss.android.ugc.aweme.app.d.c.class)) {
            return a((com.ss.android.ugc.aweme.app.d.c) null);
        }
        return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[0], this, f67536a, false, 74465, new Class[0], com.ss.android.ugc.aweme.app.d.c.class);
    }

    private void b() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f67536a, false, 74459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67536a, false, 74459, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        if ("upload".equals(this.u)) {
            str = f.i();
        } else {
            str = f.h();
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("resolution", str);
        if (f.a()) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        com.ss.android.ugc.aweme.app.d.d a4 = a3.a("is_hardcode", str2);
        com.ss.android.ugc.aweme.app.d.d a5 = a4.a("bite_rate", f.e());
        com.ss.android.ugc.aweme.app.d.d a6 = a5.a("video_quality", f.g()).a("_perf_monitor", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        r.a("video_compose_start", (Map) a6.a("fps", this.t).f34114b);
        this.s = e.f67575b.a();
    }

    private com.ss.android.ugc.aweme.app.d.c a(com.ss.android.ugc.aweme.app.d.c cVar) {
        com.ss.android.ugc.aweme.app.d.c cVar2;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67536a, false, 74466, new Class[]{com.ss.android.ugc.aweme.app.d.c.class}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{cVar}, this, f67536a, false, 74466, new Class[]{com.ss.android.ugc.aweme.app.d.c.class}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        if (cVar == null) {
            cVar2 = new com.ss.android.ugc.aweme.app.d.c();
        } else {
            cVar2 = cVar;
        }
        cVar2.a("video_type", Integer.valueOf(this.f67538c)).a("item_type", this.f67541f.getClass().getSimpleName());
        return cVar2;
    }

    public static void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, null, f67536a, true, 74469, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, null, f67536a, true, 74469, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        try {
            n.a("aweme_upload_video_funnel", new com.ss.android.ugc.aweme.app.d.c().a("type", "pure_exception").a("exception", Log.getStackTraceString(th)).b());
        } catch (Exception unused) {
        }
    }

    public final void a(Object obj) {
        String str;
        String str2;
        final Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f67536a, false, 74464, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f67536a, false, 74464, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ep epVar = this.m;
        epVar.a("createVideo() synthetiseResult = " + this.g);
        this.j = true;
        this.p = this.f67541f.d(obj2);
        if (this.f67537b != null) {
            this.f67537b.a(this.f67540e.a(2, 0));
        }
        com.google.common.util.concurrent.q<VideoCreation> a2 = this.f67541f.a(obj2, this.g);
        final b bVar = new b();
        if (PatchProxy.isSupport(new Object[0], bVar, b.f67564a, false, 74487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f67564a, false, 74487, new Class[0], Void.TYPE);
        } else {
            bVar.f67565b = q.a((v) e.f67575b);
        }
        l.a(a2, new k<VideoCreation>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67549a;

            public final void onFailure(@NotNull Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f67549a, false, 74480, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f67549a, false, 74480, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                el.this.m.a("create video failed.");
                ej.a().a(9);
                if (el.this.f67537b != null) {
                    el.this.f67537b.a(new hn(th));
                }
                w a2 = com.ss.android.ugc.aweme.port.in.a.v.a(obj2);
                if (com.ss.android.ugc.aweme.port.in.a.v.a(a2)) {
                    com.ss.android.ugc.aweme.port.in.a.v.a(null, a2, "", 20016);
                }
            }

            public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                VideoCreation videoCreation = (VideoCreation) obj;
                if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f67549a, false, 74479, new Class[]{VideoCreation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f67549a, false, 74479, new Class[]{VideoCreation.class}, Void.TYPE);
                    return;
                }
                b bVar = bVar;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f67564a, false, 74488, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, b.f67564a, false, 74488, new Class[0], Void.TYPE);
                } else if (bVar.f67565b.f2357a) {
                    bVar.f67565b.d();
                    r.a("get_video_key", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("duration", String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) bVar.f67565b.a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f34114b);
                }
                el.this.m.a("create video finished.");
                el elVar = el.this;
                Object obj2 = obj2;
                if (PatchProxy.isSupport(new Object[]{obj2, videoCreation}, elVar, el.f67536a, false, 74467, new Class[]{Object.class, VideoCreation.class}, Void.TYPE)) {
                    el elVar2 = elVar;
                    PatchProxy.accessDispatch(new Object[]{obj2, videoCreation}, elVar2, el.f67536a, false, 74467, new Class[]{Object.class, VideoCreation.class}, Void.TYPE);
                    return;
                }
                if (!el.a(elVar.f67539d)) {
                    com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29090d, com.ss.android.experiencekit.c.d.BEGIN);
                }
                ep epVar = elVar.m;
                epVar.a("uploadVideo() synthetiseResult = " + elVar.g);
                if (PatchProxy.isSupport(new Object[]{obj2}, elVar, el.f67536a, false, 74461, new Class[]{Object.class}, Void.TYPE)) {
                    el elVar3 = elVar;
                    PatchProxy.accessDispatch(new Object[]{obj2}, elVar3, el.f67536a, false, 74461, new Class[]{Object.class}, Void.TYPE);
                } else if (!el.a(elVar.f67539d)) {
                    elVar.q = new hi(obj2, elVar.f67541f, elVar.f67538c);
                    elVar.q.a();
                    try {
                        String stackTraceString = Log.getStackTraceString(new Exception());
                        com.ss.android.ugc.aweme.k.a.f52926a.a("upload_video_start");
                        n.a("aweme_upload_video_funnel", elVar.a().a("type", "upload_video_start").a(PushConstants.EXTRA, com.ss.android.ugc.aweme.k.a.f52926a.a()).a("stack_trace", stackTraceString).b());
                        elVar.a("upload_video_start", stackTraceString);
                    } catch (Exception e2) {
                        el.a((Throwable) e2);
                    }
                }
                ei<VideoCreation> a2 = elVar.f67541f.a(obj2, videoCreation);
                if (a2.e() > 99) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 99});
                    ofInt.setDuration(1000);
                    ofInt.addUpdateListener(new en(elVar));
                    ofInt.start();
                }
                l.a(a2, new k<VideoCreation>(obj2, videoCreation) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f67553a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ Object f67554b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ VideoCreation f67555c;

                    public final void onFailure(@NotNull Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f67553a, false, 74482, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f67553a, false, 74482, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        if (el.a(el.this.f67539d)) {
                            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.h, com.ss.android.experiencekit.c.d.END);
                        } else {
                            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29090d, com.ss.android.experiencekit.c.d.END);
                        }
                        try {
                            el.this.a(false, new com.ss.android.ugc.aweme.app.d.c().a("throwable", Log.getStackTraceString(th)).a("args", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson(this.f67554b)).a("result", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) this.f67555c)));
                        } catch (Exception e2) {
                            el.a((Throwable) e2);
                        }
                        ej.a().a(9);
                        el.this.a(false, th.toString());
                        if (el.this.f67537b != null) {
                            el.this.f67537b.a(new hn(th));
                        }
                        w a2 = com.ss.android.ugc.aweme.port.in.a.v.a(this.f67554b);
                        if (com.ss.android.ugc.aweme.port.in.a.v.a(a2)) {
                            com.ss.android.ugc.aweme.port.in.a.v.a(null, a2, "", 20016);
                        }
                    }

                    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                        VideoCreation videoCreation = (VideoCreation) obj;
                        if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f67553a, false, 74481, new Class[]{VideoCreation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f67553a, false, 74481, new Class[]{VideoCreation.class}, Void.TYPE);
                            return;
                        }
                        try {
                            el.this.a(true, new com.ss.android.ugc.aweme.app.d.c().a("resultCode", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) videoCreation)).a("args", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson(this.f67554b)).a("result", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) this.f67555c)));
                        } catch (Exception e2) {
                            el.a((Throwable) e2);
                        }
                        el.this.a(true, "");
                        if (el.a(el.this.f67539d)) {
                            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.h, com.ss.android.experiencekit.c.d.END);
                        } else {
                            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.f29090d, com.ss.android.experiencekit.c.d.END);
                        }
                        el elVar = el.this;
                        Object obj2 = this.f67554b;
                        if (PatchProxy.isSupport(new Object[]{obj2, videoCreation}, elVar, el.f67536a, false, 74470, new Class[]{Object.class, VideoCreation.class}, Void.TYPE)) {
                            el elVar2 = elVar;
                            PatchProxy.accessDispatch(new Object[]{obj2, videoCreation}, elVar2, el.f67536a, false, 74470, new Class[]{Object.class, VideoCreation.class}, Void.TYPE);
                            return;
                        }
                        ep epVar = elVar.m;
                        epVar.a("createAweme() synthetiseResult = " + elVar.g + " \nargs " + obj2);
                        a aVar = new a();
                        if (PatchProxy.isSupport(new Object[0], aVar, a.f67562a, false, 74485, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], aVar, a.f67562a, false, 74485, new Class[0], Void.TYPE);
                        } else {
                            aVar.f67563b = q.a((v) e.f67575b);
                        }
                        l.a(elVar.f67541f.a(obj2, videoCreation, elVar.g), new k<at>(videoCreation, aVar, obj2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f67557a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ VideoCreation f67558b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ a f67559c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ Object f67560d;

                            public final void onFailure(@NotNull Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{th}, this, f67557a, false, 74484, new Class[]{Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{th}, this, f67557a, false, 74484, new Class[]{Throwable.class}, Void.TYPE);
                                    return;
                                }
                                ej.a().a(9);
                                if (el.this.f67537b != null) {
                                    el.this.f67537b.a(new hn(th));
                                }
                                w a2 = com.ss.android.ugc.aweme.port.in.a.v.a(this.f67560d);
                                if (com.ss.android.ugc.aweme.port.in.a.v.a(a2)) {
                                    com.ss.android.ugc.aweme.port.in.a.v.a(null, a2, "", 20016);
                                }
                            }

                            public final /* synthetic */ void onSuccess(Object obj) {
                                String str;
                                String str2;
                                String str3;
                                String str4;
                                String str5;
                                String str6;
                                at atVar = (at) obj;
                                if (PatchProxy.isSupport(new Object[]{atVar}, this, f67557a, false, 74483, new Class[]{at.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{atVar}, this, f67557a, false, 74483, new Class[]{at.class}, Void.TYPE);
                                    return;
                                }
                                atVar.materialId = this.f67558b.materialId;
                                String str7 = null;
                                com.ss.android.ugc.aweme.port.in.a.v.a("mus_af_post_video", null);
                                a aVar = this.f67559c;
                                if (PatchProxy.isSupport(new Object[0], aVar, a.f67562a, false, 74486, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], aVar, a.f67562a, false, 74486, new Class[0], Void.TYPE);
                                } else if (aVar.f67563b.f2357a) {
                                    aVar.f67563b.d();
                                    r.a("url_upload", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("duration", String.format(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) aVar.f67563b.a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f34114b);
                                }
                                if (el.this.f67537b != null) {
                                    ej.a().a(10);
                                    el.this.f67537b.a(atVar);
                                    c cVar = el.this.l;
                                    Object obj2 = this.f67560d;
                                    boolean z = el.this.p;
                                    boolean z2 = el.this.o;
                                    if (PatchProxy.isSupport(new Object[]{obj2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, cVar, c.f67566a, false, 74490, new Class[]{Object.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                        c cVar2 = cVar;
                                        PatchProxy.accessDispatch(new Object[]{obj2, Byte.valueOf(z), Byte.valueOf(z2)}, cVar2, c.f67566a, false, 74490, new Class[]{Object.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                                    } else if (cVar.f67571f.f2357a) {
                                        if (PatchProxy.isSupport(new Object[]{obj2, Byte.valueOf(z), Byte.valueOf(z2)}, cVar, c.f67566a, false, 74491, new Class[]{Object.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                            c cVar3 = cVar;
                                            PatchProxy.accessDispatch(new Object[]{obj2, Byte.valueOf(z), Byte.valueOf(z2)}, cVar3, c.f67566a, false, 74491, new Class[]{Object.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                                        } else {
                                            n.a("aweme_movie_publish", "compose_upload_time", (float) cVar.f67571f.a(TimeUnit.MILLISECONDS));
                                            n.a("aweme_movie_publish", "compose_upload_speed", (((float) cVar.f67567b.b(obj2)) * 1.0f) / ((float) cVar.f67571f.a(TimeUnit.MILLISECONDS)));
                                            String format = String.format(Locale.US, "%d", new Object[]{Long.valueOf(cVar.f67571f.a(TimeUnit.MILLISECONDS))});
                                            String a2 = Publish.a(cVar.f67570e, obj2);
                                            if ("upload".equals(a2)) {
                                                str = f.i();
                                            } else {
                                                str = f.h();
                                            }
                                            com.ss.android.ugc.aweme.app.d.d a3 = new com.ss.android.ugc.aweme.app.d.d().a("duration", format);
                                            if (el.a(cVar.f67568c)) {
                                                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                                            } else {
                                                str2 = PushConstants.PUSH_TYPE_NOTIFY;
                                            }
                                            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("upload_while_compose", str2).a("shoot_way", cVar.f67569d).a("content_type", Publish.b(cVar.f67570e)).a("content_source", a2);
                                            if (f.a()) {
                                                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                                            } else {
                                                str3 = PushConstants.PUSH_TYPE_NOTIFY;
                                            }
                                            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("is_hardcode", str3);
                                            if (z) {
                                                str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                                            } else {
                                                str4 = PushConstants.PUSH_TYPE_NOTIFY;
                                            }
                                            com.ss.android.ugc.aweme.app.d.d a6 = a5.a("is_download_video", str4).a("resolution", str);
                                            if (Publish.c(cVar.f67570e)) {
                                                cb cbVar = (cb) obj2;
                                                int c2 = ah.c(cbVar.mOutputFile);
                                                if (com.ss.android.ugc.aweme.video.b.b(cbVar.mOutputFile)) {
                                                    str7 = String.format(Locale.US, "%d", new Object[]{Long.valueOf(new File(cbVar.mOutputFile).length() / 1024)});
                                                }
                                                com.ss.android.ugc.aweme.app.d.d a7 = a6.a("file_bitrate", c2).a("filter_id_list", cbVar.mCurFilterIds).a("effect_list", cbVar.getEditEffectList()).a("info_sticker_list", cbVar.getInfoStickerList());
                                                if (z2) {
                                                    str5 = "hardcoding";
                                                } else {
                                                    str5 = "softcoding";
                                                }
                                                com.ss.android.ugc.aweme.app.d.d a8 = a7.a("compose_coding", str5);
                                                if (dmt.av.video.k.b(cbVar)) {
                                                    str6 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                                                } else {
                                                    str6 = PushConstants.PUSH_TYPE_NOTIFY;
                                                }
                                                a8.a("is_reencode", str6).a("file_size", str7);
                                            }
                                            r.a("publish_finish", (Map) a6.f34114b);
                                            ai.d("publish_finish " + format);
                                        }
                                        cVar.f67571f.d();
                                    }
                                }
                                com.ss.android.ugc.aweme.port.in.a.v.b(this.f67560d);
                            }

                            {
                                this.f67558b = r2;
                                this.f67559c = r3;
                                this.f67560d = r4;
                            }
                        }, com.ss.android.ugc.aweme.base.k.f34752b);
                    }

                    {
                        this.f67554b = r2;
                        this.f67555c = r3;
                    }
                }, com.ss.android.ugc.aweme.base.k.f34752b);
                a2.b(new eo(elVar, a2), com.ss.android.ugc.aweme.base.k.f34752b);
            }
        }, com.ss.android.ugc.aweme.base.k.f34752b);
        MobClick labelName = MobClick.obtain().setEventName("publish").setLabelName("start");
        t a3 = new t().a("shoot_way", this.r);
        if (this.f67538c == 5) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        r.onEvent(labelName.setJsonObject(a3.a("is_photo", str).a()));
        com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("shoot_entrance", this.r);
        if (this.f67538c == 5) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        r.a("publish_start", (Map) a4.a("is_photo", str2).f34114b);
    }

    /* access modifiers changed from: package-private */
    public void a(final Object obj, final boolean z) {
        if (PatchProxy.isSupport(new Object[]{obj, Byte.valueOf(z ? (byte) 1 : 0)}, this, f67536a, false, 74457, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Byte.valueOf(z)}, this, f67536a, false, 74457, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (Publish.c(this.f67538c)) {
            this.t = (double) ah.b(((cb) obj).mPath);
        }
        this.u = Publish.a(this.f67538c, obj);
        ej.a().a(2);
        ei<SynthetiseResult> a2 = this.f67541f.a(obj, this.h);
        if (a(this.f67539d)) {
            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.h, com.ss.android.experiencekit.c.d.BEGIN);
        } else {
            com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.g, com.ss.android.experiencekit.c.d.BEGIN);
        }
        this.k.a();
        b();
        this.i = a2;
        r.a("av_memory_log", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
        l.a(a2, new k<SynthetiseResult>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67545a;

            public final void onFailure(@NotNull Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f67545a, false, 74478, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f67545a, false, 74478, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                if (el.a(el.this.f67539d)) {
                    com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.h, com.ss.android.experiencekit.c.d.END);
                } else {
                    com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.g, com.ss.android.experiencekit.c.d.END);
                }
                el.this.m.a("synthetise failed");
                r.a("av_memory_log", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("synthetise_start", "failed").a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
                ej.a().a(9);
                if (el.this.n) {
                    el.this.a(false, th, "homepage_follow", obj);
                } else {
                    el.this.a(false, th, "video_post_page", obj);
                }
                if (el.this.f67537b != null) {
                    el.this.f67537b.a(new hn(th));
                }
                w a2 = com.ss.android.ugc.aweme.port.in.a.v.a(obj);
                if (com.ss.android.ugc.aweme.port.in.a.v.a(a2)) {
                    com.ss.android.ugc.aweme.port.in.a.v.a(null, a2, "", 20016);
                }
            }

            public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67545a, false, 74477, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67545a, false, 74477, new Class[]{SynthetiseResult.class}, Void.TYPE);
                    return;
                }
                if (!el.a(el.this.f67539d)) {
                    com.ss.android.experiencekit.b.b().a(com.ss.android.experiencekit.c.a.g, com.ss.android.experiencekit.c.d.END);
                }
                try {
                    if (el.this.n) {
                        el.this.a(true, null, "homepage_follow", obj);
                    } else {
                        el.this.a(true, null, "video_post_page", obj);
                    }
                    r.a("av_memory_log", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("synthetise_start", "success").a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
                    el.this.g = synthetiseResult;
                    ep epVar = el.this.m;
                    epVar.a("synthetise() finished, result = " + synthetiseResult);
                    el.this.k.b();
                    if (!el.this.h.isCanceled() && z) {
                        el.this.a(obj);
                    }
                } catch (Exception e2) {
                    n.a("aweme_synthetise_error_log", com.ss.android.ugc.aweme.app.d.c.a().a("exception", com.facebook.common.internal.k.c(e2)).b());
                }
            }
        }, com.google.common.util.concurrent.v.a());
        a2.b(new em(this, a2), com.google.common.util.concurrent.v.a());
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) throws JSONException {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f67536a, false, 74462, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f67536a, false, 74462, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject optJSONObject = com.ss.android.ugc.aweme.k.a.f52926a.b().optJSONObject("events");
        if (optJSONObject.optInt("upload_video_start") < optJSONObject.optInt("upload_video_end")) {
            com.ss.android.ugc.aweme.app.d.c a2 = a();
            n.a("aweme_upload_video_funnel", a2.a("type", str3 + "_abnormal_counting").a(PushConstants.EXTRA, com.ss.android.ugc.aweme.k.a.f52926a.a()).a("stack_trace", str4).b());
        }
    }

    el(k kVar, int i2, int i3, String str, s<at> sVar) {
        this.f67541f = kVar;
        this.r = str;
        this.f67538c = i2;
        this.f67539d = i3;
        this.f67537b = new cj(sVar);
        this.h = new CancellationSignal();
        this.l = new c(this.f67541f, this.f67539d, this.r, this.f67538c);
        this.m = new ep(this);
        ep epVar = this.m;
        epVar.a("new Publisher() type = " + i2);
    }
}
