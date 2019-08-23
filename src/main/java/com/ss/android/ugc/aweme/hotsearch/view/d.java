package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.hotsearch.a.a;
import com.ss.android.ugc.aweme.hotsearch.a.e;
import com.ss.android.ugc.aweme.hotsearch.fragment.BaseSingleRankingListFragment;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49875a;

    /* renamed from: b  reason: collision with root package name */
    public Context f49876b;

    /* renamed from: c  reason: collision with root package name */
    BaseSingleRankingListFragment f49877c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f49878d;

    /* renamed from: e  reason: collision with root package name */
    public AppBarLayout f49879e;

    /* renamed from: f  reason: collision with root package name */
    public RemoteImageView f49880f;
    public NormalTitleBar g;
    public TextView h;
    int i;
    public UrlModel j;
    private CollapsingToolbarLayout k;
    private TextView l;
    private LinearLayout m;
    private ImageView n;
    private int o;

    public final void a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f49875a, false, 49845, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f49875a, false, 49845, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f49878d = list;
        this.i = 0;
        c(this.i);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49875a, false, 49842, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49875a, false, 49842, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.setTitle(i2);
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49875a, false, 49844, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49875a, false, 49844, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f49880f.setImageResource(i2);
        ((GenericDraweeHierarchy) this.f49880f.getHierarchy()).setFailureImage(i2);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49875a, false, 49846, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49875a, false, 49846, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 >= 0 && i2 < this.f49878d.size()) {
            this.i = i2;
            if (this.i == 0) {
                this.h.setText(this.f49876b.getString(C0906R.string.bv1, new Object[]{this.f49877c.g()}));
                return;
            }
            this.h.setText(this.f49878d.get(i2));
        }
    }

    public d(View view, Context context, BaseSingleRankingListFragment baseSingleRankingListFragment, int i2) {
        String str;
        this.f49879e = (AppBarLayout) view.findViewById(C0906R.id.ck9);
        this.k = (CollapsingToolbarLayout) view.findViewById(C0906R.id.tz);
        this.f49880f = (RemoteImageView) view.findViewById(C0906R.id.asl);
        this.g = (NormalTitleBar) view.findViewById(C0906R.id.d3m);
        this.l = (TextView) view.findViewById(C0906R.id.c_o);
        this.m = (LinearLayout) view.findViewById(C0906R.id.by8);
        this.n = (ImageView) view.findViewById(C0906R.id.b3x);
        this.h = (TextView) view.findViewById(C0906R.id.a1u);
        this.f49876b = context;
        this.f49877c = baseSingleRankingListFragment;
        this.o = i2;
        if (this.o == 4) {
            if (this.h != null) {
                this.h.setText(this.f49876b.getString(C0906R.string.b4z, new Object[]{""}));
            }
            v.a((View) this.n, 8);
        } else {
            if (this.h != null) {
                TextView textView = this.h;
                Context context2 = this.f49876b;
                Object[] objArr = new Object[1];
                if (this.f49877c != null) {
                    str = this.f49877c.g();
                } else {
                    str = "";
                }
                objArr[0] = str;
                textView.setText(context2.getString(C0906R.string.bv1, objArr));
            }
            v.a((View) this.n, 0);
            this.m.setOnClickListener(new e(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f49875a, false, 49841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49875a, false, 49841, new Class[0], Void.TYPE);
        } else {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.f49879e.getLayoutParams();
            layoutParams.height = (int) ((((float) UIUtils.getScreenWidth(this.f49876b)) * 0.44444445f) + ((float) this.f49876b.getResources().getDimensionPixelSize(C0906R.dimen.r7)));
            this.f49879e.setLayoutParams(layoutParams);
        }
        this.f49879e.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49881a;

            public final void a(AppBarLayout appBarLayout, int i) {
                if (PatchProxy.isSupport(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f49881a, false, 49853, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{appBarLayout, Integer.valueOf(i)}, this, f49881a, false, 49853, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                if (i == 0) {
                    d.this.f49880f.setAlpha(1.0f);
                    d.this.g.getTitleView().setAlpha(0.0f);
                    return;
                }
                float f2 = (((float) i) * 1.0f) / ((float) totalScrollRange);
                d.this.f49880f.setAlpha(1.0f - Math.abs(f2));
                float abs = Math.abs(f2);
                if (((double) abs) > 0.5d) {
                    d.this.g.getTitleView().setAlpha((abs * 2.0f) - 1.0f);
                }
            }
        });
        this.g.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49883a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49883a, false, 49854, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49883a, false, 49854, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                d.this.f49877c.getActivity().onBackPressed();
            }

            public final void b(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49883a, false, 49855, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49883a, false, 49855, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ((e) d.this.f49877c.getActivity()).b();
            }
        });
        this.l.setOnClickListener(new f(this));
    }
}
