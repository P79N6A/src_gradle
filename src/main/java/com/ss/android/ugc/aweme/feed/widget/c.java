package com.ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c extends BaseMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47044a;

    /* renamed from: b  reason: collision with root package name */
    private static c f47045b;

    private c() {
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f47044a, true, 43632, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f47044a, true, 43632, new Class[0], c.class);
        }
        if (f47045b == null) {
            synchronized (c.class) {
                if (f47045b == null) {
                    f47045b = new c();
                }
            }
        }
        return f47045b;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        TextView textView2 = textView;
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{textView2, spannable2, motionEvent}, this, f47044a, false, 43633, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView2, spannable2, motionEvent}, this, f47044a, false, 43633, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable2.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && action == 1) {
                clickableSpanArr[0].onClick(textView2);
            }
            return true;
        }
        return true;
    }
}
