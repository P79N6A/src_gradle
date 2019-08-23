package com.ss.android.ugc.playerkit.videoview;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Surface;
import android.view.ViewGroup;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.crashlytics.android.Crashlytics;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.c.f;
import com.ss.android.ugc.playerkit.session.Session;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import tv.danmaku.ijk.media.player.DummySurface;

public class VideoViewComponent implements com.ss.android.ugc.aweme.video.a.a, VideoPlayerPageLifecycleProxy, g {
    private static com.ss.android.ugc.playerkit.a.a h = new com.ss.android.ugc.playerkit.a.a() {
        public final void onEvent(JSONArray jSONArray) {
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        AppLog.recordMiscLog(GlobalContext.getContext(), "video_playq", jSONArray.getJSONObject(i));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.player.sdk.api.c f4333a;

    /* renamed from: b  reason: collision with root package name */
    public h f4334b;

    /* renamed from: c  reason: collision with root package name */
    public Video f4335c;

    /* renamed from: d  reason: collision with root package name */
    public Session f4336d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4337e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4338f;
    public int g = 0;
    private boolean i;
    private Set<com.ss.android.ugc.aweme.video.a.a> j = Collections.newSetFromMap(new WeakHashMap());
    private com.ss.android.ugc.aweme.player.sdk.api.a k = j.f77785a;

    static class a implements d<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private VideoUrlModel f77743a;

        public final /* synthetic */ Object a() {
            if (c.INSTANCE.cacheChecker() == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(c.INSTANCE.cacheChecker().a(this.f77743a));
        }

        public a(VideoUrlModel videoUrlModel) {
            this.f77743a = videoUrlModel;
        }
    }

    static class b implements d<f> {

        /* renamed from: a  reason: collision with root package name */
        private VideoUrlModel f77744a;

        /* renamed from: b  reason: collision with root package name */
        private Session f77745b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f77746c;

        public final /* synthetic */ Object a() {
            return com.ss.android.ugc.playerkit.videoview.c.a.a().b(this.f77744a.getUrlKey()).a(this.f77744a, this.f77745b.playerType, this.f77746c);
        }

        public b(VideoUrlModel videoUrlModel, Session session, boolean z) {
            this.f77744a = videoUrlModel;
            this.f77745b = session;
            this.f77746c = z;
        }
    }

    static class c implements d<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private VideoUrlModel f77747a;

        public final /* synthetic */ Object a() {
            Integer num;
            VideoUrlModel videoUrlModel = this.f77747a;
            int i = -1;
            if (videoUrlModel != null) {
                com.ss.android.ugc.lib.video.bitrate.regulator.a.c hitBitrate = videoUrlModel.getHitBitrate();
                if (hitBitrate == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(hitBitrate.getQualityType());
                }
                if (num == null) {
                    num = -1;
                }
                i = num.intValue();
            }
            return Integer.valueOf(i);
        }

        public c(VideoUrlModel videoUrlModel) {
            this.f77747a = videoUrlModel;
        }
    }

    public final void c(boolean z) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPagePause() {
        T();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onPageResume() {
        S();
    }

    public final void a(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f4334b = h.a(keepSurfaceTextureView);
        a(keepSurfaceTextureView.getContext());
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        this.j.add(aVar);
        if (this.f4333a != null) {
            this.f4333a.a((com.ss.android.ugc.aweme.video.a.a) this);
        }
    }

    public final void a(i iVar) {
        this.f4334b.a(iVar);
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a a2 : this.j) {
                a2.a(aVar);
            }
        }
    }

