package com.ss.android.ugc.aweme.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.main.base.MainBottomTabView;

public class MainPageFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54263a;

    /* renamed from: b  reason: collision with root package name */
    private MainPageFragment f54264b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f54263a, false, 57581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54263a, false, 57581, new Class[0], Void.TYPE);
            return;
        }
        MainPageFragment mainPageFragment = this.f54264b;
        if (mainPageFragment != null) {
            this.f54264b = null;
            mainPageFragment.tabDivider = null;
            mainPageFragment.mMainBottomTabView = null;
            mainPageFragment.mVideoSeekBar = null;
            mainPageFragment.mVideoSeekDuration = null;
            mainPageFragment.bubbleGuideHolder = null;
            mainPageFragment.mAutoPlayTab = null;
            mainPageFragment.vwSettingShadow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MainPageFragment_ViewBinding(MainPageFragment mainPageFragment, View view) {
        this.f54264b = mainPageFragment;
        mainPageFragment.tabDivider = Utils.findRequiredView(view, C0906R.id.mt, "field 'tabDivider'");
        mainPageFragment.mMainBottomTabView = (MainBottomTabView) Utils.findRequiredViewAsType(view, C0906R.id.bl0, "field 'mMainBottomTabView'", MainBottomTabView.class);
        mainPageFragment.mVideoSeekBar = (VideoSeekBar) Utils.findRequiredViewAsType(view, C0906R.id.dsu, "field 'mVideoSeekBar'", VideoSeekBar.class);
        mainPageFragment.mVideoSeekDuration = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.dsv, "field 'mVideoSeekDuration'", LinearLayout.class);
        mainPageFragment.bubbleGuideHolder = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.pd, "field 'bubbleGuideHolder'", ViewStub.class);
        mainPageFragment.mAutoPlayTab = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.aav, "field 'mAutoPlayTab'", LinearLayout.class);
        mainPageFragment.vwSettingShadow = Utils.findRequiredView(view, C0906R.id.dw7, "field 'vwSettingShadow'");
    }
}
