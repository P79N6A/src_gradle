package com.ss.android.ugc.aweme.challenge.ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.views.c;

public final class r extends LinkMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35718a;

    /* renamed from: c  reason: collision with root package name */
    private static r f35719c;

    /* renamed from: b  reason: collision with root package name */
    private c f35720b;

    public static MovementMethod a() {
        if (PatchProxy.isSupport(new Object[0], null, f35718a, true, 26286, new Class[0], MovementMethod.class)) {
            return (MovementMethod) PatchProxy.accessDispatch(new Object[0], null, f35718a, true, 26286, new Class[0], MovementMethod.class);
        }
        if (f35719c == null) {
            f35719c = new r();
        }
        return f35719c;
    }

    private boolean a(int i, Spannable spannable, Object obj) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), spannable, obj}, this, f35718a, false, 26285, new Class[]{Integer.TYPE, Spannable.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), spannable, obj}, this, f35718a, false, 26285, new Class[]{Integer.TYPE, Spannable.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 < spannable.getSpanStart(obj) || i2 > spannable.getSpanEnd(obj)) {
            return false;
        } else {
            return true;
        }
    }

    private c a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{textView, spannable2, motionEvent}, this, f35718a, false, 26284, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{textView, spannable2, motionEvent}, this, f35718a, false, 26284, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, c.class);
        }
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        c[] cVarArr = (c[]) spannable2.getSpans(offsetForHorizontal, offsetForHorizontal, c.class);
        c cVar = null;
        if (cVarArr.length > 0) {
            if (a(offsetForHorizontal, spannable2, (Object) cVarArr[0])) {
                cVar = cVarArr[0];
            }
        }
        return cVar;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{textView, spannable2, motionEvent}, this, f35718a, false, 26283, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, spannable2, motionEvent}, this, f35718a, false, 26283, new Class[]{TextView.class, Spannable.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            try {
                this.f35720b = a(textView, spannable, motionEvent);
                if (this.f35720b != null) {
                    this.f35720b.f33190b = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f35720b), spannable.getSpanEnd(this.f35720b));
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                c a2 = a(textView, spannable, motionEvent);
                if (!(this.f35720b == null || a2 == this.f35720b)) {
                    this.f35720b.f33190b = false;
                    this.f35720b = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
                return false;
            }
        } else {
            if (this.f35720b != null) {
                this.f35720b.f33190b = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f35720b = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
