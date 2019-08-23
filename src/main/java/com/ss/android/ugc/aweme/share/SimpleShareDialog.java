package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.commercialize.utils.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.h;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class SimpleShareDialog extends IShareService.SharePage implements View.OnClickListener, b.C0026b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f64561d;
    private View A;
    private View B;
    private DmtTextView C;
    private DmtTextView D;
    private RemoteImageView E;
    private DmtEditText F;
    private ImageView G;
    private boolean H;
    private boolean I;
    private ck.a J;
    private final List<String> K;
    private final String L;
    private boolean M;
    private ck.b N;

    /* renamed from: a  reason: collision with root package name */
    private TextView f64562a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f64563b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f64564c;

    /* renamed from: e  reason: collision with root package name */
    protected LinearLayout f64565e;

    /* renamed from: f  reason: collision with root package name */
    protected LinearLayout f64566f;
    protected LinearLayout g;
    protected Activity h;
    protected View i;
    public b.a j;
    private LinearLayout k;
    private View l;
    private View m;
    private IShareService n = ((IShareService) ServiceManager.get().getService(IShareService.class));
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private View x;
    private View y;
    private View z;

    public void addBottomShareItem(View view) {
    }

    public void addBottomShareItem(View view, int i2) {
    }

    public boolean b() {
        return false;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73396, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73396, new Class[0], Void.TYPE);
            return;
        }
        findViewById(C0906R.id.c9n).setVisibility(8);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73384, new Class[0], Void.TYPE);
            return;
        }
        super.dismiss();
        if (this.j != null) {
            this.j.a();
        }
        a.a();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73398, new Class[0], Void.TYPE);
            return;
        }
        setOnShowListener(new DialogInterface.OnShowListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64575a;

            public final void onShow(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f64575a, false, 73405, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f64575a, false, 73405, new Class[]{DialogInterface.class}, Void.TYPE);
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
    }

    public boolean isThumbNull() {
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73382, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73382, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mShareStruct != null && !TextUtils.isEmpty(this.mShareStruct.thumbUrl)) {
            return TextUtils.isEmpty(this.mShareStruct.getThumbPath());
        } else {
            return true;
        }
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73390, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73390, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!b.b() || TimeLockRuler.isTeenModeON() || this.mShareStruct == null) {
            return false;
        } else {
            if (TextUtils.equals("poi", this.mShareStruct.itemType) || TextUtils.equals("music", this.mShareStruct.itemType) || TextUtils.equals("challenge", this.mShareStruct.itemType) || TextUtils.equals("ranking", this.mShareStruct.itemType) || TextUtils.equals("live", this.mShareStruct.itemType) || TextUtils.equals("web", this.mShareStruct.itemType) || TextUtils.equals(AllStoryActivity.f73306b, this.mShareStruct.itemType) || TextUtils.equals("coupon", this.mShareStruct.itemType) || TextUtils.equals("good", this.mShareStruct.itemType) || TextUtils.equals("good_window", this.mShareStruct.itemType)) {
                return true;
            }
            return false;
        }
    }

    public final h a() {
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73397, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73397, new Class[0], h.class);
        }
        h hVar = new h();
        hVar.f50072a = this.C;
        hVar.f50074c = this.x;
        hVar.f50076e = this.y;
        hVar.k = this.F;
        hVar.j = this.E;
        hVar.f50075d = this.z;
        hVar.h = this.B;
        hVar.f50073b = this.D;
        hVar.f50077f = this.m;
        hVar.l = this;
        hVar.g = this.A;
        hVar.n = this.M;
        hVar.i = this.G;
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.douyin.baseshare.a[] c() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f64561d
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.douyin.baseshare.a[]> r7 = com.douyin.baseshare.a[].class
            r4 = 0
            r5 = 73386(0x11eaa, float:1.02836E-40)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f64561d
            r5 = 0
            r6 = 73386(0x11eaa, float:1.02836E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.douyin.baseshare.a[]> r8 = com.douyin.baseshare.a[].class
            r3 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.douyin.baseshare.a[] r0 = (com.douyin.baseshare.a[]) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService> r2 = com.ss.android.ugc.aweme.framework.services.IShareService.class
            java.lang.Object r1 = r1.getService(r2)
            com.ss.android.ugc.aweme.framework.services.IShareService r1 = (com.ss.android.ugc.aweme.framework.services.IShareService) r1
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r3 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r2 = r2.getService(r3)
            com.ss.android.ugc.aweme.share.ShareOrderService r2 = (com.ss.android.ugc.aweme.share.ShareOrderService) r2
            boolean r3 = r14.f()
            r4 = 1
            if (r3 == 0) goto L_0x004d
            boolean r3 = r14.v
            if (r3 == 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            java.lang.String[] r2 = r2.getUrlShareList(r3)
            java.util.List<java.lang.String> r3 = r14.K
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r0] = r2
            r6[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r8 = f64561d
            r9 = 0
            r10 = 73387(0x11eab, float:1.02837E-40)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r11[r0] = r7
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r11[r4] = r7
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r7 = r14
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0094
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r0] = r2
            r7[r4] = r3
            com.meituan.robust.ChangeQuickRedirect r9 = f64561d
            r10 = 0
            r11 = 73387(0x11eab, float:1.02837E-40)
            java.lang.Class[] r12 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r12[r0] = r2
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r12[r4] = r2
            java.lang.Class<java.lang.String[]> r13 = java.lang.String[].class
            r8 = r14
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String[] r2 = (java.lang.String[]) r2
            goto L_0x00b9
        L_0x0094:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r2.length
            r6 = 0
        L_0x009b:
            if (r6 >= r5) goto L_0x00ad
            r7 = r2[r6]
            if (r7 == 0) goto L_0x00aa
            boolean r8 = r3.contains(r7)
            if (r8 != 0) goto L_0x00aa
            r4.add(r7)
        L_0x00aa:
            int r6 = r6 + 1
            goto L_0x009b
        L_0x00ad:
            int r2 = r4.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
        L_0x00b9:
            int r3 = r2.length
            com.douyin.baseshare.a[] r3 = new com.douyin.baseshare.a[r3]
        L_0x00bc:
            int r4 = r3.length
            if (r0 >= r4) goto L_0x00cc
            android.app.Activity r4 = r14.h
            r5 = r2[r0]
            com.douyin.baseshare.a r4 = r1.getShareChannel(r4, r5)
            r3[r0] = r4
            int r0 = r0 + 1
            goto L_0x00bc
        L_0x00cc:
            java.lang.String r0 = "toutiao"
            com.douyin.baseshare.a[] r0 = r14.a(r3, r0)
            com.douyin.baseshare.a[] r0 = com.ss.android.ugc.aweme.share.cg.a((com.douyin.baseshare.a[]) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SimpleShareDialog.c():com.douyin.baseshare.a[]");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit e() {
        if (this.mShareStruct == null || this.mActionHandler == null) {
            return null;
        }
        onShareComplete(this.n.share(this.h, this.mShareStruct, "report"));
        this.mActionHandler.onAction(this.mShareStruct, "report");
        f.a a2 = f.a((String) SharePrefCache.inst().getPreviewGoodReport().c()).a("awemeId", this.J.f64978a).a("promotionId", this.J.f64979b).a("authorId", this.J.f64980c);
        if (!TextUtils.isEmpty(dr.a().a(this.J.f64980c))) {
            a2.a("secAuthorId", dr.a().a(this.J.f64980c));
        }
        com.ss.android.ugc.aweme.ag.h.a().a(a2.a().toString());
        dismiss();
        return null;
    }

    public final IShareService.ShareStruct getIMShareStruct() {
        IShareService.ShareStruct shareStruct;
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73381, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73381, new Class[0], IShareService.ShareStruct.class);
        } else if (TextUtils.isEmpty(this.L)) {
            return super.getIMShareStruct();
        } else {
            IShareService.ShareStruct shareStruct2 = this.mShareStruct;
            if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, i.f46055a, true, 42108, new Class[]{IShareService.ShareStruct.class}, IShareService.ShareStruct.class)) {
                shareStruct = (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, i.f46055a, true, 42108, new Class[]{IShareService.ShareStruct.class}, IShareService.ShareStruct.class);
            } else {
                shareStruct = new IShareService.ShareStruct();
                shareStruct.itemType = shareStruct2.itemType;
                shareStruct.identifier = shareStruct2.identifier;
                shareStruct.appName = shareStruct2.appName;
                shareStruct.title = shareStruct2.title;
                shareStruct.description = shareStruct2.description;
                shareStruct.WhatsAppDescription = shareStruct2.WhatsAppDescription;
                shareStruct.thumbUrl = shareStruct2.thumbUrl;
                shareStruct.setThumbPath(shareStruct2.getThumbPath());
                shareStruct.url = shareStruct2.url;
                shareStruct.videoPath = shareStruct2.videoPath;
                shareStruct.videoUrl = shareStruct2.videoUrl;
                shareStruct.uid4Share = shareStruct2.uid4Share;
                shareStruct.shareText = shareStruct2.shareText;
                shareStruct.itemIdStr = shareStruct2.itemIdStr;
                shareStruct.authorName = shareStruct2.authorName;
                shareStruct.thumb4Share = shareStruct2.thumb4Share;
                shareStruct.videoCover = shareStruct2.videoCover;
                shareStruct.awemeType = shareStruct2.awemeType;
                shareStruct.awemeWidth = shareStruct2.awemeWidth;
                shareStruct.awemeHeight = shareStruct2.awemeHeight;
                shareStruct.itemId = shareStruct2.itemId;
                shareStruct.groupId = shareStruct2.groupId;
                shareStruct.adId = shareStruct2.adId;
                shareStruct.shareSignatureDesc = shareStruct2.shareSignatureDesc;
                shareStruct.shareSignatureUrl = shareStruct2.shareSignatureUrl;
                shareStruct.shareQuote = shareStruct2.shareQuote;
                shareStruct.shareCopyLink = shareStruct2.shareCopyLink;
                shareStruct.boolPersist = shareStruct2.boolPersist;
                shareStruct.isLineShareWithLink = shareStruct2.isLineShareWithLink;
                shareStruct.liveId = shareStruct2.liveId;
                shareStruct.authorId = shareStruct2.authorId;
                shareStruct.poiId = shareStruct2.poiId;
                shareStruct.poiType = shareStruct2.poiType;
                shareStruct.enterFrom = shareStruct2.enterFrom;
                shareStruct.contentType = shareStruct2.contentType;
                shareStruct.cityInfo = shareStruct2.cityInfo;
                shareStruct.distnceInfo = shareStruct2.distnceInfo;
                shareStruct.logPb = shareStruct2.logPb;
                shareStruct.extraParams = shareStruct2.extraParams;
                shareStruct.isLongItem = shareStruct2.isLongItem;
                shareStruct.isShareOrignalUrl = shareStruct2.isShareOrignalUrl;
                shareStruct.useShortForm = shareStruct2.useShortForm;
                shareStruct.isUrlShareWithLocalThumbPath = shareStruct2.isUrlShareWithLocalThumbPath;
                shareStruct.wxAppId = shareStruct2.wxAppId;
            }
            shareStruct.url = this.L;
            return shareStruct;
        }
    }

    public void addShareViewInTop(View view) {
        this.m = view;
    }

    public void setPanelTitle(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f64561d, false, 73394, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f64561d, false, 73394, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f64562a.setText(str2);
    }

    public void a(final com.douyin.baseshare.a aVar) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64561d, false, 73389, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64561d, false, 73389, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
            return;
        }
        ca.a(aVar);
        if (aVar.a()) {
            if (this.mShareStruct != null && "weibo".equals(aVar.d())) {
                String str = this.mShareStruct.description;
                this.mShareStruct.description = this.mShareStruct.title;
                this.mShareStruct.title = str;
            }
            if (this.mActionHandler != null) {
                if (this.j != null && TextUtils.equals(aVar.d(), "chat_merge")) {
                    this.j.a(this.mShareStruct);
                }
                z2 = this.mActionHandler.onAction(this.mShareStruct, aVar.d());
            }
            if (!z2) {
                if (this.I) {
                    aVar.b(this.mShareStruct);
                    IShareService.ShareResult shareResult = new IShareService.ShareResult();
                    shareResult.type = aVar.d();
                    onShareComplete(shareResult);
                } else {
                    onShareComplete(aVar.a(this.mShareStruct));
                }
            }
            dismiss();
        } else if (q.a(aVar.d())) {
            ca.a(this.h, this.mShareStruct, new com.ss.android.ugc.aweme.base.a<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64572a;

                public final /* synthetic */ void run(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.isSupport(new Object[]{bool}, this, f64572a, false, 73404, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, f64572a, false, 73404, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    IShareService.ShareResult shareResult = new IShareService.ShareResult();
                    shareResult.success = bool.booleanValue();
                    shareResult.type = aVar.d();
                    SimpleShareDialog.this.onShareComplete(shareResult);
                    SimpleShareDialog.this.mActionHandler.onAction(SimpleShareDialog.this.mShareStruct, aVar.d());
                }
            });
            dismiss();
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.h, aVar.c(), 0).a();
        }
    }

    public void onClick(View view) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64561d, false, 73395, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64561d, false, 73395, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!a.a(view)) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64561d, false, 73399, new Class[]{View.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f64561d, false, 73399, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            } else if (!TimeLockRuler.isTeenModeON() || !(view.getId() == C0906R.id.bc5 || view.getId() == C0906R.id.c9n)) {
                z2 = false;
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(d.a(), (int) C0906R.string.cij).a();
                z2 = true;
            }
            if (!z2) {
                if (view.getId() == C0906R.id.q2) {
                    dismiss();
                } else if (view.getId() == C0906R.id.cdl) {
                    if (!NetworkUtils.isNetworkAvailable(this.h)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this.h, (int) C0906R.string.bgf).a();
                    } else if (this.mShareStruct != null && this.mActionHandler != null) {
                        onShareComplete(this.n.share(this.h, this.mShareStruct, "report"));
                        this.mActionHandler.onAction(this.mShareStruct, "report");
                        dismiss();
                    }
                } else if (view.getId() == C0906R.id.cr) {
                    if (this.N != null) {
                        Aweme a2 = j.a().a(this.N.f64984a);
                        if (a2 != null) {
                            com.ss.android.ugc.aweme.report.a.a((Map<String, String>) t.a(a2, "homepage_hot"));
                            com.ss.android.ugc.aweme.report.a.a(this.h, t.a(a2, "landing_page", "ad"));
                        }
                    }
                } else if (view.getId() == C0906R.id.al7) {
                    if (!NetworkUtils.isNetworkAvailable(this.h)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this.h, (int) C0906R.string.bgf).a();
                    } else if (this.J != null) {
                        g.a(getContext(), this.J.f64982e, this.J.f64983f, this.J.g, (Function0<Unit>) new cp<Unit>(this));
                    }
                } else if (view.getId() == C0906R.id.bc5) {
                    if (this.mShareStruct != null && this.mActionHandler != null) {
                        onShareComplete(this.n.share(this.h, this.mShareStruct, "copy"));
                        this.mActionHandler.onAction(this.mShareStruct, "copy");
                        dismiss();
                    }
                } else if (view.getId() == C0906R.id.c9n) {
                    if (this.mShareStruct != null && this.mActionHandler != null) {
                        onShareComplete(this.n.share(this.h, this.mShareStruct, "qr_code"));
                        this.mActionHandler.onAction(this.mShareStruct, "qr_code");
                        dismiss();
                    }
                } else if (view.getId() == C0906R.id.cct) {
                    if (this.mActionHandler != null) {
                        this.mActionHandler.onAction(this.mShareStruct, "REFRESH");
                        IShareService.ShareResult shareResult = new IShareService.ShareResult();
                        shareResult.success = true;
                        shareResult.eventType = "REFRESH";
                        shareResult.type = "REFRESH";
                        onShareComplete(shareResult);
                        dismiss();
                    }
                } else if (view.getId() == C0906R.id.bv4) {
                    if (this.mActionHandler != null) {
                        this.mActionHandler.onAction(this.mShareStruct, "OPEN_IN_BROWSER");
                        IShareService.ShareResult shareResult2 = new IShareService.ShareResult();
                        shareResult2.success = true;
                        shareResult2.eventType = "OPEN_IN_BROWSER";
                        shareResult2.type = "OPEN_IN_BROWSER";
                        onShareComplete(shareResult2);
                        dismiss();
                    }
                } else if (view.getId() == C0906R.id.c1k) {
                    if (this.mActionHandler != null) {
                        this.mActionHandler.onAction(this.mShareStruct, "TYPE_POI_ENTERPRISE_CLAIM");
                        IShareService.ShareResult shareResult3 = new IShareService.ShareResult();
                        shareResult3.success = true;
                        shareResult3.eventType = "TYPE_POI_ENTERPRISE_CLAIM";
                        shareResult3.type = "TYPE_POI_ENTERPRISE_CLAIM";
                        onShareComplete(shareResult3);
                        dismiss();
                    }
                } else if (view.getId() == C0906R.id.bzx && this.mActionHandler != null) {
                    this.mActionHandler.onAction(this.mShareStruct, "TYPE_POI_CORRECT");
                    IShareService.ShareResult shareResult4 = new IShareService.ShareResult();
                    shareResult4.success = true;
                    shareResult4.eventType = "TYPE_POI_CORRECT";
                    shareResult4.type = "TYPE_POI_CORRECT";
                    onShareComplete(shareResult4);
                    dismiss();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64561d, false, 73383, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64561d, false, 73383, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.kc);
        ButterKnife.bind((Dialog) this);
        if (PatchProxy.isSupport(new Object[0], this, f64561d, false, 73385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64561d, false, 73385, new Class[0], Void.TYPE);
            return;
        }
        this.i = findViewById(C0906R.id.chy);
        int screenHeight = UIUtils.getScreenHeight(getContext()) - UIUtils.getStatusBarHeight(getContext());
        Window window = getWindow();
        if (window != null) {
            if (screenHeight == 0) {
                screenHeight = -1;
            }
            window.setLayout(-1, screenHeight);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            window.findViewById(C0906R.id.a3z).setBackgroundDrawable(new ColorDrawable(0));
            setCanceledOnTouchOutside(true);
        }
        this.C = (DmtTextView) findViewById(C0906R.id.q2);
        this.D = (DmtTextView) findViewById(C0906R.id.cnn);
        this.x = findViewById(C0906R.id.cpg);
        this.y = findViewById(C0906R.id.cmb);
        this.z = findViewById(C0906R.id.b9d);
        this.E = (RemoteImageView) this.z.findViewById(C0906R.id.bo0);
        this.B = this.z.findViewById(C0906R.id.bnz);
        this.F = (DmtEditText) this.z.findViewById(C0906R.id.bo1);
        this.G = (ImageView) this.z.findViewById(C0906R.id.b55);
        this.A = findViewById(C0906R.id.bbl);
        this.k = (LinearLayout) findViewById(C0906R.id.cpf);
        this.l = findViewById(C0906R.id.a5r);
        if (b() || this.M) {
            this.l.setVisibility(8);
            this.y.setVisibility(8);
        }
        this.f64565e = (LinearLayout) findViewById(C0906R.id.cdl);
        this.f64565e.setOnClickListener(this);
        this.f64566f = (LinearLayout) findViewById(C0906R.id.al7);
        this.f64566f.setOnClickListener(this);
        this.g = (LinearLayout) findViewById(C0906R.id.cr);
        this.g.setOnClickListener(this);
        if (this.f64563b) {
            this.f64565e.setVisibility(0);
        }
        if (this.J != null && this.J.f64981d) {
            this.f64566f.setVisibility(0);
        }
        if (this.N != null && this.N.f64985b) {
            this.g.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(C0906R.id.c9r);
        if (this.H) {
            i2 = C0906R.string.bua;
        } else {
            i2 = C0906R.string.bu_;
        }
        textView.setText(i2);
        findViewById(C0906R.id.bc5).setOnClickListener(this);
        findViewById(C0906R.id.c9n).setOnClickListener(this);
        findViewById(C0906R.id.q2).setOnClickListener(this);
        findViewById(C0906R.id.bv4).setOnClickListener(this);
        findViewById(C0906R.id.cct).setOnClickListener(this);
        if (this.o) {
            findViewById(C0906R.id.c9n).setVisibility(8);
        } else if (AbTestManager.a().bh() && (this.mShareStruct == null || !TextUtils.equals(this.mShareStruct.itemType, "web"))) {
            ((TextView) findViewById(C0906R.id.c9r)).setText(C0906R.string.bua);
        }
        if (this.p) {
            findViewById(C0906R.id.cct).setVisibility(0);
        }
        if (this.q) {
            findViewById(C0906R.id.bv4).setVisibility(0);
        }
        if (this.t) {
            findViewById(C0906R.id.c1k).setVisibility(0);
            findViewById(C0906R.id.c1k).setOnClickListener(this);
        }
        if (this.u) {
            findViewById(C0906R.id.bzx).setVisibility(0);
            findViewById(C0906R.id.bzx).setOnClickListener(this);
        }
        View findViewById = findViewById(C0906R.id.bc5);
        if (this.w) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
        com.douyin.baseshare.a[] c2 = c();
        int i4 = 0;
        for (final com.douyin.baseshare.a aVar : c2) {
            if (!this.s || aVar.a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (TextUtils.equals("rocket", aVar.d())) {
                z2 = true;
            }
            if (z2) {
                this.k.addView(cg.a(this.h, aVar, (View.OnClickListener) new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64567a;

                    public final void onClick(View view) {
                        boolean z = true;
                        if (PatchProxy.isSupport(new Object[]{view}, this, f64567a, false, 73401, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f64567a, false, 73401, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (!a.a(view) && !TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cij)) {
                            SimpleShareDialog simpleShareDialog = SimpleShareDialog.this;
                            String d2 = aVar.d();
                            if (PatchProxy.isSupport(new Object[]{d2}, simpleShareDialog, SimpleShareDialog.f64561d, false, 73393, new Class[]{String.class}, Boolean.TYPE)) {
                                SimpleShareDialog simpleShareDialog2 = simpleShareDialog;
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{d2}, simpleShareDialog2, SimpleShareDialog.f64561d, false, 73393, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                            } else if (simpleShareDialog.mActionHandler == null || !simpleShareDialog.mActionHandler.checkStatus(d2)) {
                                z = false;
                            }
                            if (!z) {
                                SimpleShareDialog.this.dismiss();
                            } else {
                                SimpleShareDialog.this.a(aVar);
                            }
                        }
                    }
                }));
                i4++;
            }
        }
        if (i4 == 0) {
            this.r = false;
        }
        if (f() && this.r) {
            if (PatchProxy.isSupport(new Object[]{this}, this, f64561d, false, 73391, new Class[]{IShareService.SharePage.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, this, f64561d, false, 73391, new Class[]{IShareService.SharePage.class}, Void.TYPE);
            } else {
                this.j = b.a(this, this.h, this.mShareStruct, true, false, this);
            }
        }
        this.f64562a = (TextView) findViewById(C0906R.id.cq4);
        this.f64564c = (FrameLayout) findViewById(C0906R.id.d5g);
        if (this.m != null) {
            this.f64564c.addView(this.m);
        }
        if (!this.r) {
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.f64562a.setText(C0906R.string.cg9);
        }
        setOnKeyListener(new DialogInterface.OnKeyListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64570a;

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f64570a, false, 73402, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f64570a, false, 73402, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 4 || SimpleShareDialog.this.j == null) {
                    return false;
                } else {
                    return SimpleShareDialog.this.j.b();
                }
            }
        });
    }

    public SimpleShareDialog(Activity activity, ck ckVar) {
        super(activity, C0906R.style.rc);
        this.h = activity;
        this.f64563b = ckVar.f64974c;
        this.o = ckVar.h;
        this.p = ckVar.k;
        this.q = ckVar.j;
        this.r = ckVar.o;
        this.s = ckVar.l;
        this.t = ckVar.p;
        this.u = ckVar.q;
        this.v = ckVar.s;
        this.w = ckVar.t;
        this.H = ckVar.i;
        this.I = ckVar.u;
        this.K = ckVar.x;
        this.L = ckVar.y;
        this.M = ckVar.r;
        if (ckVar.v != null) {
            this.J = ckVar.v;
        }
        this.N = ckVar.w;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.douyin.baseshare.a[] a(com.douyin.baseshare.a[] r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f64561d
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.douyin.baseshare.a[]> r4 = com.douyin.baseshare.a[].class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<com.douyin.baseshare.a[]> r9 = com.douyin.baseshare.a[].class
            r6 = 0
            r7 = 73392(0x11eb0, float:1.02844E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f64561d
            r15 = 0
            r16 = 73392(0x11eb0, float:1.02844E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.douyin.baseshare.a[]> r1 = com.douyin.baseshare.a[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.douyin.baseshare.a[]> r18 = com.douyin.baseshare.a[].class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.douyin.baseshare.a[] r0 = (com.douyin.baseshare.a[]) r0
            return r0
        L_0x004a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
        L_0x0050:
            if (r10 >= r3) goto L_0x0066
            r4 = r0[r10]
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = r4.d()
            boolean r5 = android.text.TextUtils.equals(r1, r5)
            if (r5 != 0) goto L_0x0063
            r2.add(r4)
        L_0x0063:
            int r10 = r10 + 1
            goto L_0x0050
        L_0x0066:
            int r0 = r2.size()
            com.douyin.baseshare.a[] r0 = new com.douyin.baseshare.a[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            com.douyin.baseshare.a[] r0 = (com.douyin.baseshare.a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.SimpleShareDialog.a(com.douyin.baseshare.a[], java.lang.String):com.douyin.baseshare.a[]");
    }
}
