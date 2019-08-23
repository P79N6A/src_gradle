package com.ss.android.ugc.aweme.music.adapter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hotsearch.view.h;
import com.ss.android.ugc.aweme.music.OriginMusicViewHolder;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.presenter.g;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OriginMusicAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56242a;

    /* renamed from: b  reason: collision with root package name */
    public g f56243b;

    /* renamed from: c  reason: collision with root package name */
    int f56244c = -1;

    /* renamed from: d  reason: collision with root package name */
    public List<MusicModel> f56245d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f56246e;

    /* renamed from: f  reason: collision with root package name */
    public int f56247f;
    private aa<f> g;
    private RecyclerView h;
    private d i = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56250a;

        public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
            String str;
            MusicModel musicModel2 = musicModel;
            if (PatchProxy.isSupport(new Object[]{viewHolder, view, musicModel2}, this, f56250a, false, 59946, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, view, musicModel2}, this, f56250a, false, 59946, new Class[]{RecyclerView.ViewHolder.class, View.class, MusicModel.class}, Void.TYPE);
            } else if (musicModel2 != null && view != null && view.getContext() != null) {
                if (view.getId() == C0906R.id.cg2) {
                    if (d.a(musicModel2, view.getContext(), true)) {
                        if (!com.ss.android.ugc.aweme.account.d.a().isLogin() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
                            c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) view.getContext()).a());
                            r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
                        } else if (!(OriginMusicAdapter.this.f56243b == null || viewHolder == null)) {
                            OriginMusicAdapter.this.f56243b.a(musicModel2, viewHolder.getLayoutPosition());
                            MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                            com.ss.android.ugc.aweme.app.d.c cVar = new com.ss.android.ugc.aweme.app.d.c();
                            if (TextUtils.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), OriginMusicAdapter.this.f56246e)) {
                                str = "personal_homepage";
                            } else {
                                str = "others_homepage";
                            }
                            r.onEvent(value.setJsonObject(cVar.a("enter_from", str).b()));
                            r.a("shoot", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("shoot_way", "single_song").a("music_id", musicModel.getMusicId()).f34114b);
                        }
                    }
                } else if (view.getId() == C0906R.id.bid) {
                    if (!NetworkUtils.isNetworkAvailable(view.getContext())) {
                        a.b(view.getContext(), (int) C0906R.string.bgf).a();
                    } else if (OriginMusicAdapter.this.f56244c == viewHolder.getAdapterPosition()) {
                        if (OriginMusicAdapter.this.f56243b != null) {
                            OriginMusicAdapter.this.a();
                        }
                    } else if (OriginMusicAdapter.this.f56243b != null) {
                        OriginMusicAdapter.this.a();
                        OriginMusicAdapter.this.f56243b.a(musicModel2);
                        ((OriginMusicViewHolder) viewHolder).b(true);
                        OriginMusicAdapter.this.f56244c = viewHolder.getAdapterPosition();
                    }
                }
            }
        }
    };

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f56242a, false, 59935, new Class[0], Integer.TYPE)) {
            return this.f56245d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f56242a, false, 59935, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56242a, false, 59939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56242a, false, 59939, new Class[0], Void.TYPE);
            return;
        }
        if (this.f56244c != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.h.findViewHolderForAdapterPosition(this.f56244c);
            if (findViewHolderForAdapterPosition instanceof OriginMusicViewHolder) {
                ((OriginMusicViewHolder) findViewHolderForAdapterPosition).b(false);
            }
            this.f56244c = -1;
        }
        this.f56243b.b(null);
    }

    public final void a(List<MusicModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f56242a, false, 59932, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f56242a, false, 59932, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f56245d.clear();
        this.f56245d.addAll(list);
        notifyDataSetChanged();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f56242a, false, 59937, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f56242a, false, 59937, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.h = recyclerView2;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f56242a, false, 59938, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f56242a, false, 59938, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.h = null;
    }

    public int getBasicItemViewType(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f56242a, false, 59936, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return super.getBasicItemViewType(i2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f56242a, false, 59936, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f56242a, false, 59934, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new OriginMusicViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yd, viewGroup, false), this.i, this.g);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f56242a, false, 59934, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z;
        String str;
        String str2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f56242a, false, 59931, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f56242a, false, 59931, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof OriginMusicViewHolder) {
            OriginMusicViewHolder originMusicViewHolder = (OriginMusicViewHolder) viewHolder2;
            MusicModel musicModel = this.f56245d.get(i3);
            if (i3 == this.f56244c) {
                z = true;
            } else {
                z = false;
            }
            if (PatchProxy.isSupport(new Object[]{musicModel, Byte.valueOf(z ? (byte) 1 : 0)}, originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59851, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE)) {
                OriginMusicViewHolder originMusicViewHolder2 = originMusicViewHolder;
                PatchProxy.accessDispatch(new Object[]{musicModel, Byte.valueOf(z)}, originMusicViewHolder2, OriginMusicViewHolder.f56141a, false, 59851, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE);
            } else if (musicModel != null) {
                if (PatchProxy.isSupport(new Object[]{musicModel, Byte.valueOf(z)}, originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59852, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE)) {
                    OriginMusicViewHolder originMusicViewHolder3 = originMusicViewHolder;
                    PatchProxy.accessDispatch(new Object[]{musicModel, Byte.valueOf(z)}, originMusicViewHolder3, OriginMusicViewHolder.f56141a, false, 59852, new Class[]{MusicModel.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                originMusicViewHolder.f56142b = musicModel;
                if (PatchProxy.isSupport(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59854, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59854, new Class[0], Void.TYPE);
                } else {
                    if (!TextUtils.isEmpty(originMusicViewHolder.f56142b.getName())) {
                        str = originMusicViewHolder.f56142b.getName();
                    } else {
                        str = "";
                    }
                    int i4 = 4;
                    if (com.ss.android.g.a.a() || originMusicViewHolder.f56142b.getMusic() == null || originMusicViewHolder.f56142b.getMusic().getBillboardRank() <= 0 || originMusicViewHolder.f56142b.getMusic().getBillboardRank() > 30) {
                        originMusicViewHolder.mTagView.setVisibility(8);
                        originMusicViewHolder.mNameView.setText(str);
                    } else if (AbTestManager.a().ay() || originMusicViewHolder.f56142b.getMusic().getBillboardType() <= 0) {
                        originMusicViewHolder.mTagView.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("T");
                        if (originMusicViewHolder.f56142b.getMusic().getBillboardType() <= 0 || originMusicViewHolder.f56142b.getMusic().getWeeklyBillInfo() == null) {
                            str2 = originMusicViewHolder.mNameView.getResources().getString(C0906R.string.bes);
                        } else {
                            str2 = String.format(originMusicViewHolder.mNameView.getResources().getString(C0906R.string.bet), new Object[]{Integer.valueOf(originMusicViewHolder.f56142b.getMusic().getWeeklyBillInfo().getEditionNo())});
                        }
                        spannableStringBuilder.setSpan(new h(originMusicViewHolder.f56142b.getMusic().getBillboardRank(), str2, 4), 0, "T".length(), 33);
                        spannableStringBuilder.setSpan(new ClickableSpan() {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f56149a;

                            public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.music.OriginMusicViewHolder.2.onClick(android.view.View):void, dex: classes5.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.music.OriginMusicViewHolder.2.onClick(android.view.View):void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                        }, 0, "T".length(), 33);
                        originMusicViewHolder.mTagView.setMovementMethod(LinkMovementMethod.getInstance());
                        originMusicViewHolder.mTagView.setText(spannableStringBuilder);
                        originMusicViewHolder.mNameView.setText(str);
                    }
                    if (originMusicViewHolder.f56142b.getMusic().isOriginMusic()) {
                        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(originMusicViewHolder.itemView.getContext().getResources(), 2130839153);
                        a2.setBounds(0, 0, (int) UIUtils.dip2Px(originMusicViewHolder.itemView.getContext(), 16.0f), (int) UIUtils.dip2Px(originMusicViewHolder.itemView.getContext(), 16.0f));
                        originMusicViewHolder.mNameView.setCompoundDrawables(a2, null, null, null);
                        originMusicViewHolder.mNameView.setCompoundDrawablePadding((int) UIUtils.dip2Px(originMusicViewHolder.itemView.getContext(), 2.0f));
                    } else {
                        originMusicViewHolder.mNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                    originMusicViewHolder.mIvMusicCollect.setOnClickListener(new com.ss.android.ugc.aweme.music.g(originMusicViewHolder));
                    originMusicViewHolder.txtUserCount.setText(originMusicViewHolder.f56144d.getString(C0906R.string.bkr, new Object[]{Integer.valueOf(originMusicViewHolder.f56142b.getUserCount())}));
                    originMusicViewHolder.mDurationView.setText(d.a(originMusicViewHolder.f56142b.getDuration()));
                    TextView textView = originMusicViewHolder.mDurationView;
                    if (originMusicViewHolder.f56142b.getDuration() > 0) {
                        i4 = 0;
                    }
                    textView.setVisibility(i4);
                    if (!TextUtils.isEmpty(originMusicViewHolder.f56142b.getPicPremium())) {
                        com.ss.android.ugc.aweme.base.c.a(originMusicViewHolder.mCoverView, originMusicViewHolder.f56142b.getPicPremium());
                    } else if (!TextUtils.isEmpty(originMusicViewHolder.f56142b.getPicBig())) {
                        com.ss.android.ugc.aweme.base.c.a(originMusicViewHolder.mCoverView, originMusicViewHolder.f56142b.getPicBig());
                    } else {
                        com.ss.android.ugc.aweme.base.c.a(originMusicViewHolder.mCoverView, 2130838872);
                    }
                }
                originMusicViewHolder.a(z);
                if (PatchProxy.isSupport(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59853, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59853, new Class[0], Void.TYPE);
                    return;
                }
                if (originMusicViewHolder.f56142b.getCollectionType() != null) {
                    originMusicViewHolder.f56143c = MusicModel.CollectionType.COLLECTED.equals(originMusicViewHolder.f56142b.getCollectionType());
                }
                originMusicViewHolder.a();
            }
        }
    }

    public OriginMusicAdapter(g gVar, aa<f> aaVar, String str) {
        this.f56243b = gVar;
        this.g = aaVar;
        this.f56246e = str;
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56248a;

            public void onChanged() {
                if (PatchProxy.isSupport(new Object[0], this, f56248a, false, 59940, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56248a, false, 59940, new Class[0], Void.TYPE);
                    return;
                }
                OriginMusicAdapter.this.f56247f = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.a();
            }

            public void onItemRangeChanged(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56248a, false, 59941, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56248a, false, 59941, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                OriginMusicAdapter.this.f56247f = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.a();
            }

            public void onItemRangeInserted(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56248a, false, 59943, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56248a, false, 59943, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                OriginMusicAdapter.this.f56247f = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.a();
            }

            public void onItemRangeRemoved(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56248a, false, 59944, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f56248a, false, 59944, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                OriginMusicAdapter.this.f56247f = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.a();
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56248a, false, 59945, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56248a, false, 59945, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                OriginMusicAdapter.this.f56247f = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.a();
            }

            public void onItemRangeChanged(int i, int i2, Object obj) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f56248a, false, 59942, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f56248a, false, 59942, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                    return;
                }
                OriginMusicAdapter.this.f56247f = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.a();
            }
        });
    }
}
