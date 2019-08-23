package com.amap.api.maps2d.model;

import com.amap.api.a.k;

public final class TileOverlay {

    /* renamed from: a  reason: collision with root package name */
    private k f6408a;

    public final void clearTileCache() {
        this.f6408a.clearTileCache();
    }

    public final String getId() {
        return this.f6408a.getId();
    }

    public final float getZIndex() {
        return this.f6408a.getZIndex();
    }

    public final int hashCode() {
        return this.f6408a.hashCodeRemote();
    }

    public final boolean isVisible() {
        return this.f6408a.isVisible();
    }

    public final void remove() {
        this.f6408a.remove();
    }

    public TileOverlay(k kVar) {
        this.f6408a = kVar;
    }

    public final void setVisible(boolean z) {
        this.f6408a.setVisible(z);
    }

    public final void setZIndex(float f2) {
        this.f6408a.setZIndex(f2);
    }

    public final boolean equals(Object obj) {
        return this.f6408a.equalsRemote(this.f6408a);
    }
}
