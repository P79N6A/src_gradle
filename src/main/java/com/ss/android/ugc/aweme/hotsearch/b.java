package com.ss.android.ugc.aweme.hotsearch;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49669a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListActivity f49670b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f49671c;

    /* renamed from: d  reason: collision with root package name */
    private final List f49672d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49673e;

    b(RankingListActivity rankingListActivity, RecyclerView recyclerView, List list, int i) {
        this.f49670b = rankingListActivity;
        this.f49671c = recyclerView;
        this.f49672d = list;
        this.f49673e = i;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49669a, false, 49537, new Class[0], Object.class)) {
            return this.f49670b.a(this.f49671c, this.f49672d, this.f49673e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49669a, false, 49537, new Class[0], Object.class);
    }
}
