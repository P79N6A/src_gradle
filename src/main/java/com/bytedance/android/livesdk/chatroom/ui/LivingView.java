package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LivingView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11678a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f11679b = ac.a(32.0f);

    /* renamed from: c  reason: collision with root package name */
    private static final int f11680c = ac.a(40.0f);

    /* renamed from: d  reason: collision with root package name */
    private static final int f11681d = ac.a(48.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final int f11682e = ac.a(56.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final int f11683f = ac.a(64.0f);
    private static final int g = ac.a(68.0f);
    private static final int h = ac.a(72.0f);
    private static final int i = ac.a(80.0f);
    private static final int j = ac.a(13.0f);
    private static final int k = ac.a(33.0f);
    private static final int l = ac.a(14.0f);
    private static final int m = ac.a(50.0f);
    private static final int n = ac.a(20.0f);
    private static final int o = ac.a(49.5f);
    private static final int p = ac.a(21.0f);
    private TextView q;
    private et r;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11678a, false, 6200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11678a, false, 6200, new Class[0], Void.TYPE);
            return;
        }
        this.r.setVisibility(0);
        this.r.setColor(ac.b((int) C0906R.color.aey));
        this.q.setVisibility(0);
    }

    public LivingView(Context context) {
        this(context, null);
    }

    public LivingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11678a, false, 6201, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f11678a, false, 6201, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q.setTextColor(ac.b((int) C0906R.color.adt));
        this.q.setBackgroundResource(2130840895);
        this.q.setText(C0906R.string.crz);
        this.q.setGravity(17);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i9 = layoutParams.width;
        int i10 = layoutParams.height;
        float f2 = 0.0f;
        if (i9 == f11679b) {
            int a2 = ac.a(5.0f);
            i5 = j;
            i4 = a2;
            i8 = i9 - (a2 * 2);
            f2 = 8.0f;
        } else {
            if (i9 == f11680c) {
                i8 = k;
                i6 = l;
                i7 = (i9 - i8) / 2;
            } else if (i9 == f11681d) {
                int a3 = ac.a(8.0f);
                i4 = a3;
                i8 = i9 - (a3 * 2);
                i5 = (int) (((float) ac.a(6.0f)) + ac.b(10.0f));
                f2 = 10.0f;
            } else if (i9 == f11682e) {
                i8 = k;
                i6 = l;
                i7 = (i9 - i8) / 2;
            } else {
                if (i9 == g) {
                    i9 += ac.a(8.0f);
                    i10 += ac.a(8.0f);
                } else if (i9 == h) {
                    i8 = m;
                    i4 = (i9 - i8) / 2;
                    i5 = n;
                    f2 = 12.0f;
                } else if (i9 == i) {
                    i9 += ac.a(8.0f);
                    i10 += ac.a(8.0f);
                    f2 = 13.5f;
                    i8 = o;
                    i5 = p;
                    i4 = (i9 - i8) / 2;
                }
                i5 = 0;
                i4 = 0;
            }
            i4 = i7;
            i5 = i6;
            f2 = 9.0f;
        }
        this.r.getLayoutParams().width = i9;
        this.r.getLayoutParams().height = i10;
        this.q.setTextSize(f2);
        this.q.getLayoutParams().width = i8;
        this.q.getLayoutParams().height = i5;
        if (this.q.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) this.q.getLayoutParams()).topMargin = i10 - i5;
            ((FrameLayout.LayoutParams) this.q.getLayoutParams()).leftMargin = i4;
            ((FrameLayout.LayoutParams) this.q.getLayoutParams()).rightMargin = i4;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
    }

    public LivingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[]{context}, this, f11678a, false, 6199, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f11678a, false, 6199, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.q = new TextView(context);
        this.r = new et(context);
        addView(this.r);
        addView(this.q);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
    }
}
