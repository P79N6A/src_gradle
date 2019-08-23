package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.sticker.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0014\n\u0002\b\t\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J0\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0007H\u0014J\b\u0010(\u001a\u00020\u0003H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+H\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0014J(\u0010/\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016J\b\u00100\u001a\u00020\u001bH\u0014J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BusinessInteractStickerView;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "type", "", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "videoDataGetter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;", "businessExtraData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/BusinessExtraData;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(ILandroid/content/Context;Landroid/view/View;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVideoDataGetter;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/BusinessExtraData;Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "handler", "Landroid/os/Handler;", "presenter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/BusinessInteractStickerPresenter;", "runnable", "Ljava/lang/Runnable;", "view", "adjustPopWindow", "", "popWindow", "Lcom/ss/android/ugc/aweme/poi/widget/BubblePopupWindow;", "consumeClickEvent", "", "curPts", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "createBubbleView", "getStickerType", "getView", "getViewPoints", "", "", "invalidDebugView", "mobClick", "needConsumeClickEvent", "onClickPop", "onDestroyView", "onPause", "onResume", "updateInteractStickerParams", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {
    public static ChangeQuickRedirect j;
    View k;
    final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b l;
    public Handler m;
    public Runnable n;
    final f o;
    private final BusinessExtraData p;
    private final Aweme q;

    public final int c() {
        return 2;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 79652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 79652, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        Handler handler = this.m;
        if (handler != null) {
            handler.post(this.n);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 79653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 79653, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79644(0x1371c, float:1.11605E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 79644(0x1371c, float:1.11605E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r0 = "function_prop_click"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r9.p
            r4 = 0
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.getStickerId()
            goto L_0x0038
        L_0x0037:
            r3 = r4
        L_0x0038:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = r3.f71627b
            goto L_0x004a
        L_0x0049:
            r3 = r4
        L_0x004a:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x005b
            java.lang.String r3 = r3.f71630e
            goto L_0x005c
        L_0x005b:
            r3 = r4
        L_0x005c:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x006d
            java.lang.String r3 = r3.f71628c
            goto L_0x006e
        L_0x006d:
            r3 = r4
        L_0x006e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x007f
            java.lang.String r3 = r3.f71629d
            goto L_0x0080
        L_0x007f:
            r3 = r4
        L_0x0080:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r9.p
            if (r3 == 0) goto L_0x008f
            java.lang.String r3 = r3.getSchemaUrl()
            goto L_0x0090
        L_0x008f:
            r3 = r4
        L_0x0090:
            java.lang.String r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r3 = r9.p
            if (r3 == 0) goto L_0x00a2
            java.lang.String r4 = r3.getSchemaUrl()
        L_0x00a2:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.q
            if (r0 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.q
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x00be
            android.content.Context r0 = r9.g
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.q
            com.ss.android.ugc.aweme.commercialize.log.g.U(r0, r1)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.e():void");
    }

    @NotNull
    public final View f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 79645, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 79645, new Class[0], View.class);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        CircleImageView circleImageView = new CircleImageView(this.g);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(this.g, 32.0f), (int) UIUtils.dip2Px(this.g, 32.0f));
        layoutParams2.setMargins(0, 0, (int) UIUtils.dip2Px(this.g, 8.0f), 0);
        circleImageView.setLayoutParams(layoutParams2);
        ((GenericDraweeHierarchy) circleImageView.getHierarchy()).setPlaceholderImage(2130840132);
        ((GenericDraweeHierarchy) circleImageView.getHierarchy()).setFailureImage(2130840132);
        RemoteImageView remoteImageView = circleImageView;
        BusinessExtraData businessExtraData = this.p;
        String str2 = null;
        if (businessExtraData != null) {
            str = businessExtraData.getPopIcon();
        } else {
            str = null;
        }
        c.a(remoteImageView, str);
        DmtTextView dmtTextView = new DmtTextView(this.g);
        dmtTextView.setTextColor(this.g.getResources().getColor(C0906R.color.ao4));
        dmtTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.topMargin = (int) UIUtils.dip2Px(this.g, 1.0f);
        dmtTextView.setLayoutParams(layoutParams3);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        BusinessExtraData businessExtraData2 = this.p;
        if (businessExtraData2 != null) {
            str2 = businessExtraData2.getPopText();
        }
        dmtTextView.setText(str2);
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        dmtTextView.setEllipsize(TextUtils.TruncateAt.END);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.g);
        autoRTLImageView.setImageResource(2130840351);
        linearLayout.addView(circleImageView);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79647(0x1371f, float:1.11609E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 79647(0x1371f, float:1.11609E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r0 = r9.p
            r1 = 0
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.getSchemaUrl()
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008e
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService> r2 = com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = (com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r9.p
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r2.getSchemaUrl()
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            boolean r2 = r0.isAppBrandSchema(r2)
            if (r2 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.miniapp_api.model.b$a r2 = new com.ss.android.ugc.aweme.miniapp_api.model.b$a
            r2.<init>()
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r3.f71627b
            goto L_0x0065
        L_0x0064:
            r3 = r1
        L_0x0065:
            com.ss.android.ugc.aweme.miniapp_api.model.b$a r2 = r2.b(r3)
            com.ss.android.ugc.aweme.miniapp_api.model.b r2 = r2.a()
            android.content.Context r3 = r9.g
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r4 = r9.p
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = r4.getSchemaUrl()
            goto L_0x0079
        L_0x0078:
            r4 = r1
        L_0x0079:
            r0.openMiniApp(r3, r4, r2)
            goto L_0x008e
        L_0x007d:
            com.ss.android.ugc.aweme.ag.h r0 = com.ss.android.ugc.aweme.ag.h.a()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r2 = r9.p
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = r2.getSchemaUrl()
            goto L_0x008b
        L_0x008a:
            r2 = r1
        L_0x008b:
            r0.a((java.lang.String) r2)
        L_0x008e:
            java.lang.String r0 = "function_prop_label_click"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r4 = r9.p
            if (r4 == 0) goto L_0x009f
            java.lang.String r4 = r4.getStickerId()
            goto L_0x00a0
        L_0x009f:
            r4 = r1
        L_0x00a0:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.i
            if (r4 == 0) goto L_0x00b1
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x00b1
            java.lang.String r4 = r4.f71627b
            goto L_0x00b2
        L_0x00b1:
            r4 = r1
        L_0x00b2:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.i
            if (r4 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x00c3
            java.lang.String r4 = r4.f71630e
            goto L_0x00c4
        L_0x00c3:
            r4 = r1
        L_0x00c4:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.i
            if (r4 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = r4.f71628c
            goto L_0x00d6
        L_0x00d5:
            r4 = r1
        L_0x00d6:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.i
            if (r4 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x00e7
            java.lang.String r4 = r4.f71629d
            goto L_0x00e8
        L_0x00e7:
            r4 = r1
        L_0x00e8:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r4 = r9.p
            if (r4 == 0) goto L_0x00f7
            java.lang.String r4 = r4.getSchemaUrl()
            goto L_0x00f8
        L_0x00f7:
            r4 = r1
        L_0x00f8:
            java.lang.String r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a((java.lang.String) r4)
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r4 = r9.p
            if (r4 == 0) goto L_0x010a
            java.lang.String r1 = r4.getSchemaUrl()
        L_0x010a:
            com.ss.android.ugc.aweme.app.d.d r1 = r2.a((java.lang.String) r3, (java.lang.String) r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.q
            if (r0 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.q
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0128
            android.content.Context r0 = r9.g
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.q
            java.lang.String r2 = "sticker"
            com.ss.android.ugc.aweme.commercialize.log.g.c((android.content.Context) r0, (com.ss.android.ugc.aweme.feed.model.Aweme) r1, (java.lang.String) r2)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.g():void");
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.poi.widget.c cVar) {
        com.ss.android.ugc.aweme.poi.widget.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, j, false, 79654, new Class[]{com.ss.android.ugc.aweme.poi.widget.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, j, false, 79654, new Class[]{com.ss.android.ugc.aweme.poi.widget.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "popWindow");
        cVar2.a((int) UIUtils.dip2Px(this.g, 57.9f));
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 79650, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 79650, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i);
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Nullable
    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 79651, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 79651, new Class[]{Integer.TYPE}, View.class);
        } else if (a.a(this.g)) {
            if (this.k == null) {
                this.k = new c(this.g);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.k;
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            return this.k;
        } else {
            if (this.k == null) {
                this.k = new FrameLayout(this.g);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                View view2 = this.k;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams2);
                }
            }
            return this.k;
        }
    }

    public final void a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, j, false, 79646, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, j, false, 79646, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "interactStickerParams");
        super.a(dVar);
        this.l.a(dVar2);
    }

    public final boolean a(long j2, int i, float f2, float f3) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 79648, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return this.l.a(j2, i, f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 79648, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(long j2, int i, float f2, float f3, @NotNull e eVar) {
        long j3 = j2;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, j, false, 79649, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, e.class}, Boolean.TYPE)) {
            Object[] objArr = {new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, j, false, 79649, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, e.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        return this.l.a(j2, i, f2, f3, eVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(int r8, @org.jetbrains.annotations.NotNull android.content.Context r9, @org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r11, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.sticker.d r12, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f r13, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r14, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "contentView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "stickerStruct"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            r7.<init>(r8, r9, r10, r11, r12)
            r7.o = r13
            r7.p = r14
            r7.q = r15
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b
            r3 = r7
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a r3 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a) r3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r6 = r7.p
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.l = r8
            boolean r8 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a((android.content.Context) r9)
            if (r8 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$1 r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b$1
            r8.<init>(r7)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r7.n = r8
            android.os.Handler r8 = new android.os.Handler
            r8.<init>()
            r7.m = r8
            android.os.Handler r8 = r7.m
            if (r8 == 0) goto L_0x0047
            java.lang.Runnable r10 = r7.n
            r8.post(r10)
        L_0x0047:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.q
            if (r8 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.q
            boolean r8 = r8.isAd()
            if (r8 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.q
            com.ss.android.ugc.aweme.commercialize.log.g.T(r9, r8)
        L_0x0058:
            java.lang.String r8 = "function_prop_show"
            com.ss.android.ugc.aweme.app.d.d r9 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r10 = "prop_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r11 = r7.p
            r13 = 0
            if (r11 == 0) goto L_0x006a
            java.lang.String r11 = r11.getStickerId()
            goto L_0x006b
        L_0x006a:
            r11 = r13
        L_0x006b:
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r11)
            java.lang.String r10 = "enter_from"
            if (r12 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.sticker.c r11 = r12.n
            if (r11 == 0) goto L_0x007a
            java.lang.String r11 = r11.f71627b
            goto L_0x007b
        L_0x007a:
            r11 = r13
        L_0x007b:
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r11)
            java.lang.String r10 = "log_pb"
            if (r12 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.sticker.c r11 = r12.n
            if (r11 == 0) goto L_0x008a
            java.lang.String r11 = r11.f71630e
            goto L_0x008b
        L_0x008a:
            r11 = r13
        L_0x008b:
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r11)
            java.lang.String r10 = "author_id"
            if (r12 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.sticker.c r11 = r12.n
            if (r11 == 0) goto L_0x009a
            java.lang.String r11 = r11.f71628c
            goto L_0x009b
        L_0x009a:
            r11 = r13
        L_0x009b:
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r11)
            java.lang.String r10 = "group_id"
            if (r12 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.sticker.c r11 = r12.n
            if (r11 == 0) goto L_0x00aa
            java.lang.String r11 = r11.f71629d
            goto L_0x00ab
        L_0x00aa:
            r11 = r13
        L_0x00ab:
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r11)
            java.lang.String r10 = "enter_method"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r11 = r7.p
            if (r11 == 0) goto L_0x00ba
            java.lang.String r11 = r11.getSchemaUrl()
            goto L_0x00bb
        L_0x00ba:
            r11 = r13
        L_0x00bb:
            java.lang.String r11 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a((java.lang.String) r11)
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r11)
            java.lang.String r10 = "url"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData r11 = r7.p
            if (r11 == 0) goto L_0x00cd
            java.lang.String r13 = r11.getSchemaUrl()
        L_0x00cd:
            com.ss.android.ugc.aweme.app.d.d r9 = r9.a((java.lang.String) r10, (java.lang.String) r13)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r8, (java.util.Map) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.b.<init>(int, android.content.Context, android.view.View, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, com.ss.android.ugc.aweme.sticker.d, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
