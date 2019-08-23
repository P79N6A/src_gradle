package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.a.b;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public final class g extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36052a;

    /* renamed from: b  reason: collision with root package name */
    f<b> f36053b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<MusicItemViewHolder> f36054c = new ArrayList<>(3);

    /* renamed from: d  reason: collision with root package name */
    private f f36055d;

    /* renamed from: e  reason: collision with root package name */
    private int f36056e;

    public final ArrayList<MusicItemViewHolder> getMusicItemViews() {
        return this.f36054c;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36052a, false, 26849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36052a, false, 26849, new Class[0], Void.TYPE);
            return;
        }
        setOrientation(1);
        for (int i = 0; i < 3; i++) {
            MusicItemViewHolder musicItemViewHolder = new MusicItemViewHolder(LayoutInflater.from(getContext()).inflate(C0906R.layout.xp, null, false), this.f36056e);
            if (PatchProxy.isSupport(new Object[0], musicItemViewHolder, MusicItemViewHolder.f36098a, false, 26901, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicItemViewHolder, MusicItemViewHolder.f36098a, false, 26901, new Class[0], Void.TYPE);
            } else {
                musicItemViewHolder.mLlItemContainer.setPadding(musicItemViewHolder.mLlItemContainer.getPaddingLeft(), 0, 0, 0);
            }
            this.f36054c.add(musicItemViewHolder);
            musicItemViewHolder.a(this.f36055d, this.f36053b);
            addView(musicItemViewHolder.itemView);
        }
    }

    public g(Context context, int i) {
        super(context);
        this.f36056e = i;
        a();
    }

    public final void a(f fVar, f<b> fVar2) {
        if (PatchProxy.isSupport(new Object[]{fVar, fVar2}, this, f36052a, false, 26850, new Class[]{f.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, fVar2}, this, f36052a, false, 26850, new Class[]{f.class, f.class}, Void.TYPE);
            return;
        }
        this.f36055d = fVar;
        this.f36053b = fVar2;
        if (!this.f36054c.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                this.f36054c.get(i).a(this.f36055d, this.f36053b);
            }
        }
    }

    public final void a(List<MusicModel> list, int i, int i2, int i3, a aVar, boolean z) {
        boolean z2;
        List<MusicModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36052a, false, 26851, new Class[]{List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f36052a, false, 26851, new Class[]{List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class, Boolean.TYPE}, Void.TYPE);
        } else if (list2 != null) {
            int min = Math.min(i + 3, list.size());
            int i4 = i;
            while (i4 < min) {
                MusicModel musicModel = list2.get(i4);
                MusicItemViewHolder musicItemViewHolder = getMusicItemViews().get(i4 - i);
                musicItemViewHolder.itemView.setVisibility(0);
                if (i2 == i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                musicItemViewHolder.a(musicModel, "", z, z2, false, 0, i3, i4, aVar);
                i4++;
                min = min;
            }
            for (int i5 = min - i; i5 < 3; i5++) {
                getMusicItemViews().get(i5).itemView.setVisibility(8);
            }
        }
    }
}
