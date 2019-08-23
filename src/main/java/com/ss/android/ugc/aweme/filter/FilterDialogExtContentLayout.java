package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.ax;
import com.ss.android.ugc.aweme.tools.R$styleable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FilterDialogExtContentLayout extends LinearLayout implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47409a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f47410b;

    /* renamed from: c  reason: collision with root package name */
    private Map<TextView, Boolean> f47411c;

    /* renamed from: d  reason: collision with root package name */
    private Context f47412d;

    /* renamed from: e  reason: collision with root package name */
    private int f47413e;

    /* renamed from: f  reason: collision with root package name */
    private ax.a f47414f;
    private int g;
    private z h;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f47409a, false, 44236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47409a, false, 44236, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        if (PatchProxy.isSupport(new Object[0], this, f47409a, false, 44237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47409a, false, 44237, new Class[0], Void.TYPE);
            return;
        }
        this.f47411c = new LinkedHashMap();
        int childCount = this.f47410b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f47410b.getChildAt(i);
            if (childAt instanceof TextView) {
                childAt.setOnClickListener(this);
                childAt.setOnTouchListener(this);
                this.f47411c.put((TextView) childAt, Boolean.FALSE);
            }
        }
    }

    public void setExtContentType(int i) {
        this.f47413e = i;
    }

    public void setItemInterceptor(z zVar) {
        this.h = zVar;
    }

    public void setOnFilterExtItemSelectedListener(ax.a aVar) {
        this.f47414f = aVar;
    }

    public FilterDialogExtContentLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, f47409a, false, 44232, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47409a, false, 44232, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!PatchProxy.isSupport(new Object[]{view}, this, f47409a, false, 44234, new Class[]{View.class}, Integer.TYPE)) {
            i = -1;
            int id = view.getId();
            Iterator<Map.Entry<TextView, Boolean>> it2 = this.f47411c.entrySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextView textView = (TextView) it2.next().getKey();
                if (textView != null && textView.getId() == id) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f47409a, false, 44234, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        int i3 = i;
        if (i3 >= 0) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), (byte) 1}, this, f47409a, false, 44235, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), (byte) 1}, this, f47409a, false, 44235, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (this.h == null || !this.h.a()) {
                int i4 = 0;
                for (Map.Entry next : this.f47411c.entrySet()) {
                    if (i3 == i4) {
                        if (((Boolean) next.getValue()).booleanValue()) {
                            break;
                        }
                        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R$styleable.LineStickerLayer1);
                        ((TextView) next.getKey()).setBackground(obtainStyledAttributes.getDrawable(7));
                        obtainStyledAttributes.recycle();
                        ((TextView) next.getKey()).setTextColor(this.f47412d.getResources().getColor(C0906R.color.ak8));
                        next.setValue(Boolean.TRUE);
                        this.g = i3;
                    } else {
                        TypedArray obtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(R$styleable.LineStickerLayer1);
                        ((TextView) next.getKey()).setBackground(obtainStyledAttributes2.getDrawable(8));
                        obtainStyledAttributes2.recycle();
                        TypedArray obtainStyledAttributes3 = getContext().getTheme().obtainStyledAttributes(R$styleable.Reverse_Color);
                        ((TextView) next.getKey()).setTextColor(obtainStyledAttributes3.getColor(20, 0));
                        next.setValue(Boolean.FALSE);
                        obtainStyledAttributes3.recycle();
                    }
                    i4++;
                }
            }
        }
    }

    public FilterDialogExtContentLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f47409a, false, 44238, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f47409a, false, 44238, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, f47409a, false, 44239, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f47409a, false, 44239, new Class[]{View.class}, Void.TYPE);
            } else if (view2 != null) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(100);
                view2.startAnimation(scaleAnimation);
            }
        } else if (motionEvent.getAction() == 1) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, f47409a, false, 44240, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f47409a, false, 44240, new Class[]{View.class}, Void.TYPE);
            } else if (view2 != null) {
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(100);
                view2.startAnimation(scaleAnimation2);
            }
        }
        return false;
    }

    public FilterDialogExtContentLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = -1;
        this.f47412d = context;
        if (PatchProxy.isSupport(new Object[0], this, f47409a, false, 44231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47409a, false, 44231, new Class[0], Void.TYPE);
            return;
        }
        if (!isInEditMode()) {
            this.f47410b = (ViewGroup) LayoutInflater.from(getContext()).inflate(C0906R.layout.a3y, this, true).findViewById(C0906R.id.ado);
        }
    }
}
