package com.ss.android.ugc.aweme.poi.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.a.a;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.poi.b.d;
import com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.utils.bg;

public class PoiOptimizedInfoFragment extends AbsSlidablePoiAwemeFeedFragment {
    public static ChangeQuickRedirect A;
    private float B;
    @BindView(2131497179)
    SlidingUpPanelLayout mSlideUpPanelLayout;

    public final int k() {
        return C0906R.layout.pa;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void U() {
        this.mSlideUpPanelLayout.setPanelState(SlidingUpPanelLayout.d.EXPANDED);
        int g = this.f3750b.g();
        if (g > 0) {
            this.mRecyclerView.scrollToPosition(g);
        }
    }

    public final void P() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66071, new Class[0], Void.TYPE);
            return;
        }
        s();
        this.mSlideUpPanelLayout.setPanelState(SlidingUpPanelLayout.d.COLLAPSED);
    }

    public final void Q() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66072, new Class[0], Void.TYPE);
            return;
        }
        this.mSlideUpPanelLayout.setPanelState(SlidingUpPanelLayout.d.ANCHORED);
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66073, new Class[0], Void.TYPE);
            return;
        }
        if (this.mSlideUpPanelLayout != null && this.mSlideUpPanelLayout.getPanelState() == SlidingUpPanelLayout.d.COLLAPSED) {
            this.z.a(getContext(), "poi_page", new ao.a(this.f3754f, this.h, "map", A()));
        }
    }

    public final void S() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66066, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            float panelTop = this.mSlideUpPanelLayout.getPanelTop();
            if (panelTop <= ((float) this.mHeader.getHeight())) {
                f2 = panelTop - ((float) this.mHeader.getHeight());
            } else {
                f2 = (((panelTop - ((float) this.mHeader.getHeight())) * 1.0f) / ((float) ((this.mSlideUpPanelLayout.getHeight() - this.mSlideUpPanelLayout.getPanelHeight()) - this.mHeader.getHeight()))) * ((float) (this.mSlideUpPanelLayout.getHeight() - this.mSlideUpPanelLayout.getPanelHeight()));
            }
            this.mHeader.setTranslationY(f2);
            this.mPoiMap.setTranslationY((panelTop - ((float) this.mPoiMap.getHeight())) / 2.0f);
            this.mUploadImage.setTranslationY(panelTop - ((float) (this.mSlideUpPanelLayout.getHeight() - this.mSlideUpPanelLayout.getPanelHeight())));
        }
    }

    public final void T() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66067, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            float panelTop = this.mSlideUpPanelLayout.getPanelTop() - this.mSlideUpPanelLayout.getHeaderPinnedHeight();
            float height = ((float) this.mHeader.getHeight()) - this.mSlideUpPanelLayout.getHeaderPinnedHeight();
            if (panelTop <= height) {
                float f2 = 1.0f - (panelTop / height);
                this.mTopbarBg.setAlpha(f2);
                this.mTopbarStatus.setAlpha(f2);
                this.u.a(f2);
                if (this.x) {
                    this.mTopCollectImg.setAlpha(f2);
                }
                if (f2 > 0.0f) {
                    this.mTopbarBg.setVisibility(0);
                    this.u.b(0);
                    if (this.x) {
                        this.mTopCollectImg.setVisibility(0);
                    }
                } else {
                    this.mTopbarBg.setVisibility(8);
                    this.u.b(8);
                    if (this.x) {
                        this.mTopCollectImg.setVisibility(8);
                    }
                }
                return;
            }
            this.mTopbarBg.setVisibility(8);
            this.mTopbarBg.setAlpha(0.0f);
            this.mTopbarStatus.setAlpha(0.0f);
            this.u.b(8);
            this.u.a(0.0f);
            if (this.x) {
                this.mTopCollectImg.setAlpha(0.0f);
                this.mTopCollectImg.setVisibility(8);
            }
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, A, false, 66065, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, A, false, 66065, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f3750b.a(f2);
        this.mPoiMore.setTranslationY(-((((float) this.mSlideUpPanelLayout.getHeight()) - this.mSlideUpPanelLayout.getPanelTop()) - this.B));
        this.mPoiMore.setAlpha(1.0f - f2);
        if (f2 < 1.0f) {
            this.mPoiMore.setVisibility(0);
        } else {
            this.mPoiMore.setVisibility(8);
        }
    }

    @OnClick({2131496258})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, A, false, 66069, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, A, false, 66069, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.c11) {
            Q();
            F();
        } else {
            super.onClick(view);
        }
    }

    public final void a(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, A, false, 66070, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, A, false, 66070, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mPoiMap.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.mPoiMap.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mUploadImage.getLayoutParams();
        layoutParams2.bottomMargin = i;
        this.mUploadImage.setLayoutParams(layoutParams2);
        this.mSlideUpPanelLayout.setHeaderPinnedHeight(f2);
        if (this.f3752d != null) {
            if (this.f3752d.displayStyle == 1) {
                this.w.postDelayed(new p(this), 200);
            } else if (this.f3752d.displayStyle == 2) {
                this.w.postDelayed(new q(this), 200);
            }
        }
        this.mSlideUpPanelLayout.setPanelHeight(i);
        this.B = (float) i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, A, false, 66064, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, A, false, 66064, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (a.a(getContext())) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.ko);
            this.mSlideUpPanelLayout.setAnchorHeight((float) dimensionPixelSize);
            this.mHeader.getLayoutParams().height = dimensionPixelSize;
        }
        this.mSlideUpPanelLayout.setOnPanelDraggedListener(new SlidingUpPanelLayout.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60446a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60446a, false, 66078, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60446a, false, 66078, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (PoiOptimizedInfoFragment.this.isViewValid() && PoiOptimizedInfoFragment.this.mSlideUpPanelLayout != null && ((float) i) <= PoiOptimizedInfoFragment.this.mSlideUpPanelLayout.getAnchorHeight()) {
                    PoiOptimizedInfoFragment.this.F();
                }
            }

            public final void a(float f2) {
                float f3;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60446a, false, 66076, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60446a, false, 66076, new Class[]{Float.TYPE}, Void.TYPE);
                } else if (PoiOptimizedInfoFragment.this.isViewValid() && PoiOptimizedInfoFragment.this.mSlideUpPanelLayout != null) {
                    PoiOptimizedInfoFragment.this.S();
                    PoiOptimizedInfoFragment.this.T();
                    PoiOptimizedInfoFragment poiOptimizedInfoFragment = PoiOptimizedInfoFragment.this;
                    if (PatchProxy.isSupport(new Object[0], poiOptimizedInfoFragment, PoiOptimizedInfoFragment.A, false, 66068, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], poiOptimizedInfoFragment, PoiOptimizedInfoFragment.A, false, 66068, new Class[0], Void.TYPE);
                    } else if (poiOptimizedInfoFragment.isViewValid()) {
                        float panelTop = poiOptimizedInfoFragment.mSlideUpPanelLayout.getPanelTop();
                        float slideRange = poiOptimizedInfoFragment.mSlideUpPanelLayout.getSlideRange();
                        float f4 = 0.0f;
                        if (panelTop > slideRange - 200.0f) {
                            f4 = 1.0f - (((slideRange - panelTop) * 1.0f) / 200.0f);
                            f3 = 0.0f;
                        } else if (panelTop > slideRange - 400.0f) {
                            f3 = (((slideRange - panelTop) - 200.0f) * 1.0f) / 200.0f;
                        } else {
                            f3 = 1.0f;
                        }
                        poiOptimizedInfoFragment.u.a(f3, f4);
                    }
                    if (f2 < 0.5f) {
                        PoiOptimizedInfoFragment.this.a(1.0f - ((0.5f - f2) / 0.5f));
                    } else {
                        PoiOptimizedInfoFragment.this.a(1.0f);
                    }
                    PoiOptimizedInfoFragment.this.y = Float.valueOf(f2);
                }
            }

            public final void a(SlidingUpPanelLayout.d dVar) {
                if (PatchProxy.isSupport(new Object[]{dVar}, this, f60446a, false, 66077, new Class[]{SlidingUpPanelLayout.d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar}, this, f60446a, false, 66077, new Class[]{SlidingUpPanelLayout.d.class}, Void.TYPE);
                } else if (PoiOptimizedInfoFragment.this.isViewValid() && PoiOptimizedInfoFragment.this.mSlideUpPanelLayout != null) {
                    PoiOptimizedInfoFragment.this.s();
                    if (dVar == SlidingUpPanelLayout.d.COLLAPSED) {
                        g.c(PoiOptimizedInfoFragment.this.getContext(), j.a().a(PoiOptimizedInfoFragment.this.x().f60802c), "pagedown", PoiOptimizedInfoFragment.this.f3754f);
                        PoiOptimizedInfoFragment.this.u.e();
                        PoiOptimizedInfoFragment.this.C();
                        PoiOptimizedInfoFragment.this.E();
                        bg.a(new d(Boolean.FALSE, PoiOptimizedInfoFragment.this.f3754f));
                        PoiOptimizedInfoFragment.this.z.a();
                        return;
                    }
                    if (dVar != SlidingUpPanelLayout.d.DRAGGING) {
                        if (PoiOptimizedInfoFragment.this.w != null) {
                            PoiOptimizedInfoFragment.this.w = new WeakHandler(PoiOptimizedInfoFragment.this);
                        }
                        PoiOptimizedInfoFragment.this.w.post(new r(this));
                        PoiOptimizedInfoFragment.this.D();
                        bg.a(new d(Boolean.TRUE, PoiOptimizedInfoFragment.this.f3754f));
                        PoiOptimizedInfoFragment.this.z.a(PoiOptimizedInfoFragment.this.getContext(), "poi_page", new ao.a(PoiOptimizedInfoFragment.this.f3754f, PoiOptimizedInfoFragment.this.h, "map", PoiOptimizedInfoFragment.this.A()));
                    }
                }
            }
        });
        this.mSlideUpPanelLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60448a;

            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f60448a, false, 66080, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f60448a, false, 66080, new Class[0], Void.TYPE);
                    return;
                }
                PoiOptimizedInfoFragment.this.S();
            }
        });
        this.mSlideUpPanelLayout.setFadeOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60450a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f60450a, false, 66081, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f60450a, false, 66081, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                PoiOptimizedInfoFragment.this.N();
            }
        });
        a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60452a;

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60452a, false, 66082, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60452a, false, 66082, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (PoiOptimizedInfoFragment.this.isViewValid() && PoiOptimizedInfoFragment.this.mSlideUpPanelLayout != null) {
                    PoiOptimizedInfoFragment.this.s();
                    if (PoiOptimizedInfoFragment.this.y != null && PoiOptimizedInfoFragment.this.y.floatValue() >= PoiOptimizedInfoFragment.this.mSlideUpPanelLayout.getAnchorPoint()) {
                        int i3 = i2;
                        PoiOptimizedInfoFragment.this.a(i2);
                    }
                }
            }
        });
    }
}
