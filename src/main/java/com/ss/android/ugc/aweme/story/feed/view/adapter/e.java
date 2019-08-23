package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.arch.widgets.base.c;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.view.widget.StoryPublishProgressWidget;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;

public final class e implements ViewModelStoreOwner, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72741a;

    /* renamed from: b  reason: collision with root package name */
    protected b f72742b;

    /* renamed from: c  reason: collision with root package name */
    protected WidgetManager f72743c;

    /* renamed from: d  reason: collision with root package name */
    protected DataCenter f72744d;

    /* renamed from: e  reason: collision with root package name */
    protected Fragment f72745e;

    /* renamed from: f  reason: collision with root package name */
    protected View f72746f;
    private StoryFeedPagerAdapter g;
    private final View h;

    public final void e() {
    }

    public final void f() {
    }

    public final void h() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public final void m() {
    }

    public final void n() {
    }

    public final void o() {
    }

    public final b j() {
        return this.f72742b;
    }

    public final View p() {
        return this.h;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72741a, false, 84019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72741a, false, 84019, new Class[0], Void.TYPE);
            return;
        }
        StoryChange.a(this.f72745e.getActivity(), this.f72742b);
    }

    @NonNull
    public final ViewModelStore getViewModelStore() {
        if (!PatchProxy.isSupport(new Object[0], this, f72741a, false, 84020, new Class[0], ViewModelStore.class)) {
            return new ViewModelStore();
        }
        return (ViewModelStore) PatchProxy.accessDispatch(new Object[0], this, f72741a, false, 84020, new Class[0], ViewModelStore.class);
    }

    public final String i() {
        if (!PatchProxy.isSupport(new Object[0], this, f72741a, false, 84018, new Class[0], String.class)) {
            return this.f72742b.getStoryId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f72741a, false, 84018, new Class[0], String.class);
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f72741a, false, 84017, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f72741a, false, 84017, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f72742b = bVar;
        this.f72744d.a("story_feed_data", (Object) bVar);
    }

    public e(View view, Fragment fragment, StoryFeedPagerAdapter storyFeedPagerAdapter) {
        this.f72745e = fragment;
        this.f72746f = view;
        this.g = storyFeedPagerAdapter;
        this.h = view.findViewById(C0906R.id.age);
        if (PatchProxy.isSupport(new Object[0], this, f72741a, false, 84016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72741a, false, 84016, new Class[0], Void.TYPE);
            return;
        }
        this.f72744d = DataCenter.a(c.a(this.f72745e, this), (LifecycleOwner) this.f72745e);
        this.f72744d.a("story_feed_adapter", (Object) this.g);
        this.f72743c = WidgetManager.a(this.f72745e, this.f72746f);
        this.f72743c.a(this.f72744d);
        this.f72743c.b(C0906R.id.c8m, new StoryPublishProgressWidget());
    }
}
