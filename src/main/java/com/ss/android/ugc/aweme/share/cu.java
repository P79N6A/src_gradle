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
import com.ss.android.ugc.aweme.share.seconditem.j;

public class cu extends j {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f65008f;

    public int getLayoutResource() {
        return C0906R.layout.at4;
    }

    private cu(Context context) {
        this(context, null);
    }

    private cu(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public cu(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static cu c(Context context, int i, View.OnClickListener onClickListener) {
        Context context2 = context;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), onClickListener2}, null, f65008f, true, 73418, new Class[]{Context.class, Integer.TYPE, View.OnClickListener.class}, cu.class)) {
            return (cu) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), onClickListener2}, null, f65008f, true, 73418, new Class[]{Context.class, Integer.TYPE, View.OnClickListener.class}, cu.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dip2Px = (int) UIUtils.dip2Px(context2, 10.0f);
        layoutParams.leftMargin = dip2Px;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(dip2Px);
        }
        cu cuVar = new cu(context2);
        if (onClickListener2 != null) {
            cuVar.setOnClickListener(onClickListener2);
        }
        cuVar.setLayoutParams(layoutParams);
        b.a().wrapperIMShareText(context2, cuVar.getShareTextView());
        b.a(context2, (RemoteImageView) cuVar.getShareImageView(), i);
        return cuVar;
    }
}
