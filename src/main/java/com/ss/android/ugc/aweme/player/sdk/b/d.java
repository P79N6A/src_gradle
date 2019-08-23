package com.ss.android.ugc.aweme.player.sdk.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.c;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.c.e;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59144a = null;

    /* renamed from: f  reason: collision with root package name */
    private static final String f59145f = "d";

    /* renamed from: b  reason: collision with root package name */
    public c f59146b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.video.a.a f59147c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f59148d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59149e;
    private HandlerThread g;
    private a h;
    private String i;
    private String j;
    private Scheduler k;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59159a;

        /* renamed from: b  reason: collision with root package name */
        private c f59160b;

        /* renamed from: c  reason: collision with root package name */
        private volatile int f59161c = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;

        /* renamed from: d  reason: collision with root package name */
        private C0662a f59162d;

        /* renamed from: com.ss.android.ugc.aweme.player.sdk.b.d$a$a  reason: collision with other inner class name */
        interface C0662a {
            void a();
        }

        public final void a(int i) {
            if (i > 0) {
                this.f59161c = i;
            }
        }

        public final void handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f59159a, false, 64344, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f59159a, false, 64344, new Class[]{Message.class}, Void.TYPE);
            } else if (this.f59160b != null) {
                switch (message.what) {
                    case 0:
                        return;
                    case 1:
                        this.f59160b.a((e) message.obj);
                        return;
                    case 3:
                        this.f59160b.b();
                        return;
                    case 4:
                        this.f59160b.a((String) message.obj);
                        return;
                    case 5:
                        this.f59160b.d();
                        return;
                    case 6:
                        this.f59160b.c();
                        return;
                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                        this.f59160b.e();
                        return;
                    case 8:
                        this.f59160b.a();
                        return;
                    case 9:
                        Pair pair = (Pair) message.obj;
                        if (pair != null) {
                            this.f59160b.a(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                            return;
                        }
                        break;
                    case 10:
                        removeMessages(12);
                        Looper looper = getLooper();
                        if (!(looper == null || looper == Looper.getMainLooper())) {
                            looper.quit();
                        }
                        if (this.f59162d != null) {
                            this.f59162d.a();
                            break;
                        }
                        break;
                    case 11:
                        this.f59160b.a(((Float) message.obj).floatValue());
                        return;
                    case SearchNilInfo.HIT_TYPE_SENSITIVE:
                        this.f59160b.p();
                        sendEmptyMessageDelayed(12, (long) this.f59161c);
                        return;
                    case 13:
                        Pair pair2 = (Pair) message.obj;
                        if (pair2 != null) {
                            this.f59160b.a(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                            return;
                        }
                        break;
                }
            }
        }

        public a(C0662a aVar, Looper looper, c cVar) {
            super(looper);
            this.f59160b = cVar;
            this.f59162d = aVar;
        }
    }

    public final void p() {
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f59144a, false, 64269, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f59144a, false, 64269, new Class[]{e.class}, Void.TYPE);
        } else if (eVar != null && eVar.a() != null) {
            if (this.f59149e) {
                ExceptionMonitor.ensureNotReachHere((Throwable) new Exception(), "mIsLastPlayThreadQuiting when prepare");
                return;
            }
            if (eVar.o) {
                if (this.h == null) {
                    v();
                    this.h.sendMessageDelayed(this.h.obtainMessage(1, eVar), 500);
                } else {
                    this.h.obtainMessage(1, eVar).sendToTarget();
                }
            }
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c cVar = eVar.a().f77727d;
            String urlKey = (cVar == null || TextUtils.isEmpty(cVar.getUrlKey())) ? eVar.m : cVar.getUrlKey();
            this.i = eVar.f77721d;
            this.j = urlKey;
            if (eVar.p) {
                a(9, (Object) eVar.f77721d);
            }
        }
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f59144a, false, 64271, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f59144a, false, 64271, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f59146b.a(surface2);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f59144a, false, 64278, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f59144a, false, 64278, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.obtainMessage(4, str).sendToTarget();
        }
    }

    public final void a(com.ss.android.ugc.playerkit.a.a aVar) {
        com.ss.android.ugc.playerkit.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f59144a, false, 64283, new Class[]{com.ss.android.ugc.playerkit.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f59144a, false, 64283, new Class[]{com.ss.android.ugc.playerkit.a.a.class}, Void.TYPE);
            return;
        }
        this.f59146b.a(aVar2);
    }

    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        com.ss.android.ugc.aweme.player.sdk.api.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f59144a, false, 64284, new Class[]{com.ss.android.ugc.aweme.player.sdk.api.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f59144a, false, 64284, new Class[]{com.ss.android.ugc.aweme.player.sdk.api.a.class}, Void.TYPE);
            return;
        }
        this.f59146b.a(aVar2);
    }

    public final boolean a(String str, String str2) {
        if (!PatchProxy.isSupport(new Object[]{str, str2}, this, f59144a, false, 64285, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return TextUtils.equals(str, this.i) && TextUtils.equals(this.j, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f59144a, false, 64285, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59144a, false, 64286, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59144a, false, 64286, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f59146b.a(bVar2);
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59144a, false, 64293, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59144a, false, 64293, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        this.f59147c = aVar;
        this.f59146b.a((com.ss.android.ugc.aweme.video.a.a) new com.ss.android.ugc.aweme.video.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59153a;

            public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
                com.ss.android.ugc.aweme.video.b.a aVar2 = aVar;
                if (PatchProxy.isSupport(new Object[]{aVar2}, this, f59153a, false, 64325, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar2}, this, f59153a, false, 64325, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
                    return;
                }
                d.this.a(0, (Object) aVar2);
            }

            public final void b(com.ss.android.ugc.aweme.video.e eVar) {
                com.ss.android.ugc.aweme.video.e eVar2 = eVar;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f59153a, false, 64334, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f59153a, false, 64334, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
                    return;
                }
                d.this.a(8, (Object) eVar2);
            }

            public final void c(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f59153a, false, 64329, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f59153a, false, 64329, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                d.this.a(3, (Object) str2);
            }

            public final void d(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f59153a, false, 64330, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f59153a, false, 64330, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                d.this.a(4, (Object) str2);
            }

            public final void e(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f59153a, false, 64331, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f59153a, false, 64331, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                d.this.a(6, (Object) str2);
            }

            public final void a(float f2) {
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59153a, false, 64335, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59153a, false, 64335, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                d.this.a(10, (Object) Float.valueOf(f2));
            }

            public final void b(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f59153a, false, 64328, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f59153a, false, 64328, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                d.this.a(1, (Object) str2);
            }

            public final void c(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59153a, false, 64336, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59153a, false, 64336, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                d.this.a(11, (Object) Boolean.valueOf(z));
            }

            public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
                com.ss.android.ugc.aweme.video.b.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar2}, this, f59153a, false, 64333, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar2}, this, f59153a, false, 64333, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
                    return;
                }
                d.this.a(7, (Object) bVar2);
            }

            public final void b(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59153a, false, 64332, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59153a, false, 64332, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                d.this.a(5, (Object) Boolean.valueOf(z));
            }

            public final void a(com.ss.android.ugc.aweme.video.e eVar) {
                com.ss.android.ugc.aweme.video.e eVar2 = eVar;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f59153a, false, 64326, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f59153a, false, 64326, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
                    return;
                }
                d.this.a(2, (Object) eVar2);
            }

            public final void a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f59153a, false, 64327, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f59153a, false, 64327, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                d.this.a(9, (Object) str2);
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64270, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64270, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.sendEmptyMessage(8);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64274, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.sendEmptyMessage(3);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64275, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.sendEmptyMessage(6);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64276, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.sendEmptyMessage(5);
        }
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64294, new Class[0], Boolean.TYPE)) {
            return this.f59146b.f();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64294, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final long g() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64295, new Class[0], Long.TYPE)) {
            return this.f59146b.g();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64295, new Class[0], Long.TYPE)).longValue();
    }

    public final long h() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64296, new Class[0], Long.TYPE)) {
            return this.f59146b.h();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64296, new Class[0], Long.TYPE)).longValue();
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64280, new Class[0], Boolean.TYPE)) {
            return this.f59146b.i();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64280, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean j() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64313, new Class[0], Boolean.TYPE)) {
            return this.f59146b.j();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64313, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String k() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64281, new Class[0], String.class)) {
            return this.f59146b.k();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64281, new Class[0], String.class);
    }

    public final int l() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64282, new Class[0], Integer.TYPE)) {
            return this.f59146b.l();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64282, new Class[0], Integer.TYPE)).intValue();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64287, new Class[0], Void.TYPE);
            return;
        }
        this.f59146b.m();
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64288, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
            this.h.sendEmptyMessage(12);
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64290, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.removeMessages(12);
        }
    }

    public final c.a q() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64292, new Class[0], c.a.class)) {
            return this.f59146b.q();
        }
        return (c.a) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64292, new Class[0], c.a.class);
    }

    public final boolean r() {
        if (!PatchProxy.isSupport(new Object[0], this, f59144a, false, 64298, new Class[0], Boolean.TYPE)) {
            return this.f59146b.r();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64298, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final IPlayer.e s() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64300, new Class[0], IPlayer.e.class)) {
            return (IPlayer.e) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64300, new Class[0], IPlayer.e.class);
        } else if (this.f59146b != null) {
            return this.f59146b.s();
        } else {
            return null;
        }
    }

    public final IPlayer.d t() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64301, new Class[0], IPlayer.d.class)) {
            return (IPlayer.d) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64301, new Class[0], IPlayer.d.class);
        } else if (this.f59146b != null) {
            return this.f59146b.t();
        } else {
            return null;
        }
    }

    public final String u() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64315, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64315, new Class[0], String.class);
        } else if (this.f59146b != null) {
            return this.f59146b.u();
        } else {
            return null;
        }
    }

    private void v() {
        Looper looper;
        Looper looper2;
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64268, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.g = new HandlerThread("play_thread", 0);
            this.g.start();
        } catch (Exception unused) {
            this.g = null;
        }
        this.f59148d = new Handler(Looper.getMainLooper());
        AnonymousClass1 r1 = new a.C0662a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59150a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f59150a, false, 64317, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59150a, false, 64317, new Class[0], Void.TYPE);
                    return;
                }
                d.this.f59148d.post(new Runnable() {
                    public final void run() {
                        d.this.f59149e = false;
                    }
                });
            }
        };
        if (this.g == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = this.g.getLooper();
        }
        this.h = new a(r1, looper, this.f59146b);
        if (this.g == null) {
            looper2 = Looper.getMainLooper();
        } else {
            looper2 = this.g.getLooper();
        }
        this.k = AndroidSchedulers.from(looper2);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f59144a, false, 64277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59144a, false, 64277, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.removeCallbacksAndMessages(null);
            this.h.sendEmptyMessage(7);
            this.h.sendEmptyMessage(10);
            this.f59149e = true;
            this.h = null;
            this.k = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        this.j = null;
        this.i = null;
    }

    public final boolean b(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (this.f59147c == aVar) {
            return true;
        }
        return false;
    }

    public d(com.ss.android.ugc.aweme.player.sdk.api.c cVar) {
        this.f59146b = cVar;
        v();
    }

    public final float a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59144a, false, 64297, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return this.f59146b.a(i2);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59144a, false, 64297, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59144a, false, 64289, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59144a, false, 64289, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a(i2);
            this.h.sendEmptyMessage(12);
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59144a, false, 64273, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59144a, false, 64273, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.obtainMessage(11, Float.valueOf(f2)).sendToTarget();
        }
    }

    public final void b(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f59144a, false, 64272, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f59144a, false, 64272, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f59146b.b(surface2);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59144a, false, 64279, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59144a, false, 64279, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.obtainMessage(9, new Pair(Float.valueOf(f2), Float.valueOf(f3))).sendToTarget();
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59144a, false, 64291, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59144a, false, 64291, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.obtainMessage(13, new Pair(Integer.valueOf(i2), Integer.valueOf(i3))).sendToTarget();
        }
    }

    public final void a(final int i2, final Object obj) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), obj}, this, f59144a, false, 64299, new Class[]{Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), obj}, this, f59144a, false, 64299, new Class[]{Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f59148d.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59155a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f59155a, false, 64337, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59155a, false, 64337, new Class[0], Void.TYPE);
                } else if (d.this.f59147c != null) {
                    switch (i2) {
                        case 0:
                            d.this.f59147c.a((com.ss.android.ugc.aweme.video.b.a) obj);
                            return;
                        case 1:
                            d.this.f59147c.b((String) obj);
                            return;
                        case 2:
                            d.this.f59147c.a((com.ss.android.ugc.aweme.video.e) obj);
                            return;
                        case 3:
                            d.this.f59147c.c((String) obj);
                            return;
                        case 4:
                            d.this.f59147c.d((String) obj);
                            return;
                        case 5:
                            d.this.f59147c.b(((Boolean) obj).booleanValue());
                            return;
                        case 6:
                            d.this.f59147c.e((String) obj);
                            return;
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                            d.this.f59147c.a((com.ss.android.ugc.aweme.video.b.b) obj);
                            return;
                        case 8:
                            d.this.f59147c.b((com.ss.android.ugc.aweme.video.e) obj);
                            return;
                        case 9:
                            d.this.f59147c.a((String) obj);
                            return;
                        case 10:
                            d.this.f59147c.a(((Float) obj).floatValue());
                            return;
                        case 11:
                            d.this.f59147c.c(((Boolean) obj).booleanValue());
                            break;
                    }
                }
            }
        });
    }
}
