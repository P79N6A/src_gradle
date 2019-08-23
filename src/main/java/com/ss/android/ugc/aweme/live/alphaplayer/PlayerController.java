package com.ss.android.ugc.aweme.live.alphaplayer;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.live.alphaplayer.b.a;
import com.ss.android.ugc.aweme.live.alphaplayer.b.b;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import com.ss.android.ugc.aweme.live.alphaplayer.f;
import java.io.File;

public class PlayerController implements LifecycleObserver, Handler.Callback, h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3418a;

    /* renamed from: b  reason: collision with root package name */
    public j f3419b = j.NOT_PREPARED;

    /* renamed from: c  reason: collision with root package name */
    public a f3420c;

    /* renamed from: d  reason: collision with root package name */
    public b f3421d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3422e;

    /* renamed from: f  reason: collision with root package name */
    private Context f3423f;
    private g g;
    private f<a<a>> h;
    private Handler i;
    private Handler j = new Handler(Looper.getMainLooper());
    private HandlerThread k;
    private f.d<a<a>> l = new f.d<a<a>>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53204a;

        public final /* synthetic */ void a(Object obj) {
            a aVar = (a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f53204a, false, 55569, new Class[]{a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f53204a, false, 55569, new Class[]{a.class}, Void.TYPE);
                return;
            }
            PlayerController.this.a(PlayerController.a(2, (Object) null));
        }
    };
    private f.c<a<a>> m = new f.c<a<a>>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53206a;

        public final /* synthetic */ void a(Object obj, int i, int i2, String str) {
            String str2 = str;
            a aVar = (a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f53206a, false, 55570, new Class[]{a.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f53206a, false, 55570, new Class[]{a.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            PlayerController playerController = PlayerController.this;
            playerController.a(false, i, i2, "mediaPlayer error, info:" + str2);
            PlayerController.this.c();
        }
    };

    public final void a(boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f3418a, false, 55564, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, this, f3418a, false, 55564, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(z, 0, 0, str2);
    }

    public final void a(boolean z, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f3418a, false, 55565, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f3418a, false, 55565, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.g != null) {
            boolean z2 = z;
            this.g.a(z, i2, i3, str2);
        }
    }

    @WorkerThread
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55548, new Class[0], Void.TYPE);
            return;
        }
        a(a(4, (Object) null));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55550, new Class[0], Void.TYPE);
            return;
        }
        a(a(6, (Object) null));
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55557, new Class[0], Void.TYPE);
            return;
        }
        this.f3422e = false;
        this.j.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53196a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53196a, false, 55566, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53196a, false, 55566, new Class[0], Void.TYPE);
                    return;
                }
                if (PlayerController.this.f3420c != null) {
                    PlayerController.this.f3420c.b();
                }
            }
        });
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55544, new Class[0], Void.TYPE);
            return;
        }
        a(a(6, (Object) null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55542, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55562, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            if (this.f3419b == j.NOT_PREPARED || this.f3419b == j.STOPPED) {
                this.h.a(this.l);
                this.h.a(this.m);
                this.h.b();
            }
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55563, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            switch (this.f3419b) {
                case PREPARED:
                    this.h.c();
                    this.f3422e = true;
                    this.f3419b = j.STARTED;
                    this.j.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f53208a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f53208a, false, 55571, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f53208a, false, 55571, new Class[0], Void.TYPE);
                                return;
                            }
                            if (PlayerController.this.f3420c != null) {
                                PlayerController.this.f3420c.a();
                            }
                        }
                    });
                    return;
                case PAUSED:
                    this.h.c();
                    this.f3419b = j.STARTED;
                    return;
                case NOT_PREPARED:
                case STOPPED:
                    try {
                        d();
                        return;
                    } catch (Exception unused) {
                        a(false, "prepare and start MediaPlayer failure.");
                        c();
                        break;
                    }
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55541, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55547, new Class[0], Void.TYPE);
            return;
        }
        a(a(3, (Object) null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55543, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55549, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55549, new Class[0], Void.TYPE);
            return;
        }
        a(a(5, (Object) null));
    }

    public final h a(a aVar) {
        this.f3420c = aVar;
        return this;
    }

    public final void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f3418a, false, 55554, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f3418a, false, 55554, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        a(message2, 0);
    }

    public boolean handleMessage(Message message) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f3418a, false, 55553, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f3418a, false, 55553, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        switch (message.what) {
            case 1:
                if (this.i != null) {
                    this.i.removeMessages(8);
                }
                d dVar = (d) message.obj;
                if (!PatchProxy.isSupport(new Object[]{dVar}, this, f3418a, false, 55552, new Class[]{d.class}, Void.TYPE)) {
                    try {
                        if (!PatchProxy.isSupport(new Object[]{dVar}, this, f3418a, false, 55559, new Class[]{d.class}, Void.TYPE)) {
                            this.h.f();
                            this.f3419b = j.NOT_PREPARED;
                            Context context = this.f3423f;
                            if (PatchProxy.isSupport(new Object[]{context}, this, f3418a, false, 55560, new Class[]{Context.class}, Integer.TYPE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f3418a, false, 55560, new Class[]{Context.class}, Integer.TYPE)).intValue();
                            } else if (context instanceof Activity) {
                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                            } else {
                                i2 = context.getResources().getConfiguration().orientation;
                            }
                            String a2 = dVar.a(i2);
                            d.a b2 = dVar.b(i2);
                            if (!TextUtils.isEmpty(a2)) {
                                if (new File(a2).exists()) {
                                    this.f3421d.setScaleType(b2);
                                    this.h.a(a2);
                                    if (this.f3421d.f53216b) {
                                        d();
                                        break;
                                    }
                                }
                            }
                            a(false, "dataPath is empty or File is not exists. path: " + a2);
                            c();
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3418a, false, 55559, new Class[]{d.class}, Void.TYPE);
                            break;
                        }
                    } catch (Exception e2) {
                        c();
                        a(false, "alphaVideoView set dataSource failure:" + Log.getStackTraceString(e2));
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{dVar}, this, f3418a, false, 55552, new Class[]{d.class}, Void.TYPE);
                    break;
                }
                break;
            case 2:
                try {
                    if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55561, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55561, new Class[0], Void.TYPE);
                    } else {
                        final com.ss.android.ugc.aweme.live.alphaplayer.a.a h2 = this.h.h();
                        this.f3421d.a((float) (h2.f53213a / 2), (float) h2.f53214b);
                        final d.a scaleType = this.f3421d.getScaleType();
                        this.j.post(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f53200a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f53200a, false, 55568, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f53200a, false, 55568, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (PlayerController.this.f3420c != null) {
                                    PlayerController.this.f3420c.a(h2.f53213a / 2, h2.f53214b, scaleType);
                                }
                            }
                        });
                    }
                    this.f3419b = j.PREPARED;
                    e();
                    break;
                } catch (Exception e3) {
                    c();
                    a(false, "start video failure:" + Log.getStackTraceString(e3));
                    break;
                }
            case 3:
                if (this.h != null && this.f3419b == j.STARTED) {
                    this.h.d();
                    this.f3419b = j.PAUSED;
                    break;
                }
            case 4:
                if (this.f3422e) {
                    e();
                    break;
                }
                break;
            case 5:
                if (this.h != null && (this.f3419b == j.STARTED || this.f3419b == j.PAUSED)) {
                    this.h.d();
                    this.f3419b = j.PAUSED;
                    break;
                }
            case 6:
                this.f3421d.b();
                if (this.h != null) {
                    if (this.f3419b == j.STARTED) {
                        this.h.d();
                        this.f3419b = j.PAUSED;
                    }
                    if (this.f3419b == j.PAUSED) {
                        this.h.e();
                        this.f3419b = j.STOPPED;
                    }
                    this.h.g();
                    this.f3419b = j.RELEASE;
                    if (this.k != null) {
                        this.k.quit();
                        this.k.interrupt();
                        break;
                    }
                } else {
                    this.f3419b = j.NOT_PREPARED;
                    return true;
                }
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                this.h.a((Surface) message.obj);
                break;
            case 9:
                if (this.h != null) {
                    this.h.f();
                    this.f3419b = j.NOT_PREPARED;
                    this.f3422e = false;
                    break;
                }
                break;
        }
        return true;
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f3418a, false, 55545, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f3418a, false, 55545, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        a(a(7, (Object) surface2));
    }

    public final void a(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3418a, false, 55534, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3418a, false, 55534, new Class[]{g.class}, Void.TYPE);
            return;
        }
        this.g = gVar;
        if (this.f3421d != null) {
            this.f3421d.setMonitor(gVar);
        }
    }

    @NonNull
    public static Message a(int i2, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), obj2}, null, f3418a, true, 55556, new Class[]{Integer.TYPE, Object.class}, Message.class)) {
            return (Message) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), obj2}, null, f3418a, true, 55556, new Class[]{Integer.TYPE, Object.class}, Message.class);
        }
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.obj = obj2;
        return obtain;
    }

    public static PlayerController a(c cVar, f fVar) {
        c cVar2 = cVar;
        f fVar2 = fVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2, fVar2}, null, f3418a, true, 55533, new Class[]{c.class, f.class}, PlayerController.class)) {
            return new PlayerController(cVar2.f53240a, cVar2.f53241b, fVar2);
        }
        return (PlayerController) PatchProxy.accessDispatch(new Object[]{cVar2, fVar2}, null, f3418a, true, 55533, new Class[]{c.class, f.class}, PlayerController.class);
    }

    private void a(Message message, long j2) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2, 0L}, this, f3418a, false, 55555, new Class[]{Message.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2, 0L}, this, f3418a, false, 55555, new Class[]{Message.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isAlive() && !this.k.isInterrupted()) {
            if (this.i == null) {
                this.i = new Handler(this.k.getLooper(), this);
            }
            this.i.sendMessageDelayed(message, 0);
        }
    }

    private PlayerController(Context context, LifecycleOwner lifecycleOwner, f<a<a>> fVar) {
        f<a<a>> fVar2;
        Context context2 = context;
        f<a<a>> fVar3 = fVar;
        if (PatchProxy.isSupport(new Object[]{context2, lifecycleOwner}, this, f3418a, false, 55537, new Class[]{Context.class, LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lifecycleOwner}, this, f3418a, false, 55537, new Class[]{Context.class, LifecycleOwner.class}, Void.TYPE);
        } else {
            this.f3423f = context2;
            lifecycleOwner.getLifecycle().addObserver(this);
            this.k = new HandlerThread("alpha-play-thread", 10);
            this.k.start();
            this.i = new Handler(this.k.getLooper(), this);
            if (PatchProxy.isSupport(new Object[0], null, f.a.f53282a, true, 55531, new Class[0], f.class)) {
                fVar2 = (f) PatchProxy.accessDispatch(new Object[0], null, f.a.f53282a, true, 55531, new Class[0], f.class);
            } else {
                fVar2 = new b<>();
            }
            this.h = fVar2;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3418a, false, 55538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3418a, false, 55538, new Class[0], Void.TYPE);
        } else {
            this.f3421d = new b(this.f3423f, null);
            this.f3421d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f3421d.setPlayerController(this);
            this.f3421d.setVideoRenderer(new k(this.f3421d));
        }
        if (PatchProxy.isSupport(new Object[]{fVar3}, this, f3418a, false, 55558, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar3}, this, f3418a, false, 55558, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.h = fVar3;
        fVar3.b(true);
        fVar3.a(false);
        this.h.a((f.b<T>) new f.b<a<a>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53198a;

            public final /* synthetic */ void a(Object obj) {
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f53198a, false, 55567, new Class[]{a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f53198a, false, 55567, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                b bVar = PlayerController.this.f3421d;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f53215a, false, 55444, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], bVar, b.f53215a, false, 55444, new Class[0], Void.TYPE);
                } else {
                    bVar.f53217c.a();
                }
                PlayerController.this.f3419b = j.PAUSED;
                PlayerController.this.a(true, (String) null);
                PlayerController.this.c();
            }
        });
    }
}
