package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bx implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13054a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKStealTowerWidget f13055b;

    bx(LinkPKStealTowerWidget linkPKStealTowerWidget) {
        this.f13055b = linkPKStealTowerWidget;
    }

    public final void a(View view, Object obj) {
        int i;
        int i2;
        String str;
        if (PatchProxy.isSupport(new Object[]{view, obj}, this, f13054a, false, 7121, new Class[]{View.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, obj}, this, f13054a, false, 7121, new Class[]{View.class, Object.class}, Void.TYPE);
            return;
        }
        LinkPKStealTowerWidget linkPKStealTowerWidget = this.f13055b;
        Integer num = (Integer) obj;
        int i3 = linkPKStealTowerWidget.f12607b.s.f9037e - linkPKStealTowerWidget.f12607b.s.f9036d;
        if (linkPKStealTowerWidget.f12607b.s.f9034b) {
            i = String.valueOf(num).length() + 1;
            str = String.valueOf(num) + "/" + String.valueOf(i3);
            i2 = 0;
        } else {
            str = String.valueOf(i3) + "/" + String.valueOf(num);
            i2 = String.valueOf(i3).length();
            i = str.length();
        }
        if (linkPKStealTowerWidget.i == null) {
            linkPKStealTowerWidget.i = new ForegroundColorSpan(LinkPKStealTowerWidget.f12631f);
        }
        SpannableString spannableString = new SpannableString(str);
        ForegroundColorSpan foregroundColorSpan = linkPKStealTowerWidget.i;
        if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(i2), Integer.valueOf(i), 33}, null, ca.f13062a, true, 7125, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(i2), Integer.valueOf(i), 33}, null, ca.f13062a, true, 7125, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            spannableString.setSpan(foregroundColorSpan, i2, i, 33);
        }
        ((TextView) linkPKStealTowerWidget.j.f9861c).setText(spannableString);
    }
}
