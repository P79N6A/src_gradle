package com.bytedance.android.livesdk.feed.network;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.b.a;
import com.bytedance.android.live.core.network.response.RequestError;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.v.b;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ResponseInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14298a;

    /* renamed from: b  reason: collision with root package name */
    private Pattern f14299b = Pattern.compile("([^=]+)=([^;]+)", 2);

    /* renamed from: c  reason: collision with root package name */
    private Context f14300c;

    public ResponseInterceptor(Context context) {
        this.f14300c = context;
    }

    private String a(SsResponse ssResponse) {
        if (PatchProxy.isSupport(new Object[]{ssResponse}, this, f14298a, false, 8794, new Class[]{SsResponse.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{ssResponse}, this, f14298a, false, 8794, new Class[]{SsResponse.class}, String.class);
        }
        List headers = ssResponse.raw().headers("X-Tt-Logid");
        if (!t.a(headers)) {
            return ((Header) headers.get(0)).getValue();
        }
        return "";
    }

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f14298a, false, 8796, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f14298a, false, 8796, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        SsResponse proceed = chain2.proceed(request);
        a(request, proceed);
        return proceed;
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f14298a, false, 8795, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f14298a, false, 8795, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, e.f14308a, true, 8798, new Class[]{ResponseInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, e.f14308a, true, 8798, new Class[]{ResponseInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
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

    private void a(Request request, SsResponse ssResponse) throws Exception {
        SsResponse ssResponse2 = ssResponse;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{request, ssResponse2}, this, f14298a, false, 8792, new Class[]{Request.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{request, ssResponse2}, this, f14298a, false, 8792, new Class[]{Request.class, SsResponse.class}, Void.TYPE);
            return;
        }
        Object body = ssResponse.body();
        if (body instanceof d) {
            d dVar = (d) body;
            if (dVar.f7870a != 0) {
                if (dVar.f7873d == null) {
                    dVar.f7873d = new RequestError();
                }
                dVar.f7873d.url = request.getUrl();
                a.a(dVar.f7870a, dVar.f7873d, dVar.f7872c, a(ssResponse2));
            }
        } else if (body instanceof c) {
            c cVar = (c) body;
            if (cVar.f7866a != 0) {
                if (cVar.f7869d == null) {
                    cVar.f7869d = new RequestError();
                }
                cVar.f7869d.url = request.getUrl();
                a.a(cVar.f7866a, cVar.f7869d, cVar.f7868c, a(ssResponse2));
            }
        } else if (body instanceof com.bytedance.android.live.core.network.a.c) {
            com.bytedance.android.live.core.network.a.c cVar2 = (com.bytedance.android.live.core.network.a.c) body;
            if (!TextUtils.equals(cVar2.f7853a, "success") && cVar2.f7854b != null) {
                cVar2.f7854b.f7852c = request.getUrl();
                a.a(cVar2.f7854b.f7850a, cVar2.f7854b, a(ssResponse2));
            }
        } else if (body instanceof com.bytedance.android.live.core.network.a.a) {
            com.bytedance.android.live.core.network.a.a aVar = (com.bytedance.android.live.core.network.a.a) body;
            if (!TextUtils.equals(aVar.f7848a, "success") && aVar.f7849b != null) {
                aVar.f7849b.f7852c = request.getUrl();
                a.a(aVar.f7849b.f7850a, aVar.f7849b, a(ssResponse2));
            }
        } else if (body instanceof com.bytedance.android.live.core.network.response.a) {
            com.bytedance.android.live.core.network.response.a aVar2 = (com.bytedance.android.live.core.network.response.a) body;
            if (aVar2.f7867b != null) {
                if (aVar2.f7866a != 0) {
                    if (aVar2.f7869d == null) {
                        aVar2.f7869d = new RequestError();
                    }
                    aVar2.f7869d.url = request.getUrl();
                    a.a(aVar2.f7866a, aVar2.f7869d, (Extra) aVar2.f7868c, a(ssResponse2));
                }
                return;
            }
            throw new com.bytedance.android.live.a.a.a.c();
        } else if (body instanceof com.bytedance.android.live.core.network.response.b) {
            com.bytedance.android.live.core.network.response.b bVar = (com.bytedance.android.live.core.network.response.b) body;
            if (bVar.f7871b != null) {
                if (bVar.f7870a != 0) {
                    if (bVar.f7873d == null) {
                        bVar.f7873d = new RequestError();
                    }
                    bVar.f7873d.url = request.getUrl();
                    a.a(bVar.f7870a, bVar.f7873d, (Extra) bVar.f7872c, a(ssResponse2));
                }
                return;
            }
            throw new com.bytedance.android.live.a.a.a.c();
        } else {
            if (body instanceof String) {
                String str = (String) body;
                if (!StringUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("data")) {
                        if (PatchProxy.isSupport(new Object[]{jSONObject}, null, f14298a, true, 8793, new Class[]{JSONObject.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, null, f14298a, true, 8793, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
                        } else if (jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0) {
                            z = true;
                        }
                        if (!z) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            throw new com.bytedance.android.live.a.a.b.a(jSONObject.optInt("status_code")).setErrorMsg(optJSONObject.optString("message", "")).setPrompt(optJSONObject.optString("prompts", "")).setExtra(jSONObject.optString(PushConstants.EXTRA, "")).setAlert(optJSONObject.optString("alert", ""));
                        }
                    } else {
                        throw new com.bytedance.android.live.a.a.a.c();
                    }
                } else {
                    throw new com.bytedance.android.live.a.a.a.b();
                }
            }
        }
    }
}
