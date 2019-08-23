package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.rank.i;
import com.bytedance.android.livesdk.rank.model.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import me.drakeet.multitype.c;

public final class DailyRankItemViewBinder extends c<b, DailyRankItemViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17040a;

    /* renamed from: b  reason: collision with root package name */
    private int f17041b;

    static class DailyRankItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17042a;

        /* renamed from: b  reason: collision with root package name */
        int f17043b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f17044c;

        /* renamed from: d  reason: collision with root package name */
        TextView f17045d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f17046e;

        /* renamed from: f  reason: collision with root package name */
        TextView f17047f;
        ImageView g;
        View h;
        TextView i;

        public DailyRankItemViewHolder(@NonNull View view, int i2) {
            super(view);
            this.f17043b = i2;
            this.f17044c = (ImageView) view.findViewById(C0906R.id.c_h);
            this.f17045d = (TextView) view.findViewById(C0906R.id.c_l);
            this.f17046e = (ImageView) view.findViewById(C0906R.id.dp2);
            this.f17047f = (TextView) view.findViewById(C0906R.id.dq2);
            this.g = (ImageView) view.findViewById(C0906R.id.ays);
            this.h = view.findViewById(C0906R.id.bee);
            this.i = (TextView) view.findViewById(C0906R.id.d2q);
        }
    }

    public DailyRankItemViewBinder(int i) {
        this.f17041b = i;
    }

    @NonNull
    public final /* synthetic */ RecyclerView.ViewHolder a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f17040a, false, 13085, new Class[]{LayoutInflater.class, ViewGroup.class}, DailyRankItemViewHolder.class)) {
            return new DailyRankItemViewHolder(layoutInflater2.inflate(C0906R.layout.akc, viewGroup2, false), this.f17041b);
        }
        return (DailyRankItemViewHolder) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f17040a, false, 13085, new Class[]{LayoutInflater.class, ViewGroup.class}, DailyRankItemViewHolder.class);
    }

    public final /* synthetic */ void a(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull Object obj) {
        long j;
        String str;
        String str2;
        DailyRankItemViewHolder dailyRankItemViewHolder = (DailyRankItemViewHolder) viewHolder;
        b bVar = (b) obj;
        if (PatchProxy.isSupport(new Object[]{dailyRankItemViewHolder, bVar}, this, f17040a, false, 13086, new Class[]{DailyRankItemViewHolder.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dailyRankItemViewHolder, bVar}, this, f17040a, false, 13086, new Class[]{DailyRankItemViewHolder.class, b.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bVar}, dailyRankItemViewHolder, DailyRankItemViewHolder.f17042a, false, 13087, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, dailyRankItemViewHolder, DailyRankItemViewHolder.f17042a, false, 13087, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar != null) {
            int i = bVar.f17027d;
            View view = dailyRankItemViewHolder.itemView;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view}, null, i.f17004a, true, 12981, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view}, null, i.f17004a, true, 12981, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
            } else if (i.h > 0 && i == 1 && a.c() && view != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(view) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f17016a;

                    /* renamed from: b */
                    final /* synthetic */ View f17017b;

                    public final boolean onPreDraw(
/*
Method generation error in method: com.bytedance.android.livesdk.rank.i.4.onPreDraw():boolean, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.rank.i.4.onPreDraw():boolean, class status: UNLOADED
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
            }
            if (bVar.f17027d == 1) {
                dailyRankItemViewHolder.f17044c.setImageResource(2130841414);
                dailyRankItemViewHolder.f17044c.setVisibility(0);
                dailyRankItemViewHolder.f17045d.setVisibility(8);
            } else if (bVar.f17027d == 2) {
                dailyRankItemViewHolder.f17044c.setImageResource(2130841415);
                dailyRankItemViewHolder.f17044c.setVisibility(0);
                dailyRankItemViewHolder.f17045d.setVisibility(8);
            } else if (bVar.f17027d == 3) {
                dailyRankItemViewHolder.f17044c.setImageResource(2130841416);
                dailyRankItemViewHolder.f17044c.setVisibility(0);
                dailyRankItemViewHolder.f17045d.setVisibility(8);
            } else {
                dailyRankItemViewHolder.f17044c.setVisibility(8);
                dailyRankItemViewHolder.f17045d.setVisibility(0);
            }
            dailyRankItemViewHolder.f17045d.setText(String.valueOf(bVar.f17027d));
            com.bytedance.android.livesdk.chatroom.f.b.b(dailyRankItemViewHolder.f17046e, bVar.f17025b.getAvatarThumb(), dailyRankItemViewHolder.f17046e.getWidth(), dailyRankItemViewHolder.f17046e.getHeight(), 2130841141);
            dailyRankItemViewHolder.f17047f.setText(bVar.f17025b.getNickName());
            if (bVar.a() > 0) {
                if (a.a()) {
                    dailyRankItemViewHolder.g.setImageResource(2130841506);
                    dailyRankItemViewHolder.g.setVisibility(0);
                } else if (a.d() || a.g() || a.f()) {
                    UIUtils.setViewVisibility(dailyRankItemViewHolder.h, 0);
                } else {
                    UIUtils.setViewVisibility(dailyRankItemViewHolder.h, 8);
                }
                f.a(dailyRankItemViewHolder.h).a("exist_live", "top_billboard", 0, 0);
                HashMap hashMap = new HashMap();
                if (bVar.f17025b != null && bVar.f17025b.getId() > 0) {
                    hashMap.put("anchor_id", String.valueOf(bVar.f17025b.getId()));
                }
                hashMap.put("room_id", String.valueOf(bVar.a()));
                if (bVar.f17025b == null) {
                    j = 0;
                } else {
                    j = bVar.f17025b.getId();
                }
                hashMap.put("anchor_id", String.valueOf(j));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live_detail");
                hashMap.put("enter_from", "live_detail");
                hashMap.put("action_type", "click");
                if (dailyRankItemViewHolder.f17043b == 1) {
                    str = "hourly_rank";
                } else {
                    str = "regional_rank";
                }
                hashMap.put("event_module", str);
                if (LinkCrossRoomDataHolder.a().f9030d > 0) {
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.a().f9030d));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.a().f9031e));
                    if (LinkCrossRoomDataHolder.a().i == 0) {
                        str2 = "anchor";
                    } else {
                        str2 = PushConstants.URI_PACKAGE_NAME;
                    }
                    hashMap.put("connection_type", str2);
                }
                hashMap.put("enter_from_merge", "live_detail");
                hashMap.put("enter_method", "hourly_rank");
                com.bytedance.android.livesdk.j.a.a().a("live_show", hashMap, Room.class);
            } else {
                UIUtils.setViewVisibility(dailyRankItemViewHolder.h, 8);
                if (a.a()) {
                    dailyRankItemViewHolder.g.setVisibility(8);
                }
            }
            if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                dailyRankItemViewHolder.i.setText(e.c(bVar.f17026c));
            } else {
                dailyRankItemViewHolder.i.setText(bVar.f17028e);
            }
            dailyRankItemViewHolder.itemView.setOnClickListener(new b(dailyRankItemViewHolder, bVar));
        }
    }
}
