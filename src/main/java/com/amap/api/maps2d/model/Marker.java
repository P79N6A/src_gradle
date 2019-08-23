package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.a.e;
import com.amap.api.mapcore2d.cm;
import java.util.ArrayList;

public final class Marker {

    /* renamed from: a  reason: collision with root package name */
    e f6357a;

    public final String getId() {
        if (this.f6357a == null) {
            return null;
        }
        return this.f6357a.getId();
    }

    public final Object getObject() {
        if (this.f6357a != null) {
            return this.f6357a.getObject();
        }
        return null;
    }

    public final LatLng getPosition() {
        if (this.f6357a == null) {
            return null;
        }
        return this.f6357a.getPosition();
    }

    public final String getSnippet() {
        if (this.f6357a == null) {
            return null;
        }
        return this.f6357a.getSnippet();
    }

    public final String getTitle() {
        if (this.f6357a == null) {
            return null;
        }
        return this.f6357a.getTitle();
    }

    public final float getZIndex() {
        if (this.f6357a == null) {
            return 0.0f;
        }
        return this.f6357a.getZIndex();
    }

    public final int hashCode() {
        if (this.f6357a == null) {
            return super.hashCode();
        }
        return this.f6357a.hashCodeRemote();
    }

    public final void hideInfoWindow() {
        if (this.f6357a != null) {
            this.f6357a.hideInfoWindow();
        }
    }

    public final boolean isDraggable() {
        if (this.f6357a == null) {
            return false;
        }
        return this.f6357a.isDraggable();
    }

    public final boolean isInfoWindowShown() {
        if (this.f6357a == null) {
            return false;
        }
        return this.f6357a.isInfoWindowShown();
    }

    public final boolean isVisible() {
        if (this.f6357a == null) {
            return false;
        }
        return this.f6357a.isVisible();
    }

    public final void showInfoWindow() {
        if (this.f6357a != null) {
            this.f6357a.showInfoWindow();
        }
    }

    public final void destroy() {
        try {
            if (this.f6357a != null) {
                this.f6357a.destroy();
            }
        } catch (Exception e2) {
            cm.a(e2, "Marker", "destroy");
        }
    }

    public final ArrayList<BitmapDescriptor> getIcons() {
        try {
            return this.f6357a.getIcons();
        } catch (RemoteException e2) {
            cm.a(e2, "Marker", "getIcons");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int getPeriod() {
        try {
            return this.f6357a.getPeriod();
        } catch (RemoteException e2) {
            cm.a(e2, "Marker", "getPeriod");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void remove() {
        try {
            if (this.f6357a != null) {
                this.f6357a.remove();
            }
        } catch (Exception e2) {
            cm.a(e2, "Marker", "remove");
        }
    }

    public Marker(MarkerOptions markerOptions) {
    }

    public Marker(e eVar) {
        this.f6357a = eVar;
    }

    public final void setDraggable(boolean z) {
        if (this.f6357a != null) {
            this.f6357a.setDraggable(z);
        }
    }

    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (this.f6357a != null && bitmapDescriptor != null) {
            this.f6357a.setIcon(bitmapDescriptor);
        }
    }

    public final void setObject(Object obj) {
        if (this.f6357a != null) {
            this.f6357a.setObject(obj);
        }
    }

    public final void setPosition(LatLng latLng) {
        if (this.f6357a != null) {
            this.f6357a.setPosition(latLng);
        }
    }

    public final void setSnippet(String str) {
        if (this.f6357a != null) {
            this.f6357a.setSnippet(str);
        }
    }

    public final void setTitle(String str) {
        if (this.f6357a != null) {
            this.f6357a.setTitle(str);
        }
    }

    public final void setVisible(boolean z) {
        if (this.f6357a != null) {
            this.f6357a.setVisible(z);
        }
    }

    public final void setZIndex(float f2) {
        if (this.f6357a != null) {
            this.f6357a.setZIndex(f2);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Marker) && this.f6357a != null) {
            return this.f6357a.equalsRemote(((Marker) obj).f6357a);
        }
        return false;
    }

    public final void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        try {
            this.f6357a.setIcons(arrayList);
        } catch (RemoteException e2) {
            cm.a(e2, "Marker", "setIcons");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setPeriod(int i) {
        try {
            if (this.f6357a != null) {
                this.f6357a.setPeriod(i);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Marker", "setPeriod");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setRotateAngle(float f2) {
        try {
            this.f6357a.setRotateAngle(f2);
        } catch (RemoteException e2) {
            cm.a(e2, "Marker", "setRotateAngle");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setAnchor(float f2, float f3) {
        if (this.f6357a != null) {
            this.f6357a.setAnchor(f2, f3);
        }
    }

    public final void setPositionByPixels(int i, int i2) {
        try {
            if (this.f6357a != null) {
                this.f6357a.setPositionByPixels(i, i2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Marker", "setPositionByPixels");
        }
    }
}
