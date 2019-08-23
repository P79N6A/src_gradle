package com.ss.android.ugc.aweme.photo.publish;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.e;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import kotlin.jvm.functions.Function0;

public class PhotoPreviewActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58626a;

    /* renamed from: b  reason: collision with root package name */
    boolean f58627b;
    @BindView(2131493503)
    ImageView mImageView;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58626a, false, 63715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58626a, false, 63715, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58626a, false, 63716, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58626a, false, 63716, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493503})
    public void onClick(@NonNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58626a, false, 63710, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58626a, false, 63710, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ActivityCompat.finishAfterTransition(this);
    }

    /* access modifiers changed from: package-private */
    public void a(PhotoContext photoContext) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        if (PatchProxy.isSupport(new Object[]{photoContext}, this, f58626a, false, 63712, new Class[]{PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext}, this, f58626a, false, 63712, new Class[]{PhotoContext.class}, Void.TYPE);
        } else if (photoContext != null && photoContext.mHeight != 0 && photoContext.mWidth != 0) {
            ImageView imageView = this.mImageView;
            if (fc.a()) {
                layoutParams = fb.a((Context) this, photoContext.mWidth, photoContext.mHeight, 0);
            } else {
                if (PatchProxy.isSupport(new Object[]{photoContext}, this, f58626a, false, 63713, new Class[]{PhotoContext.class}, FrameLayout.LayoutParams.class)) {
                    layoutParams = (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[]{photoContext}, this, f58626a, false, 63713, new Class[]{PhotoContext.class}, FrameLayout.LayoutParams.class);
                } else {
                    int e2 = fc.e(this);
                    int b2 = fc.b(this);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    if (photoContext.mHeight * 9 < photoContext.mWidth * 16 || e2 * 9 < b2 * 16) {
                        layoutParams2.width = b2;
                        layoutParams2.height = (photoContext.mHeight * b2) / photoContext.mWidth;
                        layoutParams2.topMargin = (e2 - layoutParams2.height) / 2;
                        if (layoutParams2.topMargin >= 0) {
                            i = layoutParams2.topMargin;
                        } else {
                            i = 0;
                        }
                        layoutParams2.topMargin = i;
                        layoutParams2.leftMargin = 0;
                    } else {
                        layoutParams2.width = (photoContext.mWidth * e2) / photoContext.mHeight;
                        layoutParams2.height = e2;
                        layoutParams2.leftMargin = (b2 - layoutParams2.width) / 2;
                        layoutParams2.topMargin = 0;
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginStart(layoutParams2.leftMargin);
                    }
                    layoutParams = layoutParams2;
                }
            }
            imageView.setLayoutParams(layoutParams);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58626a, false, 63711, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58626a, false, 63711, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cw);
        PhotoContext photoContext = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        ViewCompat.setTransitionName(this.mImageView, "photo_preview_transition");
        ImageView imageView = this.mImageView;
        Uri tmpPhotoUri = photoContext.getTmpPhotoUri(a.f61119b);
        a aVar = new a(this, photoContext);
        if (PatchProxy.isSupport(new Object[]{imageView, tmpPhotoUri, aVar}, null, e.f58487a, true, 63549, new Class[]{ImageView.class, Uri.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, tmpPhotoUri, aVar}, null, e.f58487a, true, 63549, new Class[]{ImageView.class, Uri.class, Function0.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[]{imageView, tmpPhotoUri, 0, 0, aVar}, null, e.f58487a, true, 63550, new Class[]{ImageView.class, Uri.class, Integer.TYPE, Integer.TYPE, Function0.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{imageView, tmpPhotoUri, 0, 0, aVar}, null, e.f58487a, true, 63550, new Class[]{ImageView.class, Uri.class, Integer.TYPE, Integer.TYPE, Function0.class}, Void.TYPE);
            } else {
                c.a(e.a(tmpPhotoUri), 0, 0, (b<Bitmap>) new b<Bitmap>(imageView, aVar) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f58503a;

                    /* renamed from: b */
                    final /* synthetic */ ImageView f58504b;

                    /* renamed from: c */
                    final /* synthetic */ Function0 f58505c;

                    public final /* synthetic */ void accept(
/*
Method generation error in method: com.ss.android.ugc.aweme.photo.e.4.accept(java.lang.Object):void, dex: classes5.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.photo.e.4.accept(java.lang.Object):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                });
            }
        }
        if (fc.a()) {
            getWindow().clearFlags(1024);
            if (ToolUtils.isFlyme()) {
                StatusBarUtils.setTranslucent(this);
            } else {
                StatusBarUtils.setTransparent(this);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            new cv(this).a(new b(this), new c(this, photoContext));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPreviewActivity", "onCreate", false);
    }
}
