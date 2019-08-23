package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.a.g;
import com.amap.api.mapcore2d.af;
import com.amap.api.mapcore2d.cm;
import java.util.List;

public final class Polygon {

    /* renamed from: a  reason: collision with root package name */
    private g f6378a;

    public final int getFillColor() {
        try {
            if (this.f6378a == null) {
                return 0;
            }
            return this.f6378a.getFillColor();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "getFillColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final String getId() {
        try {
            if (this.f6378a == null) {
                return null;
            }
            return this.f6378a.getId();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "getId");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final List<LatLng> getPoints() {
        try {
            if (this.f6378a == null) {
                return null;
            }
            return this.f6378a.getPoints();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "getPoints");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int getStrokeColor() {
        try {
            if (this.f6378a == null) {
                return 0;
            }
            return this.f6378a.getStrokeColor();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "getStrokeColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getStrokeWidth() {
        try {
            if (this.f6378a == null) {
                return 0.0f;
            }
            return this.f6378a.getStrokeWidth();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "getStrokeWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getZIndex() {
        try {
            if (this.f6378a == null) {
                return 0.0f;
            }
            return this.f6378a.getZIndex();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "getZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int hashCode() {
        try {
            if (this.f6378a == null) {
                return 0;
            }
            return this.f6378a.hashCodeRemote();
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "hashCode");
            return super.hashCode();
        }
    }

    public final boolean isVisible() {
        try {
            if (this.f6378a == null) {
                return true;
            }
            return this.f6378a.isVisible();
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void remove() {
        try {
            if (this.f6378a != null) {
                this.f6378a.remove();
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "remove");
            throw new RuntimeRemoteException(e2);
        }
    }

    public Polygon(af afVar) {
        this.f6378a = afVar;
    }

    public final boolean contains(LatLng latLng) {
        try {
            if (this.f6378a == null) {
                return false;
            }
            return this.f6378a.contains(latLng);
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "contains");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            if (this.f6378a == null) {
                return false;
            }
            return this.f6378a.equalsRemote(((Polygon) obj).f6378a);
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "equeals");
            return false;
        }
    }

    public final void setFillColor(int i) {
        try {
            if (this.f6378a != null) {
                this.f6378a.setFillColor(i);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "setFillColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setPoints(List<LatLng> list) {
        try {
            if (this.f6378a != null) {
                this.f6378a.setPoints(list);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "setPoints");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeColor(int i) {
        try {
            if (this.f6378a != null) {
                this.f6378a.setStrokeColor(i);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "setStrokeColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeWidth(float f2) {
        try {
            if (this.f6378a != null) {
                this.f6378a.setStrokeWidth(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "setStrokeWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setVisible(boolean z) {
        try {
            if (this.f6378a != null) {
                this.f6378a.setVisible(z);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "setVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setZIndex(float f2) {
        try {
            if (this.f6378a != null) {
                this.f6378a.setZIndex(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polygon", "setZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }
}
