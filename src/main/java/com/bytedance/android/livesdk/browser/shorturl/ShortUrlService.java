package com.bytedance.android.livesdk.browser.shorturl;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;

public final class ShortUrlService implements a {

    /* renamed from: a  reason: collision with root package name */
    private ShortUrlApi f9636a;

    interface ShortUrlApi {
        @GET("/hotsoon/share/link_command/")
        Observable<d<Object>> linkCommand(@Query(a = "url_schema_url") String str);

        @GET("/hotsoon/short_url/gene/")
        Observable<Object> shortenUrl(@Query(a = "long_url") String str, @Query(a = "target") String str2);
    }

    public static final class a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9637a;

        @NonNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f9637a, false, 3799, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new ShortUrlService((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9637a, false, 3799, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private ShortUrlService() {
        this.f9636a = (ShortUrlApi) j.q().d().a(ShortUrlApi.class);
    }

    /* synthetic */ ShortUrlService(byte b2) {
        this();
    }
}
