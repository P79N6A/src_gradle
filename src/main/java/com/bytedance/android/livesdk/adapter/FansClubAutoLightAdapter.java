package com.bytedance.android.livesdk.adapter;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.paging.adapter.PagingAdapter;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FansClubAutoLightAdapter extends PagingAdapter<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8903a;

    class FansClubAutoLightViewHolder extends BaseViewHolder<k.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8904a;

        /* renamed from: d  reason: collision with root package name */
        public FansClubApi f8905d = ((FansClubApi) j.q().d().a(FansClubApi.class));

        /* renamed from: f  reason: collision with root package name */
        private HSImageView f8907f;
        private HSImageView g;
        private TextView h;
        private TextView i;
        private ImageView j;

        FansClubAutoLightViewHolder(View view) {
            super(view);
            this.f8907f = (HSImageView) view.findViewById(C0906R.id.ayr);
            this.h = (TextView) view.findViewById(C0906R.id.df7);
            this.g = (HSImageView) view.findViewById(C0906R.id.b2l);
            this.i = (TextView) view.findViewById(C0906R.id.dbl);
            this.j = (ImageView) view.findViewById(C0906R.id.b5s);
        }

        public final /* synthetic */ void a(Object obj, int i2) {
            int i3;
            k.a aVar = (k.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i2)}, this, f8904a, false, 3045, new Class[]{k.a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i2)}, this, f8904a, false, 3045, new Class[]{k.a.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                if (aVar.f11132b != null) {
                    com.bytedance.android.live.core.utils.k.a(this.f8907f, aVar.f11132b.getAvatarThumb());
                    this.h.setText(aVar.f11132b.getNickName());
                }
                if (!(aVar.f11131a == null || aVar.f11131a.f11134b == null)) {
                    this.i.setText(aVar.f11131a.f11134b.f11135a);
                    com.bytedance.android.live.core.utils.k.a(this.g, aVar.f11131a.f11134b.f11136b);
                    int i4 = aVar.f11131a.f11133a;
                    ImageView imageView = this.j;
                    if (i4 == 1) {
                        i3 = 2130841210;
                    } else {
                        i3 = 2130841208;
                    }
                    imageView.setImageResource(i3);
                    this.j.setOnClickListener(new a(this, i4, aVar));
                }
            }
        }
    }

    static class ItemComparator extends DiffUtil.ItemCallback<k.a> {
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
            return false;
        }

        public /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
            return false;
        }

        private ItemComparator() {
        }

        /* synthetic */ ItemComparator(byte b2) {
            this();
        }
    }

    public final int a() {
        return C0906R.layout.ahj;
    }

    public final /* bridge */ /* synthetic */ int a(int i, Object obj) {
        return 0;
    }

    public FansClubAutoLightAdapter() {
        super(new ItemComparator((byte) 0));
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f8903a, false, 3044, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f8903a, false, 3044, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new FansClubAutoLightViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aj3, viewGroup2, false));
    }
}
