package com.ss.android.ugc.aweme.discover.ui;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.utils.bg;

public class DiscoverDetailFragment extends DetailFragment {
    public static ChangeQuickRedirect m;

    public final void a() {
        Class cls;
        if (PatchProxy.isSupport(new Object[0], this, m, false, 37411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 37411, new Class[0], Void.TYPE);
            return;
        }
        MainPagerAdapter.a aVar = new MainPagerAdapter.a();
        if (PatchProxy.isSupport(new Object[0], this, m, false, 37412, new Class[0], Class.class)) {
            cls = (Class) PatchProxy.accessDispatch(new Object[0], this, m, false, 37412, new Class[0], Class.class);
        } else if (TextUtils.equals(this.f3008e.getFrom(), "from_discovery_v3")) {
            cls = DiscoverV3DetailPageFragment.class;
        } else {
            cls = DiscoverDetailPageFragment.class;
        }
        aVar.a(cls, "page_home", 0, 1.0f, getArguments()).a(ProfilePageFragment.class, "page_profile");
        this.f3007d = aVar.a(getFragmentManager());
        this.f3005b.setAdapter(this.f3007d);
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, m, false, 37413, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, m, false, 37413, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        super.a(aweme);
        bg.a(new ar(21, new DiscoveryCellStructV3(this.f3008e.getCellId(), getCurrentAweme(), this.f3008e.getIndex())));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, m, false, 37414, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, m, false, 37414, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(this.f3008e.getFrom(), "from_discovery_v3")) {
            super.a(z);
        }
    }
}
