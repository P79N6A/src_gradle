package com.bytedance.android.livesdk.chatroom.ui;

import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class dj extends LinkMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12080a;

    /* renamed from: d  reason: collision with root package name */
    private static dj f12081d;

    /* renamed from: b  reason: collision with root package name */
    private final long f12082b = ((long) ViewConfiguration.getLongPressTimeout());

    /* renamed from: c  reason: collision with root package name */
    private long f12083c;

    private dj() {
    }

    public static dj a() {
        if (PatchProxy.isSupport(new Object[0], null, f12080a, true, 6207, new Class[0], dj.class)) {
            return (dj) PatchProxy.accessDispatch(new Object[0], null, f12080a, true, 6207, new Class[0], dj.class);
        }
        if (f12081d == null) {
            f12081d = new dj();
        }
        return f12081d;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TextView textView2 = textView;
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{textView2, spannable2, motionEvent}, this, f12080a, false, 6206, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView2, spannable2, motionEvent}, this, f12080a, false, 6206, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            try {
                int lineForVertical = layout.getLineForVertical(scrollY);
                if (lineForVertical >= layout.getLineCount()) {
                    return false;
                }
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable2.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        if (!(clickableSpanArr[0] instanceof dk)) {
                            clickableSpanArr[0].onClick(textView2);
                        } else if (this.f12083c <= 0 || SystemClock.elapsedRealtime() - this.f12083c < this.f12082b) {
                            clickableSpanArr[0].onClick(textView2);
                        } else {
                            ((dk) clickableSpanArr[0]).a(textView2);
                        }
                        this.f12083c = 0;
                    } else if (action == 0) {
                        Selection.setSelection(spannable2, spannable2.getSpanStart(clickableSpanArr[0]), spannable2.getSpanEnd(clickableSpanArr[0]));
                        this.f12083c = SystemClock.elapsedRealtime();
                    }
                    return true;
                }
                Selection.removeSelection(spannable);
            } catch (Exception unused) {
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
