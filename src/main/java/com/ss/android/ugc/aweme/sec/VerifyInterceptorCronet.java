package com.ss.android.ugc.aweme.sec;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sec.c;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class VerifyInterceptorCronet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63715a;

    static final class a extends f<SsResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63716a;
        public Interceptor.Chain i;
        public SsResponse j;

        public final c<SsResponse> d() {
            if (!PatchProxy.isSupport(new Object[0], this, f63716a, false, 71117, new Class[0], c.class)) {
                return new c.a<SsResponse>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63717a;

                    public final /* bridge */ /* synthetic */ Object a() {
                        return a.this.j;
                    }

                    public final /* synthetic */ Object b() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f63717a, false, 71118, new Class[0], SsResponse.class)) {
                            return (SsResponse) PatchProxy.accessDispatch(new Object[0], this, f63717a, false, 71118, new Class[0], SsResponse.class);
                        }
                        a.this.i.request().getUrl();
                        Interceptor.Chain chain = a.this.i;
                        if (PatchProxy.isSupport(new Object[]{chain}, null, VerifyInterceptorCronet.f63715a, true, 71115, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
                            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, null, VerifyInterceptorCronet.f63715a, true, 71115, new Class[]{Interceptor.Chain.class}, SsResponse.class);
                        }
                        Request request = chain.request();
                        String valueOf = String.valueOf(System.currentTimeMillis());
                        Request.Builder url = request.newBuilder().url(HttpUrl.parse(request.getUrl()).toString());
                        if (PatchProxy.isSupport(new Object[]{request, valueOf, url}, null, VerifyInterceptorCronet.f63715a, true, 71116, new Class[]{Request.class, String.class, Request.Builder.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{request, valueOf, url}, null, VerifyInterceptorCronet.f63715a, true, 71116, new Class[]{Request.class, String.class, Request.Builder.class}, Void.TYPE);
                        } else {
                            TypedOutput body = request.getBody();
                            if (body != null && body.length() > 0 && (body instanceof b)) {
                                b bVar = new b();
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                body.writeTo(byteArrayOutputStream);
                                Map<String, String> a2 = com.ss.android.ugc.aweme.app.api.b.a(byteArrayOutputStream.toString());
                                for (String next : a2.keySet()) {
                                    if (TextUtils.equals(next, "_rticket")) {
                                        bVar.a(next, valueOf);
                                    } else {
                                        bVar.a(next, a2.get(next));
                                    }
                                }
                                url.method(request.getMethod(), bVar);
                            }
                        }
                        return chain.proceed(url.build());
                    }
                };
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f63716a, false, 71117, new Class[0], c.class);
        }

        private a(Interceptor.Chain chain, SsResponse ssResponse) {
            this.i = chain;
            this.j = ssResponse;
        }

        /* synthetic */ a(Interceptor.Chain chain, SsResponse ssResponse, byte b2) {
            this(chain, ssResponse);
        }
    }

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f63715a, false, 71114, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f63715a, false, 71114, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        try {
            SsResponse proceed = chain2.proceed(chain.request());
            String value = proceed.raw().getFirstHeader("Content-Type").getValue();
            if (!TextUtils.isEmpty(value) && !value.contains("json")) {
                return proceed;
            }
            String a2 = e.a(proceed.raw());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    JSONObject jSONObject = new JSONObject(a2);
                    a aVar = new a(chain2, proceed, (byte) 0);
                    if (aVar.a(chain.request().getUrl(), jSONObject)) {
                        return (SsResponse) aVar.c();
                    }
                } catch (Exception | InterruptedException | JSONException unused) {
                }
            }
            return proceed;
        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
            int errorCode = e2.getErrorCode();
            a aVar2 = new a(chain2, null, (byte) 0);
            if (aVar2.a(errorCode)) {
                return (SsResponse) aVar2.c();
            }
            throw e2;
        }
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f63715a, false, 71113, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f63715a, false, 71113, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, j.f63776a, true, 71119, new Class[]{VerifyInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, j.f63776a, true, 71119, new Class[]{VerifyInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class);
        } else if (!(chain.metrics() instanceof com.ss.android.ugc.aweme.v.b)) {
            return a(chain);
        } else {
            com.ss.android.ugc.aweme.v.b bVar = (com.ss.android.ugc.aweme.v.b) chain.metrics();
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
