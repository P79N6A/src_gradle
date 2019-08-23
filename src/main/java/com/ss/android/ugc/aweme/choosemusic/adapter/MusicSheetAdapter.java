package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.b.d;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public class MusicSheetAdapter extends BaseAdapter<MusicCollectionItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35778a;

    /* renamed from: b  reason: collision with root package name */
    public d f35779b;

    class MusicSheetViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35780a;

        /* renamed from: b  reason: collision with root package name */
        MusicCollectionItem f35781b;
        @BindView(2131495829)
        RemoteImageView mMusicSheetCover;
        @BindView(2131495830)
        TextView mMusicSheetName;

        MusicSheetViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.itemView.setOnClickListener(new f(this));
        }
    }

    public class MusicSheetViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35783a;

        /* renamed from: b  reason: collision with root package name */
        private MusicSheetViewHolder f35784b;

        @CallSuper
        public void unbind() {
            if (PatchProxy.isSupport(new Object[0], this, f35783a, false, 26497, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f35783a, false, 26497, new Class[0], Void.TYPE);
                return;
            }
            MusicSheetViewHolder musicSheetViewHolder = this.f35784b;
            if (musicSheetViewHolder != null) {
                this.f35784b = null;
                musicSheetViewHolder.mMusicSheetCover = null;
                musicSheetViewHolder.mMusicSheetName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        @UiThread
        public MusicSheetViewHolder_ViewBinding(MusicSheetViewHolder musicSheetViewHolder, View view) {
            this.f35784b = musicSheetViewHolder;
            musicSheetViewHolder.mMusicSheetCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.boq, "field 'mMusicSheetCover'", RemoteImageView.class);
            musicSheetViewHolder.mMusicSheetName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bor, "field 'mMusicSheetName'", TextView.class);
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35778a, false, 26493, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35778a, false, 26493, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new MusicSheetViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xx, viewGroup2, false));
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicCollectionItem musicCollectionItem;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f35778a, false, 26492, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f35778a, false, 26492, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        MusicSheetViewHolder musicSheetViewHolder = (MusicSheetViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35778a, false, 26494, new Class[]{Integer.TYPE}, MusicCollectionItem.class)) {
            musicCollectionItem = (MusicCollectionItem) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35778a, false, 26494, new Class[]{Integer.TYPE}, MusicCollectionItem.class);
        } else if (CollectionUtils.isEmpty(this.mItems) || i2 < 0 || i2 >= this.mItems.size()) {
            musicCollectionItem = null;
        } else {
            musicCollectionItem = (MusicCollectionItem) this.mItems.get(i2);
        }
        if (PatchProxy.isSupport(new Object[]{musicCollectionItem}, musicSheetViewHolder, MusicSheetViewHolder.f35780a, false, 26495, new Class[]{MusicCollectionItem.class}, Void.TYPE)) {
            Object[] objArr = {musicCollectionItem};
            MusicSheetViewHolder musicSheetViewHolder2 = musicSheetViewHolder;
            ChangeQuickRedirect changeQuickRedirect = MusicSheetViewHolder.f35780a;
            PatchProxy.accessDispatch(objArr, musicSheetViewHolder2, changeQuickRedirect, false, 26495, new Class[]{MusicCollectionItem.class}, Void.TYPE);
            return;
        }
        if (musicCollectionItem != null) {
            musicSheetViewHolder.f35781b = musicCollectionItem;
            c.b(musicSheetViewHolder.mMusicSheetCover, musicCollectionItem.cover);
            musicSheetViewHolder.mMusicSheetName.setText(musicCollectionItem.mcName);
        }
    }
}
