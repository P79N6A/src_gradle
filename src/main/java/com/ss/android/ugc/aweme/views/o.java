package com.ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;

public class o extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private static final int f4307a = ((int) UIUtils.dip2Px(d.a(), 20.0f));

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f4308f;
    protected int g;
    protected int h;

    public void c() {
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f4308f, false, 89601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4308f, false, 89601, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.g, this.h);
        }
    }

    public o(@NonNull Context context, int i, int i2) {
        super(context, C0906R.style.ti);
        this.g = UIUtils.getScreenWidth(getContext()) + 0;
        this.h = UIUtils.getScreenHeight(getContext()) + 0;
        requestWindowFeature(1);
        c();
    }

    public o(@NonNull Context context, int i, boolean z, boolean z2) {
        this(context, C0906R.style.su, false, true, false);
    }

    public o(@NonNull Context context, int i, boolean z, boolean z2, boolean z3) {
        super(context, i);
        int i2;
        requestWindowFeature(1);
        int i3 = -1;
        if (z3) {
            i2 = -2;
        } else if (z) {
            i2 = -1;
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f4308f, false, 89602, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4308f, false, 89602, new Class[0], Integer.TYPE)).intValue();
            } else {
                i2 = UIUtils.getScreenWidth(getContext()) - (f4307a * 2);
            }
        }
        this.g = i2;
        if (!z) {
            if (z2) {
                i3 = -2;
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f4308f, false, 89603, new Class[0], Integer.TYPE)) {
                    i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4308f, false, 89603, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i3 = UIUtils.getScreenHeight(getContext()) - (f4307a * 4);
                }
            }
        }
        this.h = i3;
        c();
    }
}
