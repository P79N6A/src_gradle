package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MvChooseCoverAdapter extends RecyclerView.Adapter<ChooseVideoCoverView.Adapter.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68681a;

    /* renamed from: b  reason: collision with root package name */
    private int f68682b;

    /* renamed from: c  reason: collision with root package name */
    private int f68683c;

    /* renamed from: d  reason: collision with root package name */
    private List<Bitmap> f68684d = new ArrayList(7);

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f68681a, false, 78056, new Class[0], Integer.TYPE)) {
            return this.f68684d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68681a, false, 78056, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(List<Bitmap> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f68681a, false, 78057, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68681a, false, 78057, new Class[]{List.class}, Void.TYPE);
        } else if (!j.a((Collection<T>) list)) {
            this.f68684d.clear();
            this.f68684d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public MvChooseCoverAdapter(int i, int i2) {
        this.f68682b = i;
        this.f68683c = i2;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        ChooseVideoCoverView.Adapter.ViewHolder viewHolder2 = (ChooseVideoCoverView.Adapter.ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f68681a, false, 78055, new Class[]{ChooseVideoCoverView.Adapter.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f68681a, false, 78055, new Class[]{ChooseVideoCoverView.Adapter.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Bitmap bitmap = this.f68684d.get(i2);
        if (bitmap != null) {
            viewHolder2.f71330a.setImageBitmap(bitmap);
        }
        if (i2 != 0) {
            getItemCount();
        }
        viewHolder2.f71330a.setPadding(0, 0, 0, 0);
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f68681a, false, 78054, new Class[]{ViewGroup.class, Integer.TYPE}, ChooseVideoCoverView.Adapter.ViewHolder.class)) {
            return (ChooseVideoCoverView.Adapter.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f68681a, false, 78054, new Class[]{ViewGroup.class, Integer.TYPE}, ChooseVideoCoverView.Adapter.ViewHolder.class);
        }
        ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ae0, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.f68683c;
        layoutParams.width = this.f68682b;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams);
        return new ChooseVideoCoverView.Adapter.ViewHolder(imageView);
    }
}
