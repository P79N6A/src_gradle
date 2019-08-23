package com.ss.android.ugc.aweme.story.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Message;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ShootButton extends AppCompatImageView implements View.OnTouchListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74458a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f74459b = "ShootButton";
    private static final long g = ((long) ViewConfiguration.getLongPressTimeout());
    private boolean A;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74460c;

    /* renamed from: d  reason: collision with root package name */
    public int f74461d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f74462e;

    /* renamed from: f  reason: collision with root package name */
    public d f74463f;
    private boolean h;
    private Paint i;
    private Paint j;
    private RectF k;
    private float l;
    private int m;
    private int n;
    private float o;
    private int p;
    private int q;
    private float r;
    private String s;
    private boolean t;
    private e.a u;
    private c v;
    private a w;
    private b x;
    private GestureDetector y;
    private long z;

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public interface e {

        public interface a {
        }
    }

    public void handleMsg(Message message) {
    }

    private void setState(int i2) {
        this.p = i2;
    }

    public void setLiveHandle(a aVar) {
        this.w = aVar;
    }

    public void setMotionEventWapper(e.a aVar) {
        this.u = aVar;
    }

    public void setOnShootListener(d dVar) {
        this.f74463f = dVar;
    }

    public void setOnVisibilityChangedListener(b bVar) {
        this.x = bVar;
    }

    public void setPublishHandle(c cVar) {
        this.v = cVar;
    }

    public void setText(String str) {
        this.s = str;
    }

    public void setVisibility(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74458a, false, 86607, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74458a, false, 86607, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setVisibility(i2);
    }

    public void setCancel(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74458a, false, 86605, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74458a, false, 86605, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h = z2;
        invalidate();
    }

    public void setRefreshingProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74458a, false, 86604, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74458a, false, 86604, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.r != f2) {
            this.r = f2;
            this.l = f2;
            postInvalidate();
        }
    }

    public void setTextEnable(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74458a, false, 86606, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74458a, false, 86606, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.t = z2;
        if (this.t) {
            setState(2);
        }
    }

    public void onDraw(Canvas canvas) {
        int measureText;
        int i2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f74458a, false, 86614, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f74458a, false, 86614, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.p == 0 || this.p == 2) {
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f74458a, false, 86618, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f74458a, false, 86618, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            if (!this.A) {
                if (PatchProxy.isSupport(new Object[0], this, f74458a, false, 86630, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74458a, false, 86630, new Class[0], Void.TYPE);
                } else {
                    this.m = getWidth();
                    this.n = getHeight();
                    if (this.m != this.n) {
                        int min = Math.min(this.m, this.n);
                        this.m = min;
                        this.n = min;
                    }
                }
                this.k.left = this.o / 2.0f;
                this.k.top = this.o / 2.0f;
                this.k.right = ((float) this.m) - (this.o / 2.0f);
                this.k.bottom = ((float) this.n) - (this.o / 2.0f);
                this.i.setStrokeWidth(this.o);
                this.A = true;
            }
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f74458a, false, 86621, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f74458a, false, 86621, new Class[]{Canvas.class}, Void.TYPE);
            } else {
                canvas.drawCircle((float) (this.m / 2), (float) (this.n / 2), ((float) (this.m / 2)) - this.o, this.j);
            }
            if (this.h) {
                this.i.setColor(0);
                canvas.drawArc(this.k, -90.0f, 360.0f, false, this.i);
                this.h = false;
                return;
            }
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f74458a, false, 86629, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f74458a, false, 86629, new Class[]{Canvas.class}, Void.TYPE);
            } else if (this.l > 0.0f && this.l < ((float) this.f74461d)) {
                this.i.setColor(getResources().getColor(this.q));
                canvas.drawArc(this.k, -90.0f, 360.0f * (this.l / ((float) this.f74461d)), false, this.i);
            } else if (this.l == 0.0f) {
                this.i.setColor(0);
                canvas.drawArc(this.k, -90.0f, 360.0f, false, this.i);
            } else if (this.l >= ((float) this.f74461d)) {
                canvas.drawArc(this.k, -90.0f, 360.0f, false, this.i);
            }
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f74458a, false, 86615, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f74458a, false, 86615, new Class[]{Canvas.class}, Void.TYPE);
            } else if (this.t && !TextUtils.isEmpty(this.s)) {
                int width = canvas.getWidth();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width)}, this, f74458a, false, 86616, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    measureText = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width)}, this, f74458a, false, 86616, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    measureText = (int) ((((float) width) - this.f74462e.measureText(this.s)) / 2.0f);
                }
                int i3 = measureText;
                int height = canvas.getHeight();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(height)}, this, f74458a, false, 86617, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(height)}, this, f74458a, false, 86617, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    i2 = (int) ((((float) height) / 2.0f) - ((this.f74462e.descent() + this.f74462e.ascent()) / 2.0f));
                }
                canvas.drawText(this.s, (float) i3, (float) i2, this.f74462e);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f74458a, false, 86609, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f74458a, false, 86609, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.p == 0) {
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74458a, false, 86612, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74458a, false, 86612, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            this.y.onTouchEvent(motionEvent2);
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        animate().scaleY(1.2f).scaleX(1.2f).setDuration(150).start();
                        break;
                    case 1:
                        break;
                }
            }
            animate().scaleY(1.0f).scaleX(1.0f).setDuration(150).start();
            if (this.f74463f != null && this.f74460c) {
                this.f74460c = false;
            }
            return true;
        } else {
            if (this.p != 1) {
                if (this.p == 2) {
                    if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74458a, false, 86610, new Class[]{MotionEvent.class}, Void.TYPE)) {
                        switch (motionEvent.getAction()) {
                            case 0:
                                animate().scaleY(1.2f).scaleX(1.2f).setDuration(100).start();
                                break;
                            case 1:
                                animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (currentTimeMillis - this.z >= 1500) {
                                    this.z = currentTimeMillis;
                                    break;
                                }
                                break;
                            case 3:
                                animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                                break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74458a, false, 86610, new Class[]{MotionEvent.class}, Void.TYPE);
                    }
                }
            } else {
                if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74458a, false, 86611, new Class[]{MotionEvent.class}, Void.TYPE)) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            animate().scaleY(1.2f).scaleX(1.2f).setDuration(100).start();
                            break;
                        case 1:
                            animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                            break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74458a, false, 86611, new Class[]{MotionEvent.class}, Void.TYPE);
                }
            }
            return true;
        }
    }
}
