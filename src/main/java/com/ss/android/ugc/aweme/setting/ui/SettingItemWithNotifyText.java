package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.bytex.a.a.a;

public class SettingItemWithNotifyText extends EffectiveSettingItem {
    public static ChangeQuickRedirect w;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 72644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 72644, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20505c.getLayoutParams();
        layoutParams.width = u.a(4.0d);
        layoutParams.height = u.a(4.0d);
        layoutParams.setMargins(layoutParams.leftMargin + u.a(2.0d), (((int) (-this.f20504b.getTextSize())) / 2) + u.a(1.0d), layoutParams.rightMargin, layoutParams.bottomMargin);
        this.f20505c.setLayoutParams(layoutParams);
    }

    public final void b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, w, false, 72645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 72645, new Class[0], Void.TYPE);
            return;
        }
        this.f20505c.setVisibility(0);
        ImageView imageView = this.f20505c;
        Resources resources = getResources();
        if (b.b()) {
            i = 2130841598;
        } else {
            i = 2130841599;
        }
        imageView.setImageDrawable(a.a(resources, i));
    }

    public SettingItemWithNotifyText(Context context) {
        super(context);
    }

    public SettingItemWithNotifyText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingItemWithNotifyText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
