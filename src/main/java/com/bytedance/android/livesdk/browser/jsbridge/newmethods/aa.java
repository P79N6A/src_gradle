package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class aa extends c<b, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9500a;

    /* renamed from: b  reason: collision with root package name */
    private a f9501b;

    public interface a {
        void a(com.bytedance.android.livesdk.browser.g.b bVar);
    }

    static final class b {
        @SerializedName("data")

        /* renamed from: a  reason: collision with root package name */
        a f9502a;

        static final class a {
            @SerializedName("title")

            /* renamed from: a  reason: collision with root package name */
            String f9503a;
            @SerializedName("desc")

            /* renamed from: b  reason: collision with root package name */
            String f9504b;
            @SerializedName("image")

            /* renamed from: c  reason: collision with root package name */
            String f9505c;
            @SerializedName("url")

            /* renamed from: d  reason: collision with root package name */
            String f9506d;
        }

        b() {
        }
    }

    public final void d_() {
        this.f9501b = null;
    }

    public aa(a aVar) {
        this.f9501b = aVar;
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar, fVar}, this, f9500a, false, 3703, new Class[]{b.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, fVar}, this, f9500a, false, 3703, new Class[]{b.class, f.class}, Void.TYPE);
            return;
        }
        this.f9501b.a(new com.bytedance.android.livesdk.browser.g.b(bVar.f9502a.f9503a, bVar.f9502a.f9504b, bVar.f9502a.f9505c, bVar.f9502a.f9506d));
        c();
    }
}
