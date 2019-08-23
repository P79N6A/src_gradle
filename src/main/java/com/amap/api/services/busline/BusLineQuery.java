package com.amap.api.services.busline;

public class BusLineQuery implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private String f6918a;

    /* renamed from: b  reason: collision with root package name */
    private String f6919b;

    /* renamed from: c  reason: collision with root package name */
    private int f6920c = 20;

    /* renamed from: d  reason: collision with root package name */
    private int f6921d = 1;

    /* renamed from: e  reason: collision with root package name */
    private SearchType f6922e;

    public enum SearchType {
        BY_LINE_ID,
        BY_LINE_NAME
    }

    public SearchType getCategory() {
        return this.f6922e;
    }

    public String getCity() {
        return this.f6919b;
    }

    public int getPageNumber() {
        return this.f6921d;
    }

    public int getPageSize() {
        return this.f6920c;
    }

    public String getQueryString() {
        return this.f6918a;
    }

    public BusLineQuery clone() {
        BusLineQuery busLineQuery = new BusLineQuery(this.f6918a, this.f6922e, this.f6919b);
        busLineQuery.setPageNumber(this.f6921d);
        busLineQuery.setPageSize(this.f6920c);
        return busLineQuery;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.f6922e == null) {
            i = 0;
        } else {
            i = this.f6922e.hashCode();
        }
        int i4 = (i + 31) * 31;
        if (this.f6919b == null) {
            i2 = 0;
        } else {
            i2 = this.f6919b.hashCode();
        }
        int i5 = (((((i4 + i2) * 31) + this.f6921d) * 31) + this.f6920c) * 31;
        if (this.f6918a != null) {
            i3 = this.f6918a.hashCode();
        }
        return i5 + i3;
    }

    public void setCategory(SearchType searchType) {
        this.f6922e = searchType;
    }

    public void setCity(String str) {
        this.f6919b = str;
    }

    public void setPageSize(int i) {
        this.f6920c = i;
    }

    public void setQueryString(String str) {
        this.f6918a = str;
    }

    public void setPageNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f6921d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusLineQuery busLineQuery = (BusLineQuery) obj;
        if (this.f6922e != busLineQuery.f6922e) {
            return false;
        }
        if (this.f6919b == null) {
            if (busLineQuery.f6919b != null) {
                return false;
            }
        } else if (!this.f6919b.equals(busLineQuery.f6919b)) {
            return false;
        }
        if (this.f6921d != busLineQuery.f6921d || this.f6920c != busLineQuery.f6920c) {
            return false;
        }
        if (this.f6918a == null) {
            if (busLineQuery.f6918a != null) {
                return false;
            }
        } else if (!this.f6918a.equals(busLineQuery.f6918a)) {
            return false;
        }
        return true;
    }

    public boolean weakEquals(BusLineQuery busLineQuery) {
        if (this == busLineQuery) {
            return true;
        }
        if (busLineQuery == null) {
            return false;
        }
        if (this.f6918a == null) {
            if (busLineQuery.getQueryString() != null) {
                return false;
            }
        } else if (!busLineQuery.getQueryString().equals(this.f6918a)) {
            return false;
        }
        if (this.f6919b == null) {
            if (busLineQuery.getCity() != null) {
                return false;
            }
        } else if (!busLineQuery.getCity().equals(this.f6919b)) {
            return false;
        }
        if (this.f6920c == busLineQuery.getPageSize() && busLineQuery.getCategory().compareTo(this.f6922e) == 0) {
            return true;
        }
        return false;
    }

    public BusLineQuery(String str, SearchType searchType, String str2) {
        this.f6918a = str;
        this.f6922e = searchType;
        this.f6919b = str2;
    }
}
