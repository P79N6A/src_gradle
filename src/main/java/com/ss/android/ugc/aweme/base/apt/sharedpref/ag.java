package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.setting.b.a;

public final class ag implements a.C0691a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34547a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34548b;

    /* renamed from: c  reason: collision with root package name */
    private Keva f34549c = Keva.getRepoFromSp(this.f34548b, "HateFulPreferences", 0);

    public ag(Context context) {
        this.f34548b = context;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34547a, false, 24397, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34547a, false, 24397, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f34549c.storeString(SearchNilInfo.HIT_HEAT_SPEECH, str2);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34547a, false, 24399, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34547a, false, 24399, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f34549c.storeString("hate_link", str2);
    }
}
