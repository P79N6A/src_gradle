package com.ss.android.ugc.aweme.story.feed.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73000a;

    /* renamed from: b  reason: collision with root package name */
    private static a f73001b;

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f73000a, true, 84382, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f73000a, true, 84382, new Class[0], a.class);
        }
        if (f73001b == null) {
            synchronized (a.class) {
                if (f73001b == null) {
                    f73001b = new a();
                }
            }
        }
        return f73001b;
    }

    public final b<String> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73000a, false, 84383, new Class[]{String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f73000a, false, 84383, new Class[]{String.class}, b.class);
        }
        com.ss.android.ugc.aweme.story.base.a.a a2 = com.ss.android.ugc.aweme.story.base.a.a.a();
        return a2.a("recommend_message" + str2, String.class);
    }
}
