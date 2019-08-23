package com.ss.android.ugc.aweme.profile.ui.header;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commercialize.views.AvatarBackgroundImageView;
import com.ss.android.ugc.aweme.commercialize.views.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.d.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.ui.BaseDTProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeLayout;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout;
import com.ss.android.ugc.aweme.story.api.i;
import com.ss.android.ugc.aweme.utils.ex;

public final class au extends AbsMyCommonHeaderLayout {
    public static ChangeQuickRedirect aB;
    public AvatarBackgroundImageView aC;
    public EnterpriseTransformLayout aD;
    public EnterpriseChallengeLayout aE;
    private View aF;
    private View aG;
    private View aH;
    private View aI;

    public final int getLayout() {
        return C0906R.layout.aap;
    }

    public final void aa_() {
        if (PatchProxy.isSupport(new Object[0], this, aB, false, 69625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aB, false, 69625, new Class[0], Void.TYPE);
            return;
        }
        super.aa_();
        if (!a.a()) {
            this.ae.a((int) C0906R.id.agc, ((i) ServiceManager.get().getService(i.class)).a());
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, aB, false, 69622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aB, false, 69622, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        if (this.aC != null) {
            AvatarBackgroundImageView avatarBackgroundImageView = this.aC;
            if (PatchProxy.isSupport(new Object[0], avatarBackgroundImageView, AvatarBackgroundImageView.f39878a, false, 32788, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], avatarBackgroundImageView, AvatarBackgroundImageView.f39878a, false, 32788, new Class[0], Void.TYPE);
                return;
            }
            if (avatarBackgroundImageView.f39879b != null) {
                avatarBackgroundImageView.f39879b.b();
            }
            if (avatarBackgroundImageView.f39879b != null) {
                avatarBackgroundImageView.f39879b.f38678c = null;
            }
        }
    }

