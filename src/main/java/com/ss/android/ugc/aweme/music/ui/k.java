package com.ss.android.ugc.aweme.music.ui;

import android.os.Build;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.music.ui.dialog.CollectGuidePopupWindow;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56712a;

    /* renamed from: b  reason: collision with root package name */
    private final MusicDetailFragment f56713b;

    k(MusicDetailFragment musicDetailFragment) {
        this.f56713b = musicDetailFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f56712a, false, 60249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56712a, false, 60249, new Class[0], Void.TYPE);
            return;
        }
        MusicDetailFragment musicDetailFragment = this.f56713b;
        if (musicDetailFragment.getActivity() != null && !musicDetailFragment.getActivity().isFinishing() && musicDetailFragment.isViewValid()) {
            try {
                CollectGuidePopupWindow collectGuidePopupWindow = musicDetailFragment.h;
                View view = musicDetailFragment.mMusicCollectLayout;
                if (PatchProxy.isSupport(new Object[]{view}, collectGuidePopupWindow, CollectGuidePopupWindow.f3629a, false, 60536, new Class[]{View.class}, Void.TYPE)) {
                    CollectGuidePopupWindow collectGuidePopupWindow2 = collectGuidePopupWindow;
                    PatchProxy.accessDispatch(new Object[]{view}, collectGuidePopupWindow2, CollectGuidePopupWindow.f3629a, false, 60536, new Class[]{View.class}, Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[]{view, new Long(5000)}, collectGuidePopupWindow, CollectGuidePopupWindow.f3629a, false, 60535, new Class[]{View.class, Long.TYPE}, Void.TYPE)) {
                        CollectGuidePopupWindow collectGuidePopupWindow3 = collectGuidePopupWindow;
                        PatchProxy.accessDispatch(new Object[]{view, new Long(5000)}, collectGuidePopupWindow3, CollectGuidePopupWindow.f3629a, false, 60535, new Class[]{View.class, Long.TYPE}, Void.TYPE);
                    } else {
                        if (view != null) {
                            if (Build.VERSION.SDK_INT >= 19) {
                                collectGuidePopupWindow.showAsDropDown(view, (view.getWidth() - collectGuidePopupWindow.f3631c) / 2, -(view.getHeight() + collectGuidePopupWindow.f3632d), 51);
                            } else {
                                collectGuidePopupWindow.showAsDropDown(view, (view.getWidth() - collectGuidePopupWindow.f3631c) / 2, -(view.getHeight() + collectGuidePopupWindow.f3632d));
                            }
                            if (PatchProxy.isSupport(new Object[]{new Long(5000)}, collectGuidePopupWindow, CollectGuidePopupWindow.f3629a, false, 60539, new Class[]{Long.TYPE}, Void.TYPE)) {
                                CollectGuidePopupWindow collectGuidePopupWindow4 = collectGuidePopupWindow;
                                PatchProxy.accessDispatch(new Object[]{new Long(5000)}, collectGuidePopupWindow4, CollectGuidePopupWindow.f3629a, false, 60539, new Class[]{Long.TYPE}, Void.TYPE);
                            } else {
                                collectGuidePopupWindow.getContentView().removeCallbacks(collectGuidePopupWindow.f3630b);
                                collectGuidePopupWindow.getContentView().postDelayed(collectGuidePopupWindow.f3630b, 5000);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                a.a(e2);
            }
        }
    }
}
