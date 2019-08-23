package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.config.a;
import com.bytedance.android.livesdk.gift.panel.a.b;
import com.bytedance.android.livesdk.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15355a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15356b;

    i(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15356b = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15355a, false, 10009, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15355a, false, 10009, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15356b;
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{bVar}, giftPanelDoodleWidget, GiftPanelDoodleWidget.f15298a, false, 10006, new Class[]{b.class}, Void.TYPE)) {
            GiftPanelDoodleWidget giftPanelDoodleWidget2 = giftPanelDoodleWidget;
            PatchProxy.accessDispatch(new Object[]{bVar}, giftPanelDoodleWidget2, GiftPanelDoodleWidget.f15298a, false, 10006, new Class[]{b.class}, Void.TYPE);
        } else if (bVar == null || bVar.f15167a.isEmpty()) {
            giftPanelDoodleWidget.f15300c.setVisibility(8);
            giftPanelDoodleWidget.f15301d.setVisibility(8);
            giftPanelDoodleWidget.f15303f.setVisibility(8);
            giftPanelDoodleWidget.f15302e.setVisibility(0);
        } else {
            giftPanelDoodleWidget.f15300c.setVisibility(0);
            giftPanelDoodleWidget.f15301d.setVisibility(0);
            giftPanelDoodleWidget.f15303f.setVisibility(0);
            giftPanelDoodleWidget.f15302e.setVisibility(8);
            if (bVar.f15167a.size() < ((Integer) a.E.a()).intValue()) {
                giftPanelDoodleWidget.f15303f.setText(n.a(giftPanelDoodleWidget.context.getString(C0906R.string.cy1), a.E.a()));
                return;
            }
            giftPanelDoodleWidget.f15303f.setTextColor(giftPanelDoodleWidget.context.getResources().getColor(C0906R.color.a_i));
            String a2 = n.a(giftPanelDoodleWidget.context.getString(C0906R.string.cy3), Integer.valueOf(bVar.f15170d));
            String valueOf = String.valueOf(bVar.f15170d);
            int indexOf = a2.indexOf(valueOf);
            SpannableString spannableString = new SpannableString(a2);
            spannableString.setSpan(new ForegroundColorSpan(giftPanelDoodleWidget.context.getResources().getColor(C0906R.color.a_r)), indexOf, valueOf.length() + indexOf, 18);
            giftPanelDoodleWidget.f15303f.setText(spannableString);
        }
    }
}
