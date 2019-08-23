package com.ss.android.ugc.aweme.web.upload;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter;
import java.util.ArrayList;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76896a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseAdapter f76897b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageChooseAdapter.ViewHolder f76898c;

    /* renamed from: d  reason: collision with root package name */
    private final a f76899d;

    b(ImageChooseAdapter imageChooseAdapter, ImageChooseAdapter.ViewHolder viewHolder, a aVar) {
        this.f76897b = imageChooseAdapter;
        this.f76898c = viewHolder;
        this.f76899d = aVar;
    }

    public final void onClick(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f76896a, false, 90099, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76896a, false, 90099, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ImageChooseAdapter imageChooseAdapter = this.f76897b;
        ImageChooseAdapter.ViewHolder viewHolder = this.f76898c;
        a aVar = this.f76899d;
        if (!imageChooseAdapter.h) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(adapterPosition), aVar}, imageChooseAdapter, ImageChooseAdapter.f76864a, false, 90095, new Class[]{ImageChooseAdapter.ViewHolder.class, Integer.TYPE, a.class}, Void.TYPE)) {
                Object[] objArr = {viewHolder, Integer.valueOf(adapterPosition), aVar};
                ChangeQuickRedirect changeQuickRedirect = ImageChooseAdapter.f76864a;
                ImageChooseAdapter imageChooseAdapter2 = imageChooseAdapter;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, imageChooseAdapter2, changeQuickRedirect2, false, 90095, new Class[]{ImageChooseAdapter.ViewHolder.class, Integer.TYPE, a.class}, Void.TYPE);
            } else if (adapterPosition >= 0 && adapterPosition < imageChooseAdapter.f76867d.size()) {
                int indexOf = imageChooseAdapter.f76868e.indexOf(Integer.valueOf(adapterPosition));
                if (indexOf >= 0) {
                    imageChooseAdapter.f76867d.set(adapterPosition, -1);
                    viewHolder.a();
                    viewHolder.f76882e.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(viewHolder, adapterPosition) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f76870a;

                        /* renamed from: b */
                        final /* synthetic */ ViewHolder f76871b;

                        /* renamed from: c */
                        final /* synthetic */ int f76872c;

                        public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter.1.run():void, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter.1.run():void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    viewHolder.f76879b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                    if (imageChooseAdapter.f76869f != null) {
                        imageChooseAdapter.f76869f.remove(indexOf);
                    }
                    imageChooseAdapter.f76868e.remove(Integer.valueOf(adapterPosition));
                    int size = imageChooseAdapter.f76868e.size();
                    while (indexOf < size) {
                        int intValue = imageChooseAdapter.f76868e.get(indexOf).intValue();
                        if (intValue >= 0 && intValue < imageChooseAdapter.f76867d.size()) {
                            imageChooseAdapter.f76867d.set(intValue, Integer.valueOf(indexOf));
                        }
                        if (size != imageChooseAdapter.g - 1) {
                            imageChooseAdapter.notifyItemChanged(intValue);
                        }
                        indexOf++;
                    }
                    if (size == imageChooseAdapter.g - 1) {
                        imageChooseAdapter.notifyDataSetChanged();
                    }
                    if (imageChooseAdapter.j != null) {
                        imageChooseAdapter.j.a(imageChooseAdapter.f76869f);
                    }
                } else if (imageChooseAdapter.f76868e.size() >= imageChooseAdapter.g) {
                    com.bytedance.ies.dmt.ui.d.a.b(imageChooseAdapter.f76865b, imageChooseAdapter.f76865b.getString(C0906R.string.t4, new Object[]{Integer.valueOf(imageChooseAdapter.g)})).a();
                } else {
                    if (PatchProxy.isSupport(new Object[]{aVar}, null, ImageChooseAdapter.f76864a, true, 90096, new Class[]{a.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, null, ImageChooseAdapter.f76864a, true, 90096, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
                    } else if (((float) aVar.l) > ((float) aVar.m) * 2.2f || ((float) aVar.m) > ((float) aVar.l) * 2.2f) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) com.ss.android.ugc.aweme.framework.e.a.a(), (int) C0906R.string.c6q).a();
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (imageChooseAdapter.f76869f == null) {
                            imageChooseAdapter.f76869f = new ArrayList();
                        }
                        imageChooseAdapter.f76869f.add(aVar.f56315e);
                        imageChooseAdapter.f76868e.add(Integer.valueOf(adapterPosition));
                        viewHolder.a(imageChooseAdapter.f76868e.size() - 1);
                        int size2 = imageChooseAdapter.f76868e.size();
                        imageChooseAdapter.f76867d.set(adapterPosition, Integer.valueOf(size2 - 1));
                        viewHolder.f76879b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable(size2, adapterPosition) {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f76874a;

                            /* renamed from: b */
                            final /* synthetic */ int f76875b;

                            /* renamed from: c */
                            final /* synthetic */ int f76876c;

                            public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter.2.run():void, dex: classes6.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter.2.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                        viewHolder.f76882e.setAlpha(0.0f);
                        viewHolder.f76882e.setVisibility(0);
                        viewHolder.f76882e.animate().alpha(1.0f).setDuration(300).start();
                    }
                }
            }
        }
    }
}
