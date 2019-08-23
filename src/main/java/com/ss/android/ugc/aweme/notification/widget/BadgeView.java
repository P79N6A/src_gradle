package com.ss.android.ugc.aweme.notification.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class BadgeView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58134a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58135b;

    public int getBadgeGravity() {
        if (!PatchProxy.isSupport(new Object[0], this, f58134a, false, 63304, new Class[0], Integer.TYPE)) {
            return ((FrameLayout.LayoutParams) getLayoutParams()).gravity;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58134a, false, 63304, new Class[0], Integer.TYPE)).intValue();
    }

    public Integer getBadgeCount() {
        if (PatchProxy.isSupport(new Object[0], this, f58134a, false, 63302, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f58134a, false, 63302, new Class[0], Integer.class);
        } else if (getText() == null) {
            return null;
        } else {
            try {
                return Integer.valueOf(Integer.parseInt(getText().toString()));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public int[] getBadgeMargin() {
        if (PatchProxy.isSupport(new Object[0], this, f58134a, false, 63307, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f58134a, false, 63307, new Class[0], int[].class);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        return new int[]{layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin};
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    private int a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f58134a, false, 63312, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return (int) ((getContext().getResources().getDisplayMetrics().density * f2) + 0.5f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f58134a, false, 63312, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public void setBadgeGravity(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58134a, false, 63303, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58134a, false, 63303, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
    }

    public void setHideOnNull(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58134a, false, 63298, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58134a, false, 63298, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f58135b = z;
        setText(getText());
    }

    public void setBadgeMargin(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58134a, false, 63305, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58134a, false, 63305, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)}, this, f58134a, false, 63306, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)}, this, f58134a, false, 63306, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float f2 = (float) i;
        layoutParams.leftMargin = a(f2);
        layoutParams.topMargin = a(f2);
        layoutParams.rightMargin = a(f2);
        layoutParams.bottomMargin = a(f2);
        setLayoutParams(layoutParams);
    }

    public void setTargetView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58134a, false, 63311, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58134a, false, 63311, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (view != null) {
            if (view.getParent() instanceof FrameLayout) {
                ((FrameLayout) view.getParent()).addView(this);
            } else if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeView(view);
                FrameLayout frameLayout = new FrameLayout(getContext());
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                frameLayout.setLayoutParams(layoutParams);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(frameLayout, indexOfChild, layoutParams);
                frameLayout.addView(view);
                frameLayout.addView(this);
            } else {
                view.getParent();
            }
        }
    }

    public void setBadgeCount(int i) {
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58134a, false, 63300, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58134a, false, 63300, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f58134a, true, 63301, new Class[]{Integer.TYPE}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f58134a, true, 63301, new Class[]{Integer.TYPE}, String.class);
        } else {
            str = null;
            if (i2 < 0) {
                str = " ";
            } else if (i2 > 99) {
                str = "99+";
            } else if (i2 > 0 && i2 <= 99) {
                str = String.valueOf(i);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.length() == 1) {
                if (" ".equals(str)) {
                    setLayoutParams(new FrameLayout.LayoutParams(a(6.0f), a(6.0f)));
                } else {
                    setLayoutParams(new FrameLayout.LayoutParams(a(18.0f), a(18.0f)));
                }
            } else if (str.length() == 2) {
                setLayoutParams(new FrameLayout.LayoutParams(a(24.5f), a(18.0f)));
            } else if (str.length() == 3) {
                setLayoutParams(new FrameLayout.LayoutParams(a(31.0f), a(18.0f)));
            }
        }
        setText(str);
    }

    private BadgeView(Context context, AttributeSet attributeSet) {
        this(context, null, 16842884);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.isSupport(new Object[]{charSequence, bufferType}, this, f58134a, false, 63299, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, bufferType}, this, f58134a, false, 63299, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE);
            return;
        }
        if (!this.f58135b || (charSequence != null && !charSequence.toString().equalsIgnoreCase(PushConstants.PUSH_TYPE_NOTIFY))) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        super.setText(charSequence, bufferType);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f58134a, false, 63297, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f58134a, false, 63297, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float a2 = (float) a((float) i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{a2, a2, a2, a2, a2, a2, a2, a2}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    private BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 16842884);
        this.f58135b = true;
        if (PatchProxy.isSupport(new Object[0], this, f58134a, false, 63296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58134a, false, 63296, new Class[0], Void.TYPE);
            return;
        }
        if (!(getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
        }
        setTextColor(Color.parseColor("#590011"));
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(1, 12.0f);
        a(9, Color.parseColor("#d3321b"));
        setGravity(17);
        setHideOnNull(true);
        setBadgeCount(0);
    }
}
