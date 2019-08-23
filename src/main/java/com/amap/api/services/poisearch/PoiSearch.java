package com.amap.api.services.poisearch;

import android.content.Context;
import com.amap.api.services.a.ax;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.a.j;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public class PoiSearch {

    /* renamed from: a  reason: collision with root package name */
    private IPoiSearch f7101a;

    public interface OnPoiSearchListener {
        void onPoiItemSearched(PoiItem poiItem, int i);

        void onPoiSearched(PoiResult poiResult, int i);
    }

    public static class Query implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        private String f7102a;

        /* renamed from: b  reason: collision with root package name */
        private String f7103b;

        /* renamed from: c  reason: collision with root package name */
        private String f7104c;

        /* renamed from: d  reason: collision with root package name */
        private int f7105d;

        /* renamed from: e  reason: collision with root package name */
        private int f7106e;

        /* renamed from: f  reason: collision with root package name */
        private String f7107f;
        private boolean g;
        private boolean h;
        private String i;
        private boolean j;
        private LatLonPoint k;

        private String a() {
            return "";
        }

        public String getBuilding() {
            return this.i;
        }

        public String getCity() {
            return this.f7104c;
        }

        public boolean getCityLimit() {
            return this.g;
        }

        public LatLonPoint getLocation() {
            return this.k;
        }

        public int getPageNum() {
            return this.f7105d;
        }

        public int getPageSize() {
            return this.f7106e;
        }

        /* access modifiers changed from: protected */
        public String getQueryLanguage() {
            return this.f7107f;
        }

        public String getQueryString() {
            return this.f7102a;
        }

        public boolean isDistanceSort() {
            return this.j;
        }

        public boolean isRequireSubPois() {
            return this.h;
        }

        public Query clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "PoiSearch", "queryclone");
            }
            Query query = new Query(this.f7102a, this.f7103b, this.f7104c);
            query.setPageNum(this.f7105d);
            query.setPageSize(this.f7106e);
            query.setQueryLanguage(this.f7107f);
            query.setCityLimit(this.g);
            query.requireSubPois(this.h);
            query.setBuilding(this.i);
            query.setLocation(this.k);
            query.setDistanceSort(this.j);
            return query;
        }

        public String getCategory() {
            if (this.f7103b == null || this.f7103b.equals("00") || this.f7103b.equals("00|")) {
                return a();
            }
            return this.f7103b;
        }

        public int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (this.f7103b == null) {
                i2 = 0;
            } else {
                i2 = this.f7103b.hashCode();
            }
            int i8 = (i2 + 31) * 31;
            if (this.f7104c == null) {
                i3 = 0;
            } else {
                i3 = this.f7104c.hashCode();
            }
            int i9 = (i8 + i3) * 31;
            int i10 = 1237;
            if (this.g) {
                i4 = 1231;
            } else {
                i4 = 1237;
            }
            int i11 = (i9 + i4) * 31;
            if (this.h) {
                i10 = 1231;
            }
            int i12 = (i11 + i10) * 31;
            if (this.f7107f == null) {
                i5 = 0;
            } else {
                i5 = this.f7107f.hashCode();
            }
            int i13 = (((((i12 + i5) * 31) + this.f7105d) * 31) + this.f7106e) * 31;
            if (this.f7102a == null) {
                i6 = 0;
            } else {
                i6 = this.f7102a.hashCode();
            }
            int i14 = (i13 + i6) * 31;
            if (this.i != null) {
                i7 = this.i.hashCode();
            }
            return i14 + i7;
        }

        public void requireSubPois(boolean z) {
            this.h = z;
        }

        public void setBuilding(String str) {
            this.i = str;
        }

        public void setCityLimit(boolean z) {
            this.g = z;
        }

        public void setDistanceSort(boolean z) {
            this.j = z;
        }

        public void setLocation(LatLonPoint latLonPoint) {
            this.k = latLonPoint;
        }

        public void setPageNum(int i2) {
            if (i2 <= 0) {
                i2 = 1;
            }
            this.f7105d = i2;
        }

        public void setPageSize(int i2) {
            if (i2 <= 0) {
                this.f7106e = 20;
            } else if (i2 > 30) {
                this.f7106e = 30;
            } else {
                this.f7106e = i2;
            }
        }

        public void setQueryLanguage(String str) {
            if ("en".equals(str)) {
                this.f7107f = "en";
            } else {
                this.f7107f = "zh-CN";
            }
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            if (!PoiSearch.b(query.f7102a, this.f7102a) || !PoiSearch.b(query.f7103b, this.f7103b) || !PoiSearch.b(query.f7107f, this.f7107f) || !PoiSearch.b(query.f7104c, this.f7104c) || query.g != this.g || query.i != this.i || query.f7106e != this.f7106e || query.j != this.j) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Query query = (Query) obj;
            if (this.f7103b == null) {
                if (query.f7103b != null) {
                    return false;
                }
            } else if (!this.f7103b.equals(query.f7103b)) {
                return false;
            }
            if (this.f7104c == null) {
                if (query.f7104c != null) {
                    return false;
                }
            } else if (!this.f7104c.equals(query.f7104c)) {
                return false;
            }
            if (this.f7107f == null) {
                if (query.f7107f != null) {
                    return false;
                }
            } else if (!this.f7107f.equals(query.f7107f)) {
                return false;
            }
            if (this.f7105d != query.f7105d || this.f7106e != query.f7106e) {
                return false;
            }
            if (this.f7102a == null) {
                if (query.f7102a != null) {
                    return false;
                }
            } else if (!this.f7102a.equals(query.f7102a)) {
                return false;
            }
            if (this.i == null) {
                if (query.i != null) {
                    return false;
                }
            } else if (!this.i.equals(query.i)) {
                return false;
            }
            if (this.g == query.g && this.h == query.h) {
                return true;
            }
            return false;
        }

        public Query(String str, String str2) {
            this(str, str2, null);
        }

        public Query(String str, String str2, String str3) {
            this.f7105d = 1;
            this.f7106e = 20;
            this.f7107f = "zh-CN";
            this.j = true;
            this.f7102a = str;
            this.f7103b = str2;
            this.f7104c = str3;
        }
    }

    public static class SearchBound implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        private LatLonPoint f7108a;

        /* renamed from: b  reason: collision with root package name */
        private LatLonPoint f7109b;

        /* renamed from: c  reason: collision with root package name */
        private int f7110c;

        /* renamed from: d  reason: collision with root package name */
        private LatLonPoint f7111d;

        /* renamed from: e  reason: collision with root package name */
        private String f7112e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f7113f;
        private List<LatLonPoint> g;

        public LatLonPoint getCenter() {
            return this.f7111d;
        }

        public LatLonPoint getLowerLeft() {
            return this.f7108a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.g;
        }

        public int getRange() {
            return this.f7110c;
        }

        public String getShape() {
            return this.f7112e;
        }

        public LatLonPoint getUpperRight() {
            return this.f7109b;
        }

        public boolean isDistanceSort() {
            return this.f7113f;
        }

        public SearchBound clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e2) {
                j.a(e2, "PoiSearch", "SearchBoundClone");
            }
            SearchBound searchBound = new SearchBound(this.f7108a, this.f7109b, this.f7110c, this.f7111d, this.f7112e, this.g, this.f7113f);
            return searchBound;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (this.f7111d == null) {
                i = 0;
            } else {
                i = this.f7111d.hashCode();
            }
            int i7 = (i + 31) * 31;
            if (this.f7113f) {
                i2 = 1231;
            } else {
                i2 = 1237;
            }
            int i8 = (i7 + i2) * 31;
            if (this.f7108a == null) {
                i3 = 0;
            } else {
                i3 = this.f7108a.hashCode();
            }
            int i9 = (i8 + i3) * 31;
            if (this.f7109b == null) {
                i4 = 0;
            } else {
                i4 = this.f7109b.hashCode();
            }
            int i10 = (i9 + i4) * 31;
            if (this.g == null) {
                i5 = 0;
            } else {
                i5 = this.g.hashCode();
            }
            int i11 = (((i10 + i5) * 31) + this.f7110c) * 31;
            if (this.f7112e != null) {
                i6 = this.f7112e.hashCode();
            }
            return i11 + i6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SearchBound searchBound = (SearchBound) obj;
            if (this.f7111d == null) {
                if (searchBound.f7111d != null) {
                    return false;
                }
            } else if (!this.f7111d.equals(searchBound.f7111d)) {
                return false;
            }
            if (this.f7113f != searchBound.f7113f) {
                return false;
            }
            if (this.f7108a == null) {
                if (searchBound.f7108a != null) {
                    return false;
                }
            } else if (!this.f7108a.equals(searchBound.f7108a)) {
                return false;
            }
            if (this.f7109b == null) {
                if (searchBound.f7109b != null) {
                    return false;
                }
            } else if (!this.f7109b.equals(searchBound.f7109b)) {
                return false;
            }
            if (this.g == null) {
                if (searchBound.g != null) {
                    return false;
                }
            } else if (!this.g.equals(searchBound.g)) {
                return false;
            }
            if (this.f7110c != searchBound.f7110c) {
                return false;
            }
            if (this.f7112e == null) {
                if (searchBound.f7112e != null) {
                    return false;
                }
            } else if (!this.f7112e.equals(searchBound.f7112e)) {
                return false;
            }
            return true;
        }

        public SearchBound(List<LatLonPoint> list) {
            this.f7110c = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
            this.f7113f = true;
            this.f7112e = "Polygon";
            this.g = list;
        }

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f7110c = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
            this.f7113f = true;
            this.f7112e = "Bound";
            this.f7110c = i;
            this.f7111d = latLonPoint;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f7110c = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
            this.f7113f = true;
            this.f7112e = "Rectangle";
            a(latLonPoint, latLonPoint2);
        }

        private void a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f7108a = latLonPoint;
            this.f7109b = latLonPoint2;
            if (this.f7108a.getLatitude() < this.f7109b.getLatitude()) {
                this.f7108a.getLongitude();
                this.f7109b.getLongitude();
            }
            this.f7111d = new LatLonPoint((this.f7108a.getLatitude() + this.f7109b.getLatitude()) / 2.0d, (this.f7108a.getLongitude() + this.f7109b.getLongitude()) / 2.0d);
        }

        public SearchBound(LatLonPoint latLonPoint, int i, boolean z) {
            this.f7110c = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
            this.f7113f = true;
            this.f7112e = "Bound";
            this.f7110c = i;
            this.f7111d = latLonPoint;
            this.f7113f = z;
        }

        private SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2, int i, LatLonPoint latLonPoint3, String str, List<LatLonPoint> list, boolean z) {
            this.f7110c = PushConstants.WORK_RECEIVER_EVENTCORE_ERROR;
            this.f7113f = true;
            this.f7108a = latLonPoint;
            this.f7109b = latLonPoint2;
            this.f7110c = i;
            this.f7111d = latLonPoint3;
            this.f7112e = str;
            this.g = list;
            this.f7113f = z;
        }
    }

    public SearchBound getBound() {
        if (this.f7101a != null) {
            return this.f7101a.getBound();
        }
        return null;
    }

    public String getLanguage() {
        if (this.f7101a != null) {
            return this.f7101a.getLanguage();
        }
        return null;
    }

    public Query getQuery() {
        if (this.f7101a != null) {
            return this.f7101a.getQuery();
        }
        return null;
    }

    public PoiResult searchPOI() throws AMapException {
        if (this.f7101a != null) {
            return this.f7101a.searchPOI();
        }
        return null;
    }

    public void searchPOIAsyn() {
        if (this.f7101a != null) {
            this.f7101a.searchPOIAsyn();
        }
    }

    public PoiItem searchPOIId(String str) throws AMapException {
        if (this.f7101a != null) {
            return this.f7101a.searchPOIId(str);
        }
        return null;
    }

    public void searchPOIIdAsyn(String str) {
        if (this.f7101a != null) {
            this.f7101a.searchPOIIdAsyn(str);
        }
    }

    public void setBound(SearchBound searchBound) {
        if (this.f7101a != null) {
            this.f7101a.setBound(searchBound);
        }
    }

    public void setLanguage(String str) {
        if (this.f7101a != null) {
            this.f7101a.setLanguage(str);
        }
    }

    public void setOnPoiSearchListener(OnPoiSearchListener onPoiSearchListener) {
        if (this.f7101a != null) {
            this.f7101a.setOnPoiSearchListener(onPoiSearchListener);
        }
    }

    public void setQuery(Query query) {
        if (this.f7101a != null) {
            this.f7101a.setQuery(query);
        }
    }

    /* access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public PoiSearch(Context context, Query query) {
        try {
            Context context2 = context;
            this.f7101a = (IPoiSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.PoiSearchWrapper", ax.class, new Class[]{Context.class, Query.class}, new Object[]{context, query});
        } catch (be unused) {
        }
        if (this.f7101a == null) {
            try {
                this.f7101a = new ax(context, query);
            } catch (Exception unused2) {
            }
        }
    }
}
