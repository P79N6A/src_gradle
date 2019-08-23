package anetwork.channel.unified;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.request.Request;
import anet.channel.request.b;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.entity.c;
import anetwork.channel.entity.g;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import anetwork.channel.interceptor.InterceptorManager;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class k {

    /* renamed from: a  reason: collision with root package name */
    protected j f1597a;

    class a implements Interceptor.Chain {

        /* renamed from: b  reason: collision with root package name */
        private int f1599b;

        /* renamed from: c  reason: collision with root package name */
        private Request f1600c;

        /* renamed from: d  reason: collision with root package name */
        private Callback f1601d;

        public Callback callback() {
            return this.f1601d;
        }

        public Request request() {
            return this.f1600c;
        }

        public Future proceed(Request request, Callback callback) {
            Cache cache;
            IUnifiedTask iUnifiedTask;
            if (k.this.f1597a.f1594d.get()) {
                ALog.i("anet.UnifiedRequestTask", "request canneled or timeout in processing interceptor", request.getSeq(), new Object[0]);
                return null;
            } else if (this.f1599b < InterceptorManager.getSize()) {
                return InterceptorManager.getInterceptor(this.f1599b).intercept(new a(this.f1599b + 1, request, callback));
            } else {
                k.this.f1597a.f1591a.a(request);
                k.this.f1597a.f1592b = callback;
                if (NetworkConfigCenter.isHttpCacheEnable()) {
                    cache = CacheManager.getCache(k.this.f1597a.f1591a.g(), k.this.f1597a.f1591a.h());
                } else {
                    cache = null;
                }
                j jVar = k.this.f1597a;
                if (cache != null) {
                    iUnifiedTask = new a(k.this.f1597a, cache);
                } else {
                    iUnifiedTask = new e(k.this.f1597a, null, null);
                }
                jVar.f1595e = iUnifiedTask;
                k.this.f1597a.f1595e.run();
                k.this.c();
                return null;
            }
        }

        a(int i, Request request, Callback callback) {
            this.f1599b = i;
            this.f1600c = request;
            this.f1601d = callback;
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        this.f1597a.f1596f = ThreadPoolExecutorFactory.submitScheduledTask(new n(this), (long) this.f1597a.f1591a.b(), TimeUnit.MILLISECONDS);
    }

    public Future a() {
        this.f1597a.f1591a.f1548b.start = System.currentTimeMillis();
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.UnifiedRequestTask", "request", this.f1597a.f1593c, "Url", this.f1597a.f1591a.g());
        }
        if (NetworkConfigCenter.isUrlInDegradeList(this.f1597a.f1591a.f())) {
            b bVar = new b(this.f1597a);
            this.f1597a.f1595e = bVar;
            bVar.f1557a = new b(ThreadPoolExecutorFactory.submitBackupTask(new l(this)), this.f1597a.f1591a.a().getSeq());
            c();
            return new d(this);
        }
        ThreadPoolExecutorFactory.submitPriorityTask(new m(this), ThreadPoolExecutorFactory.Priority.HIGH);
        return new d(this);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f1597a.f1594d.compareAndSet(false, true)) {
            HttpUrl f2 = this.f1597a.f1591a.f();
            ALog.e("anet.UnifiedRequestTask", "task cancelled", this.f1597a.f1593c, "URL", f2.simpleUrlString());
            RequestStatistic requestStatistic = this.f1597a.f1591a.f1548b;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.ret = 2;
                requestStatistic.statusCode = -204;
                requestStatistic.msg = ErrorConstant.getErrMsg(-204);
                requestStatistic.rspEnd = System.currentTimeMillis();
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(-204, null, requestStatistic, null));
                if (requestStatistic.recDataSize > 102400) {
                    anet.channel.monitor.b.a().a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.recDataSize);
                }
            }
            this.f1597a.b();
            this.f1597a.a();
            this.f1597a.f1592b.onFinish(new DefaultFinishEvent(-204, null, requestStatistic));
        }
    }

    public k(g gVar, c cVar) {
        cVar.a(gVar.f1551e);
        this.f1597a = new j(gVar, cVar);
    }
}
