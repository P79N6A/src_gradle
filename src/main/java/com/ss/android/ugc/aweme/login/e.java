package com.ss.android.ugc.aweme.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.component.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53761a;

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.base.component.e f53762b;

    public static void a(@Nullable Fragment fragment, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        Fragment fragment2 = fragment;
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragment2, str3, str4, bundle2}, null, f53761a, true, 56355, new Class[]{Fragment.class, String.class, String.class, Bundle.class}, Void.TYPE)) {
            Object[] objArr = {fragment2, str3, str4, bundle2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53761a, true, 56355, new Class[]{Fragment.class, String.class, String.class, Bundle.class}, Void.TYPE);
            return;
        }
        a(fragment2, str3, str4, bundle2, (f) null);
    }

    public static void a(@Nullable Fragment fragment, @NonNull String str, @NonNull String str2, @Nullable f fVar) {
        Fragment fragment2 = fragment;
        String str3 = str;
        String str4 = str2;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fragment2, str3, str4, fVar2}, null, f53761a, true, 56356, new Class[]{Fragment.class, String.class, String.class, f.class}, Void.TYPE)) {
            Object[] objArr = {fragment2, str3, str4, fVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53761a, true, 56356, new Class[]{Fragment.class, String.class, String.class, f.class}, Void.TYPE);
            return;
        }
        a(fragment2, str3, str4, (Bundle) null, fVar2);
    }

    public static void a(@Nullable Fragment fragment, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar) {
        if (PatchProxy.isSupport(new Object[]{fragment, str, str2, bundle, fVar}, null, f53761a, true, 56357, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE)) {
            Object[] objArr = {fragment, str, str2, bundle, fVar};
            PatchProxy.accessDispatch(objArr, null, f53761a, true, 56357, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE);
            return;
        }
        if (!(f53762b != null || AmeActivity.getLoginComponentFactory() == null || fragment == null || fragment.getActivity() == null || fragment.getActivity().isFinishing())) {
            AmeActivity.a loginComponentFactory = AmeActivity.getLoginComponentFactory();
            fragment.getActivity();
            a(loginComponentFactory.a());
        }
        if (f53762b != null) {
            if (!(fragment == null || fragment.getActivity() == null || fragment.getActivity().isFinishing())) {
                f53762b.a(fragment, str, str2, bundle, fVar);
            }
            return;
        }
        throw new RuntimeException("ILoginActivityComponent stub can't be null");
    }

    public static void a(com.ss.android.ugc.aweme.base.component.e eVar) {
        f53762b = eVar;
    }

    public static void a(@Nullable Activity activity, @NonNull String str, @NonNull String str2) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4}, null, f53761a, true, 56358, new Class[]{Activity.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str3, str4}, null, f53761a, true, 56358, new Class[]{Activity.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(activity2, str3, str4, (Bundle) null, (f) null);
    }

    public static void a(@Nullable Fragment fragment, @NonNull String str, @NonNull String str2) {
        Fragment fragment2 = fragment;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{fragment2, str3, str4}, null, f53761a, true, 56354, new Class[]{Fragment.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, str3, str4}, null, f53761a, true, 56354, new Class[]{Fragment.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(fragment2, str3, str4, (Bundle) null, (f) null);
    }

    public static void a(@Nullable Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, bundle2}, null, f53761a, true, 56359, new Class[]{Activity.class, String.class, String.class, Bundle.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, bundle2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53761a, true, 56359, new Class[]{Activity.class, String.class, String.class, Bundle.class}, Void.TYPE);
            return;
        }
        a(activity2, str3, str4, bundle2, (f) null);
    }

    public static void a(@Nullable Activity activity, @NonNull String str, @NonNull String str2, @Nullable f fVar) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, fVar2}, null, f53761a, true, 56360, new Class[]{Activity.class, String.class, String.class, f.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, fVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f53761a, true, 56360, new Class[]{Activity.class, String.class, String.class, f.class}, Void.TYPE);
            return;
        }
        a(activity2, str3, str4, (Bundle) null, fVar2);
    }

    public static void a(@Nullable Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar) {
        if (PatchProxy.isSupport(new Object[]{activity, str, str2, bundle, fVar}, null, f53761a, true, 56361, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, str2, bundle, fVar};
            PatchProxy.accessDispatch(objArr, null, f53761a, true, 56361, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE);
            return;
        }
        if (f53762b == null && AmeActivity.getLoginComponentFactory() != null && activity != null && !activity.isFinishing()) {
            a(AmeActivity.getLoginComponentFactory().a());
        }
        if (f53762b != null) {
            if (activity != null && !activity.isFinishing()) {
                f53762b.a(activity, str, str2, bundle, fVar);
            }
            return;
        }
        throw new RuntimeException("ILoginActivityComponent stub can't be null");
    }
}
