package com.ss.android.medialib.common;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29620a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f29621b = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: com.ss.android.medialib.common.a$a  reason: collision with other inner class name */
    public interface C0357a {
        void a();

        void b();

        int c();
    }

    public interface b {
        void a(int i);
    }

    public static void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f29620a, true, 17058, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f29620a, true, 17058, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int glGetError = GLES20.glGetError();
        for (int i = 0; i < 32 && glGetError != 0; i++) {
            glGetError = GLES20.glGetError();
        }
    }
}
