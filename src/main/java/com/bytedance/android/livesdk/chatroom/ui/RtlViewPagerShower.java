package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.uikit.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;

public class RtlViewPagerShower extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11768a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable f11769b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f11770c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<ImageView> f11771d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private int f11772e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final LinearLayout.LayoutParams f11773f = new LinearLayout.LayoutParams(-2, -2);

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11768a, false, 6414, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11768a, false, 6414, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f11771d != null && !this.f11771d.isEmpty()) {
            if (this.f11772e >= 0 && this.f11772e < this.f11771d.size()) {
                if (this.f11769b != null) {
                    this.f11771d.get(this.f11772e).setImageDrawable(this.f11769b);
                } else {
                    this.f11771d.get(this.f11772e).setImageResource(2130841023);
                }
            }
            if (i >= 0 && i < this.f11771d.size()) {
                if (this.f11770c != null) {
                    this.f11771d.get(i).setImageDrawable(this.f11770c);
                } else {
                    this.f11771d.get(i).setImageResource(2130841022);
                }
                this.f11772e = i;
            }
        }
    }

    public RtlViewPagerShower(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f11768a, false, 6413, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f11768a, false, 6413, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        removeAllViews();
        this.f11771d.clear();
        for (int i3 = 0; i3 < i; i3++) {
            ImageView imageView = new ImageView(getContext());
            if (this.f11769b != null) {
                imageView.setImageDrawable(this.f11769b);
            } else {
                imageView.setImageResource(2130841023);
            }
            if (a.a() || a.j() || a.b() || i3 >= i - 1) {
                addView(imageView);
            } else {
                int dimension = (int) getContext().getResources().getDimension(C0906R.dimen.o_);
                this.f11773f.setMargins(0, 0, dimension, 0);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f11773f.setMarginStart(0);
                    this.f11773f.setMarginEnd(dimension);
                }
                addView(imageView, this.f11773f);
            }
            this.f11771d.add(imageView);
        }
        a(i2);
    }

    public RtlViewPagerShower(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
