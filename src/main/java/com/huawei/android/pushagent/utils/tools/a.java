package com.huawei.android.pushagent.utils.tools;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f25185a = "PushLogAC2815";

    public static boolean a(Context context) {
        boolean a2 = new h(context, "canStartPush").a("startPush");
        String str = f25185a;
        e.a(str, "get canStartPush Value is " + a2);
        return a2;
    }
}
