package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.share.command.d;
import com.ss.android.ugc.aweme.feed.share.command.e;
import com.ss.android.ugc.aweme.feed.share.command.o;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.q;
import java.util.HashMap;
import java.util.Map;

public final class cr extends s {
    public static ChangeQuickRedirect t;
    public Activity u;

    public final void addShareView(View view, int i) {
    }

    public final Drawable getShareIconDrawble(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, t, false, 73412, new Class[]{String.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{str}, this, t, false, 73412, new Class[]{String.class}, Drawable.class);
        } else if (TextUtils.equals(str, "qq")) {
            return ContextCompat.getDrawable(this.u, 2130839309);
        } else {
            if (TextUtils.equals(str, "weixin")) {
                return ContextCompat.getDrawable(this.u, 2130839314);
            }
            if (TextUtils.equals(str, "weibo")) {
                return ContextCompat.getDrawable(this.u, 2130839312);
            }
            if (TextUtils.equals(str, "weixin_moments")) {
                return ContextCompat.getDrawable(this.u, 2130839315);
            }
            if (TextUtils.equals(str, "toutiao")) {
                return ContextCompat.getDrawable(this.u, 2130839313);
            }
            if (TextUtils.equals(str, "rocket")) {
                return ContextCompat.getDrawable(this.u, 2130839311);
            }
            if (TextUtils.equals(str, "rocket_space")) {
                return ContextCompat.getDrawable(this.u, 2130839311);
            }
            if (TextUtils.equals(str, "qzone")) {
                return ContextCompat.getDrawable(this.u, 2130839310);
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr(Activity activity) {
        super(activity);
        View view;
        this.u = activity;
        if (PatchProxy.isSupport(new Object[0], this, t, false, 73411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 73411, new Class[0], Void.TYPE);
            return;
        }
        IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
        ShareOrderService shareOrderService = (ShareOrderService) ServiceManager.get().getService(ShareOrderService.class);
        String[] videoShareList = shareOrderService.getVideoShareList();
        a[] aVarArr = new a[shareOrderService.getVideoShareList().length];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr[i] = iShareService.getShareChannel(this.u, videoShareList[i]);
        }
        for (final a aVar : cg.a(aVarArr)) {
            if (!TextUtils.equals(aVar.d(), "chat_merge") || !b.c()) {
                Activity activity2 = this.u;
                if (PatchProxy.isSupport(new Object[]{activity2, aVar}, null, cg.f64940a, true, 73326, new Class[]{Activity.class, a.class}, TextView.class)) {
                    view = (TextView) PatchProxy.accessDispatch(new Object[]{activity2, aVar}, null, cg.f64940a, true, 73326, new Class[]{Activity.class, a.class}, TextView.class);
                } else {
                    DmtTextView dmtTextView = new DmtTextView(activity2);
                    dmtTextView.setTag(aVar);
                    dmtTextView.setClickable(false);
                    dmtTextView.setTextSize(10.0f);
                    dmtTextView.setGravity(1);
                    dmtTextView.setTextColor(activity2.getResources().getColor(C0906R.color.a2p));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 81;
                    layoutParams.setMargins((int) UIUtils.dip2Px(activity2, 10.0f), 0, 0, 0);
                    dmtTextView.setLayoutParams(layoutParams);
                    dmtTextView.setIncludeFontPadding(false);
                    dmtTextView.setText(aVar.f());
                    Drawable g = aVar.g();
                    g.setBounds(0, 0, (int) UIUtils.dip2Px(activity2, 39.0f), (int) UIUtils.dip2Px(activity2, 39.0f));
                    dmtTextView.setCompoundDrawables(null, g, null, null);
                    dmtTextView.setCompoundDrawablePadding((int) UIUtils.dip2Px(activity2, 7.0f));
                    view = dmtTextView;
                }
            } else {
                view = cg.a(this.u, 3, (View.OnClickListener) null);
            }
            view.setTag(aVar.d());
            view.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65001a;

                public final void onClick(View view) {
                    d dVar;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f65001a, false, 73413, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f65001a, false, 73413, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (aVar.a()) {
                        if (cg.b(aVar.d())) {
                            IShareService.ShareStruct shareStruct = cr.this.mShareStruct;
                            Activity activity = cr.this.u;
                            if (PatchProxy.isSupport(new Object[]{shareStruct, activity}, null, e.f45946a, true, 42159, new Class[]{IShareService.ShareStruct.class, Context.class}, d.class)) {
                                dVar = (d) PatchProxy.accessDispatch(new Object[]{shareStruct, activity}, null, e.f45946a, true, 42159, new Class[]{IShareService.ShareStruct.class, Context.class}, d.class);
                            } else {
                                d dVar2 = new d();
                                if (shareStruct != null) {
                                    dVar2.f45944e = shareStruct.itemIdStr;
                                    if (TextUtils.equals(shareStruct.itemType, "aweme")) {
                                        dVar2.f45940a = 1;
                                    }
                                    dVar2.f45942c = shareStruct.extraParams.get("desc");
                                    dVar2.f45943d = shareStruct.authorName;
                                    dVar2.j = new IShareService.ShareStruct();
                                    if (shareStruct.videoCover != null && !CollectionUtils.isEmpty(shareStruct.videoCover.getUrlList())) {
                                        dVar2.f45941b = shareStruct.videoCover.getUrlList().get(0);
                                    }
                                }
                                dVar = dVar2;
                            }
                            HashMap<String, String> hashMap = new HashMap<>();
                            hashMap.put("enter_from", "pop_up_publish");
                            dVar.j.extraParams = hashMap;
                            new o(cr.this.u, dVar, 7, aVar.d()).show();
                            IShareService.ShareResult shareResult = new IShareService.ShareResult();
                            shareResult.type = aVar.d();
                            shareResult.success = true;
                            shareResult.identifier = cr.this.mShareStruct.itemIdStr;
                            cr.this.onShareComplete(shareResult);
                        } else {
                            cr.this.onShareComplete(aVar.a(cr.this.mShareStruct));
                        }
                        if (cr.this.mActionHandler != null) {
                            cr.this.mActionHandler.onAction(cr.this.mShareStruct, aVar.d());
                        }
                    } else if (q.a(aVar.d())) {
                        ca.a(cr.this.u, cr.this.mShareStruct, new com.ss.android.ugc.aweme.base.a<Boolean>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f65004a;

                            public final /* synthetic */ void run(Object obj) {
                                Boolean bool = (Boolean) obj;
                                if (PatchProxy.isSupport(new Object[]{bool}, this, f65004a, false, 73414, new Class[]{Boolean.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bool}, this, f65004a, false, 73414, new Class[]{Boolean.class}, Void.TYPE);
                                    return;
                                }
                                IShareService.ShareResult shareResult = new IShareService.ShareResult();
                                shareResult.success = bool.booleanValue();
                                shareResult.type = aVar.d();
                                shareResult.identifier = cr.this.mShareStruct.itemIdStr;
                                cr.this.onShareComplete(shareResult);
                            }
                        });
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) cr.this.u, aVar.c(), 0).a();
                    }
                }
            });
            if (aVar.d().equals("toutiao")) {
                r.a("toutiao_icon_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "pop_up_publish").f34114b);
            }
            this.j.addView(view);
        }
    }
}
