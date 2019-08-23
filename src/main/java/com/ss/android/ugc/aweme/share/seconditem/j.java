package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.v;
import com.ss.android.ugc.bytex.a.a.a;

public class j extends v {
    public static ChangeQuickRedirect g;

    private j(Context context) {
        this(context, null);
    }

    private j(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public j(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static j a(Context context, @StringRes int i, @DrawableRes int i2, View.OnClickListener onClickListener) {
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        if (!PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, null, g, true, 73726, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, j.class)) {
            return a(context2, context.getString(i), a.a(context.getResources(), i2), onClickListener2);
        }
        return (j) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, null, g, true, 73726, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, j.class);
    }

    public static j a(Context context, String str, Drawable drawable, View.OnClickListener onClickListener) {
        Context context2 = context;
        String str2 = str;
        Drawable drawable2 = drawable;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, str2, drawable2, onClickListener2}, null, g, true, 73728, new Class[]{Context.class, String.class, Drawable.class, View.OnClickListener.class}, j.class)) {
            Object[] objArr = {context2, str2, drawable2, onClickListener2};
            return (j) PatchProxy.accessDispatch(objArr, null, g, true, 73728, new Class[]{Context.class, String.class, Drawable.class, View.OnClickListener.class}, j.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dip2Px = (int) UIUtils.dip2Px(context2, 10.0f);
        layoutParams.leftMargin = dip2Px;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(dip2Px);
        }
        j jVar = new j(context2);
        jVar.setLayoutParams(layoutParams);
        jVar.setOnClickListener(onClickListener2);
        if (str2 != null) {
            jVar.setText(str2);
        }
        if (drawable2 != null) {
            jVar.setIcon(drawable2);
        }
        return jVar;
    }
}
