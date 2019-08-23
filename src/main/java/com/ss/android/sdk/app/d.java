package com.ss.android.sdk.app;

import java.util.HashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<Integer, Integer> f30671a;

    public static int a(int i, boolean z) {
        if (z && f30671a != null && !f30671a.isEmpty()) {
            Integer num = f30671a.get(Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        }
        return i;
    }
}
