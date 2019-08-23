package com.ss.android.ugc.aweme.net.interceptor;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.v.b;
import io.reactivex.Observable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;

public class PbCheckInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56959a;

    @SuppressLint({"CheckResult"})
    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f56959a, false, 60943, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f56959a, false, 60943, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Observable.empty().observeOn(Schedulers.computation()).subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, new l(str2));
    }

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56959a, false, 60942, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56959a, false, 60942, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        SsResponse proceed = chain2.proceed(request);
        if (a.a() && !c.a() && request.getUrl().contains("aweme/v1/feed/")) {
            com.ss.android.ugc.aweme.framework.a.a.a("FeedApiProto", "verify start!");
            a(new String(((TypedByteArray) proceed.raw().getBody()).getBytes()));
        }
        return proceed;
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56959a, false, 60941, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56959a, false, 60941, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, m.f56979a, true, 60945, new Class[]{PbCheckInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, m.f56979a, true, 60945, new Class[]{PbCheckInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
        } else if (!(chain.metrics() instanceof b)) {
            return a(chain);
        } else {
            b bVar = (b) chain.metrics();
            if (bVar.f75984e > 0) {
                bVar.a(bVar.g, SystemClock.uptimeMillis() - bVar.f75984e);
            }
            bVar.a(getClass().getSimpleName());
            bVar.f75984e = SystemClock.uptimeMillis();
            SsResponse a2 = a(chain);
            if (bVar.f75985f > 0) {
                bVar.a(getClass().getSimpleName(), SystemClock.uptimeMillis() - bVar.f75985f);
            }
            bVar.f75985f = SystemClock.uptimeMillis();
            return a2;
        }
    }
}
