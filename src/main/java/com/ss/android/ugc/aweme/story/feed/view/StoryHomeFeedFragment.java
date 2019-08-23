package com.ss.android.ugc.aweme.story.feed.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.story.detail.controller.AutoPlayController;
import com.ss.android.ugc.aweme.story.detail.controller.StoryFeedController;
import com.ss.android.ugc.aweme.story.feed.view.ui.a;

public class StoryHomeFeedFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72690a;

    /* renamed from: b  reason: collision with root package name */
    private StoryFeedFragment f72691b;

    /* renamed from: c  reason: collision with root package name */
    private StoryFeedController f72692c;

    /* renamed from: d  reason: collision with root package name */
    private View f72693d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f72694e;

    /* renamed from: f  reason: collision with root package name */
    private AutoPlayController f72695f;

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72690a, false, 83888, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72690a, false, 83888, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f72691b != null) {
            this.f72691b.setUserVisibleHint(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        StoryFeedFragment storyFeedFragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f72690a, false, 83886, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f72690a, false, 83886, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view2}, this, f72690a, false, 83887, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f72690a, false, 83887, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f72693d = view2.findViewById(C0906R.id.cp0);
            this.f72694e = (LinearLayout) view2.findViewById(C0906R.id.bhm);
            a.a(this.f72694e);
            this.f72694e.setOnClickListener(new d(this));
        }
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (PatchProxy.isSupport(new Object[0], null, StoryFeedFragment.f4134a, true, 83841, new Class[0], StoryFeedFragment.class)) {
            storyFeedFragment = (StoryFeedFragment) PatchProxy.accessDispatch(new Object[0], null, StoryFeedFragment.f4134a, true, 83841, new Class[0], StoryFeedFragment.class);
        } else {
            storyFeedFragment = new StoryFeedFragment();
        }
        this.f72691b = storyFeedFragment;
        beginTransaction.replace(C0906R.id.bh6, this.f72691b);
        beginTransaction.commitAllowingStateLoss();
        this.f72692c = new StoryFeedController(getActivity(), this.f72691b);
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f)}, this, f72690a, false, 83890, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f)}, this, f72690a, false, 83890, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.f72693d != null) {
            this.f72693d.setAlpha(0.0f);
        }
        this.f72695f = new AutoPlayController(getActivity(), this.f72691b);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f72690a, false, 83885, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return LayoutInflater.from(getActivity()).inflate(C0906R.layout.o4, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f72690a, false, 83885, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
