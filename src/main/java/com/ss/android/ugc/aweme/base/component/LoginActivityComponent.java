package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.accountsdk.i;
import com.ss.android.ugc.aweme.app.accountsdk.j;
import com.ss.android.ugc.aweme.app.accountsdk.k;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.p;

public class LoginActivityComponent extends BaseLoginActivityComponent {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f34701b;

    public final void a(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar) {
        Bundle bundle2;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str2, bundle, fVar}, this, f34701b, false, 24600, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str, str2, bundle, fVar};
            PatchProxy.accessDispatch(objArr, this, f34701b, false, 24600, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE);
        } else if (activity2 != null && !activity.isFinishing()) {
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            Activity activity3 = activity;
            String str3 = str;
            String str4 = str2;
            Bundle bundle3 = bundle2;
            super.a(activity3, str3, str4, bundle3, fVar);
            a(activity3, str3, str4, bundle3, activity2 instanceof MainActivity, fVar);
        }
    }

    public final void a(@NonNull Fragment fragment, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar) {
        Bundle bundle2;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, str, str2, bundle, fVar}, this, f34701b, false, 24599, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE)) {
            Object[] objArr = {fragment2, str, str2, bundle, fVar};
            PatchProxy.accessDispatch(objArr, this, f34701b, false, 24599, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.class}, Void.TYPE);
        } else if (fragment2 != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            String str3 = str;
            String str4 = str2;
            Bundle bundle3 = bundle2;
            super.a(fragment, str3, str4, bundle3, fVar);
            a(fragment.getActivity(), str3, str4, bundle3, fragment2 instanceof FeedFragment, fVar);
        }
    }

    private void a(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, boolean z, @Nullable f fVar) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        f fVar2 = fVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, bundle2, Byte.valueOf(z ? (byte) 1 : 0), fVar2}, this, f34701b, false, 24601, new Class[]{Activity.class, String.class, String.class, Bundle.class, Boolean.TYPE, f.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, bundle2, Byte.valueOf(z), fVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f34701b, false, 24601, new Class[]{Activity.class, String.class, String.class, Bundle.class, Boolean.TYPE, f.class}, Void.TYPE);
            return;
        }
        p b2 = c.b();
        IAccountService.d a2 = new IAccountService.d().a(activity2).a(str3).b(str4).a(bundle2);
        if (bundle2 != null && bundle2.getBoolean("only_login", false)) {
            z2 = true;
        }
        b2.showLoginAndRegisterView(a2.a(z2).a((IAccountService.f) new i()).a((IAccountService.g) new j(z)).a((IAccountService.h) new k(fVar2)).a());
    }
}
