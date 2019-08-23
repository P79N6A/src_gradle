package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LinkStickerAdapter extends RecyclerView.Adapter<StickerViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11563a;

    /* renamed from: b  reason: collision with root package name */
    public a f11564b;

    /* renamed from: c  reason: collision with root package name */
    public String f11565c = "";

    /* renamed from: d  reason: collision with root package name */
    private List<com.bytedance.android.livesdk.sticker.b.a> f11566d;

    /* renamed from: e  reason: collision with root package name */
    private int f11567e;

    /* renamed from: f  reason: collision with root package name */
    private int f11568f;
    private View.OnClickListener g = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11569a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11570c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11569a, true, 5937, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11569a, true, 5937, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkStickerAdapter.java", AnonymousClass1.class);
            f11570c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.LinkStickerAdapter$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 61);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11569a, false, 5936, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11569a, false, 5936, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f11570c, this, this, view));
            if (view.getTag(C0906R.id.ar6) instanceof com.bytedance.android.livesdk.sticker.b.a) {
                com.bytedance.android.livesdk.sticker.b.a aVar = (com.bytedance.android.livesdk.sticker.b.a) view.getTag(C0906R.id.ar6);
                if (!TextUtils.equals(LinkStickerAdapter.this.f11565c, aVar.a())) {
                    LinkStickerAdapter.this.f11565c = aVar.a();
                    LinkStickerAdapter.this.notifyDataSetChanged();
                    if (TextUtils.equals(LinkStickerAdapter.this.f11565c, "")) {
                        LinkStickerAdapter.this.f11564b.b(aVar);
                    } else if (aVar.s) {
                        LinkStickerAdapter.this.f11564b.b(aVar);
                    } else {
                        if (!aVar.t) {
                            LinkStickerAdapter.this.f11564b.a(aVar);
                        }
                    }
                }
            }
        }
    };

    class StickerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f11572a;

        /* renamed from: b  reason: collision with root package name */
        View f11573b;

        /* renamed from: c  reason: collision with root package name */
        View f11574c;

        /* renamed from: d  reason: collision with root package name */
        HSImageView f11575d;

        /* renamed from: e  reason: collision with root package name */
        View f11576e;

        StickerViewHolder(View view) {
            super(view);
            this.f11572a = view.findViewById(C0906R.id.bb2);
            this.f11573b = view.findViewById(C0906R.id.ces);
            this.f11574c = view.findViewById(C0906R.id.j9);
            this.f11575d = (HSImageView) view.findViewById(C0906R.id.ar6);
            this.f11576e = view.findViewById(C0906R.id.biy);
        }
    }

    interface a {
        void a(com.bytedance.android.livesdk.sticker.b.a aVar);

        void b(com.bytedance.android.livesdk.sticker.b.a aVar);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f11563a, false, 5935, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11563a, false, 5935, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f11566d == null) {
            return 0;
        } else {
            return this.f11566d.size();
        }
    }

    private com.bytedance.android.livesdk.sticker.b.a a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f11563a, false, 5932, new Class[]{String.class}, com.bytedance.android.livesdk.sticker.b.a.class)) {
            return (com.bytedance.android.livesdk.sticker.b.a) PatchProxy.accessDispatch(new Object[]{str2}, this, f11563a, false, 5932, new Class[]{String.class}, com.bytedance.android.livesdk.sticker.b.a.class);
        }
        for (com.bytedance.android.livesdk.sticker.b.a next : this.f11566d) {
            if (TextUtils.equals(str2, next.a())) {
                return next;
            }
        }
        return null;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11563a, false, 5933, new Class[]{ViewGroup.class, Integer.TYPE}, StickerViewHolder.class)) {
            return (StickerViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f11563a, false, 5933, new Class[]{ViewGroup.class, Integer.TYPE}, StickerViewHolder.class);
        }
        return new StickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ams, viewGroup2, false));
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        StickerViewHolder stickerViewHolder = (StickerViewHolder) viewHolder;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{stickerViewHolder, Integer.valueOf(i)}, this, f11563a, false, 5934, new Class[]{StickerViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{stickerViewHolder, Integer.valueOf(i)}, this, f11563a, false, 5934, new Class[]{StickerViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.sticker.b.a aVar = this.f11566d.get(i);
        if (TextUtils.equals(aVar.a(), "")) {
            stickerViewHolder.f11575d.setImageResource(2130841213);
        } else {
            com.bytedance.android.livesdk.chatroom.f.b.a(stickerViewHolder.f11575d, aVar.f17250b.a());
        }
        if (!TextUtils.equals(this.f11565c, aVar.a()) || TextUtils.equals(aVar.a(), "")) {
            stickerViewHolder.f11574c.setVisibility(8);
        } else {
            stickerViewHolder.f11574c.setVisibility(0);
        }
        stickerViewHolder.f11575d.setTag(C0906R.id.ar6, aVar);
        stickerViewHolder.f11575d.setOnClickListener(this.g);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z2 = false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) stickerViewHolder.f11572a.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ConstraintLayout.LayoutParams(-2, -1);
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) stickerViewHolder.f11573b.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ConstraintLayout.LayoutParams(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams3 = stickerViewHolder.itemView.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            layoutParams.width = this.f11567e;
            layoutParams2.width = this.f11567e / 2;
        } else if (z2) {
            layoutParams.width = this.f11567e / 2;
            layoutParams2.width = this.f11567e;
        } else {
            layoutParams.width = this.f11567e / 2;
            layoutParams2.width = this.f11567e / 2;
        }
        layoutParams3.width = layoutParams.width + layoutParams2.width + this.f11568f;
        stickerViewHolder.itemView.setLayoutParams(layoutParams3);
        stickerViewHolder.f11572a.setLayoutParams(layoutParams);
        stickerViewHolder.f11573b.setLayoutParams(layoutParams2);
        if (aVar.t) {
            stickerViewHolder.f11576e.setVisibility(0);
        } else {
            stickerViewHolder.f11576e.setVisibility(8);
        }
    }

    LinkStickerAdapter(Context context, List<com.bytedance.android.livesdk.sticker.b.a> list, a aVar) {
        this.f11566d = list;
        this.f11564b = aVar;
        int screenWidth = UIUtils.getScreenWidth(context);
        this.f11568f = (int) UIUtils.dip2Px(context, 56.0f);
        this.f11567e = (screenWidth - (this.f11568f * 5)) / 6;
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar, int i) {
        String str2 = str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, aVar, Integer.valueOf(i)}, this, f11563a, false, 5931, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar, Integer.valueOf(i)}, this, f11563a, false, 5931, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class, Integer.TYPE}, Void.TYPE);
        } else if (com.bytedance.android.livesdk.sticker.c.a.f17263d.equals(str)) {
            com.bytedance.android.livesdk.sticker.b.a a2 = a(aVar.a());
            if (a2 != null) {
                if (i2 == 2) {
                    a2.t = false;
                    a2.s = true;
                    if (TextUtils.equals(a2.a(), this.f11565c)) {
                        this.f11564b.b(a2);
                    }
                } else if (i2 == 3) {
                    a2.t = false;
                } else if (i2 == 1) {
                    a2.t = true;
                }
                notifyDataSetChanged();
            }
        }
    }
}
