package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.amap.api.a.k;
import com.amap.api.maps2d.model.TileOverlayOptions;

public class bt implements ak {

    /* renamed from: a  reason: collision with root package name */
    private static int f5782a;

    /* renamed from: b  reason: collision with root package name */
    private bu f5783b;

    /* renamed from: c  reason: collision with root package name */
    private an f5784c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5785d;

    /* renamed from: e  reason: collision with root package name */
    private String f5786e;

    /* renamed from: f  reason: collision with root package name */
    private float f5787f;

    public void a(boolean z) {
    }

    public float getZIndex() {
        return this.f5787f;
    }

    public boolean isVisible() {
        return this.f5785d;
    }

    public void a() {
        this.f5784c.q.c();
    }

    public void b() {
        this.f5784c.q.d();
    }

    public void c() {
        this.f5784c.q.b();
    }

    public int hashCodeRemote() {
        return super.hashCode();
    }

    public void clearTileCache() {
        try {
            this.f5784c.b();
        } catch (Throwable th) {
            cm.a(th, "TileOverlayDelegateImp", "remove");
        }
    }

    public String getId() {
        if (this.f5786e == null) {
            this.f5786e = a("TileOverlay");
        }
        return this.f5786e;
    }

    public void remove() {
        try {
            this.f5783b.b(this);
            this.f5784c.b();
            this.f5784c.q.b();
        } catch (Throwable th) {
            cm.a(th, "TileOverlayDelegateImp", "remove");
        }
    }

    public void setZIndex(float f2) {
        this.f5787f = f2;
    }

    public void setVisible(boolean z) {
        this.f5785d = z;
        this.f5784c.a(z);
    }

    public void a(Canvas canvas) {
        this.f5784c.a(canvas);
    }

    private static String a(String str) {
        f5782a++;
        return str + f5782a;
    }

    public boolean equalsRemote(k kVar) {
        if (equals(kVar) || kVar.getId().equals(getId())) {
            return true;
        }
        return false;
    }

    public bt(TileOverlayOptions tileOverlayOptions, bu buVar, av avVar, az azVar, Context context) {
        this.f5783b = buVar;
        this.f5784c = new an(avVar);
        this.f5784c.f5601e = false;
        this.f5784c.g = false;
        this.f5784c.f5602f = tileOverlayOptions.getDiskCacheEnabled();
        this.f5784c.p = new bn<>();
        this.f5784c.k = tileOverlayOptions.getTileProvider();
        an anVar = this.f5784c;
        ba baVar = new ba(azVar.f5667e.f5673e, azVar.f5667e.f5674f, false, 0, this.f5784c);
        anVar.n = baVar;
        String diskCacheDir = tileOverlayOptions.getDiskCacheDir();
        if (TextUtils.isEmpty(diskCacheDir)) {
            this.f5784c.f5602f = false;
        }
        this.f5784c.m = diskCacheDir;
        this.f5784c.o = new u(buVar.getContext(), false, this.f5784c);
        this.f5784c.q = new bv(azVar, this.f5784c);
        this.f5784c.a(true);
        this.f5785d = tileOverlayOptions.isVisible();
        this.f5786e = getId();
        this.f5787f = tileOverlayOptions.getZIndex();
    }
}
