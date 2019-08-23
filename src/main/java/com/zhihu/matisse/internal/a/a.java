package com.zhihu.matisse.internal.a;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.Fragment;
import com.zhihu.matisse.internal.entity.b;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Activity> f82624a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Fragment> f82625b = null;

    /* renamed from: c  reason: collision with root package name */
    public b f82626c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f82627d;

    /* renamed from: e  reason: collision with root package name */
    public String f82628e;

    public a(Activity activity) {
        this.f82624a = new WeakReference<>(activity);
    }
}
