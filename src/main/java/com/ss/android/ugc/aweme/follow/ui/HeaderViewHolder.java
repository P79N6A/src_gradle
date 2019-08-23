package com.ss.android.ugc.aweme.follow.ui;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.follow.b.b;
import com.ss.android.ugc.aweme.main.story.e;
import com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemViewBig;
import com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel;
import com.ss.android.ugc.aweme.main.story.feed.a;
import com.ss.android.ugc.aweme.main.story.feed.c;
import com.ss.android.ugc.aweme.main.story.g;
import com.ss.android.ugc.aweme.story.model.d;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.h;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class HeaderViewHolder extends RecyclerView.ViewHolder implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3261a;

    /* renamed from: b  reason: collision with root package name */
    public StoryFeedPanel f3262b;

    /* renamed from: c  reason: collision with root package name */
    public c f3263c;

    /* renamed from: d  reason: collision with root package name */
    ViewGroup f3264d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3265e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3266f;

    @Keep
    static class StoryPanelScrollHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private WeakReference<HeaderViewHolder> mHostHolder;
        private int mStoryPanelHeight;

        public void setStoryPanelHeight(int i) {
            this.mStoryPanelHeight = i;
        }

        StoryPanelScrollHelper(HeaderViewHolder headerViewHolder) {
            this.mHostHolder = new WeakReference<>(headerViewHolder);
        }

        public void setScrollY(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44715, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 44715, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            HeaderViewHolder headerViewHolder = (HeaderViewHolder) this.mHostHolder.get();
            if (headerViewHolder != null) {
                StatusBarUtils.getStatusBarHeight(AwemeAppData.p().c().getContext());
                ViewGroup viewGroup = (ViewGroup) headerViewHolder.f3264d.getParent().getParent();
                if (viewGroup instanceof FpsRecyclerView) {
                    ((FpsRecyclerView) viewGroup).setTop(-(this.mStoryPanelHeight + i));
                }
            }
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3261a, false, 44709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3261a, false, 44709, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3263c != null && d.a().isLogin()) {
            this.f3265e = true;
            this.f3263c.a(false);
        }
    }

    public HeaderViewHolder(View view) {
        super(view);
        this.f3264d = (ViewGroup) view.findViewById(C0906R.id.afc);
        this.f3263c = new c(StoryFeedItemViewBig.class);
        this.f3263c.h = new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47803a;

            public final void a(List<com.ss.android.ugc.aweme.base.mvvm.e> list, d.a aVar) {
                List<com.ss.android.ugc.aweme.base.mvvm.e> list2 = list;
                if (PatchProxy.isSupport(new Object[]{list2, aVar}, this, f47803a, false, 44713, new Class[]{List.class, d.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list2, aVar}, this, f47803a, false, 44713, new Class[]{List.class, d.a.class}, Void.TYPE);
                    return;
                }
                if (HeaderViewHolder.this.f3265e) {
                    HeaderViewHolder.this.f3265e = false;
                    if ((list2 == null || list.isEmpty() || (list.size() == 1 && (list2.get(0) instanceof com.ss.android.ugc.aweme.base.widget.a.a))) && !HeaderViewHolder.this.f3262b.isLivePageItemViewVisiable()) {
                        HeaderViewHolder headerViewHolder = HeaderViewHolder.this;
                        if (PatchProxy.isSupport(new Object[0], headerViewHolder, HeaderViewHolder.f3261a, false, 44712, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], headerViewHolder, HeaderViewHolder.f3261a, false, 44712, new Class[0], Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.newfollow.c.a aVar2 = new com.ss.android.ugc.aweme.newfollow.c.a();
                            aVar2.f57079a = 2;
                            aVar2.f57080b = headerViewHolder.getAdapterPosition();
                            bg.a(aVar2);
                        }
                        HeaderViewHolder.this.f3266f = false;
                        bg.a(new b(false));
                        return;
                    }
                    if (!HeaderViewHolder.this.f3266f) {
                        HeaderViewHolder.this.f3264d.getLayoutParams().height = -2;
                        View view = (View) HeaderViewHolder.this.f3264d.getParent();
                        h.a(view, view.getHeight(), HeaderViewHolder.this.f3262b.getAndroidView().getLayoutParams().height).start();
                        HeaderViewHolder.this.f3266f = true;
                    }
                    bg.a(new b(true));
                }
            }
        };
    }

    public final void b_(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3261a, false, 44710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3261a, false, 44710, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3262b != null) {
            this.f3262b.setVisible(z);
            if (z) {
                this.f3262b.refresh();
            }
        }
    }

    @Subscribe
    public void onEvent(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3261a, false, 44707, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3261a, false, 44707, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (this.f3263c != null && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            this.f3263c.a(false);
        }
    }

    public final void a(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, (byte) 0}, this, f3261a, false, 44704, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, (byte) 0}, this, f3261a, false, 44704, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(context2, false);
        a();
    }

    private void b(Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3261a, false, 44705, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f3261a, false, 44705, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3262b == null) {
            this.f3262b = new StoryFeedPanel(context).create(context, this.f3264d, true, z);
            this.f3262b.setFrom("homepage_follow");
            this.f3262b.setVisible(true);
            this.f3262b.bind(this.f3263c);
        }
        if (!this.f3266f) {
            this.f3264d.getLayoutParams().height = 0;
            ((ViewGroup) this.f3264d.getParent()).getLayoutParams().height = 0;
        }
    }
}
