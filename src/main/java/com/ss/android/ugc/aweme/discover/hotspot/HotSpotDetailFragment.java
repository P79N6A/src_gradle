package com.ss.android.ugc.aweme.discover.hotspot;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailFragment;", "Lcom/ss/android/ugc/aweme/detail/ui/DetailFragment;", "()V", "buildFragmentAdapter", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotDetailFragment extends DetailFragment {
    public static ChangeQuickRedirect m;
    public static final a n = new a((byte) 0);
    private HashMap o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailFragment;", "param", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42405a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, m, false, 36427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 36427, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.clear();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 36425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 36425, new Class[0], Void.TYPE);
            return;
        }
        MainPagerAdapter.a aVar = new MainPagerAdapter.a();
        aVar.a(HotSpotDetailPageFragment.class, "page_home", 0, 1.0f, getArguments()).a(ProfilePageFragment.class, "page_profile");
        this.f3007d = aVar.a(getFragmentManager());
        ScrollableViewPager scrollableViewPager = this.f3005b;
        Intrinsics.checkExpressionValueIsNotNull(scrollableViewPager, "mViewPager");
        scrollableViewPager.setAdapter(this.f3007d);
    }
}
