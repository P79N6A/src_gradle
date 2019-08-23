package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.BaseViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import java.util.List;

public class HorizonPhotoSelectAdapter extends RecyclerView.Adapter<PhotoHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50735a;

    /* renamed from: b  reason: collision with root package name */
    public int f50736b;

    /* renamed from: c  reason: collision with root package name */
    public int f50737c;

    /* renamed from: d  reason: collision with root package name */
    public List<i> f50738d;

    /* renamed from: e  reason: collision with root package name */
    private p f50739e;

    class PhotoHolder extends BaseViewHolder<i> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f50740c;

        /* renamed from: e  reason: collision with root package name */
        private TextView f50742e;

        /* renamed from: f  reason: collision with root package name */
        private RemoteImageView f50743f;
        private ImageView g;
        private View h;
        private View i;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f50740c, false, 50943, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50740c, false, 50943, new Class[0], Void.TYPE);
                return;
            }
            p.a((View.OnClickListener) this.f3361b, this.g, this.f50743f);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50740c, false, 50942, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50740c, false, 50942, new Class[0], Void.TYPE);
                return;
            }
            if (HorizonPhotoSelectAdapter.this.f50736b == 0) {
                HorizonPhotoSelectAdapter.this.f50736b = this.itemView.getResources().getDimensionPixelSize(C0906R.dimen.hb);
            }
            this.f50742e = (TextView) this.itemView.findViewById(C0906R.id.cn4);
            this.f50743f = (RemoteImageView) this.itemView.findViewById(C0906R.id.bxr);
            this.g = (ImageView) this.itemView.findViewById(C0906R.id.cn3);
            this.h = this.itemView.findViewById(C0906R.id.bxt);
            this.i = this.itemView.findViewById(C0906R.id.cn5);
        }

        public final void a(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f50740c, false, 50944, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f50740c, false, 50944, new Class[]{i.class}, Void.TYPE);
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f50743f.getLayoutParams();
            layoutParams.height = HorizonPhotoSelectAdapter.this.f50737c;
            layoutParams.width = Math.min((int) ((((float) HorizonPhotoSelectAdapter.this.f50737c) * ((float) iVar.a())) / ((float) iVar.b())), HorizonPhotoSelectAdapter.this.f50736b);
            this.f50743f.setLayoutParams(layoutParams);
            this.h.setLayoutParams(layoutParams);
            c.a(this.f50743f, "file://" + iVar.f50847b.f27990b, layoutParams.width, layoutParams.height);
            b(iVar);
            this.g.setTag(iVar);
            this.f50743f.setTag(iVar);
        }

        public final void b(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f50740c, false, 50945, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f50740c, false, 50945, new Class[]{i.class}, Void.TYPE);
            } else if (iVar2.f50848c) {
                m.a().a(this.f50743f, this.i, this.f50742e, this.g, this.h, iVar2.f50847b.f27990b);
                iVar2.f50848c = false;
            } else {
                m.a().a(this.f50742e, this.g, this.h, iVar2.f50847b.f27990b);
            }
        }

        private PhotoHolder(View view, p pVar) {
            super(view, pVar);
        }

        /* synthetic */ PhotoHolder(HorizonPhotoSelectAdapter horizonPhotoSelectAdapter, View view, p pVar, byte b2) {
            this(view, pVar);
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f50735a, false, 50941, new Class[0], Integer.TYPE)) {
            return this.f50738d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50735a, false, 50941, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(@NonNull PhotoHolder photoHolder, int i) {
        PhotoHolder photoHolder2 = photoHolder;
        if (PatchProxy.isSupport(new Object[]{photoHolder2, Integer.valueOf(i)}, this, f50735a, false, 50939, new Class[]{PhotoHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoHolder2, Integer.valueOf(i)}, this, f50735a, false, 50939, new Class[]{PhotoHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        photoHolder2.a(this.f50738d.get(i));
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f50735a, false, 50938, new Class[]{ViewGroup.class, Integer.TYPE}, PhotoHolder.class)) {
            return new PhotoHolder(this, View.inflate(viewGroup.getContext(), C0906R.layout.yh, null), this.f50739e, (byte) 0);
        }
        return (PhotoHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f50735a, false, 50938, new Class[]{ViewGroup.class, Integer.TYPE}, PhotoHolder.class);
    }

    public HorizonPhotoSelectAdapter(List<i> list, int i, p pVar) {
        this.f50738d = list;
        this.f50737c = i;
        this.f50739e = pVar;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i, @NonNull List list) {
        int i2 = i;
        List list2 = list;
        PhotoHolder photoHolder = (PhotoHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{photoHolder, Integer.valueOf(i), list2}, this, f50735a, false, 50940, new Class[]{PhotoHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoHolder, Integer.valueOf(i), list2}, this, f50735a, false, 50940, new Class[]{PhotoHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (list.isEmpty() || !TextUtils.equals((String) list2.get(0), "selectedStateChanged")) {
            onBindViewHolder(photoHolder, i2);
        } else {
            photoHolder.b(this.f50738d.get(i2));
        }
    }
}
