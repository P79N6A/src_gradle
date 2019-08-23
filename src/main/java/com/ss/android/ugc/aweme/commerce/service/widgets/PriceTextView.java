package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.taobao.android.dexposed.ClassUtils;

public class PriceTextView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38281a;

    /* renamed from: b  reason: collision with root package name */
    private int f38282b;

    /* renamed from: c  reason: collision with root package name */
    private int f38283c;

    /* renamed from: d  reason: collision with root package name */
    private float f38284d;

    /* renamed from: e  reason: collision with root package name */
    private float f38285e;

    /* renamed from: f  reason: collision with root package name */
    private float f38286f;
    private DmtTextView g;
    private DmtTextView h;
    private DmtTextView i;
    private String j = "";
    private String k = "";

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38281a, false, 30074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38281a, false, 30074, new Class[0], Void.TYPE);
            return;
        }
        try {
            String[] split = getContext().getString(C0906R.string.akm, new Object[]{Float.valueOf(((float) this.f38282b) / 100.0f)}).split("[.]");
            this.j = split[0];
            this.k = ClassUtils.PACKAGE_SEPARATOR + split[1];
        } catch (Exception unused) {
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f38281a, false, 30071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38281a, false, 30071, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.g = new DmtTextView(getContext());
        this.h = new DmtTextView(getContext());
        this.i = new DmtTextView(getContext());
        addView(this.g);
        addView(this.h);
        addView(this.i);
        setOrientation(0);
    }

    public PriceTextView(Context context) {
        super(context);
    }

    public PriceTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i2, int i3, float f2, float f3, float f4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, f38281a, false, 30072, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, f38281a, false, 30072, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f38283c = i3;
        this.f38282b = i2;
        this.f38284d = f2;
        this.f38285e = f3;
        this.f38286f = f4;
        if (PatchProxy.isSupport(new Object[0], this, f38281a, false, 30073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38281a, false, 30073, new Class[0], Void.TYPE);
            return;
        }
        this.g.setTextColor(this.f38283c);
        this.h.setTextColor(this.f38283c);
        this.i.setTextColor(this.f38283c);
        this.g.setTextSize(1, this.f38284d);
        this.h.setTextSize(1, this.f38285e);
        this.i.setTextSize(1, this.f38286f);
        a();
        this.g.setText(getContext().getString(C0906R.string.sq));
        this.g.setPadding(0, 0, (int) UIUtils.dip2Px(getContext(), 4.0f), 0);
        this.h.setText(this.j);
        this.i.setText(this.k);
        if (TextUtils.equals(this.k, ".00")) {
            this.i.setVisibility(8);
        } else if (this.k.endsWith(PushConstants.PUSH_TYPE_NOTIFY)) {
            this.i.setVisibility(0);
            this.h.setVisibility(0);
            this.i.setText(this.k.substring(0, 2));
        } else {
            this.i.setVisibility(0);
            this.h.setVisibility(0);
        }
        requestLayout();
    }
}
