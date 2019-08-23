package com.ss.android.ugc.aweme.discover.delegate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commerce.service.models.i;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.w;
import com.ss.android.ugc.aweme.discover.base.b;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.discover.model.RankingListCover;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.music.model.BrandBillboard;
import com.ss.android.ugc.aweme.music.model.BrandCategory;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public final class g extends a<List<DiscoverItemData>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42278a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42279b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f42280c;

    public g() {
    }

    public g(@Nullable Fragment fragment) {
        this.f42280c = fragment;
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f42278a, false, 36208, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f42278a, false, 36208, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        } else if (this.f42279b) {
            return new RankingListCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.za, viewGroup, false), true, this.f42280c);
        } else {
            return new RankingListCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.z_, viewGroup, false), false);
        }
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f42278a, false, 36210, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f42278a, false, 36210, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.b(viewHolder);
        RankingListCoverViewHolder rankingListCoverViewHolder = (RankingListCoverViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[0], rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35711, new Class[0], Void.TYPE);
            return;
        }
        if (rankingListCoverViewHolder.s != null) {
            rankingListCoverViewHolder.s.cancel();
            rankingListCoverViewHolder.s = null;
        }
        if (rankingListCoverViewHolder.r != null) {
            rankingListCoverViewHolder.r.cancel();
            rankingListCoverViewHolder.r = null;
        }
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f42278a, false, 36207, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f42278a, false, 36207, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (((DiscoverItemData) list.get(i)).getType() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42278a, false, 36209, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f42278a, false, 36209, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        RankingListCoverViewHolder rankingListCoverViewHolder = (RankingListCoverViewHolder) viewHolder;
        RankingListCover rankingListCover = ((DiscoverItemData) list2.get(i)).getRankingListCover();
        if (PatchProxy.isSupport(new Object[]{rankingListCover}, rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35710, new Class[]{RankingListCover.class}, Void.TYPE)) {
            RankingListCoverViewHolder rankingListCoverViewHolder2 = rankingListCoverViewHolder;
            PatchProxy.accessDispatch(new Object[]{rankingListCover}, rankingListCoverViewHolder2, RankingListCoverViewHolder.f41702a, false, 35710, new Class[]{RankingListCover.class}, Void.TYPE);
        } else if (rankingListCover != null && rankingListCover != rankingListCoverViewHolder.x) {
            rankingListCoverViewHolder.x = rankingListCover;
            User topStar = rankingListCover.getTopStar();
            if (PatchProxy.isSupport(new Object[]{topStar}, rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35712, new Class[]{User.class}, Void.TYPE)) {
                RankingListCoverViewHolder rankingListCoverViewHolder3 = rankingListCoverViewHolder;
                PatchProxy.accessDispatch(new Object[]{topStar}, rankingListCoverViewHolder3, RankingListCoverViewHolder.f41702a, false, 35712, new Class[]{User.class}, Void.TYPE);
            } else if (topStar == null) {
                rankingListCoverViewHolder.mStarContainer.setVisibility(8);
            } else {
                b.a(rankingListCoverViewHolder.mStarHeaderView, topStar.getAvatarThumb());
                rankingListCoverViewHolder.mStarName.setText(topStar.getNickname());
            }
            Music topMusic = rankingListCover.getTopMusic();
            if (PatchProxy.isSupport(new Object[]{topMusic}, rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35713, new Class[]{Music.class}, Void.TYPE)) {
                RankingListCoverViewHolder rankingListCoverViewHolder4 = rankingListCoverViewHolder;
                PatchProxy.accessDispatch(new Object[]{topMusic}, rankingListCoverViewHolder4, RankingListCoverViewHolder.f41702a, false, 35713, new Class[]{Music.class}, Void.TYPE);
            } else if (topMusic != null) {
                b.a(rankingListCoverViewHolder.mMusicHeaderView, topMusic.getCoverThumb());
                rankingListCoverViewHolder.mMusicName.setText(topMusic.getMusicName());
            }
            if (rankingListCoverViewHolder.q) {
                rankingListCoverViewHolder.w = new w(rankingListCoverViewHolder);
                i topGoods = rankingListCover.getTopGoods();
                if (PatchProxy.isSupport(new Object[]{topGoods}, rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35714, new Class[]{i.class}, Void.TYPE)) {
                    RankingListCoverViewHolder rankingListCoverViewHolder5 = rankingListCoverViewHolder;
                    PatchProxy.accessDispatch(new Object[]{topGoods}, rankingListCoverViewHolder5, RankingListCoverViewHolder.f41702a, false, 35714, new Class[]{i.class}, Void.TYPE);
                } else if (topGoods == null) {
                    rankingListCoverViewHolder.f41704c.setVisibility(8);
                } else {
                    rankingListCoverViewHolder.f41704c.setVisibility(0);
                    rankingListCoverViewHolder.f41703b.setOnScrollListener(rankingListCoverViewHolder.w);
                    b.a(rankingListCoverViewHolder.g, topGoods.getPromotionImage());
                    rankingListCoverViewHolder.f41705d.setText(topGoods.getTitle());
                    rankingListCoverViewHolder.f41707f.setText(topGoods.getPromotionTitle());
                    rankingListCoverViewHolder.f41706e.setText(topGoods.getCategory());
                    rankingListCoverViewHolder.f41704c.setOnTouchListener(new ai(topGoods) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f41713a;

                        /* renamed from: b */
                        final /* synthetic */ i f41714b;

                        public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.3.b(android.view.View, android.view.MotionEvent):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.3.b(android.view.View, android.view.MotionEvent):void, class status: UNLOADED
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
                    });
                }
                BrandBillboard topBrand = rankingListCover.getTopBrand();
                if (PatchProxy.isSupport(new Object[]{topBrand}, rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35715, new Class[]{BrandBillboard.class}, Void.TYPE)) {
                    RankingListCoverViewHolder rankingListCoverViewHolder6 = rankingListCoverViewHolder;
                    PatchProxy.accessDispatch(new Object[]{topBrand}, rankingListCoverViewHolder6, RankingListCoverViewHolder.f41702a, false, 35715, new Class[]{BrandBillboard.class}, Void.TYPE);
                } else if (topBrand == null) {
                    rankingListCoverViewHolder.l.setVisibility(8);
                } else {
                    rankingListCoverViewHolder.l.setVisibility(0);
                    rankingListCoverViewHolder.f41703b.setOnScrollListener(rankingListCoverViewHolder.w);
                    if (rankingListCoverViewHolder.r == null && rankingListCoverViewHolder.s == null) {
                        List categoryList = topBrand.getCategoryList();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (rankingListCoverViewHolder.a(categoryList, arrayList, arrayList2, 0, 0, 0)) {
                            if (PatchProxy.isSupport(new Object[]{categoryList, arrayList, arrayList2, 0}, rankingListCoverViewHolder, RankingListCoverViewHolder.f41702a, false, 35717, new Class[]{List.class, List.class, List.class, Integer.TYPE}, Void.TYPE)) {
                                RankingListCoverViewHolder rankingListCoverViewHolder7 = rankingListCoverViewHolder;
                                PatchProxy.accessDispatch(new Object[]{categoryList, arrayList, arrayList2, 0}, rankingListCoverViewHolder7, RankingListCoverViewHolder.f41702a, false, 35717, new Class[]{List.class, List.class, List.class, Integer.TYPE}, Void.TYPE);
                            } else {
                                rankingListCoverViewHolder.r = ObjectAnimator.ofFloat(rankingListCoverViewHolder.m, "alpha", new float[]{1.0f, 1.0f});
                                rankingListCoverViewHolder.r.setDuration(2000);
                                rankingListCoverViewHolder.r.setInterpolator(new LinearInterpolator());
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rankingListCoverViewHolder.m, "alpha", new float[]{1.0f, 0.0f});
                                ofFloat.setDuration(180);
                                ofFloat.setStartDelay(2000);
                                ofFloat.setInterpolator(new LinearInterpolator());
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rankingListCoverViewHolder.m, "alpha", new float[]{0.0f, 1.0f});
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rankingListCoverViewHolder.m, "translationY", new float[]{(float) u.a(8.0d), 0.0f});
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat3});
                                animatorSet.setDuration(250);
                                animatorSet.setInterpolator(new LinearInterpolator());
                                rankingListCoverViewHolder.s = new AnimatorSet();
                                rankingListCoverViewHolder.s.playSequentially(new Animator[]{animatorSet, ofFloat});
                                rankingListCoverViewHolder.t = ((BrandCategory) categoryList.get(0)).getId();
                                rankingListCoverViewHolder.s.addListener(new AnimatorListenerAdapter(arrayList, arrayList2, categoryList) {

                                    /* renamed from: a */
                                    public static ChangeQuickRedirect f41720a;

                                    /* renamed from: b */
                                    int f41721b;

                                    /* renamed from: c */
                                    final /* synthetic */ List f41722c;

                                    /* renamed from: d */
                                    final /* synthetic */ List f41723d;

                                    /* renamed from: e */
                                    final /* synthetic */ List f41724e;
                                    private boolean g;

                                    public final void onAnimationCancel(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.5.onAnimationCancel(android.animation.Animator):void, dex: classes4.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.5.onAnimationCancel(android.animation.Animator):void, class status: UNLOADED
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

                                    public final void onAnimationEnd(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.5.onAnimationEnd(android.animation.Animator):void, dex: classes4.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.5.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.5.onAnimationStart(android.animation.Animator):void, dex: classes4.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.5.onAnimationStart(android.animation.Animator):void, class status: UNLOADED
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
                                });
                                rankingListCoverViewHolder.r.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a */
                                    public static ChangeQuickRedirect f41726a;

                                    /* renamed from: c */
                                    private boolean f41728c;

                                    public final void onAnimationCancel(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.6.onAnimationCancel(android.animation.Animator):void, dex: classes4.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.6.onAnimationCancel(android.animation.Animator):void, class status: UNLOADED
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

                                    public final void onAnimationEnd(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.6.onAnimationEnd(android.animation.Animator):void, dex: classes4.dex
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.6.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
                                });
                                rankingListCoverViewHolder.r.start();
                            }
                            rankingListCoverViewHolder.l.setOnTouchListener(new ai() {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f41718a;

                                public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.4.b(android.view.View, android.view.MotionEvent):void, dex: classes4.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder.4.b(android.view.View, android.view.MotionEvent):void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
                            });
                        }
                    }
                }
            }
        }
    }
}
