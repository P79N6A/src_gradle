package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0014\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\u00020\u0016*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder$IMusicClusterListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder$IMusicClusterListener;)V", "mClusterButtonData", "Lcom/ss/android/ugc/aweme/discover/adapter/ClusterButtonData;", "mKeyword", "", "mTvMatchCount", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "music", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "keyword", "sendClusterEvent", "event", "buttonData", "appendLogPb", "Lcom/ss/android/ugc/aweme/app/event/EventMapBuilder;", "cluster", "appendMusicList", "list", "", "Lcom/ss/android/ugc/aweme/music/model/Music;", "Companion", "IMusicClusterListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicClusterViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41833a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f41834e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final DmtTextView f41835b;

    /* renamed from: c  reason: collision with root package name */
    public d f41836c;

    /* renamed from: d  reason: collision with root package name */
    String f41837d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder$IMusicClusterListener;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41841a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterViewHolder$IMusicClusterListener;", "", "onClusterExpand", "", "cluster", "Lcom/ss/android/ugc/aweme/discover/adapter/ClusterButtonData;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull d dVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMusicClusterViewHolder(@NotNull View view, @NotNull final b bVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        View findViewById = view.findViewById(C0906R.id.deh);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.tv_matched_count)");
        this.f41835b = (DmtTextView) findViewById;
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41838a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchMusicClusterViewHolder f41839b;

            {
                this.f41839b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41838a, false, 35843, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41838a, false, 35843, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (this.f41839b.f41836c != null) {
                    SearchMusicClusterViewHolder searchMusicClusterViewHolder = this.f41839b;
                    d dVar = this.f41839b.f41836c;
                    if (dVar == null) {
                        Intrinsics.throwNpe();
                    }
                    searchMusicClusterViewHolder.a("matched_sounds_click", dVar);
                    b bVar = bVar;
                    d dVar2 = this.f41839b.f41836c;
                    if (dVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar.a(dVar2);
                }
            }
        });
    }

    private final d a(@NotNull d dVar, d dVar2) {
        d dVar3 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar3, dVar2}, this, f41833a, false, 35842, new Class[]{d.class, d.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{dVar3, dVar2}, this, f41833a, false, 35842, new Class[]{d.class, d.class}, d.class);
        }
        d a2 = dVar3.a("log_pb", ai.a().a(((Music) dVar2.getClusterList().get(0)).getRequestId()));
        Intrinsics.checkExpressionValueIsNotNull(a2, "appendParam(Mob.Key.LOG_PB, logPb)");
        return a2;
    }

    private final d a(@NotNull d dVar, List<Music> list) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, list}, this, f41833a, false, 35841, new Class[]{d.class, List.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{dVar2, list}, this, f41833a, false, 35841, new Class[]{d.class, List.class}, d.class);
        }
        StringBuilder sb = new StringBuilder();
        for (Music mid : list) {
            sb.append(mid.getMid());
            sb.append(",");
        }
        d a2 = dVar2.a("music_list", StringsKt.removeSuffix((CharSequence) sb, (CharSequence) ",").toString());
        Intrinsics.checkExpressionValueIsNotNull(a2, "appendParam(Mob.Key.MUSI…veSuffix(\",\").toString())");
        return a2;
    }

    public final void a(String str, d dVar) {
        if (PatchProxy.isSupport(new Object[]{str, dVar}, this, f41833a, false, 35840, new Class[]{String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, dVar}, this, f41833a, false, 35840, new Class[]{String.class, d.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", "search_result").a("search_keyword", this.f41837d);
        Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…SEARCH_KEYWORD, mKeyword)");
        r.a(str, (Map) a(a(a2, dVar.getClusterList()), dVar).f34114b);
    }
}
