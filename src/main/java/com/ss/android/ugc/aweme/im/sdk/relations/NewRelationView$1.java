package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter;
import java.util.List;

class NewRelationView$1 extends FrescoRecycleViewScrollListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51987b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f51988c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewRelationView$1(a aVar, Context context) {
        super(context);
        this.f51988c = aVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f51987b, false, 52671, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f51987b, false, 52671, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        int sectionForPosition = ((IndexerListAdapter) this.f51988c.p).getSectionForPosition(this.f51988c.g.findFirstVisibleItemPosition() - this.f51988c.p.c());
        List<String> list = ((b) this.f51988c.f22841d).f52111c.i;
        if (list != null && list.size() != 0 && sectionForPosition >= 0 && sectionForPosition < list.size()) {
            this.f51988c.f52027f.setCurrentIndex(list.get(sectionForPosition));
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51987b, false, 52672, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51987b, false, 52672, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (((float) i2) > UIUtils.dip2Px(this.f51988c.f22839b, 10.0f)) {
            b.a(this.f51988c.d(), (View) this.f51988c.m);
        }
    }
}
