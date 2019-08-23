package com.bytedance.android.live.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.android.live.uikit.dialog.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class b extends Dialog implements DialogInterface {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8547a;

    /* renamed from: c  reason: collision with root package name */
    public static C0068b f8548c;

    /* renamed from: b  reason: collision with root package name */
    public a f8549b = new a(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8550a;

        /* renamed from: b  reason: collision with root package name */
        public final a.C0067a f8551b;

        /* renamed from: c  reason: collision with root package name */
        private int f8552c;

        public final b b() {
            if (PatchProxy.isSupport(new Object[0], this, f8550a, false, 1813, new Class[0], b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[0], this, f8550a, false, 1813, new Class[0], b.class);
            }
            b a2 = a();
            a2.show();
            return a2;
        }

        public final b a() {
            if (PatchProxy.isSupport(new Object[0], this, f8550a, false, 1812, new Class[0], b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[0], this, f8550a, false, 1812, new Class[0], b.class);
            }
            b bVar = new b(this.f8551b.f8524b, this.f8552c);
            this.f8551b.a(bVar.f8549b);
            bVar.setCancelable(this.f8551b.p);
            if (this.f8551b.p) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f8551b.q);
            bVar.setOnDismissListener(this.f8551b.r);
            if (this.f8551b.s != null) {
                bVar.setOnKeyListener(this.f8551b.s);
            }
            return bVar;
        }

        public a(Context context) {
            this(context, 0);
        }

        public final a a(DialogInterface.OnCancelListener onCancelListener) {
            this.f8551b.q = onCancelListener;
            return this;
        }

        public final a b(CharSequence charSequence) {
            this.f8551b.i = charSequence;
            return this;
        }

        public final a a(CharSequence charSequence) {
            this.f8551b.g = charSequence;
            return this;
        }

        public final a a(boolean z) {
            this.f8551b.p = false;
            return this;
        }

        public final a a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8550a, false, 1803, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8550a, false, 1803, new Class[]{Integer.TYPE}, a.class);
            }
            this.f8551b.g = this.f8551b.f8524b.getText(i);
            return this;
        }

        public final a b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8550a, false, 1804, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8550a, false, 1804, new Class[]{Integer.TYPE}, a.class);
            }
            this.f8551b.i = this.f8551b.f8524b.getText(i);
            return this;
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f8551b.l = charSequence;
            this.f8551b.m = onClickListener;
            return this;
        }

        public a(Context context, int i) {
            this.f8551b = new a.C0067a(new ContextThemeWrapper(context, b.a(context, i)));
            this.f8552c = i;
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f8551b.j = charSequence;
            this.f8551b.k = onClickListener;
            return this;
        }

        public final a a(int i, DialogInterface.OnClickListener onClickListener) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), onClickListener}, this, f8550a, false, 1806, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), onClickListener}, this, f8550a, false, 1806, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, a.class);
            }
            this.f8551b.j = this.f8551b.f8524b.getText(i);
            this.f8551b.k = onClickListener;
            return this;
        }

        public final a b(int i, DialogInterface.OnClickListener onClickListener) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), onClickListener}, this, f8550a, false, 1807, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), onClickListener}, this, f8550a, false, 1807, new Class[]{Integer.TYPE, DialogInterface.OnClickListener.class}, a.class);
            }
            this.f8551b.l = this.f8551b.f8524b.getText(i);
            this.f8551b.m = onClickListener;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.dialog.b$b  reason: collision with other inner class name */
    public interface C0068b {
        boolean a();
    }

    public void setTitle(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f8547a, false, 1791, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f8547a, false, 1791, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        super.setTitle(charSequence);
        this.f8549b.a(charSequence2);
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        View view;
        byte b2;
        boolean z3;
        View view2;
        boolean z4;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8547a, false, 1800, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8547a, false, 1800, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        a aVar = this.f8549b;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f8500a, false, 1759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f8500a, false, 1759, new Class[0], Void.TYPE);
            return;
        }
        aVar.f8503d.requestFeature(1);
        if (aVar.I == 0 || aVar.N != 1) {
            i = aVar.H;
        } else {
            i = aVar.I;
        }
        aVar.f8503d.setContentView(i);
        if (PatchProxy.isSupport(new Object[0], aVar, a.f8500a, false, 1769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f8500a, false, 1769, new Class[0], Void.TYPE);
        } else {
            ViewGroup viewGroup = (ViewGroup) aVar.f8503d.findViewById(C0906R.id.yt);
            if (PatchProxy.isSupport(new Object[]{viewGroup}, aVar, a.f8500a, false, 1771, new Class[]{ViewGroup.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup}, aVar, a.f8500a, false, 1771, new Class[]{ViewGroup.class}, Void.TYPE);
            } else {
                aVar.x = (ScrollView) aVar.f8503d.findViewById(C0906R.id.ck6);
                aVar.x.setFocusable(false);
                aVar.C = (TextView) aVar.f8503d.findViewById(C0906R.id.bmn);
                if (aVar.C != null) {
                    if (aVar.f8505f != null) {
                        aVar.C.setText(aVar.f8505f);
                    } else {
                        aVar.C.setVisibility(8);
                        aVar.x.removeView(aVar.C);
                        if (aVar.g != null) {
                            ViewGroup viewGroup2 = (ViewGroup) aVar.x.getParent();
                            int indexOfChild = viewGroup2.indexOfChild(aVar.x);
                            viewGroup2.removeViewAt(indexOfChild);
                            viewGroup2.addView(aVar.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                        } else {
                            viewGroup.setVisibility(8);
                        }
                    }
                    View findViewById = aVar.f8503d.findViewById(C0906R.id.ck5);
                    View findViewById2 = aVar.f8503d.findViewById(C0906R.id.ck4);
                    if (!(findViewById == null && findViewById2 == null)) {
                        if (aVar.f8505f != null) {
                            aVar.x.post(new Runnable(findViewById, findViewById2) {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f8511a;

                                /* renamed from: b */
                                final /* synthetic */ View f8512b;

                                /* renamed from: c */
                                final /* synthetic */ View f8513c;

                                public final void run(
/*
Method generation error in method: com.bytedance.android.live.uikit.dialog.a.3.run():void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.live.uikit.dialog.a.3.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        } else if (aVar.g != null) {
                            aVar.g.setOnScrollListener(new AbsListView.OnScrollListener(findViewById, findViewById2) {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f8515a;

                                /* renamed from: b */
                                final /* synthetic */ View f8516b;

                                /* renamed from: c */
                                final /* synthetic */ View f8517c;

                                public final void onScrollStateChanged(
/*
Method generation error in method: com.bytedance.android.live.uikit.dialog.a.4.onScrollStateChanged(android.widget.AbsListView, int):void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.live.uikit.dialog.a.4.onScrollStateChanged(android.widget.AbsListView, int):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                public final void onScroll(
/*
Method generation error in method: com.bytedance.android.live.uikit.dialog.a.4.onScroll(android.widget.AbsListView, int, int, int):void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.live.uikit.dialog.a.4.onScroll(android.widget.AbsListView, int, int, int):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            aVar.g.post(new Runnable(findViewById, findViewById2) {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f8519a;

                                /* renamed from: b */
                                final /* synthetic */ View f8520b;

                                /* renamed from: c */
                                final /* synthetic */ View f8521c;

                                public final void run(
/*
Method generation error in method: com.bytedance.android.live.uikit.dialog.a.5.run():void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.live.uikit.dialog.a.5.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        } else {
                            if (findViewById != null) {
                                viewGroup.removeView(findViewById);
                            }
                            if (findViewById2 != null) {
                                viewGroup.removeView(findViewById2);
                            }
                        }
                    }
                }
            }
            if (PatchProxy.isSupport(new Object[0], aVar, a.f8500a, false, 1773, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, a.f8500a, false, 1773, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                aVar.o = (Button) aVar.f8503d.findViewById(C0906R.id.pi);
                aVar.o.setOnClickListener(aVar.P);
                if (TextUtils.isEmpty(aVar.p)) {
                    aVar.o.setVisibility(8);
                    z4 = false;
                } else {
                    aVar.o.setText(aVar.p);
                    aVar.o.setVisibility(0);
                    z4 = true;
                }
                aVar.r = (Button) aVar.f8503d.findViewById(C0906R.id.pj);
                aVar.r.setOnClickListener(aVar.P);
                if (TextUtils.isEmpty(aVar.s)) {
                    aVar.r.setVisibility(8);
                } else {
                    aVar.r.setText(aVar.s);
                    aVar.r.setVisibility(0);
                    z4 |= true;
                }
                aVar.u = (Button) aVar.f8503d.findViewById(C0906R.id.pk);
                aVar.u.setOnClickListener(aVar.P);
                if (TextUtils.isEmpty(aVar.v)) {
                    aVar.u.setVisibility(8);
                } else {
                    aVar.u.setText(aVar.v);
                    aVar.u.setVisibility(0);
                    z4 |= true;
                }
                if (z4) {
                    z = true;
                } else {
                    z = false;
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) aVar.f8503d.findViewById(C0906R.id.d4q);
            if (PatchProxy.isSupport(new Object[]{viewGroup3}, aVar, a.f8500a, false, 1770, new Class[]{ViewGroup.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{viewGroup3}, aVar, a.f8500a, false, 1770, new Class[]{ViewGroup.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (aVar.D != null) {
                    viewGroup3.addView(aVar.D, 0, new ViewGroup.LayoutParams(-1, -2));
                    aVar.f8503d.findViewById(C0906R.id.d3z).setVisibility(8);
                } else {
                    aVar.A = (ImageView) aVar.f8503d.findViewById(C0906R.id.aq8);
                    if (!TextUtils.isEmpty(aVar.f8504e)) {
                        aVar.B = (TextView) aVar.f8503d.findViewById(C0906R.id.e5);
                        aVar.B.setText(aVar.f8504e);
                        if (aVar.y != 0) {
                            aVar.A.setImageResource(aVar.y);
                        } else if (aVar.z != null) {
                            aVar.A.setImageDrawable(aVar.z);
                        } else {
                            aVar.B.setPadding(aVar.A.getPaddingLeft(), aVar.A.getPaddingTop(), aVar.A.getPaddingRight(), aVar.A.getPaddingBottom());
                            aVar.A.setVisibility(8);
                        }
                    } else {
                        aVar.f8503d.findViewById(C0906R.id.d3z).setVisibility(8);
                        aVar.A.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        z2 = false;
                    }
                }
                z2 = true;
            }
            boolean z5 = z2;
            View findViewById3 = aVar.f8503d.findViewById(C0906R.id.pq);
            if (!z) {
                findViewById3.setVisibility(8);
                if (!(aVar.f8505f != null || aVar.g == null || aVar.g.getParent() == null)) {
                    aVar.g.setPadding(aVar.g.getPaddingLeft(), aVar.g.getPaddingTop(), aVar.g.getPaddingRight(), aVar.g.getPaddingTop());
                }
            }
            FrameLayout frameLayout = (FrameLayout) aVar.f8503d.findViewById(C0906R.id.a21);
            if (aVar.h != null) {
                view = aVar.h;
            } else if (aVar.i != 0) {
                view = LayoutInflater.from(aVar.f8501b).inflate(aVar.i, frameLayout, false);
            } else {
                view = null;
            }
            if (view != null) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            if (b2 == 0 || !a.a(view)) {
                aVar.f8503d.setFlags(131072, 131072);
            }
            if (b2 != 0) {
                FrameLayout frameLayout2 = (FrameLayout) aVar.f8503d.findViewById(C0906R.id.a20);
                frameLayout2.addView(view, new ViewGroup.LayoutParams(-1, -1));
                if (aVar.n) {
                    frameLayout2.setPadding(aVar.j, aVar.k, aVar.l, aVar.m);
                }
                if (aVar.g != null) {
                    ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 0.0f;
                }
            } else {
                frameLayout.setVisibility(8);
            }
            if (z5) {
                if (aVar.f8505f == null && view == null && aVar.g == null) {
                    view2 = aVar.f8503d.findViewById(C0906R.id.d3f);
                } else {
                    view2 = aVar.f8503d.findViewById(C0906R.id.d3d);
                }
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            if (viewGroup.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z && z5 && b2 == 0 && !z3) {
                UIUtils.updateLayoutMargin(viewGroup3, -3, -3, -3, (int) UIUtils.dip2Px(aVar.f8501b, 16.0f));
            }
            FrameLayout frameLayout3 = frameLayout;
            View view3 = findViewById3;
            if (PatchProxy.isSupport(new Object[]{null, viewGroup3, viewGroup, frameLayout, findViewById3, Byte.valueOf(z5 ? (byte) 1 : 0), Byte.valueOf(b2), Byte.valueOf(z ? (byte) 1 : 0)}, aVar, a.f8500a, false, 1775, new Class[]{TypedArray.class, View.class, View.class, View.class, View.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null, viewGroup3, viewGroup, frameLayout3, view3, Byte.valueOf(z5), Byte.valueOf(b2), Byte.valueOf(z)}, aVar, a.f8500a, false, 1775, new Class[]{TypedArray.class, View.class, View.class, View.class, View.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            } else {
                ListView listView = aVar.g;
                if (!(listView == null || aVar.F == null)) {
                    listView.setAdapter(aVar.F);
                    int i2 = aVar.G;
                    if (i2 >= 0) {
                        listView.setItemChecked(i2, true);
                        listView.setSelection(i2);
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], aVar, a.f8500a, false, 1768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f8500a, false, 1768, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 20) {
            View decorView = aVar.f8503d.getDecorView();
            View findViewById4 = aVar.f8503d.findViewById(C0906R.id.bwc);
            if (!(findViewById4 == null || decorView == null)) {
                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(findViewById4) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f8508a;

                    /* renamed from: b */
                    final /* synthetic */ View f8509b;

                    public final android.view.WindowInsets onApplyWindowInsets(
/*
Method generation error in method: com.bytedance.android.live.uikit.dialog.a.2.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.live.uikit.dialog.a.2.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                });
                decorView.setFitsSystemWindows(true);
                decorView.requestApplyInsets();
            }
        }
    }

    public b(Context context, int i) {
        super(context, a(context, i));
        if (f8548c == null) {
            throw new IllegalArgumentException("NightMode is NUll");
        }
    }

    static int a(Context context, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f8547a, true, 1789, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f8547a, true, 1789, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i2 == 1) {
            return C0906R.style.hk;
        } else {
            if (i2 == 2) {
                return C0906R.style.hl;
            }
            if (i2 >= 16777216) {
                return i2;
            }
            if (f8548c == null || !f8548c.a()) {
                return C0906R.style.hk;
            }
            return C0906R.style.hl;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, this, f8547a, false, 1801, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, this, f8547a, false, 1801, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a aVar = this.f8549b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, aVar, a.f8500a, false, 1766, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            a aVar2 = aVar;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, aVar2, a.f8500a, false, 1766, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar.x != null && aVar.x.executeKeyEvent(keyEvent2)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, this, f8547a, false, 1802, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, this, f8547a, false, 1802, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        a aVar = this.f8549b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent2}, aVar, a.f8500a, false, 1767, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            a aVar2 = aVar;
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent2}, aVar2, a.f8500a, false, 1767, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar.x != null && aVar.x.executeKeyEvent(keyEvent2)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
