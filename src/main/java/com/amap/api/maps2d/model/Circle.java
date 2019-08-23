package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.amap.api.a.b;
import com.amap.api.mapcore2d.cm;

public final class Circle {

    /* renamed from: a  reason: collision with root package name */
    private final b f6337a;

    public final LatLng getCenter() {
        try {
            if (this.f6337a == null) {
                return null;
            }
            return this.f6337a.getCenter();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getCenter");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int getFillColor() {
        try {
            if (this.f6337a == null) {
                return 0;
            }
            return this.f6337a.getFillColor();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getFillColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final String getId() {
        try {
            if (this.f6337a == null) {
                return "";
            }
            return this.f6337a.getId();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getId");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final double getRadius() {
        try {
            if (this.f6337a == null) {
                return 0.0d;
            }
            return this.f6337a.getRadius();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getRadius");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int getStrokeColor() {
        try {
            if (this.f6337a == null) {
                return 0;
            }
            return this.f6337a.getStrokeColor();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getStrokeColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getStrokeWidth() {
        try {
            if (this.f6337a == null) {
                return 0.0f;
            }
            return this.f6337a.getStrokeWidth();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getStrokeWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final float getZIndex() {
        try {
            if (this.f6337a == null) {
                return 0.0f;
            }
            return this.f6337a.getZIndex();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "getZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final int hashCode() {
        try {
            if (this.f6337a == null) {
                return 0;
            }
            return this.f6337a.hashCodeRemote();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "hashCode");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isVisible() {
        try {
            if (this.f6337a == null) {
                return false;
            }
            return this.f6337a.isVisible();
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "isVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void remove() {
        try {
            if (this.f6337a != null) {
                this.f6337a.remove();
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "remove");
            throw new RuntimeRemoteException(e2);
        }
    }

    public Circle(b bVar) {
        this.f6337a = bVar;
    }

    public final boolean contains(LatLng latLng) {
        try {
            if (this.f6337a != null) {
                if (latLng != null) {
                    return this.f6337a.contains(latLng);
                }
            }
            return false;
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "contains");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setCenter(LatLng latLng) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setCenter(latLng);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setCenter");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setFillColor(int i) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setFillColor(i);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setFillColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setRadius(double d2) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setRadius(d2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setRadius");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeColor(int i) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setStrokeColor(i);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setStrokeColor");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setStrokeWidth(float f2) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setStrokeWidth(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setStrokeWidth");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setVisible(boolean z) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setVisible(z);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setVisible");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final void setZIndex(float f2) {
        try {
            if (this.f6337a != null) {
                this.f6337a.setZIndex(f2);
            }
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "setZIndex");
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            if (this.f6337a == null) {
                return false;
            }
            return this.f6337a.equalsRemote(((Circle) obj).f6337a);
        } catch (RemoteException e2) {
            cm.a(e2, "Circle", "equals");
            throw new RuntimeRemoteException(e2);
        }
    }
}
