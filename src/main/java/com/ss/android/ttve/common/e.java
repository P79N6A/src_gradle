package com.ss.android.ttve.common;

import android.opengl.GLES20;
import com.ss.android.vesdk.y;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f31169a = GLES20.glCreateProgram();

    /* renamed from: b  reason: collision with root package name */
    a f31170b;

    /* renamed from: c  reason: collision with root package name */
    a f31171c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f31172a;

        /* renamed from: b  reason: collision with root package name */
        private int f31173b;

        public a() {
        }

        public final void a() {
            if (this.f31172a != 0) {
                GLES20.glDeleteShader(this.f31172a);
                this.f31172a = 0;
            }
        }

        public a(String str, int i) {
            this.f31173b = i;
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                y.d("TEProgramObject", "before glCreateShader, glError: " + glGetError);
            }
            int glCreateShader = GLES20.glCreateShader(i);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 != 0) {
                y.d("TEProgramObject", "after glCreateShader, glError: " + glGetError2);
            }
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    y.d("TEProgramObject", "after glCompileShader, glError: " + glGetError3);
                }
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    y.d("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f31172a = glCreateShader;
            if (this.f31172a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (this.f31172a == 0) {
                y.d("TEProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    public final void b() {
        GLES20.glUseProgram(this.f31169a);
    }

    public final void a() {
        if (this.f31169a != 0) {
            GLES20.glDeleteProgram(this.f31169a);
            this.f31169a = 0;
        }
    }

    public final int a(String str) {
        return GLES20.glGetUniformLocation(this.f31169a, str);
    }
}
