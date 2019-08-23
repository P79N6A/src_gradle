package com.bytedance.android.livesdk.chatroom.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class UserFeatureLabelListAdapter extends RecyclerView.Adapter<LabelViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11794a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f11795b;

    /* renamed from: c  reason: collision with root package name */
    private List<ImageModel> f11796c;

    public static class LabelViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11797a;

        /* renamed from: b  reason: collision with root package name */
        final int f11798b = ac.a(16.0f);

        /* renamed from: c  reason: collision with root package name */
        ImageView f11799c = ((ImageView) this.itemView.findViewById(C0906R.id.d87));

        public LabelViewHolder(View view) {
            super(view);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f11794a, false, 6460, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11794a, false, 6460, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f11796c == null) {
            return 0;
        } else {
            return this.f11796c.size();
        }
    }

    public final void a(List<ImageModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f11794a, false, 6457, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f11794a, false, 6457, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            if (this.f11796c == null) {
                this.f11796c = new ArrayList();
            }
            this.f11796c.clear();
            this.f11796c.addAll(list);
            notifyDataSetChanged();
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11794a, false, 6458, new Class[]{ViewGroup.class, Integer.TYPE}, LabelViewHolder.class)) {
            return new LabelViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.alq, viewGroup2, false));
        }
        return (LabelViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11794a, false, 6458, new Class[]{ViewGroup.class, Integer.TYPE}, LabelViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        LabelViewHolder labelViewHolder = (LabelViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{labelViewHolder, Integer.valueOf(i)}, this, f11794a, false, 6459, new Class[]{LabelViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{labelViewHolder, Integer.valueOf(i)}, this, f11794a, false, 6459, new Class[]{LabelViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(this.f11796c) && i2 < this.f11796c.size()) {
            ImageModel imageModel = this.f11796c.get(i2);
            View.OnClickListener onClickListener = this.f11795b;
            if (PatchProxy.isSupport(new Object[]{imageModel, onClickListener}, labelViewHolder, LabelViewHolder.f11797a, false, 6461, new Class[]{ImageModel.class, View.OnClickListener.class}, Void.TYPE)) {
                LabelViewHolder labelViewHolder2 = labelViewHolder;
                PatchProxy.accessDispatch(new Object[]{imageModel, onClickListener}, labelViewHolder2, LabelViewHolder.f11797a, false, 6461, new Class[]{ImageModel.class, View.OnClickListener.class}, Void.TYPE);
            } else if (imageModel != null) {
                b.a(labelViewHolder.f11799c, imageModel, (q.a) new q.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11800a;

                    public final void a(ImageModel imageModel) {
                    }

                    public final void a(ImageModel imageModel, Exception exc) {
                    }

                    public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                        if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f11800a, false, 6462, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f11800a, false, 6462, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i2 > 0 && i > 0) {
                            ViewGroup.LayoutParams layoutParams = LabelViewHolder.this.f11799c.getLayoutParams();
                            int i3 = LabelViewHolder.this.f11798b;
                            layoutParams.height = i3;
                            layoutParams.width = (i3 * i) / i2;
                            LabelViewHolder.this.f11799c.setLayoutParams(layoutParams);
                        }
                    }
                });
                UIUtils.setClickListener(true, labelViewHolder.itemView, onClickListener);
                labelViewHolder.itemView.setTag(imageModel);
            }
        }
    }
}
