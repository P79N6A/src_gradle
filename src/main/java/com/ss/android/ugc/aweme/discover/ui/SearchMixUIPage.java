package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.h;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.ap;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;

public class SearchMixUIPage extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43011a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f43012b;

    /* renamed from: c  reason: collision with root package name */
    private Context f43013c;

    /* renamed from: d  reason: collision with root package name */
    private SearchResultParam f43014d;

    public SearchMixUIPage(View view) {
        super(view);
        this.f43013c = view.getContext();
        this.f43012b = (ViewGroup) view.findViewById(C0906R.id.b_a);
    }

    public final void a(SearchApiResult searchApiResult, SearchResultParam searchResultParam) {
        SearchMixUserCell searchMixUserCell;
        at atVar;
        aq aqVar;
        au auVar;
        au auVar2;
        aq aqVar2;
        at atVar2;
        SearchMixUserCell searchMixUserCell2;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchApiResult, searchResultParam2}, this, f43011a, false, 38002, new Class[]{SearchApiResult.class, SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchApiResult, searchResultParam2}, this, f43011a, false, 38002, new Class[]{SearchApiResult.class, SearchResultParam.class}, Void.TYPE);
            return;
        }
        this.f43012b.removeAllViews();
        this.f43014d = searchResultParam2;
        SearchMix searchMix = (SearchMix) searchApiResult;
        LayoutInflater from = LayoutInflater.from(this.f43013c);
        View view = null;
        if (!CollectionUtils.isEmpty(searchMix.users)) {
            ViewGroup viewGroup = this.f43012b;
            Context context = this.f43013c;
            if (PatchProxy.isSupport(new Object[]{from, viewGroup, context}, null, SearchMixUserCell.i, true, 38008, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, SearchMixUserCell.class)) {
                searchMixUserCell2 = (SearchMixUserCell) PatchProxy.accessDispatch(new Object[]{from, viewGroup, context}, null, SearchMixUserCell.i, true, 38008, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, SearchMixUserCell.class);
            } else {
                searchMixUserCell2 = new SearchMixUserCell(from.inflate(C0906R.layout.a88, viewGroup, false), context, new ap.a() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f43017a;

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell.2.a():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell.2.a():void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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
                });
            }
            ((LifecycleOwner) this.f43013c).getLifecycle().addObserver(searchMixUserCell2);
            searchMixUserCell2.a(new SearchMixUserData().setUsers(searchMix.users).setHasTopUser(searchMix.hasTopUser), this.f43014d);
            searchMixUserCell = searchMixUserCell2;
        } else {
            searchMixUserCell = null;
        }
        if (!CollectionUtils.isEmpty(searchMix.musicLists)) {
            ViewGroup viewGroup2 = this.f43012b;
            Context context2 = this.f43013c;
            if (PatchProxy.isSupport(new Object[]{from, viewGroup2, context2}, null, at.i, true, 37994, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, at.class)) {
                atVar2 = (at) PatchProxy.accessDispatch(new Object[]{from, viewGroup2, context2}, null, at.i, true, 37994, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, at.class);
            } else {
                atVar2 = new at(from.inflate(C0906R.layout.a85, viewGroup2, false), context2, new ap.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43130a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f43130a, false, 37997, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43130a, false, 37997, new Class[0], Void.TYPE);
                            return;
                        }
                        r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(c.a().a("search_type", "music").b()));
                        bg.a(new h(aw.f43138f));
                    }
                });
            }
            atVar2.a(searchMix.musicLists, this.f43014d);
            atVar = atVar2;
        } else {
            atVar = null;
        }
        if (!CollectionUtils.isEmpty(searchMix.challengeList)) {
            ViewGroup viewGroup3 = this.f43012b;
            Context context3 = this.f43013c;
            if (PatchProxy.isSupport(new Object[]{from, viewGroup3, context3}, null, aq.i, true, 37988, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, aq.class)) {
                aqVar2 = (aq) PatchProxy.accessDispatch(new Object[]{from, viewGroup3, context3}, null, aq.i, true, 37988, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, aq.class);
            } else {
                aqVar2 = new aq(from.inflate(C0906R.layout.a85, viewGroup3, false), context3, new ap.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43129a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f43129a, false, 37989, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43129a, false, 37989, new Class[0], Void.TYPE);
                            return;
                        }
                        r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(c.a().a("search_type", "challenge").b()));
                        bg.a(new h(aw.g));
                    }
                });
            }
            aqVar2.a(searchMix.challengeList, this.f43014d);
            aqVar = aqVar2;
        } else {
            aqVar = null;
        }
        if (!CollectionUtils.isEmpty(searchMix.poiList)) {
            ViewGroup viewGroup4 = this.f43012b;
            Context context4 = this.f43013c;
            if (PatchProxy.isSupport(new Object[]{from, viewGroup4, context4}, null, au.i, true, 37998, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, au.class)) {
                auVar2 = (au) PatchProxy.accessDispatch(new Object[]{from, viewGroup4, context4}, null, au.i, true, 37998, new Class[]{LayoutInflater.class, ViewGroup.class, Context.class}, au.class);
            } else {
                auVar2 = new au(from.inflate(C0906R.layout.a85, viewGroup4, false), context4);
            }
            auVar2.a(searchMix.poiList, this.f43014d);
            auVar = auVar2;
        } else {
            auVar = null;
        }
        if (!CollectionUtils.isEmpty(searchMix.awemeList)) {
            view = from.inflate(C0906R.layout.a86, this.f43012b, false);
        }
        View view2 = view;
        List<String> list = searchMix.modulesList;
        List<String> list2 = list;
        View view3 = view2;
        if (PatchProxy.isSupport(new Object[]{list, searchMixUserCell, atVar, aqVar, auVar, view2}, this, f43011a, false, 38003, new Class[]{List.class, SearchMixUserCell.class, at.class, aq.class, au.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, searchMixUserCell, atVar, aqVar, auVar, view3}, this, f43011a, false, 38003, new Class[]{List.class, SearchMixUserCell.class, at.class, aq.class, au.class, View.class}, Void.TYPE);
            return;
        }
        View view4 = view3;
        if (CollectionUtils.isEmpty(list2)) {
            View view5 = view4;
            if (PatchProxy.isSupport(new Object[]{searchMixUserCell, atVar, aqVar, auVar, view4}, this, f43011a, false, 38004, new Class[]{SearchMixUserCell.class, at.class, aq.class, au.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{searchMixUserCell, atVar, aqVar, auVar, view5}, this, f43011a, false, 38004, new Class[]{SearchMixUserCell.class, at.class, aq.class, au.class, View.class}, Void.TYPE);
            } else {
                if (searchMixUserCell != null) {
                    this.f43012b.addView(searchMixUserCell.b());
                }
                if (auVar != null) {
                    this.f43012b.addView(auVar.b());
                }
                if (atVar != null) {
                    this.f43012b.addView(atVar.b());
                }
                if (aqVar != null) {
                    this.f43012b.addView(aqVar.b());
                }
                if (view5 != null) {
                    this.f43012b.addView(view5);
                }
            }
        } else {
            View view6 = view4;
            for (int i = 0; i < list2.size(); i++) {
                String str = list2.get(i);
                if (AllStoryActivity.f73306b.equals(str) && searchMixUserCell != null) {
                    this.f43012b.addView(searchMixUserCell.b());
                } else if ("music".equals(str) && atVar != null) {
                    this.f43012b.addView(atVar.b());
                } else if ("challenge".equals(str) && aqVar != null) {
                    this.f43012b.addView(aqVar.b());
                } else if ("poi".equals(str) && auVar != null) {
                    this.f43012b.addView(auVar.b());
                } else if ("aweme_video".equals(str) && view6 != null) {
                    if (i == list2.size() - 1) {
                        this.f43012b.addView(view6);
                    }
                }
            }
        }
    }
}
