package com.ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.mvvm.e;
import com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter;
import java.util.List;
import java.util.Map;

class StoryFeedPanelViewModel$1 extends PageLoadingListMultiTypeAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f54926d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f54927e;

    @NonNull
    public final e b() {
        return null;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f54926d, false, 58264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54926d, false, 58264, new Class[0], Void.TYPE);
            return;
        }
        a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54928a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f54928a, false, 58265, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54928a, false, 58265, new Class[0], Void.TYPE);
                    return;
                }
                StoryFeedPanelViewModel$1.this.f54927e.a(true);
            }
        }, 500);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoryFeedPanelViewModel$1(c cVar, Context context, List list, Map map) {
        super(context, list, map);
        this.f54927e = cVar;
    }
}
