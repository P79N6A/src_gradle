package com.ss.android.medialib.b;

import android.opengl.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29379a;
    private static final float[] j = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
    private static final float[] k = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    int f29380b;

    /* renamed from: c  reason: collision with root package name */
    int f29381c;

    /* renamed from: d  reason: collision with root package name */
    int f29382d;

    /* renamed from: e  reason: collision with root package name */
    int f29383e;

    /* renamed from: f  reason: collision with root package name */
    int f29384f;
    public float[] g = new float[16];
    FloatBuffer h;
    FloatBuffer i;

    public b() {
        Matrix.setIdentityM(this.g, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(j.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.h = allocateDirect.asFloatBuffer();
        this.h.put(j);
        this.h.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(k.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.i = allocateDirect2.asFloatBuffer();
        this.i.put(k);
        this.i.position(0);
    }
}
