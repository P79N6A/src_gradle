package com.ss.ugc.live.a;

import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.common.TCState;
import com.ss.display.CameraDisplay2;
import com.ss.render.EffectRender;
import com.ss.ugc.live.a.a.c;
import com.ss.ugc.live.a.e;
import com.ss.ugc.live.a.k;
import javax.microedition.khronos.egl.EGLContext;

public final class b extends a implements SurfaceHolder.Callback, MessageCenter.a, TCState.StateListener, CameraDisplay2.FrameListener, EffectRender.OnRefreshFaceDataListener {

    /* renamed from: d  reason: collision with root package name */
    public a f78590d;

    /* renamed from: e  reason: collision with root package name */
    public CameraDisplay2 f78591e;

    /* renamed from: f  reason: collision with root package name */
    public d f78592f;
    public int g;
    private c h;
    private SurfaceView i;
    private k j = new k("start caoture queue");
    private e.a k;

    public interface a {
        void a();

        void b();
    }

    public final int f() {
        return 0;
    }

    public final int g() {
        return 0;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    public final void b() {
        this.j.b(new k.b() {
            public final void a() {
                if (b.this.f78591e != null) {
                    b.this.f78591e.stopCapture();
                    b.this.f78591e.onPause();
                }
            }
        });
    }

    public final void a() {
        this.j.b(new k.b() {
            public final void a() {
                if (b.this.f78591e != null) {
                    CameraDisplay2 cameraDisplay2 = b.this.f78591e;
                    boolean z = true;
                    if (b.this.g != 1) {
                        z = false;
                    }
                    cameraDisplay2.startCapture(z, b.this.f78592f.f78602b, b.this.f78592f.f78603c);
                    b.this.f78591e.onResume();
                }
            }
        });
    }

    public final void d() {
        if (this.f78591e != null) {
            this.g = 1 - this.g;
            this.f78591e.changeCamera();
        }
    }

    public final void e() {
        if (this.f78591e != null) {
            this.f78591e.setFilpHorizontalState(!this.f78591e.isFilpHorizontal());
        }
    }

    public final void c() {
        this.j.a(new k.b() {
            public final void a() {
            }
        });
        if (this.f78591e != null) {
            this.f78591e.onDestroy();
            this.f78591e = null;
        }
        if (this.j != null) {
            this.j.a(new k.b() {
                public final void a() {
                    if (b.this.f78590d != null) {
                        b.this.f78590d.b();
                        b.this.f78590d = null;
                    }
                }
            });
            k kVar = this.j;
            synchronized (kVar.f78617c) {
                kVar.f78618d = true;
                kVar.f78619e = false;
                kVar.f78617c.notifyAll();
            }
            try {
                kVar.f78615a.join();
            } catch (InterruptedException unused) {
            }
            kVar.f78615a = null;
            this.j = null;
        }
    }

    public final void a(e.a aVar) {
        this.k = aVar;
    }

    public final int a(int i2) {
        if (this.f78591e == null) {
            return -1;
        }
        return this.f78591e.setMaxMemCache(6);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f78591e != null) {
            this.f78591e.setSurfaceHolder(surfaceHolder);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f78591e != null) {
            this.f78591e.releaseSurfaceHolder();
        }
    }

    public final void onRefreshFaceData(int i2) {
        if (this.f78585b != null) {
            for (int size = this.f78585b.size() - 1; size >= 0; size--) {
                ((EffectRender.OnRefreshFaceDataListener) this.f78585b.get(size)).onRefreshFaceData(i2);
            }
        }
    }

    public final void a(com.ss.ugc.live.a.a.a aVar) {
        if (this.f78592f.f78604d == null || !l.a(this.f78592f.f78604d)) {
            throw new IllegalArgumentException("effect resource not exits");
        }
        aVar.a(this.f78592f.f78601a, this.h);
    }

    public final void onError(TCState.TCStateType tCStateType, int i2, String str) {
        if (this.k != null) {
            this.k.a(5, i2, str);
        }
    }

    public final void onInfo(TCState.TCStateType tCStateType, int i2, String str) {
        if (this.k != null && tCStateType == TCState.TCStateType.EffectInitSucceed) {
            this.k.b(1, i2, str);
        }
    }

    public b(SurfaceView surfaceView, d dVar, a aVar) {
        this.f78592f = dVar;
        this.f78590d = aVar;
        this.i = surfaceView;
        this.g = this.f78592f.g;
        this.i.getHolder().addCallback(this);
        this.f78591e = new CameraDisplay2(surfaceView.getContext());
        this.f78591e.setFpsRange(15, 15);
        this.f78591e.configEffect(dVar.f78604d, Build.MODEL, true, dVar.j, dVar.f78605e, dVar.f78606f);
        this.f78591e.setFrameListener(this);
        this.f78591e.setDetectFaceResultListener(this);
        this.f78591e.setStateListener(this);
        this.h = new f(this.f78591e);
        k kVar = this.j;
        kVar.f78615a = new Thread(kVar, kVar.f78616b);
        kVar.f78615a.start();
        this.j.a(new k.b() {
            public final void a() {
                if (b.this.f78590d != null) {
                    b.this.f78590d.a();
                }
            }
        });
        this.f78591e.setEffectMsgListener(this);
    }

    public final int a(int i2, int i3, int i4, String str) {
        return this.f78591e.sendEffectMsg(i2, i3, i4, str);
    }

    public final void onMessageReceived(int i2, int i3, int i4, String str) {
        if (this.f78586c != null) {
            this.f78586c.a(i2, i3, i4, str);
        }
    }

    public final void onFrameAvailable(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2, Bundle bundle) {
        synchronized (this) {
            if (this.f78584a != null) {
                for (i a2 : this.f78584a) {
                    a2.a(eGLContext, i2, i3, i4, i5, j2, bundle);
                }
            }
        }
    }
}
