package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;

public class AbsProfileFragment_ViewBinding extends BaseDTProfileFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61722a;

    /* renamed from: d  reason: collision with root package name */
    private AbsProfileFragment f61723d;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61722a, false, 67724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61722a, false, 67724, new Class[0], Void.TYPE);
            return;
        }
        AbsProfileFragment absProfileFragment = this.f61723d;
        if (absProfileFragment != null) {
            this.f61723d = null;
            absProfileFragment.bindPhoneGuide = null;
            absProfileFragment.completeProfileGuide = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AbsProfileFragment_ViewBinding(AbsProfileFragment absProfileFragment, View view) {
        super(absProfileFragment, view);
        this.f61723d = absProfileFragment;
        absProfileFragment.bindPhoneGuide = (NoticeView) Utils.findRequiredViewAsType(view, C0906R.id.dtj, "field 'bindPhoneGuide'", NoticeView.class);
        absProfileFragment.completeProfileGuide = (NoticeView) Utils.findRequiredViewAsType(view, C0906R.id.dtn, "field 'completeProfileGuide'", NoticeView.class);
    }
}
