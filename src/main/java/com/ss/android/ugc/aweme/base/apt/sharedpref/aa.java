package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.u.c.a;

public final class aa implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f34530a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f34531b = c.a(this.f34530a, "LogpbPreference", 0);

    public aa(Context context) {
        this.f34530a = context;
    }
}
