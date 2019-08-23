package com.ss.android.ugc.aweme.main.page;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PageManager extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54874a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<String> f54875b = new MutableLiveData<>();

    public interface a {
        void a(String str);
    }

    public static PageManager a(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54874a, true, 58152, new Class[]{FragmentActivity.class}, PageManager.class)) {
            return (PageManager) ViewModelProviders.of(fragmentActivity).get(PageManager.class);
        }
        return (PageManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54874a, true, 58152, new Class[]{FragmentActivity.class}, PageManager.class);
    }

    public static void a(FragmentActivity fragmentActivity, @NonNull LifecycleOwner lifecycleOwner, a aVar) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, lifecycleOwner2, aVar2}, null, f54874a, true, 58153, new Class[]{FragmentActivity.class, LifecycleOwner.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, lifecycleOwner2, aVar2}, null, f54874a, true, 58153, new Class[]{FragmentActivity.class, LifecycleOwner.class, a.class}, Void.TYPE);
            return;
        }
        a(fragmentActivity).f54875b.observe(lifecycleOwner2, new Observer<String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54876a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                String str = (String) obj;
                if (PatchProxy.isSupport(new Object[]{str}, this, f54876a, false, 58156, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f54876a, false, 58156, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                aVar2.a(str);
            }
        });
    }
}
