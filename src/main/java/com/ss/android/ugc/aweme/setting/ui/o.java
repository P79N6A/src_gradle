package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout;

public final class o extends MaterialRippleLayout {
    public static ChangeQuickRedirect n;
    a o;
    private TextView p;
    private TextView q;
    private View r;
    private ImageView s;
    private RadioSettingGroup t;

    public interface a {
        boolean a(View view);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 72577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 72577, new Class[0], Void.TYPE);
            return;
        }
        if (this.t == null && (getParent() instanceof RadioSettingGroup)) {
            this.t = (RadioSettingGroup) getParent();
        }
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, n, false, 72575, new Class[0], Boolean.TYPE)) {
            return this.s.isSelected();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, n, false, 72575, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void setOnSettingItemClickListener(a aVar) {
        this.o = aVar;
    }

    public o(Context context) {
        this(context, null);
    }

    public final void setStartText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, n, false, 72580, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, n, false, 72580, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.p.setText(str2);
    }

    public final void setChecked(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 72578, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 72578, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!c()) {
            d();
            if (this.t != null) {
                for (int i = 0; i < this.t.getChildCount(); i++) {
                    if (this.t.getChildAt(i) instanceof o) {
                        o oVar = (o) this.t.getChildAt(i);
                        if (equals(oVar)) {
                            z2 = z;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        oVar.setSelfChecked(z2);
                    }
                }
                return;
            }
            setSelfChecked(z);
        }
    }

    public final void setStartSubText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, n, false, 72582, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, n, false, 72582, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.setVisibility(0);
            this.q.setText(str);
        }
    }

    public final void setStartSubTextColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, n, false, 72583, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, n, false, 72583, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.setTextColor(i);
        }
    }

    public final void setStartTextColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, n, false, 72581, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, n, false, 72581, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.setTextColor(i);
        }
    }

    public final void setSelfChecked(boolean z) {
        Drawable drawable;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, n, false, 72576, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, n, false, 72576, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.s.setSelected(z2);
        if (z2) {
            if (PatchProxy.isSupport(new Object[]{2130839076}, null, com.ss.android.ugc.aweme.base.utils.o.f35041a, true, 25258, new Class[]{Integer.TYPE}, Drawable.class)) {
                drawable = (Drawable) PatchProxy.accessDispatch(new Object[]{2130839076}, null, com.ss.android.ugc.aweme.base.utils.o.f35041a, true, 25258, new Class[]{Integer.TYPE}, Drawable.class);
            } else {
                drawable = com.ss.android.ugc.bytex.a.a.a.a(com.ss.android.ugc.aweme.base.utils.o.a(), 2130839076);
            }
            this.s.setImageDrawable(drawable);
            return;
        }
        this.s.setImageDrawable(null);
    }

    private o(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[]{context}, this, n, false, 72573, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, n, false, 72573, new Class[]{Context.class}, Void.TYPE);
        } else {
            View inflate = View.inflate(context, C0906R.layout.ad1, this);
            this.r = inflate.findViewById(C0906R.id.chy);
            this.p = (TextView) inflate.findViewById(C0906R.id.ddn);
            this.s = (ImageView) inflate.findViewById(C0906R.id.bb3);
            this.q = (TextView) inflate.findViewById(C0906R.id.ddm);
            d();
        }
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, n, false, 72579, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, n, false, 72579, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItem);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 11) {
                    this.p.setText(obtainStyledAttributes.getString(index));
                } else if (index == 15) {
                    this.p.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics())));
                } else if (index == 14) {
                    this.p.setTextColor(obtainStyledAttributes.getColor(index, ContextCompat.getColor(getContext(), C0906R.color.a6i)));
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[0], this, n, false, 72574, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, n, false, 72574, new Class[0], Void.TYPE);
            return;
        }
        this.r.setOnClickListener(new p(this));
    }
}
