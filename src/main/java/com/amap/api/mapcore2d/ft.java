package com.amap.api.mapcore2d;

public final class ft implements Comparable<ft> {

    /* renamed from: a  reason: collision with root package name */
    public String f6176a;

    /* renamed from: b  reason: collision with root package name */
    public String f6177b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f6178c;

    /* renamed from: d  reason: collision with root package name */
    public String f6179d;

    /* renamed from: e  reason: collision with root package name */
    public String f6180e;

    /* renamed from: f  reason: collision with root package name */
    public int f6181f;
    public int g;
    public long h;
    public int i;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(ft ftVar) {
        if (this.g < ftVar.g) {
            return 1;
        }
        return (this.g != ftVar.g && this.g > ftVar.g) ? -1 : 0;
    }

    public final String toString() {
        return "name = " + this.f6177b + ",uuid = " + this.f6176a + ",major = " + this.f6179d + ",minor = " + this.f6180e + ",TxPower = " + this.f6181f + ",rssi = " + this.g + ",time = " + this.h;
    }
}
