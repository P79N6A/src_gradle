package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;

public class MusUserProfileFragment_ViewBinding extends MusAbsProfileFragment_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f62025b;

    /* renamed from: d  reason: collision with root package name */
    private MusUserProfileFragment f62026d;

    /* renamed from: e  reason: collision with root package name */
    private View f62027e;

    /* renamed from: f  reason: collision with root package name */
    private View f62028f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62025b, false, 68458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62025b, false, 68458, new Class[0], Void.TYPE);
            return;
        }
        MusUserProfileFragment musUserProfileFragment = this.f62026d;
        if (musUserProfileFragment != null) {
            this.f62026d = null;
            musUserProfileFragment.followIv = null;
            musUserProfileFragment.sendMsgBtn = null;
            musUserProfileFragment.followBn = null;
            musUserProfileFragment.mFlHead = null;
            musUserProfileFragment.requestedBtn = null;
            musUserProfileFragment.adBottomMoreBtn = null;
            musUserProfileFragment.mLiveStatusView = null;
            musUserProfileFragment.txtAdBottomDes = null;
            this.f62027e.setOnClickListener(null);
            this.f62027e = null;
            this.f62028f.setOnClickListener(null);
            this.f62028f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.l.setOnClickListener(null);
            this.l = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusUserProfileFragment_ViewBinding(final MusUserProfileFragment musUserProfileFragment, View view) {
        super(musUserProfileFragment, view);
        this.f62026d = musUserProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.agx, "field 'followIv' and method 'onImClick'");
        musUserProfileFragment.followIv = (ImageView) Utils.castView(findRequiredView, C0906R.id.agx, "field 'followIv'", ImageView.class);
        this.f62027e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62029a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62029a, false, 68459, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62029a, false, 68459, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onImClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.cnx, "field 'sendMsgBtn' and method 'onImClick'");
        musUserProfileFragment.sendMsgBtn = (Button) Utils.castView(findRequiredView2, C0906R.id.cnx, "field 'sendMsgBtn'", Button.class);
        this.f62028f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62032a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62032a, false, 68460, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62032a, false, 68460, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onImClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.c6v, "field 'followBn' and method 'follow'");
        musUserProfileFragment.followBn = (Button) Utils.castView(findRequiredView3, C0906R.id.c6v, "field 'followBn'", Button.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62035a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62035a, false, 68461, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62035a, false, 68461, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.follow(view2);
            }
        });
        musUserProfileFragment.mFlHead = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.afl, "field 'mFlHead'", FrameLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.cdt, "field 'requestedBtn' and method 'onImClick'");
        musUserProfileFragment.requestedBtn = (Button) Utils.castView(findRequiredView4, C0906R.id.cdt, "field 'requestedBtn'", Button.class);
        this.h = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62038a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62038a, false, 68462, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62038a, false, 68462, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onImClick(view2);
            }
        });
        musUserProfileFragment.adBottomMoreBtn = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bk, "field 'adBottomMoreBtn'", TextView.class);
        musUserProfileFragment.mLiveStatusView = (AnimationImageView) Utils.findRequiredViewAsType(view, C0906R.id.dx, "field 'mLiveStatusView'", AnimationImageView.class);
        musUserProfileFragment.txtAdBottomDes = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dmo, "field 'txtAdBottomDes'", TextView.class);
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.ix, "method 'onBack'");
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62041a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62041a, false, 68463, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62041a, false, 68463, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onBack(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.c6w, "method 'onReport'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62044a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62044a, false, 68464, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62044a, false, 68464, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onReport(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, C0906R.id.bh, "method 'onAdBottomClick'");
        this.k = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62047a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62047a, false, 68465, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62047a, false, 68465, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onAdBottomClick(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, C0906R.id.bj, "method 'onAdBottomClick'");
        this.l = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62050a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f62050a, false, 68466, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f62050a, false, 68466, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musUserProfileFragment.onAdBottomClick(view2);
            }
        });
    }
}
