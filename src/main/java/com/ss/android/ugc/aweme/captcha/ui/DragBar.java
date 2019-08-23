package com.ss.android.ugc.aweme.captcha.ui;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DragBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35301a;

    /* renamed from: b  reason: collision with root package name */
    public a f35302b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f35303c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35304d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f35305e;

    public interface a {
        void a();

        void a(float f2);

        void b(float f2);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35301a, false, 25758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35301a, false, 25758, new Class[0], Void.TYPE);
            return;
        }
        setDragViewTranslationX(0.0f);
        this.f35305e = false;
    }

    public void setCanDragged(boolean z) {
        this.f35304d = z;
    }

    public void setOnDragListener(a aVar) {
        this.f35302b = aVar;
    }

    public DragBar(@NonNull Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f35301a, false, 25757, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f35301a, false, 25757, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f35303c = (ImageView) LayoutInflater.from(context).inflate(C0906R.layout.aqs, this, true).findViewById(C0906R.id.b0r);
        this.f35303c.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35306a;

            /* renamed from: b  reason: collision with root package name */
            float f35307b;

            /* renamed from: c  reason: collision with root package name */
            float f35308c;

            /* renamed from: d  reason: collision with root package name */
            float f35309d;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f35306a, false, 25760, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f35306a, false, 25760, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (!DragBar.this.f35304d) {
                    return false;
                } else {
                    switch (motionEvent.getAction()) {
                        case 0:
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            if (DragBar.this.f35302b != null) {
                                DragBar.this.f35302b.a();
                            }
                            this.f35307b = motionEvent.getRawX();
                            this.f35308c = 0.0f;
                            return true;
                        case 1:
                            DragBar.this.setCanDragged(false);
                            if (DragBar.this.f35302b != null && !DragBar.this.f35305e) {
                                DragBar.this.f35305e = true;
                                int measuredWidth = DragBar.this.getMeasuredWidth() - DragBar.this.f35303c.getMeasuredWidth();
                                this.f35308c = Math.max(this.f35308c, 0.0f);
                                float f2 = (float) measuredWidth;
                                this.f35308c = Math.min(this.f35308c, f2);
                                DragBar.this.f35303c.setTranslationX(this.f35308c);
                                if (measuredWidth != 0) {
                                    DragBar.this.f35302b.b(this.f35308c / f2);
                                }
                            }
                            this.f35307b = 0.0f;
                            this.f35308c = 0.0f;
                            return true;
                        case 2:
                            this.f35308c = motionEvent.getRawX() - this.f35307b;
                            DragBar.this.setDragViewTranslationX(this.f35308c);
                            this.f35309d = this.f35308c;
                            return true;
                        default:
                            return false;
                    }
                }
            }
        });
    }

    public void setDragViewTranslationX(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f35301a, false, 25759, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f35301a, false, 25759, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        int measuredWidth = getMeasuredWidth() - this.f35303c.getMeasuredWidth();
        float f3 = (float) measuredWidth;
        float min = Math.min(Math.max(f2, 0.0f), f3);
        this.f35303c.setTranslationX(min);
        if (!(this.f35302b == null || measuredWidth == 0)) {
            this.f35302b.a(min / f3);
        }
    }

    public DragBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DragBar(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
