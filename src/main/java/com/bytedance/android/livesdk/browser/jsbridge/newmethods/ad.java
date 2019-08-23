package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.bytedance.retrofit2.mime.d;
import com.bytedance.retrofit2.mime.e;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.io.File;

public final class ad extends c<a, b> implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9514a;

    /* renamed from: b  reason: collision with root package name */
    public p f9515b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f9516c;

    /* renamed from: d  reason: collision with root package name */
    public Disposable f9517d;

    /* renamed from: e  reason: collision with root package name */
    private int f9518e;

    static final class a {
        @SerializedName("aspect_x")

        /* renamed from: a  reason: collision with root package name */
        int f9522a;
        @SerializedName("aspect_y")

        /* renamed from: b  reason: collision with root package name */
        int f9523b;
        @SerializedName("min_width")

        /* renamed from: c  reason: collision with root package name */
        int f9524c;
        @SerializedName("min_height")

        /* renamed from: d  reason: collision with root package name */
        int f9525d;
        @SerializedName("max_size")

        /* renamed from: e  reason: collision with root package name */
        int f9526e;

        a() {
        }
    }

    static final class b {
        @SerializedName("uri")

        /* renamed from: a  reason: collision with root package name */
        String f9527a;
        @SerializedName("url")

        /* renamed from: b  reason: collision with root package name */
        String f9528b;

        private b(String str, String str2) {
            this.f9527a = str;
            this.f9528b = str2;
        }

        /* synthetic */ b(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9514a, false, 3716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9514a, false, 3716, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9514a, false, 3718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9514a, false, 3718, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9515b != null) {
            this.f9515b.c();
            this.f9515b = null;
        }
        d();
    }

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9514a, false, 3714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9514a, false, 3714, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9517d != null) {
            this.f9517d.dispose();
        }
        this.f9516c = null;
        this.f9515b.c();
    }

    public ad(Fragment fragment) {
        this.f9516c = fragment;
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        int i;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar, fVar}, this, f9514a, false, 3713, new Class[]{a.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, fVar}, this, f9514a, false, 3713, new Class[]{a.class, f.class}, Void.TYPE);
            return;
        }
        if (aVar.f9526e > 0) {
            i = aVar.f9526e;
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f9518e = i;
        p pVar = new p(null, this.f9516c, "upload_photo_method", aVar.f9522a, aVar.f9523b, aVar.f9524c, aVar.f9525d, this);
        this.f9515b = pVar;
        this.f9515b.a();
    }

    public final void a(final String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f9514a, false, 3715, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f9514a, false, 3715, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f9515b.b();
        File file = new File(str);
        if (!file.exists()) {
            b();
        } else if (file.length() >= ((long) this.f9518e)) {
            ai.a(ac.a((int) C0906R.string.d94, Integer.valueOf((this.f9518e / 1024) / 1024)));
        } else {
            d dVar = new d();
            dVar.a("data", new e("multipart/form-data", file));
            ((UploadApi) j.q().d().a(UploadApi.class)).upload(dVar).compose(i.a()).subscribe((SingleObserver<? super T>) new SingleObserver<com.bytedance.android.live.core.network.response.d<com.bytedance.android.live.base.model.user.j>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f9519a;

                public final void onSubscribe(Disposable disposable) {
                    ad.this.f9517d = disposable;
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f9519a, false, 3721, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f9519a, false, 3721, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    Context context = ad.this.f9516c.getContext();
                    if (context != null) {
                        com.bytedance.android.live.core.network.b.a.a(context, th);
                    }
                    ad.this.b();
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f9519a, false, 3720, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f9519a, false, 3720, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                        return;
                    }
                    ((com.bytedance.android.live.base.model.user.j) dVar.f7871b).f7771b = str;
                    ad adVar = ad.this;
                    com.bytedance.android.live.base.model.user.j jVar = (com.bytedance.android.live.base.model.user.j) dVar.f7871b;
                    String str = str;
                    if (PatchProxy.isSupport(new Object[]{jVar, str}, adVar, ad.f9514a, false, 3719, new Class[]{com.bytedance.android.live.base.model.user.j.class, String.class}, Void.TYPE)) {
                        ad adVar2 = adVar;
                        PatchProxy.accessDispatch(new Object[]{jVar, str}, adVar2, ad.f9514a, false, 3719, new Class[]{com.bytedance.android.live.base.model.user.j.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (adVar.f9515b != null) {
                        adVar.f9515b.c();
                        adVar.f9515b = null;
                    }
                    adVar.a(new b(jVar.f7770a, j.q().h().e().a(str), (byte) 0));
                }
            });
        }
    }
}
