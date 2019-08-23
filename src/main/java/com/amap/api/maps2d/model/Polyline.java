package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.a.h;
import com.amap.api.mapcore2d.cm;
import java.util.List;

public class Polyline {

    /* renamed from: a  reason: collision with root package name */
    private final h f6385a;

    public boolean isDottedLine() {
        if (this.f6385a == null) {
            return false;
        }
        return this.f6385a.isDottedLine();
    }

    public boolean isGeodesic() {
        if (this.f6385a == null) {
            return false;
        }
        return this.f6385a.isGeodesic();
    }

    public int getColor() {
        try {
            if (this.f6385a == null) {
                return 0;
            }
            return this.f6385a.getColor();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "getColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public String getId() {
        try {
            if (this.f6385a == null) {
                return "";
            }
            return this.f6385a.getId();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "getId");
            throw new RuntimeRemoteException(e2);
        }
    }

    public List<LatLng> getPoints() {
        try {
            if (this.f6385a == null) {
                return null;
            }
            return this.f6385a.getPoints();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "getPoints");
            throw new RuntimeRemoteException(e2);
        }
    }

    public float getWidth() {
        try {
            if (this.f6385a == null) {
                return 0.0f;
            }
            return this.f6385a.getWidth();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "getWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public float getZIndex() {
        try {
            if (this.f6385a == null) {
                return 0.0f;
            }
            return this.f6385a.getZIndex();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "getZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public int hashCode() {
        try {
            if (this.f6385a == null) {
                return 0;
            }
            return this.f6385a.hashCodeRemote();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "hashCode");
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean isVisible() {
        try {
            if (this.f6385a == null) {
                return false;
            }
            return this.f6385a.isVisible();
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "isVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void remove() {
        try {
            if (this.f6385a != null) {
                this.f6385a.remove();
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "remove");
            throw new RuntimeRemoteException(e2);
        }
    }

    public Polyline(h hVar) {
        this.f6385a = hVar;
    }

    public void setDottedLine(boolean z) {
        if (this.f6385a != null) {
            this.f6385a.setDottedLine(z);
        }
    }

    public void setColor(int i) {
        try {
            if (this.f6385a != null) {
                this.f6385a.setColor(i);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "setColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setPoints(List<LatLng> list) {
        try {
            if (this.f6385a != null) {
                this.f6385a.setPoints(list);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "setPoints");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setVisible(boolean z) {
        try {
            if (this.f6385a != null) {
                this.f6385a.setVisible(z);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "setVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setWidth(float f2) {
        try {
            if (this.f6385a != null) {
                this.f6385a.setWidth(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "setWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setZIndex(float f2) {
        try {
            if (this.f6385a != null) {
                this.f6385a.setZIndex(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "setZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            if (this.f6385a == null) {
                return false;
            }
            return this.f6385a.equalsRemote(((Polyline) obj).f6385a);
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "equals");
            throw new RuntimeRemoteException(e2);
        }
    }

    public void setGeodesic(boolean z) {
        try {
            if (!(this.f6385a == null || this.f6385a.isGeodesic() == z)) {
                List<LatLng> points = getPoints();
                this.f6385a.setGeodesic(z);
                setPoints(points);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Polyline", "setGeodesic");
            throw new RuntimeRemoteException(e2);
        }
    }
}
