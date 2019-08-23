package com.ss.android.ugc.aweme.u.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f75101a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f75102b = true;

    public static class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75103a;

        /* renamed from: b  reason: collision with root package name */
        private String f75104b;

        /* renamed from: c  reason: collision with root package name */
        private JSONObject f75105c;

        public final Object call() throws Exception {
            if (PatchProxy.isSupport(new Object[0], this, f75103a, false, 58982, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f75103a, false, 58982, new Class[0], Object.class);
            }
            r.a(this.f75104b, this.f75105c);
            a.a(this.f75104b, this.f75105c);
            return null;
        }

        public a(String str, JSONObject jSONObject) {
            this.f75104b = str;
            this.f75105c = jSONObject;
        }
    }
}
