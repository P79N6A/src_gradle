package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.mapcore2d.aa;
import com.amap.api.mapcore2d.cm;

public final class GroundOverlay {

    /* renamed from: a  reason: collision with root package name */
    private aa f6344a;

    public final int hashCode() {
        if (this.f6344a == null) {
            return 0;
        }
        return this.f6344a.hashCode();
    }

    public final float getBearing() {
        try {
            if (this.f6344a == null) {
                return 0.0f;
            }
            return this.f6344a.getBearing();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getBearing");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final LatLngBounds getBounds() {
        try {
            if (this.f6344a == null) {
                return null;
            }
            return this.f6344a.getBounds();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getBounds");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getHeight() {
        try {
            if (this.f6344a == null) {
                return 0.0f;
            }
            return this.f6344a.getHeight();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getHeight");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final String getId() {
        try {
            if (this.f6344a == null) {
                return "";
            }
            return this.f6344a.getId();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getId");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final LatLng getPosition() {
        try {
            if (this.f6344a == null) {
                return null;
            }
            return this.f6344a.getPosition();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getPosition");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getTransparency() {
        try {
            if (this.f6344a == null) {
                return 0.0f;
            }
            return this.f6344a.getTransparency();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getTransparency");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getWidth() {
        try {
            if (this.f6344a == null) {
                return 0.0f;
            }
            return this.f6344a.getWidth();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getZIndex() {
        try {
            if (this.f6344a == null) {
                return 0.0f;
            }
            return this.f6344a.getZIndex();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "getZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isVisible() {
        try {
            if (this.f6344a == null) {
                return false;
            }
            return this.f6344a.isVisible();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "isVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void remove() {
        try {
            if (this.f6344a != null) {
                this.f6344a.remove();
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "remove");
            throw new RuntimeRemoteException(e2);
        }
    }

    public GroundOverlay(aa aaVar) {
        this.f6344a = aaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            throw new RemoteException();
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "equals");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setBearing(float f2) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setBearing(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setBearing");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setDimensions(float f2) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setDimensions(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setDimensions");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setImage(bitmapDescriptor);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setImage");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setPosition(LatLng latLng) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setPosition(latLng);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setPosition");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setPositionFromBounds(latLngBounds);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setPositionFromBounds");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setTransparency(float f2) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setTransparency(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setTransparency");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setVisible(boolean z) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setVisible(z);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setZIndex(float f2) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setZIndex(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setDimensions(float f2, float f3) {
        try {
            if (this.f6344a != null) {
                this.f6344a.setDimensions(f2, f3);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "GroundOverlay", "setDimensions");
            throw new RuntimeRemoteException(e2);
        }
    }
}
