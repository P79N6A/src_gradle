package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.b;

public final class ct extends cu {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65007a;

    public final int getLayoutResource() {
        return C0906R.layout.at3;
    }

    private ct(Context context) {
        this(context, null);
    }

    private ct(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private ct(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    public static cu a(Context context, int i, View.OnClickListener onClickListener) {
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), onClickListener2}, null, f65007a, true, 73416, new Class[]{Context.class, Integer.TYPE, View.OnClickListener.class}, cu.class)) {
            return (cu) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), onClickListener2}, null, f65007a, true, 73416, new Class[]{Context.class, Integer.TYPE, View.OnClickListener.class}, cu.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ct ctVar = new ct(context2);
        int dip2Px = (int) UIUtils.dip2Px(context2, 15.0f);
        layoutParams.leftMargin = dip2Px;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(dip2Px);
        }
        ctVar.setLayoutParams(layoutParams);
        if (onClickListener2 != null) {
            ctVar.setOnClickListener(onClickListener2);
        }
        ctVar.getShareTextView().setTextSize(10.0f);
        ctVar.getShareTextView().setIncludeFontPadding(false);
        b.a().wrapperIMShareText(context2, ctVar.getShareTextView());
        int dip2Px2 = (int) UIUtils.dip2Px(context2, 49.0f);
        ctVar.getShareImageView().setLayoutParams(new LinearLayout.LayoutParams(dip2Px2, dip2Px2));
        b.a(context2, (RemoteImageView) ctVar.getShareImageView(), i);
        return ctVar;
    }

    public static cu b(Context context, int i, View.OnClickListener onClickListener) {
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), onClickListener2}, null, f65007a, true, 73417, new Class[]{Context.class, Integer.TYPE, View.OnClickListener.class}, cu.class)) {
            return (cu) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), onClickListener2}, null, f65007a, true, 73417, new Class[]{Context.class, Integer.TYPE, View.OnClickListener.class}, cu.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ct ctVar = new ct(context2);
        int dip2Px = (int) UIUtils.dip2Px(context2, 10.0f);
        layoutParams.leftMargin = dip2Px;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(dip2Px);
        }
        ctVar.setLayoutParams(layoutParams);
        if (onClickListener2 != null) {
            ctVar.setOnClickListener(onClickListener2);
        }
        ctVar.getShareTextView().setTextSize(10.0f);
        ctVar.getShareTextView().setIncludeFontPadding(false);
        int dip2Px2 = (int) UIUtils.dip2Px(context2, 39.0f);
        ctVar.getShareImageView().setLayoutParams(new LinearLayout.LayoutParams(dip2Px2, dip2Px2));
        b.a().wrapperIMShareText(context2, ctVar.getShareTextView());
        b.a(context2, (RemoteImageView) ctVar.getShareImageView(), i);
        return ctVar;
    }
}
