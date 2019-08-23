package com.ss.android.ttvecamera.f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.support.annotation.NonNull;
import android.view.Surface;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f31434a = "c";

    /* renamed from: b  reason: collision with root package name */
    public b f31435b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31436a = true;

        /* renamed from: b  reason: collision with root package name */
        public ac f31437b;

        /* renamed from: c  reason: collision with root package name */
        public b.a f31438c;

        /* renamed from: d  reason: collision with root package name */
        public SurfaceTexture f31439d;

        /* renamed from: e  reason: collision with root package name */
        public int f31440e;

        /* renamed from: f  reason: collision with root package name */
        public e.b f31441f = e.b.PIXEL_FORMAT_Count;

        public a(ac acVar, @NonNull b.a aVar, boolean z, e.b bVar) {
            this.f31437b = acVar;
            this.f31438c = aVar;
            this.f31441f = bVar;
            this.f31436a = z;
        }

        public a(ac acVar, @NonNull b.a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f31437b = acVar;
            this.f31438c = aVar;
            this.f31439d = surfaceTexture;
            this.f31440e = i;
            this.f31436a = z;
            this.f31441f = e.b.PIXEL_FORMAT_OpenGL_OES;
        }
    }

    public final int a() {
        if (this.f31435b != null) {
            return this.f31435b.c();
        }
        return 0;
    }

    public final Surface b() {
        if (this.f31435b != null) {
            return this.f31435b.a();
        }
        return null;
    }

    public final SurfaceTexture c() {
        if (this.f31435b != null) {
            return this.f31435b.b();
        }
        return null;
    }

    public final int a(@NonNull StreamConfigurationMap streamConfigurationMap, ac acVar) {
        if (this.f31435b == null || this.f31435b == null) {
            return -112;
        }
        return this.f31435b.a(streamConfigurationMap, acVar);
    }
}
