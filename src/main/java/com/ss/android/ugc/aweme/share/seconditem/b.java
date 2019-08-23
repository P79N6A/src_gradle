package com.ss.android.ugc.aweme.share.seconditem;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.favorites.c.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;

public class b extends a implements View.OnClickListener, com.ss.android.ugc.aweme.favorites.c.b {
    public static ChangeQuickRedirect g;
    public boolean h;
    private a i;
    private Aweme j;
    private IShareService.SharePage k;
    private String l;

    public final void a(Exception exc) {
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 73694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 73694, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = new a();
        }
        this.i.a(this);
        this.i.a(2, this.j.getAid(), Integer.valueOf(this.h ^ true ? 1 : 0));
        if (this.k != null && this.k.isShowing()) {
            this.k.dismiss();
        }
    }

    public void setDialog(IShareService.SharePage sharePage) {
        this.k = sharePage;
    }

    public void setEnterFrom(String str) {
        this.l = str;
    }

    public b(Context context) {
        this(context, null);
    }

    public final void a(BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, g, false, 73695, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, g, false, 73695, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        this.h = !this.h;
        if (this.h) {
            this.j.setCollectStatus(1);
            com.ss.android.ugc.aweme.feed.a.a().d(this.j.getAid(), 1);
            return;
        }
        this.j.setCollectStatus(0);
        com.ss.android.ugc.aweme.feed.a.a().d(this.j.getAid(), 0);
    }

    public void setData(Aweme aweme) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, g, false, 73690, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, g, false, 73690, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.j = aweme;
        if (this.j != null) {
            this.h = this.j.isCollected();
            if (PatchProxy.isSupport(new Object[0], this, g, false, 73691, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 73691, new Class[0], Void.TYPE);
                return;
            }
            int cn2 = AbTestManager.a().cn();
            if (this.h) {
                setIcon(2130839598);
                Context context = getContext();
                if (cn2 != 2) {
                    i3 = C0906R.string.po;
                } else {
                    i3 = C0906R.string.ey;
                }
                setText(context.getString(i3));
                return;
            }
            setIcon(2130839632);
            Context context2 = getContext();
            if (cn2 != 2) {
                i2 = C0906R.string.cdz;
            } else {
                i2 = C0906R.string.f4;
            }
            setText(context2.getString(i2));
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{view}, this, g, false, 73693, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, g, false, 73693, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (PatchProxy.isSupport(new Object[0], this, g, false, 73696, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 73696, new Class[0], Void.TYPE);
            } else if (!this.h) {
                d a2 = d.a();
                a2.a("enter_from", this.l).a("group_id", this.j.getAid()).a("author_id", this.j.getAuthorUid()).a("enter_method", "click_share_button").a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(getContext()) ? 1 : 0).a(com.ss.android.ugc.aweme.forward.e.a.b(this.j, "detail"));
                if ("homepage_country".equals(this.l) && this.j.getAuthor() != null) {
                    if (this.j.getAuthor() == null) {
                        str2 = "";
                    } else {
                        str2 = this.j.getAuthor().getRegion();
                    }
                    a2.a("country_name", str2);
                }
                if (aa.d(this.l)) {
                    a2.a("log_pb", ai.a().a(aa.c(this.j)));
                    h.b(this.j, "favourite_video", a2);
                } else {
                    h.a(this.j, "favourite_video", a2);
                }
                z.a(z.c.SHARE);
            } else {
                h.a(this.j, "cancel_favourite_video", d.a().a("enter_from", this.l).a("group_id", this.j.getAid()).a("author_id", this.j.getAuthorUid()).a("enter_method", "click_share_button").a("log_pb", ai.a().a(aa.c(this.j))).a("is_long_item", com.ss.android.ugc.aweme.longvideo.b.a.b(getContext()) ? 1 : 0).a(com.ss.android.ugc.aweme.forward.e.a.b(this.j, "detail")));
            }
            if (c.L(this.j)) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.ca).a();
                if (this.k != null && this.k.isShowing()) {
                    this.k.dismiss();
                }
            } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                if (this.j != null) {
                    str = this.j.getAid();
                } else {
                    str = "";
                }
                e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), this.l, "click_favorite_video", ad.a().a("group_id", str).a("log_pb", aa.g(str)).f75487b, (f) new c(this));
            } else {
                b();
                a();
                if (AbTestManager.a().aW()) {
                    com.ss.android.ugc.aweme.base.sharedpref.e.d().b("last_share_type", "TYPE_FAVORITE");
                }
            }
        }
    }

    public b(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setOnClickListener(this);
    }
}
