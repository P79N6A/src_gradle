package com.bytedance.android.livesdk.chatroom;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9855a;

    /* renamed from: b  reason: collision with root package name */
    private final EGLContext[] f9856b;

    c(EGLContext[] eGLContextArr) {
        this.f9856b = eGLContextArr;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9855a, false, 3896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9855a, false, 3896, new Class[0], Void.TYPE);
            return;
        }
        EGLContext[] eGLContextArr = this.f9856b;
        EGL egl = EGLContext.getEGL();
        if (egl instanceof EGL10) {
            eGLContextArr[0] = ((EGL10) egl).eglGetCurrentContext();
        }
    }
}
