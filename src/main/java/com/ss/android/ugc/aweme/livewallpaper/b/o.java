package com.ss.android.ugc.aweme.livewallpaper.b;

import android.annotation.TargetApi;
import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53649a;

    /* renamed from: b  reason: collision with root package name */
    protected int f53650b;

    /* renamed from: c  reason: collision with root package name */
    protected int f53651c;

    /* renamed from: d  reason: collision with root package name */
    int f53652d;

    /* renamed from: e  reason: collision with root package name */
    int f53653e;

    /* renamed from: f  reason: collision with root package name */
    int f53654f;
    int g;
    boolean h;
    private int i;
    private int j;
    private FloatBuffer[] k;

    public int a() {
        return 3553;
    }

    public float[] d() {
        return p.f53659e;
    }

    public String[] b() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "precision mediump float;\nuniform sampler2D u_tex;\nuniform bool fmt_changed; \nvarying vec2 v_tex;\nvoid main() {\n   if (fmt_changed) {\n       gl_FragColor = vec4(texture2D(u_tex, v_tex).bgr, 1.0);\n   } else { \n       gl_FragColor = texture2D(u_tex, v_tex);\n   }\n}\n"};
    }

    @TargetApi(18)
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53649a, false, 56186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53649a, false, 56186, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53652d != 0) {
            GLES20.glDeleteProgram(this.f53652d);
            this.f53652d = 0;
        }
        if (this.i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.i}, 0);
            this.i = 0;
        }
        if (this.j != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.j}, 0);
            this.j = 0;
        }
        this.h = false;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f53649a, false, 56189, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f53649a, false, 56189, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        GLES20.glBindBuffer(34962, this.i);
        GLES20.glBufferData(34962, 32, this.k[i2].rewind(), 35044);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.j);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
    }

    public boolean a(int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53649a, false, 56182, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f53649a, false, 56182, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.f53650b = i2;
        this.f53651c = i3;
        if (PatchProxy.isSupport(new Object[0], this, f53649a, false, 56190, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53649a, false, 56190, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            String[] b2 = b();
            String str = b2[0];
            String str2 = b2[1];
            if (PatchProxy.isSupport(new Object[]{str, str2}, null, i.f53625a, true, 56114, new Class[]{String.class, String.class}, Integer.TYPE)) {
                i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2}, null, i.f53625a, true, 56114, new Class[]{String.class, String.class}, Integer.TYPE)).intValue();
            } else {
                int a2 = i.a(35633, str);
                if (a2 != 0) {
                    int a3 = i.a(35632, str2);
                    if (a3 != 0) {
                        int glCreateProgram = GLES20.glCreateProgram();
                        i.a("glCreateProgram");
                        GLES20.glAttachShader(glCreateProgram, a2);
                        i.a("glAttachShader");
                        GLES20.glAttachShader(glCreateProgram, a3);
                        i.a("glAttachShader");
                        GLES20.glLinkProgram(glCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                        if (iArr[0] != 1) {
                            GLES20.glDeleteProgram(glCreateProgram);
                            glCreateProgram = 0;
                        }
                        i4 = glCreateProgram;
                    }
                }
                i4 = 0;
            }
            this.f53652d = i4;
            if (this.f53652d != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        int i5 = this.f53652d;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i5)}, this, f53649a, false, 56191, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i5)}, this, f53649a, false, 56191, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            GLES20.glBindAttribLocation(i5, 0, "a_pos");
            GLES20.glBindAttribLocation(i5, 1, "a_tex");
            this.f53653e = GLES20.glGetUniformLocation(i5, "u_mvp");
            this.f53654f = GLES20.glGetUniformLocation(i5, "u_tex_trans");
            this.g = GLES20.glGetUniformLocation(i5, "fmt_changed");
            z2 = i.a("TextureDrawer glBindAttribLocation");
        }
        if (!z2) {
            return false;
        }
        if (PatchProxy.isSupport(new Object[0], this, f53649a, false, 56187, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53649a, false, 56187, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f53649a, false, 56188, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53649a, false, 56188, new Class[0], Void.TYPE);
            } else {
                this.k = new FloatBuffer[4];
                float[] fArr = p.f53655a;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
                allocateDirect.order(ByteOrder.nativeOrder());
                this.k[0] = allocateDirect.asFloatBuffer();
                this.k[0].put(fArr);
                this.k[0].rewind();
                float[] fArr2 = p.f53656b;
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
                allocateDirect2.order(ByteOrder.nativeOrder());
                this.k[1] = allocateDirect2.asFloatBuffer();
                this.k[1].put(fArr2);
                this.k[1].rewind();
                float[] fArr3 = p.f53657c;
                ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(fArr3.length * 4);
                allocateDirect3.order(ByteOrder.nativeOrder());
                this.k[2] = allocateDirect3.asFloatBuffer();
                this.k[2].put(fArr3);
                this.k[2].rewind();
                float[] fArr4 = p.f53658d;
                ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(fArr4.length * 4);
                allocateDirect4.order(ByteOrder.nativeOrder());
                this.k[3] = allocateDirect4.asFloatBuffer();
                this.k[3].put(fArr4);
                this.k[3].rewind();
            }
            float[] d2 = d();
            ByteBuffer allocateDirect5 = ByteBuffer.allocateDirect(d2.length * 4);
            allocateDirect5.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer = allocateDirect5.asFloatBuffer();
            asFloatBuffer.put(d2);
            asFloatBuffer.rewind();
            int[] iArr2 = new int[2];
            GLES20.glGenBuffers(2, iArr2, 0);
            this.i = iArr2[0];
            this.j = iArr2[1];
            GLES20.glBindBuffer(34962, this.i);
            GLES20.glBufferData(34962, 32, this.k[0].rewind(), 35044);
            GLES20.glBindBuffer(34962, this.j);
            GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
            GLES20.glBindBuffer(34962, 0);
            a(0);
            GLES20.glBindBuffer(34962, 0);
            z3 = i.a("TextureDrawer setup VAO, VBOs.");
        }
        if (!z3) {
            return false;
        }
        this.h = true;
        return true;
    }

    @TargetApi(18)
    public final void a(int i2, boolean z, int i3, float[] fArr) {
        float[] fArr2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), (byte) 0, 0, fArr}, this, f53649a, false, 56184, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, float[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), (byte) 0, 0, fArr}, this, f53649a, false, 56184, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE, float[].class}, Void.TYPE);
        } else if (this.h) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f53652d);
            GLES20.glActiveTexture(33984);
            int i4 = i2;
            GLES20.glBindTexture(a(), i2);
            a(0);
            GLES20.glUniformMatrix4fv(this.f53653e, 1, false, i.f53626b, 0);
            if (fArr == null) {
                fArr2 = i.f53626b;
            } else {
                fArr2 = fArr;
            }
            GLES20.glUniformMatrix4fv(this.f53654f, 1, false, fArr2, 0);
            GLES20.glUniform1i(this.g, 0);
            GLES20.glViewport(0, 0, this.f53650b * 2, this.f53651c * 2);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(a(), 0);
        }
    }
}
