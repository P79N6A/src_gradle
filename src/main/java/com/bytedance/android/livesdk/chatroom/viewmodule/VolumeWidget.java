package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.view.VolumeControlView;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class VolumeWidget extends LiveRecyclableWidget implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12928a;
    private static final /* synthetic */ a.C0900a g;

    /* renamed from: b  reason: collision with root package name */
    public VolumeControlView f12929b;

    /* renamed from: c  reason: collision with root package name */
    AnimatorSet f12930c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f12931d;

    /* renamed from: e  reason: collision with root package name */
    private AnimatorSet f12932e;

    /* renamed from: f  reason: collision with root package name */
    private VolumeControlView.a f12933f;

    public int getLayoutId() {
        return C0906R.layout.aom;
    }

    public void onUnload() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12928a, false, 7673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12928a, false, 7673, new Class[0], Void.TYPE);
            return;
        }
        this.f12930c = new AnimatorSet();
        this.f12930c.play(this.f12929b.getHideVolumeAnim());
        this.f12930c.start();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12928a, true, 7677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12928a, true, 7677, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("VolumeWidget.java", VolumeWidget.class);
        g = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.VolumeWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 105);
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f12928a, false, 7675, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f12928a, false, 7675, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(g, this, this, view2));
    }

    public void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12928a, false, 7669, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12928a, false, 7669, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12929b = (VolumeControlView) this.containerView.findViewById(C0906R.id.gk);
        this.f12933f = new VolumeControlView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12934a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f12934a, false, 7678, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f12934a, false, 7678, new Class[0], Void.TYPE);
                    return;
                }
                VolumeWidget.this.a();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f12934a, false, 7679, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f12934a, false, 7679, new Class[0], Void.TYPE);
                    return;
                }
                VolumeWidget volumeWidget = VolumeWidget.this;
                if (PatchProxy.isSupport(new Object[0], volumeWidget, VolumeWidget.f12928a, false, 7674, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], volumeWidget, VolumeWidget.f12928a, false, 7674, new Class[0], Void.TYPE);
                    return;
                }
                if (volumeWidget.f12930c != null) {
                    volumeWidget.f12930c.cancel();
                }
                volumeWidget.f12929b.setAlpha(1.0f);
            }
        };
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12928a, false, 7676, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12928a, false, 7676, new Class[]{Object[].class}, Void.TYPE);
        } else if (this.f12929b != null) {
            this.f12929b.setOnAudioControlViewHideListener(this.f12933f);
            a();
            com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.g.a.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<com.bytedance.android.livesdk.g.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12940a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    com.bytedance.android.livesdk.g.a aVar = (com.bytedance.android.livesdk.g.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f12940a, false, 7682, new Class[]{com.bytedance.android.livesdk.g.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f12940a, false, 7682, new Class[]{com.bytedance.android.livesdk.g.a.class}, Void.TYPE);
                        return;
                    }
                    VolumeWidget.this.onEvent(aVar);
                }
            });
        }
    }

    public void onEvent(com.bytedance.android.livesdk.g.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12928a, false, 7670, new Class[]{com.bytedance.android.livesdk.g.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12928a, false, 7670, new Class[]{com.bytedance.android.livesdk.g.a.class}, Void.TYPE);
        } else if (aVar != null && this.f12929b != null && aVar.f14626a == 0 && com.bytedance.android.live.uikit.a.a.a()) {
            switch (aVar.f14627b) {
                case 24:
                    if (!PatchProxy.isSupport(new Object[0], this, f12928a, false, 7672, new Class[0], Void.TYPE)) {
                        this.f12932e = new AnimatorSet();
                        this.f12932e.play(this.f12929b.getShowVolumeAnim());
                        this.f12932e.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f12938a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f12938a, false, 7681, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12938a, false, 7681, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                if (VolumeWidget.this.isViewValid()) {
                                    VolumeControlView volumeControlView = VolumeWidget.this.f12929b;
                                    if (PatchProxy.isSupport(new Object[]{(byte) 0}, volumeControlView, VolumeControlView.f12314a, false, 6522, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                        VolumeControlView volumeControlView2 = volumeControlView;
                                        PatchProxy.accessDispatch(new Object[]{(byte) 0}, volumeControlView2, VolumeControlView.f12314a, false, 6522, new Class[]{Boolean.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    volumeControlView.a();
                                    volumeControlView.k.post(new Runnable() {

                                        /* renamed from: a */
                                        public static ChangeQuickRedirect f12324a;

                                        public final void run(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.view.VolumeControlView.3.run():void, dex: classes2.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.view.VolumeControlView.3.run():void, class status: UNLOADED
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
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        });
                        this.f12932e.start();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f12928a, false, 7672, new Class[0], Void.TYPE);
                        return;
                    }
                case 25:
                    if (PatchProxy.isSupport(new Object[0], this, f12928a, false, 7671, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12928a, false, 7671, new Class[0], Void.TYPE);
                        break;
                    } else {
                        this.f12931d = new AnimatorSet();
                        this.f12931d.play(this.f12929b.getShowVolumeAnim());
                        this.f12931d.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f12936a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f12936a, false, 7680, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12936a, false, 7680, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                if (VolumeWidget.this.f12929b != null) {
                                    VolumeControlView volumeControlView = VolumeWidget.this.f12929b;
                                    if (PatchProxy.isSupport(new Object[]{(byte) 0}, volumeControlView, VolumeControlView.f12314a, false, 6520, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                        VolumeControlView volumeControlView2 = volumeControlView;
                                        PatchProxy.accessDispatch(new Object[]{(byte) 0}, volumeControlView2, VolumeControlView.f12314a, false, 6520, new Class[]{Boolean.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    volumeControlView.a();
                                    volumeControlView.k.post(new Runnable() {

                                        /* renamed from: a */
                                        public static ChangeQuickRedirect f12322a;

                                        public final void run(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.view.VolumeControlView.2.run():void, dex: classes2.dex
                                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.view.VolumeControlView.2.run():void, class status: UNLOADED
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
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        });
                        this.f12931d.start();
                        return;
                    }
            }
        }
    }
}
