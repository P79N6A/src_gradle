package com.ss.android.medialib;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.d;
import com.ss.android.vesdk.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29681a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f29682b = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    protected d f29683c;

    /* renamed from: d  reason: collision with root package name */
    private int f29684d;

    /* renamed from: e  reason: collision with root package name */
    private int f29685e;

    /* renamed from: f  reason: collision with root package name */
    private int f29686f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f29681a, false, 16616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29681a, false, 16616, new Class[0], Void.TYPE);
            return;
        }
        this.f29683c.a();
        GLES20.glDeleteBuffers(1, new int[]{this.f29684d}, 0);
        this.f29683c = null;
        this.f29684d = 0;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f)}, this, f29681a, false, 16620, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f)}, this, f29681a, false, 16620, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        this.f29683c.b();
        GLES20.glUniformMatrix2fv(this.f29685e, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29681a, false, 16622, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29681a, false, 16622, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f29683c.b();
        GLES20.glUniform1f(this.i, f2);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(1.0f), Float.valueOf(f3)}, this, f29681a, false, 16621, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(1.0f), Float.valueOf(f3)}, this, f29681a, false, 16621, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f29683c.b();
        GLES20.glUniform2f(this.f29686f, 1.0f, 1.0f / f3);
    }

    public final void a(int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 3553}, this, f29681a, false, 16618, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), 3553}, this, f29681a, false, 16618, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.g, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i3);
        GLES20.glUniform1i(this.h, 2);
        GLES20.glBindBuffer(34962, this.f29684d);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f29683c.b();
        GLES20.glDrawArrays(6, 0, 4);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f29681a, false, 16623, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f29681a, false, 16623, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f29683c.b();
        float f6 = f2;
        GLES20.glUniform1f(this.j, f2);
        float f7 = f3;
        GLES20.glUniform1f(this.k, f3);
        GLES20.glUniform1f(this.l, f4);
        GLES20.glUniform1f(this.m, f5);
    }

    public final boolean a(String str, String str2, float f2, float f3) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(f2), Float.valueOf(f3)}, this, f29681a, false, 16614, new Class[]{String.class, String.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(f2), Float.valueOf(f3)}, this, f29681a, false, 16614, new Class[]{String.class, String.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.f29683c = new d();
        if (!this.f29683c.a(str3, str4)) {
            this.f29683c.a();
            this.f29683c = null;
            return false;
        }
        this.f29683c.b();
        this.f29685e = this.f29683c.a("rotation");
        this.f29686f = this.f29683c.a("flipScale");
        this.g = this.f29683c.a("inputImageTexture");
        this.h = this.f29683c.a("inputImageTexture2");
        this.i = this.f29683c.a("markAlpha");
        this.j = this.f29683c.a("xPos");
        this.k = this.f29683c.a("yPos");
        this.l = this.f29683c.a("bottomPos");
        this.m = this.f29683c.a("rightPos");
        this.n = this.f29683c.a("xAdjust");
        this.o = this.f29683c.a("yAdjust");
        this.f29683c.a("vPosition", 0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        this.f29684d = iArr[0];
        GLES20.glBindBuffer(34962, this.f29684d);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f29682b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(f29682b).position(0);
        GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
        a(0.0f);
        a(1.0f, 1.0f);
        b(1.0f);
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f29681a, false, 16624, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f29681a, false, 16624, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else {
            this.f29683c.b();
            GLES20.glUniform1f(this.n, f2);
            GLES20.glUniform1f(this.o, f3);
        }
        y.b("TextureDrawer", "init: success.");
        return true;
    }
}
