package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.presenter.b;
import com.ss.android.ugc.aweme.q.c;

public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34598a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34599b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34600c = c.a(this.f34599b, "HotSearchCache", 0);

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34598a, false, 24217, new Class[0], String.class)) {
            return this.f34600c.getString("hot_search_words", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34598a, false, 24217, new Class[0], String.class);
    }

    public o(Context context) {
        this.f34599b = context;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34598a, false, 24218, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34598a, false, 24218, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34600c.edit();
        edit.putString("hot_search_words", str2);
        edit.apply();
    }
}
