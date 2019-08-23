package com.amap.api.services.cloud;

import android.content.Context;
import com.amap.api.services.a.ar;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.a.j;
import com.amap.api.services.a.z;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.ICloudSearch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CloudSearch {

    /* renamed from: a  reason: collision with root package name */
    private ICloudSearch f6961a;

    public interface OnCloudSearchListener {
        void onCloudItemDetailSearched(CloudItemDetail cloudItemDetail, int i);

        void onCloudSearched(CloudResult cloudResult, int i);
    }

    public static class Query implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        private String f6962a;

        /* renamed from: b  reason: collision with root package name */
        private int f6963b = 1;

        /* renamed from: c  reason: collision with root package name */
        private int f6964c = 20;

        /* renamed from: d  reason: collision with root package name */
        private String f6965d;

        /* renamed from: e  reason: collision with root package name */
        private SearchBound f6966e;

        /* renamed from: f  reason: collision with root package name */
        private Sortingrules f6967f;
        private ArrayList<z> g = new ArrayList<>();
        private HashMap<String, String> h = new HashMap<>();

        public SearchBound getBound() {
            return this.f6966e;
        }

        public int getPageNum() {
            return this.f6963b;
        }

        public int getPageSize() {
            return this.f6964c;
        }

        public String getQueryString() {
            return this.f6962a;
        }

        public Sortingrules getSortingrules() {
            return this.f6967f;
        }

        public String getTableID() {
            return this.f6965d;
        }

        private Query() {
        }

        private ArrayList<z> a() {
            if (this.g == null) {
                return null;
            }
            ArrayList<z> arrayList = new ArrayList<>();
            arrayList.addAll(this.g);
            return arrayList;
        }

        private HashMap<String, String> b() {
            if (this.h == null) {
                return null;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.putAll(this.h);
            return hashMap;
        }

        public Query clone() {
            Query query;
            try {
                super.clone();
            } catch (CloneNotSupportedException unused) {
            }
            try {
                query = new Query(this.f6965d, this.f6962a, this.f6966e);
                try {
                    query.setPageNum(this.f6963b);
                    query.setPageSize(this.f6964c);
                    query.setSortingrules(getSortingrules());
                    query.g = a();
                    query.h = b();
                } catch (AMapException unused2) {
                }
            } catch (AMapException unused3) {
                query = null;
            }
            if (query == null) {
                return new Query();
            }
            return query;
        }

        public String getFilterNumString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                Iterator<z> it2 = this.g.iterator();
                while (it2.hasNext()) {
                    z next = it2.next();
                    stringBuffer.append(next.a());
                    stringBuffer.append(":[");
                    stringBuffer.append(next.b());
                    stringBuffer.append(",");
                    stringBuffer.append(next.c());
                    stringBuffer.append("]");
                    stringBuffer.append("+");
                }
                if (stringBuffer.length() > 0) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
            } catch (Throwable unused) {
            }
            return stringBuffer.toString();
        }

        public String getFilterString() {
            StringBuffer stringBuffer = new StringBuffer();
            try {
                for (Map.Entry next : this.h.entrySet()) {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    stringBuffer.append(key.toString());
                    stringBuffer.append(":");
                    stringBuffer.append(value.toString());
                    stringBuffer.append("+");
                }
                if (stringBuffer.length() > 0) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                }
            } catch (Throwable unused) {
            }
            return stringBuffer.toString();
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (this.g == null) {
                i = 0;
            } else {
                i = this.g.hashCode();
            }
            int i7 = (i + 31) * 31;
            if (this.h == null) {
                i2 = 0;
            } else {
                i2 = this.h.hashCode();
            }
            int i8 = (i7 + i2) * 31;
            if (this.f6966e == null) {
                i3 = 0;
            } else {
                i3 = this.f6966e.hashCode();
            }
            int i9 = (((((i8 + i3) * 31) + this.f6963b) * 31) + this.f6964c) * 31;
            if (this.f6962a == null) {
                i4 = 0;
            } else {
                i4 = this.f6962a.hashCode();
            }
            int i10 = (i9 + i4) * 31;
            if (this.f6967f == null) {
                i5 = 0;
            } else {
                i5 = this.f6967f.hashCode();
            }
            int i11 = (i10 + i5) * 31;
            if (this.f6965d != null) {
                i6 = this.f6965d.hashCode();
            }
            return i11 + i6;
        }

        public void setBound(SearchBound searchBound) {
            this.f6966e = searchBound;
        }

        public void setPageNum(int i) {
            this.f6963b = i;
        }

        public void setSortingrules(Sortingrules sortingrules) {
            this.f6967f = sortingrules;
        }

        public void setTableID(String str) {
            this.f6965d = str;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Query)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            Query query = (Query) obj;
            if (!queryEquals(query) || query.f6963b != this.f6963b) {
                return false;
            }
            return true;
        }

        public void setPageSize(int i) {
            if (i <= 0) {
                this.f6964c = 20;
            } else if (i > 100) {
                this.f6964c = 100;
            } else {
                this.f6964c = i;
            }
        }

        public boolean queryEquals(Query query) {
            if (query == null) {
                return false;
            }
            if (query == this) {
                return true;
            }
            if (!CloudSearch.b(query.f6962a, this.f6962a) || !CloudSearch.b(query.getTableID(), getTableID()) || !CloudSearch.b(query.getFilterString(), getFilterString()) || !CloudSearch.b(query.getFilterNumString(), getFilterNumString()) || query.f6964c != this.f6964c || !a(query.getBound(), getBound()) || !a(query.getSortingrules(), getSortingrules())) {
                return false;
            }
            return true;
        }

        public void addFilterString(String str, String str2) {
            this.h.put(str, str2);
        }

        private boolean a(SearchBound searchBound, SearchBound searchBound2) {
            if (searchBound == null && searchBound2 == null) {
                return true;
            }
            if (searchBound == null || searchBound2 == null) {
                return false;
            }
            return searchBound.equals(searchBound2);
        }

        private boolean a(Sortingrules sortingrules, Sortingrules sortingrules2) {
            if (sortingrules == null && sortingrules2 == null) {
                return true;
            }
            if (sortingrules == null || sortingrules2 == null) {
                return false;
            }
            return sortingrules.equals(sortingrules2);
        }

        public void addFilterNum(String str, String str2, String str3) {
            this.g.add(new z(str, str2, str3));
        }

        public Query(String str, String str2, SearchBound searchBound) throws AMapException {
            if (j.a(str) || searchBound == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            this.f6965d = str;
            this.f6962a = str2;
            this.f6966e = searchBound;
        }
    }

    public static class SearchBound implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        private LatLonPoint f6968a;

        /* renamed from: b  reason: collision with root package name */
        private LatLonPoint f6969b;

        /* renamed from: c  reason: collision with root package name */
        private int f6970c;

        /* renamed from: d  reason: collision with root package name */
        private LatLonPoint f6971d;

        /* renamed from: e  reason: collision with root package name */
        private String f6972e;

        /* renamed from: f  reason: collision with root package name */
        private List<LatLonPoint> f6973f;
        private String g;

        public LatLonPoint getCenter() {
            return this.f6971d;
        }

        public String getCity() {
            return this.g;
        }

        public LatLonPoint getLowerLeft() {
            return this.f6968a;
        }

        public List<LatLonPoint> getPolyGonList() {
            return this.f6973f;
        }

        public int getRange() {
            return this.f6970c;
        }

        public String getShape() {
            return this.f6972e;
        }

        public LatLonPoint getUpperRight() {
            return this.f6969b;
        }

        private List<LatLonPoint> a() {
            if (this.f6973f == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (LatLonPoint next : this.f6973f) {
                arrayList.add(new LatLonPoint(next.getLatitude(), next.getLongitude()));
            }
            return arrayList;
        }

        public SearchBound clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException unused) {
            }
            if (getShape().equals("Bound")) {
                return new SearchBound(this.f6971d, this.f6970c);
            }
            if (getShape().equals("Polygon")) {
                return new SearchBound(a());
            }
            if (getShape().equals("Local")) {
                return new SearchBound(this.g);
            }
            return new SearchBound(this.f6968a, this.f6969b);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (this.f6971d == null) {
                i = 0;
            } else {
                i = this.f6971d.hashCode();
            }
            int i7 = (i + 31) * 31;
            if (this.f6968a == null) {
                i2 = 0;
            } else {
                i2 = this.f6968a.hashCode();
            }
            int i8 = (i7 + i2) * 31;
            if (this.f6969b == null) {
                i3 = 0;
            } else {
                i3 = this.f6969b.hashCode();
            }
            int i9 = (i8 + i3) * 31;
            if (this.f6973f == null) {
                i4 = 0;
            } else {
                i4 = this.f6973f.hashCode();
            }
            int i10 = (((i9 + i4) * 31) + this.f6970c) * 31;
            if (this.f6972e == null) {
                i5 = 0;
            } else {
                i5 = this.f6972e.hashCode();
            }
            int i11 = (i10 + i5) * 31;
            if (this.g != null) {
                i6 = this.g.hashCode();
            }
            return i11 + i6;
        }

        public SearchBound(String str) {
            this.f6972e = "Local";
            this.g = str;
        }

        public SearchBound(List<LatLonPoint> list) {
            this.f6972e = "Polygon";
            this.f6973f = list;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof SearchBound)) {
                return false;
            }
            SearchBound searchBound = (SearchBound) obj;
            if (!getShape().equalsIgnoreCase(searchBound.getShape())) {
                return false;
            }
            if (getShape().equals("Bound")) {
                if (!searchBound.f6971d.equals(this.f6971d) || searchBound.f6970c != this.f6970c) {
                    return false;
                }
                return true;
            } else if (getShape().equals("Polygon")) {
                return a(searchBound.f6973f, this.f6973f);
            } else {
                if (getShape().equals("Local")) {
                    return searchBound.g.equals(this.g);
                }
                if (!searchBound.f6968a.equals(this.f6968a) || !searchBound.f6969b.equals(this.f6969b)) {
                    return false;
                }
                return true;
            }
        }

        public SearchBound(LatLonPoint latLonPoint, int i) {
            this.f6972e = "Bound";
            this.f6970c = i;
            this.f6971d = latLonPoint;
        }

        public SearchBound(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f6972e = "Rectangle";
            a(latLonPoint, latLonPoint2);
        }

        private boolean a(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f6968a = latLonPoint;
            this.f6969b = latLonPoint2;
            if (this.f6968a == null || this.f6969b == null || this.f6968a.getLatitude() >= this.f6969b.getLatitude() || this.f6968a.getLongitude() >= this.f6969b.getLongitude()) {
                return false;
            }
            return true;
        }

        private boolean a(List<LatLonPoint> list, List<LatLonPoint> list2) {
            if (list == null && list2 == null) {
                return true;
            }
            if (list == null || list2 == null || list.size() != list2.size()) {
                return false;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!list.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Sortingrules {

        /* renamed from: a  reason: collision with root package name */
        private int f6974a;

        /* renamed from: b  reason: collision with root package name */
        private String f6975b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f6976c = true;

        public int hashCode() {
            int i;
            int i2;
            if (this.f6976c) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (i + 31) * 31;
            if (this.f6975b == null) {
                i2 = 0;
            } else {
                i2 = this.f6975b.hashCode();
            }
            return ((i3 + i2) * 31) + this.f6974a;
        }

        public String toString() {
            if (j.a(this.f6975b)) {
                if (this.f6974a == 0) {
                    return "_weight";
                }
                if (this.f6974a == 1) {
                    return "_distance";
                }
                return "";
            } else if (this.f6976c) {
                return this.f6975b + ":1";
            } else {
                return this.f6975b + ":0";
            }
        }

        public Sortingrules(int i) {
            this.f6974a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Sortingrules sortingrules = (Sortingrules) obj;
            if (this.f6976c != sortingrules.f6976c) {
                return false;
            }
            if (this.f6975b == null) {
                if (sortingrules.f6975b != null) {
                    return false;
                }
            } else if (!this.f6975b.equals(sortingrules.f6975b)) {
                return false;
            }
            if (this.f6974a != sortingrules.f6974a) {
                return false;
            }
            return true;
        }

        public Sortingrules(String str, boolean z) {
            this.f6975b = str;
            this.f6976c = z;
        }
    }

    public void searchCloudAsyn(Query query) {
        if (this.f6961a != null) {
            this.f6961a.searchCloudAsyn(query);
        }
    }

    public void setOnCloudSearchListener(OnCloudSearchListener onCloudSearchListener) {
        if (this.f6961a != null) {
            this.f6961a.setOnCloudSearchListener(onCloudSearchListener);
        }
    }

    public CloudSearch(Context context) {
        try {
            Context context2 = context;
            this.f6961a = (ICloudSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.CloudSearchWrapper", ar.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f6961a == null) {
            try {
                this.f6961a = new ar(context);
            } catch (Exception unused2) {
            }
        }
    }

    public void searchCloudDetailAsyn(String str, String str2) {
        if (this.f6961a != null) {
            this.f6961a.searchCloudDetailAsyn(str, str2);
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
}
