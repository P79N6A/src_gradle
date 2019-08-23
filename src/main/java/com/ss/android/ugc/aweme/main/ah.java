package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.main.MainFragment;

public final /* synthetic */ class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54327a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment.AnonymousClass4 f54328b;

    /* renamed from: c  reason: collision with root package name */
    private final SearchResultParam f54329c;

    ah(MainFragment.AnonymousClass4 r1, SearchResultParam searchResultParam) {
        this.f54328b = r1;
        this.f54329c = searchResultParam;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54327a, false, 57350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54327a, false, 57350, new Class[0], Void.TYPE);
            return;
        }
        MainFragment.AnonymousClass4 r0 = this.f54328b;
        SearchResultParam searchResultParam = this.f54329c;
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, r0, MainFragment.AnonymousClass4.f54197a, false, 57349, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            Object[] objArr = {searchResultParam};
            MainFragment.AnonymousClass4 r9 = r0;
            PatchProxy.accessDispatch(objArr, r9, MainFragment.AnonymousClass4.f54197a, false, 57349, new Class[]{SearchResultParam.class}, Void.TYPE);
        } else if (b.e()) {
            HotSpotDetailActivity.a(MainFragment.this.mHotRightSearchGuideView.getContext(), searchResultParam);
        } else {
            SearchResultActivity.a(MainFragment.this.mHotRightSearchGuideView.getContext(), searchResultParam);
        }
    }
}
