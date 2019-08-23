package com.ss.android.ugc.aweme.account.views;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class c extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33189a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f33190b;

    /* renamed from: c  reason: collision with root package name */
    private int f33191c;

    /* renamed from: d  reason: collision with root package name */
    private int f33192d;

    public void updateDrawState(TextPaint textPaint) {
        int i;
        if (PatchProxy.isSupport(new Object[]{textPaint}, this, f33189a, false, 21541, new Class[]{TextPaint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textPaint}, this, f33189a, false, 21541, new Class[]{TextPaint.class}, Void.TYPE);
            return;
        }
        super.updateDrawState(textPaint);
        if (this.f33190b) {
            i = this.f33192d;
        } else {
            i = this.f33191c;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public c(int i, int i2) {
        this.f33191c = i;
        this.f33192d = i2;
    }
}
