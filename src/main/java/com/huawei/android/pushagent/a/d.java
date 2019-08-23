package com.huawei.android.pushagent.a;

import com.huawei.android.pushagent.b.a.b.b;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f24993a;

    /* renamed from: b  reason: collision with root package name */
    public int f24994b;

    /* renamed from: c  reason: collision with root package name */
    public b.a f24995c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24996d;

    public d(String str, int i, boolean z, b.a aVar) {
        this.f24993a = str;
        this.f24994b = i;
        this.f24996d = z;
        this.f24995c = aVar;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ip:");
        stringBuffer.append(this.f24993a);
        stringBuffer.append(" port:");
        stringBuffer.append(this.f24994b);
        stringBuffer.append(" useProxy:");
        stringBuffer.append(this.f24996d);
        stringBuffer.append(" conType");
        stringBuffer.append(this.f24995c);
        return stringBuffer.toString();
    }
}
