package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.drakeet.multitype.c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000f"}, d2 = {"Lcom/bytedance/android/livesdk/rank/viewbinder/DailyRankTimeViewBinder;", "Lme/drakeet/multitype/ItemViewBinder;", "", "Lcom/bytedance/android/livesdk/rank/viewbinder/DailyRankTimeViewBinder$TimeTextViewHolder;", "()V", "onBindViewHolder", "", "holder", "item", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "TimeTextViewHolder", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class DailyRankTimeViewBinder extends c<String, TimeTextViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17050a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bytedance/android/livesdk/rank/viewbinder/DailyRankTimeViewBinder$TimeTextViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "description", "", "bind$livesdk_cnDouyinRelease", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class TimeTextViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17051a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TimeTextViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TimeTextViewHolder timeTextViewHolder;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f17050a, false, 13092, new Class[]{LayoutInflater.class, ViewGroup.class}, TimeTextViewHolder.class)) {
            timeTextViewHolder = (TimeTextViewHolder) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f17050a, false, 13092, new Class[]{LayoutInflater.class, ViewGroup.class}, TimeTextViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = layoutInflater2.inflate(C0906R.layout.am3, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…ime_count, parent, false)");
            timeTextViewHolder = new TimeTextViewHolder(inflate);
        }
        return timeTextViewHolder;
    }

    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        TimeTextViewHolder timeTextViewHolder = (TimeTextViewHolder) viewHolder;
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{timeTextViewHolder, str}, this, f17050a, false, 13093, new Class[]{TimeTextViewHolder.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{timeTextViewHolder, str}, this, f17050a, false, 13093, new Class[]{TimeTextViewHolder.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(timeTextViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(str, "item");
        if (PatchProxy.isSupport(new Object[]{str}, timeTextViewHolder, TimeTextViewHolder.f17051a, false, 13094, new Class[]{String.class}, Void.TYPE)) {
            TimeTextViewHolder timeTextViewHolder2 = timeTextViewHolder;
            PatchProxy.accessDispatch(new Object[]{str}, timeTextViewHolder2, TimeTextViewHolder.f17051a, false, 13094, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "description");
        View view = timeTextViewHolder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        TextView textView = (TextView) view.findViewById(C0906R.id.a3u);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.description");
        textView.setText(str);
    }
}
