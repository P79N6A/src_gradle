package com.bytedance.ies.geckoclient;

import com.bytedance.common.utility.Lists;
import com.bytedance.ies.geckoclient.d.a;
import java.util.List;
import java.util.concurrent.Executor;

public final class s extends a {

    /* renamed from: b  reason: collision with root package name */
    private List<r> f20840b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f20841c;

    /* renamed from: d  reason: collision with root package name */
    private a f20842d;

    public final void run() {
        if (!Lists.isEmpty(this.f20840b)) {
            for (r run : this.f20840b) {
                try {
                    run.run();
                } catch (Exception unused) {
                }
            }
            this.f20841c.execute(new p(this.f20842d));
        }
    }

    public s(a aVar, List<r> list, Executor executor) {
        super(aVar);
        this.f20840b = list;
        this.f20841c = executor;
        this.f20842d = aVar;
    }
}
