package com.ss.android.ugc.aweme.commercialize.views;

import android.os.Bundle;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.C0906R;

public class AdCornerBrowserFragment extends IESBrowserFragment {
    public static ChangeQuickRedirect ah;

    public final int a() {
        return C0906R.layout.n_;
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, ah, false, 32748, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, ah, false, 32748, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (b() != null) {
            String str = b().getSettings().getUserAgentString() + "/RevealType/Dialog";
            if (!StringUtils.isEmpty(str)) {
                b().getSettings().setUserAgentString(str);
            }
        }
    }
}
