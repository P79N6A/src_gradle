package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.NoScrollViewPager;

public class MvThemeListViewPager extends NoScrollViewPager {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f68763b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f68764c;

    /* renamed from: d  reason: collision with root package name */
    public a f68765d;

    /* renamed from: e  reason: collision with root package name */
    private float f68766e;

    /* renamed from: f  reason: collision with root package name */
    private float f68767f;
    private int g;
    private boolean h;
    private float i;
    private float j;

    public interface a {
        void a();

        void a(float f2);
    }

    public MvThemeListViewPager(Context context) {
        super(context);
    }

    public void setBounceScrollListener(a aVar) {
        this.f68765d = aVar;
    }

    private boolean a(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78155, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78155, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if ((this.g != 0 || motionEvent.getX() <= this.i) && (getAdapter() == null || this.g != getAdapter().getCount() - 1 || motionEvent.getX() >= this.i)) {
            z = false;
        }
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78154, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78154, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.i = motionEvent.getX();
            this.g = getCurrentItem();
            this.j = getTranslationX();
        } else if (action == 2 && a(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78156, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78156, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f68764c || getAdapter() == null) {
            return super.onTouchEvent(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 1:
                    if (PatchProxy.isSupport(new Object[0], this, f68763b, false, 78159, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68763b, false, 78159, new Class[0], Void.TYPE);
                    } else if (getTranslationX() != this.j && this.h) {
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{getTranslationX(), this.j}).setDuration(200);
                        duration.addUpdateListener(new c(this));
                        duration.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f68768a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f68768a, false, 78161, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f68768a, false, 78161, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                super.onAnimationEnd(animator);
                                MvThemeListViewPager.this.f68764c = false;
                                if (MvThemeListViewPager.this.f68765d != null) {
                                    MvThemeListViewPager.this.f68765d.a();
                                }
                            }
                        });
                        duration.start();
                        this.f68764c = true;
                    }
                    this.h = false;
                    break;
                case 2:
                    if (a(motionEvent)) {
                        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78157, new Class[]{MotionEvent.class}, Void.TYPE)) {
                            float x = motionEvent.getX();
                            float f2 = x - this.i;
                            if (Math.abs(f2) > 4.0f) {
                                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f68763b, false, 78158, new Class[]{Float.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f68763b, false, 78158, new Class[]{Float.TYPE}, Void.TYPE);
                                } else {
                                    this.h = true;
                                    float translationX = getTranslationX() + (f2 * 0.45f);
                                    if (this.f68765d != null) {
                                        this.f68765d.a(translationX);
                                    }
                                    setTranslationX(translationX);
                                }
                                this.i = x;
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78157, new Class[]{MotionEvent.class}, Void.TYPE);
                            break;
                        }
                    }
                    break;
            }
            if (this.h || super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int i2;
        MvThemeListViewPager mvThemeListViewPager = this;
        char c2 = 1;
        char c3 = 0;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78151, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78151, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            mvThemeListViewPager.f68766e = motionEvent.getX();
            mvThemeListViewPager.f68767f = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78152, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78152, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - mvThemeListViewPager.f68766e) > 60.0f || Math.abs(y - mvThemeListViewPager.f68767f) > 60.0f) {
                    MvThemeListViewPager mvThemeListViewPager2 = mvThemeListViewPager;
                    super.dispatchTouchEvent(motionEvent);
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f68763b, false, 78153, new Class[]{MotionEvent.class}, View.class)) {
                    int childCount = getChildCount();
                    int currentItem = getCurrentItem();
                    int[] iArr = new int[2];
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            view = null;
                            break;
                        }
                        View childAt = mvThemeListViewPager.getChildAt(i3);
                        int intValue = ((Integer) childAt.getTag()).intValue();
                        childAt.getLocationOnScreen(iArr);
                        int i4 = iArr[c3];
                        int i5 = iArr[c2];
                        int width = iArr[c3] + childAt.getWidth();
                        int height = iArr[c2] + childAt.getHeight();
                        if (intValue < currentItem) {
                            double d2 = (double) width;
                            i2 = height;
                            double width2 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                            Double.isNaN(width2);
                            double width3 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width3);
                            Double.isNaN(d2);
                            width = (int) (d2 - ((width2 * 0.5d) + (width3 * 0.5d)));
                            double d3 = (double) i4;
                            double width4 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                            Double.isNaN(width4);
                            double width5 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                            Double.isNaN(width5);
                            Double.isNaN(d3);
                            i4 = (int) (d3 - ((width4 * 0.5d) + (width5 * 0.5d)));
                        } else {
                            i2 = height;
                            if (intValue == currentItem) {
                                i4 = (int) (((float) i4) + (((float) childAt.getWidth()) * Math.abs(0.0f)));
                            } else if (intValue > currentItem) {
                                double d4 = (double) width;
                                double width6 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                                Double.isNaN(width6);
                                Double.isNaN(d4);
                                width = (int) (d4 - (width6 * 0.5d));
                                double d5 = (double) i4;
                                double width7 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                                Double.isNaN(width7);
                                Double.isNaN(d5);
                                i4 = (int) (d5 - (width7 * 0.5d));
                            }
                        }
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        if (rawX > ((float) i4) && rawX < ((float) width) && rawY > ((float) i5) && rawY < ((float) i2)) {
                            view = childAt;
                            break;
                        }
                        i3++;
                        mvThemeListViewPager = this;
                        c2 = 1;
                        c3 = 0;
                    }
                } else {
                    view = (View) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68763b, false, 78153, new Class[]{MotionEvent.class}, View.class);
                }
                if (view != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    if (getCurrentItem() != intValue2) {
                        setCurrentItem(intValue2, true);
                        super.dispatchTouchEvent(motionEvent);
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                super.dispatchTouchEvent(motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        MvThemeListViewPager mvThemeListViewPager3 = mvThemeListViewPager;
        return super.dispatchTouchEvent(motionEvent);
    }

    public MvThemeListViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
