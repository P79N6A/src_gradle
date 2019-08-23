package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.h.c;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.utils.ex;

public class MTAwemeListFragment extends AwemeListFragment {
    public static ChangeQuickRedirect J;
    private boolean K;
    private boolean L;

    public final int b() {
        return C0906R.layout.mz;
    }

    private void E() {
        if (PatchProxy.isSupport(new Object[0], this, J, false, 68126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, J, false, 68126, new Class[0], Void.TYPE);
            return;
        }
        this.q.setVisibility(0);
        this.z.setVisibility(4);
        this.q.e();
        if (this.r != null) {
            this.r.a(this.f3788e, this.f3787d);
        }
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, J, false, 68124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, J, false, 68124, new Class[0], Void.TYPE);
        } else if (this.K || this.L) {
            y_();
        } else if (this.q == null || !this.A) {
            w();
        } else {
            this.q.setVisibility(4);
            this.z.setVisibility(0);
        }
    }

    public final int s() {
        if (PatchProxy.isSupport(new Object[0], this, J, false, 68123, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, J, false, 68123, new Class[0], Integer.TYPE)).intValue();
        } else if (this.q == null || (!this.q.h() && !this.q.i())) {
            return 0;
        } else {
            return (int) (this.q.getY() + ((float) this.q.getMeasuredHeight()));
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, J, false, 68125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, J, false, 68125, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (((a) this.p.i()).isHasMore()) {
                loadMore();
            }
            this.q.k();
            if (!this.f3788e || this.f3787d != 0) {
                E();
                return;
            }
            if (this.n.getItemCount() == 0 && !this.n.g && this.r != null) {
                this.r.a(this.f3788e, this.f3787d);
            }
            this.q.setVisibility(4);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, J, false, 68127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, J, false, 68127, new Class[0], Void.TYPE);
            return;
        }
        boolean z = this.f3788e;
        int i = C0906R.string.bfp;
        if (!z) {
            i = this.f3787d == 0 ? C0906R.string.dqb : C0906R.string.dq0;
        } else if (this.f3787d == 0) {
            i = C0906R.string.aaw;
        } else if (this.f3787d == 1) {
            if (!ex.b()) {
                i = !((Boolean) x.a().h().c()).booleanValue() ? C0906R.string.al_ : ((Integer) x.a().g().c()).intValue() == 0 ? C0906R.string.b5h : C0906R.string.b5i;
            }
        } else if (this.f3787d == 2) {
            i = C0906R.string.cf6;
        }
        this.t = DmtStatusView.a.a(getContext());
        DmtTextView c2 = c((int) C0906R.string.b6z);
        DmtTextView c3 = c(i);
        c2.setOnClickListener(new af(this));
        this.t.b((View) c3).c((View) c2);
        this.q.setBuilder(this.t);
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, J, false, 68122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, J, false, 68122, new Class[0], Void.TYPE);
            return;
        }
        this.m.setOverScrollMode(2);
        q();
        this.m.setLayoutManager(this.o);
        this.m.addItemDecoration(t());
        OnAnimatedScrollListener onAnimatedScrollListener = null;
        if (!c.a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.m.addOnScrollListener(onAnimatedScrollListener);
        }
        this.I = new com.ss.android.ugc.aweme.common.d.a(this.m, onAnimatedScrollListener);
        this.m = df.a(this.m, this);
        u();
        this.m.setAdapter(this.n);
        v();
        if (this.f3788e || this.u) {
            w();
        }
        if (this.h > 0) {
            this.m.setPadding(0, 0, 0, this.h);
        }
    }

    public final void c(boolean z) {
        this.K = z;
    }

    public final void d(boolean z) {
        this.L = z;
    }

    private DmtTextView c(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, J, false, 68128, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, J, false, 68128, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        dmtTextView.setTextColor(getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public static MTAwemeListFragment a(int i, int i2, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{-1, Integer.valueOf(i2), str2, (byte) 0}, null, J, true, 68121, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, MTAwemeListFragment.class)) {
            return (MTAwemeListFragment) PatchProxy.accessDispatch(new Object[]{-1, Integer.valueOf(i2), str2, (byte) 0}, null, J, true, 68121, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, MTAwemeListFragment.class);
        }
        MTAwemeListFragment mTAwemeListFragment = new MTAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        bundle.putString("uid", str2);
        bundle.putBoolean("is_my_profile", false);
        bundle.putInt("bottom_bar_height", -1);
        mTAwemeListFragment.setArguments(bundle);
        return mTAwemeListFragment;
    }
}
