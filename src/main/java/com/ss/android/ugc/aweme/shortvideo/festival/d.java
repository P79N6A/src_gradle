package com.ss.android.ugc.aweme.shortvideo.festival;

import android.animation.AnimatorListenerAdapter;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.ak;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67689a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f67690b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f67691c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f67692d;

    /* renamed from: e  reason: collision with root package name */
    private final int f67693e;

    /* renamed from: f  reason: collision with root package name */
    private final int f67694f;
    private final SpannableString g;
    private final SpannableString h;
    private final TextView i;

    d(ImageView imageView, ViewGroup viewGroup, TextView textView, int i2, int i3, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f67690b = imageView;
        this.f67691c = viewGroup;
        this.f67692d = textView;
        this.f67693e = i2;
        this.f67694f = i3;
        this.g = spannableString;
        this.h = spannableString2;
        this.i = textView2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f67689a, false, 77212, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f67689a, false, 77212, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ImageView imageView = this.f67690b;
        ViewGroup viewGroup = this.f67691c;
        TextView textView = this.f67692d;
        int i2 = this.f67693e;
        int i3 = this.f67694f;
        SpannableString spannableString = this.g;
        SpannableString spannableString2 = this.h;
        TextView textView2 = this.i;
        boolean isSelected = imageView.isSelected();
        ak.a(viewGroup, imageView, textView, i2, i3, isSelected, false, new AnimatorListenerAdapter(isSelected, textView, spannableString) {

            /* renamed from: a */
            public static ChangeQuickRedirect f67677a;

            /* renamed from: b */
            final /* synthetic */ boolean f67678b;

            /* renamed from: c */
            final /* synthetic */ TextView f67679c;

            /* renamed from: d */
            final /* synthetic */ SpannableString f67680d;

            public final void onAnimationEnd(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.festival.a.1.onAnimationEnd(android.animation.Animator):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.festival.a.1.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
        if (isSelected) {
            textView.setText(spannableString2);
        }
        textView2.setText(textView2.getContext().getResources().getString(isSelected ? C0906R.string.afo : C0906R.string.ac0));
        imageView.setSelected(!isSelected);
    }
}
