package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryFragmentLifeCycleCallback;", "Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;", "lifeCycleCallback", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/FragmentLifeCycleCallback;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/FragmentLifeCycleCallback;)V", "onFragmentActivityCreated", "", "fm", "Landroid/support/v4/app/FragmentManager;", "f", "Landroid/support/v4/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentCreated", "onFragmentDestroyed", "onFragmentStarted", "onFragmentStopped", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFragmentLifeCycleCallback extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73786a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73787b;

    public StoryFragmentLifeCycleCallback(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "lifeCycleCallback");
        this.f73787b = aVar;
    }

    public final void onFragmentDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        FragmentManager fragmentManager2 = fragmentManager;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, fragment2}, this, f73786a, false, 85540, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, fragment2}, this, f73786a, false, 85540, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fm");
        Intrinsics.checkParameterIsNotNull(fragment2, "f");
        this.f73787b.c(fragment2);
    }

    public final void onFragmentStarted(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        FragmentManager fragmentManager2 = fragmentManager;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, fragment2}, this, f73786a, false, 85538, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, fragment2}, this, f73786a, false, 85538, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fm");
        Intrinsics.checkParameterIsNotNull(fragment2, "f");
        this.f73787b.a(fragment2);
    }

    public final void onFragmentStopped(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        FragmentManager fragmentManager2 = fragmentManager;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, fragment2}, this, f73786a, false, 85539, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, fragment2}, this, f73786a, false, 85539, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fm");
        Intrinsics.checkParameterIsNotNull(fragment2, "f");
        this.f73787b.b(fragment2);
    }

    public final void onFragmentActivityCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @Nullable Bundle bundle) {
        FragmentManager fragmentManager2 = fragmentManager;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, fragment2, bundle2}, this, f73786a, false, 85537, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, fragment2, bundle2}, this, f73786a, false, 85537, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fm");
        Intrinsics.checkParameterIsNotNull(fragment2, "f");
        this.f73787b.b(fragment2, bundle2);
    }

    public final void onFragmentCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @Nullable Bundle bundle) {
        FragmentManager fragmentManager2 = fragmentManager;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, fragment2, bundle2}, this, f73786a, false, 85536, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, fragment2, bundle2}, this, f73786a, false, 85536, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "fm");
        Intrinsics.checkParameterIsNotNull(fragment2, "f");
        this.f73787b.a(fragment2, bundle2);
    }
}
