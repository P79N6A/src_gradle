package com.ss.android.medialib.common;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29638a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f29639b = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    protected d f29640c;

    /* renamed from: d  reason: collision with root package name */
    private int f29641d;

    /* renamed from: e  reason: collision with root package name */
    private int f29642e;

    /* renamed from: f  reason: collision with root package name */
    private int f29643f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f29638a, false, 17124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29638a, false, 17124, new Class[0], Void.TYPE);
            return;
        }
        this.f29640c.a();
        GLES20.glDeleteBuffers(1, new int[]{this.f29641d}, 0);
        this.f29640c = null;
        this.f29641d = 0;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f)}, this, f29638a, false, 17128, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f)}, this, f29638a, false, 17128, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        this.f29640c.b();
        GLES20.glUniformMatrix2fv(this.f29642e, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(1.0f), Float.valueOf(f3)}, this, f29638a, false, 17129, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(1.0f), Float.valueOf(f3)}, this, f29638a, false, 17129, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f29640c.b();
        GLES20.glUniform2f(this.f29643f, 1.0f, 1.0f / f3);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), 3553}, this, f29638a, false, 17126, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), 3553}, this, f29638a, false, 17126, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f29641d);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f29640c.b();
        GLES20.glDrawArrays(6, 0, 4);
    }

    public final boolean a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f29638a, false, 17122, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f29638a, false, 17122, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        this.f29640c = new d();
        if (!this.f29640c.a(str, str2)) {
            this.f29640c.a();
            this.f29640c = null;
            return false;
        }
        this.f29640c.b();
        this.f29642e = this.f29640c.a("rotation");
        this.f29643f = this.f29640c.a("flipScale");
        this.f29640c.a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        this.f29641d = iArr[0];
        GLES20.glBindBuffer(34962, this.f29641d);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f29639b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(f29639b).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        a(0.0f);
        a(1.0f, 1.0f);
        y.b("TextureDrawer", "init: success.");
        return true;
    }
}
