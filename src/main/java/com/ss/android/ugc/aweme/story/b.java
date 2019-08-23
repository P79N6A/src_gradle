package com.ss.android.ugc.aweme.story;

import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71873a;

    /* renamed from: b  reason: collision with root package name */
    private static b f71874b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f71875c = new HashSet();

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f71873a, true, 82139, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f71873a, true, 82139, new Class[0], b.class);
        }
        if (f71874b == null) {
            synchronized (b.class) {
                if (f71874b == null) {
                    f71874b = new b();
                }
            }
        }
        return f71874b;
    }

    private void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71873a, false, 82144, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f71873a, false, 82144, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f71875c.add(str2);
    }

    public final boolean b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f71873a, false, 82145, new Class[]{String.class}, Boolean.TYPE)) {
            return this.f71875c.contains(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f71873a, false, 82145, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71873a, false, 82143, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f71873a, false, 82143, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            i.a((Callable<TResult>) new Callable<BaseResponse>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71876a;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f71876a, false, 82148, new Class[0], BaseResponse.class)) {
                        return (BaseResponse) PatchProxy.accessDispatch(new Object[0], this, f71876a, false, 82148, new Class[0], BaseResponse.class);
                    }
                    String str = str2;
                    if (!PatchProxy.isSupport(new Object[]{str}, null, StoryApi.f71828a, true, 82150, new Class[]{String.class}, BaseResponse.class)) {
                        return (BaseResponse) StoryApi.f71829b.markRead(str).execute().body();
                    }
                    return (BaseResponse) PatchProxy.accessDispatch(new Object[]{str}, null, StoryApi.f71828a, true, 82150, new Class[]{String.class}, BaseResponse.class);
                }
            });
            c(str);
        }
    }
}
