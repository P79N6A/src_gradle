package com.ss.android.ugc.aweme.profile.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import java.util.HashMap;
import java.util.Map;

public class DecorationAdapter extends BaseAdapter<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61782a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f61783b;

    /* renamed from: c  reason: collision with root package name */
    public int f61784c;

    /* renamed from: d  reason: collision with root package name */
    public a f61785d;

    /* renamed from: e  reason: collision with root package name */
    public Map<Integer, Boolean> f61786e = new HashMap();

    class AvatarDecorationViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61787a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f61788b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f61789c;

        private AvatarDecorationViewHolder(View view) {
            super(view);
            this.f61788b = (ImageView) view.findViewById(C0906R.id.avy);
            this.f61789c = (ImageView) view.findViewById(C0906R.id.a2x);
        }

        /* synthetic */ AvatarDecorationViewHolder(DecorationAdapter decorationAdapter, View view, byte b2) {
            this(view);
        }
    }

    public interface a {
        void a(int i);
    }

    DecorationAdapter() {
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61782a, false, 67943, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61782a, false, 67943, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61784c = i;
        notifyDataSetChanged();
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61782a, false, 67942, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61782a, false, 67942, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new AvatarDecorationViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sf, viewGroup2, false), (byte) 0);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ImageView imageView;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61782a, false, 67941, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61782a, false, 67941, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AvatarDecorationViewHolder avatarDecorationViewHolder = (AvatarDecorationViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, avatarDecorationViewHolder, AvatarDecorationViewHolder.f61787a, false, 67946, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            AvatarDecorationViewHolder avatarDecorationViewHolder2 = avatarDecorationViewHolder;
            PatchProxy.accessDispatch(objArr2, avatarDecorationViewHolder2, AvatarDecorationViewHolder.f61787a, false, 67946, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(DecorationAdapter.this.mItems) && i2 < DecorationAdapter.this.mItems.size()) {
            avatarDecorationViewHolder.f61788b.setImageResource(((Integer) DecorationAdapter.this.mItems.get(i2)).intValue());
        }
        int i3 = 4;
        if (!DecorationAdapter.this.f61783b) {
            imageView = avatarDecorationViewHolder.f61789c;
            if (DecorationAdapter.this.f61784c == i2) {
                i3 = 0;
            }
        } else if (DecorationAdapter.this.f61784c != i2) {
            imageView = avatarDecorationViewHolder.f61789c;
        } else {
            Boolean bool = DecorationAdapter.this.f61786e.get(Integer.valueOf(i));
            ImageView imageView2 = avatarDecorationViewHolder.f61789c;
            if (bool != null && bool.booleanValue()) {
                i3 = 0;
            }
            imageView2.setVisibility(i3);
            avatarDecorationViewHolder.itemView.setOnClickListener(new l(avatarDecorationViewHolder, i2));
        }
        imageView.setVisibility(i3);
        avatarDecorationViewHolder.itemView.setOnClickListener(new l(avatarDecorationViewHolder, i2));
    }
}
