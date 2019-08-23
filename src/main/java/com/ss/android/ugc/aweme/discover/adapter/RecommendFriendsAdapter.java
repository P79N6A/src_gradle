package com.ss.android.ugc.aweme.discover.adapter;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.c;
import com.ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class RecommendFriendsAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41759a;

    /* renamed from: b  reason: collision with root package name */
    public List<User> f41760b;

    /* renamed from: c  reason: collision with root package name */
    public aa<c> f41761c;

    /* renamed from: d  reason: collision with root package name */
    private Context f41762d;

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
    }

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f41759a, false, 35754, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41759a, false, 35754, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f41760b == null) {
            return 20;
        } else {
            return this.f41760b.size();
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41759a, false, 35753, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new RecommendCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zd, viewGroup2, false), this.f41761c);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41759a, false, 35753, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f41759a, false, 35751, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f41759a, false, 35751, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if ((viewHolder2 instanceof RecommendCardViewHolder) && this.f41760b != null) {
            final RecommendCardViewHolder recommendCardViewHolder = (RecommendCardViewHolder) viewHolder2;
            User user = this.f41760b.get(i);
            Context context = this.f41762d;
            if (PatchProxy.isSupport(new Object[]{user, context}, recommendCardViewHolder, RecommendCardViewHolder.f41731a, false, 35732, new Class[]{User.class, Context.class}, Void.TYPE)) {
                RecommendCardViewHolder recommendCardViewHolder2 = recommendCardViewHolder;
                PatchProxy.accessDispatch(new Object[]{user, context}, recommendCardViewHolder2, RecommendCardViewHolder.f41731a, false, 35732, new Class[]{User.class, Context.class}, Void.TYPE);
            } else {
                recommendCardViewHolder.f41734d = context;
                if (user != null) {
                    recommendCardViewHolder.f41733c = user;
                    if (PatchProxy.isSupport(new Object[0], recommendCardViewHolder, RecommendCardViewHolder.f41731a, false, 35733, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], recommendCardViewHolder, RecommendCardViewHolder.f41731a, false, 35733, new Class[0], Void.TYPE);
                    } else if (!recommendCardViewHolder.f41735e) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recommendCardViewHolder.nickNameBg, "alpha", new float[]{1.0f, 0.0f});
                        ofFloat.setDuration(300);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(recommendCardViewHolder.descriptionBg, "alpha", new float[]{1.0f, 0.0f});
                        ofFloat2.setDuration(300);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(ofFloat).with(ofFloat2);
                        animatorSet.start();
                        animatorSet.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f41736a;

                            public final void onAnimationEnd(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder.1.onAnimationEnd(android.animation.Animator):void, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder.1.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
                    if (PatchProxy.isSupport(new Object[0], recommendCardViewHolder, RecommendCardViewHolder.f41731a, false, 35734, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], recommendCardViewHolder, RecommendCardViewHolder.f41731a, false, 35734, new Class[0], Void.TYPE);
                    } else if (recommendCardViewHolder.f41735e) {
                        recommendCardViewHolder.a(recommendCardViewHolder.f41733c);
                    } else {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(recommendCardViewHolder.txtNickName, "alpha", new float[]{recommendCardViewHolder.txtNickName.getAlpha(), 1.0f});
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(recommendCardViewHolder.ivFollow, "alpha", new float[]{recommendCardViewHolder.ivFollow.getAlpha(), 1.0f});
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(recommendCardViewHolder.txtDescription, "alpha", new float[]{recommendCardViewHolder.txtDescription.getAlpha(), 1.0f});
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(ofFloat3).with(ofFloat5).with(ofFloat4);
                        animatorSet2.start();
                        animatorSet2.setDuration(300);
                        animatorSet2.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f41738a;

                            public final void onAnimationEnd(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder.2.onAnimationEnd(android.animation.Animator):void, dex: classes4.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.RecommendCardViewHolder.2.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
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
                    r.onEvent(MobClick.obtain().setEventName("show_user").setLabelName("discovery_recommend").setValue(recommendCardViewHolder.f41733c.getUid()));
                }
            }
            if (PatchProxy.isSupport(new Object[]{recommendCardViewHolder, Integer.valueOf(i)}, this, f41759a, false, 35752, new Class[]{RecommendCardViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendCardViewHolder, Integer.valueOf(i)}, this, f41759a, false, 35752, new Class[]{RecommendCardViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            recommendCardViewHolder.closeContainer.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41763a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f41763a, false, 35758, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f41763a, false, 35758, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (RecommendFriendsAdapter.this.f41760b != null && !RecommendFriendsAdapter.this.f41760b.isEmpty()) {
                        int adapterPosition = recommendCardViewHolder.getAdapterPosition();
                        if (adapterPosition != -1) {
                            User user = RecommendFriendsAdapter.this.f41760b.get(adapterPosition);
                            if (user != null) {
                                RecommendFriendsAdapter recommendFriendsAdapter = RecommendFriendsAdapter.this;
                                String uid = user.getUid();
                                if (PatchProxy.isSupport(new Object[]{uid}, recommendFriendsAdapter, RecommendFriendsAdapter.f41759a, false, 35756, new Class[]{String.class}, Void.TYPE)) {
                                    RecommendFriendsAdapter recommendFriendsAdapter2 = recommendFriendsAdapter;
                                    PatchProxy.accessDispatch(new Object[]{uid}, recommendFriendsAdapter2, RecommendFriendsAdapter.f41759a, false, 35756, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    a.a(new Runnable(uid) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f41766a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ String f41767b;

                                        public final void run() {
                                            if (PatchProxy.isSupport(new Object[0], this, f41766a, false, 35759, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f41766a, false, 35759, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            try {
                                                DiscoverApi.a(this.f41767b);
                                            } catch (Exception unused) {
                                            }
                                        }

                                        {
                                            this.f41767b = r2;
                                        }
                                    });
                                }
                                r.onEvent(MobClick.obtain().setEventName("close_recommend").setLabelName("discovery_recommend").setValue(user.getUid()));
                            }
                            RecommendFriendsAdapter.this.f41760b.remove(adapterPosition);
                            RecommendFriendsAdapter.this.notifyItemRemoved(adapterPosition);
                            if (RecommendFriendsAdapter.this.f41760b.isEmpty()) {
                                RecommendFriendsAdapter.this.f41761c.a(new c("", "empty"));
                            }
                        }
                    }
                }
            });
        }
    }
}
