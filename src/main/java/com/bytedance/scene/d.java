package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.scene.b.h;
import com.bytedance.scene.b.j;
import com.bytedance.scene.i;
import com.bytedance.scene.navigation.e;
import com.bytedance.scene.navigation.g;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f22088a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Activity, HashSet<String>> f22089b = new WeakHashMap<>();

    private static void a(FragmentTransaction fragmentTransaction) {
        if (Build.VERSION.SDK_INT >= 24) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    private static void a(@NonNull Activity activity, @NonNull String str) {
        if (f22089b.get(activity) == null || !f22089b.get(activity).contains(str)) {
            HashSet hashSet = f22089b.get(activity);
            if (hashSet == null) {
                hashSet = new HashSet();
                f22089b.put(activity, hashSet);
            }
            hashSet.add(str);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
    }

    @NonNull
    public static g a(@NonNull Activity activity, @Nullable Bundle bundle, @NonNull g gVar, boolean z) {
        return a(activity, 16908290, bundle, gVar, (f) null, false);
    }

    @NonNull
    public static g a(@NonNull Activity activity, @IdRes int i, @Nullable Bundle bundle, @NonNull g gVar, @Nullable f fVar, boolean z) {
        return a(activity, 16908290, gVar, fVar, z, "LifeCycleFragment");
    }

    @NonNull
    public static g a(@NonNull Activity activity, @IdRes int i, @NonNull g gVar, @Nullable f fVar, boolean z, @NonNull String str) {
        j.a();
        a(activity, str);
        FragmentManager fragmentManager = activity.getFragmentManager();
        a aVar = (a) fragmentManager.findFragmentByTag(str);
        if (aVar != null && !z) {
            f22088a.add(str);
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(aVar);
            a(beginTransaction);
            fragmentManager.executePendingTransactions();
            aVar = null;
        }
        if (aVar != null) {
            final j a2 = j.a(activity, str, false);
            aVar.f21973b = new i.a() {
                public final i a() {
                    return a2.f22143a;
                }
            };
            aVar.f21974c = fVar;
        } else {
            aVar = a.a(z);
            FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
            beginTransaction2.add(i, aVar, str);
            final j a3 = j.a(activity, str, !z);
            aVar.a((e) h.a(e.class, gVar.a()), new i.a() {
                public final i a() {
                    return a3.f22143a;
                }
            });
            aVar.f21974c = fVar;
            a(beginTransaction2);
            fragmentManager.executePendingTransactions();
        }
        final b bVar = new b(activity, aVar);
        aVar.a((c) new c() {
            public final void a(@NonNull e eVar) {
                bVar.a(eVar);
            }
        });
        return bVar;
    }
}
