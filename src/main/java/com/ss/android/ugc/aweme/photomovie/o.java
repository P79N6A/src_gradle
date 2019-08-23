package com.ss.android.ugc.aweme.photomovie;

import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.ey;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import java.util.Collections;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59019a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59020b;

    o(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59020b = photoMoviePublishFragment;
    }

    public final void onClick(View view) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{view}, this, f59019a, false, 64032, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59019a, false, 64032, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhotoMoviePublishFragment photoMoviePublishFragment = this.f59020b;
        if (!a.x.c()) {
            a.x.a((Fragment) photoMoviePublishFragment, "photo_movie_post_page", "click_post", (Bundle) null, (f.a) null);
        } else if (a.x.b()) {
            com.bytedance.ies.dmt.ui.d.a.c(photoMoviePublishFragment.getContext(), (int) C0906R.string.chy).a();
        } else {
            photoMoviePublishFragment.f58862f.b("publish");
            photoMoviePublishFragment.f();
            photoMoviePublishFragment.f58862f.b();
            photoMoviePublishFragment.f58858b.title = photoMoviePublishFragment.f58862f.c();
            if (photoMoviePublishFragment.f58862f.d() != null) {
                photoMoviePublishFragment.f58858b.structList = photoMoviePublishFragment.f58862f.d();
            }
            PoiAndGoodsPublishModel poiAndGoodsPublishModel = (PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(photoMoviePublishFragment.p, PoiAndGoodsPublishModel.class);
            if (!TextUtils.isEmpty(poiAndGoodsPublishModel.getGoodsDraftId())) {
                photoMoviePublishFragment.f58858b.shopDraftId = poiAndGoodsPublishModel.getGoodsDraftId();
            }
            photoMoviePublishFragment.f58858b.poiId = poiAndGoodsPublishModel.getPoiContext();
            photoMoviePublishFragment.f58858b.latitude = poiAndGoodsPublishModel.getLatitude();
            photoMoviePublishFragment.f58858b.longitude = poiAndGoodsPublishModel.getLongitude();
            photoMoviePublishFragment.f58858b.isPrivate = photoMoviePublishFragment.g.a();
            photoMoviePublishFragment.f58858b.reactDuetSetting = a.L.b(e.a.ReactDuetSettingCurrent);
            PhotoMovieContext photoMovieContext = photoMoviePublishFragment.f58858b;
            if (photoMoviePublishFragment.f58860d.b()) {
                i = 3;
            }
            photoMovieContext.commentSetting = i;
            photoMoviePublishFragment.f58858b.city = a.x.e().h();
            if (photoMoviePublishFragment.f58861e.a() != null) {
                photoMoviePublishFragment.f58858b.challenges = Collections.singletonList(photoMoviePublishFragment.f58861e.f68864b);
            } else {
                photoMoviePublishFragment.f58858b.challenges = null;
            }
            photoMoviePublishFragment.f58858b.mSaveModel = ey.a(photoMoviePublishFragment.f58858b.mSaveModel, photoMoviePublishFragment.l.b());
            if (photoMoviePublishFragment.f58858b.mSaveModel != null) {
                photoMoviePublishFragment.f58858b.mSaveModel.setSaveToAlbum(photoMoviePublishFragment.m.a());
                photoMoviePublishFragment.f58858b.mSaveModel.setSaveToAppPathInsteadOfAlbum(photoMoviePublishFragment.m.f68868c);
                photoMoviePublishFragment.f58858b.mSaveModel.setEnableSilentEnhancement(d.b());
            }
            photoMoviePublishFragment.c();
            if (Build.VERSION.SDK_INT < 18 || a.j.a() || a.j.b()) {
                photoMoviePublishFragment.d();
                return;
            }
            ((ViewGroup) photoMoviePublishFragment.getActivity().getWindow().getDecorView()).getOverlay().add(photoMoviePublishFragment.j);
            float dip2Px = UIUtils.dip2Px(photoMoviePublishFragment.getActivity(), 76.0f) / ((float) photoMoviePublishFragment.j.getMeasuredWidth());
            photoMoviePublishFragment.j.animate().translationY((-photoMoviePublishFragment.j.getY()) + ((float) p.c())).translationX(-UIUtils.dip2Px(photoMoviePublishFragment.getActivity(), 5.0f)).scaleX(dip2Px).scaleY(UIUtils.dip2Px(photoMoviePublishFragment.getActivity(), 96.0f) / ((float) photoMoviePublishFragment.j.getMeasuredHeight())).alpha(0.0f).setDuration(1000).setListener(new AnimatorListenerAdapter() {

                /* renamed from: a */
                public static ChangeQuickRedirect f58864a;

                public final void onAnimationEnd(
/*
Method generation error in method: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishFragment.2.onAnimationEnd(android.animation.Animator):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishFragment.2.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                public final void onAnimationStart(
/*
Method generation error in method: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishFragment.2.onAnimationStart(android.animation.Animator):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.photomovie.PhotoMoviePublishFragment.2.onAnimationStart(android.animation.Animator):void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
            }).start();
        }
    }
}
