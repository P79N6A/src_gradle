package com.ss.android.ugc.aweme.main.story.live;

import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.story.live.a.a;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.aweme.main.story.live.view.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54975a;

    public static a a(Context context, boolean z) {
        a aVar;
        Context context2 = context;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f54975a, true, 58267, new Class[]{Context.class, Boolean.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f54975a, true, 58267, new Class[]{Context.class, Boolean.TYPE}, a.class);
        }
        int aG = AbTestManager.a().aG();
        AbsLiveStoryItemView absLiveStoryItemView = null;
        if (aG == 1) {
            absLiveStoryItemView = new com.ss.android.ugc.aweme.main.story.live.view.b(context2, z2);
            absLiveStoryItemView.setPadding((int) UIUtils.dip2Px(context2, 16.0f), 0, 0, 0);
            aVar = new com.ss.android.ugc.aweme.main.story.live.a.b();
        } else if (aG == 0) {
            absLiveStoryItemView = new c(context2, z2);
            absLiveStoryItemView.setPadding((int) UIUtils.dip2Px(context2, 16.0f), (int) UIUtils.dip2Px(context2, 2.0f), 0, 0);
            aVar = new com.ss.android.ugc.aweme.main.story.live.a.c();
        } else {
            aVar = null;
        }
        aVar.a(absLiveStoryItemView);
        return new c(absLiveStoryItemView, aVar);
    }
}
