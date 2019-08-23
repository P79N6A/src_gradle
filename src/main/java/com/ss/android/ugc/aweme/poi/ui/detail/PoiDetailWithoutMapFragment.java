package com.ss.android.ugc.aweme.poi.ui.detail;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.a.a;
import com.ss.android.ugc.aweme.newfollow.util.g;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.ui.AbsSlidablePoiAwemeFeedFragment;
import com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.AppBarLayout;
import com.ss.android.ugc.aweme.poi.ui.detail.widget.CoordinatorLayout;

public class PoiDetailWithoutMapFragment extends AbsSlidablePoiAwemeFeedFragment implements g, PoiAwemeFeedAdapter.a {
    public static ChangeQuickRedirect A;
    public View B;
    int C;
    public int D;
    @BindView(2131493095)
    AppBarLayout mAppBarLayout;
    @BindView(2131495411)
    public RecyclerView mRecyclerView;

    public final PoiAwemeFeedAdapter.a G() {
        return this;
    }

    public final g H() {
        return this;
    }

    public final boolean M() {
        return false;
    }

    public final void Q() {
    }

    public final boolean R() {
        return false;
    }

    public final void a(int i, float f2) {
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, A, false, 66374, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, A, false, 66374, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
        }
    }

    public final void b(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, A, false, 66375, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, A, false, 66375, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
        }
    }

    public final boolean b() {
        return false;
    }

    public final int k() {
        return C0906R.layout.pb;
    }

    public final int a() {
        return this.C + this.D;
    }

    public final void P() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66370, new Class[0], Void.TYPE);
            return;
        }
        PoiRouteActivity.a(getContext(), this.j, "poi_page", A(), true);
    }

    public final void O() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66371, new Class[0], Void.TYPE);
            return;
        }
        CoordinatorLayout.d dVar = (CoordinatorLayout.d) this.mAppBarLayout.getLayoutParams();
        dVar.height = this.C;
        this.mAppBarLayout.setLayoutParams(dVar);
        if (PatchProxy.isSupport(new Object[0], this, A, false, 66372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 66372, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3752d != null && this.f3752d.displayStyle == 2) {
            int g = this.f3750b.g();
            if (g > 0) {
                a(g, true);
            }
        }
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, A, false, 66367, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, A, false, 66367, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.C > 0) {
            int i2 = -this.C;
            if (i <= i2) {
                this.mPoiMap.setTranslationY((float) ((-i2) / 2));
                return;
            }
            float f2 = (float) i2;
            this.mPoiMap.setTranslationY(((-Math.abs((((float) i) * 1.0f) / f2)) * f2) / 2.0f);
        }
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, A, false, 66368, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, A, false, 66368, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.C > 0) {
            float height = 1.0f - ((((float) ((this.C + i) - this.mTopbarStatus.getHeight())) * 1.0f) / ((float) (this.C - this.mTopbarStatus.getHeight())));
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
        }
    }

    public final void a(int i, boolean z) {
        long j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, A, false, 66373, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, A, false, 66373, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mAppBarLayout.a(-this.C);
        WeakHandler weakHandler = this.w;
        d dVar = new d(this, z, i);
        if (z) {
            j = 100;
        } else {
            j = 0;
        }
        weakHandler.postDelayed(dVar, j);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, A, false, 66366, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, A, false, 66366, new Class[]{View.class, Bundle.class}, Void.TYPE);
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
            public static ChangeQuickRedirect f60691a;

            public final void a(int i) {
            }

            public final void a(AppBarLayout appBarLayout, int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f60691a, false, 66377, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f60691a, false, 66377, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE);
                } else if (PoiDetailWithoutMapFragment.this.isViewValid() && PoiDetailWithoutMapFragment.this.mAppBarLayout != null) {
                    StringBuilder sb = new StringBuilder("PoiDetailWithoutMapFragment////");
                    sb.append(i2);
                    sb.append("/");
                    sb.append(appBarLayout.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailWithoutMapFragment.this.B.getHeight());
                    sb.append("/");
                    sb.append(PoiDetailWithoutMapFragment.this.mTopbarStatus.getHeight());
                    PoiDetailWithoutMapFragment.this.D = i2;
                    PoiDetailWithoutMapFragment.this.s();
                    PoiDetailWithoutMapFragment.this.c(i2);
                    PoiDetailWithoutMapFragment.this.d(i2);
                    PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = PoiDetailWithoutMapFragment.this;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, poiDetailWithoutMapFragment, PoiDetailWithoutMapFragment.A, false, 66369, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PoiDetailWithoutMapFragment poiDetailWithoutMapFragment2 = poiDetailWithoutMapFragment;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, poiDetailWithoutMapFragment2, PoiDetailWithoutMapFragment.A, false, 66369, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (poiDetailWithoutMapFragment.isViewValid() && poiDetailWithoutMapFragment.C > 0) {
                        poiDetailWithoutMapFragment.a(i2);
                    }
                }
            }
        });
        a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60693a;

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60693a, false, 66378, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60693a, false, 66378, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (PoiDetailWithoutMapFragment.this.isViewValid() && PoiDetailWithoutMapFragment.this.mAppBarLayout != null) {
                    PoiDetailWithoutMapFragment.this.s();
                    int i3 = i2;
                    PoiDetailWithoutMapFragment.this.a(i2);
                }
            }
        });
    }
}
