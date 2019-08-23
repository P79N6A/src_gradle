package com.ss.android.ugc.aweme.hotsearch;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49770a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListIndependenceActivity f49771b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView f49772c;

    /* renamed from: d  reason: collision with root package name */
    private final List f49773d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49774e;

    g(RankingListIndependenceActivity rankingListIndependenceActivity, RecyclerView recyclerView, List list, int i) {
        this.f49771b = rankingListIndependenceActivity;
        this.f49772c = recyclerView;
        this.f49773d = list;
        this.f49774e = i;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f49770a, false, 49565, new Class[0], Object.class)) {
            return this.f49771b.a(this.f49772c, this.f49773d, this.f49774e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f49770a, false, 49565, new Class[0], Object.class);
    }
}
