package com.ss.android.ttve.common;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

@TargetApi(18)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public EGLContext f31154a = EGL14.EGL_NO_CONTEXT;

    /* renamed from: b  reason: collision with root package name */
    public EGLSurface f31155b = EGL14.EGL_NO_SURFACE;

    /* renamed from: c  reason: collision with root package name */
    public EGLSurface f31156c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d  reason: collision with root package name */
    public EGLDisplay f31157d = EGL14.EGL_NO_DISPLAY;

    public final void a() {
        this.f31154a = EGL14.eglGetCurrentContext();
        this.f31154a.equals(EGL14.EGL_NO_CONTEXT);
        this.f31155b = EGL14.eglGetCurrentSurface(12378);
        this.f31155b.equals(EGL14.EGL_NO_SURFACE);
        this.f31156c = EGL14.eglGetCurrentSurface(12377);
        this.f31156c.equals(EGL14.EGL_NO_SURFACE);
        this.f31157d = EGL14.eglGetCurrentDisplay();
        this.f31157d.equals(EGL14.EGL_NO_DISPLAY);
    }
}
