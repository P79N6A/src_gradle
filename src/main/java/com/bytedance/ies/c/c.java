package com.bytedance.ies.c;

import com.meizu.cloud.pushsdk.notification.model.NotifyType;

public final class c {
    public static b a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = NotifyType.SOUND;
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        throw new b("Required field" + str + " not set:" + sb);
    }
}