    public final void a(e eVar) {
        this.f4337e = false;
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a a2 : this.j) {
                a2.a(eVar);
            }
        }
        if (eVar.f76050c && this.f4335c != null) {
            a(this.f4335c.getPlayAddrH264(), true, true, this.g);
        }
    }

    public final void a(String str) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a a2 : this.j) {
                a2.a(str);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        this.f4337e = false;
        this.f4338f = false;
        a.a().a(this);
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a a2 : this.j) {
                a2.a(bVar);
            }
        }
    }

    public final void P() {
        if (this.f4333a != null) {
            this.f4333a.a(0.0f, 0.0f);
        }
    }

    public final void Q() {
        if (this.f4333a != null) {
            this.f4333a.a(1.0f, 1.0f);
        }
    }

    public final long V() {
        if (this.f4333a != null) {
            return this.f4333a.h();
        }
        return 0;
    }

    public final void W() {
        if (this.f4333a != null) {
            this.f4333a.o();
        }
    }

    public final IPlayer.e X() {
        if (this.f4333a != null) {
            return this.f4333a.s();
        }
        return null;
    }

    public final long b() {
        if (this.f4333a != null) {
            return this.f4333a.g();
        }
        return 0;
    }

    public final boolean c() {
        if (this.f4333a != null) {
            return this.f4333a.i();
        }
        return false;
    }

    public final void R() {
        if (this.f4333a != null) {
            a.a().a(this);
            this.f4337e = false;
            this.f4333a.a();
        }
    }

    public final void S() {
        if (this.f4336d != null && this.f4336d.urlModel != null) {
            this.f4333a.a(this.f4336d.urlModel.getSourceId());
        }
    }

    public final void T() {
        if (this.f4333a != null) {
            this.f4333a.d();
        }
        if (this.f4334b != null) {
            this.f4334b.e();
            if (this.f4333a != null && this.f4333a.q() == c.a.IjkHardware && this.f4334b.i()) {
                this.f4334b.a(true);
            }
        }
    }

    public final void U() {
        if (this.f4333a != null) {
            if (d.f77762a && com.ss.android.ugc.playerkit.b.a(this.f4333a.q()) && com.ss.android.ugc.playerkit.c.a.r().e()) {
                d.f77762a = this.f4333a.f();
            }
            this.f4333a.c();
        }
        if (this.f4334b != null) {
            this.f4334b.f();
        }
    }

    public final void a() {
        if (this.f4333a != null) {
            this.f4333a.e();
        }
        if (this.f4334b != null) {
            this.f4334b.f();
        }
    }

    private static d<Integer> b(VideoUrlModel videoUrlModel) {
        return new c(videoUrlModel);
    }

    private static d<Boolean> c(VideoUrlModel videoUrlModel) {
        return new a(videoUrlModel);
    }

    private void a(final Context context) {
        this.f4334b.a((i) new i() {
            public final void b(int i, int i2) {
            }

            public final void a() {
                if (VideoViewComponent.this.f4334b.g() == 1 && VideoViewComponent.this.f4334b.h()) {
                    VideoViewComponent.this.f4333a.b((Surface) DummySurface.newInstanceV17(DummySurface.isSecureSupported(context)));
                }
            }

            public final void a(int i, int i2) {
                if (VideoViewComponent.this.f4334b.g() == 1 && VideoViewComponent.this.f4334b.h()) {
                    VideoViewComponent.this.f4334b.a(false);
                }
                if (VideoViewComponent.this.f4338f) {
                    VideoViewComponent.this.f4338f = false;
                    VideoViewComponent.this.a(VideoViewComponent.this.f4335c, true, VideoViewComponent.this.g);
                }
            }
        });
    }

    private static void a(c.a aVar) {
        if (io.fabric.sdk.android.c.c() && aVar != null) {
            Crashlytics.setString("player_type", aVar.toString());
        }
    }

    public final void b(com.ss.android.ugc.aweme.video.a.a aVar) {
        this.j.remove(aVar);
        if (this.j.isEmpty() && this.f4333a != null) {
            this.f4333a.a((com.ss.android.ugc.aweme.video.a.a) null);
        }
    }

    public final void c(String str) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a c2 : this.j) {
                c2.c(str);
            }
        }
    }

    public final void d(String str) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a d2 : this.j) {
                d2.d(str);
            }
        }
    }

    public final void e(String str) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a e2 : this.j) {
                e2.e(str);
            }
        }
    }

    public final void b(e eVar) {
        this.f4337e = false;
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a b2 : this.j) {
                b2.b(eVar);
            }
        }
    }

    private boolean a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null && this.f4336d != null && this.f4336d.urlModel != null && StringUtils.equal(videoUrlModel.getUri(), this.f4336d.urlModel.getUri()) && StringUtils.equal(videoUrlModel.getRatio(), this.f4336d.urlModel.getRatio()) && !TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f4333a.a(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return true;
        }
        return false;
    }

    public final void b(i iVar) {
        this.f4334b.b(iVar);
    }

    public final void a(float f2) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a a2 : this.j) {
                a2.a(f2);
            }
        }
    }

    public final void b(String str) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a b2 : this.j) {
                b2.b(str);
            }
        }
    }

    public final void b(boolean z) {
        if (!this.j.isEmpty()) {
            for (com.ss.android.ugc.aweme.video.a.a b2 : this.j) {
                b2.b(z);
            }
        }
    }

    public final void a(ViewGroup viewGroup) {
        this.f4334b = h.a(viewGroup);
        a(viewGroup.getContext());
    }

    public final void a(Video video) {
        boolean z;
        VideoUrlModel playAddrH265 = video.getPlayAddrH265();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH265 != null || playAddrH264 != null) {
            if (a(playAddrH265) || a(playAddrH264)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                S();
            } else {
                a(video, true, this.g);
            }
        }
    }

    @NonNull
    private static d<f> a(VideoUrlModel videoUrlModel, Session session, boolean z) {
        return new b(videoUrlModel, session, z);
    }

    public final void a(Video video, boolean z, int i2) {
        if (video != null) {
            this.f4335c = video;
            if (!this.f4334b.c()) {
                this.f4338f = true;
            } else if (this.f4337e) {
                R();
            } else if (d.a(video, com.ss.android.ugc.playerkit.c.a.r().a())) {
                a(video.getPlayAddrH265(), z, false, i2);
            } else {
                a(video.getPlayAddrH264(), z, false, i2);
            }
        }
    }

    private void a(VideoUrlModel videoUrlModel, boolean z, boolean z2, int i2) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (videoUrlModel2 != null && com.ss.android.ugc.playerkit.b.a((UrlModel) videoUrlModel)) {
            String uri = videoUrlModel.getUri();
            if (TextUtils.isEmpty(uri)) {
                ExceptionMonitor.ensureNotReachHere((Throwable) new RuntimeException("VideoUrlModel url_key is null. vid=" + videoUrlModel.getSourceId()));
            }
            this.f4336d = com.ss.android.ugc.playerkit.session.a.a().d(uri);
            this.g = i2;
            if (this.i) {
                this.f4333a = new com.ss.android.ugc.aweme.player.sdk.b.d(new com.ss.android.ugc.aweme.player.sdk.b.e(com.ss.android.ugc.playerkit.c.a.r().a()));
            } else {
                this.f4333a = com.ss.android.ugc.playerkit.videoview.c.a.a().a(uri);
            }
            this.f4336d.uri = uri;
            this.f4336d.urlModel = videoUrlModel2;
            this.f4336d.playerType = this.f4333a.q();
            this.f4333a.a((com.ss.android.ugc.aweme.video.a.a) this);
            this.f4333a.a(h);
            this.f4333a.a(this.k);
            this.f4333a.a(c.INSTANCE.playInfoCallback());
            this.f4333a.a(this.f4334b.b());
            com.ss.android.ugc.playerkit.a.a().a(this.f4336d.uri, "player_try_play");
            com.ss.android.ugc.playerkit.b.b.a(uri);
            com.ss.android.ugc.playerkit.c.e eVar = new com.ss.android.ugc.playerkit.c.e(a(videoUrlModel2, this.f4336d, z2), c(videoUrlModel), com.ss.android.ugc.playerkit.c.a.r().l(), videoUrlModel.getSourceId(), z, com.ss.android.ugc.playerkit.c.a.r().m(), false, videoUrlModel.isH265(), 0, b(videoUrlModel), uri, true, true, com.ss.android.ugc.playerkit.c.a.r().o(), this.g);
            eVar.k = com.ss.android.ugc.playerkit.c.a.r().p();
            eVar.n = videoUrlModel.getBitRatedRatioUri();
            eVar.t = com.ss.android.ugc.playerkit.c.a.r().q();
            this.f4333a.a(eVar);
            if (!z) {
                this.f4337e = true;
            }
            if (this.f4334b != null) {
                this.f4334b.f();
            }
            a(this.f4333a.q());
        }
    }
}
