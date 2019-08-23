package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.a.a;
import com.ss.android.ugc.aweme.q.c;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f34573a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f34574b = c.a(this.f34573a, "MainTabPreferences", 0);

    public f(Context context) {
        this.f34573a = context;
    }
}
