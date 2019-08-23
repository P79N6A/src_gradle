package com.squareup.picasso;

import com.squareup.picasso.ad;
import com.squareup.picasso.s;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class u extends ThreadPoolExecutor {

    static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        private final c f27460a;

        public a(c cVar) {
            super(cVar, null);
            this.f27460a = cVar;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            a aVar = (a) obj;
            s.e eVar = this.f27460a.s;
            s.e eVar2 = aVar.f27460a.s;
            if (eVar == eVar2) {
                return this.f27460a.f27401a - aVar.f27460a.f27401a;
            }
            return eVar2.ordinal() - eVar.ordinal();
        }
    }

    public u() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ad.c());
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
