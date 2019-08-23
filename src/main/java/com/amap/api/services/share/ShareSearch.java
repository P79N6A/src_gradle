package com.amap.api.services.share;

import android.content.Context;
import com.amap.api.services.a.ba;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IShareSearch;

public class ShareSearch {

    /* renamed from: a  reason: collision with root package name */
    private IShareSearch f7294a;

    public interface OnShareSearchListener {
        void onBusRouteShareUrlSearched(String str, int i);

        void onDrivingRouteShareUrlSearched(String str, int i);

        void onLocationShareUrlSearched(String str, int i);

        void onNaviShareUrlSearched(String str, int i);

        void onPoiShareUrlSearched(String str, int i);

        void onWalkRouteShareUrlSearched(String str, int i);
    }

    public static class ShareBusRouteQuery {

        /* renamed from: a  reason: collision with root package name */
        private ShareFromAndTo f7295a;

        /* renamed from: b  reason: collision with root package name */
        private int f7296b;

        public int getBusMode() {
            return this.f7296b;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f7295a;
        }

        public ShareBusRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f7295a = shareFromAndTo;
            this.f7296b = i;
        }
    }

    public static class ShareDrivingRouteQuery {

        /* renamed from: a  reason: collision with root package name */
        private ShareFromAndTo f7297a;

        /* renamed from: b  reason: collision with root package name */
        private int f7298b;

        public int getDrivingMode() {
            return this.f7298b;
        }

        public ShareFromAndTo getShareFromAndTo() {
            return this.f7297a;
        }

        public ShareDrivingRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f7297a = shareFromAndTo;
            this.f7298b = i;
        }
    }

    public static class ShareFromAndTo {

        /* renamed from: a  reason: collision with root package name */
        private LatLonPoint f7299a;

        /* renamed from: b  reason: collision with root package name */
        private LatLonPoint f7300b;

        /* renamed from: c  reason: collision with root package name */
        private String f7301c = "起点";

        /* renamed from: d  reason: collision with root package name */
        private String f7302d = "终点";

        public LatLonPoint getFrom() {
            return this.f7299a;
        }

        public String getFromName() {
            return this.f7301c;
        }

        public LatLonPoint getTo() {
            return this.f7300b;
        }

        public String getToName() {
            return this.f7302d;
        }

        public void setFromName(String str) {
            this.f7301c = str;
        }

        public void setToName(String str) {
            this.f7302d = str;
        }

        public ShareFromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f7299a = latLonPoint;
            this.f7300b = latLonPoint2;
        }
    }

    public static class ShareNaviQuery {

        /* renamed from: a  reason: collision with root package name */
        private ShareFromAndTo f7303a;

        /* renamed from: b  reason: collision with root package name */
        private int f7304b;

        public ShareFromAndTo getFromAndTo() {
            return this.f7303a;
        }

        public int getNaviMode() {
            return this.f7304b;
        }

        public ShareNaviQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f7303a = shareFromAndTo;
            this.f7304b = i;
        }
    }

    public static class ShareWalkRouteQuery {

        /* renamed from: a  reason: collision with root package name */
        private ShareFromAndTo f7305a;

        /* renamed from: b  reason: collision with root package name */
        private int f7306b;

        public ShareFromAndTo getShareFromAndTo() {
            return this.f7305a;
        }

        public int getWalkMode() {
            return this.f7306b;
        }

        public ShareWalkRouteQuery(ShareFromAndTo shareFromAndTo, int i) {
            this.f7305a = shareFromAndTo;
            this.f7306b = i;
        }
    }

    public String searchBusRouteShareUrl(ShareBusRouteQuery shareBusRouteQuery) throws AMapException {
        if (this.f7294a != null) {
            this.f7294a.searchBusRouteShareUrl(shareBusRouteQuery);
        }
        return null;
    }

    public void searchBusRouteShareUrlAsyn(ShareBusRouteQuery shareBusRouteQuery) {
        if (this.f7294a != null) {
            this.f7294a.searchBusRouteShareUrlAsyn(shareBusRouteQuery);
        }
    }

    public String searchDrivingRouteShareUrl(ShareDrivingRouteQuery shareDrivingRouteQuery) throws AMapException {
        if (this.f7294a != null) {
            this.f7294a.searchDrivingRouteShareUrl(shareDrivingRouteQuery);
        }
        return null;
    }

    public void searchDrivingRouteShareUrlAsyn(ShareDrivingRouteQuery shareDrivingRouteQuery) {
        if (this.f7294a != null) {
            this.f7294a.searchDrivingRouteShareUrlAsyn(shareDrivingRouteQuery);
        }
    }

    public String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) throws AMapException {
        if (this.f7294a != null) {
            this.f7294a.searchLocationShareUrl(latLonSharePoint);
        }
        return null;
    }

    public void searchLocationShareUrlAsyn(LatLonSharePoint latLonSharePoint) {
        if (this.f7294a != null) {
            this.f7294a.searchLocationShareUrlAsyn(latLonSharePoint);
        }
    }

    public String searchNaviShareUrl(ShareNaviQuery shareNaviQuery) throws AMapException {
        if (this.f7294a != null) {
            this.f7294a.searchNaviShareUrl(shareNaviQuery);
        }
        return null;
    }

    public void searchNaviShareUrlAsyn(ShareNaviQuery shareNaviQuery) {
        if (this.f7294a != null) {
            this.f7294a.searchNaviShareUrlAsyn(shareNaviQuery);
        }
    }

    public String searchPoiShareUrl(PoiItem poiItem) throws AMapException {
        if (this.f7294a != null) {
            this.f7294a.searchPoiShareUrl(poiItem);
        }
        return null;
    }

    public void searchPoiShareUrlAsyn(PoiItem poiItem) {
        if (this.f7294a != null) {
            this.f7294a.searchPoiShareUrlAsyn(poiItem);
        }
    }

    public String searchWalkRouteShareUrl(ShareWalkRouteQuery shareWalkRouteQuery) throws AMapException {
        if (this.f7294a != null) {
            this.f7294a.searchWalkRouteShareUrl(shareWalkRouteQuery);
        }
        return null;
    }

    public void searchWalkRouteShareUrlAsyn(ShareWalkRouteQuery shareWalkRouteQuery) {
        if (this.f7294a != null) {
            this.f7294a.searchWalkRouteShareUrlAsyn(shareWalkRouteQuery);
        }
    }

    public void setOnShareSearchListener(OnShareSearchListener onShareSearchListener) {
        if (this.f7294a != null) {
            this.f7294a.setOnShareSearchListener(onShareSearchListener);
        }
    }

    public ShareSearch(Context context) {
        try {
            Context context2 = context;
            this.f7294a = (IShareSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.ShareSearchWrapper", ba.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7294a == null) {
            try {
                this.f7294a = new ba(context);
            } catch (Exception unused2) {
            }
        }
    }
}
