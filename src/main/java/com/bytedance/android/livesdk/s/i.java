package com.bytedance.android.livesdk.s;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.wallet.m;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17131a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17144a;

        /* renamed from: b  reason: collision with root package name */
        public String f17145b;

        /* renamed from: c  reason: collision with root package name */
        public String f17146c;

        /* renamed from: d  reason: collision with root package name */
        public String f17147d;

        a(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split(";")) {
                    if (str2.startsWith("resultStatus")) {
                        this.f17145b = a(str2, "resultStatus");
                    } else if (str2.startsWith("result")) {
                        this.f17146c = a(str2, "result");
                    } else if (str2.startsWith("memo")) {
                        this.f17147d = a(str2, "memo");
                    }
                }
            }
        }

        private String a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f17144a, false, 12906, new Class[]{String.class, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f17144a, false, 12906, new Class[]{String.class, String.class}, String.class);
            }
            String str5 = str4 + "={";
            return str3.substring(str3.indexOf(str5) + str5.length(), str3.lastIndexOf("}"));
        }
    }

    public static final class b implements h.b<m> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17148a;

        @NonNull
        public final h.b.a<m> a(h.b.a<m> aVar) {
            h.b.a<m> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17148a, false, 12907, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new i()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17148a, false, 12907, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final void a(Activity activity, c cVar, boolean z, n.a aVar) {
        final Activity activity2 = activity;
        final c cVar2 = cVar;
        final n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, cVar2, (byte) 1, aVar2}, this, f17131a, false, 12902, new Class[]{Activity.class, c.class, Boolean.TYPE, n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, cVar2, (byte) 1, aVar2}, this, f17131a, false, 12902, new Class[]{Activity.class, c.class, Boolean.TYPE, n.a.class}, Void.TYPE);
            return;
        }
        Observable.fromCallable(new Callable<String>(true) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17139a;

            public final /* synthetic */ Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f17139a, false, 12905, new Class[0], String.class)) {
                    return new com.alipay.sdk.app.b(activity2).a(cVar2.g, true);
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, f17139a, false, 12905, new Class[0], String.class);
            }
        }).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new Consumer<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17132a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f17132a, false, 12903, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f17132a, false, 12903, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                a aVar = new a(str);
                aVar2.a(r.ALIPAY, cVar2.f18695a, aVar.f17145b, aVar.f17147d);
            }
        }, new Consumer<Throwable>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17136a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f17136a, false, 12904, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f17136a, false, 12904, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                aVar2.a(r.ALIPAY, th);
            }
        });
    }
}
