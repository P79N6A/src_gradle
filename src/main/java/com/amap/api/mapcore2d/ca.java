package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.RemoteException;

public class ca implements al {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public y f5809a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5810b = true;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f5811c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5812d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f5813e = true;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f5814f = true;
    /* access modifiers changed from: private */
    public boolean g;
    private int h;
    private int i;
    private final Handler j = new Handler() {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r3) {
            /*
                r2 = this;
                if (r3 == 0) goto L_0x005b
                com.amap.api.mapcore2d.ca r0 = com.amap.api.mapcore2d.ca.this
                com.amap.api.mapcore2d.y r0 = r0.f5809a
                if (r0 != 0) goto L_0x000b
                goto L_0x005b
            L_0x000b:
                int r3 = r3.what     // Catch:{ Throwable -> 0x0052 }
                switch(r3) {
                    case 0: goto L_0x0041;
                    case 1: goto L_0x0031;
                    case 2: goto L_0x0021;
                    case 3: goto L_0x0011;
                    default: goto L_0x0010;
                }     // Catch:{ Throwable -> 0x0052 }
            L_0x0010:
                goto L_0x0051
            L_0x0011:
                com.amap.api.mapcore2d.ca r3 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.y r3 = r3.f5809a     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.ca r0 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                boolean r0 = r0.f5811c     // Catch:{ Throwable -> 0x0052 }
                r3.showMyLocationButtonEnabled(r0)     // Catch:{ Throwable -> 0x0052 }
                goto L_0x0051
            L_0x0021:
                com.amap.api.mapcore2d.ca r3 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.y r3 = r3.f5809a     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.ca r0 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                boolean r0 = r0.f5814f     // Catch:{ Throwable -> 0x0052 }
                r3.showCompassEnabled(r0)     // Catch:{ Throwable -> 0x0052 }
                goto L_0x005a
            L_0x0031:
                com.amap.api.mapcore2d.ca r3 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.y r3 = r3.f5809a     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.ca r0 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                boolean r0 = r0.g     // Catch:{ Throwable -> 0x0052 }
                r3.showScaleEnabled(r0)     // Catch:{ Throwable -> 0x0052 }
                goto L_0x005a
            L_0x0041:
                com.amap.api.mapcore2d.ca r3 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.y r3 = r3.f5809a     // Catch:{ Throwable -> 0x0052 }
                com.amap.api.mapcore2d.ca r0 = com.amap.api.mapcore2d.ca.this     // Catch:{ Throwable -> 0x0052 }
                boolean r0 = r0.f5813e     // Catch:{ Throwable -> 0x0052 }
                r3.showZoomControlsEnabled(r0)     // Catch:{ Throwable -> 0x0052 }
                goto L_0x005a
            L_0x0051:
                return
            L_0x0052:
                r3 = move-exception
                java.lang.String r0 = "UiSettingsDelegateImp"
                java.lang.String r1 = "handle_handleMessage"
                com.amap.api.mapcore2d.cm.a(r3, r0, r1)
            L_0x005a:
                return
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.ca.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };
    private boolean k;

    public int getLogoPosition() throws RemoteException {
        return this.h;
    }

    public int getZoomPosition() throws RemoteException {
        return this.i;
    }

    public boolean isCompassEnabled() throws RemoteException {
        return this.f5814f;
    }

    public boolean isMyLocationButtonEnabled() throws RemoteException {
        return this.f5811c;
    }

    public boolean isScaleControlsEnabled() throws RemoteException {
        return this.g;
    }

    public boolean isScrollGesturesEnabled() throws RemoteException {
        return this.f5810b;
    }

    public boolean isZoomControlsEnabled() throws RemoteException {
        return this.f5813e;
    }

    public boolean isZoomGesturesEnabled() throws RemoteException {
        return this.f5812d;
    }

    public boolean isZoomInByScreenCenter() {
        return this.k;
    }

    public void setScrollGesturesEnabled(boolean z) throws RemoteException {
        this.f5810b = z;
    }

    public void setZoomGesturesEnabled(boolean z) throws RemoteException {
        this.f5812d = z;
    }

    public void setZoomInByScreenCenter(boolean z) {
        this.k = z;
    }

    public void setAllGesturesEnabled(boolean z) throws RemoteException {
        setZoomGesturesEnabled(z);
        setScrollGesturesEnabled(z);
    }

    public void setLogoPosition(int i2) throws RemoteException {
        this.h = i2;
        this.f5809a.setLogoPosition(i2);
    }

    public void setZoomPosition(int i2) throws RemoteException {
        this.i = i2;
        this.f5809a.setZoomPosition(i2);
    }

    public void setCompassEnabled(boolean z) throws RemoteException {
        this.f5814f = z;
        this.j.obtainMessage(2).sendToTarget();
    }

    public void setMyLocationButtonEnabled(boolean z) throws RemoteException {
        this.f5811c = z;
        this.j.obtainMessage(3).sendToTarget();
    }

    public void setScaleControlsEnabled(boolean z) throws RemoteException {
        this.g = z;
        this.j.obtainMessage(1).sendToTarget();
    }

    public void setZoomControlsEnabled(boolean z) throws RemoteException {
        this.f5813e = z;
        this.j.obtainMessage(0).sendToTarget();
    }

    ca(y yVar) {
        this.f5809a = yVar;
    }
}
