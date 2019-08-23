package com.ss.android.ad.splash.core.c;

import android.text.TextUtils;
import com.ss.android.ad.splash.utils.d;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f27633a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f27634b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, b> f27635c;

    /* renamed from: d  reason: collision with root package name */
    public List<b> f27636d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27637e;

    public static boolean a(List<b> list) {
        if (!d.b(list) || TextUtils.isEmpty(list.get(0).k())) {
            return false;
        }
        return true;
    }
}
