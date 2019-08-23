package com.ss.android.ugc.aweme.global.config.settings;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public interface d {

    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49536a;

        /* renamed from: b  reason: collision with root package name */
        d f49537b;

        a(d dVar) {
            this.f49537b = dVar;
        }

        public final void a(@NonNull com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f49536a, false, 47556, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f49536a, false, 47556, new Class[]{com.ss.android.ugc.aweme.global.config.settings.pojo.a.class}, Void.TYPE);
                return;
            }
            if (this.f49537b != null) {
                this.f49537b.a(aVar);
            }
        }
    }

    void a(@NonNull com.ss.android.ugc.aweme.global.config.settings.pojo.a aVar);
}
