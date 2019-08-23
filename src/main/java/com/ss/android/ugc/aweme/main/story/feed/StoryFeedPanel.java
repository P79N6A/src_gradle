package com.ss.android.ugc.aweme.main.story.feed;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.ss.android.ugc.aweme.commercialize.d.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.main.story.f;
import com.ss.android.ugc.aweme.main.story.live.a;
import com.ss.android.ugc.aweme.main.story.live.b;
import com.ss.android.ugc.aweme.main.story.live.d;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class StoryFeedPanel extends IViewDefault<c> implements LifecycleObserver, AbTestManager.a {
    public static final int HEIGHT = (u.a(90.0d) + p.c());
    public static final int MIN_DISTANCE = u.a(8.0d);
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isVisible;
    private int lastX;
    private int lastY;
    private a livePageItemView;
    private d mAvatars;
    private e mCommerceLiveController;
    private String mEnterFrom;
    int mFirstVisiblePos;
    private Rect mFirstVisibleRect = new Rect();
    private String mFrom = "homepage_hot";
    private boolean mIsBig;
    private boolean mIsShowStatusBarHeight = true;
    int mLastVisiblePos = 4;
    private Rect mLastVisibleRect = new Rect();
    private LinearLayoutManager mLinearLayoutManager;
    private BaseRecyclerView mRecyclerView;
    private View mRootView;
    private c mViewModel;
    private AnimationImageView switchView;

    public boolean isVisible() {
        return this.isVisible;
    }

    private int getPanelPaddingTop() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58235, new Class[0], Integer.TYPE)) {
            return u.a(12.0d) + getRealStatusBarHeight();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58235, new Class[0], Integer.TYPE)).intValue();
    }

    private int getRealStatusBarHeight() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58233, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58233, new Class[0], Integer.TYPE)).intValue();
        } else if (!this.mIsShowStatusBarHeight) {
            return 0;
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                i = UIUtils.getStatusBarHeight(com.ss.android.ugc.aweme.base.utils.d.a());
            }
            return i;
        }
    }

    private void initListeners() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58236, new Class[0], Void.TYPE);
            return;
        }
        this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54923a;

            /* renamed from: b  reason: collision with root package name */
            boolean f54924b = true;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f54923a, false, 58249, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f54923a, false, 58249, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i > 0) {
                    z = true;
                }
                this.f54924b = z;
                StoryFeedPanel.this.logChangedHeads(this.f54924b);
            }
        });
    }

    public boolean isLivePageItemViewVisiable() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58227, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58227, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.livePageItemView != null && this.livePageItemView.c().getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    public void logOnTabChange() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58239, new Class[0], Void.TYPE);
            return;
        }
        if (this.isVisible) {
            logOnLiveRecommendShow(this.isVisible);
        }
    }

    public void logWithLive() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58238, new Class[0], Void.TYPE);
            return;
        }
        if (this.isVisible) {
            logOnHeadExpand();
            logOnLiveRecommendShow(this.isVisible);
        }
    }

    public void refresh() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58241, new Class[0], Void.TYPE);
            return;
        }
        if (this.mViewModel != null) {
            bind(this.mViewModel);
            logWithLive();
        }
    }

    private void logOnHeadExpand() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58243, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.mViewModel.f54950d)) {
            int findLastVisibleItemPosition = this.mLinearLayoutManager.findLastVisibleItemPosition();
            for (com.ss.android.ugc.aweme.base.mvvm.e next : this.mViewModel.f54950d) {
                if (i >= findLastVisibleItemPosition) {
                    break;
                } else if (next instanceof b) {
                    logShowHeads2Remote((b) next, getContext(), i);
                    i++;
                }
            }
        }
    }

    public void onChanged() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58245, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58245, new Class[0], Void.TYPE);
            return;
        }
        if (this.livePageItemView != null && (this.mView instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.mView;
            viewGroup.removeView(this.livePageItemView.c());
            this.livePageItemView = b.a(this.mView.getContext(), this.mIsBig);
            View c2 = this.livePageItemView.c();
            if (c2 != null) {
                viewGroup.addView(c2, 0);
            }
            this.livePageItemView.a(this.mAvatars);
            if (this.mCommerceLiveController != null) {
                this.mCommerceLiveController.a(viewGroup);
            }
        }
    }

    private void initViews() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58234, new Class[0], Void.TYPE);
        } else if (this.mView != null) {
            if (!this.mIsBig) {
                i = HEIGHT;
            } else if (this.mIsShowStatusBarHeight) {
                if (Build.VERSION.SDK_INT >= 19) {
                    i2 = UIUtils.getStatusBarHeight(com.ss.android.ugc.aweme.base.utils.d.a());
                } else {
                    i2 = 0;
                }
                i = u.a(105.0d) + i2;
            } else {
                i = u.a(105.0d);
            }
            this.mView.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
            this.mView.setPadding(this.mView.getPaddingLeft(), getPanelPaddingTop(), this.mView.getPaddingRight(), this.mView.getPaddingBottom());
            this.mLinearLayoutManager = new WrapLinearLayoutManager(getContext(), 0, false);
            this.mRecyclerView.setLayoutManager(this.mLinearLayoutManager);
            this.mView.setBackgroundDrawable(v.a(GradientDrawable.Orientation.LEFT_RIGHT, o.a(C0906R.color.a5x), o.a(C0906R.color.a5w)));
        }
    }

    public void setFrom(String str) {
        this.mFrom = str;
    }

    public StoryFeedPanel(@NonNull Context context) {
        super(context);
        if (LifecycleOwner.class.isAssignableFrom(context.getClass())) {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
    }

    public void bindWithoutRefresh(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 58231, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 58231, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.mViewModel = cVar;
        cVar.a(this);
    }

    public void updateEnterFrom(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 58246, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 58246, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mEnterFrom = str;
        this.livePageItemView.a(str);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, changeQuickRedirect, false, 58224, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, changeQuickRedirect, false, 58224, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        if (this.mViewModel != null) {
            RecyclerView.Adapter a2 = this.mViewModel.a(getContext());
            if (a2.getItemCount() > 0) {
                a2.notifyDataSetChanged();
            }
        }
    }

    public void setLivePageAnimation(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 58232, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 58232, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.mIsBig) {
            if (!z || !this.isVisible) {
                this.livePageItemView.a();
            } else {
                this.livePageItemView.b();
            }
        }
    }

    public void setLivePageItemView(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 58228, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 58228, new Class[]{d.class}, Void.TYPE);
        } else if (this.livePageItemView != null) {
            this.mAvatars = dVar;
            this.livePageItemView.a(this.mAvatars);
            if (this.mCommerceLiveController != null) {
                this.mCommerceLiveController.a();
            }
        }
    }

    public void bind(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 58237, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 58237, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.mViewModel = cVar2;
        cVar2.a(this);
        BaseRecyclerView baseRecyclerView = this.mRecyclerView;
        RecyclerView.Adapter a2 = cVar2.a(getContext());
        if (PatchProxy.isSupport(new Object[]{baseRecyclerView, a2}, null, v.f35054a, true, 25316, new Class[]{RecyclerView.class, RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseRecyclerView, a2}, null, v.f35054a, true, 25316, new Class[]{RecyclerView.class, RecyclerView.Adapter.class}, Void.TYPE);
        } else if (baseRecyclerView.getAdapter() == null || baseRecyclerView.getAdapter() != a2) {
            baseRecyclerView.setAdapter(a2);
        } else {
            baseRecyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    public void logChangedHeads(boolean z) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 58242, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 58242, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int findFirstVisibleItemPosition = this.mLinearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.mLinearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1 && findLastVisibleItemPosition != -1) {
            View findViewByPosition = this.mLinearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
            findViewByPosition.getLocalVisibleRect(this.mFirstVisibleRect);
            View findViewByPosition2 = this.mLinearLayoutManager.findViewByPosition(findLastVisibleItemPosition);
            findViewByPosition2.getGlobalVisibleRect(this.mLastVisibleRect);
            if (this.mFirstVisibleRect.right > 0) {
                i = this.mFirstVisibleRect.right;
            } else {
                i = 0;
            }
            if (this.mFirstVisibleRect.left > 0) {
                i2 = this.mFirstVisibleRect.left;
            }
            float measuredWidth = (((float) (i - i2)) * 1.0f) / ((float) findViewByPosition.getMeasuredWidth());
            float measuredWidth2 = (((float) (this.mLastVisibleRect.right - this.mLastVisibleRect.left)) * 1.0f) / ((float) findViewByPosition2.getMeasuredWidth());
            if (((double) measuredWidth) < 0.5d) {
                findFirstVisibleItemPosition++;
            }
            if (((double) measuredWidth2) < 0.5d) {
                findLastVisibleItemPosition--;
            }
            int i3 = findLastVisibleItemPosition;
            if (!z) {
                if (this.mFirstVisiblePos > findFirstVisibleItemPosition) {
                    int i4 = this.mFirstVisiblePos;
                    for (int i5 = findFirstVisibleItemPosition; i5 < i4; i5++) {
                        logShowHeads2Remote(this.mViewModel.a(i5), getContext(), i5);
                    }
                    this.mFirstVisiblePos = findFirstVisibleItemPosition;
                }
                if (this.mLastVisiblePos != i3) {
                    this.mLastVisiblePos = i3;
                    return;
                }
            } else {
                if (this.mLastVisiblePos < i3) {
                    int i6 = i3 + 1;
                    for (int i7 = this.mLastVisiblePos + 1; i7 < i6; i7++) {
                        logShowHeads2Remote(this.mViewModel.a(i7), getContext(), i7);
                    }
                    this.mLastVisiblePos = i3;
                }
                if (this.mFirstVisiblePos == findFirstVisibleItemPosition) {
                    this.mLastVisiblePos = i3;
                    return;
                }
            }
            this.mFirstVisiblePos = findFirstVisibleItemPosition;
        }
    }

    public void setVisible(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 58230, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 58230, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.isVisible = z2;
        if (z2) {
            com.ss.android.ugc.aweme.story.live.b.c(this.mEnterFrom);
            this.livePageItemView.b();
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.commercialize.d.b.f38653a, true, 30983, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.commercialize.d.b.f38653a, true, 30983, new Class[0], Void.TYPE);
            } else {
                r.a("show_skylight_entrance", (Map) null);
            }
        } else {
            this.livePageItemView.a();
        }
    }

    private void logOnLiveRecommendShow(boolean z) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 58240, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 58240, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mViewModel != null && z && this.livePageItemView != null && this.livePageItemView.c().getVisibility() == 0) {
            String str3 = this.mViewModel.g;
            if (this.mIsBig) {
                if (PatchProxy.isSupport(new Object[]{str3}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61396, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str3}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61396, new Class[]{String.class}, Void.TYPE);
                } else {
                    r.onEvent(MobClick.obtain().setEventName("show").setLabelName("live_merge").setJsonObject(new t().a("request_id", str3).a("page_name", "homepage_follow").a("position", "toplist").a()));
                }
                str = "toplist_homepage_follow";
            } else {
                str = this.mViewModel.i;
            }
            String str4 = this.mFrom;
            boolean z2 = this.livePageItemView.c() instanceof com.ss.android.ugc.aweme.main.story.live.view.b;
            if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84678, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84678, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            } else {
                t a2 = new t().a("request_id", str3);
                if (z2) {
                    str2 = "new_type";
                } else {
                    str2 = "normal_type";
                }
                r.onEvent(MobClick.obtain().setEventName("live_merge_show").setLabelName(str4).setJsonObject(a2.a("enter_method", str2).a("page_name", str4).a()));
            }
            boolean z3 = this.livePageItemView.c() instanceof com.ss.android.ugc.aweme.main.story.live.view.b;
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z3 ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84686, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z3)}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84686, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            if (z3) {
                hashMap.put("ui_type", "new_type");
            } else {
                hashMap.put("ui_type", "normal_type");
            }
            r.a("live_merge_show", (Map) hashMap);
        }
    }

    public StoryFeedPanel(Context context, AnimationImageView animationImageView) {
        super(context);
        this.switchView = animationImageView;
    }

    public void setPanelVisibility(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 58229, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, changeQuickRedirect, false, 58229, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.switchView != null) {
            this.switchView.setVisibility(0);
            if (i != 0) {
                this.switchView.setAnimation(f.a("story_open"));
                this.switchView.playAnimation();
            }
        }
        if (this.mIsBig || z) {
            this.mRootView.setVisibility(i);
        }
    }

    public StoryFeedPanel create(Context context, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 58226, new Class[]{Context.class, ViewGroup.class}, StoryFeedPanel.class)) {
            return (StoryFeedPanel) PatchProxy.accessDispatch(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 58226, new Class[]{Context.class, ViewGroup.class}, StoryFeedPanel.class);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.mView = linearLayout;
        linearLayout.setOrientation(0);
        if (com.ss.android.g.a.a()) {
            this.livePageItemView = b.a(context, this.mIsBig);
        } else {
            this.livePageItemView = ((com.ss.android.ugc.aweme.legoImp.inflate.a) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.a.class)).a(context, this.mIsBig);
        }
        if (this.livePageItemView.c() != null) {
            linearLayout.addView(this.livePageItemView.c(), 0);
        }
        if (!this.mIsBig) {
            if (com.ss.android.g.a.a()) {
                this.mCommerceLiveController = com.ss.android.ugc.aweme.commercialize.d.b.a(context);
            } else {
                this.mCommerceLiveController = ((com.ss.android.ugc.aweme.legoImp.inflate.a) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.a.class)).a(context);
            }
            this.mCommerceLiveController.a(linearLayout);
        }
        AbTestManager.a().a((AbTestManager.a) this);
        if (com.ss.android.g.a.a()) {
            this.mRecyclerView = new BaseRecyclerView(context) {

                /* renamed from: b  reason: collision with root package name */
                public static ChangeQuickRedirect f54921b;

                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54921b, false, 58248, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54921b, false, 58248, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    switch (motionEvent.getAction()) {
                        case 0:
                        case 2:
                            getParent().requestDisallowInterceptTouchEvent(true);
                            break;
                        case 1:
                        case 3:
                            getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54921b, false, 58247, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54921b, false, 58247, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    switch (motionEvent.getAction()) {
                        case 1:
                        case 3:
                            getParent().requestDisallowInterceptTouchEvent(false);
                            break;
                        case 2:
                            getParent().requestDisallowInterceptTouchEvent(true);
                            break;
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
        } else {
            this.mRecyclerView = ((com.ss.android.ugc.aweme.legoImp.inflate.b) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.b.class)).a(context);
        }
        linearLayout.addView(this.mRecyclerView, new ViewGroup.LayoutParams(-1, -1));
        initListeners();
        initViews();
        viewGroup.addView(this.mView);
        this.mRootView = viewGroup;
        setPanelVisibility(8, true);
        return this;
    }

    private void logShowHeads2Remote(com.ss.android.ugc.aweme.base.mvvm.e eVar, Context context, int i) {
        String str;
        com.ss.android.ugc.aweme.base.mvvm.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 58244, new Class[]{com.ss.android.ugc.aweme.base.mvvm.e.class, Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 58244, new Class[]{com.ss.android.ugc.aweme.base.mvvm.e.class, Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (eVar2 != null) {
            boolean z = eVar2 instanceof b;
            if (z) {
                JSONObject jSONObject = new JSONObject();
                b bVar = (b) eVar2;
                try {
                    jSONObject.put("request_id", bVar.f54934e);
                } catch (JSONException unused) {
                }
                if (bVar.d() && com.ss.android.ugc.aweme.story.a.a()) {
                    if (this.mIsBig) {
                        str = "homepage_follow";
                    } else {
                        str = "homepage_hot";
                    }
                    com.ss.android.ugc.aweme.story.live.b.a(getContext(), 0, bVar.f54934e, bVar.g(), bVar.g, str);
                    if (z) {
                        bVar.f54935f = this.mIsBig;
                        com.ss.android.ugc.aweme.story.live.b.a(bVar.g(), bVar.g, bVar.h(), bVar.f54934e, i, bVar.k.a().f73233b.type, false, "", "others_photo");
                    }
                } else if (bVar.e()) {
                    try {
                        jSONObject.put("order", bVar.c());
                    } catch (JSONException unused2) {
                    }
                    r.a(context, "head_show", "toplist", bVar.f(), PushConstants.PUSH_TYPE_NOTIFY, jSONObject);
                } else {
                    r.a(context, "show", "story_head", bVar.f(), PushConstants.PUSH_TYPE_NOTIFY, jSONObject);
                }
            }
        }
    }

    public StoryFeedPanel create(Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{context, viewGroup, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 58225, new Class[]{Context.class, ViewGroup.class, Boolean.TYPE, Boolean.TYPE}, StoryFeedPanel.class)) {
            return (StoryFeedPanel) PatchProxy.accessDispatch(new Object[]{context, viewGroup, Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 58225, new Class[]{Context.class, ViewGroup.class, Boolean.TYPE, Boolean.TYPE}, StoryFeedPanel.class);
        }
        this.mIsBig = z;
        this.mIsShowStatusBarHeight = z2;
        return create(context, viewGroup);
    }
}
