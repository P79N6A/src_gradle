package com.ss.android.ugc.aweme.im.sdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SpanInterceptNoTextView extends DmtTextView {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f52818c;

    /* renamed from: a  reason: collision with root package name */
    private GestureDetector f52819a;

    /* renamed from: d  reason: collision with root package name */
    CharacterStyle f52820d;

    public void a() {
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return null;
    }

    private CharacterStyle getPressedSpan() {
        if (PatchProxy.isSupport(new Object[0], this, f52818c, false, 54193, new Class[0], CharacterStyle.class)) {
            return (CharacterStyle) PatchProxy.accessDispatch(new Object[0], this, f52818c, false, 54193, new Class[0], CharacterStyle.class);
        } else if (this.f52820d != null) {
            return this.f52820d;
        } else {
            this.f52820d = getCharStyle();
            return this.f52820d;
        }
    }

    /* access modifiers changed from: package-private */
    public CharacterStyle getCharStyle() {
        if (!PatchProxy.isSupport(new Object[0], this, f52818c, false, 54192, new Class[0], CharacterStyle.class)) {
            return new BackgroundColorSpan(getHighlightColor());
        }
        return (CharacterStyle) PatchProxy.accessDispatch(new Object[0], this, f52818c, false, 54192, new Class[0], CharacterStyle.class);
    }

    public SpanInterceptNoTextView(Context context) {
        super(context, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f52818c, false, 54196, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return this.f52819a.onTouchEvent(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f52818c, false, 54196, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public SpanInterceptNoTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        if (PatchProxy.isSupport(new Object[]{motionEvent, Integer.valueOf(i)}, this, f52818c, false, 54197, new Class[]{MotionEvent.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, Integer.valueOf(i)}, this, f52818c, false, 54197, new Class[]{MotionEvent.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int x = ((int) motionEvent.getX()) - getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - getTotalPaddingTop();
        int scrollX = x + getScrollX();
        int scrollY = y + getScrollY();
        Layout layout = getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
        Spannable spannable = (Spannable) getText();
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 0) {
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            if (i != 3) {
                switch (i) {
                    case 0:
                        Selection.setSelection(spannable, spanStart, spanEnd);
                        spannable.setSpan(getPressedSpan(), spanStart, spanEnd, 33);
                        return true;
                    case 1:
                        clickableSpanArr[0].onClick(this);
                        spannable.removeSpan(getPressedSpan());
                        break;
                }
            }
            Selection.removeSelection(spannable);
            spannable.removeSpan(getPressedSpan());
            return true;
        }
        Selection.removeSelection(spannable);
        spannable.removeSpan(getPressedSpan());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        onTouchEvent(obtain);
        return false;
    }

    public SpanInterceptNoTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f52818c, false, 54194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52818c, false, 54194, new Class[0], Void.TYPE);
            return;
        }
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
        if (PatchProxy.isSupport(new Object[0], this, f52818c, false, 54195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52818c, false, 54195, new Class[0], Void.TYPE);
            return;
        }
        this.f52819a = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52821a;

            /* renamed from: c  reason: collision with root package name */
            private MotionEvent f52823c;

            public final boolean onDown(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f52821a, false, 54198, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f52821a, false, 54198, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                this.f52823c = motionEvent;
                return SpanInterceptNoTextView.this.a(this.f52823c, 0);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f52821a, false, 54202, new Class[]{MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f52821a, false, 54202, new Class[]{MotionEvent.class}, Void.TYPE);
                    return;
                }
                SpanInterceptNoTextView.this.a(this.f52823c, 3);
                ((View) SpanInterceptNoTextView.this.getParent()).performLongClick();
                SpanInterceptNoTextView.this.a();
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f52821a, false, 54199, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                    return SpanInterceptNoTextView.this.a(this.f52823c, 1);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f52821a, false, 54199, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (!PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52821a, false, 54200, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return SpanInterceptNoTextView.this.a(this.f52823c, 3);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52821a, false, 54200, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (!PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52821a, false, 54201, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return SpanInterceptNoTextView.this.a(this.f52823c, 3);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f52821a, false, 54201, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
            }
        });
    }
}
