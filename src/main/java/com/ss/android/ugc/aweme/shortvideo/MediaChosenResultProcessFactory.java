package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Keep;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.u;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.w;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.x;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.y;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.z;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c;

@Keep
public class MediaChosenResultProcessFactory implements IMediaChosenResultProcessFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public b create(FragmentActivity fragmentActivity, int i, long j) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 74232, new Class[]{FragmentActivity.class, Integer.TYPE, Long.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 74232, new Class[]{FragmentActivity.class, Integer.TYPE, Long.TYPE}, b.class);
        }
        switch (i) {
            case 1:
                return new u(fragmentActivity2);
            case 2:
                return new z(fragmentActivity2, j2);
            case 3:
                return new v(fragmentActivity2);
            case 4:
                return new w(fragmentActivity2);
            case 5:
                return new x(fragmentActivity2);
            case 6:
                return new y(fragmentActivity2);
            case e.l:
                return new c(fragmentActivity2);
            default:
                return new u(fragmentActivity2);
        }
    }
}
