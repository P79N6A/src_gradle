package com.ss.android.ugc.aweme.story.base.utils;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.story.app.a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71957a;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f71958b = c.a(a.a().f71866b, "story_shared_preferences", 0);

    public static boolean a(String str, boolean z) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, (byte) 0}, null, f71957a, true, 82309, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return f71958b.getBoolean(str2, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, null, f71957a, true, 82309, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static void b(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 1}, null, f71957a, true, 82312, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, (byte) 1}, null, f71957a, true, 82312, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        f71958b.edit().putBoolean(str2, true).commit();
    }
}
