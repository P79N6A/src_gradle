package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.BaseDTProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeLayout;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseTransformLayout;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;

public final class ax extends aa {
    public static ChangeQuickRedirect bc;
    private RemoteImageView bd;
    private View be;
    private EnterpriseTransformLayout bf;
    private EnterpriseTransformLayout bg;
    private EnterpriseChallengeLayout bh;
    private View bi;
    private View bj;
    private View bk;

    public final boolean ab_() {
        return true;
    }

    public final boolean c() {
        return false;
    }

    public final int getLayout() {
        return C0906R.layout.lz;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, bc, false, 69655, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, bc, false, 69655, new Class[0], Void.TYPE);
            return;
        }
        super.d();
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, bc, false, 69658, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, bc, false, 69658, new Class[0], Void.TYPE);
            return;
        }
        super.y();
        this.bd.setImageURI(new Uri.Builder().scheme("res").path("2130837942").build());
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, bc, false, 69654, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, bc, false, 69654, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        this.bd = (RemoteImageView) view.findViewById(C0906R.id.kh);
        this.be = view.findViewById(C0906R.id.ki);
        this.bf = (EnterpriseTransformLayout) view.findViewById(C0906R.id.d6c);
        this.bg = (EnterpriseTransformLayout) view.findViewById(C0906R.id.d6d);
        this.bh = (EnterpriseChallengeLayout) view.findViewById(C0906R.id.a_m);
        this.bi = view.findViewById(C0906R.id.abq);
        this.bj = view.findViewById(C0906R.id.k7);
        this.bk = view.findViewById(C0906R.id.c72);
        this.av.setVisibility(8);
        this.M.setVisibility(8);
        this.E.setVisibility(8);
        this.I.setVisibility(8);
        if (this.aN != null) {
            this.aN.setVisibility(8);
        }
        if (PatchProxy.isSupport(new Object[0], this, bc, false, 69653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, bc, false, 69653, new Class[0], Void.TYPE);
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.bj.getLayoutParams()).topMargin = BaseDTProfileFragment.Y_();
        ((ViewGroup.MarginLayoutParams) this.bk.getLayoutParams()).topMargin = BaseDTProfileFragment.Y_();
        this.bi.getLayoutParams().height = BaseDTProfileFragment.Y_();
        this.bd.getLayoutParams().height = BaseDTProfileFragment.Y_();
        this.be.getLayoutParams().height = BaseDTProfileFragment.Y_();
    }

    public final void d(User user) {
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[]{user}, this, bc, false, 69656, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, bc, false, 69656, new Class[]{User.class}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            super.d(user);
            if (ex.e(user)) {
                if (a.a()) {
                    this.bd.setClickable(false);
                }
                if (c.c(user)) {
                    this.bd.setVisibility(8);
                    if (this.be != null) {
                        this.be.setVisibility(8);
                    }
                    if (this.w != null) {
                        this.w.setVisibility(0);
                    }
                    this.t = (float) BaseDTProfileFragment.Y_();
                } else {
                    this.bd.setVisibility(0);
                    if (this.be != null) {
                        this.be.setVisibility(0);
                    }
                    if (this.w != null) {
                        this.w.setVisibility(8);
                    }
                }
                CommerceInfo commerceInfo = user.getCommerceInfo();
                if (PatchProxy.isSupport(new Object[]{commerceInfo}, this, bc, false, 69657, new Class[]{CommerceInfo.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{commerceInfo}, this, bc, false, 69657, new Class[]{CommerceInfo.class}, Void.TYPE);
                } else {
                    if (commerceInfo != null) {
                        UrlModel headImageUrl = commerceInfo.getHeadImageUrl();
                        if (headImageUrl != null && !CollectionUtils.isEmpty(headImageUrl.getUrlList())) {
                            com.ss.android.ugc.aweme.base.c.b(this.bd, headImageUrl);
                        }
                    }
                    this.bd.setImageURI(new Uri.Builder().scheme("res").path("2130837942").build());
                }
                if (this.U != null) {
                    aweme = this.U.getmAweme();
                } else {
                    aweme = null;
                }
                if (!AbTestManager.a().h() || this.bg == null) {
                    if (this.bg != null) {
                        this.bg.setVisibility(8);
                    }
                    this.bf.setVisibility(0);
                    this.bf.a(user, aweme);
                } else {
                    this.bf.setVisibility(8);
                    this.bg.setVisibility(0);
                    this.bg.a(user, aweme);
                }
                this.bh.a(getActivity(), user, true);
            }
        }
    }

    public ax(@NonNull Context context, BaseProfileFragment baseProfileFragment, ay ayVar, WeakHandler weakHandler, aq aqVar) {
        super(context, baseProfileFragment, ayVar, weakHandler, aqVar);
    }
}
