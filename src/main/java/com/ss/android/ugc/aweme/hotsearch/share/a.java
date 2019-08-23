package com.ss.android.ugc.aweme.hotsearch.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.share.cg;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0006\u0010\u001d\u001a\u00020\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010%\u001a\u00020&H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankImageShareDialog;", "Landroid/app/Dialog;", "context", "Landroid/app/Activity;", "shareChannel", "", "hitRankShareStruct", "Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;)V", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "getHitRankShareStruct", "()Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;", "setHitRankShareStruct", "(Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;)V", "getShareChannel", "()Ljava/lang/String;", "setShareChannel", "(Ljava/lang/String;)V", "captureImageToFile", "", "success", "Lkotlin/Function1;", "Ljava/io/File;", "gotoOtherApp", "shareType", "shareTypeName", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "reportEvent", "setInfluenceText", "influenceValue", "shareImage", "baseShare", "Lcom/douyin/baseshare/BaseShare;", "shareImageWithCheck", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49796a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public Activity f49797b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f49798c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public b f49799d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "call"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.hotsearch.share.a$a  reason: collision with other inner class name */
    static final class C0591a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f49801b;

        C0591a(a aVar) {
            this.f49801b = aVar;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f49800a, false, 49748, new Class[0], File.class)) {
                return (File) PatchProxy.accessDispatch(new Object[0], this, f49800a, false, 49748, new Class[0], File.class);
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.f49801b.findViewById(C0906R.id.yp);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, PushConstants.CONTENT);
            int width = relativeLayout.getWidth();
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f49801b.findViewById(C0906R.id.yp);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, PushConstants.CONTENT);
            Bitmap createBitmap = Bitmap.createBitmap(width, relativeLayout2.getHeight(), Bitmap.Config.RGB_565);
            ((RelativeLayout) this.f49801b.findViewById(C0906R.id.yp)).draw(new Canvas(createBitmap));
            File file = new File(com.ss.android.ugc.aweme.am.a.a(k.a()));
            com.ss.android.ugc.aweme.video.b.a(file);
            String path = file.getPath();
            File file2 = new File(path, "hit_rank_" + System.currentTimeMillis() + ".jpeg");
            if (!com.ss.android.ugc.aweme.tools.e.a(createBitmap, file2, 90, Bitmap.CompressFormat.JPEG)) {
                return null;
            }
            com.ss.android.ugc.aweme.photo.b.a.a(this.f49801b.f49797b, file2.getAbsolutePath());
            return file2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements a.g<File, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49802a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f49803b;

        b(Function1 function1) {
            this.f49803b = function1;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            a.i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f49802a, false, 49749, new Class[]{a.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f49802a, false, 49749, new Class[]{a.i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
                if (iVar.b()) {
                    File file = (File) iVar.e();
                    if (file != null) {
                        this.f49803b.invoke(file);
                        return Unit.INSTANCE;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f49805b;

        c(a aVar) {
            this.f49805b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49804a, false, 49750, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49804a, false, 49750, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f49805b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f49807b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f49808c;

        d(a aVar, String str) {
            this.f49807b = aVar;
            this.f49808c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49806a, false, 49751, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49806a, false, 49751, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            cg.a(com.ss.android.ugc.aweme.feed.share.f.a().a(this.f49808c), (Context) this.f49807b.f49797b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/hotsearch/share/HitRankImageShareDialog$initView$2$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.douyin.baseshare.a f49810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f49811c;

        e(com.douyin.baseshare.a aVar, a aVar2) {
            this.f49810b = aVar;
            this.f49811c = aVar2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49809a, false, 49752, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49809a, false, 49752, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            a aVar = this.f49811c;
            com.douyin.baseshare.a aVar2 = this.f49810b;
            if (PatchProxy.isSupport(new Object[]{aVar2}, aVar, a.f49796a, false, 49740, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
                Object[] objArr = {aVar2};
                a aVar3 = aVar;
                ChangeQuickRedirect changeQuickRedirect = a.f49796a;
                PatchProxy.accessDispatch(objArr, aVar3, changeQuickRedirect, false, 49740, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
            } else if (aVar2.a()) {
                com.ss.android.ugc.aweme.utils.permission.g.a(aVar.f49797b, new h(aVar, aVar2), i.INSTANCE);
            } else {
                com.bytedance.ies.dmt.ui.d.a.c((Context) aVar.f49797b, aVar2.c(), 0).a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f49813b;

        f(a aVar) {
            this.f49813b = aVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49812a, false, 49753, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49812a, false, 49753, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49813b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<File, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.douyin.baseshare.a $baseShare;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, com.douyin.baseshare.a aVar2) {
            super(1);
            this.this$0 = aVar;
            this.$baseShare = aVar2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((File) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull java.io.File r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.io.File> r1 = java.io.File.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 49754(0xc25a, float:6.972E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0038
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 49754(0xc25a, float:6.972E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<java.io.File> r1 = java.io.File.class
                r5[r10] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0038:
                java.lang.String r0 = "file"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                com.douyin.baseshare.a r0 = r7.$baseShare
                boolean r0 = com.ss.android.ugc.aweme.share.cg.a((com.douyin.baseshare.a) r0)
                if (r0 == 0) goto L_0x00f4
                com.ss.android.ugc.aweme.hotsearch.share.a r0 = r7.this$0
                com.douyin.baseshare.a r1 = r7.$baseShare
                java.lang.String r1 = r1.d()
                java.lang.String r2 = "baseShare.shareType"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                com.douyin.baseshare.a r2 = r7.$baseShare
                java.lang.String r2 = r2.f()
                java.lang.String r3 = "baseShare.showText"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                r3 = 2
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r10] = r1
                r11[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.hotsearch.share.a.f49796a
                r14 = 0
                r15 = 49743(0xc24f, float:6.9705E-41)
                java.lang.Class[] r4 = new java.lang.Class[r3]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r10] = r5
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r9] = r5
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r4
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r4 == 0) goto L_0x009e
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r10] = r1
                r11[r9] = r2
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.hotsearch.share.a.f49796a
                r14 = 0
                r15 = 49743(0xc24f, float:6.9705E-41)
                java.lang.Class[] r1 = new java.lang.Class[r3]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r10] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r9] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x0107
            L_0x009e:
                r0.dismiss()
                java.lang.String r3 = "save_local"
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
                r4 = 2131558603(0x7f0d00cb, float:1.8742526E38)
                if (r3 == 0) goto L_0x00b8
                android.app.Activity r0 = r0.f49797b
                android.content.Context r0 = (android.content.Context) r0
                com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r4, (int) r10)
                r0.a()
                goto L_0x0107
            L_0x00b8:
                android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
                android.app.Activity r5 = r0.f49797b
                android.content.Context r5 = (android.content.Context) r5
                r6 = 2131493316(0x7f0c01c4, float:1.8610109E38)
                r3.<init>(r5, r6)
                android.app.AlertDialog$Builder r3 = r3.setTitle(r4)
                r4 = 2131559036(0x7f0d027c, float:1.8743405E38)
                com.ss.android.ugc.aweme.hotsearch.share.a$c r5 = new com.ss.android.ugc.aweme.hotsearch.share.a$c
                r5.<init>(r0)
                android.content.DialogInterface$OnClickListener r5 = (android.content.DialogInterface.OnClickListener) r5
                android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r4, r5)
                android.app.Activity r4 = r0.f49797b
                r5 = 2131562382(0x7f0d0f8e, float:1.8750191E38)
                java.lang.Object[] r6 = new java.lang.Object[r9]
                r6[r10] = r2
                java.lang.String r2 = r4.getString(r5, r6)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                com.ss.android.ugc.aweme.hotsearch.share.a$d r4 = new com.ss.android.ugc.aweme.hotsearch.share.a$d
                r4.<init>(r0, r1)
                android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
                android.app.AlertDialog$Builder r0 = r3.setPositiveButton(r2, r4)
                r0.show()
                goto L_0x0107
            L_0x00f4:
                com.douyin.baseshare.a r0 = r7.$baseShare
                com.ss.android.ugc.aweme.hotsearch.share.a r1 = r7.this$0
                android.app.Activity r1 = r1.f49797b
                android.content.Context r1 = (android.content.Context) r1
                java.lang.String r2 = r19.getPath()
                com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = com.ss.android.ugc.aweme.feed.share.i.a((android.content.Context) r1, (java.lang.String) r2)
                r0.b(r1)
            L_0x0107:
                com.ss.android.ugc.aweme.hotsearch.share.a r0 = r7.this$0
                r0.dismiss()
                com.ss.android.ugc.aweme.hotsearch.share.a r0 = r7.this$0
                com.douyin.baseshare.a r1 = r7.$baseShare
                java.lang.String r1 = r1.d()
                java.lang.String r2 = "baseShare.shareType"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.hotsearch.share.a.f49796a
                r14 = 0
                r15 = 49742(0xc24e, float:6.9703E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x014e
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.hotsearch.share.a.f49796a
                r14 = 0
                r15 = 49742(0xc24e, float:6.9703E-41)
                java.lang.Class[] r1 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r1[r10] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r0
                r16 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01bb
            L_0x014e:
                java.lang.String r0 = "star"
                int r2 = r1.hashCode()
                switch(r2) {
                    case -929929834: goto L_0x018f;
                    case -791575966: goto L_0x0184;
                    case 3616: goto L_0x0179;
                    case 3357525: goto L_0x016e;
                    case 108102557: goto L_0x0163;
                    case 113011944: goto L_0x0158;
                    default: goto L_0x0157;
                }
            L_0x0157:
                goto L_0x019a
            L_0x0158:
                java.lang.String r2 = "weibo"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x019a
                java.lang.String r1 = "weibo"
                goto L_0x019c
            L_0x0163:
                java.lang.String r2 = "qzone"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x019a
                java.lang.String r1 = "qzone"
                goto L_0x019c
            L_0x016e:
                java.lang.String r2 = "more"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x019a
                java.lang.String r1 = "more"
                goto L_0x019c
            L_0x0179:
                java.lang.String r2 = "qq"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x019a
                java.lang.String r1 = "qq"
                goto L_0x019c
            L_0x0184:
                java.lang.String r2 = "weixin"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x019a
                java.lang.String r1 = "weixin"
                goto L_0x019c
            L_0x018f:
                java.lang.String r2 = "weixin_moments"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x019a
                java.lang.String r1 = "WEIXIN_MOMENTS"
                goto L_0x019c
            L_0x019a:
                java.lang.String r1 = ""
            L_0x019c:
                java.lang.String r2 = "hot_search_share"
                com.ss.android.ugc.aweme.app.d.d r3 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r4 = "hot_search_type"
                com.ss.android.ugc.aweme.app.d.d r0 = r3.a((java.lang.String) r4, (java.lang.String) r0)
                java.lang.String r3 = "platform"
                com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r3, (java.lang.String) r1)
                java.lang.String r1 = "share_mode"
                java.lang.String r3 = "normal_share"
                com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r0)
            L_0x01bb:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "eventName"
                java.lang.String r2 = "valentineInvite"
                org.json.JSONObject r0 = r0.put(r1, r2)
                com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hotsearch.share.a.g.invoke(java.io.File):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.douyin.baseshare.a $baseShare;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, com.douyin.baseshare.a aVar2) {
            super(0);
            this.this$0 = aVar;
            this.$baseShare = aVar2;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49755, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49755, new Class[0], Void.TYPE);
                return;
            }
            a aVar = this.this$0;
            com.douyin.baseshare.a aVar2 = this.$baseShare;
            if (PatchProxy.isSupport(new Object[]{aVar2}, aVar, a.f49796a, false, 49741, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
                Object[] objArr = {aVar2};
                a aVar3 = aVar;
                PatchProxy.accessDispatch(objArr, aVar3, a.f49796a, false, 49741, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
                return;
            }
            Function1 gVar = new g(aVar, aVar2);
            if (PatchProxy.isSupport(new Object[]{gVar}, aVar, a.f49796a, false, 49744, new Class[]{Function1.class}, Void.TYPE)) {
                Object[] objArr2 = {gVar};
                a aVar4 = aVar;
                PatchProxy.accessDispatch(objArr2, aVar4, a.f49796a, false, 49744, new Class[]{Function1.class}, Void.TYPE);
                return;
            }
            a.i.a((Callable<TResult>) new C0591a<TResult>(aVar)).a((a.g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(gVar), a.i.f1052b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<Unit> {
        public static final i INSTANCE = new i();
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49796a, false, 49737, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49796a, false, 49737, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.j9);
        setCanceledOnTouchOutside(false);
        if (PatchProxy.isSupport(new Object[0], this, f49796a, false, 49738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49796a, false, 49738, new Class[0], Void.TYPE);
            return;
        }
        ((DmtButton) findViewById(C0906R.id.q3)).setOnClickListener(new f(this));
        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) (AvatarImageView) findViewById(C0906R.id.hl), this.f49799d.f49816c);
        DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.bqn);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "nickName");
        dmtTextView.setText(this.f49799d.f49815b);
        String str = this.f49799d.f49817d;
        if (PatchProxy.isSupport(new Object[]{str}, this, f49796a, false, 49739, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f49796a, false, 49739, new Class[]{String.class}, Void.TYPE);
        } else {
            String string = this.f49797b.getString(C0906R.string.dqk, new Object[]{str});
            CharSequence charSequence = string;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Intrinsics.checkExpressionValueIsNotNull(string, "wholeString");
            int indexOf$default = StringsKt.indexOf$default(charSequence, str, 0, false, 6, (Object) null);
            if (indexOf$default > 0) {
                int length = str.length() + indexOf$default;
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, length, 34);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49797b.getResources().getColor(C0906R.color.anz)), indexOf$default, length, 34);
            }
            DmtTextView dmtTextView2 = (DmtTextView) findViewById(C0906R.id.a3n);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "descInfo");
            dmtTextView2.setText(spannableStringBuilder);
        }
        com.douyin.baseshare.a a2 = cg.a(this.f49797b, this.f49798c);
        if (a2 != null) {
            DmtButton dmtButton = (DmtButton) findViewById(C0906R.id.y1);
            Intrinsics.checkExpressionValueIsNotNull(dmtButton, "confirmBtn");
            dmtButton.setText(this.f49797b.getString(C0906R.string.c7f, new Object[]{a2.f()}));
            ((DmtButton) findViewById(C0906R.id.y1)).setOnClickListener(new e(a2, this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Activity activity, @NotNull String str, @NotNull b bVar) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intrinsics.checkParameterIsNotNull(str, "shareChannel");
        Intrinsics.checkParameterIsNotNull(bVar, "hitRankShareStruct");
        this.f49797b = activity;
        this.f49798c = str;
        this.f49799d = bVar;
    }
}
