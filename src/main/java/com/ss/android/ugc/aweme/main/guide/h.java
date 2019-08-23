package com.ss.android.ugc.aweme.main.guide;

import android.arch.lifecycle.MutableLiveData;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54831a;
    private static volatile h g;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f54832b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public String f54833c;

    /* renamed from: d  reason: collision with root package name */
    public int f54834d;

    /* renamed from: e  reason: collision with root package name */
    public int f54835e;

    /* renamed from: f  reason: collision with root package name */
    public MutableLiveData<Pair<Integer, Integer>> f54836f = new MutableLiveData<>();

    private h() {
    }

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f54831a, true, 58108, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f54831a, true, 58108, new Class[0], h.class);
        }
        if (g == null) {
            synchronized (h.class) {
                if (g == null) {
                    g = new h();
                }
            }
        }
        return g;
    }
}
