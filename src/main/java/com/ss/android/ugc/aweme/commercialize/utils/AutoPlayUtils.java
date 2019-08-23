package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.main.MainActivity;

public final class AutoPlayUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39615a;

    public @interface AutoPlayState {
    }

    public interface a {
        void p();
    }

    public static int a(IFeedViewHolder iFeedViewHolder) {
        if (!PatchProxy.isSupport(new Object[]{iFeedViewHolder}, null, f39615a, true, 32416, new Class[]{IFeedViewHolder.class}, Integer.TYPE)) {
            return 0;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{iFeedViewHolder}, null, f39615a, true, 32416, new Class[]{IFeedViewHolder.class}, Integer.TYPE)).intValue();
    }

    public static void a(IFeedViewHolder iFeedViewHolder, @AutoPlayState int i) {
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, 0}, null, f39615a, true, 32414, new Class[]{IFeedViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, 0}, null, f39615a, true, 32414, new Class[]{IFeedViewHolder.class, Integer.TYPE}, Void.TYPE);
        }
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f39615a, true, 32413, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f39615a, true, 32413, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) context2;
            mainActivity.changeAutoPlayTabVisibility(8);
            mainActivity.exitMaskLayer(false);
        }
    }
}
