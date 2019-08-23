package com.ss.android.medialib.common;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.y;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29630a;

    /* renamed from: b  reason: collision with root package name */
    public int f29631b = GLES20.glCreateProgram();

    /* renamed from: c  reason: collision with root package name */
    private a f29632c;

    /* renamed from: d  reason: collision with root package name */
    private a f29633d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29634a;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ boolean f29635c = (!d.class.desiredAssertionStatus());

        /* renamed from: b  reason: collision with root package name */
        public int f29636b;

        /* renamed from: d  reason: collision with root package name */
        private int f29637d;

        public a() {
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f29634a, false, 17107, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f29634a, false, 17107, new Class[0], Void.TYPE);
            } else if (this.f29636b != 0) {
                GLES20.glDeleteShader(this.f29636b);
                this.f29636b = 0;
            }
        }

        public a(String str, int i) {
            String str2 = str;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f29634a, false, 17106, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f29634a, false, 17106, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                return;
            }
            this.f29637d = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f29634a, true, 17108, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f29634a, true, 17108, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
            } else {
                int glCreateShader = GLES20.glCreateShader(i);
                if (glCreateShader != 0) {
                    GLES20.glShaderSource(glCreateShader, str2);
                    GLES20.glCompileShader(glCreateShader);
                    int[] iArr = {0};
                    GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                    if (iArr[0] != 1) {
                        y.d("ProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                        GLES20.glDeleteShader(glCreateShader);
                    }
                }
                i2 = glCreateShader;
            }
            this.f29636b = i2;
            if (!f29635c && this.f29636b == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (this.f29636b == 0) {
                y.d("ProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f29630a, false, 17088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29630a, false, 17088, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29631b != 0) {
            GLES20.glDeleteProgram(this.f29631b);
            this.f29631b = 0;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29630a, false, 17091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29630a, false, 17091, new Class[0], Void.TYPE);
            return;
        }
        GLES20.glUseProgram(this.f29631b);
    }

    public final int a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f29630a, false, 17092, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f29630a, false, 17092, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f29631b, str2);
        if (glGetUniformLocation < 0) {
            y.d("ProgramObject", String.format("uniform name %s does not exist", new Object[]{str2}));
        }
        return glGetUniformLocation;
    }

    public final void a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, 0}, this, f29630a, false, 17105, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, 0}, this, f29630a, false, 17105, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        GLES20.glBindAttribLocation(this.f29631b, 0, str2);
    }

    public final boolean a(String str, String str2) {
        if (!PatchProxy.isSupport(new Object[]{str, str2}, this, f29630a, false, 17089, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return a(str, str2, this.f29631b);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f29630a, false, 17089, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    private boolean a(String str, String str2, int i) {
        int i2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, f29630a, false, 17090, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, f29630a, false, 17090, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i == 0) {
            i2 = GLES20.glCreateProgram();
        } else {
            i2 = i;
        }
        if (i2 == 0) {
            y.d("ProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        if (this.f29632c != null) {
            this.f29632c.a();
        }
        if (this.f29633d != null) {
            this.f29633d.a();
        }
        this.f29632c = new a(str, 35633);
        this.f29633d = new a(str4, 35632);
        GLES20.glAttachShader(i2, this.f29632c.f29636b);
        GLES20.glAttachShader(i2, this.f29633d.f29636b);
        a.a("AttachShaders...");
        GLES20.glLinkProgram(i2);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i2, 35714, iArr, 0);
        this.f29632c.a();
        this.f29633d.a();
        this.f29632c = null;
        this.f29633d = null;
        if (iArr[0] != 1) {
            y.d("ProgramObject", GLES20.glGetProgramInfoLog(i2));
            return false;
        }
        if (!(this.f29631b == i2 || this.f29631b == 0)) {
            GLES20.glDeleteProgram(this.f29631b);
        }
        this.f29631b = i2;
        return true;
    }
}
