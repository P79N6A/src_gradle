package com.benchmark.bl;

import a.g;
import a.i;
import com.benchmark.Benchmark;
import com.bytedance.common.utility.Lists;
import java.util.List;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final a f7491a;

    j(a aVar) {
        this.f7491a = aVar;
    }

    public final Object then(i iVar) {
        a aVar = this.f7491a;
        aVar.f7475b = false;
        if (iVar.b()) {
            List<Benchmark> list = aVar.f7476c;
            if (!Lists.isEmpty(list)) {
                for (Benchmark reset : list) {
                    reset.reset();
                }
                list.clear();
            }
        }
        return null;
    }
}
