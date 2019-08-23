package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ay;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75574a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f75575b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ay.a f75578a;

        /* renamed from: b  reason: collision with root package name */
        public ay.c f75579b;

        /* renamed from: c  reason: collision with root package name */
        public ay.d f75580c;

        /* renamed from: d  reason: collision with root package name */
        public ay.b f75581d;
    }

    public static void a(Context context, Map<String, String> map) {
        Context context2 = context;
        final Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, map2}, null, f75574a, true, 88210, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, map2}, null, f75574a, true, 88210, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        Single.fromCallable(new bb(context2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((SingleObserver<? super T>) new SingleObserver<a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75576a;

            public final void onError(Throwable th) {
            }

            public final void onSubscribe(Disposable disposable) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                a aVar = (a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f75576a, false, 88213, new Class[]{a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f75576a, false, 88213, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                ay.a aVar2 = aVar.f75578a;
                ay.c cVar = aVar.f75579b;
                ay.d dVar = aVar.f75580c;
                ay.b bVar = aVar.f75581d;
                d a2 = d.a().a("cpu_vendor", aVar2.f75552a).a("cpu_core_nums", aVar2.f75554c).a("cpu_freq", aVar2.f75553b).a("screen_dpi", cVar.f75557a).a("screen_width", cVar.f75558b).a("screen_height", cVar.f75559c).a("storage_total_external_size", dVar.f75561b).a("storage_available_external_size", dVar.f75560a).a("storage_total_internal_size", dVar.f75563d).a("storage_available_internal_size", dVar.f75562c).a("memory_total_size", bVar.f75555a).a("memory_available_size", bVar.f75556b).a("brand", Build.BRAND).a("os_version", Build.VERSION.RELEASE).a("os_api_level", Build.VERSION.SDK_INT).a("Board", Build.BOARD).a("brand", Build.BRAND).a("device", Build.DEVICE).a("hardware", Build.HARDWARE).a("manufacturer", Build.MANUFACTURER).a("model", Build.MODEL).a("product", Build.PRODUCT);
                if (PatchProxy.isSupport(new Object[0], null, ay.f75549a, true, 88196, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], null, ay.f75549a, true, 88196, new Class[0], String.class);
                } else {
                    if (PatchProxy.isSupport(new Object[0], null, ay.e.f75565a, true, 88206, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], null, ay.e.f75565a, true, 88206, new Class[0], String.class);
                    } else {
                        str = ay.e.f75566b.a();
                    }
                }
                d a3 = a2.a("abis", str);
                if (map2 != null) {
                    str2 = (String) map2.get("GL_VENDOR");
                } else {
                    str2 = "";
                }
                d a4 = a3.a("GL_VENDOR", str2);
                if (map2 != null) {
                    str3 = (String) map2.get("GL_VERSION");
                } else {
                    str3 = "";
                }
                d a5 = a4.a("GL_VERSION", str3);
                if (map2 != null) {
                    str4 = (String) map2.get("GL_RENDERER");
                } else {
                    str4 = "";
                }
                d a6 = a5.a("GL_RENDERER", str4);
                if (map2 != null) {
                    str5 = (String) map2.get("GL_EXTENSIONS");
                } else {
                    str5 = "";
                }
                d a7 = a6.a("GL_EXTENSIONS", str5);
                if (map2 != null) {
                    str6 = (String) map2.get("EGL_VENDOR");
                } else {
                    str6 = "";
                }
                d a8 = a7.a("EGL_VENDOR", str6);
                if (map2 != null) {
                    str7 = (String) map2.get("EGL_VERSION");
                } else {
                    str7 = "";
                }
                d a9 = a8.a("EGL_VERSION", str7);
                if (map2 != null) {
                    str8 = (String) map2.get("EGL_EXTENSIONS");
                } else {
                    str8 = "";
                }
                r.a("device_info", (Map) a9.a("EGL_EXTENSIONS", str8).f34114b);
            }
        });
    }
}
