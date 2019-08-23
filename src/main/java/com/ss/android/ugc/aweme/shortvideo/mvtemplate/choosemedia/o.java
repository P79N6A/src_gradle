package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;

public final /* synthetic */ class o implements MvImageChooseAdapter.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68616a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChoosePhotoFragment f68617b;

    o(MvChoosePhotoFragment mvChoosePhotoFragment) {
        this.f68617b = mvChoosePhotoFragment;
    }

    public final void a(View view, a aVar) {
        View view2 = view;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{view2, aVar2}, this, f68616a, false, 77985, new Class[]{View.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aVar2}, this, f68616a, false, 77985, new Class[]{View.class, a.class}, Void.TYPE);
            return;
        }
        MvChoosePhotoFragment mvChoosePhotoFragment = this.f68617b;
        if (aVar2 != null) {
            if (mvChoosePhotoFragment.f68542b.h) {
                com.ss.android.ugc.aweme.port.in.a.f61121d.a(mvChoosePhotoFragment.getActivity(), view2, (((float) UIUtils.getScreenWidth(mvChoosePhotoFragment.getContext())) * 1.0f) / ((float) UIUtils.getScreenHeight(mvChoosePhotoFragment.getContext())), "file://" + aVar2.f56315e);
            } else if (mvChoosePhotoFragment.f68543c != null) {
                mvChoosePhotoFragment.f68543c.a(aVar2);
            }
        }
    }
}
