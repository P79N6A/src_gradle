package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager$Companion$create$1", "Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;", "onFragmentViewDestroyed", "", "fm", "Landroid/support/v4/app/FragmentManager;", "f", "Landroid/support/v4/app/Fragment;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryViewHolderProxyManager$Companion$create$1 extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72628a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StoryViewHolderProxyManager f72629b;

    StoryViewHolderProxyManager$Companion$create$1(StoryViewHolderProxyManager storyViewHolderProxyManager) {
        this.f72629b = storyViewHolderProxyManager;
    }

    public final void onFragmentViewDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f72628a, false, 83548, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f72628a, false, 83548, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(fragment, "f");
        if (fragment == this.f72629b.getParentFragment()) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(this);
            fragment.getChildFragmentManager().beginTransaction().remove(this.f72629b).commitNowAllowingStateLoss();
        }
    }
}
