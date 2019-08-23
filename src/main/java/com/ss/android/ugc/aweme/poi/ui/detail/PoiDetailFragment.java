package com.ss.android.ugc.aweme.poi.ui.detail;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.a.a;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.b.d;
import com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.utils.bg;

public class PoiDetailFragment extends AbsSlidablePoiAwemeFeedFragment implements PoiAwemeFeedAdapter.a {
    public static ChangeQuickRedirect A;
    public View B;
    public int C;
    int D;
    public boolean E = true;
    public boolean F;
    @BindView(2131493095)
    AppBarLayout mAppBarLayout;
    @BindView(2131495411)
    public RecyclerView mRecyclerView;

    public final PoiAwemeFeedAdapter.a G() {
        return this;
    }

    public final int k() {
        return C0906R.layout.pj;
    }

    public final boolean b() {
        return this.E;
    }

    public final void P() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66354, new Class[0], Void.TYPE);
            return;
        }
        s();
        this.mRecyclerView.stopScroll();
        this.mAppBarLayout.b(0);
    }

    public final void Q() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66355, new Class[0], Void.TYPE);
            return;
        }
        this.mRecyclerView.stopScroll();
        this.mAppBarLayout.b(-this.mAppBarLayout.getAnchorHeight());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void S() {
        int g = this.f3750b.g();
        if (g > 0) {
            AnonymousClass3 r1 = new LinearSmoothScroller(this.mRecyclerView.getContext()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60687a;

                public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
                    if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60687a, false, 66364, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                        return super.calculateDtToFit(i, i2, i3, i4, -1);
                    }
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60687a, false, 66364, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
                }
            };
            r1.setTargetPosition(g);
            this.mRecyclerView.getLayoutManager().startSmoothScroll(r1);
        }
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66357, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAppBarLayout != null && this.F) {
            this.z.a(getContext(), "poi_page", new ao.a(this.f3754f, this.h, "map", A()));
        }
    }

    public final void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, A, false, 66352, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, A, false, 66352, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.D > 0) {
            float f2 = (((float) i) * 1.0f) / ((float) (this.C - this.D));
            if (f2 < 0.5f) {
                a(1.0f - ((0.5f - f2) / 0.5f), i);
            } else {
                a(1.0f, i);
            }
            a(i);
        }
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, A, false, 66349, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, A, false, 66349, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.D > 0) {
            int i2 = this.C - this.D;
            if (i <= i2) {
                this.mHeader.setTranslationY(0.0f);
                this.mPoiMap.setTranslationY((float) ((-i2) / 2));
                return;
            }
            float f2 = (float) i2;
            float abs = Math.abs((((float) i) * 1.0f) / f2);
            this.mHeader.setTranslationY(((float) this.mHeader.getHeight()) * (1.0f - abs));
            this.mPoiMap.setTranslationY(((-abs) * f2) / 2.0f);
        }
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, A, false, 66350, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, A, false, 66350, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.D > 0) {
            if (i <= this.C - this.D) {
                float height = 1.0f - ((((float) ((this.D + i) - this.mTopbarStatus.getHeight())) * 1.0f) / ((float) (this.C - this.mTopbarStatus.getHeight())));
                this.mTopbarBg.setAlpha(height);
                this.mTopbarStatus.setAlpha(height);
                this.u.a(height);
                if (this.x) {
                    this.mTopCollectImg.setAlpha(height);
                }
                if (height > 0.0f) {
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

    private void a(float f2, int i) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i)}, this, A, false, 66353, new Class[]{Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i)}, this, A, false, 66353, new Class[]{Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3750b.a(f2);
        this.mPoiMore.setTranslationY((float) i);
        this.mPoiMore.setAlpha(1.0f - f2);
        if (f2 < 1.0f) {
            this.mPoiMore.setVisibility(0);
        } else {
            this.mPoiMore.setVisibility(8);
        }
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, A, false, 66348, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, A, false, 66348, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.B = view;
        Resources resources = getResources();
        if (a.a(getContext())) {
            i = C0906R.dimen.ko;
        } else {
            i = C0906R.dimen.kn;
        }
        this.C = resources.getDimensionPixelSize(i);
        this.mHeader.getLayoutParams().height = this.C;
        this.mAppBarLayout.a((AppBarLayout.a) new AppBarLayout.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60683a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60683a, false, 66361, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60683a, false, 66361, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (PoiDetailFragment.this.isViewValid() && PoiDetailFragment.this.mAppBarLayout != null) {
                    new StringBuilder("PoiDetailFragment//////state...").append(i);
                    if (i == 1) {
                        PoiDetailFragment.this.F = true;
                        PoiDetailFragment.this.u.e();
                        PoiDetailFragment.this.C();
                        PoiDetailFragment.this.E();
                        bg.a(new d(Boolean.FALSE, PoiDetailFragment.this.f3754f));
                        PoiDetailFragment.this.z.a();
                        PoiDetailFragment.this.F = false;
                        return;
                    }
                    PoiDetailFragment.this.w.post(new c(this));
                    PoiDetailFragment.this.D();
                    bg.a(new d(Boolean.TRUE, PoiDetailFragment.this.f3754f));
                    PoiDetailFragment.this.z.a(PoiDetailFragment.this.getContext(), "poi_page", new ao.a(PoiDetailFragment.this.f3754f, PoiDetailFragment.this.h, "map", PoiDetailFragment.this.A()));
                }
            }

            public final void a(AppBarLayout appBarLayout, int i) {
                float f2;
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f60683a, false, 66360, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f60683a, false, 66360, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE);
                } else if (PoiDetailFragment.this.isViewValid() && PoiDetailFragment.this.mAppBarLayout != null) {
                    StringBuilder sb = new StringBuilder("PoiDetailFragment////");
                    sb.append(i2);
                    sb.append("/anchorH:");
                    sb.append(PoiDetailFragment.this.C);
                    sb.append("/");
                    sb.append(appBarLayout.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailFragment.this.B.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailFragment.this.mTopbarStatus.getHeight());
                    PoiDetailFragment.this.s();
                    PoiDetailFragment.this.E = false;
                    PoiDetailFragment.this.c(i2);
                    PoiDetailFragment.this.d(i2);
                    PoiDetailFragment poiDetailFragment = PoiDetailFragment.this;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, poiDetailFragment, PoiDetailFragment.A, false, 66351, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PoiDetailFragment poiDetailFragment2 = poiDetailFragment;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, poiDetailFragment2, PoiDetailFragment.A, false, 66351, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (poiDetailFragment.isViewValid() && poiDetailFragment.D > 0) {
                        float f3 = 0.0f;
                        if (i2 >= -200) {
                            f3 = ((((float) i2) * 1.0f) / 200.0f) + 1.0f;
                            f2 = 0.0f;
                        } else if (i2 >= -400) {
                            f2 = (((float) (-(i2 + 200))) * 1.0f) / 200.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        poiDetailFragment.u.a(f2, f3);
                    }
                    PoiDetailFragment.this.e(i2);
                }
            }
        });
        a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60685a;

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60685a, false, 66363, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60685a, false, 66363, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (PoiDetailFragment.this.isViewValid() && PoiDetailFragment.this.mAppBarLayout != null) {
                    PoiDetailFragment.this.s();
                    int i3 = i2;
                    PoiDetailFragment.this.a(i2);
                }
            }
        });
    }

    public final void a(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, A, false, 66356, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, A, false, 66356, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        CoordinatorLayout.d dVar = (CoordinatorLayout.d) this.mAppBarLayout.getLayoutParams();
        int height = this.B.getHeight() - i;
        dVar.height = height;
        this.D = height;
        this.mAppBarLayout.setLayoutParams(dVar);
        this.mAppBarLayout.setAnchorHeight(height - this.C);
        if (this.f3752d != null) {
            if (this.f3752d.displayStyle == 1) {
                this.F = true;
                this.w.postDelayed(new a(this), 200);
            } else if (this.f3752d.displayStyle == 2) {
                this.E = false;
                this.mAppBarLayout.a(-height);
                this.w.postDelayed(new b(this), 200);
                return;
            }
        }
        this.mAppBarLayout.a(this.C - height);
    }
}
