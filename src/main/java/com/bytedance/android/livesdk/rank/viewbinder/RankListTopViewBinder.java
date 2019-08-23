package com.bytedance.android.livesdk.rank.viewbinder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import me.drakeet.multitype.c;

public final class RankListTopViewBinder extends c<String, RankRocketViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17065a;

    static class RankRocketViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17066a;

        RankRocketViewHolder(View view) {
            super(view);
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.ViewHolder a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f17065a, false, 13106, new Class[]{LayoutInflater.class, ViewGroup.class}, RankRocketViewHolder.class)) {
            return new RankRocketViewHolder(layoutInflater2.inflate(C0906R.layout.ak7, viewGroup2, false));
        }
        return (RankRocketViewHolder) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f17065a, false, 13106, new Class[]{LayoutInflater.class, ViewGroup.class}, RankRocketViewHolder.class);
    }

    public final /* synthetic */ void a(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull Object obj) {
        RankRocketViewHolder rankRocketViewHolder = (RankRocketViewHolder) viewHolder;
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{rankRocketViewHolder, str}, this, f17065a, false, 13107, new Class[]{RankRocketViewHolder.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rankRocketViewHolder, str}, this, f17065a, false, 13107, new Class[]{RankRocketViewHolder.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, rankRocketViewHolder, RankRocketViewHolder.f17066a, false, 13108, new Class[]{String.class}, Void.TYPE)) {
            RankRocketViewHolder rankRocketViewHolder2 = rankRocketViewHolder;
            PatchProxy.accessDispatch(new Object[]{str}, rankRocketViewHolder2, RankRocketViewHolder.f17066a, false, 13108, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Context context = rankRocketViewHolder.itemView.getContext();
        if (!StringUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(" ");
            if (!(context == null || context.getResources() == null || lastIndexOf < 0)) {
                SpannableString spannableString = new SpannableString(str);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(C0906R.color.aib));
                int length = str.length();
                if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(lastIndexOf), Integer.valueOf(length), 33}, null, g.f17083a, true, 13109, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(lastIndexOf), Integer.valueOf(length), 33}, null, g.f17083a, true, 13109, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    spannableString.setSpan(foregroundColorSpan, lastIndexOf, length, 33);
                }
                ((TextView) rankRocketViewHolder.itemView).setText(spannableString);
            }
        }
    }
}
