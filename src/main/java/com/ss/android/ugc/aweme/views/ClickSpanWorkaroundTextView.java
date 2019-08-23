package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class ClickSpanWorkaroundTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76308a;

    /* renamed from: b  reason: collision with root package name */
    private MentionTextView.c f76309b;

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f76308a, false, 89420, new Class[0], AccessibilityNodeInfo.class)) {
            return (AccessibilityNodeInfo) PatchProxy.accessDispatch(new Object[0], this, f76308a, false, 89420, new Class[0], AccessibilityNodeInfo.class);
        }
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            a.a(e2);
            return null;
        }
    }

    public ClickSpanWorkaroundTextView(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f76308a, false, 89417, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f76308a, false, 89417, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
        switch (motionEvent.getAction()) {
            case 0:
                MentionTextView.c cVar = (MentionTextView.c) a(motionEvent, MentionTextView.c.class);
                if (cVar != null) {
                    cVar.a(true);
                    this.f76309b = cVar;
                    return true;
                } else if (a(motionEvent, ClickableSpan.class) != null) {
                    return true;
                } else {
                    return false;
                }
            case 1:
                if (this.f76309b == null || this.f76309b != a(motionEvent, MentionTextView.c.class)) {
                    return false;
                }
                this.f76309b.a(false);
                this.f76309b = null;
                return true;
            case 2:
                if (!(this.f76309b == null || this.f76309b == a(motionEvent, MentionTextView.c.class))) {
                    this.f76309b.a(false);
                    this.f76309b = null;
                }
                return false;
            case 3:
                if (this.f76309b != null) {
                    this.f76309b.a(false);
                    this.f76309b = null;
                }
                return false;
            default:
                return false;
        }
    }

    public ClickSpanWorkaroundTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private <T extends ClickableSpan> T a(MotionEvent motionEvent, Class<T> cls) {
        boolean z;
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{motionEvent, cls2}, this, f76308a, false, 89418, new Class[]{MotionEvent.class, Class.class}, ClickableSpan.class)) {
            return (ClickableSpan) PatchProxy.accessDispatch(new Object[]{motionEvent, cls2}, this, f76308a, false, 89418, new Class[]{MotionEvent.class, Class.class}, ClickableSpan.class);
        }
        T t = null;
        if (!(getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) getText();
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            T[] tArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, cls2);
            if (tArr.length > 0) {
                T t2 = tArr[0];
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(offsetForHorizontal), spanned, t2}, this, f76308a, false, 89419, new Class[]{Integer.TYPE, Spanned.class, Object.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(offsetForHorizontal), spanned, t2}, this, f76308a, false, 89419, new Class[]{Integer.TYPE, Spanned.class, Object.class}, Boolean.TYPE)).booleanValue();
                } else if (offsetForHorizontal < spanned.getSpanStart(t2) || offsetForHorizontal > spanned.getSpanEnd(t2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    t = tArr[0];
                }
            }
            return t;
        } catch (Exception unused) {
            return null;
        }
    }

    public ClickSpanWorkaroundTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
