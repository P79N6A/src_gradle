package com.ss.optimizer.live.sdk.dns;

import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f78464a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f78465b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final long f78466c;

    public final String toString() {
        String str = "\"" + this.f78464a + "\":[";
        if (this.f78465b != null) {
            for (int i = 0; i < this.f78465b.size(); i++) {
                str = str + "\"" + this.f78465b.get(i) + "\"";
                if (i != this.f78465b.size() - 1) {
                    str = str + ",";
                }
            }
        }
        return str + "]";
    }

    public j(String str, List<String> list, long j) {
        this.f78464a = str;
        this.f78466c = 0;
        if (list != null) {
            this.f78465b.addAll(list);
        }
    }
}
