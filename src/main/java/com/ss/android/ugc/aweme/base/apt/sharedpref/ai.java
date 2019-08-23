package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.shortvideo.ho;

public final class ai implements ho {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34553a;

    /* renamed from: b  reason: collision with root package name */
    private Context f34554b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f34555c = c.a(this.f34554b, "VideoRecorder", 0);

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34553a, false, 24403, new Class[0], String.class)) {
            return this.f34555c.getString("activationCode", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f34553a, false, 24403, new Class[0], String.class);
    }

    public ai(Context context) {
        this.f34554b = context;
    }
}
