package com.amap.api.services.nearby;

import android.content.Context;
import com.amap.api.services.a.aw;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.a.j;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.INearbySearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class NearbySearch {

    /* renamed from: a  reason: collision with root package name */
    private static NearbySearch f7074a;

    /* renamed from: b  reason: collision with root package name */
    private INearbySearch f7075b;

    public interface NearbyListener {
        void onNearbyInfoSearched(NearbySearchResult nearbySearchResult, int i);

        void onNearbyInfoUploaded(int i);

        void onUserInfoCleared(int i);
    }

    public static class NearbyQuery {

        /* renamed from: a  reason: collision with root package name */
        private LatLonPoint f7077a;

        /* renamed from: b  reason: collision with root package name */
        private NearbySearchFunctionType f7078b = NearbySearchFunctionType.DISTANCE_SEARCH;

        /* renamed from: c  reason: collision with root package name */
        private int f7079c = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;

        /* renamed from: d  reason: collision with root package name */
        private int f7080d = 1800;

        /* renamed from: e  reason: collision with root package name */
        private int f7081e = 1;

        public LatLonPoint getCenterPoint() {
            return this.f7077a;
        }

        public int getCoordType() {
            return this.f7081e;
        }

        public int getRadius() {
            return this.f7079c;
        }

        public int getTimeRange() {
            return this.f7080d;
        }

        public int getType() {
            switch (this.f7078b) {
                case DRIVING_DISTANCE_SEARCH:
                    return 1;
                default:
                    return 0;
            }
        }

        public void setCenterPoint(LatLonPoint latLonPoint) {
            this.f7077a = latLonPoint;
        }

        public void setType(NearbySearchFunctionType nearbySearchFunctionType) {
            this.f7078b = nearbySearchFunctionType;
        }

        public void setCoordType(int i) {
            if (i == 0 || i == 1) {
                this.f7081e = i;
            } else {
                this.f7081e = 1;
            }
        }

        public void setRadius(int i) {
            if (i > 10000) {
                i = 10000;
            }
            this.f7079c = i;
        }

        public void setTimeRange(int i) {
            if (i < 5) {
                i = 5;
            } else if (i > 86400) {
                i = 86400;
            }
            this.f7080d = i;
        }
    }

    private void a() {
        if (this.f7075b != null) {
            this.f7075b.destroy();
        }
        this.f7075b = null;
    }

    public void clearUserInfoAsyn() {
        if (this.f7075b != null) {
            this.f7075b.clearUserInfoAsyn();
        }
    }

    public synchronized void stopUploadNearbyInfoAuto() {
        if (this.f7075b != null) {
            this.f7075b.stopUploadNearbyInfoAuto();
        }
    }

    public static synchronized void destroy() {
        synchronized (NearbySearch.class) {
            if (f7074a != null) {
                try {
                    f7074a.a();
                } catch (Throwable th) {
                    j.a(th, "NearbySearch", "destryoy");
                }
            }
            f7074a = null;
        }
    }

    public synchronized void addNearbyListener(NearbyListener nearbyListener) {
        if (this.f7075b != null) {
            this.f7075b.addNearbyListener(nearbyListener);
        }
    }

    public synchronized void removeNearbyListener(NearbyListener nearbyListener) {
        if (this.f7075b != null) {
            this.f7075b.removeNearbyListener(nearbyListener);
        }
    }

    public NearbySearchResult searchNearbyInfo(NearbyQuery nearbyQuery) throws AMapException {
        if (this.f7075b != null) {
            return this.f7075b.searchNearbyInfo(nearbyQuery);
        }
        return null;
    }

    public void searchNearbyInfoAsyn(NearbyQuery nearbyQuery) {
        if (this.f7075b != null) {
            this.f7075b.searchNearbyInfoAsyn(nearbyQuery);
        }
    }

    public void setUserID(String str) {
        if (this.f7075b != null) {
            this.f7075b.setUserID(str);
        }
    }

    public void uploadNearbyInfoAsyn(UploadInfo uploadInfo) {
        if (this.f7075b != null) {
            this.f7075b.uploadNearbyInfoAsyn(uploadInfo);
        }
    }

    public static synchronized NearbySearch getInstance(Context context) {
        NearbySearch nearbySearch;
        synchronized (NearbySearch.class) {
            if (f7074a == null) {
                f7074a = new NearbySearch(context);
            }
            nearbySearch = f7074a;
        }
        return nearbySearch;
    }

    private NearbySearch(Context context) {
        try {
            Context context2 = context;
            this.f7075b = (INearbySearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.NearbySearchWrapper", aw.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7075b == null) {
            try {
                this.f7075b = new aw(context);
            } catch (Exception unused2) {
            }
        }
    }

    public synchronized void startUploadNearbyInfoAuto(UploadInfoCallback uploadInfoCallback, int i) {
        if (this.f7075b != null) {
            this.f7075b.startUploadNearbyInfoAuto(uploadInfoCallback, i);
        }
    }
}
