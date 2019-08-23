package com.bytedance.android.livesdk.network;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.response.RequestError;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.livesdk.j.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.v.b;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ResponseInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16731a;

    /* renamed from: b  reason: collision with root package name */
    private Pattern f16732b = Pattern.compile("([^=]+)=([^;]+)", 2);

    /* renamed from: c  reason: collision with root package name */
    private Context f16733c;

    public ResponseInterceptor(Context context) {
        this.f16733c = context;
    }

    private String a(SsResponse ssResponse) {
        if (PatchProxy.isSupport(new Object[]{ssResponse}, this, f16731a, false, 12542, new Class[]{SsResponse.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{ssResponse}, this, f16731a, false, 12542, new Class[]{SsResponse.class}, String.class);
        }
        List<Header> headers = ssResponse.raw().headers("X-Tt-Logid");
        if (!t.a(headers)) {
            return headers.get(0).getValue();
        }
        return "";
    }

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f16731a, false, 12544, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f16731a, false, 12544, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        SsResponse proceed = chain2.proceed(request);
        a(request, proceed);
        return proceed;
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f16731a, false, 12543, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f16731a, false, 12543, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, c.f16739a, true, 12546, new Class[]{ResponseInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, c.f16739a, true, 12546, new Class[]{ResponseInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
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
        int i;
        int i2;
        String optString;
        SsResponse ssResponse2 = ssResponse;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{request, ssResponse2}, this, f16731a, false, 12540, new Class[]{Request.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{request, ssResponse2}, this, f16731a, false, 12540, new Class[]{Request.class, SsResponse.class}, Void.TYPE);
            return;
        }
        a a2 = a.a();
        if (PatchProxy.isSupport(new Object[]{request, ssResponse2}, a2, a.f15643a, false, 10909, new Class[]{Request.class, SsResponse.class}, Void.TYPE)) {
            a aVar = a2;
            PatchProxy.accessDispatch(new Object[]{request, ssResponse2}, aVar, a.f15643a, false, 10909, new Class[]{Request.class, SsResponse.class}, Void.TYPE);
        } else if (!(ssResponse2 == null || request == null)) {
            Response raw = ssResponse.raw();
            if (raw != null) {
                int status = raw.getStatus();
                if (status == 200) {
                    Object body = ssResponse.body();
                    if (body != null) {
                        String url = request.getUrl();
                        String a3 = ac.a((int) C0906R.string.ctq);
                        if (body instanceof com.bytedance.android.live.core.model.startlive.a) {
                            com.bytedance.android.live.core.model.startlive.a aVar2 = (com.bytedance.android.live.core.model.startlive.a) body;
                            int i3 = aVar2.f7843a;
                            if (aVar2.f7844b instanceof Room) {
                                a3 = ((Room) aVar2.f7844b).message;
                            }
                            i = i3;
                        } else if (body instanceof Response) {
                            i = ((Response) body).getStatus();
                        } else if (body instanceof c) {
                            i = ((c) body).f7866a;
                        } else {
                            if (body instanceof com.bytedance.android.live.core.network.a.c) {
                                com.bytedance.android.live.core.network.a.b bVar = ((com.bytedance.android.live.core.network.a.c) body).f7854b;
                                if (bVar != null) {
                                    i2 = bVar.f7850a;
                                    optString = bVar.f7851b;
                                    int i4 = i2;
                                    a3 = optString;
                                    i = i4;
                                }
                            } else {
                                if (body instanceof com.bytedance.android.live.core.network.a.a) {
                                    com.bytedance.android.live.core.network.a.b bVar2 = ((com.bytedance.android.live.core.network.a.a) body).f7849b;
                                    if (bVar2 != null) {
                                        i2 = bVar2.f7850a;
                                        optString = bVar2.f7851b;
                                    }
                                } else if (body instanceof com.bytedance.android.live.core.network.response.a) {
                                    i = ((com.bytedance.android.live.core.network.response.a) body).f7866a;
                                } else if (body instanceof com.bytedance.android.live.core.network.response.b) {
                                    i = ((com.bytedance.android.live.core.network.response.b) body).f7870a;
                                } else {
                                    if (body instanceof String) {
                                        String str = (String) body;
                                        if (TextUtils.isEmpty(str)) {
                                            JSONObject a4 = a2.a(str);
                                            if (PatchProxy.isSupport(new Object[]{a4, "status_code", 0}, a2, a.f15643a, false, 10918, new Class[]{JSONObject.class, String.class, Integer.TYPE}, Integer.TYPE)) {
                                                a aVar3 = a2;
                                                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{a4, "status_code", 0}, aVar3, a.f15643a, false, 10918, new Class[]{JSONObject.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
                                            } else if (a4 == null) {
                                                i2 = 0;
                                            } else {
                                                i2 = a4.optInt("status_code", 0);
                                            }
                                            String str2 = "";
                                            String str3 = "message";
                                            if (PatchProxy.isSupport(new Object[]{a4, "message", ""}, a2, a.f15643a, false, 10919, new Class[]{JSONObject.class, String.class, String.class}, String.class)) {
                                                a aVar4 = a2;
                                                optString = (String) PatchProxy.accessDispatch(new Object[]{a4, str3, str2}, aVar4, a.f15643a, false, 10919, new Class[]{JSONObject.class, String.class, String.class}, String.class);
                                            } else {
                                                String str4 = str2;
                                                if (a4 == null) {
                                                    optString = str4;
                                                } else {
                                                    optString = a4.optString(str3, str4);
                                                }
                                            }
                                        }
                                    }
                                    i = 0;
                                }
                                int i42 = i2;
                                a3 = optString;
                                i = i42;
                            }
                            optString = a3;
                            i2 = 0;
                            int i422 = i2;
                            a3 = optString;
                            i = i422;
                        }
                        if (i != 0) {
                            String str5 = "";
                            List<Header> headers = raw.getHeaders();
                            if (headers != null && !headers.isEmpty()) {
                                for (Header next : headers) {
                                    if (next != null && "X-Tt-Logid".equals(next.getName())) {
                                        str5 = next.getValue();
                                    }
                                }
                            }
                            JSONObject jSONObject = new JSONObject();
                            a2.a(jSONObject, "xLogId", str5);
                            a2.a(jSONObject, "code", status);
                            a2.a(jSONObject, "status_code", i);
                            a2.a(jSONObject, PushConstants.WEB_URL, url);
                            a2.a(jSONObject, "message", a3);
                            a2.a(jSONObject, "classes", "com.bytedance.android.livesdk.network.ResponseInterceptor");
                            a.f15644b.b(com.bytedance.android.livesdk.j.a.b.Net.info, jSONObject);
                        }
                    }
                }
            }
        }
        Object body2 = ssResponse.body();
        if (body2 instanceof com.bytedance.android.live.core.model.startlive.a) {
            com.bytedance.android.live.core.model.startlive.a aVar5 = (com.bytedance.android.live.core.model.startlive.a) body2;
            if (aVar5.f7843a != 0) {
                if (aVar5.f7846d == null) {
                    aVar5.f7846d = new RequestError();
                }
                aVar5.f7846d.url = request.getUrl();
                aVar5.f7846d.message = ((Room) aVar5.f7844b).message;
                aVar5.f7846d.prompts = ((Room) aVar5.f7844b).prompts;
                com.bytedance.android.live.core.network.b.a.a(aVar5.f7843a, aVar5.f7846d, com.bytedance.android.live.a.a().toJson(aVar5.f7845c), a(ssResponse2));
            }
        } else if (body2 instanceof d) {
            d dVar = (d) body2;
            if (dVar.f7870a != 0) {
                if (dVar.f7873d == null) {
                    dVar.f7873d = new RequestError();
                }
                dVar.f7873d.url = request.getUrl();
                com.bytedance.android.live.core.network.b.a.a(dVar.f7870a, dVar.f7873d, dVar.f7872c, a(ssResponse2));
            }
        } else if (body2 instanceof c) {
            c cVar = (c) body2;
            if (cVar.f7866a != 0) {
                if (cVar.f7869d == null) {
                    cVar.f7869d = new RequestError();
                }
                cVar.f7869d.url = request.getUrl();
                com.bytedance.android.live.core.network.b.a.a(cVar.f7866a, cVar.f7869d, cVar.f7868c, a(ssResponse2));
            }
        } else if (body2 instanceof com.bytedance.android.live.core.network.a.c) {
            com.bytedance.android.live.core.network.a.c cVar2 = (com.bytedance.android.live.core.network.a.c) body2;
            if (!TextUtils.equals(cVar2.f7853a, "success") && cVar2.f7854b != null) {
                cVar2.f7854b.f7852c = request.getUrl();
                com.bytedance.android.live.core.network.b.a.a(cVar2.f7854b.f7850a, cVar2.f7854b, a(ssResponse2));
            }
        } else if (body2 instanceof com.bytedance.android.live.core.network.a.a) {
            com.bytedance.android.live.core.network.a.a aVar6 = (com.bytedance.android.live.core.network.a.a) body2;
            if (!TextUtils.equals(aVar6.f7848a, "success") && aVar6.f7849b != null) {
                aVar6.f7849b.f7852c = request.getUrl();
                com.bytedance.android.live.core.network.b.a.a(aVar6.f7849b.f7850a, aVar6.f7849b, a(ssResponse2));
            }
        } else {
            if (body2 instanceof com.bytedance.android.live.core.network.response.a) {
                com.bytedance.android.live.core.network.response.a aVar7 = (com.bytedance.android.live.core.network.response.a) body2;
                if (aVar7.f7866a != 0) {
                    if (aVar7.f7869d == null) {
                        aVar7.f7869d = new RequestError();
                    }
                    aVar7.f7869d.url = request.getUrl();
                    com.bytedance.android.live.core.network.b.a.a(aVar7.f7866a, aVar7.f7869d, (Extra) aVar7.f7868c, a(ssResponse2));
                } else if (aVar7.f7867b == null) {
                    throw new com.bytedance.android.live.a.a.a.c();
                }
            } else if (body2 instanceof com.bytedance.android.live.core.network.response.b) {
                com.bytedance.android.live.core.network.response.b bVar3 = (com.bytedance.android.live.core.network.response.b) body2;
                if (bVar3.f7870a != 0) {
                    if (bVar3.f7873d == null) {
                        bVar3.f7873d = new RequestError();
                    }
                    bVar3.f7873d.url = request.getUrl();
                    com.bytedance.android.live.core.network.b.a.a(bVar3.f7870a, bVar3.f7873d, (Extra) bVar3.f7872c, a(ssResponse2));
                } else if (bVar3.f7871b == null) {
                    throw new com.bytedance.android.live.a.a.a.c();
                }
            } else if (body2 instanceof String) {
                String str6 = (String) body2;
                if (!StringUtils.isEmpty(str6)) {
                    JSONObject jSONObject2 = new JSONObject(str6);
                    if (jSONObject2.has("data")) {
                        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f16731a, true, 12541, new Class[]{JSONObject.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f16731a, true, 12541, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
                        } else if (jSONObject2.has("status_code") && jSONObject2.optInt("status_code") == 0) {
                            z = true;
                        }
                        if (!z) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                            throw new com.bytedance.android.live.a.a.b.a(jSONObject2.optInt("status_code")).setErrorMsg(optJSONObject.optString("message", "")).setPrompt(optJSONObject.optString("prompts", "")).setExtra(jSONObject2.optString(PushConstants.EXTRA, "")).setAlert(optJSONObject.optString("alert", ""));
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
