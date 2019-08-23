package com.ss.android.ugc.aweme.challenge.ui.header.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017H\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder;", "listener", "Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "(Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;)V", "data", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getListener", "()Lcom/ss/android/ugc/aweme/challenge/ui/header/adapter/HorizontalSlideVideoViewHolder$IHorizontalSlideListener;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HorizontalSlideVideoAdapter extends RecyclerView.Adapter<HorizontalSlideVideoViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35617a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Aweme> f35618b = new ArrayList();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final HorizontalSlideVideoViewHolder.b f35619c;

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f35617a, false, 26422, new Class[0], Integer.TYPE)) {
            return this.f35618b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35617a, false, 26422, new Class[0], Integer.TYPE)).intValue();
    }

    public HorizontalSlideVideoAdapter(@NotNull HorizontalSlideVideoViewHolder.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f35619c = bVar;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        HorizontalSlideVideoViewHolder horizontalSlideVideoViewHolder = (HorizontalSlideVideoViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{horizontalSlideVideoViewHolder, Integer.valueOf(i)}, this, f35617a, false, 26420, new Class[]{HorizontalSlideVideoViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{horizontalSlideVideoViewHolder, Integer.valueOf(i)}, this, f35617a, false, 26420, new Class[]{HorizontalSlideVideoViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(horizontalSlideVideoViewHolder, "viewHolder");
        Aweme aweme = this.f35618b.get(i);
        if (PatchProxy.isSupport(new Object[]{aweme}, horizontalSlideVideoViewHolder, HorizontalSlideVideoViewHolder.f35620a, false, 26423, new Class[]{Aweme.class}, Void.TYPE)) {
            HorizontalSlideVideoViewHolder horizontalSlideVideoViewHolder2 = horizontalSlideVideoViewHolder;
            PatchProxy.accessDispatch(new Object[]{aweme}, horizontalSlideVideoViewHolder2, HorizontalSlideVideoViewHolder.f35620a, false, 26423, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null && aweme.getVideo() != null) {
            Video video = aweme.getVideo();
            Intrinsics.checkExpressionValueIsNotNull(video, "aweme.video");
            c.b(horizontalSlideVideoViewHolder.f35622b, video.getCover());
            horizontalSlideVideoViewHolder.f35623c = aweme;
        }
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HorizontalSlideVideoViewHolder horizontalSlideVideoViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35617a, false, 26419, new Class[]{ViewGroup.class, Integer.TYPE}, HorizontalSlideVideoViewHolder.class)) {
            horizontalSlideVideoViewHolder = (HorizontalSlideVideoViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35617a, false, 26419, new Class[]{ViewGroup.class, Integer.TYPE}, HorizontalSlideVideoViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            HorizontalSlideVideoViewHolder.a aVar = HorizontalSlideVideoViewHolder.f35621e;
            HorizontalSlideVideoViewHolder.b bVar = this.f35619c;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, bVar}, aVar, HorizontalSlideVideoViewHolder.a.f35627a, false, 26426, new Class[]{ViewGroup.class, HorizontalSlideVideoViewHolder.b.class}, HorizontalSlideVideoViewHolder.class)) {
                HorizontalSlideVideoViewHolder.a aVar2 = aVar;
                horizontalSlideVideoViewHolder = (HorizontalSlideVideoViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, bVar}, aVar2, HorizontalSlideVideoViewHolder.a.f35627a, false, 26426, new Class[]{ViewGroup.class, HorizontalSlideVideoViewHolder.b.class}, HorizontalSlideVideoViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                Intrinsics.checkParameterIsNotNull(bVar, "listener");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sk, viewGroup2, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
                horizontalSlideVideoViewHolder = new HorizontalSlideVideoViewHolder(inflate, bVar);
            }
        }
        return horizontalSlideVideoViewHolder;
    }
}
