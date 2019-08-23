package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.utils.c;

public class ChooseRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68317a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68318b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.OnScrollListener f68319c = new RecyclerView.OnScrollListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68323a;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f68323a, false, 77584, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f68323a, false, 77584, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && !ChooseRecyclerView.this.f68318b) {
                ChooseRecyclerView.this.f68320d = true;
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f68323a, false, 77585, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f68323a, false, 77585, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            ChooseRecyclerView.this.f68318b = true;
            if (ChooseRecyclerView.this.canScrollVertically(-1)) {
                ChooseRecyclerView.this.f68320d = false;
            } else {
                ChooseRecyclerView.this.f68320d = true;
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public boolean f68320d = false;

    /* renamed from: e  reason: collision with root package name */
    float f68321e;

    /* renamed from: f  reason: collision with root package name */
    float f68322f;
    private d g;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68317a, false, 77581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68317a, false, 77581, new Class[0], Void.TYPE);
            return;
        }
        addOnScrollListener(this.f68319c);
    }

    public void setFragment(d dVar) {
        this.g = dVar;
    }

    public ChooseRecyclerView(Context context) {
        super(context);
        a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f68317a, false, 77583, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68317a, false, 77583, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f68317a, false, 77580, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f68317a, false, 77580, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f68317a, false, 77582, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68317a, false, 77582, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.g == null || !this.g.i()) {
            return super.onTouchEvent(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f68321e = motionEvent.getRawY();
                    this.f68322f = motionEvent.getY();
                    break;
                case 1:
                    if (!this.g.b()) {
                        if (((float) this.g.c()) <= c.a(getContext(), 150.0f)) {
                            this.g.d();
                            this.f68318b = false;
                        } else if (((float) this.g.c()) >= c.a(getContext(), 250.0f)) {
                            this.g.f();
                        } else {
                            this.g.e();
                            this.f68320d = true;
                        }
                    } else if (this.g.h() > c.a(getContext(), 100.0f) && this.f68320d) {
                        this.g.f();
                        return true;
                    } else if (this.g.h() > 0.0f) {
                        this.g.g();
                    }
                    this.f68322f = 0.0f;
                    break;
                case 2:
                    if (this.f68322f == 0.0f) {
                        this.f68322f = motionEvent.getY();
                    }
                    if (this.f68321e == 0.0f) {
                        this.f68321e = motionEvent.getRawY();
                    }
                    float y = motionEvent.getY() - this.f68322f;
                    float rawY = motionEvent.getRawY() - this.f68321e;
                    if (!this.g.b()) {
                        this.g.a(rawY);
                        this.g.b(y);
                        return true;
                    }
                    int h = (int) (this.g.h() + y);
                    if (this.f68320d && h > 0) {
                        this.g.a(h);
                        return true;
                    }
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public ChooseRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ChooseRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f68317a, false, 77579, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f68317a, false, 77579, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
