package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Activity> f82620a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Fragment> f82621b;

    /* access modifiers changed from: package-private */
    @Nullable
    public final Fragment b() {
        if (this.f82621b != null) {
            return (Fragment) this.f82621b.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Activity a() {
        return (Activity) this.f82620a.get();
    }

    private a(Activity activity) {
        this(activity, null);
    }

    public static a a(Activity activity) {
        return new a(activity);
    }

    private a(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public static a a(Fragment fragment) {
        return new a(fragment);
    }

    public static List<Uri> a(Intent intent) {
        return intent.getParcelableArrayListExtra("extra_result_selection");
    }

    public final c a(Set<b> set) {
        return a(set, true);
    }

    private a(Activity activity, Fragment fragment) {
        this.f82620a = new WeakReference<>(activity);
        this.f82621b = new WeakReference<>(fragment);
    }

    private c a(Set<b> set, boolean z) {
        return new c(this, set, true);
    }
}
