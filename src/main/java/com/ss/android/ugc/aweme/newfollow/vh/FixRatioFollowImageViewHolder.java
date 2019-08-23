package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.a.b;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.List;

public class FixRatioFollowImageViewHolder extends FollowImageViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f57514c;

    public final boolean j() {
        return true;
    }

    public final void p() {
    }

    public final void x() {
    }

    public final void ab() {
        if (PatchProxy.isSupport(new Object[0], this, f57514c, false, 62121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57514c, false, 62121, new Class[0], Void.TYPE);
        } else if (AbTestManager.a().aD()) {
            ac();
        } else {
            super.ab();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f57514c, false, 62120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57514c, false, 62120, new Class[0], Void.TYPE);
            return;
        }
        this.mLineDivider.setVisibility(8);
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f57514c, false, 62115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57514c, false, 62115, new Class[0], Void.TYPE);
            return;
        }
        w();
        y();
        if (!j()) {
            F();
        }
        x();
    }

    public final List<String> B() {
        if (PatchProxy.isSupport(new Object[0], this, f57514c, false, 62118, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f57514c, false, 62118, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!ex.a(this.j) && ex.b(this.j)) {
            arrayList.add(X().getString(C0906R.string.dpt));
        }
        return arrayList;
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, f57514c, false, 62116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57514c, false, 62116, new Class[0], Void.TYPE);
            return;
        }
        if (this.mShareCountView != null) {
            this.mShareCountView.setVisibility(0);
            this.mShareCountView.setTextSize(1, 13.0f);
            if (!b.c(this.j) || this.mShareCountView == null) {
                this.mShareCountView.setText(C0906R.string.drp);
            } else {
                this.mShareCountView.setText(C0906R.string.bc_);
            }
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57514c, false, 62117, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57514c, false, 62117, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a41);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        viewStub4.setLayoutResource(C0906R.layout.a4a);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub5.setLayoutResource(C0906R.layout.a4f);
        a(viewStub5.inflate(), 16.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub6.setLayoutResource(C0906R.layout.a42);
        a(viewStub6.inflate(), 16.0f, 20.0f);
    }

    public final void a(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57514c, false, 62119, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57514c, false, 62119, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        int screenWidth = UIUtils.getScreenWidth(X());
        int screenHeight = UIUtils.getScreenHeight(X());
        float dip2Px = UIUtils.dip2Px(X(), 16.0f);
        float f2 = ((float) i2) / ((float) i);
        float f3 = ((float) screenHeight) * 0.56f;
        if (f2 > 1.3333334f) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / 1.3333334f);
            int i3 = (int) ((((float) screenWidth) * 0.85f) - dip2Px);
            if (iArr[0] > i3) {
                iArr[0] = i3;
            }
        } else {
            iArr[0] = (int) (((float) screenWidth) - (dip2Px * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f2);
            if (((float) iArr[1]) > f3) {
                iArr[1] = (int) f3;
                iArr[0] = (int) (((float) iArr[1]) / f2);
            }
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view2.setLayoutParams(layoutParams);
    }

    public FixRatioFollowImageViewHolder(FollowFeedLayout followFeedLayout, a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout, aVar, lVar, aVar2, true);
    }
}
