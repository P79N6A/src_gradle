package com.amap.api.services.busline;

import com.amap.api.services.a.j;

public class BusStationQuery implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private String f6936a;

    /* renamed from: b  reason: collision with root package name */
    private String f6937b;

    /* renamed from: c  reason: collision with root package name */
    private int f6938c = 20;

    /* renamed from: d  reason: collision with root package name */
    private int f6939d = 1;

    public String getCity() {
        return this.f6937b;
    }

    public int getPageNumber() {
        return this.f6939d;
    }

    public int getPageSize() {
        return this.f6938c;
    }

    public String getQueryString() {
        return this.f6936a;
    }

    private boolean a() {
        if (!j.a(this.f6936a)) {
            return true;
        }
        return false;
    }

    public BusStationQuery clone() {
        BusStationQuery busStationQuery = new BusStationQuery(this.f6936a, this.f6937b);
        busStationQuery.setPageNumber(this.f6939d);
        busStationQuery.setPageSize(this.f6938c);
        return busStationQuery;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f6937b == null) {
            i = 0;
        } else {
            i = this.f6937b.hashCode();
        }
        int i3 = (((((i + 31) * 31) + this.f6939d) * 31) + this.f6938c) * 31;
        if (this.f6936a != null) {
            i2 = this.f6936a.hashCode();
        }
        return i3 + i2;
    }

    public void setCity(String str) {
        this.f6937b = str;
    }

    public void setPageSize(int i) {
        this.f6938c = i;
    }

    public void setQueryString(String str) {
        this.f6936a = str;
    }

    public void setPageNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f6939d = i;
    }

    public boolean weakEquals(BusStationQuery busStationQuery) {
        if (this == busStationQuery) {
            return true;
        }
        if (busStationQuery == null) {
            return false;
        }
        if (this.f6937b == null) {
            if (busStationQuery.f6937b != null) {
                return false;
            }
        } else if (!this.f6937b.equals(busStationQuery.f6937b)) {
            return false;
        }
        if (this.f6938c != busStationQuery.f6938c) {
            return false;
        }
        if (this.f6936a == null) {
            if (busStationQuery.f6936a != null) {
                return false;
            }
        } else if (!this.f6936a.equals(busStationQuery.f6936a)) {
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
        BusStationQuery busStationQuery = (BusStationQuery) obj;
        if (this.f6937b == null) {
            if (busStationQuery.f6937b != null) {
                return false;
            }
        } else if (!this.f6937b.equals(busStationQuery.f6937b)) {
            return false;
        }
        if (this.f6939d != busStationQuery.f6939d || this.f6938c != busStationQuery.f6938c) {
            return false;
        }
        if (this.f6936a == null) {
            if (busStationQuery.f6936a != null) {
                return false;
            }
        } else if (!this.f6936a.equals(busStationQuery.f6936a)) {
            return false;
        }
        return true;
    }

    public BusStationQuery(String str, String str2) {
        this.f6936a = str;
        this.f6937b = str2;
        a();
    }
}
