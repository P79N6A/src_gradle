package com.ss.android.ugc.aweme.story.feed.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.arch.widgets.base.c;

public class ChangeUserModeViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72988a;

    /* renamed from: b  reason: collision with root package name */
    private b<String> f72989b = new b<>();

    public static b<String> a(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72988a, true, 84379, new Class[]{FragmentActivity.class}, b.class)) {
            return b(fragmentActivity).f72989b;
        }
        return (b) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72988a, true, 84379, new Class[]{FragmentActivity.class}, b.class);
    }

    private static ChangeUserModeViewModel b(@NonNull FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f72988a, true, 84378, new Class[]{FragmentActivity.class}, ChangeUserModeViewModel.class)) {
            return (ChangeUserModeViewModel) c.a(fragmentActivity).get(ChangeUserModeViewModel.class);
        }
        return (ChangeUserModeViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f72988a, true, 84378, new Class[]{FragmentActivity.class}, ChangeUserModeViewModel.class);
    }
}
