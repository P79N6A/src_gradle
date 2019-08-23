package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class EnableEndEllipsizeTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52756a;

    public EnableEndEllipsizeTextView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f52756a, false, 54089, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f52756a, false, 54089, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        CharSequence text = getText();
        if (getLineCount() > getMaxLines()) {
            int lineEnd = getLayout().getLineEnd(getMaxLines() - 1);
            if (text.length() > lineEnd) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text.subSequence(0, lineEnd - 3)).append("...");
                setText(spannableStringBuilder);
                super.onDraw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public EnableEndEllipsizeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EnableEndEllipsizeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
