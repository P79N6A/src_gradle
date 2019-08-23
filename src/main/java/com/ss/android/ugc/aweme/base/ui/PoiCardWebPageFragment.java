package com.ss.android.ugc.aweme.base.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageFragment;
import com.ss.android.ugc.aweme.utils.c;

public class PoiCardWebPageFragment extends AdHalfWebPageFragment {
    public static ChangeQuickRedirect ah;
    private boolean am;

    public static PoiCardWebPageFragment a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, ah, true, 25101, new Class[]{Bundle.class}, PoiCardWebPageFragment.class)) {
            return (PoiCardWebPageFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, null, ah, true, 25101, new Class[]{Bundle.class}, PoiCardWebPageFragment.class);
        }
        PoiCardWebPageFragment poiCardWebPageFragment = new PoiCardWebPageFragment();
        poiCardWebPageFragment.setArguments(bundle2);
        poiCardWebPageFragment.al = bundle2.getBoolean("need_use_software_layer_type", false);
        poiCardWebPageFragment.am = bundle2.getBoolean("need_use_black_background", false);
        return poiCardWebPageFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, ah, false, 25102, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, ah, false, 25102, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        c.a((View) this.aj, 0.75f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.aj.getLayoutParams();
        if (this.am) {
            i4 = (int) UIUtils.dip2Px(getContext(), 32.0f);
            i3 = (int) UIUtils.dip2Px(getContext(), 4.0f);
            this.aj.setImageResource(2130839477);
            i2 = i4;
            i = i3;
        } else {
            i4 = (int) UIUtils.dip2Px(getContext(), 40.0f);
            i2 = (int) UIUtils.dip2Px(getContext(), 32.0f);
            this.aj.setImageResource(2130839476);
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 8.0f);
            i = (int) UIUtils.dip2Px(getContext(), 4.0f);
            i3 = dip2Px;
        }
        layoutParams.width = i4;
        layoutParams.height = i2;
        this.aj.setPadding(i3, i, i3, i);
    }
}
