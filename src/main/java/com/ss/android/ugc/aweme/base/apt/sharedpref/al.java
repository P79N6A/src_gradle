package com.ss.android.ugc.aweme.base.apt.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.story.shootvideo.b;

public final class al implements b {

    /* renamed from: a  reason: collision with root package name */
    private Context f34562a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f34563b = c.a(this.f34562a, "StoryFestivalPreloadSp", 0);

    public al(Context context) {
        this.f34562a = context;
    }
}
