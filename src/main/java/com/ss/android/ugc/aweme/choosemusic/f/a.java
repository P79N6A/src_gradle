package com.ss.android.ugc.aweme.choosemusic.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.d.w;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.music.ui.v;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.b.a.b;
import com.ss.android.ugc.b.a.c;
import com.ss.android.ugc.b.a.d;
import java.util.Map;

public final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35880a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f35881b;

    /* renamed from: c  reason: collision with root package name */
    public Thread f35882c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.a f35883d;

    /* renamed from: e  reason: collision with root package name */
    public C0456a f35884e;
    private w r;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.f.a$a  reason: collision with other inner class name */
    public interface C0456a {
        void a();

        void a(int i, int i2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35880a, false, 26762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35880a, false, 26762, new Class[0], Void.TYPE);
        } else if (this.f35881b == null) {
            if (this.j != null) {
                this.j.b();
            }
        } else {
            Message obtain = Message.obtain();
            obtain.what = 2;
            this.f35881b.sendMessage(obtain);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35880a, false, 26761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35880a, false, 26761, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (!(this.p == null || this.f35883d == null)) {
            c.a(this.p.getMusicId());
            c.a(this.p.getMusicId(), this.f35883d);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f35880a, false, 26763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35880a, false, 26763, new Class[0], Void.TYPE);
            return;
        }
        this.j.a((d) new b(this));
        this.j.a((b) new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35890a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f35890a, false, 26769, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f35890a, false, 26769, new Class[0], Void.TYPE);
                    return;
                }
                if (a.this.f35884e != null) {
                    a.this.f35884e.a();
                }
                if (a.this.f35883d.h) {
                    c.a(a.this.p.getMusicId());
                    c.a(a.this.p.getMusicId(), a.this.f35883d);
                }
            }
        });
        this.j.a((c) new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35892a;

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35892a, false, 26770, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f35892a, false, 26770, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (a.this.f35884e != null) {
                    a.this.f35884e.a(i, i2);
                }
            }
        });
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f35880a, false, 26765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35880a, false, 26765, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g = null;
        }
        com.ss.android.ugc.aweme.music.c.a().f56320b = null;
        if (this.f35881b != null) {
            this.f35881b.removeCallbacksAndMessages(null);
            this.f35881b.sendEmptyMessage(0);
        }
        this.j.a((b) null);
        this.j.a((c) null);
        this.f35884e = null;
    }

    public a(com.ss.android.ugc.aweme.music.ui.c cVar) {
        this(cVar, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i) {
        int i2 = i;
        com.ss.android.ugc.aweme.choosemusic.a aVar = this.f35883d;
        MusicModel musicModel = this.p;
        if (PatchProxy.isSupport(new Object[]{aVar, musicModel}, null, c.f35896a, true, 26776, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.class, MusicModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, musicModel}, null, c.f35896a, true, 26776, new Class[]{com.ss.android.ugc.aweme.choosemusic.a.class, MusicModel.class}, Void.TYPE);
        } else if (!(aVar == null || musicModel == null || musicModel.getMusicType() == MusicModel.MusicType.LOCAL || c.b() == -1)) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            a2.a("enter_from", aVar.f35731a).a("music_id", musicModel.getMusicId()).a("category_name", aVar.f35732b).a("enter_method", aVar.f35733c).a("previous_page", aVar.f35734d).a("order", c.b());
            if (!TextUtils.isEmpty(aVar.g)) {
                a2.a("tag_id", aVar.g);
            }
            if (!TextUtils.isEmpty(aVar.f35736f)) {
                a2.a("prop_id", aVar.f35736f);
            }
            if (!TextUtils.isEmpty(aVar.f35735e)) {
                a2.a("category_id", aVar.f35735e);
            }
            if (TextUtils.equals(aVar.f35731a, "search_music")) {
                a2.a("search_keyword", c.f35898c);
                a2.a("log_pb", new Gson().toJson((Object) musicModel.getLogPb()));
                r.a("play_music", v.a(a2.f34114b));
            } else {
                r.a("play_music", (Map) a2.f34114b);
            }
        }
        String musicId = this.p.getMusicId();
        if (PatchProxy.isSupport(new Object[]{musicId, Integer.valueOf(i)}, null, c.f35896a, true, 26771, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicId, Integer.valueOf(i)}, null, c.f35896a, true, 26771, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else {
            if (c.f35899d == null) {
                c.f35899d = new e();
            }
            e eVar = c.f35899d;
            if (PatchProxy.isSupport(new Object[]{musicId, Integer.valueOf(i)}, eVar, e.f35902a, false, 26791, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                e eVar2 = eVar;
                PatchProxy.accessDispatch(new Object[]{musicId, Integer.valueOf(i)}, eVar2, e.f35902a, false, 26791, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            } else {
                eVar.f35903b = musicId;
                eVar.f35905d = 0;
                eVar.f35904c = System.currentTimeMillis();
                eVar.f35906e = i2;
            }
        }
        String musicId2 = this.p.getMusicId();
        if (PatchProxy.isSupport(new Object[]{musicId2}, this, f35880a, false, 26764, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicId2}, this, f35880a, false, 26764, new Class[]{String.class}, Void.TYPE);
        } else if (this.r != null && TextUtils.equals(musicId2, this.r.f35871a)) {
            MonitorUtils.monitorCommonLog("time_from_click_music_to_start_play", com.ss.android.ugc.aweme.app.d.c.a().a("duration", Long.valueOf(System.currentTimeMillis() - this.r.f35872b)).b());
        }
        if (this.o && this.j != null) {
            b();
        }
        if (this.g != null && this.g.g() != null && i2 != 0) {
            this.g.g().setDuration(i2);
        }
    }

    public a(com.ss.android.ugc.aweme.music.ui.c cVar, C0456a aVar) {
        super(cVar);
        this.f35884e = aVar;
    }

    public final void a(MusicModel musicModel, int i, boolean z) {
        MusicModel musicModel2 = musicModel;
        if (PatchProxy.isSupport(new Object[]{musicModel2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35880a, false, 26760, new Class[]{MusicModel.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2, Integer.valueOf(i), Byte.valueOf(z)}, this, f35880a, false, 26760, new Class[]{MusicModel.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int i2 = i;
        final f fVar = new f(musicModel, i, z);
        if (musicModel2 != null) {
            this.r = new w(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.f35882c == null) {
            this.f35882c = new Thread() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35885a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f35885a, false, 26767, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f35885a, false, 26767, new Class[0], Void.TYPE);
                        return;
                    }
                    Looper.prepare();
                    a.this.f35881b = new Handler(Looper.myLooper()) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f35888a;

                        public final void handleMessage(Message message) {
                            if (PatchProxy.isSupport(new Object[]{message}, this, f35888a, false, 26768, new Class[]{Message.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{message}, this, f35888a, false, 26768, new Class[]{Message.class}, Void.TYPE);
                            } else if (message.what == 0) {
                                Looper.myLooper().quit();
                                if (a.this.j != null) {
                                    a.this.j.a();
                                }
                                a.this.f35882c = null;
                            } else {
                                if (message.what == 2) {
                                    if (a.this.j != null) {
                                        a.this.j.b();
                                    }
                                } else if (message.what == 1) {
                                    f fVar = (f) message.obj;
                                    AnonymousClass1.super.a(fVar.f35908b, fVar.f35909c, fVar.f35910d);
                                }
                            }
                        }
                    };
                    a.super.a(fVar.f35908b, fVar.f35909c, fVar.f35910d);
                    Looper.loop();
                }
            };
            this.f35882c.start();
            return;
        }
        if (this.f35881b != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = fVar;
            this.f35881b.sendMessage(obtain);
        }
    }
}
