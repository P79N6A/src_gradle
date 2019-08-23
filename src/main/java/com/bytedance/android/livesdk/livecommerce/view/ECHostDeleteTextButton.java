package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECHostDeleteTextButton extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16249a;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16249a, false, 10781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16249a, false, 10781, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Context context = getContext();
        if (!(layoutParams == null || context == null)) {
            if (a.a()) {
                setBackgroundResource(2130838637);
                setTextColor(getContext().getResources().getColor(C0906R.color.l8));
                layoutParams.width = a.a(context, 88.0f);
                layoutParams.height = a.a(context, 28.0f);
                setLayoutParams(layoutParams);
                return;
            }
            setBackgroundResource(2130838636);
            setTextColor(getContext().getResources().getColor(C0906R.color.kz));
            layoutParams.width = a.a(context, 74.0f);
            layoutParams.height = a.a(context, 28.0f);
            setLayoutParams(layoutParams);
        }
    }

    public ECHostDeleteTextButton(Context context) {
        super(context);
    }

    public ECHostDeleteTextButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ECHostDeleteTextButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
