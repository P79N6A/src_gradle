package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;

class RelationView$1 extends FrescoRecycleViewScrollListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52012b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f52013c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RelationView$1(c cVar, Context context) {
        super(context);
        this.f52013c = cVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f52012b, false, 52760, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f52012b, false, 52760, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        b.a(this.f52013c.d(), (View) this.f52013c.m);
    }
}
