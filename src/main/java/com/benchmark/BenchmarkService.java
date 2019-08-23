package com.benchmark;

import android.app.Service;
import android.content.Intent;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.benchmark.a.b;
import com.benchmark.a.c;
import com.benchmark.a.d;
import com.benchmark.a.e;
import com.benchmark.a.f;
import com.benchmark.a.g;
import com.benchmark.a.i;
import com.benchmark.a.j;
import com.benchmark.h;
import com.benchmark.m;
import com.bytedance.common.utility.Lists;
import com.ss.android.vesdk.VEBenchmark;
import java.util.HashMap;
import java.util.List;

public class BenchmarkService extends Service {

    /* renamed from: a  reason: collision with root package name */
    volatile a f7446a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Looper f7447b;

    /* renamed from: c  reason: collision with root package name */
    private final m.a f7448c = new m.a() {
        public final void a(k kVar) {
            BenchmarkService benchmarkService = BenchmarkService.this;
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = kVar;
            benchmarkService.f7446a.sendMessage(obtain);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final h.a f7449d = new h.a() {
        public final void a(List list, g gVar) {
            j jVar;
            BenchmarkService benchmarkService = BenchmarkService.this;
            if (!Lists.isEmpty(list)) {
                for (int i = 0; i < list.size(); i++) {
                    Benchmark benchmark = (Benchmark) list.get(i);
                    switch (benchmark.id) {
                        case 1:
                            jVar = new f(benchmark);
                            break;
                        case 2:
                            jVar = new c(benchmark);
                            break;
                        case 3:
                            jVar = new e(benchmark);
                            break;
                        case 4:
                            jVar = new g(benchmark);
                            break;
                        case 5:
                            jVar = new com.benchmark.a.h(benchmark);
                            break;
                        case 6:
                            jVar = new i(benchmark);
                            break;
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                            jVar = new com.benchmark.a.a();
                            break;
                        case 8:
                            jVar = new b();
                            break;
                        case 9:
                            jVar = new d();
                            break;
                        default:
                            jVar = new j();
                            break;
                    }
                    f fVar = new f(benchmark, jVar, gVar);
                    if (i == list.size() - 1) {
                        fVar.f7503d = true;
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 0;
                    obtain.obj = fVar;
                    benchmarkService.f7446a.sendMessage(obtain);
                }
            }
        }
    };

    final class a extends Handler {
        public final void handleMessage(Message message) {
            HashMap<String, String> hashMap;
            if (message.what == 0) {
                f fVar = (f) message.obj;
                int b2 = fVar.f7501b.b();
                if (b2 == 0) {
                    fVar.run();
                } else {
                    try {
                        g gVar = fVar.f7502c;
                        Benchmark benchmark = fVar.f7500a;
                        gVar.a(benchmark, "depend runtime is not ready and status is " + b2);
                    } catch (RemoteException e2) {
                        a.a((Throwable) e2);
                    }
                }
                try {
                    fVar.f7501b.c();
                } catch (Throwable th) {
                    a.a(th);
                }
                if (fVar.f7503d) {
                    n.a().c();
                }
                return;
            }
            if (1 == message.what) {
                k kVar = (k) message.obj;
                if (n.a().b() == 0) {
                    VEBenchmark a2 = VEBenchmark.a();
                    if (!a2.f77842a) {
                        hashMap = null;
                    } else {
                        if (a2.f77844c.size() <= 0) {
                            a2.f77844c.put("GL_VENDOR", GLES20.glGetString(7936));
                            a2.f77844c.put("GL_VERSION", GLES20.glGetString(7938));
                            a2.f77844c.put("GL_RENDERER", GLES20.glGetString(7937));
                            a2.f77844c.put("GL_EXTENSIONS", GLES20.glGetString(7939));
                            a2.f77844c.put("EGL_VENDOR", a2.nativeEGLQueryString(a2.f77843b, 12371));
                            String nativeEGLQueryString = a2.nativeEGLQueryString(a2.f77843b, 12372);
                            a2.f77844c.put("EGL_VERSION", nativeEGLQueryString);
                            if (nativeEGLQueryString != null && nativeEGLQueryString.length() > 0 && nativeEGLQueryString.startsWith("EGL_VERSION : 1.4")) {
                                a2.f77844c.put("EGL_CLIENT", a2.nativeEGLQueryString(a2.f77843b, 12429));
                            }
                            a2.f77844c.put("EGL_EXTENSIONS", a2.nativeEGLQueryString(a2.f77843b, 12373));
                            a2.f77844c.put("EGL_ALPHA_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12321)));
                            a2.f77844c.put("EGL_ALPHA_MASK_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12350)));
                            a2.f77844c.put("EGL_BUFFER_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12320)));
                            a2.f77844c.put("EGL_COLOR_BUFFER_TYPE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12351)));
                            a2.f77844c.put("EGL_DEPTH_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12325)));
                            a2.f77844c.put("EGL_HEIGHT", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12374)));
                            a2.f77844c.put("EGL_WIDTH", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12375)));
                            a2.f77844c.put("EGL_HORIZONTAL_RESOLUTION", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12432)));
                            a2.f77844c.put("EGL_VERTICAL_RESOLUTION", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12433)));
                            a2.f77844c.put("EGL_LARGEST_PBUFFER", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12376)));
                            a2.f77844c.put("EGL_LEVEL", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12329)));
                            a2.f77844c.put("EGL_LUMINANCE_BUFFER", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12431)));
                            a2.f77844c.put("EGL_LUMINANCE_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12349)));
                            a2.f77844c.put("EGL_MAX_PBUFFER_HEIGHT", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12330)));
                            a2.f77844c.put("EGL_MAX_PBUFFER_WIDTH", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12332)));
                            a2.f77844c.put("EGL_MAX_PBUFFER_PIXELS", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12331)));
                            a2.f77844c.put("EGL_NATIVE_RENDERABLE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12333)));
                            a2.f77844c.put("EGL_PBUFFER_BIT", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 1)));
                            a2.f77844c.put("EGL_PIXEL_ASPECT_RATIO", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12434)));
                            a2.f77844c.put("EGL_PIXMAP_BIT", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 2)));
                            a2.f77844c.put("EGL_RED_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12324)));
                            a2.f77844c.put("EGL_GREEN_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12323)));
                            a2.f77844c.put("EGL_BLUE_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12322)));
                            a2.f77844c.put("EGL_RENDERABLE_TYPE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12352)));
                            a2.f77844c.put("EGL_RENDER_BUFFER", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12422)));
                            a2.f77844c.put("EGL_RGB_BUFFER", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12430)));
                            a2.f77844c.put("EGL_SAMPLES", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12337)));
                            a2.f77844c.put("EGL_SAMPLE_BUFFERS", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12338)));
                            a2.f77844c.put("EGL_STENCIL_SIZE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12326)));
                            a2.f77844c.put("EGL_SURFACE_TYPE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12339)));
                            a2.f77844c.put("EGL_TRANSPARENT_TYPE", String.valueOf(a2.nativeEGLGetConfigAttrib(a2.f77843b, 12340)));
                        }
                        hashMap = a2.f77844c;
                    }
                    try {
                        kVar.a(hashMap);
                    } catch (RemoteException e3) {
                        a.a((Throwable) e3);
                    }
                    n.a().c();
                }
            }
        }

        a(Looper looper) {
            super(looper);
        }
    }

    public void onDestroy() {
        this.f7447b.quit();
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("com/benchmark");
        handlerThread.start();
        this.f7447b = handlerThread.getLooper();
        this.f7446a = new a(this.f7447b);
    }

    public IBinder onBind(Intent intent) {
        if (1 == intent.getIntExtra("bind_type", 0)) {
            return this.f7448c.asBinder();
        }
        return this.f7449d.asBinder();
    }
}
