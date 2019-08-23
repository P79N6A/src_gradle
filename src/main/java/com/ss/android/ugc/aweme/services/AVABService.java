package com.ss.android.ugc.aweme.services;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ab.IAVABService;
import com.ss.android.ugc.aweme.setting.AbTestManager;

@Keep
public class AVABService implements IAVABService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean isChallengeToHashTag() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71169, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71169, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager.a();
        return true;
    }
}
