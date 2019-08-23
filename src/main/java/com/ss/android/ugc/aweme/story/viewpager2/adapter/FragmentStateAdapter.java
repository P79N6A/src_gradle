package com.ss.android.ugc.aweme.story.viewpager2.adapter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74407a;

    /* renamed from: com.ss.android.ugc.aweme.story.viewpager2.adapter.FragmentStateAdapter$2  reason: invalid class name */
    class AnonymousClass2 extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f74409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FrameLayout f74410c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FragmentStateAdapter f74411d;

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
            FragmentManager fragmentManager2 = fragmentManager;
            Fragment fragment2 = fragment;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{fragmentManager2, fragment2, view2, bundle}, this, f74408a, false, 86533, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager2, fragment2, view2, bundle}, this, f74408a, false, 86533, new Class[]{FragmentManager.class, Fragment.class, View.class, Bundle.class}, Void.TYPE);
                return;
            }
            if (fragment2 == this.f74409b) {
                fragmentManager2.unregisterFragmentLifecycleCallbacks(this);
                FragmentStateAdapter fragmentStateAdapter = this.f74411d;
                FrameLayout frameLayout = this.f74410c;
                if (PatchProxy.isSupport(new Object[]{view2, frameLayout}, fragmentStateAdapter, FragmentStateAdapter.f74407a, false, 86519, new Class[]{View.class, FrameLayout.class}, Void.TYPE)) {
                    Object[] objArr = {view2, frameLayout};
                    Object[] objArr2 = objArr;
                    FragmentStateAdapter fragmentStateAdapter2 = fragmentStateAdapter;
                    PatchProxy.accessDispatch(objArr2, fragmentStateAdapter2, FragmentStateAdapter.f74407a, false, 86519, new Class[]{View.class, FrameLayout.class}, Void.TYPE);
                } else if (frameLayout.getChildCount() > 1) {
                    throw new IllegalStateException("Design assumption violated.");
                } else if (view.getParent() != frameLayout) {
                    if (frameLayout.getChildCount() > 0) {
                        frameLayout.removeAllViews();
                    }
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view2);
                    }
                    frameLayout.addView(view2);
                }
            }
        }
    }
}
