package com.amap.api.maps2d;

import android.os.RemoteException;
import com.amap.api.a.l;
import com.amap.api.mapcore2d.cm;

public final class UiSettings {

    /* renamed from: a  reason: collision with root package name */
    private final l f6328a;

    public final int getLogoPosition() {
        try {
            return this.f6328a.getLogoPosition();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "getLogoPosition");
            return 0;
        }
    }

    public final int getZoomPosition() {
        try {
            return this.f6328a.getZoomPosition();
        } catch (Throwable th) {
            cm.a(th, "UiSettings", "getZoomPosition");
            return 0;
        }
    }

    public final boolean isCompassEnabled() {
        try {
            return this.f6328a.isCompassEnabled();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "isCompassEnabled");
            return false;
        }
    }

    public final boolean isMyLocationButtonEnabled() {
        try {
            return this.f6328a.isMyLocationButtonEnabled();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "isMyLocationButtonEnabled");
            return false;
        }
    }

    public final boolean isScaleControlsEnabled() {
        try {
            return this.f6328a.isScaleControlsEnabled();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "isScaleControlsEnabled");
            return false;
        }
    }

    public final boolean isScrollGesturesEnabled() {
        try {
            return this.f6328a.isScrollGesturesEnabled();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "isScrollGestureEnabled");
            return false;
        }
    }

    public final boolean isZoomControlsEnabled() {
        try {
            return this.f6328a.isZoomControlsEnabled();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "isZoomControlsEnabled");
            return false;
        }
    }

    public final boolean isZoomGesturesEnabled() {
        try {
            return this.f6328a.isZoomGesturesEnabled();
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "isZoomGesturesEnabled");
            return false;
        }
    }

    public UiSettings(l lVar) {
        this.f6328a = lVar;
    }

    public final void setZoomInByScreenCenter(boolean z) {
        try {
            this.f6328a.setZoomInByScreenCenter(z);
        } catch (Throwable unused) {
        }
    }

    public final void setAllGesturesEnabled(boolean z) {
        try {
            this.f6328a.setAllGesturesEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setAllGesturesEnabled");
        }
    }

    public final void setCompassEnabled(boolean z) {
        try {
            this.f6328a.setCompassEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setCompassEnabled");
        }
    }

    public final void setLogoPosition(int i) {
        try {
            this.f6328a.setLogoPosition(i);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setLogoPosition");
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        try {
            this.f6328a.setMyLocationButtonEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setMyLocationButtonEnabled");
        }
    }

    public final void setScaleControlsEnabled(boolean z) {
        try {
            this.f6328a.setScaleControlsEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setScaleControlsEnabled");
        }
    }

    public final void setScrollGesturesEnabled(boolean z) {
        try {
            this.f6328a.setScrollGesturesEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setScrollGesturesEnabled");
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        try {
            this.f6328a.setZoomControlsEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setZoomControlsEnabled");
        }
    }

    public final void setZoomGesturesEnabled(boolean z) {
        try {
            this.f6328a.setZoomGesturesEnabled(z);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setZoomGesturesEnabled");
        }
    }

    public final void setZoomPosition(int i) {
        try {
            this.f6328a.setZoomPosition(i);
        } catch (RemoteException e2) {
            cm.a(e2, "UiSettings", "setZoomPosition");
        }
    }
}
