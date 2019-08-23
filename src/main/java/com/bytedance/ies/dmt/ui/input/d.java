package com.bytedance.ies.dmt.ui.input;

import android.content.Context;
import com.bytedance.common.utility.UIUtils;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static int f20360a;

    public static int a(Context context) {
        if (f20360a <= 0) {
            return (int) UIUtils.dip2Px(context, 265.0f);
        }
        return f20360a;
    }
}
