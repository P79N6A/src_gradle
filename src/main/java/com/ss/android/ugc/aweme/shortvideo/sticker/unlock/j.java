package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashSet;
import java.util.Set;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70218a;

    /* renamed from: b  reason: collision with root package name */
    Context f70219b;

    /* renamed from: c  reason: collision with root package name */
    public String f70220c;

    /* renamed from: d  reason: collision with root package name */
    SharedPreferences f70221d;

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences.Editor f70222e = this.f70221d.edit();

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f70223f = this.f70221d.getStringSet("remindedIds", new HashSet());

    public j(Context context, String str) {
        this.f70219b = context;
        this.f70220c = str;
        this.f70221d = c.a(context, str + "STICKER_RELATED", 0);
    }
}
