package com.ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.playerkit.c.a;

public class h implements VideoSurfaceHolder {

    /* renamed from: a  reason: collision with root package name */
    public VideoSurfaceHolder f77784a;

    public final View a() {
        return this.f77784a.a();
    }

    public final Surface b() {
        return this.f77784a.b();
    }

    public final boolean c() {
        return this.f77784a.c();
    }

    public final void d() {
        this.f77784a.d();
    }

    public final void e() {
        this.f77784a.e();
    }

    public final void f() {
        this.f77784a.f();
    }

    public final int g() {
        return this.f77784a.g();
    }

    public final boolean h() {
        return this.f77784a.h();
    }

    public final boolean i() {
        if (g() == 1) {
            return true;
        }
        return false;
    }

    public final void a(i iVar) {
        this.f77784a.a(iVar);
    }

    public final void b(i iVar) {
        this.f77784a.b(iVar);
    }

    public static h a(KeepSurfaceTextureView keepSurfaceTextureView) {
        Object tag = keepSurfaceTextureView.getTag();
        if (tag instanceof h) {
            return (h) tag;
        }
        h hVar = new h();
        hVar.f77784a = new f(keepSurfaceTextureView);
        keepSurfaceTextureView.setTag(hVar);
        return hVar;
    }

    public static h a(ViewGroup viewGroup) {
        boolean f2 = a.r().f();
        h hVar = new h();
        if (f2) {
            hVar.f77784a = new e(viewGroup);
        } else {
            hVar.f77784a = new f(viewGroup);
        }
        hVar.a().setTag(hVar);
        return hVar;
    }

    public final void a(boolean z) {
        this.f77784a.a(z);
    }
}
