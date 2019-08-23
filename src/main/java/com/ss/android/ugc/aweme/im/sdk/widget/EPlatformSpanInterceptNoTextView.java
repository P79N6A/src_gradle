package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class EPlatformSpanInterceptNoTextView extends SpanInterceptNoTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52752a;

    /* renamed from: b  reason: collision with root package name */
    public int f52753b;

    /* renamed from: e  reason: collision with root package name */
    private View f52754e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52752a, false, 54087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52752a, false, 54087, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (this.f52754e != null) {
            this.f52754e.performLongClick();
        }
    }

    /* access modifiers changed from: package-private */
    public CharacterStyle getCharStyle() {
        if (!PatchProxy.isSupport(new Object[0], this, f52752a, false, 54086, new Class[0], CharacterStyle.class)) {
            return new ForegroundColorSpan(this.f52753b);
        }
        return (CharacterStyle) PatchProxy.accessDispatch(new Object[0], this, f52752a, false, 54086, new Class[0], CharacterStyle.class);
    }

    public EPlatformSpanInterceptNoTextView(Context context) {
        super(context);
    }

    public void setContentArea(View view) {
        this.f52754e = view;
    }

    public EPlatformSpanInterceptNoTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EPlatformSpanInterceptNoTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
