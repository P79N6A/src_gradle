package com.ss.android.ugc.aweme.report;

import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63553a;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f63553a, true, 70693, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f63553a, true, 70693, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRiskModel() == null || !aweme.getAwemeRiskModel().isWarn()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f63553a, true, 70694, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f63553a, true, 70694, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRiskModel() == null || !aweme.getAwemeRiskModel().isVote()) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(View view, int i, int i2, boolean z) {
        View view2 = view;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f63553a, true, 70691, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, null, f63553a, true, 70691, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int i4 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
        if (z) {
            if (i4 < 0) {
                c.a(view2, i4, 0, i3).start();
            }
        } else if (i4 >= 0) {
            c.a(view2, i4, i, i3).start();
        }
    }
}
