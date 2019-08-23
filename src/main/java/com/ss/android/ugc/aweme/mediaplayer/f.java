package com.ss.android.ugc.aweme.mediaplayer;

import a.g;
import a.i;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55341a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaPlayerModule f55342b;

    /* renamed from: c  reason: collision with root package name */
    private final SurfaceTexture f55343c;

    f(MediaPlayerModule mediaPlayerModule, SurfaceTexture surfaceTexture) {
        this.f55342b = mediaPlayerModule;
        this.f55343c = surfaceTexture;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f55341a, false, 58694, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f55341a, false, 58694, new Class[]{i.class}, Object.class);
        }
        MediaPlayerModule mediaPlayerModule = this.f55342b;
        SurfaceTexture surfaceTexture = this.f55343c;
        if (iVar.d() || iVar.c() || ((Integer) iVar.e()).intValue() < 0) {
            return null;
        }
        Surface surface = new Surface(surfaceTexture);
        boolean a2 = mediaPlayerModule.f3566c.a(surface);
        surface.release();
        return Boolean.valueOf(a2);
    }
}