    public final void d(User user) {
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[]{user}, this, aB, false, 69626, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, aB, false, 69626, new Class[]{User.class}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            super.d(user);
            if (ex.e(user) && this.aC != null) {
                CommerceInfo commerceInfo = user.getCommerceInfo();
                if (commerceInfo != null) {
                    UrlModel headImageUrl = commerceInfo.getHeadImageUrl();
                    if (headImageUrl != null) {
                        c.b(this.aC, headImageUrl);
                    }
                }
                if (this.U != null) {
                    aweme = this.U.getmAweme();
                } else {
                    aweme = null;
                }
                this.aD.a(user, aweme);
                this.aE.a(getActivity(), user, true);
            }
        }
    }

    public final void i(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, aB, false, 69627, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, aB, false, 69627, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            if (this.aC != null) {
                this.aC.setVisibility(8);
            }
            if (this.aF != null) {
                this.aF.setVisibility(8);
            }
            if (this.w != null) {
                this.w.setVisibility(0);
            }
            this.t = (float) BaseDTProfileFragment.Y_();
        } else {
            if (this.aC != null) {
                this.aC.setVisibility(0);
            }
            if (this.aF != null) {
                this.aF.setVisibility(0);
            }
            if (this.w != null) {
                this.w.setVisibility(8);
            }
        }
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, aB, false, 69624, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, aB, false, 69624, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.aC = (AvatarBackgroundImageView) view2.findViewById(C0906R.id.kh);
        this.aF = view2.findViewById(C0906R.id.ki);
        this.aD = (EnterpriseTransformLayout) view2.findViewById(C0906R.id.d6c);
        this.aE = (EnterpriseChallengeLayout) view2.findViewById(C0906R.id.a_m);
        this.M.setVisibility(8);
        AvatarBackgroundImageView avatarBackgroundImageView = this.aC;
        Activity activity = getActivity();
        BaseProfileFragment baseProfileFragment = this.T;
        if (PatchProxy.isSupport(new Object[]{activity, baseProfileFragment}, avatarBackgroundImageView, AvatarBackgroundImageView.f39878a, false, 32782, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
            AvatarBackgroundImageView avatarBackgroundImageView2 = avatarBackgroundImageView;
            PatchProxy.accessDispatch(new Object[]{activity, baseProfileFragment}, avatarBackgroundImageView2, AvatarBackgroundImageView.f39878a, false, 32782, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
        } else {
            avatarBackgroundImageView.f39881d = activity;
            avatarBackgroundImageView.f39879b = new com.ss.android.ugc.aweme.commercialize.e.a();
            avatarBackgroundImageView.f39879b.f38678c = avatarBackgroundImageView;
            com.ss.android.ugc.aweme.commercialize.e.a aVar = avatarBackgroundImageView.f39879b;
            if (PatchProxy.isSupport(new Object[]{activity, baseProfileFragment}, aVar, com.ss.android.ugc.aweme.commercialize.e.a.f38676a, false, 31923, new Class[]{Activity.class, Fragment.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commercialize.e.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{activity, baseProfileFragment}, aVar2, com.ss.android.ugc.aweme.commercialize.e.a.f38676a, false, 31923, new Class[]{Activity.class, Fragment.class}, Void.TYPE);
            } else {
                aVar.f38677b = new j(activity, baseProfileFragment, new WeakHandler(aVar), aVar);
            }
            avatarBackgroundImageView.f39880c = new ad();
            avatarBackgroundImageView.f39880c.h = avatarBackgroundImageView;
            if (!d.a().hasUpdated()) {
                ad adVar = avatarBackgroundImageView.f39880c;
                if (PatchProxy.isSupport(new Object[0], adVar, ad.f61573a, false, 67647, new Class[0], Boolean.TYPE)) {
                    ((Boolean) PatchProxy.accessDispatch(new Object[0], adVar, ad.f61573a, false, 67647, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!adVar.f61574b) {
                    adVar.f61574b = true;
                    d.a().queryUser(adVar.g);
                }
            }
        }
        AvatarBackgroundImageView avatarBackgroundImageView3 = this.aC;
        if (PatchProxy.isSupport(new Object[0], avatarBackgroundImageView3, AvatarBackgroundImageView.f39878a, false, 32783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], avatarBackgroundImageView3, AvatarBackgroundImageView.f39878a, false, 32783, new Class[0], Void.TYPE);
        } else {
            avatarBackgroundImageView3.setOnClickListener(new k(avatarBackgroundImageView3));
        }
        this.aG = view2.findViewById(C0906R.id.k7);
        this.aH = view2.findViewById(C0906R.id.c72);
        this.aI = view2.findViewById(C0906R.id.abq);
        c.a((RemoteImageView) this.aC, 2130837942);
        this.ap.setVisibility(8);
        this.E.setVisibility(8);
        this.I.setVisibility(8);
        if (!a.a()) {
            if (PatchProxy.isSupport(new Object[0], this, aB, false, 69621, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, aB, false, 69621, new Class[0], Void.TYPE);
                return;
            }
            ((ViewGroup.MarginLayoutParams) this.aG.getLayoutParams()).topMargin = BaseDTProfileFragment.Y_();
            ((ViewGroup.MarginLayoutParams) this.aH.getLayoutParams()).topMargin = BaseDTProfileFragment.Y_();
            this.aI.getLayoutParams().height = BaseDTProfileFragment.Y_();
            this.aC.getLayoutParams().height = BaseDTProfileFragment.Y_();
            this.aF.getLayoutParams().height = BaseDTProfileFragment.Y_();
            ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = BaseDTProfileFragment.Y_() - ((int) UIUtils.dip2Px(getContext(), 27.5f));
        }
    }

    public au(@NonNull Context context, BaseProfileFragment baseProfileFragment) {
        super(context, baseProfileFragment);
    }

    public final void a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, aB, false, 69628, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, aB, false, 69628, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.a(i, i2, intent);
        if (this.aC != null) {
            AvatarBackgroundImageView avatarBackgroundImageView = this.aC;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, avatarBackgroundImageView, AvatarBackgroundImageView.f39878a, false, 32787, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                AvatarBackgroundImageView avatarBackgroundImageView2 = avatarBackgroundImageView;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, avatarBackgroundImageView2, AvatarBackgroundImageView.f39878a, false, 32787, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.e.a aVar = avatarBackgroundImageView.f39879b;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent2};
            if (PatchProxy.isSupport(objArr, aVar, com.ss.android.ugc.aweme.commercialize.e.a.f38676a, false, 31924, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent2};
                Object[] objArr3 = objArr2;
                com.ss.android.ugc.aweme.commercialize.e.a aVar2 = aVar;
                ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, com.ss.android.ugc.aweme.commercialize.e.a.f38676a, false, 31924, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
            } else {
                aVar.f38677b.a(i, i2, intent2);
            }
        }
    }
}
