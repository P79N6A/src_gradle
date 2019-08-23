package com.ss.android.ttve.common;

import android.opengl.GLES20;
import com.ss.android.ttve.common.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f31184a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    protected e f31185b;

    /* renamed from: c  reason: collision with root package name */
    private int f31186c;

    /* renamed from: d  reason: collision with root package name */
    private int f31187d;

    /* renamed from: e  reason: collision with root package name */
    private int f31188e;

    /* renamed from: f  reason: collision with root package name */
    private int f31189f;

    protected i() {
    }

    public final void b() {
        this.f31185b.a();
        GLES20.glDeleteBuffers(1, new int[]{this.f31186c}, 0);
        this.f31185b = null;
        this.f31186c = 0;
    }

    public static i a() {
        boolean z;
        i iVar = new i();
        iVar.f31185b = new e();
        e eVar = iVar.f31185b;
        int i = eVar.f31169a;
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (eVar.f31170b != null) {
            eVar.f31170b.a();
        }
        if (eVar.f31171c != null) {
            eVar.f31171c.a();
        }
        eVar.f31170b = new e.a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", 35633);
        eVar.f31171c = new e.a("precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform int debug;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n   if (debug != 0) gl_FragColor.rg = texCoord;\n}", 35632);
        GLES20.glAttachShader(i, eVar.f31170b.f31172a);
        GLES20.glAttachShader(i, eVar.f31171c.f31172a);
        int glGetError = GLES20.glGetError();
        for (int i2 = 0; i2 < 32 && glGetError != 0; i2++) {
            glGetError = GLES20.glGetError();
        }
        GLES20.glLinkProgram(i);
        boolean z2 = true;
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        eVar.f31170b.a();
        eVar.f31171c.a();
        eVar.f31170b = null;
        eVar.f31171c = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(i);
            z = false;
        } else {
            if (!(eVar.f31169a == i || eVar.f31169a == 0)) {
                GLES20.glDeleteProgram(eVar.f31169a);
            }
            eVar.f31169a = i;
            z = true;
        }
        if (!z) {
            iVar.f31185b.a();
            iVar.f31185b = null;
            z2 = false;
        } else {
            iVar.f31185b.b();
            iVar.f31187d = iVar.f31185b.a("rotation");
            iVar.f31188e = iVar.f31185b.a("flipScale");
            iVar.f31189f = iVar.f31185b.a("debug");
            GLES20.glBindAttribLocation(iVar.f31185b.f31169a, 0, "vPosition");
            int[] iArr2 = new int[1];
            GLES20.glGenBuffers(1, iArr2, 0);
            iVar.f31186c = iArr2[0];
            GLES20.glBindBuffer(34962, iVar.f31186c);
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f31184a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(f31184a).position(0);
            GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
            iVar.a(0.0f);
            iVar.a(1.0f, 1.0f);
            iVar.f31185b.b();
            GLES20.glUniform1i(iVar.f31189f, 0);
        }
        if (z2) {
            return iVar;
        }
        iVar.b();
        return null;
    }

    public final void a(float f2) {
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        this.f31185b.b();
        GLES20.glUniformMatrix2fv(this.f31187d, 1, false, new float[]{cos, sin, -sin, cos}, 0);
    }

    public final void a(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f31186c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f31185b.b();
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void a(float f2, float f3) {
        this.f31185b.b();
        GLES20.glUniform2f(this.f31188e, 1.0f, 1.0f / f3);
    }
}
