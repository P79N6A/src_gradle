package com.ss.android.ugc.aweme.im.sdk.chat.input.indicator;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.widget.HorizontalSpaceItemDecoration;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50645a;

    /* renamed from: b  reason: collision with root package name */
    private EmojiIndicatorAdapter f50646b = new EmojiIndicatorAdapter();

    public final int a() {
        return this.f50646b.f50637b;
    }

    public b(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new HorizontalSpaceItemDecoration((int) UIUtils.dip2Px(recyclerView.getContext(), 8.0f)));
        recyclerView.setAdapter(this.f50646b);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50645a, false, 50929, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50645a, false, 50929, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f50646b.a(i);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50645a, false, 50930, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50645a, false, 50930, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f50646b.a(i, i2);
    }
}
