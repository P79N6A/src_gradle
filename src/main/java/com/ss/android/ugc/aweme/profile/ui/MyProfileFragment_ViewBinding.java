package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;

public class MyProfileFragment_ViewBinding extends AbsProfileFragment_ViewBinding {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f62072d;

    /* renamed from: e  reason: collision with root package name */
    private MyProfileFragment f62073e;

    /* renamed from: f  reason: collision with root package name */
    private View f62074f;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62072d, false, 68586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62072d, false, 68586, new Class[0], Void.TYPE);
            return;
        }
        MyProfileFragment myProfileFragment = this.f62073e;
        if (myProfileFragment != null) {
            this.f62073e = null;
            myProfileFragment.ivBindPhone = null;
            myProfileFragment.mMoreView = null;
            myProfileFragment.enterBindView = null;
            myProfileFragment.mYellowPoint = null;
            myProfileFragment.mTempEnablePrivateAccountGuide = null;
            this.f62074f.setOnClickListener(null);
            this.f62074f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MyProfileFragment_ViewBinding(final MyProfileFragment myProfileFragment, View view) {
        super(myProfileFragment, view);
        this.f62073e = myProfileFragment;
        myProfileFragment.ivBindPhone = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.azy, "field 'ivBindPhone'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bni, "field 'mMoreView' and method 'onMore'");
        myProfileFragment.mMoreView = (RelativeLayout) Utils.castView(findRequiredView, C0906R.id.bni, "field 'mMoreView'", RelativeLayout.class);
        this.f62074f = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62075a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62075a, false, 68587, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62075a, false, 68587, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                myProfileFragment.onMore(view2);
            }
        });
        myProfileFragment.enterBindView = (NoticeView) Utils.findRequiredViewAsType(view, C0906R.id.bx8, "field 'enterBindView'", NoticeView.class);
        myProfileFragment.mYellowPoint = Utils.findRequiredView(view, C0906R.id.dyb, "field 'mYellowPoint'");
        myProfileFragment.mTempEnablePrivateAccountGuide = (NoticeView) Utils.findRequiredViewAsType(view, C0906R.id.al0, "field 'mTempEnablePrivateAccountGuide'", NoticeView.class);
    }
}
