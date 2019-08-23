package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener$$CC;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public final /* synthetic */ class v implements SearchStateViewModel.IHotSearchListListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43199a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchAndDiscoveryFragment2 f43200b;

    v(HotSearchAndDiscoveryFragment2 hotSearchAndDiscoveryFragment2) {
        this.f43200b = hotSearchAndDiscoveryFragment2;
    }

    public final void onHotSearchWordsFlipper(List list, LogPbBean logPbBean, List list2) {
        if (PatchProxy.isSupport(new Object[]{list, logPbBean, list2}, this, f43199a, false, 37645, new Class[]{List.class, LogPbBean.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, logPbBean, list2}, this, f43199a, false, 37645, new Class[]{List.class, LogPbBean.class, List.class}, Void.TYPE);
            return;
        }
        SearchStateViewModel$IHotSearchListListener$$CC.onHotSearchWordsFlipper(this, list, logPbBean, list2);
    }

    public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
        String str3 = str;
        String str4 = str2;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{str3, str4, logPbBean2}, this, f43199a, false, 37644, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, logPbBean2}, this, f43199a, false, 37644, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE);
            return;
        }
        this.f43200b.b(str3, str4, logPbBean2);
    }
}
