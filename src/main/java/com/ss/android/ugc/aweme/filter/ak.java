package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.Observer;
import android.support.v4.content.ContextCompat;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final /* synthetic */ class ak implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47494a;

    /* renamed from: b  reason: collision with root package name */
    private final FilterScrollerModule f47495b;

    ak(FilterScrollerModule filterScrollerModule) {
        this.f47495b = filterScrollerModule;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47494a, false, 44349, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f47494a, false, 44349, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FilterScrollerModule filterScrollerModule = this.f47495b;
        Map map = (Map) obj;
        Set<Map.Entry> entrySet = map.entrySet();
        if (PatchProxy.isSupport(new Object[]{entrySet}, filterScrollerModule, FilterScrollerModule.f3231a, false, 44331, new Class[]{Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{entrySet}, filterScrollerModule, FilterScrollerModule.f3231a, false, 44331, new Class[]{Set.class}, Void.TYPE);
        } else {
            if (filterScrollerModule.f3233c.getTabCount() - (filterScrollerModule.j == null ? 0 : 1) != entrySet.size()) {
                int size = filterScrollerModule.j == null ? entrySet.size() : entrySet.size() + 1;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry key : entrySet) {
                    arrayList.add(((EffectCategoryResponse) key.getKey()).name);
                }
                filterScrollerModule.f3233c.a(size, arrayList);
                filterScrollerModule.f3233c.b();
                filterScrollerModule.h.clear();
                int i = 0;
                for (Map.Entry entry : entrySet) {
                    filterScrollerModule.h.add(entry.getKey());
                    View a2 = f.a(filterScrollerModule.f3235e, i, (EffectCategoryResponse) entry.getKey(), filterScrollerModule.m);
                    TabLayout.e a3 = filterScrollerModule.f3233c.a().a(a2);
                    TabLayout.f fVar = a3.i;
                    if (fVar != null) {
                        fVar.setBackgroundColor(ContextCompat.getColor(filterScrollerModule.f3235e, C0906R.color.a7l));
                    }
                    filterScrollerModule.f3233c.a(a3, false);
                    a2.setOnClickListener(new View.OnClickListener(i, a3) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f47434a;

                        /* renamed from: b */
                        final /* synthetic */ int f47435b;

                        /* renamed from: c */
                        final /* synthetic */ TabLayout.e f47436c;

                        public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.filter.FilterScrollerModule.3.onClick(android.view.View):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.filter.FilterScrollerModule.3.onClick(android.view.View):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
                    i++;
                }
                if (PatchProxy.isSupport(new Object[0], filterScrollerModule, FilterScrollerModule.f3231a, false, 44332, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], filterScrollerModule, FilterScrollerModule.f3231a, false, 44332, new Class[0], Void.TYPE);
                } else if (filterScrollerModule.j != null) {
                    new EffectCategoryResponse().name = filterScrollerModule.j.k.a();
                    View a4 = filterScrollerModule.j.k.a(filterScrollerModule.f3235e);
                    TabLayout.e a5 = filterScrollerModule.f3233c.a().a(a4);
                    ((View) a4.getParent()).setOnClickListener(new aj(filterScrollerModule));
                    filterScrollerModule.f3233c.a(a5);
                }
                if (!entrySet.isEmpty()) {
                    TabLayout.e a6 = filterScrollerModule.f3233c.a(0);
                    if (a6 != null) {
                        filterScrollerModule.f3233c.post(new ah(filterScrollerModule, a6));
                    }
                }
                filterScrollerModule.f3233c.setOnTabClickListener(ai.f47491b);
            }
        }
        List data = filterScrollerModule.g.getData();
        List a7 = f.a(map);
        filterScrollerModule.g.setData(a7);
        filterScrollerModule.a(a7);
        DiffUtil.calculateDiff(new EffectFilterDiff(data, a7), true).dispatchUpdatesTo((RecyclerView.Adapter) filterScrollerModule.g);
        ((SimpleItemAnimator) filterScrollerModule.f3234d.getItemAnimator()).setSupportsChangeAnimations(false);
        if (filterScrollerModule.k != null) {
            filterScrollerModule.g.b(filterScrollerModule.k);
            filterScrollerModule.a(filterScrollerModule.k);
            filterScrollerModule.k = null;
        }
    }
}
