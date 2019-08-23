package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.livesdk.feed.d.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14517a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFeedViewModel f14518b;

    public w(LiveFeedViewModel liveFeedViewModel) {
        this.f14518b = liveFeedViewModel;
    }

    public final void a(String str, List list, Extra extra, boolean z) {
        String str2 = str;
        List list2 = list;
        Extra extra2 = extra;
        if (PatchProxy.isSupport(new Object[]{str2, list2, extra2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14517a, false, 9032, new Class[]{String.class, List.class, Extra.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, extra2, Byte.valueOf(z)}, this, f14517a, false, 9032, new Class[]{String.class, List.class, Extra.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14518b.a(str2, list2, extra2, z);
    }
}
