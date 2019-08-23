package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.f;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.depend.model.live.e;
import com.bytedance.android.livesdkapi.g.c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p;
import com.bytedance.android.livesdkapi.host.q;
import com.bytedance.ies.dmt.ui.d.a;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity;
import com.ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.ss.android.ugc.aweme.live.activity.GiftAdActivity;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.tools.bb;
import java.util.Map;

public final class d implements IHostApp {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53428a;

    public final void a(FragmentActivity fragmentActivity, String str) {
    }

    public final void a(FragmentActivity fragmentActivity, String str, String str2) {
    }

    public final boolean a(Activity activity, String str) {
        return true;
    }

    public final Typeface b(int i) {
        return null;
    }

    public final void c() {
    }

    public final Class d() {
        return null;
    }

    @NonNull
    public final String f() {
        return "com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService";
    }

    public final void a(View view, String str, Bitmap.Config config) {
        View view2 = view;
        Bitmap.Config config2 = config;
        if (PatchProxy.isSupport(new Object[]{view2, str, config2}, this, f53428a, false, 55740, new Class[]{View.class, String.class, Bitmap.Config.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, str, config2}, this, f53428a, false, 55740, new Class[]{View.class, String.class, Bitmap.Config.class}, Void.TYPE);
            return;
        }
        if (view2 instanceof SimpleDraweeView) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view2;
            ImageRequest imageRequest = null;
            if (str != null && !str.isEmpty()) {
                imageRequest = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setRotationOptions(RotationOptions.autoRotateAtRenderTime()).setImageDecodeOptions(new ImageDecodeOptionsBuilder().setBitmapConfig(config2).setPreDecodeFrameCount(1).build()).build();
            }
            simpleDraweeView.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setAutoPlayAnimations(true)).setImageRequest(imageRequest)).build());
        }
    }

    public d() {
        b.a(IHostApp.class, this);
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f53428a, false, 55736, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53428a, false, 55736, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            return iStickerViewService.isShowStickerView();
        }
        return false;
    }

    public final c e() {
        if (!PatchProxy.isSupport(new Object[0], this, f53428a, false, 55742, new Class[0], c.class)) {
            return new e();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f53428a, false, 55742, new Class[0], c.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53428a, false, 55735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53428a, false, 55735, new Class[0], Void.TYPE);
            return;
        }
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.hideStickerView();
        }
    }

    public final Class a(int i) {
        if (i == 1) {
            return GiftAdActivity.class;
        }
        switch (i) {
            case 5:
                return LiveBroadcastActivity.class;
            case 6:
                return LiveBgBroadcastActivity.class;
            default:
                return null;
        }
    }

    public final com.bytedance.android.livesdkapi.g.d a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f53428a, false, 55741, new Class[]{Context.class}, com.bytedance.android.livesdkapi.g.d.class)) {
            return new i(context2);
        }
        return (com.bytedance.android.livesdkapi.g.d) PatchProxy.accessDispatch(new Object[]{context2}, this, f53428a, false, 55741, new Class[]{Context.class}, com.bytedance.android.livesdkapi.g.d.class);
    }

    public final void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f53428a, false, 55733, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f53428a, false, 55733, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.openWallet(activity2, "page_charge");
        }
    }

    public final void b(Context context, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i)}, this, f53428a, false, 55739, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i)}, this, f53428a, false, 55739, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.c(context, str).a();
    }

    public final void a(Context context, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i)}, this, f53428a, false, 55738, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i)}, this, f53428a, false, 55738, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.c(context, str).a();
    }

    public final void a(Activity activity, String str, String str2, p pVar) {
        Activity activity2 = activity;
        String str3 = str2;
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str, str3, pVar2}, this, f53428a, false, 55732, new Class[]{Activity.class, String.class, String.class, p.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str, str3, pVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f53428a, false, 55732, new Class[]{Activity.class, String.class, String.class, p.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2, pVar2, str3}, null, com.ss.android.ugc.aweme.live.c.d.f53343a, true, 55966, new Class[]{Context.class, p.class, String.class}, Void.TYPE)) {
            Object[] objArr3 = {activity2, pVar2, str3};
            PatchProxy.accessDispatch(objArr3, null, com.ss.android.ugc.aweme.live.c.d.f53343a, true, 55966, new Class[]{Context.class, p.class, String.class}, Void.TYPE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
        builder.setCustomTitle(com.ss.android.ugc.aweme.d.d.a((Context) activity2, (int) C0906R.string.mq)).setNegativeButton(C0906R.string.m2, new DialogInterface.OnClickListener(pVar2) {

            /* renamed from: a */
            public static ChangeQuickRedirect f53348a;

            /* renamed from: b */
            final /* synthetic */ p f53349b;

            public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.live.c.d.2.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.live.c.d.2.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        }).setPositiveButton(C0906R.string.m5, new DialogInterface.OnClickListener(activity2, pVar2, str3) {

            /* renamed from: a */
            public static ChangeQuickRedirect f53344a;

            /* renamed from: b */
            final /* synthetic */ Context f53345b;

            /* renamed from: c */
            final /* synthetic */ p f53346c;

            /* renamed from: d */
            final /* synthetic */ String f53347d;

            public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.live.c.d.1.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.live.c.d.1.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        }).setCancelable(false);
        AlertDialog create = builder.create();
        create.show();
        r.a("phone_bundling_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str3).f34114b);
        create.getButton(-1).setTextColor(activity.getResources().getColor(C0906R.color.ry));
        create.getButton(-2).setTextColor(activity.getResources().getColor(C0906R.color.a6z));
    }

    public final void a(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull q qVar) {
        final q qVar2 = qVar;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, fragmentManager, str, frameLayout, qVar2}, this, f53428a, false, 55734, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, q.class}, Void.TYPE)) {
            Object[] objArr = {appCompatActivity, fragmentManager, str, frameLayout, qVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f53428a, false, 55734, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, q.class}, Void.TYPE);
            return;
        }
        IStickerViewService iStickerViewService = (IStickerViewService) ServiceManager.get().getService(IStickerViewService.class);
        if (iStickerViewService != null) {
            iStickerViewService.showStickerView(appCompatActivity, fragmentManager, str, frameLayout, new IStickerViewService.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53429a;

                public final void a(@NonNull IStickerService.FaceSticker faceSticker) {
                    if (PatchProxy.isSupport(new Object[]{faceSticker}, this, f53429a, false, 55743, new Class[]{IStickerService.FaceSticker.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{faceSticker}, this, f53429a, false, 55743, new Class[]{IStickerService.FaceSticker.class}, Void.TYPE);
                        return;
                    }
                    qVar2.a(c(faceSticker));
                }

                public final void b(@NonNull IStickerService.FaceSticker faceSticker) {
                    if (PatchProxy.isSupport(new Object[]{faceSticker}, this, f53429a, false, 55744, new Class[]{IStickerService.FaceSticker.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{faceSticker}, this, f53429a, false, 55744, new Class[]{IStickerService.FaceSticker.class}, Void.TYPE);
                        return;
                    }
                    qVar2.b(c(faceSticker));
                }

                private f a(bb bbVar) {
                    bb bbVar2 = bbVar;
                    if (PatchProxy.isSupport(new Object[]{bbVar2}, this, f53429a, false, 55746, new Class[]{bb.class}, f.class)) {
                        return (f) PatchProxy.accessDispatch(new Object[]{bbVar2}, this, f53429a, false, 55746, new Class[]{bb.class}, f.class);
                    }
                    f fVar = new f();
                    fVar.f7710b = bbVar2.f74652b;
                    fVar.f7711c = bbVar2.f74653c;
                    return fVar;
                }

                private e c(IStickerService.FaceSticker faceSticker) {
                    if (PatchProxy.isSupport(new Object[]{faceSticker}, this, f53429a, false, 55745, new Class[]{IStickerService.FaceSticker.class}, e.class)) {
                        return (e) PatchProxy.accessDispatch(new Object[]{faceSticker}, this, f53429a, false, 55745, new Class[]{IStickerService.FaceSticker.class}, e.class);
                    }
                    e eVar = new e();
                    if (faceSticker != null) {
                        eVar.f18720a = faceSticker.id;
                        eVar.f18721b = faceSticker.stickerId;
                        eVar.f18722c = faceSticker.name;
                        eVar.f18723d = a(faceSticker.iconUrl);
                        eVar.f18724e = a(faceSticker.fileUrl);
                        eVar.f18725f = faceSticker.hint;
                        eVar.g = faceSticker.types;
                        eVar.h = faceSticker.localPath;
                    }
                    return eVar;
                }
            });
        }
    }
}
