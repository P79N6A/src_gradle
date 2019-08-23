package com.ss.android.ugc.aweme.discover.adapter;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.ui.HotSearchImageSectionDecoration;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.hotsearch.RankingListActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HotSearchImageViewHolder extends RecyclerView.ViewHolder implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41632a;

    /* renamed from: b  reason: collision with root package name */
    public String f41633b;

    /* renamed from: c  reason: collision with root package name */
    public ak.b f41634c;

    /* renamed from: d  reason: collision with root package name */
    boolean f41635d = true;

    /* renamed from: e  reason: collision with root package name */
    private LifecycleOwner f41636e;

    /* renamed from: f  reason: collision with root package name */
    private HotSearchImageAdapter f41637f;
    private List<HotSearchItem> g;
    private long h;
    @BindView(2131495097)
    ImageView ivMore;
    @BindView(2131495611)
    View mHotSearchBoardView;
    @BindView(2131496872)
    RecyclerView mHotSearchCardView;
    @BindView(2131498191)
    DmtTextView mTitle;
    @BindView(2131497950)
    DmtTextView mViewMoreTextView;

    class HotSearchImageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41641a;

        /* renamed from: b  reason: collision with root package name */
        List<HotSearchItem> f41642b;

        public int getItemCount() {
            return 6;
        }

        HotSearchImageAdapter() {
            if (PatchProxy.isSupport(new Object[0], this, f41641a, false, 35610, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41641a, false, 35610, new Class[0], Void.TYPE);
                return;
            }
            this.f41642b = new ArrayList();
            for (int i = 0; i < 6; i++) {
                this.f41642b.add(HotSearchItem.Companion.createPlaceHolder());
            }
        }

        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41641a, false, 35611, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f41641a, false, 35611, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            }
            String str = HotSearchImageViewHolder.this.f41633b;
            ak.b bVar = HotSearchImageViewHolder.this.f41634c;
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, str, bVar}, null, HotSearchImageItemNewViewHolder.f41622a, true, 35586, new Class[]{ViewGroup.class, String.class, ak.b.class}, HotSearchImageItemNewViewHolder.class)) {
                return new HotSearchImageItemNewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vj, viewGroup2, false), str, bVar);
            }
            return (HotSearchImageItemNewViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, str, bVar}, null, HotSearchImageItemNewViewHolder.f41622a, true, 35586, new Class[]{ViewGroup.class, String.class, ak.b.class}, HotSearchImageItemNewViewHolder.class);
        }

        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41641a, false, 35612, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41641a, false, 35612, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder = (HotSearchImageItemNewViewHolder) viewHolder;
            HotSearchItem hotSearchItem = this.f41642b.get(i2);
            if (PatchProxy.isSupport(new Object[]{hotSearchItem, Integer.valueOf(i)}, hotSearchImageItemNewViewHolder, HotSearchImageItemNewViewHolder.f41622a, false, 35587, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotSearchItem, Integer.valueOf(i)}, hotSearchImageItemNewViewHolder, HotSearchImageItemNewViewHolder.f41622a, false, 35587, new Class[]{HotSearchItem.class, Integer.TYPE}, Void.TYPE);
            } else if (hotSearchItem != null && !hotSearchItem.isPlaceholder()) {
                hotSearchImageItemNewViewHolder.f41623b = hotSearchItem.getLogPb();
                if (PatchProxy.isSupport(new Object[]{hotSearchItem}, hotSearchImageItemNewViewHolder, HotSearchImageItemNewViewHolder.f41622a, false, 35588, new Class[]{HotSearchItem.class}, Void.TYPE)) {
                    HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder2 = hotSearchImageItemNewViewHolder;
                    PatchProxy.accessDispatch(new Object[]{hotSearchItem}, hotSearchImageItemNewViewHolder2, HotSearchImageItemNewViewHolder.f41622a, false, 35588, new Class[]{HotSearchItem.class}, Void.TYPE);
                } else if (hotSearchImageItemNewViewHolder.a(hotSearchItem.getUrlModel())) {
                    int dip2Px = (int) UIUtils.dip2Px(hotSearchImageItemNewViewHolder.mImageView.getContext(), 100.0f);
                    c.a(hotSearchImageItemNewViewHolder.mImageView, hotSearchItem.getUrlModel(), dip2Px, dip2Px);
                } else {
                    hotSearchImageItemNewViewHolder.mMaskView.setVisibility(8);
                    hotSearchImageItemNewViewHolder.mImageView.setImageDrawable(a.a(hotSearchImageItemNewViewHolder.itemView.getResources(), (int) C0906R.color.bs));
                }
                hotSearchImageItemNewViewHolder.mTitleView.setHotSearchItem(hotSearchItem);
                try {
                    Long.parseLong(hotSearchItem.getHotValue());
                } catch (NumberFormatException unused) {
                }
                hotSearchImageItemNewViewHolder.itemView.setOnTouchListener(new ai(hotSearchItem, i2) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f41626a;

                    /* renamed from: b */
                    final /* synthetic */ HotSearchItem f41627b;

                    /* renamed from: c */
                    final /* synthetic */ int f41628c;

                    public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageItemNewViewHolder.1.b(android.view.View, android.view.MotionEvent):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.discover.adapter.HotSearchImageItemNewViewHolder.1.b(android.view.View, android.view.MotionEvent):void, class status: UNLOADED
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
                    	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
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

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f41632a, false, 35598, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f41632a, false, 35598, new Class[0], String.class);
        } else if (TextUtils.equals("hot_search_section_discovery", this.f41633b)) {
            return "discovery";
        } else {
            return this.f41633b;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41632a, false, 35603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41632a, false, 35603, new Class[0], Void.TYPE);
            return;
        }
        ((e) e.m.a(this.itemView.getContext())).a(this.itemView, this.f41636e);
    }

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41632a, false, 35599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41632a, false, 35599, new Class[0], Void.TYPE);
            return;
        }
        if (!m.a().c()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), this.itemView.getResources().getString(C0906R.string.bgf)).a();
        }
        RankingListActivity.a(this.itemView.getContext());
        if (PatchProxy.isSupport(new Object[0], this, f41632a, false, 35604, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41632a, false, 35604, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (((Boolean) SharePrefCache.inst().getIsShowRankingIndicator().c()).booleanValue() && ((Boolean) SharePrefCache.inst().getIsHotSearchAwemeBillboardEnable().c()).booleanValue() && AbTestManager.a().az()) {
            z = true;
        }
        if (z) {
            SharePrefCache.inst().getIsShowRankingIndicator().a(Boolean.FALSE);
        }
    }

    public final void d() {
        String str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f41632a, false, 35605, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41632a, false, 35605, new Class[0], Void.TYPE);
        } else if (System.currentTimeMillis() - this.h >= 2000) {
            this.h = System.currentTimeMillis();
            r.a("hot_search_icon", (Map) d.a().a("action_type", "show").a("enter_from", a()).f34114b);
            while (i < this.g.size()) {
                HotSearchItem hotSearchItem = this.g.get(i);
                d a2 = d.a().a("action_type", "show").a("key_word", hotSearchItem.getWord());
                if (hotSearchItem.getType() == 1) {
                    str = "tag";
                } else {
                    str = "general_word";
                }
                i++;
                r.a("hot_search_keyword", (Map) a2.a("key_word_type", str).a("order", i).a("enter_from", this.f41633b).f34114b);
            }
        }
    }

    private void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41632a, false, 35602, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41632a, false, 35602, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(this.f41633b, "hot_search_section_search")) {
            str = "hot_search_keyword_show";
        } else {
            str = "hot_search_keyword_show_detail";
        }
        for (int i = 0; i < this.g.size(); i++) {
            HotSearchItem hotSearchItem = this.g.get(i);
            if (hotSearchItem.isAd() && (!hotSearchItem.getHasSentMob() || z)) {
                hotSearchItem.setHasSentMob(true);
                g.a((g.a) new i(hotSearchItem), hotSearchItem.getAdData().getTrackUrl(), true);
                com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b(str).d(this.f41633b).g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(this.itemView.getContext());
                com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("show").g(hotSearchItem.getAdData().getLogExtra()).a(Long.valueOf(hotSearchItem.getAdData().getCreativeId())).a(this.itemView.getContext());
            }
        }
    }

    public final void a(List<HotSearchItem> list) {
        List<HotSearchItem> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f41632a, false, 35600, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f41632a, false, 35600, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if ("hot_search_section_discovery".equals(this.f41633b)) {
            c();
        }
        if (!CollectionUtils.isEmpty(list) && !list2.equals(HotSearchWordViewHolder.i)) {
            ArrayList arrayList = new ArrayList(this.g);
            this.g.clear();
            boolean z = true;
            for (int i = 0; i < Math.min(list.size(), 6); i++) {
                HotSearchItem hotSearchItem = list2.get(i);
                if (arrayList.size() != 6 || hotSearchItem != arrayList.get(i)) {
                    z = false;
                }
                this.g.add(hotSearchItem);
            }
            if (!z) {
                HotSearchImageAdapter hotSearchImageAdapter = this.f41637f;
                List<HotSearchItem> list3 = this.g;
                if (PatchProxy.isSupport(new Object[]{list3}, hotSearchImageAdapter, HotSearchImageAdapter.f41641a, false, 35613, new Class[]{List.class}, Void.TYPE)) {
                    HotSearchImageAdapter hotSearchImageAdapter2 = hotSearchImageAdapter;
                    PatchProxy.accessDispatch(new Object[]{list3}, hotSearchImageAdapter2, HotSearchImageAdapter.f41641a, false, 35613, new Class[]{List.class}, Void.TYPE);
                } else if (!CollectionUtils.isEmpty(list3)) {
                    if (hotSearchImageAdapter.f41642b == null) {
                        hotSearchImageAdapter.f41642b = new ArrayList();
                    }
                    hotSearchImageAdapter.f41642b.clear();
                    hotSearchImageAdapter.f41642b.addAll(list3);
                }
                this.f41637f.notifyDataSetChanged();
                d();
                a(false);
            }
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f41632a, false, 35601, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f41632a, false, 35601, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (event.equals(Lifecycle.Event.ON_RESUME)) {
            if (!this.f41635d && ViewCompat.isAttachedToWindow(this.itemView)) {
                a(true);
            }
            this.f41635d = false;
        }
    }

    public static HotSearchImageViewHolder a(ViewGroup viewGroup, String str, ak.b bVar, LifecycleOwner lifecycleOwner) {
        ViewGroup viewGroup2 = viewGroup;
        String str2 = str;
        ak.b bVar2 = bVar;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, str2, bVar2, lifecycleOwner2}, null, f41632a, true, 35596, new Class[]{ViewGroup.class, String.class, ak.b.class, LifecycleOwner.class}, HotSearchImageViewHolder.class)) {
            return new HotSearchImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vi, viewGroup2, false), str2, bVar2, lifecycleOwner2);
        }
        Object[] objArr = {viewGroup2, str2, bVar2, lifecycleOwner2};
        return (HotSearchImageViewHolder) PatchProxy.accessDispatch(objArr, null, f41632a, true, 35596, new Class[]{ViewGroup.class, String.class, ak.b.class, LifecycleOwner.class}, HotSearchImageViewHolder.class);
    }

    private HotSearchImageViewHolder(View view, String str, ak.b bVar, LifecycleOwner lifecycleOwner) {
        super(view);
        ShapeDrawable shapeDrawable;
        ButterKnife.bind((Object) this, view);
        this.g = new ArrayList();
        this.f41633b = str;
        this.f41634c = bVar;
        this.f41636e = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[0], this, f41632a, false, 35597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41632a, false, 35597, new Class[0], Void.TYPE);
            return;
        }
        if ("hot_search_section_search".equals(this.f41633b)) {
            this.mTitle.setTextSize(1, 17.0f);
            this.mTitle.setCompoundDrawablePadding(0);
            this.mTitle.setCompoundDrawables(null, null, null, null);
            this.mTitle.setTextColor(this.mTitle.getContext().getResources().getColor(C0906R.color.hx));
            this.mViewMoreTextView.setTextColor(this.mViewMoreTextView.getContext().getResources().getColor(C0906R.color.zx));
            this.ivMore.setImageResource(2130839240);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ivMore.getLayoutParams();
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(0);
            } else {
                layoutParams.leftMargin = 0;
            }
            this.ivMore.setLayoutParams(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mHotSearchBoardView.getLayoutParams();
            marginLayoutParams.topMargin = u.a(10.0d);
            marginLayoutParams.bottomMargin = u.a(16.0d);
            this.mHotSearchBoardView.setLayoutParams(marginLayoutParams);
        }
        this.mHotSearchCardView.setLayoutManager(new WrapGridLayoutManager(this.itemView.getContext(), 3) {
            public boolean canScrollHorizontally() {
                return false;
            }

            public boolean canScrollVertically() {
                return false;
            }
        });
        Context context = this.itemView.getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, f41632a, false, 35606, new Class[]{Context.class}, ShapeDrawable.class)) {
            shapeDrawable = (ShapeDrawable) PatchProxy.accessDispatch(new Object[]{context}, this, f41632a, false, 35606, new Class[]{Context.class}, ShapeDrawable.class);
        } else {
            shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(new RectShape());
            shapeDrawable.getPaint().setColor(context.getResources().getColor(C0906R.color.bn));
        }
        int dip2Px = (int) UIUtils.dip2Px(this.itemView.getContext(), 6.0f);
        shapeDrawable.setIntrinsicWidth(dip2Px);
        shapeDrawable.setIntrinsicHeight(dip2Px);
        this.mHotSearchCardView.addItemDecoration(new HotSearchImageSectionDecoration(shapeDrawable, shapeDrawable));
        this.f41637f = new HotSearchImageAdapter();
        this.mHotSearchCardView.setAdapter(this.f41637f);
        this.mHotSearchBoardView.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41639a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41639a, false, 35609, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41639a, false, 35609, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                r.a("hot_search_icon", (Map) d.a().a("action_type", "click").a("enter_from", HotSearchImageViewHolder.this.a()).a("enter_method", "click_read_more").f34114b);
                HotSearchImageViewHolder.this.b();
            }
        });
        this.mTitle.setOnClickListener(new h(this));
        this.f41636e.getLifecycle().addObserver(this);
    }
}
