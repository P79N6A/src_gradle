package com.ss.android.ugc.aweme.feed.share.command;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.CoordinatorLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.douyin.share.a.c.i;
import com.douyin.share.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.live.h;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.share.bt;
import com.ss.android.ugc.aweme.share.ca;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.cj;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class LiveShareCommandDialog extends IShareService.SharePage implements View.OnClickListener, b.C0026b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3180a;
    private View A;
    private DmtEditText B;
    private View C;
    private DmtTextView D;
    private b.a E;
    private View.OnClickListener F = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45867a;

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f45867a, false, 42180, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45867a, false, 42180, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                if (!NetworkUtils.isNetworkAvailable(LiveShareCommandDialog.this.f3183d)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) LiveShareCommandDialog.this.f3183d, (int) C0906R.string.bgf).a();
                } else if (LiveShareCommandDialog.this.f3183d != null && LiveShareCommandDialog.this.f3183d.isFinishing()) {
                } else {
                    if (!(LiveShareCommandDialog.this.f3183d instanceof LifecycleOwner) || ((LifecycleOwner) LiveShareCommandDialog.this.f3183d).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        int id = view.getId();
                        new t().a("enter_from", "live");
                        if (id == C0906R.id.q2) {
                            LiveShareCommandDialog.this.dismiss();
                        } else if (id == C0906R.id.zx) {
                            String a2 = cg.a(LiveShareCommandDialog.this.f3181b, "copy");
                            String str2 = LiveShareCommandDialog.this.f3181b.description + " " + a2;
                            ((ClipboardManager) LiveShareCommandDialog.this.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str2));
                            com.bytedance.ies.dmt.ui.d.a.a(LiveShareCommandDialog.this.getContext(), (int) C0906R.string.a2a).a();
                            if (LiveShareCommandDialog.this.h != null) {
                                LiveShareCommandDialog.this.h.a("copylink", "link");
                            }
                        } else if (id == C0906R.id.cdm) {
                            LiveShareCommandDialog liveShareCommandDialog = LiveShareCommandDialog.this;
                            IShareService.ShareStruct shareStruct = LiveShareCommandDialog.this.f3181b;
                            if (PatchProxy.isSupport(new Object[]{shareStruct}, liveShareCommandDialog, LiveShareCommandDialog.f3180a, false, 42167, new Class[]{IShareService.ShareStruct.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{shareStruct}, liveShareCommandDialog, LiveShareCommandDialog.f3180a, false, 42167, new Class[]{IShareService.ShareStruct.class}, Void.TYPE);
                            } else {
                                HashMap hashMap = new HashMap(1);
                                hashMap.put("room_id", String.valueOf(shareStruct.itemId));
                                com.ss.android.ugc.aweme.report.a.a(liveShareCommandDialog.getOwnerActivity(), "live", shareStruct.identifier, shareStruct.uid4Share, "", false, hashMap);
                            }
                        } else if (id == C0906R.id.c9n) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("anchor_id", LiveShareCommandDialog.this.f3181b.liveId);
                            hashMap2.put("use_type", LiveShareCommandDialog.this.f3181b.extraParams.get("user_type"));
                            hashMap2.put("request_id", LiveShareCommandDialog.this.f3181b.extraParams.get("request_id"));
                            hashMap2.put("previous_page", LiveShareCommandDialog.this.f3181b.extraParams.get("previous_page"));
                            z zVar = new z(LiveShareCommandDialog.this.f3183d, new bt.a().a(5, LiveShareCommandDialog.this.f3181b.identifier, LiveShareCommandDialog.this.f3181b.extraParams.get("previous_page")).a(LiveShareCommandDialog.this.f3181b.authorName, LiveShareCommandDialog.this.f3181b.authorId).f64830b);
                            zVar.f65325c = LiveShareCommandDialog.this.h;
                            zVar.a(LiveShareCommandDialog.this.mShareCallback).show();
                            r.a("click_qr_code", (Map) d.a().a("anchor_id", LiveShareCommandDialog.this.f3181b.liveId).a("platform", "scan").a(hashMap2).a("qr_code_type", "shaped").a("enter_from", "live_page").f34114b);
                        } else if (id == C0906R.id.a6j) {
                            com.bytedance.android.livesdkapi.c.a aVar = (com.bytedance.android.livesdkapi.c.a) h.a(com.bytedance.android.livesdkapi.c.a.class);
                            aVar.a(LiveShareCommandDialog.this.f3183d, LiveShareCommandDialog.this.f3181b.liveId, LiveShareCommandDialog.this.g.douPlusEntry);
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("entrance_type", "share_panel");
                            hashMap3.put("pay_mode", "dou_not_iap");
                            if (LiveShareCommandDialog.this.f3185f) {
                                str = "my_group";
                            } else {
                                str = "other_group";
                            }
                            hashMap3.put("serving_type", str);
                            hashMap3.put("room_id", LiveShareCommandDialog.this.f3181b.identifier);
                            hashMap3.put("anchor_id", LiveShareCommandDialog.this.f3181b.liveId);
                            aVar.a(false, "click_live_dou_plus", "", (Map<String, String>) hashMap3);
                        }
                        LiveShareCommandDialog.this.dismiss();
                    }
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final IShareService.ShareStruct f3181b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3182c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f3183d;

    /* renamed from: e  reason: collision with root package name */
    CoordinatorLayout f3184e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3185f;
    public com.bytedance.android.live.base.model.c.a g;
    public a h;
    private DmtTextView i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private IReportService o;
    private IUserService p;
    private HorizontalScrollView q;
    private IShareService r;
    private View s;
    private View t;
    private FrameLayout u;
    private FrameLayout v;
    private List<String> w;
    private LinearLayout x;
    private LinearLayout y;
    private RemoteImageView z;

    public interface a {
        void a(String str, String str2);
    }

    public void addBottomShareItem(View view) {
    }

    public void addBottomShareItem(View view, int i2) {
    }

    public void setPanelTitle(String str) {
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42177, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        bg.d(this);
    }

    public final com.ss.android.ugc.aweme.im.h a() {
        if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42173, new Class[0], com.ss.android.ugc.aweme.im.h.class)) {
            return (com.ss.android.ugc.aweme.im.h) PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42173, new Class[0], com.ss.android.ugc.aweme.im.h.class);
        }
        com.ss.android.ugc.aweme.im.h hVar = new com.ss.android.ugc.aweme.im.h();
        hVar.l = this;
        hVar.f50077f = this.s;
        hVar.f50074c = this.x;
        hVar.f50076e = this.y;
        hVar.f50075d = this.A;
        hVar.j = this.z;
        hVar.k = this.B;
        hVar.g = this.C;
        hVar.f50072a = this.i;
        hVar.f50073b = this.D;
        return hVar;
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42174, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42175, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42175, new Class[0], Void.TYPE);
        } else {
            InputMethodManager inputMethodManager = (InputMethodManager) this.B.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.B.getWindowToken(), 2);
            }
        }
        if (this.E != null) {
            this.E.a();
        }
        super.cancel();
    }

    public void show() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42176, new Class[0], Void.TYPE);
        } else if (this.f3183d == null || !this.f3183d.isFinishing()) {
            setOnShowListener(new DialogInterface.OnShowListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45876a;

                public final void onShow(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45876a, false, 42183, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45876a, false, 42183, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
                    if (frameLayout != null) {
                        BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                        from.setPeekHeight(frameLayout.getHeight());
                        from.setSkipCollapsed(true);
                    }
                }
            });
            super.show();
            bg.c(this);
            if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42179, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42179, new Class[0], Void.TYPE);
                return;
            }
            if (this.n != null && this.n.getVisibility() == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("entrance_type", "share_panel");
                hashMap.put("pay_mode", "dou_not_iap");
                if (this.f3185f) {
                    str = "my_group";
                } else {
                    str = "other_group";
                }
                hashMap.put("serving_type", str);
                hashMap.put("room_id", this.f3181b.identifier);
                hashMap.put("anchor_id", this.f3181b.liveId);
                ((com.bytedance.android.livesdkapi.c.a) h.a(com.bytedance.android.livesdkapi.c.a.class)).a(false, "show_live_dou_plus", "", (Map<String, String>) hashMap);
            }
        }
    }

    public void addShareViewInTop(View view) {
        this.s = view;
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.live.a.a aVar) {
        com.ss.android.ugc.aweme.live.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3180a, false, 42178, new Class[]{com.ss.android.ugc.aweme.live.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3180a, false, 42178, new Class[]{com.ss.android.ugc.aweme.live.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null && isShowing() && com.ss.android.ugc.aweme.live.a.a.f53188d.equals(aVar2.f53189e)) {
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        View view;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3180a, false, 42164, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3180a, false, 42164, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.a_5);
        if (PatchProxy.isSupport(new Object[0], this, f3180a, false, 42165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3180a, false, 42165, new Class[0], Void.TYPE);
        } else {
            this.i = (DmtTextView) findViewById(C0906R.id.q2);
            this.j = findViewById(C0906R.id.zx);
            this.k = findViewById(C0906R.id.cdm);
            this.f3184e = (CoordinatorLayout) findViewById(C0906R.id.chy);
            this.l = findViewById(C0906R.id.cdn);
            this.m = findViewById(C0906R.id.c9n);
            this.n = findViewById(C0906R.id.a6j);
            this.q = (HorizontalScrollView) findViewById(C0906R.id.cpf);
            this.i.setOnClickListener(this.F);
            this.j.setOnClickListener(this.F);
            this.k.setOnClickListener(this.F);
            this.m.setOnClickListener(this.F);
            this.n.setOnClickListener(this.F);
            View view2 = this.n;
            int i3 = 8;
            if (this.g.hasDouPlusEntry) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
            v.d(this.j);
            v.d(this.k);
            v.d(this.m);
            if (!cg.c()) {
                this.m.setVisibility(8);
            }
            this.f3185f = TextUtils.equals(this.p.getCurrentUserID(), this.f3182c);
            View view3 = this.l;
            if (!this.f3185f) {
                i3 = 0;
            }
            view3.setVisibility(i3);
            cj cjVar = new cj(this.f3183d);
            if (com.ss.android.g.a.a() && this.w != null && this.w.contains("chat_merge")) {
                this.w.remove("chat_merge");
            }
            if (this.w != null && this.w.contains("toutiao")) {
                this.w.remove("toutiao");
            }
            if (this.w != null && this.w.contains("rocket_space")) {
                this.w.remove("rocket_space");
            }
            List<String> list = this.w;
            if (PatchProxy.isSupport(new Object[]{list}, cjVar, cj.f64970a, false, 73364, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, cjVar, cj.f64970a, false, 73364, new Class[]{List.class}, Void.TYPE);
            } else {
                for (String next : list) {
                    if (!TextUtils.equals(next, "chat_merge") || !b.c()) {
                        Activity activity = cjVar.f64971b;
                        com.douyin.baseshare.a a2 = g.a(next, activity);
                        if (a2 == null) {
                            view = null;
                        } else {
                            TextView textView = new TextView(activity);
                            textView.setTag(a2);
                            textView.setClickable(false);
                            textView.setTextSize(10.0f);
                            textView.setGravity(1);
                            textView.setTextColor(activity.getResources().getColor(C0906R.color.a2p));
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.gravity = 81;
                            layoutParams.setMargins((int) UIUtils.dip2Px(activity, 15.0f), 0, 0, 0);
                            textView.setLayoutParams(layoutParams);
                            textView.setIncludeFontPadding(false);
                            textView.setText(a2.f());
                            Drawable e2 = a2.e();
                            e2.setBounds(0, 0, (int) UIUtils.dip2Px(activity, 49.0f), (int) UIUtils.dip2Px(activity, 49.0f));
                            textView.setCompoundDrawables(null, e2, null, null);
                            textView.setCompoundDrawablePadding((int) UIUtils.dip2Px(activity, 7.0f));
                            view = textView;
                        }
                    } else {
                        view = cg.a(cjVar.f64971b, 2, (View.OnClickListener) null);
                        com.douyin.baseshare.a a3 = g.a("chat_merge", cjVar.f64971b);
                        if (a3 != null) {
                            view.setTag(a3);
                        }
                    }
                    if (view != null) {
                        v.d(view);
                        cjVar.addView(view);
                    }
                }
            }
            this.q.addView(cjVar);
            for (int i4 = 0; i4 < cjVar.getChildCount(); i4++) {
                cjVar.getChildAt(i4).setOnClickListener(this);
            }
            if (b.b()) {
                if (PatchProxy.isSupport(new Object[]{this}, this, f3180a, false, 42172, new Class[]{IShareService.SharePage.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this}, this, f3180a, false, 42172, new Class[]{IShareService.SharePage.class}, Void.TYPE);
                } else {
                    this.E = b.a(this, this.f3183d, this.f3181b, true, false, this);
                }
            }
            this.u = (FrameLayout) findViewById(C0906R.id.d5g);
            this.v = (FrameLayout) findViewById(C0906R.id.mh);
            if (this.t != null) {
                this.v.addView(this.t);
            }
            if (this.s != null) {
                this.u.addView(this.s);
            }
            this.x = (LinearLayout) findViewById(C0906R.id.b_m);
            this.y = (LinearLayout) findViewById(C0906R.id.b7q);
            this.A = findViewById(C0906R.id.b9d);
            this.z = (RemoteImageView) findViewById(C0906R.id.bo0);
            this.B = (DmtEditText) findViewById(C0906R.id.bo1);
            this.C = findViewById(C0906R.id.dtt);
            this.D = (DmtTextView) findViewById(C0906R.id.cnn);
        }
        int screenHeight = UIUtils.getScreenHeight(getOwnerActivity()) - UIUtils.getStatusBarHeight(getContext());
        Window window = getWindow();
        if (window != null) {
            if (screenHeight == 0) {
                screenHeight = -1;
            }
            window.setLayout(-1, screenHeight);
            CoordinatorLayout coordinatorLayout = this.f3184e;
            if (PatchProxy.isSupport(new Object[]{coordinatorLayout}, this, f3180a, false, 42168, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{coordinatorLayout}, this, f3180a, false, 42168, new Class[]{View.class}, Void.TYPE);
            } else {
                final BottomSheetBehavior from = BottomSheetBehavior.from((View) coordinatorLayout.getParent());
                if (from != null) {
                    from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45869a;

                        public final void onSlide(@NonNull View view, float f2) {
                        }

                        public final void onStateChanged(@NonNull View view, int i) {
                            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f45869a, false, 42181, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f45869a, false, 42181, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (i == 5) {
                                LiveShareCommandDialog.this.dismiss();
                                from.setState(4);
                            }
                        }
                    });
                }
            }
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3180a, false, 42171, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3180a, false, 42171, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        final String d2 = ((com.douyin.baseshare.a) view.getTag()).d();
        if (!NetworkUtils.isNetworkAvailable(this.f3183d)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3183d, (int) C0906R.string.bgf).a();
        } else if (cg.a(d2, 5)) {
            if (PatchProxy.isSupport(new Object[]{d2}, this, f3180a, false, 42169, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{d2}, this, f3180a, false, 42169, new Class[]{String.class}, Void.TYPE);
            } else if (this.f3181b != null) {
                ShareInfo shareInfo = new ShareInfo();
                shareInfo.setShareUrl(this.f3181b.url);
                shareInfo.setShareWeiboDesc(this.f3181b.description);
                new ShareCommandFactory(this.f3183d, d2, shareInfo).a("sslocal://live?room_id=" + this.f3181b.identifier + "&user_id=" + this.f3182c, 5, this.f3181b.identifier);
                if (PatchProxy.isSupport(new Object[]{d2, "token"}, this, f3180a, false, 42170, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{d2, "token"}, this, f3180a, false, 42170, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    r.a("share_live", (Map) d.a().a("anchor_id", this.f3181b.liveId).a("platform", d2).a("share_mode", "token").f34114b);
                }
            }
            dismiss();
        } else {
            final t tVar = new t();
            tVar.a("enter_from", "live");
            if (cg.b(d2)) {
                new z(this.f3183d, new bt.a().a(5, this.f3181b.identifier, "live_page").a(this.f3181b.authorName, this.f3181b.authorId).f64830b, 7, d2).show();
                dismiss();
                IShareService.ShareResult shareResult = new IShareService.ShareResult();
                shareResult.success = true;
                shareResult.identifier = this.f3181b.identifier;
                shareResult.type = d2;
                shareResult.eventType = "qr";
                a(shareResult, d2, "qr_code");
                return;
            }
            if (TextUtils.equals("chat_merge", d2)) {
                if (!com.ss.android.g.a.a()) {
                    if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        e.a(this.f3183d, "", "click_shareim_button");
                        return;
                    }
                    com.douyin.share.a aVar = new com.douyin.share.a(this.f3183d);
                    if (aVar.a()) {
                        if (this.E != null) {
                            this.E.a(this.f3181b);
                        }
                        IShareService.ShareResult a2 = aVar.a(this.f3181b);
                        if (a2 == null && this.h != null) {
                            this.h.a("chat_merge", "link");
                        }
                        a(a2, d2, "link");
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("share_struct", this.f3181b);
                        b.a().enterChooseContact(getContext(), bundle, null);
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b(getContext(), aVar.f()).a();
                    }
                }
            } else if (TextUtils.equals("weixin", d2)) {
                IShareService.ShareResult a3 = com.douyin.share.d.a.a.d.a(getOwnerActivity(), this.f3181b, "weixin");
                if (!a3.success) {
                    com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.dtl).a();
                } else {
                    r.onEvent(new MobClick().setEventName("share_live").setLabelName("weixin").setValue(this.f3182c).setJsonObject(tVar.a()));
                }
                a(a3, d2, "link");
            } else if (TextUtils.equals("weixin_moments", d2)) {
                IShareService.ShareResult a4 = com.douyin.share.d.a.a.d.a(getOwnerActivity(), this.f3181b, "weixin_moments");
                if (!a4.success) {
                    com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.dtl).a();
                } else {
                    r.onEvent(new MobClick().setEventName("share_live").setLabelName("weixin_moments").setValue(this.f3182c).setJsonObject(tVar.a()));
                }
                a(a4, d2, "link");
            } else if (TextUtils.equals("rocket", d2)) {
                ca.a((com.douyin.baseshare.a) new com.douyin.share.d(this.f3183d));
                if (!q.a((Context) this.f3183d)) {
                    ca.a(this.f3183d, this.f3181b, new com.ss.android.ugc.aweme.base.a<Boolean>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f45872a;

                        public final /* synthetic */ void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            if (PatchProxy.isSupport(new Object[]{bool}, this, f45872a, false, 42182, new Class[]{Boolean.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bool}, this, f45872a, false, 42182, new Class[]{Boolean.class}, Void.TYPE);
                                return;
                            }
                            IShareService.ShareResult shareResult = new IShareService.ShareResult();
                            shareResult.success = bool.booleanValue();
                            shareResult.type = "rocket";
                            shareResult.identifier = LiveShareCommandDialog.this.f3181b.identifier;
                            LiveShareCommandDialog.this.a(shareResult, d2, "link");
                            r.onEvent(new MobClick().setEventName("share_live").setLabelName("more").setValue(LiveShareCommandDialog.this.f3182c).setJsonObject(tVar.a()));
                        }
                    });
                } else {
                    IShareService.ShareResult a5 = new com.douyin.share.d(this.f3183d).a(this.f3181b);
                    if (a5 == null || !a5.success) {
                        com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.c0i).a();
                    } else {
                        r.onEvent(new MobClick().setEventName("share_live").setLabelName("rocket").setValue(this.f3182c).setJsonObject(tVar.a()));
                    }
                    a(a5, d2, "link");
                }
            } else if (TextUtils.equals("rocket_space", d2)) {
                IShareService.ShareResult a6 = com.douyin.share.d.a.a.d.a(getOwnerActivity(), this.f3181b, "rocket_space");
                if (!a6.success) {
                    com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.c0i).a();
                } else {
                    r.onEvent(new MobClick().setEventName("share_live").setLabelName("rocket_space").setValue(this.f3182c).setJsonObject(tVar.a()));
                }
                a(a6, d2, "link");
            } else if (TextUtils.equals("qq", d2)) {
                IShareService.ShareResult a7 = com.douyin.share.d.a.a.d.a(getOwnerActivity(), this.f3181b, "qq");
                if (!a7.success) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3183d, (int) C0906R.string.bu8).a();
                } else {
                    r.onEvent(new MobClick().setEventName("share_live").setLabelName("qq").setValue(this.f3182c).setJsonObject(tVar.a()));
                }
                a(a7, d2, "link");
            } else if (TextUtils.equals("weibo", d2)) {
                IShareService.ShareResult a8 = com.douyin.share.d.a.a.d.a(getOwnerActivity(), this.f3181b, "weibo");
                if (!a8.success) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3183d, (int) C0906R.string.dt_).a();
                } else {
                    r.onEvent(new MobClick().setEventName("share_live").setLabelName("weibo").setValue(this.f3182c).setJsonObject(tVar.a()));
                }
                a(a8, d2, "link");
            } else if (TextUtils.equals("qzone", d2)) {
                IShareService.ShareResult a9 = com.douyin.share.d.a.a.d.a(getOwnerActivity(), this.f3181b, "qzone");
                if (!a9.success) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3183d, (int) C0906R.string.bu8).a();
                } else {
                    r.onEvent(new MobClick().setEventName("share_live").setLabelName("qzone").setValue(this.f3182c).setJsonObject(tVar.a()));
                }
                a(a9, d2, "link");
            } else if (TextUtils.equals("more", d2)) {
                IShareService.ShareResult shareResult2 = new IShareService.ShareResult();
                shareResult2.success = i.a((Context) getOwnerActivity(), this.f3181b).success;
                shareResult2.type = "more";
                shareResult2.identifier = this.f3181b.identifier;
                a(shareResult2, d2, "link");
                r.onEvent(new MobClick().setEventName("share_live").setLabelName("more").setValue(this.f3182c).setJsonObject(tVar.a()));
            }
            dismiss();
        }
    }

    public final void a(IShareService.ShareResult shareResult, String str, String str2) {
        IShareService.ShareResult shareResult2 = shareResult;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{shareResult2, str3, str4}, this, f3180a, false, 42166, new Class[]{IShareService.ShareResult.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult2, str3, str4}, this, f3180a, false, 42166, new Class[]{IShareService.ShareResult.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (shareResult2 != null && shareResult2.success) {
            onShareComplete(shareResult);
            if (this.h != null) {
                this.h.a(str3, str4);
            }
        }
    }

    public LiveShareCommandDialog(Activity activity, IShareService.ShareStruct shareStruct, List<String> list, a aVar) {
        super(activity, C0906R.style.st);
        if (Build.VERSION.SDK_INT >= 21 && getWindow() != null) {
            getWindow().setStatusBarColor(0);
        }
        this.f3183d = activity;
        setOwnerActivity(this.f3183d);
        this.f3181b = shareStruct;
        this.f3182c = shareStruct.uid4Share;
        this.w = list;
        this.o = (IReportService) ServiceManager.get().getService(IReportService.class);
        this.p = (IUserService) ServiceManager.get().getService(IUserService.class);
        this.r = (IShareService) ServiceManager.get().getService(IShareService.class);
        this.h = aVar;
    }
}
