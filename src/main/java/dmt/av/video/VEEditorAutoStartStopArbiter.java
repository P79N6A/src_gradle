package dmt.av.video;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.p;
import com.ss.android.vesdk.r;

public final class VEEditorAutoStartStopArbiter implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4353a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4354b;

    /* renamed from: c  reason: collision with root package name */
    private Context f4355c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f4356d = new BroadcastReceiver() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82754a;

        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.isSupport(new Object[]{context, intent}, this, f82754a, false, 91987, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, intent}, this, f82754a, false, 91987, new Class[]{Context.class, Intent.class}, Void.TYPE);
                return;
            }
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                VEEditorAutoStartStopArbiter.this.a();
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private p f4357e;

    public interface a {
        void N();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4353a, false, 91984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4353a, false, 91984, new Class[0], Void.TYPE);
            return;
        }
        this.f4355c.unregisterReceiver(this.f4356d);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4353a, false, 91985, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4353a, false, 91985, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4353a, false, 91986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4353a, false, 91986, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4353a, false, 91982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4353a, false, 91982, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f4354b) {
            try {
                if (this.f4357e.l() != p.g.PAUSED) {
                    this.f4357e.r();
                }
            } catch (r e2) {
                if (e2.getRetCd() != -105) {
                    throw e2;
                }
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4353a, false, 91983, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4353a, false, 91983, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f4354b) {
            try {
                if (this.f4357e.l() != p.g.STARTED) {
                    this.f4357e.q();
                }
            } catch (Exception e2) {
                ai.b(e2.toString());
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4353a, false, 91981, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4353a, false, 91981, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f4354b != z) {
            if (this.f4354b) {
                this.f4357e.q();
                if (this.f4355c instanceof a) {
                    ((a) this.f4355c).N();
                }
            } else {
                this.f4357e.r();
            }
            this.f4354b = z;
        }
    }

    public VEEditorAutoStartStopArbiter(Context context, final LifecycleOwner lifecycleOwner, p pVar, SurfaceView surfaceView) {
        this.f4355c = context;
        this.f4357e = pVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        if (Build.VERSION.SDK_INT >= 18) {
            ((ViewGroup) surfaceView.getParent()).getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f82756a;

                public final void onWindowFocusChanged(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82756a, false, 91988, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82756a, false, 91988, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z && lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        VEEditorAutoStartStopArbiter.this.b();
                    }
                }
            });
        }
        this.f4355c.registerReceiver(this.f4356d, intentFilter);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback2() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            }

            public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
            }
        });
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
