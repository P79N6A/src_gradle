package com.ss.android.medialib.camera;

import android.graphics.SurfaceTexture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IESCameraInterface {
    public static final int[] w = {2, 0, 1, 3};
    public static final int[] x = {1, 2, 0, 3};

    @Retention(RetentionPolicy.CLASS)
    public @interface FlashMode {
    }

    public interface d {
        void a(int i, float f2, boolean z);

        void a(int i, boolean z, boolean z2, float f2, List<Integer> list);

        boolean a();
    }

    public interface a {
        void a();
    }

    public interface b {
        void a(j jVar);
    }

    public interface c {
        void a(int i, j jVar);
    }

    void a(float f2);

    void a(int i, int i2, b bVar);

    void a(SurfaceTexture surfaceTexture);

    void a(a aVar);

    void a(c cVar);

    void a(d dVar);

    void a(d dVar);

    void a(boolean z);

    boolean a();

    boolean a(@FlashMode int i);

    boolean a(int i, int i2, float f2, float[] fArr, int i3);

    boolean a(int i, c cVar);

    int b(int i);

    int b(boolean z);

    void b();

    void b(float f2);

    void b(SurfaceTexture surfaceTexture);

    boolean b(int i, c cVar);

    void c();

    void d();

    void e();

    int[] f();

    float g();

    boolean h();

    int[] i();

    List<int[]> j();

    int k();

    boolean l();

    int m();
}
