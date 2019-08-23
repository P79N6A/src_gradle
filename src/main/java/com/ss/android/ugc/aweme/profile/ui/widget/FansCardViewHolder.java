package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.d.aa;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;

public class FansCardViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62997a;

    /* renamed from: b  reason: collision with root package name */
    public Context f62998b;

    /* renamed from: c  reason: collision with root package name */
    public FollowerDetail f62999c;

    /* renamed from: d  reason: collision with root package name */
    public int f63000d;

    /* renamed from: e  reason: collision with root package name */
    public View f63001e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f63002f;
    public User g;
    public int h;
    private aa i = new aa();
    @BindView(2131493924)
    public ImageView ivDetailFans;
    @BindView(2131494225)
    public CircleImageView ivFansPlatform;
    @BindView(2131494216)
    public TextView txtFansCount;
    @BindView(2131496166)
    public TextView txtPlatform;

    public final boolean c() {
        if (this.f63000d >= 5) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62997a, false, 69669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62997a, false, 69669, new Class[0], Void.TYPE);
            return;
        }
        this.i.a(this.f62998b, this.f62999c, this.g, new aa.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63007a;

            public final void a() {
                String str;
                boolean z;
                String str2;
                if (PatchProxy.isSupport(new Object[0], this, f63007a, false, 69674, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63007a, false, 69674, new Class[0], Void.TYPE);
                    return;
                }
                String openUrl = FansCardViewHolder.this.f62999c.getOpenUrl();
                if (FansCardViewHolder.this.f63002f) {
                    FansCardViewHolder fansCardViewHolder = FansCardViewHolder.this;
                    if (PatchProxy.isSupport(new Object[0], fansCardViewHolder, FansCardViewHolder.f62997a, false, 69668, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], fansCardViewHolder, FansCardViewHolder.f62997a, false, 69668, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z = TextUtils.equals(fansCardViewHolder.f62999c.getPackageName(), "com.ss.android.article.news");
                    }
                    if (z) {
                        try {
                            AwemeSSOPlatformUtils.a(FansCardViewHolder.this.f62998b, FansCardViewHolder.this.f62999c.getPackageName(), d.a().getCurUserId());
                            MobClick eventName = MobClick.obtain().setEventName("app_awake_from_fans_power");
                            if (FansCardViewHolder.this.c()) {
                                str2 = "others_fans_page";
                            } else {
                                str2 = "personal_homepage";
                            }
                            r.onEvent(eventName.setLabelName(str2).setJsonObject(new c().a("to_app", FansCardViewHolder.this.f62999c.getAppName()).b()));
                        } catch (Exception unused) {
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(openUrl)) {
                    Uri parse = Uri.parse(openUrl);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    try {
                        if (ToolUtils.isInstalledApp(FansCardViewHolder.this.f62998b, intent)) {
                            FansCardViewHolder.this.f62998b.startActivity(intent);
                            MobClick eventName2 = MobClick.obtain().setEventName("app_awake_from_fans_power");
                            if (!FansCardViewHolder.this.f63002f) {
                                str = "personal_homepage";
                            } else if (FansCardViewHolder.this.c()) {
                                str = "personal_fans_page";
                            } else {
                                str = "others_fans_page";
                            }
                            r.onEvent(eventName2.setLabelName(str).setJsonObject(new c().a("to_app", FansCardViewHolder.this.f62999c.getAppName()).b()));
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        });
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f62997a, false, 69670, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.f62999c.getPackageName(), "com.ss.android.ugc.aweme");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62997a, false, 69670, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public FansCardViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f62998b = view.getContext();
        this.f63001e = view.findViewById(C0906R.id.abx);
    }
}
