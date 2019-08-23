package com.ss.android.ugc.aweme.user.c;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;

@Deprecated
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75323a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f75324b = c.a(k.a(), "aweme_user", 0);

    /* renamed from: c  reason: collision with root package name */
    private Gson f75325c = new Gson();

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences.Editor f75326d = this.f75324b.edit();
}
