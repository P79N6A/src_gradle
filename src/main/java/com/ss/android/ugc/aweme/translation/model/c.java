package com.ss.android.ugc.aweme.translation.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import com.ss.android.ugc.aweme.w.a.a;
import java.util.concurrent.Callable;

public final class c extends a<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74975a;

    public final void a(String str, String str2, String str3) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f74975a, false, 87293, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f74975a, false, 87293, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74976a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f74976a, false, 87294, new Class[0], Object.class)) {
                    return TranslationApi.a(str4, str5, str6);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f74976a, false, 87294, new Class[0], Object.class);
            }
        }, 0);
    }
}
