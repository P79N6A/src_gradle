package com.ss.android.ugc.aweme.sec;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sec.c;
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63772a;

    static final class a extends f<Response> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63773a;
        public Interceptor.Chain i;
        public Response j;

        public final c<Response> d() {
            if (!PatchProxy.isSupport(new Object[0], this, f63773a, false, 71111, new Class[0], c.class)) {
                return new c.a<Response>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63774a;

                    public final /* bridge */ /* synthetic */ Object a() {
                        return a.this.j;
                    }

                    public final /* synthetic */ Object b() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f63774a, false, 71112, new Class[0], Response.class)) {
                            return (Response) PatchProxy.accessDispatch(new Object[0], this, f63774a, false, 71112, new Class[0], Response.class);
                        }
                        a.this.i.request().url();
                        Interceptor.Chain chain = a.this.i;
                        if (PatchProxy.isSupport(new Object[]{chain}, null, i.f63772a, true, 71109, new Class[]{Interceptor.Chain.class}, Response.class)) {
                            return (Response) PatchProxy.accessDispatch(new Object[]{chain}, null, i.f63772a, true, 71109, new Class[]{Interceptor.Chain.class}, Response.class);
                        }
                        Request request = chain.request();
                        String valueOf = String.valueOf(System.currentTimeMillis());
                        Request.Builder url = request.newBuilder().url(request.url());
                        if (PatchProxy.isSupport(new Object[]{request, valueOf, url}, null, i.f63772a, true, 71110, new Class[]{Request.class, String.class, Request.Builder.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{request, valueOf, url}, null, i.f63772a, true, 71110, new Class[]{Request.class, String.class, Request.Builder.class}, Void.TYPE);
                        } else {
                            FormBody formBody = (FormBody) request.body();
                            if (formBody != null && formBody.size() > 0) {
                                FormBody.Builder builder = new FormBody.Builder();
                                for (int i = 0; i < formBody.size(); i++) {
                                    if (TextUtils.equals(formBody.encodedName(i), "_rticket")) {
                                        builder.addEncoded(formBody.encodedName(i), valueOf);
                                    } else {
                                        builder.addEncoded(formBody.encodedName(i), formBody.encodedValue(i));
                                    }
                                }
                                url.method(request.method(), builder.build());
                            }
                        }
                        return chain.proceed(url.build());
                    }
                };
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f63773a, false, 71111, new Class[0], c.class);
        }

        private a(Interceptor.Chain chain, Response response) {
            this.i = chain;
            this.j = response;
        }

        /* synthetic */ a(Interceptor.Chain chain, Response response, byte b2) {
            this(chain, response);
        }
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f63772a, false, 71108, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, f63772a, false, 71108, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Response proceed = chain2.proceed(chain.request());
        String header = proceed.header("Content-Type");
        Request request = proceed.request();
        String str = "";
        if (!(request == null || request.url() == null)) {
            str = request.url().toString();
        }
        if (TextUtils.isEmpty(header)) {
            return proceed;
        }
        if ((!TextUtils.isEmpty(header) && !header.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return proceed;
        }
        String a2 = e.a(proceed);
        if (!TextUtils.isEmpty(a2)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                a aVar = new a(chain2, proceed, (byte) 0);
                if (aVar.a(chain.request().url().toString(), jSONObject)) {
                    return (Response) aVar.c();
                }
            } catch (Exception | InterruptedException | JSONException unused) {
            }
        }
        return proceed;
    }
}
