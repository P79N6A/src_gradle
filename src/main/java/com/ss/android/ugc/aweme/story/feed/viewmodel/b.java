package com.ss.android.ugc.aweme.story.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.a.a;
import java.util.HashSet;
import java.util.Set;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73002a;

    /* renamed from: c  reason: collision with root package name */
    private static b f73003c;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f73004b = new HashSet();

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f73002a, true, 84400, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f73002a, true, 84400, new Class[0], b.class);
        }
        if (f73003c == null) {
            synchronized (b.class) {
                if (f73003c == null) {
                    f73003c = new b();
                }
            }
        }
        return f73003c;
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.b<String> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73002a, false, 84401, new Class[]{String.class}, com.ss.android.ugc.aweme.arch.widgets.base.b.class)) {
            return (com.ss.android.ugc.aweme.arch.widgets.base.b) PatchProxy.accessDispatch(new Object[]{str2}, this, f73002a, false, 84401, new Class[]{String.class}, com.ss.android.ugc.aweme.arch.widgets.base.b.class);
        }
        this.f73004b.add(str2);
        a a2 = a.a();
        return a2.a("story_message" + str2, String.class);
    }
}
