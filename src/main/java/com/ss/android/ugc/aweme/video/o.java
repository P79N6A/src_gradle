package com.ss.android.ugc.aweme.video;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.Surface;
import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.symphony.g;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.playerkit.a.a;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.c.e;
import com.ss.android.ugc.playerkit.c.f;
import com.ss.android.ugc.playerkit.session.Session;
import org.json.JSONArray;
import org.json.JSONException;

@Deprecated
public class o implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76178a;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f76179d = AbTestManager.a().bf();
    private static boolean j = AbTestManager.a().d().playerRefactor;
    private static o k;
    private static LruCache<String, a> s = new LruCache<String, a>(100) {
        public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
            return 1;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f76180b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76181c;

    /* renamed from: e  reason: collision with root package name */
    public c f76182e;

    /* renamed from: f  reason: collision with root package name */
    public VideoUrlModel f76183f;
    public volatile boolean g;
    public c.a h;
    public Session i;
    private final g l;
    private int m;
    private boolean n;
    private boolean o;
    private com.ss.android.ugc.aweme.player.sdk.api.a p;
    private b q;
    private boolean r;

    public static boolean v() {
        return j;
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        com.ss.android.ugc.aweme.video.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76178a, false, 88961, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76178a, false, 88961, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        this.f76182e.a(aVar2);
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 88962, new Class[0], Boolean.TYPE)) {
            return this.f76182e.i();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88962, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(Video video, boolean z) {
        Video video2 = video;
        if (PatchProxy.isSupport(new Object[]{video2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f76178a, false, 88966, new Class[]{Video.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, Byte.valueOf(z)}, this, f76178a, false, 88966, new Class[]{Video.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(video2, z, 0);
    }

    public final void a(Video video, boolean z, int i2) {
        Video video2 = video;
        if (PatchProxy.isSupport(new Object[]{video2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f76178a, false, 88967, new Class[]{Video.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, Byte.valueOf(z), Integer.valueOf(i2)}, this, f76178a, false, 88967, new Class[]{Video.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(video2, z, i2, true);
    }

    public final void a(VideoUrlModel videoUrlModel, boolean z, boolean z2) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2, (byte) 1, (byte) 1}, this, f76178a, false, 88969, new Class[]{VideoUrlModel.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel2, (byte) 1, (byte) 1}, this, f76178a, false, 88969, new Class[]{VideoUrlModel.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(videoUrlModel2, true, true, v.Normal);
    }

    public void a(d<f> dVar, d<Boolean> dVar2, VideoUrlModel videoUrlModel, boolean z, @NonNull v vVar, boolean z2, boolean z3, d<Integer> dVar3, boolean z4, boolean z5, int i2) {
        d<f> dVar4 = dVar;
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        v vVar2 = vVar;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{dVar4, dVar2, videoUrlModel2, Byte.valueOf(z ? (byte) 1 : 0), vVar2, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), dVar3, Byte.valueOf(z4 ? (byte) 1 : 0), Byte.valueOf(z5 ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f76178a, false, 88974, new Class[]{d.class, d.class, VideoUrlModel.class, Boolean.TYPE, v.class, Boolean.TYPE, Boolean.TYPE, d.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar4, dVar2, videoUrlModel2, Byte.valueOf(z), vVar2, Byte.valueOf(z2), Byte.valueOf(z3), dVar3, Byte.valueOf(z4), Byte.valueOf(z5), Integer.valueOf(i2)}, this, f76178a, false, 88974, new Class[]{d.class, d.class, VideoUrlModel.class, Boolean.TYPE, v.class, Boolean.TYPE, Boolean.TYPE, d.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "prepare() called with: urlSupplier = [" + dVar4 + "], urlModel = [" + videoUrlModel2 + "], isRenderReady = [" + z + "], config = [" + vVar2 + "], vr = [" + z2 + "]");
        boolean z6 = AbTestManager.a().d().isTTPlayerAsyncInit;
        Context a2 = com.ss.android.ugc.aweme.base.utils.d.a();
        String sourceId = videoUrlModel.getSourceId();
        int i4 = i3;
        e eVar = new e(dVar, dVar2, a2, sourceId, z, vVar, z2, z3, this.m, dVar3, videoUrlModel.getUri(), z4, z5, z6, AbTestManager.a().bS());
        eVar.k = AbTestManager.a().d().playerFramesWait;
        eVar.s = i4;
        eVar.n = videoUrlModel.getBitRatedRatioUri();
        eVar.s = i4;
        eVar.t = com.ss.android.ugc.playerkit.c.a.r().q() && this.o;
        this.f76182e.a(eVar);
        this.g = true;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76178a, false, 88985, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76178a, false, 88985, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "tryPausePlay() called");
        this.l.b();
        this.f76182e.d();
        this.g = false;
        x();
        this.r = z;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f76178a, false, 88986, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f76178a, false, 88986, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f76182e.a(f2);
    }

    public final void a(Video video, com.ss.android.ugc.aweme.video.a.a aVar) {
        Video video2 = video;
        com.ss.android.ugc.aweme.video.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{video2, aVar2}, this, f76178a, false, 88989, new Class[]{Video.class, com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, aVar2}, this, f76178a, false, 88989, new Class[]{Video.class, com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        a(video2, aVar2, 0);
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f76178a, false, 88994, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f76178a, false, 88994, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f76182e.a(surface2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76178a, false, 89020, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76178a, false, 89020, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f76182e != null) {
            this.f76182e.b(i2);
        }
    }

    public final c.a m() {
        c.a aVar;
        if (this.i != null) {
            aVar = this.i.playerType;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return c.a.TT;
        }
        return aVar;
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88964, new Class[0], Void.TYPE);
            return;
        }
        if (io.fabric.sdk.android.c.c()) {
            Crashlytics.setString("player_type", this.h.toString());
        }
    }

    private int y() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 89011, new Class[0], Integer.TYPE)) {
            return this.f76182e.l();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89011, new Class[0], Integer.TYPE)).intValue();
    }

    public final long c() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 88979, new Class[0], Long.TYPE)) {
            return this.f76182e.g();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88979, new Class[0], Long.TYPE)).longValue();
    }

    public final long d() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 88980, new Class[0], Long.TYPE)) {
            return this.f76182e.h();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88980, new Class[0], Long.TYPE)).longValue();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88981, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "render() called");
        this.f76182e.a();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88984, new Class[0], Void.TYPE);
            return;
        }
        a(false);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88992, new Class[0], Void.TYPE);
            return;
        }
        this.f76182e.e();
        this.g = false;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88993, new Class[0], Void.TYPE);
            return;
        }
        i();
        this.g = false;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88997, new Class[0], Void.TYPE);
            return;
        }
        this.f76182e.a(0.0f, 0.0f);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88998, new Class[0], Void.TYPE);
            return;
        }
        this.f76182e.a(1.0f, 1.0f);
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 89001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89001, new Class[0], Void.TYPE);
            return;
        }
        this.f76183f = null;
        this.f76181c = true;
        this.f76182e.m();
    }

    public final float o() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 89003, new Class[0], Float.TYPE)) {
            return this.f76182e.a(2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89003, new Class[0], Float.TYPE)).floatValue();
    }

    public final float p() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 89010, new Class[0], Float.TYPE)) {
            return this.f76182e.a(8);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89010, new Class[0], Float.TYPE)).floatValue();
    }

    public final int q() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 89014, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89014, new Class[0], Integer.TYPE)).intValue();
        }
        IPlayer.d t = this.f76182e.t();
        if (t != null) {
            i2 = t.f59115c;
        }
        return i2;
    }

    public final int r() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 89015, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89015, new Class[0], Integer.TYPE)).intValue();
        }
        IPlayer.d t = this.f76182e.t();
        if (t != null) {
            i2 = t.f59116d;
        }
        return i2;
    }

    public final String s() {
        if (!PatchProxy.isSupport(new Object[0], this, f76178a, false, 89016, new Class[0], String.class)) {
            return this.f76182e.u();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89016, new Class[0], String.class);
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 89019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89019, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76182e != null) {
            this.f76182e.n();
        }
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 89021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 89021, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76182e != null) {
            this.f76182e.o();
        }
    }

    public o() {
        this.f76180b = true;
        this.f76181c = true;
        this.l = g.f39613b;
        this.p = p.f76185b;
        this.q = new g();
        this.m = com.ss.android.ugc.playerkit.c.a.r().b();
        this.h = com.ss.android.ugc.playerkit.c.a.r().a();
        w();
        this.f76182e = new com.ss.android.ugc.aweme.player.sdk.b.d(new com.ss.android.ugc.aweme.player.sdk.b.e(this.h));
        this.f76182e.a((a) this);
        this.f76182e.a(this.p);
        this.f76182e.a(this.q);
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88988, new Class[0], Void.TYPE);
        } else if (!this.n && this.f76183f != null && !TextUtils.isEmpty(this.f76183f.getSourceId()) && c() >= 0) {
            a aVar = s.get(this.f76183f.getSourceId());
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f76006a = c();
            aVar.f76007b = y();
            s.put(this.f76183f.getSourceId(), aVar);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88982, new Class[0], Void.TYPE);
            return;
        }
        this.l.a();
        if (this.f76183f != null && !this.f76182e.b((com.ss.android.ugc.aweme.video.a.a) null)) {
            com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "resumePlay() called");
            this.f76182e.a(this.f76183f.getSourceId());
            this.g = false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f76178a, false, 88983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76178a, false, 88983, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "stopPlay() called");
        if (this.f76180b && com.ss.android.ugc.playerkit.b.a(this.f76182e.q()) && AbTestManager.a().bd()) {
            this.f76180b = this.f76182e.f();
            com.ss.android.ugc.playerkit.videoview.d.f77762a = this.f76180b;
        }
        this.f76182e.c();
        this.g = false;
        x();
    }

    public static o b() {
        o oVar;
        if (PatchProxy.isSupport(new Object[0], null, f76178a, true, 88965, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], null, f76178a, true, 88965, new Class[0], o.class);
        }
        if (!com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.feed.g.f.f45357a, true, 41337, new Class[0], o.class)) {
                oVar = (o) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.feed.g.f.f45357a, true, 41337, new Class[0], o.class);
            } else {
                oVar = com.ss.android.ugc.aweme.feed.g.f.a(AwemeAppData.p().f());
            }
            if (oVar != null) {
                return oVar;
            }
        }
        if (f76179d) {
            return u.a().b();
        }
        if (k == null) {
            synchronized (o.class) {
                if (k == null) {
                    o oVar2 = new o();
                    k = oVar2;
                    oVar2.o = true;
                }
            }
        }
        return k;
    }

    @NonNull
    public d<Integer> a(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76178a, false, 88975, new Class[]{VideoUrlModel.class}, d.class)) {
            return new r(videoUrlModel2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76178a, false, 88975, new Class[]{VideoUrlModel.class}, d.class);
    }

    @NonNull
    public d<Boolean> b(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76178a, false, 88978, new Class[]{VideoUrlModel.class}, d.class)) {
            return new t(videoUrlModel2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76178a, false, 88978, new Class[]{VideoUrlModel.class}, d.class);
    }

    public static a a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f76178a, true, 88960, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f76178a, true, 88960, new Class[]{String.class}, a.class);
        } else if (TextUtils.isEmpty(str)) {
            return new a();
        } else {
            a aVar = s.get(str2);
            if (aVar == null) {
                aVar = new a();
            }
            return aVar;
        }
    }

    private boolean c(VideoUrlModel videoUrlModel) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, this, f76178a, false, 88991, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, this, f76178a, false, 88991, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (videoUrlModel != null && this.f76183f != null && TextUtils.equals(videoUrlModel.getUri(), this.f76183f.getUri()) && TextUtils.equals(videoUrlModel.getRatio(), this.f76183f.getRatio()) && !TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f76182e.a(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean b(com.ss.android.ugc.aweme.video.a.a aVar) {
        com.ss.android.ugc.aweme.video.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f76178a, false, 88963, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Boolean.TYPE)) {
            return this.f76182e.b(aVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76178a, false, 88963, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Boolean.TYPE)).booleanValue();
    }

    public void onEvent(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{jSONArray2}, this, f76178a, false, 89002, new Class[]{JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray2}, this, f76178a, false, 89002, new Class[]{JSONArray.class}, Void.TYPE);
            return;
        }
        if (jSONArray2 != null) {
            while (i2 < jSONArray.length()) {
                try {
                    if (!com.ss.android.ugc.aweme.g.a.a() || AbTestManager.a().d().playerEventLogOpen) {
                        AppLog.recordMiscLog(GlobalContext.getContext(), "video_playq", jSONArray2.getJSONObject(i2));
                        i2++;
                    } else {
                        i2++;
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public o(boolean z) {
        this.f76180b = true;
        this.f76181c = true;
        this.l = g.f39613b;
        this.p = q.f76265b;
        this.q = new g();
        this.n = true;
        this.m = com.ss.android.ugc.playerkit.c.a.r().b();
        this.h = com.ss.android.ugc.playerkit.c.a.r().a();
        w();
        this.f76182e = new com.ss.android.ugc.aweme.player.sdk.b.d(new com.ss.android.ugc.aweme.player.sdk.b.e(this.h));
        this.f76182e.a((a) this);
        this.f76182e.a(this.p);
        this.f76182e.a(this.q);
    }

    public final void c(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f76178a, false, 88987, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f76178a, false, 88987, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "tryPausePlay() called with: listener");
        this.l.b();
        if (aVar != null && this.f76182e.b(aVar)) {
            this.f76182e.d();
            this.g = false;
            x();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f76178a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 89022(0x15bbe, float:1.24746E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f76178a
            r13 = 0
            r14 = 89022(0x15bbe, float:1.24746E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0039:
            r2 = r17
            com.ss.android.ugc.aweme.player.sdk.api.c r3 = r2.f76182e
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r3
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.video.y.f76281a
            r13 = 1
            r14 = 89057(0x15be1, float:1.24795E-40)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.c> r5 = com.ss.android.ugc.aweme.player.sdk.api.c.class
            r15[r9] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r15[r1] = r5
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x007d
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r3
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.video.y.f76281a
            r13 = 1
            r14 = 89057(0x15be1, float:1.24795E-40)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.c> r0 = com.ss.android.ugc.aweme.player.sdk.api.c.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r1] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x007d:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.video.y.f76281a
            r13 = 1
            r14 = 89066(0x15bea, float:1.24808E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.c> r4 = com.ss.android.ugc.aweme.player.sdk.api.c.class
            r15[r9] = r4
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e> r16 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            if (r4 == 0) goto L_0x00b2
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.video.y.f76281a
            r13 = 1
            r14 = 89066(0x15bea, float:1.24808E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.c> r1 = com.ss.android.ugc.aweme.player.sdk.api.c.class
            r15[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e> r16 = com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r5 = r1
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e r5 = (com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e) r5
            goto L_0x00bd
        L_0x00b2:
            if (r3 != 0) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e r1 = r3.s()
            if (r1 != 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r5 = r1
        L_0x00bd:
            java.lang.String r0 = com.ss.android.ugc.aweme.video.y.a((com.ss.android.ugc.aweme.player.sdk.api.IPlayer.e) r5, (java.lang.String) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.o.b(java.lang.String):java.lang.String");
    }

    @NonNull
    public d<f> a(VideoUrlModel videoUrlModel, boolean z) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f76178a, false, 88976, new Class[]{VideoUrlModel.class, Boolean.TYPE}, d.class)) {
            return new s(this, videoUrlModel2, z);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{videoUrlModel2, Byte.valueOf(z)}, this, f76178a, false, 88976, new Class[]{VideoUrlModel.class, Boolean.TYPE}, d.class);
    }

    private void a(Video video, com.ss.android.ugc.aweme.video.a.a aVar, int i2) {
        boolean z;
        String str;
        String str2;
        Video video2 = video;
        com.ss.android.ugc.aweme.video.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{video2, aVar2, 0}, this, f76178a, false, 88990, new Class[]{Video.class, com.ss.android.ugc.aweme.video.a.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, aVar2, 0}, this, f76178a, false, 88990, new Class[]{Video.class, com.ss.android.ugc.aweme.video.a.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "tryResumePlay() called with: video = [" + video + "], listener ");
        this.l.a();
        if (aVar2 != null && this.f76182e.b(aVar2) && video2 != null) {
            VideoUrlModel playAddrH265 = video.getPlayAddrH265();
            VideoUrlModel playAddrH264 = video.getPlayAddrH264();
            if (playAddrH265 != null || playAddrH264 != null) {
                if (c(playAddrH265) || c(playAddrH264)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    com.ss.android.ugc.aweme.player.sdk.api.c cVar = this.f76182e;
                    if (playAddrH265 != null) {
                        str2 = playAddrH265.getSourceId();
                    } else {
                        str2 = playAddrH264.getSourceId();
                    }
                    cVar.a(str2);
                    this.g = false;
                    return;
                }
                if (this.r) {
                    this.r = false;
                    if (playAddrH265 != null) {
                        str = playAddrH265.getSourceId();
                    } else {
                        str = playAddrH264.getSourceId();
                    }
                    a a2 = a(str);
                    if (a2 != null) {
                        a(video, true, (int) a2.f76006a, false);
                    } else {
                        a(video, true);
                    }
                } else {
                    a(video, true);
                }
            }
        }
    }

    private void a(Video video, boolean z, int i2, boolean z2) {
        Video video2 = video;
        if (PatchProxy.isSupport(new Object[]{video2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f76178a, false, 88968, new Class[]{Video.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video2, Byte.valueOf(z), Integer.valueOf(i2), Byte.valueOf(z2)}, this, f76178a, false, 88968, new Class[]{Video.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "tryPlay() called with: video = [" + video + "], isRenderReady = [" + z + "]");
        if (AbTestManager.a().bp()) {
            VideoUrlModel a2 = i.a(video, this.f76182e.q());
            if (a2 != null) {
                a(a2, z, false, v.Normal, i2, z2);
            }
            return;
        }
        if (video2 != null) {
            if (!com.ss.android.ugc.playerkit.b.a((UrlModel) video.getPlayAddrH265()) || !com.ss.android.ugc.playerkit.b.a(this.f76182e.q()) || !this.f76180b) {
                a(video.getPlayAddrH264(), z, false, v.Normal, i2, z2);
            } else {
                a(video.getPlayAddrH265(), z, false, v.Normal, i2, z2);
            }
        }
    }

    private void a(VideoUrlModel videoUrlModel, boolean z, boolean z2, @NonNull v vVar) {
        if (PatchProxy.isSupport(new Object[]{videoUrlModel, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), vVar}, this, f76178a, false, 88970, new Class[]{VideoUrlModel.class, Boolean.TYPE, Boolean.TYPE, v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel, Byte.valueOf(z), Byte.valueOf(z2), vVar}, this, f76178a, false, 88970, new Class[]{VideoUrlModel.class, Boolean.TYPE, Boolean.TYPE, v.class}, Void.TYPE);
            return;
        }
        a(videoUrlModel, z, z2, vVar, 0, true);
    }

    private void a(VideoUrlModel videoUrlModel, boolean z, boolean z2, @NonNull v vVar, int i2, boolean z3) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        boolean z4 = z2;
        v vVar2 = vVar;
        if (PatchProxy.isSupport(new Object[]{videoUrlModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), vVar2, Integer.valueOf(i2), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f76178a, false, 88971, new Class[]{VideoUrlModel.class, Boolean.TYPE, Boolean.TYPE, v.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoUrlModel2, Byte.valueOf(z), Byte.valueOf(z2), vVar2, Integer.valueOf(i2), Byte.valueOf(z3)}, this, f76178a, false, 88971, new Class[]{VideoUrlModel.class, Boolean.TYPE, Boolean.TYPE, v.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.b.b.a("PlayerManager", "tryPlay() called with: urlModel = [" + videoUrlModel2 + "], isRenderReady = [" + z + "], retryOnError = [" + z4 + "], config = [" + vVar2 + "], playerType = [" + this.h + "]");
        com.ss.android.ugc.aweme.ak.a.b();
        if (com.ss.android.ugc.playerkit.b.a((UrlModel) videoUrlModel)) {
            if (!this.n && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
                s.put(videoUrlModel.getSourceId(), new a());
            }
            String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
            String uri = videoUrlModel.getUri();
            this.i = com.ss.android.ugc.playerkit.session.a.a().d(uri);
            this.i.sourceId = videoUrlModel.getSourceId();
            this.f76183f = videoUrlModel2;
            this.i.urlModel = videoUrlModel2;
            this.i.playerType = this.h;
            com.ss.android.ugc.playerkit.b.b.f77705b = bitRatedRatioUri;
            com.ss.android.ugc.playerkit.b.b.a(bitRatedRatioUri);
            com.ss.android.ugc.playerkit.a.a().a(uri, "player_try_play");
            if (this.f76181c) {
                a(a(videoUrlModel2, z4), b(videoUrlModel), videoUrlModel, z, vVar, videoUrlModel.isVr(), videoUrlModel.isH265(), a(videoUrlModel), true, z3, i2);
            } else {
                a(a(videoUrlModel2, z4), b(videoUrlModel), videoUrlModel, z, vVar, videoUrlModel.isVr(), videoUrlModel.isH265(), a(videoUrlModel), false, z3, i2);
            }
            this.f76181c = true;
        }
    }
}
