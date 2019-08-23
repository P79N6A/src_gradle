package com.bytedance.im.core.b.a;

import java.util.List;

public final class q {
    public static String a(List list, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i));
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
