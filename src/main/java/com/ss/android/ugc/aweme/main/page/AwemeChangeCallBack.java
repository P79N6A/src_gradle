package com.ss.android.ugc.aweme.main.page;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class AwemeChangeCallBack extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54864a;

    /* renamed from: b  reason: collision with root package name */
    private b<Aweme> f54865b = new b<>();

    public interface a {
        void a(Aweme aweme);
    }

    public static Aweme a(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54864a, true, 58145, new Class[]{FragmentActivity.class}, Aweme.class)) {
            return (Aweme) b(fragmentActivity).getValue();
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54864a, true, 58145, new Class[]{FragmentActivity.class}, Aweme.class);
    }

    private static b<Aweme> b(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54864a, true, 58142, new Class[]{FragmentActivity.class}, b.class)) {
            return ((AwemeChangeCallBack) ViewModelProviders.of(fragmentActivity).get(AwemeChangeCallBack.class)).f54865b;
        }
        return (b) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54864a, true, 58142, new Class[]{FragmentActivity.class}, b.class);
    }

    public static void a(FragmentActivity fragmentActivity, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, aweme2}, null, f54864a, true, 58143, new Class[]{FragmentActivity.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, aweme2}, null, f54864a, true, 58143, new Class[]{FragmentActivity.class, Aweme.class}, Void.TYPE);
            return;
        }
        b(fragmentActivity).setValue(aweme2);
    }

    public static void a(FragmentActivity fragmentActivity, @NonNull LifecycleOwner lifecycleOwner, a aVar) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, lifecycleOwner2, aVar2}, null, f54864a, true, 58144, new Class[]{FragmentActivity.class, LifecycleOwner.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, lifecycleOwner2, aVar2}, null, f54864a, true, 58144, new Class[]{FragmentActivity.class, LifecycleOwner.class, a.class}, Void.TYPE);
            return;
        }
        b(fragmentActivity).observe(lifecycleOwner2, new Observer<Aweme>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54866a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                Aweme aweme = (Aweme) obj;
                if (PatchProxy.isSupport(new Object[]{aweme}, this, f54866a, false, 58146, new Class[]{Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme}, this, f54866a, false, 58146, new Class[]{Aweme.class}, Void.TYPE);
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(aweme);
                }
            }
        });
    }
}
