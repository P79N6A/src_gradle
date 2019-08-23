package com.ss.android.ugc.aweme.story.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.k;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.util.c;
import java.util.ArrayList;
import java.util.List;

public class TabHost extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74464a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f74465b = "TabHost";

    /* renamed from: c  reason: collision with root package name */
    public boolean f74466c;

    /* renamed from: d  reason: collision with root package name */
    List<Integer> f74467d;

    /* renamed from: e  reason: collision with root package name */
    Scroller f74468e;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f74469f;
    public int g;
    public View h;
    private int i;
    private GestureDetector j;
    private a k;
    private b l;
    private float m;
    private float n;
    private float o;
    private float p;
    private int q;
    private int r;
    private int s;

    public interface a {
        void a(int i, int i2);
    }

    public interface b {
    }

    public int getCurrentIndex() {
        return this.i;
    }

    public int getTabCount() {
        if (PatchProxy.isSupport(new Object[0], this, f74464a, false, 86664, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74464a, false, 86664, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f74469f == null) {
            return 0;
        } else {
            return this.f74469f.getChildCount();
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f74464a, false, 86653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74464a, false, 86653, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f74469f = (LinearLayout) findViewById(C0906R.id.y9);
    }

    private void a() {
        int i2;
        boolean z;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f74464a, false, 86657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74464a, false, 86657, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f74464a, false, 86654, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74464a, false, 86654, new Class[0], Integer.TYPE)).intValue();
        } else {
            if (this.m < this.n) {
                z = true;
            } else {
                z = false;
            }
            float scrollX = ((float) this.f74469f.getScrollX()) + ((float) this.f74467d.get(0).intValue());
            int size = this.f74467d.size();
            if (z) {
                i3 = size - 1;
                i2 = 0;
                while (true) {
                    if (i3 < 0) {
                        break;
                    } else if (((float) this.f74467d.get(i3).intValue()) < scrollX) {
                        break;
                    } else {
                        int i5 = i3;
                        i3--;
                        i2 = i5;
                    }
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (((float) this.f74467d.get(i3).intValue()) >= scrollX) {
                        break;
                    } else {
                        int i7 = i3;
                        i4 = i3 + 1;
                        i6 = i7;
                    }
                }
            }
            i2 = i3;
        }
        setIndex(i2);
    }

    public void setOnIndexChangedListener(a aVar) {
        this.k = aVar;
    }

    public void setScrollEnabled(boolean z) {
        this.f74466c = z;
    }

    public void setTouchEventWrapper(b bVar) {
        this.l = bVar;
    }

    public TabHost(Context context) {
        this(context, null);
    }

    public void setIndexWithoutAnim(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74464a, false, 86656, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74464a, false, 86656, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.i, this.r);
        a(i2, this.q);
        if (!(this.i == i2 || this.k == null)) {
            this.k.a(this.i, i2);
        }
        c.a("the set index is " + i2 + " mCurIndex:" + this.i);
        this.i = i2;
        requestLayout();
    }

    public void setIndex(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74464a, false, 86655, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74464a, false, 86655, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.i, this.r);
        a(i2, this.q);
        if (!(this.i == i2 || this.k == null)) {
            this.k.a(this.i, i2);
        }
        c.a("withoutAnim the set index is " + i2 + " mCurIndex:" + this.i);
        this.i = i2;
        if (!this.f74467d.isEmpty() && i2 >= 0 && i2 < this.f74467d.size()) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f74469f.getScrollX(), this.f74467d.get(i2).intValue() - this.f74467d.get(0).intValue()});
            ofInt.setDuration(150);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74472a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f74472a, false, 86668, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f74472a, false, 86668, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    TabHost.this.f74469f.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
            ofInt.start();
        }
    }

    @Nullable
    public final Object a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74464a, false, 86650, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74464a, false, 86650, new Class[]{Integer.TYPE}, Object.class);
        } else if (this.f74469f == null) {
            return null;
        } else {
            View childAt = this.f74469f.getChildAt(i2);
            if (childAt == null) {
                return null;
            }
            return childAt.getTag();
        }
    }

    public TabHost(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(@ColorInt int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74464a, false, 86651, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74464a, false, 86651, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f74469f != null) {
            TextView textView = (TextView) this.f74469f.getChildAt(i2);
            if (textView != null) {
                textView.setTextColor(i3);
            }
        }
    }

    private void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74464a, false, 86661, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74464a, false, 86661, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = this.f74469f.getChildCount();
        this.f74467d.clear();
        int i4 = i2;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.f74469f.getChildAt(i5);
            if (i5 == 0) {
                i4 = (i4 + ((i3 - i2) / 2)) - (childAt.getWidth() / 2);
            }
            this.f74467d.add(Integer.valueOf((childAt.getWidth() / 2) + i4));
            childAt.layout(i4, childAt.getTop(), childAt.getWidth() + i4, childAt.getBottom());
            i4 += childAt.getWidth();
        }
        c.a("the xPivots size is " + childCount + " mCurIndex:" + this.i);
        int a2 = k.a(this.i, 0, childCount + -1);
        try {
            this.f74469f.scrollTo(this.f74467d.get(a2).intValue() - this.f74467d.get(0).intValue(), 0);
            if (this.i > a2) {
                c.a("mCurIndex is dangerous， modify it !!! safeIndex: " + a2 + " mCurIndex:" + this.i);
                this.i = a2;
            }
        } catch (IndexOutOfBoundsException e2) {
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = this.f74469f.getChildAt(i6);
                sb.append("index ");
                sb.append(i6);
                sb.append(' ');
                sb.append(childAt2.getClass());
                sb.append(' ');
                sb.append(childAt2.getTag());
                sb.append(10);
            }
            throw new IllegalStateException("Inconsistency detected. children are " + sb, e2);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f74464a, false, 86659, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f74464a, false, 86659, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.m = motionEvent.getX();
            this.o = motionEvent.getY();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, this, f74464a, false, 86658, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(x), Float.valueOf(y)}, this, f74464a, false, 86658, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            } else if (this.f74469f != null) {
                int childCount = this.f74469f.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        this.h = this.f74469f;
                        break;
                    }
                    View childAt = this.f74469f.getChildAt(i2);
                    if (x < ((float) (childAt.getRight() - this.f74469f.getScrollX())) && x > ((float) (childAt.getLeft() - this.f74469f.getScrollX())) && y < ((float) childAt.getBottom()) && y > ((float) childAt.getTop())) {
                        this.g = i2;
                        this.h = childAt;
                        break;
                    }
                    i2++;
                }
            }
        }
        switch (motionEvent.getAction()) {
            case 1:
                this.n = motionEvent.getX();
                this.p = motionEvent.getY();
                if (Math.abs(this.n - this.m) >= ((float) (this.s * 2)) && Math.abs(this.p - this.o) <= ((float) (p.a(getContext()) / 4))) {
                    a();
                    break;
                } else {
                    setIndex(this.i);
                    break;
                }
                break;
            case 2:
                float x2 = motionEvent.getX() - this.m;
                float y2 = motionEvent.getY() - this.o;
                if (Math.abs(x2) > ((float) this.s) && Math.abs(x2) > Math.abs(y2)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
        }
        return this.j.onTouchEvent(motionEvent2);
    }

    public TabHost(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f74466c = true;
        this.q = ContextCompat.getColor(getContext(), C0906R.color.vf);
        this.r = ContextCompat.getColor(getContext(), C0906R.color.uq);
        if (PatchProxy.isSupport(new Object[0], this, f74464a, false, 86652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74464a, false, 86652, new Class[0], Void.TYPE);
            return;
        }
        this.s = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f74467d = new ArrayList();
        setOnTouchListener(this);
        this.f74468e = new Scroller(getContext());
        this.j = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74470a;

            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74470a, false, 86665, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74470a, false, 86665, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (TabHost.this.equals(TabHost.this.h) || TabHost.this.f74469f.equals(TabHost.this.h)) {
                    return false;
                } else {
                    TabHost.this.setIndex(TabHost.this.g);
                    return false;
                }
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                float f4 = f3;
                if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74470a, false, 86667, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74470a, false, 86667, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                }
                if (TabHost.this.f74466c && f4 < 20.0f) {
                    TabHost.this.f74468e.fling(TabHost.this.f74468e.getFinalX(), TabHost.this.f74468e.getFinalY(), (int) f4, 0, 500, (int) f2, 0, TabHost.this.getHeight());
                }
                return false;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                float f4;
                if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74470a, false, 86666, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f74470a, false, 86666, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (!TabHost.this.f74466c) {
                    return false;
                } else {
                    if (f3 < 20.0f) {
                        f4 = 20.0f;
                    } else {
                        f4 = f3;
                    }
                    TabHost.this.f74469f.scrollBy((int) ((20.0f * f2) / f4), 0);
                    TabHost.this.invalidate();
                    return true;
                }
            }
        });
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f74464a, false, 86660, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f74464a, false, 86660, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
        b(i2, i4);
    }
}
