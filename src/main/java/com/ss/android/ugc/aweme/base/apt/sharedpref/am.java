package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.c;

public final class am implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34564a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34565b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34566c = com.ss.android.ugc.aweme.q.c.a(this.f34565b, "HashtagConfig", 0);

    public am(Context context) {
        this.f34565b = context;
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f34564a, false, 24415, new Class[]{String.class}, String.class)) {
            return this.f34566c.getString("hash_tag_regex", str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f34564a, false, 24415, new Class[]{String.class}, String.class);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34564a, false, 24416, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34564a, false, 24416, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = this.f34566c.edit();
        edit.putString("hash_tag_regex", str2);
        edit.apply();
    }
}
