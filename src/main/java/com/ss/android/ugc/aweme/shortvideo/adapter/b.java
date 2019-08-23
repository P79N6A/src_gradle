package com.ss.android.ugc.aweme.shortvideo.adapter;

import com.google.common.a.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel;

public final /* synthetic */ class b implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65499a;

    /* renamed from: b  reason: collision with root package name */
    private final RecordToolBarPlanCAdapter f65500b;

    /* renamed from: c  reason: collision with root package name */
    private final int f65501c;

    b(RecordToolBarPlanCAdapter recordToolBarPlanCAdapter, int i) {
        this.f65500b = recordToolBarPlanCAdapter;
        this.f65501c = i;
    }

    public final boolean apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f65499a, false, 74988, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f65499a, false, 74988, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        RecordToolBarPlanCAdapter recordToolBarPlanCAdapter = this.f65500b;
        return recordToolBarPlanCAdapter.a(recordToolBarPlanCAdapter.f65471b, (RecordToolBarModel) obj) == this.f65501c;
    }
}
