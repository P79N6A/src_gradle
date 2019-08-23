package com.ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.base.b;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/MusicCardListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/discover/alading/MusicCardViewHolder;", "items", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "context", "Landroid/content/Context;", "(Lcom/ss/android/ugc/aweme/discover/model/SearchUser;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "musicCardList", "", "Lcom/ss/android/ugc/aweme/music/model/Music;", "getMusicCardList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicCardListAdapter extends RecyclerView.Adapter<MusicCardViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42031a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<Music> f42032b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final SearchUser f42033c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Context f42034d;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f42031a, false, 35985, new Class[0], Integer.TYPE)) {
            return this.f42032b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42031a, false, 35985, new Class[0], Integer.TYPE)).intValue();
    }

    public MusicCardListAdapter(@NotNull SearchUser searchUser, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(searchUser, "items");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f42033c = searchUser;
        this.f42034d = context;
        List<Music> list = this.f42033c.musicCards;
        Intrinsics.checkExpressionValueIsNotNull(list, "items.musicCards");
        this.f42032b = list;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        MusicCardViewHolder musicCardViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42031a, false, 35983, new Class[]{ViewGroup.class, Integer.TYPE}, MusicCardViewHolder.class)) {
            musicCardViewHolder = (MusicCardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f42031a, false, 35983, new Class[]{ViewGroup.class, Integer.TYPE}, MusicCardViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "p0");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0a, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            musicCardViewHolder = new MusicCardViewHolder(inflate);
        }
        return musicCardViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicCardViewHolder musicCardViewHolder = (MusicCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{musicCardViewHolder, Integer.valueOf(i)}, this, f42031a, false, 35984, new Class[]{MusicCardViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicCardViewHolder, Integer.valueOf(i)}, this, f42031a, false, 35984, new Class[]{MusicCardViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(musicCardViewHolder, "p0");
        Music music = this.f42032b.get(i);
        Context context = this.f42034d;
        if (context != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (PatchProxy.isSupport(new Object[]{music, fragmentActivity}, musicCardViewHolder, MusicCardViewHolder.f42035a, false, 35993, new Class[]{Music.class, FragmentActivity.class}, Void.TYPE)) {
                MusicCardViewHolder musicCardViewHolder2 = musicCardViewHolder;
                PatchProxy.accessDispatch(new Object[]{music, fragmentActivity}, musicCardViewHolder2, MusicCardViewHolder.f42035a, false, 35993, new Class[]{Music.class, FragmentActivity.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(music, "item");
            Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
            musicCardViewHolder.g = music;
            musicCardViewHolder.f42038d.setText(music.getMusicName().toString());
            UrlModel coverMedium = music.getCoverMedium();
            Intrinsics.checkExpressionValueIsNotNull(coverMedium, "item.getCoverMedium()");
            b.a(musicCardViewHolder.f42037c, coverMedium);
            TextView textView = musicCardViewHolder.f42039e;
            StringBuilder sb = new StringBuilder();
            sb.append(ey.a(music.getDuration() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).toString());
            sb.append(" / ");
            sb.append(com.ss.android.ugc.aweme.i18n.b.a((long) music.getUserCount()).toString());
            View view = musicCardViewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            sb.append(view.getContext().getString(C0906R.string.dpe));
            textView.setText(sb.toString());
            musicCardViewHolder.i.a(musicCardViewHolder.g);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
