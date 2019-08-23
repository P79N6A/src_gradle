package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50926a;

    /* renamed from: b  reason: collision with root package name */
    public a f50927b;

    /* renamed from: c  reason: collision with root package name */
    private OkHttpClient f50928c;

    public interface a {
        void a(double d2);

        void a(String str, UrlModel urlModel);

        void a(Throwable th);
    }

    public f(OkHttpClient okHttpClient) {
        this.f50928c = okHttpClient;
    }

    private void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50926a, false, 51245, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50926a, false, 51245, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f50927b != null) {
            this.f50927b.a(th);
        }
    }

    public final Response a(String str, UrlModel urlModel) {
        boolean z;
        Request request;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, urlModel}, this, f50926a, false, 51242, new Class[]{String.class, UrlModel.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{str2, urlModel}, this, f50926a, false, 51242, new Class[]{String.class, UrlModel.class}, Response.class);
        }
        Response response = null;
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.ave).a();
            a(new IllegalStateException("network is unavailable"));
            return null;
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            a(new IllegalStateException("url is null"));
            return null;
        } else {
            if (PatchProxy.isSupport(new Object[]{str2}, this, f50926a, false, 51244, new Class[]{String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f50926a, false, 51244, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                z = true;
            }
            if (!z) {
                a(new IllegalStateException("file not exist"));
                return null;
            }
            for (int i = 0; i < urlModel.getUrlList().size(); i++) {
                String str3 = urlModel.getUrlList().get(i);
                if (PatchProxy.isSupport(new Object[]{str3}, this, f50926a, false, 51243, new Class[]{String.class}, Request.class)) {
                    request = (Request) PatchProxy.accessDispatch(new Object[]{str3}, this, f50926a, false, 51243, new Class[]{String.class}, Request.class);
                } else {
                    request = new Request.Builder().url(str3).addHeader("Host", URI.create(str3).getHost()).build();
                    if (this.f50928c == null) {
                        this.f50928c = new OkHttpClient();
                    }
                    this.f50928c.setConnectTimeout(60000, TimeUnit.MILLISECONDS);
                    this.f50928c.setWriteTimeout(60000, TimeUnit.MILLISECONDS);
                    this.f50928c.setReadTimeout(60000, TimeUnit.MILLISECONDS);
                    this.f50928c.setRetryOnConnectionFailure(true);
                }
                try {
                    response = this.f50928c.newCall(request).execute();
                } catch (Exception unused) {
                }
                if (response != null && response.isSuccessful()) {
                    break;
                }
            }
            return response;
        }
    }
}
