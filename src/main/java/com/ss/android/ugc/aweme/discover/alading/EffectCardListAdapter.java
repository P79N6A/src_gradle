package com.ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.mob.h;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/EffectCardListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/discover/alading/EffectCardViewHolder;", "items", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "context", "Landroid/content/Context;", "(Lcom/ss/android/ugc/aweme/discover/model/SearchUser;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "effectCardList", "", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "getEffectCardList", "()Ljava/util/List;", "getItems", "()Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EffectCardListAdapter extends RecyclerView.Adapter<EffectCardViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42020a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<NewFaceSticker> f42021b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final SearchUser f42022c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Context f42023d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectCardListAdapter f42025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewFaceSticker f42026c;

        a(EffectCardListAdapter effectCardListAdapter, NewFaceSticker newFaceSticker) {
            this.f42025b = effectCardListAdapter;
            this.f42026c = newFaceSticker;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42024a, false, 35977, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42024a, false, 35977, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f42026c.getEffectId() != null) {
                h.a aVar = h.f42664a;
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                s a2 = aVar.a(view);
                r.a("enter_prop_detail", (Map) d.a().a("prop_id", this.f42026c.getEffectId()).a("from_user_id", this.f42026c.getOwnerId()).a("log_pb", a2.b()).a("search_keyword", a2.a()).a("enter_from", "general_search").a("enter_method", "aladdin_card").f34114b);
                com.ss.android.ugc.aweme.discover.mob.a.a(PushConstants.CONTENT, this.f42026c.getOwnerId(), view);
                ArrayList arrayList = new ArrayList();
                String effectId = this.f42026c.getEffectId();
                if (effectId == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add(effectId);
                StickerPropDetailActicity.a(this.f42025b.f42023d, null, null, null, arrayList);
            }
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f42020a, false, 35976, new Class[0], Integer.TYPE)) {
            return this.f42021b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42020a, false, 35976, new Class[0], Integer.TYPE)).intValue();
    }

    public EffectCardListAdapter(@NotNull SearchUser searchUser, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(searchUser, "items");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f42022c = searchUser;
        this.f42023d = context;
        List<NewFaceSticker> list = this.f42022c.effectCards;
        Intrinsics.checkExpressionValueIsNotNull(list, "items.effectCards");
        this.f42021b = list;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        EffectCardViewHolder effectCardViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42020a, false, 35974, new Class[]{ViewGroup.class, Integer.TYPE}, EffectCardViewHolder.class)) {
            effectCardViewHolder = (EffectCardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42020a, false, 35974, new Class[]{ViewGroup.class, Integer.TYPE}, EffectCardViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "p0");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a00, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            effectCardViewHolder = new EffectCardViewHolder(inflate);
        }
        return effectCardViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        EffectCardViewHolder effectCardViewHolder = (EffectCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{effectCardViewHolder, Integer.valueOf(i)}, this, f42020a, false, 35975, new Class[]{EffectCardViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectCardViewHolder, Integer.valueOf(i)}, this, f42020a, false, 35975, new Class[]{EffectCardViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effectCardViewHolder, "p0");
        NewFaceSticker newFaceSticker = this.f42021b.get(i);
        c.b(effectCardViewHolder.f42028b, newFaceSticker.getIconUrl());
        effectCardViewHolder.f42029c.setText(newFaceSticker.getName());
        TextView textView = effectCardViewHolder.f42030d;
        String string = this.f42023d.getString(C0906R.string.bf8);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.music_usage_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{b.a((long) newFaceSticker.getUserCount())}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        textView.setText(format);
        effectCardViewHolder.f42027a.setOnClickListener(new a(this, newFaceSticker));
    }
}
