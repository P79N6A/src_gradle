package com.tencent.bugly.crashreport.crash;

public final class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    public long f79308a = -1;

    /* renamed from: b  reason: collision with root package name */
    public long f79309b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f79310c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f79311d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f79312e;

    /* renamed from: f  reason: collision with root package name */
    public int f79313f;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        a aVar = (a) obj;
        if (aVar != null) {
            long j = this.f79309b - aVar.f79309b;
            if (j <= 0) {
                if (j < 0) {
                    return -1;
                }
                return 0;
            }
        }
        return 1;
    }
}
