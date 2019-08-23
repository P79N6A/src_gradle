package com.ss.android.common.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.q.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28285a;

    /* renamed from: b  reason: collision with root package name */
    final SharedPreferences f28286b;

    /* renamed from: c  reason: collision with root package name */
    private Context f28287c;

    /* renamed from: d  reason: collision with root package name */
    private int f28288d = 7200;

    /* renamed from: e  reason: collision with root package name */
    private int f28289e = 7200;

    /* renamed from: f  reason: collision with root package name */
    private long f28290f;
    private long g;

    public i(Context context) {
        this.f28287c = context;
        this.f28286b = c.a(this.f28287c, "ss_location", 0);
        this.g = this.f28286b.getLong("use_city_show_last_time", 0);
        this.f28290f = this.f28286b.getLong("locale_setting_show_last_time", 0);
        this.f28288d = this.f28286b.getInt("dialog_show_interval", 7200);
        this.f28289e = this.f28286b.getInt("dialog_show_interval", 7200);
    }
}
