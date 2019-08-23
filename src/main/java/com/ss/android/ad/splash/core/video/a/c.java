package com.ss.android.ad.splash.core.video.a;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;

public interface c {

    public interface a {
        void a(c cVar, int i);
    }

    public interface b {
        void d();
    }

    /* renamed from: com.ss.android.ad.splash.core.video.a.c$c  reason: collision with other inner class name */
    public interface C0322c {
        boolean a(int i, int i2);
    }

    public interface d {
        boolean a(c cVar, int i, int i2);
    }

    public interface e {
        void e();
    }

    public interface f {
        void f();
    }

    public interface g {
    }

    void a(float f2, float f3);

    void a(long j) throws IllegalStateException;

    @Deprecated
    void a(Context context, int i);

    void a(Surface surface);

    void a(SurfaceHolder surfaceHolder);

    void a(a aVar);

    void a(b bVar);

    void a(C0322c cVar);

    void a(d dVar);

    void a(e eVar);

    void a(f fVar);

    void a(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    void a(boolean z);

    void b() throws IllegalStateException;

    void b(boolean z);

    void c() throws IllegalStateException;

    void d() throws IllegalStateException;

    long e();

    long f();

    void g();

    void h();
}
