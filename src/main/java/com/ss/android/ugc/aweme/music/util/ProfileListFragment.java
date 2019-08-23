package com.ss.android.ugc.aweme.music.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.profile.b.a;

public abstract class ProfileListFragment extends AmeBaseFragment implements b.a, a {
    public static ChangeQuickRedirect i;
    public boolean j;
    public String k;

    public abstract void J_();

    public void a(String str, String str2) {
    }

    public void a(boolean z) {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }

    public abstract boolean k();

    public abstract void l();

    public void r() {
    }

    public int s() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 60627, new Class[0], Integer.TYPE)) {
            return 0;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, i, false, 60627, new Class[0], Integer.TYPE)).intValue();
    }
}
