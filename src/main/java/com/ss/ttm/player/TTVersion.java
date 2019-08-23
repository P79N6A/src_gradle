package com.ss.ttm.player;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class TTVersion {
    public static final String VERSION_NAME = "2.9.5.308";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void saveVersionInfo() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91132, new Class[0], Void.TYPE);
            return;
        }
        TTPlayerConfiger.setValue(15, "version name:2.9.5.308,version code:295308,ttplayer release was built by tiger at 2019-08-01 16:50:37 on origin/master branch, commit b61c430005e42e1ac1b9123fa499a6c44f7a0f9f");
        TTPlayerConfiger.setValue(13, 295308);
        TTPlayerConfiger.setValue(14, VERSION_NAME);
    }
}
