package com.ss.android.ugc.aweme.music.adapter.a;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.a;
import com.ss.android.ugc.aweme.music.a.i;
import com.ss.android.ugc.aweme.music.adapter.MusicTabViewHolder;
import com.ss.android.ugc.aweme.music.adapter.type.d;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class g extends a<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3619a;

    /* renamed from: b  reason: collision with root package name */
    private int f3620b;

    @Subscribe
    public void onSwitchMusicFragmentEvent(i iVar) {
        this.f3620b = iVar.f56176a;
    }

    public final void a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f3619a, false, 59979, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f3619a, false, 59979, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.a(recyclerView);
        bg.c(this);
    }

    public final void b(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f3619a, false, 59980, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f3619a, false, 59980, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.b(recyclerView);
        bg.d(this);
    }

    @NonNull
    public final RecyclerView.ViewHolder a(@NonNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f3619a, false, 59977, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return new MusicTabViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xv, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f3619a, false, 59977, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
    }

    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        if (!PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f3619a, false, 59976, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return list.get(i) instanceof com.ss.android.ugc.aweme.music.adapter.type.g;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f3619a, false, 59976, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull List list) {
        List list2 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f3619a, false, 59978, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), viewHolder, list}, this, f3619a, false, 59978, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        MusicTabViewHolder musicTabViewHolder = (MusicTabViewHolder) viewHolder;
        int i2 = this.f3620b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, musicTabViewHolder, MusicTabViewHolder.f56209a, false, 59904, new Class[]{Integer.TYPE}, Void.TYPE)) {
            MusicTabViewHolder musicTabViewHolder2 = musicTabViewHolder;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, musicTabViewHolder2, MusicTabViewHolder.f56209a, false, 59904, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        musicTabViewHolder.f56210b.a(i2);
    }
}
