package com.bytedance.im.sugar.input;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.im.sugar.input.b;

public class a extends FrameLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    protected int f21326a;

    /* renamed from: b  reason: collision with root package name */
    protected b.a f21327b;

    /* renamed from: c  reason: collision with root package name */
    protected final SparseArray<View> f21328c;

    public final int c() {
        return this.f21326a;
    }

    public final void b() {
        a(-1);
    }

    public final boolean a() {
        if (this.f21326a != -1) {
            return true;
        }
        return false;
    }

    public void setOnPanelChangeListener(b.a aVar) {
        this.f21327b = aVar;
    }

    public a(Context context) {
        this(context, null);
    }

    public void a(int i) {
        if (this.f21326a != i) {
            if (i == -1) {
                setVisibility(8);
                this.f21326a = i;
                if (this.f21327b != null) {
                    this.f21327b.a(i, null);
                }
            } else {
                View view = this.f21328c.get(i);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f21328c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = this.f21328c.keyAt(i2);
                        if (keyAt != i) {
                            this.f21328c.get(keyAt).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f21326a = i;
                    if (this.f21327b != null) {
                        this.f21327b.a(i, view);
                    }
                }
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i, View view) {
        if (i < 0) {
            throw new IllegalArgumentException("panelType must be more than 0 ");
        } else if (this.f21328c.get(i) == null) {
            this.f21328c.put(i, view);
            addView(view, new ViewGroup.LayoutParams(-1, -1));
            view.setVisibility(8);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21326a = -1;
        this.f21328c = new SparseArray<>();
    }
}
