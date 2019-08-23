package com.ss.optimizer.live.sdk.dns;

import com.ss.optimizer.live.sdk.dns.a.a;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f78457a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f78458b;

    /* renamed from: c  reason: collision with root package name */
    public final float f78459c;

    /* renamed from: d  reason: collision with root package name */
    public final float f78460d;

    h(String str, List<a> list, int i) {
        this.f78457a = str;
        this.f78458b = list;
        if (list == null || list.isEmpty()) {
            this.f78459c = 1.0f;
            this.f78460d = Float.MAX_VALUE;
            return;
        }
        this.f78459c = 1.0f - ((((float) list.size()) * 1.0f) / ((float) i));
        float f2 = 0.0f;
        for (a next : list) {
            if (next != null) {
                f2 += next.f78444c;
            }
        }
        this.f78460d = f2 / ((float) list.size());
    }
}
