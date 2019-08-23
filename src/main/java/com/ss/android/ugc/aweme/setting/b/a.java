package com.ss.android.ugc.aweme.setting.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.base.utils.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63853a;

    /* renamed from: b  reason: collision with root package name */
    private static String f63854b = d.a().getString(C0906R.string.c2q);

    /* renamed from: c  reason: collision with root package name */
    private static String f63855c = d.a().getString(C0906R.string.c2r);

    /* renamed from: d  reason: collision with root package name */
    private static b f63856d = null;

    /* renamed from: com.ss.android.ugc.aweme.setting.b.a$a  reason: collision with other inner class name */
    public interface C0691a {
        void a(String str);

        void b(String str);
    }

    public static void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f63853a, true, 72222, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f63853a, true, 72222, new Class[]{b.class}, Void.TYPE);
        } else if (bVar2 != null) {
            f63856d = bVar2;
            try {
                C0691a aVar = (C0691a) c.a(d.a(), C0691a.class);
                if (!TextUtils.isEmpty(bVar2.f63857a)) {
                    if (!TextUtils.isEmpty(bVar2.f63858b)) {
                        aVar.a(bVar2.f63857a);
                        aVar.b(bVar2.f63858b);
                    }
                }
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.util.c.a("HateFulPreferences getSP failed " + th.getMessage());
            }
        }
    }
}
