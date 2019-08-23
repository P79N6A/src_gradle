package com.bytedance.ies.dmt.ui.d;

import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.utils.ep;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {
    @Insert
    @TargetClass
    static a a(Context context, String str) {
        return ep.a(context) ? a.a(context, str, 1, 2, (int) UIUtils.dip2Px(context, 12.0f)) : ep.b(context) ? a.c(context, str, 1, 2) : a.d(context, str);
    }
}
