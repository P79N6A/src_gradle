package com.ss.android.ugc.aweme.livewallpaper.b;

import android.graphics.SurfaceTexture;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class k extends SurfaceTexture {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53636a;

    /* renamed from: b  reason: collision with root package name */
    public h f53637b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f53638c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f53639d = false;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53636a, false, 56167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53636a, false, 56167, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f53639d) {
            this.f53637b.b();
            this.f53639d = true;
        }
    }

    public void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, f53636a, false, 56168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53636a, false, 56168, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.finalize();
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, f53636a, false, 56166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53636a, false, 56166, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.release();
    }

    public void releaseTexImage() {
        if (PatchProxy.isSupport(new Object[0], this, f53636a, false, 56169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53636a, false, 56169, new Class[0], Void.TYPE);
            return;
        }
        super.releaseTexImage();
    }

    public k(h hVar) {
        super(hVar.c());
        hVar.a();
        this.f53637b = hVar;
        this.f53637b.d();
    }
}
