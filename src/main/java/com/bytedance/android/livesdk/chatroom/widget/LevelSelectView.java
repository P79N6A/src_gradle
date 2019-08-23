package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LevelSelectView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13376a;

    /* renamed from: b  reason: collision with root package name */
    final float f13377b;

    /* renamed from: c  reason: collision with root package name */
    private a f13378c;

    /* renamed from: d  reason: collision with root package name */
    private int f13379d;

    /* renamed from: e  reason: collision with root package name */
    private int f13380e;

    /* renamed from: f  reason: collision with root package name */
    private int f13381f;
    private float g;
    private int h;
    private boolean i;
    private Paint j;
    private Paint k;
    private Rect l;

    public interface a {
        void a(LevelSelectView levelSelectView, int i, int i2);
    }

    public int getCurrentLevel() {
        return this.f13379d;
    }

    public int getMaxLevel() {
        return this.f13380e;
    }

    public int getOrientation() {
        return this.f13381f;
    }

    public float getRadius() {
        return this.g;
    }

    public void setLevelChangedListener(a aVar) {
        this.f13378c = aVar;
    }

    public void setOrientation(int i2) {
        this.f13381f = i2;
    }

    public LevelSelectView(Context context) {
        this(context, null);
    }

    public void setCurrentLevel(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7844, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7844, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13379d = i2;
        invalidate();
    }

    public void setItemBgColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7848, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7848, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.j.getColor()) {
            this.j.setColor(i2);
            invalidate();
        }
    }

    public void setMaxLevel(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7845, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7845, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13380e = i2;
        invalidate();
    }

    public void setRadius(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f13376a, false, 7849, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f13376a, false, 7849, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.g != f2) {
            this.g = f2;
            invalidate();
        }
    }

    public void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7846, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f13376a, false, 7846, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != this.k.getColor()) {
            this.k.setColor(i2);
            invalidate();
        }
    }

    public void setTextSize(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f13376a, false, 7847, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f13376a, false, 7847, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float applyDimension = TypedValue.applyDimension(2, f2, getResources().getDisplayMetrics());
        if (applyDimension != this.k.getTextSize()) {
            this.k.setTextSize(applyDimension);
            invalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f13376a, false, 7852, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f13376a, false, 7852, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = 0;
            this.i = false;
            int a2 = a(x, y);
            if (a2 == -1) {
                return false;
            }
            this.h = a2;
            return true;
        }
        if (2 == action) {
            if (this.i) {
                return true;
            }
            int a3 = a(x, y);
            if (a3 == -1 || this.h != a3) {
                this.i = true;
                this.h = 0;
            }
        } else if (1 == action) {
            if (this.i || this.h < 0) {
                return true;
            }
            invalidate();
            if (this.f13378c != null) {
                this.f13378c.a(this, this.h, this.f13379d);
            }
            this.f13379d = this.h;
            this.h = 0;
            this.i = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f13376a, false, 7851, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f13376a, false, 7851, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f13381f == 0) {
            float width = (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 1.0f) / ((float) (this.f13380e + 1));
            float height = ((float) getHeight()) / 2.0f;
            this.g = Math.min(this.g, Math.min(width, (float) getHeight()) * 0.5f);
            canvas.drawCircle((float) ((int) ((((float) (this.f13379d + 1)) - 0.5f) * width)), height, this.g, this.j);
            int i2 = 0;
            while (i2 <= this.f13380e) {
                int i3 = i2 + 1;
                String valueOf = String.valueOf(i2);
                float measureText = this.k.measureText(valueOf);
                this.k.getTextBounds(valueOf, 0, 1, this.l);
                canvas.drawText(valueOf, ((((float) i3) - 0.5f) * width) - (measureText / 2.0f), (((float) this.l.height()) / 2.0f) + height, this.k);
                i2 = i3;
            }
            return;
        }
        float height2 = (((float) ((getHeight() - getPaddingTop()) - getPaddingBottom())) * 1.0f) / ((float) (this.f13380e + 1));
        float width2 = ((float) getWidth()) / 2.0f;
        this.g = Math.min(this.g, Math.min(height2, (float) getWidth()) * 0.5f);
        canvas.drawCircle(width2, (float) ((int) ((((float) (this.f13379d + 1)) - 0.5f) * height2)), this.g, this.j);
        int i4 = 0;
        while (i4 <= this.f13380e) {
            int i5 = i4 + 1;
            String valueOf2 = String.valueOf(i4);
            float measureText2 = this.k.measureText(valueOf2);
            this.k.getTextBounds(valueOf2, 0, 1, this.l);
            canvas.drawText(valueOf2, width2 - (measureText2 / 2.0f), ((((float) i5) - 0.5f) * height2) + (((float) this.l.height()) / 2.0f), this.k);
            i4 = i5;
        }
    }

    public LevelSelectView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13376a, false, 7850, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13376a, false, 7850, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        if (this.f13381f == 0) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + (this.g * 2.0f));
            if (getMeasuredHeight() < paddingTop) {
                setMeasuredDimension(getMeasuredWidth(), paddingTop);
            }
            return;
        }
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (this.g * 2.0f));
        if (getMeasuredHeight() < paddingLeft) {
            setMeasuredDimension(getMeasuredWidth(), paddingLeft);
        }
    }

    private int a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f13376a, false, 7853, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f13376a, false, 7853, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f13381f == 0) {
            float f4 = ((float) height) / 2.0f;
            if (f3 < f4 - this.g || f3 > f4 + this.g) {
                return -1;
            }
            float width2 = (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 1.0f) / ((float) (this.f13380e + 1));
            int ceil = (int) Math.ceil((double) ((f2 - ((float) getPaddingLeft())) / width2));
            float f5 = (((float) ceil) - 0.5f) * width2;
            if (f2 < f5 - this.g || f2 > f5 + this.g) {
                return -1;
            }
            return ceil - 1;
        }
        float f6 = ((float) width) / 2.0f;
        if (f2 < f6 - this.g || f2 > f6 + this.g) {
            return -1;
        }
        float height2 = (((float) ((getHeight() - getPaddingTop()) - getPaddingBottom())) * 1.0f) / ((float) (this.f13380e + 1));
        int ceil2 = (int) Math.ceil((double) ((f3 - ((float) getPaddingTop())) / height2));
        float f7 = (((float) ceil2) - 0.5f) * height2;
        if (f3 < f7 - this.g || f3 > f7 + this.g) {
            return -1;
        }
        return ceil2 - 1;
    }

    public LevelSelectView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        this.f13377b = 0.5f;
        this.f13379d = 1;
        this.f13380e = 2;
        this.l = new Rect();
        int i4 = 15;
        int i5 = 13421772;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LevelSelectView);
            if (obtainStyledAttributes.hasValue(6)) {
                this.f13380e = obtainStyledAttributes.getInt(6, 2);
            }
            if (obtainStyledAttributes.hasValue(0)) {
                this.f13379d = obtainStyledAttributes.getInt(0, this.f13380e >> 1);
            }
            i5 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getColor(2, 13421772) : i5;
            if (obtainStyledAttributes.hasValue(4)) {
                i3 = obtainStyledAttributes.getColor(4, 0);
            } else {
                i3 = 0;
            }
            i4 = obtainStyledAttributes.hasValue(5) ? obtainStyledAttributes.getDimensionPixelSize(5, 15) : i4;
            if (obtainStyledAttributes.hasValue(1)) {
                this.f13381f = obtainStyledAttributes.getInt(1, 0);
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.g = (float) obtainStyledAttributes.getDimensionPixelSize(3, 0);
            }
            obtainStyledAttributes.recycle();
        } else {
            i3 = 0;
        }
        this.j = new Paint(1);
        this.j.setColor(i5);
        this.k = new Paint(1);
        this.k.setTextSize((float) i4);
        this.k.setColor(i3);
    }
}
