package com.ss.android.ugc.aweme.livewallpaper.b;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53625a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f53626b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f53627c = b();

    public static boolean a() {
        return f53627c;
    }

    static {
        float[] fArr = new float[16];
        f53626b = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    @TargetApi(17)
    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f53625a, true, 56111, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53625a, true, 56111, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        try {
            EGL14.eglGetCurrentContext();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f53625a, true, 56116, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f53625a, true, 56116, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(": glError 0x");
        sb.append(Integer.toHexString(glGetError));
        return false;
    }

    public static int a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f53625a, true, 56115, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f53625a, true, 56115, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        int glCreateShader = GLES20.glCreateShader(i);
        a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str2);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        return glCreateShader;
    }

    public static int a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{null, Integer.valueOf(i), Integer.valueOf(i2), 6408}, null, f53625a, true, 56118, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{null, Integer.valueOf(i), Integer.valueOf(i2), 6408}, null, f53625a, true, 56118, new Class[]{ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        a("glGenTextures");
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        a("loadImageTexture");
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        a("loadImageTexture");
        return i4;
    }
}
