package com.ss.android.linkselector;

import com.ss.android.ugc.aweme.setting.AbTestManager;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {
    @Insert
    @TargetClass
    static boolean a(LinkSelector linkSelector) {
        if (AbTestManager.a().S() == 1) {
            return false;
        }
        return linkSelector.f2472a;
    }
}
