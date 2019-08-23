package com.ss.android.ttve.common;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;

@TargetApi(17)
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static int f31174a = 8;

    /* renamed from: b  reason: collision with root package name */
    public static int f31175b = 8;

    /* renamed from: c  reason: collision with root package name */
    public static int f31176c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static int f31177d = 8;
    private static final String i = "f";

    /* renamed from: e  reason: collision with root package name */
    public EGLContext f31178e;

    /* renamed from: f  reason: collision with root package name */
    public EGLConfig f31179f;
    public EGLDisplay g;
    public EGLSurface h;

    public static void d() {
        EGL14.eglGetError();
    }

    public final boolean c() {
        return EGL14.eglSwapBuffers(this.g, this.h);
    }

    public final boolean b() {
        if (EGL14.eglMakeCurrent(this.g, this.h, this.h, this.f31178e)) {
            return true;
        }
        d();
        return false;
    }

    public final void a() {
        if (this.g != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.g, this.f31178e);
            EGL14.eglDestroySurface(this.g, this.h);
            EGL14.eglTerminate(this.g);
        }
        this.g = EGL14.EGL_NO_DISPLAY;
        this.h = EGL14.EGL_NO_SURFACE;
        this.f31178e = EGL14.EGL_NO_CONTEXT;
    }

    @TargetApi(18)
    public final void a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.g, this.h, j);
        d();
    }
}
