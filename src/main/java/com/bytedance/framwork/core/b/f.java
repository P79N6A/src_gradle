package com.bytedance.framwork.core.b;

import android.content.Context;
import com.ss.android.common.util.ToolUtils;
import com.taobao.android.dexposed.ClassUtils;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static String f20145a;

    /* renamed from: b  reason: collision with root package name */
    private static String f20146b;

    public static String a(Context context) {
        if (f20146b == null) {
            String replace = ToolUtils.getCurProcessName(context).replace(context.getPackageName(), "p").replace(":", "_");
            f20146b = replace;
            f20146b = replace.replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        return f20146b;
    }
}
