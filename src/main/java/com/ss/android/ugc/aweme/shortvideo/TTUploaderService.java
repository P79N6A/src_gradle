package com.ss.android.ugc.aweme.shortvideo;

import a.i;
import android.text.TextUtils;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.tools.AVApi;
import java.io.IOException;
import java.util.LinkedHashMap;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class TTUploaderService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65421a;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f65422c;
    @VideoType

    /* renamed from: b  reason: collision with root package name */
    public int f65423b;

    public @interface VideoType {
    }

    interface RetrofitService {
        @FormUrlEncoded
        @POST(a = "/aweme/v1/upload/authkey/")
        q<hf> getUploadAuthKeyConfig(@FieldMap LinkedHashMap<String, String> linkedHashMap);
    }

    static class a implements k<VideoCreation> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65426a;

        /* renamed from: b  reason: collision with root package name */
        private int f65427b;

        public final void onFailure(Throwable th) {
        }

        public a(@VideoType int i) {
            this.f65427b = i;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            VideoCreation videoCreation = (VideoCreation) obj;
            if (PatchProxy.isSupport(new Object[]{videoCreation}, this, f65426a, false, 74776, new Class[]{VideoCreation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{videoCreation}, this, f65426a, false, 74776, new Class[]{VideoCreation.class}, Void.TYPE);
                return;
            }
            TTUploaderService.f65422c = true;
            if (videoCreation instanceof hf) {
                com.ss.android.ugc.aweme.port.in.a.L.a(TTUploaderService.a(this.f65427b), com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) videoCreation));
            }
        }
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f65421a, true, 74773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f65421a, true, 74773, new Class[0], Void.TYPE);
        } else if (!f65422c) {
            i.a(gx.f68016b);
        }
    }

    public TTUploaderService(@VideoType int i) {
        this.f65423b = i;
    }

    public static e.a a(@VideoType int i) {
        if (i == 0) {
            return e.a.SdkV4AuthKey;
        }
        return e.a.StorySdkV4AuthKey;
    }

    public final q<VideoCreation> a(LinkedHashMap<String, String> linkedHashMap) {
        LinkedHashMap<String, String> linkedHashMap2;
        if (PatchProxy.isSupport(new Object[]{linkedHashMap}, this, f65421a, false, 74772, new Class[]{LinkedHashMap.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{linkedHashMap}, this, f65421a, false, 74772, new Class[]{LinkedHashMap.class}, q.class);
        }
        if (linkedHashMap == null) {
            linkedHashMap2 = new LinkedHashMap<>(0);
        } else {
            linkedHashMap2 = linkedHashMap;
        }
        q<hf> uploadAuthKeyConfig = ((RetrofitService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(RetrofitService.class)).getUploadAuthKeyConfig(linkedHashMap2);
        l.a(uploadAuthKeyConfig, new a(this.f65423b), v.a());
        return l.a(uploadAuthKeyConfig, IOException.class, new com.google.common.util.concurrent.e<IOException, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65424a;

            public final /* synthetic */ q a(Object obj) throws Exception {
                IOException iOException = (IOException) obj;
                if (PatchProxy.isSupport(new Object[]{iOException}, this, f65424a, false, 74775, new Class[]{IOException.class}, q.class)) {
                    return (q) PatchProxy.accessDispatch(new Object[]{iOException}, this, f65424a, false, 74775, new Class[]{IOException.class}, q.class);
                }
                String e2 = com.ss.android.ugc.aweme.port.in.a.L.e(TTUploaderService.a(TTUploaderService.this.f65423b));
                if (TextUtils.isEmpty(e2)) {
                    return l.a((Throwable) iOException);
                }
                return l.a(com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(e2, hf.class));
            }
        }, v.a());
    }
}
