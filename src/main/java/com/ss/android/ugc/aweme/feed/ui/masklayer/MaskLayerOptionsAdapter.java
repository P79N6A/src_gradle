package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.favorites.c.a;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.feed.adapter.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MaskLayerOption;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsViewHolder;
import com.ss.android.ugc.aweme.feed.ui.masklayer.a;
import com.ss.android.ugc.aweme.feed.ui.p;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class MaskLayerOptionsAdapter extends RecyclerView.Adapter<MaskLayerOptionsViewHolder> implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46684a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f46685b;

    /* renamed from: c  reason: collision with root package name */
    public final p f46686c;

    /* renamed from: d  reason: collision with root package name */
    public IShareService.ShareStruct f46687d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f46688e;

    /* renamed from: f  reason: collision with root package name */
    public List<MaskLayerOption> f46689f = new ArrayList();
    public String g;
    public DisLikeAwemeLayout.a h;
    private a i;

    public final void a(Exception exc) {
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f46684a, false, 43389, new Class[0], Integer.TYPE)) {
            return this.f46689f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46684a, false, 43389, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46684a, false, 43391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46684a, false, 43391, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = new a();
        }
        this.i.a(this);
        this.i.a(2, this.f46688e.getAid(), Integer.valueOf(this.f46688e.isCollected() ^ true ? 1 : 0));
    }

    public MaskLayerOption a(int i2) {
        int i3;
        int i4;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46684a, false, 43384, new Class[]{Integer.TYPE}, MaskLayerOption.class)) {
            return (MaskLayerOption) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46684a, false, 43384, new Class[]{Integer.TYPE}, MaskLayerOption.class);
        }
        int cn2 = AbTestManager.a().cn();
        int i6 = 2130839766;
        int i7 = -1;
        if (i5 == 1) {
            if (cn2 == 0) {
                i7 = C0906R.string.c1g;
            } else {
                i7 = C0906R.string.f2;
            }
            i6 = (!com.ss.android.g.a.a() || !a.C0563a.a()) ? 2130839768 : 2130839769;
        } else if (i5 == 2) {
            if (cn2 != 2) {
                i4 = C0906R.string.cdz;
            } else {
                i4 = C0906R.string.f4;
            }
            i6 = com.ss.android.g.a.b() ? a.C0563a.a() ? 2130839773 : 2130839772 : (!com.ss.android.g.a.c() || !a.C0563a.a()) ? 2130839761 : 2130839762;
        } else if (i5 == 3) {
            if (a.C0563a.a()) {
                i3 = C0906R.string.c3c;
            } else {
                i3 = C0906R.string.bhg;
            }
            if (com.ss.android.g.a.a() && a.C0563a.a()) {
                i6 = 2130839767;
            }
        } else if (i5 == 5) {
            i7 = C0906R.string.dpt;
            i6 = 2130839760;
        } else {
            i6 = -1;
        }
        return new MaskLayerOption(i5, i6, i7);
    }

    public final void a(BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f46684a, false, 43398, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f46684a, false, 43398, new Class[]{BaseResponse.class}, Void.TYPE);
        } else if (this.f46688e != null) {
            boolean z = !this.f46688e.isCollected();
            this.f46688e.setCollectStatus(z ? 1 : 0);
            com.ss.android.ugc.aweme.feed.a.a().d(this.f46688e.getAid(), (int) z);
        }
    }

    public MaskLayerOptionsAdapter(Context context, p pVar) {
        this.f46685b = context;
        this.f46686c = pVar;
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        int i3;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f46684a, false, 43386, new Class[]{ViewGroup.class, Integer.TYPE}, MaskLayerOptionsViewHolder.class)) {
            return (MaskLayerOptionsViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f46684a, false, 43386, new Class[]{ViewGroup.class, Integer.TYPE}, MaskLayerOptionsViewHolder.class);
        }
        MaskLayerOptionsViewHolder.a aVar = MaskLayerOptionsViewHolder.f46690c;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar, MaskLayerOptionsViewHolder.a.f46693a, false, 43405, new Class[]{ViewGroup.class}, MaskLayerOptionsViewHolder.class)) {
            return (MaskLayerOptionsViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar, MaskLayerOptionsViewHolder.a.f46693a, false, 43405, new Class[]{ViewGroup.class}, MaskLayerOptionsViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        MaskLayerOptionsViewHolder.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[0], aVar2, MaskLayerOptionsViewHolder.a.f46693a, false, 43406, new Class[0], Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], aVar2, MaskLayerOptionsViewHolder.a.f46693a, false, 43406, new Class[0], Integer.TYPE)).intValue();
        } else if (a.C0563a.a()) {
            i3 = C0906R.layout.l2;
        } else {
            i3 = C0906R.layout.l1;
        }
        View inflate = from.inflate(i3, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new MaskLayerOptionsViewHolder(inflate);
    }

    public /* synthetic */ void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        int i4;
        int i5;
        MaskLayerOptionsViewHolder maskLayerOptionsViewHolder = (MaskLayerOptionsViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{maskLayerOptionsViewHolder, Integer.valueOf(i2)}, this, f46684a, false, 43387, new Class[]{MaskLayerOptionsViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{maskLayerOptionsViewHolder, Integer.valueOf(i2)}, this, f46684a, false, 43387, new Class[]{MaskLayerOptionsViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (a.C0563a.a()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) maskLayerOptionsViewHolder.itemView.getLayoutParams();
            layoutParams.width = a.f46697d.a(maskLayerOptionsViewHolder.itemView);
            maskLayerOptionsViewHolder.itemView.setLayoutParams(layoutParams);
        }
        MaskLayerOption maskLayerOption = this.f46689f.get(i2);
        if (com.ss.android.g.a.a()) {
            if (a.C0563a.a()) {
                i5 = C0906R.color.a7i;
            } else {
                i5 = C0906R.color.uj;
            }
            maskLayerOptionsViewHolder.f46692b.setTextColor(o.a(i5));
        }
        if (2 != maskLayerOption.mType || !this.f46688e.isCollected()) {
            maskLayerOptionsViewHolder.f46691a.setImageResource(maskLayerOption.mIconResId);
            maskLayerOptionsViewHolder.f46692b.setText(maskLayerOption.mTextResId);
        } else {
            ImageView imageView = maskLayerOptionsViewHolder.f46691a;
            if (PatchProxy.isSupport(new Object[0], this, f46684a, false, 43385, new Class[0], Integer.TYPE)) {
                i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46684a, false, 43385, new Class[0], Integer.TYPE)).intValue();
            } else {
                int i6 = 2130839764;
                if (com.ss.android.g.a.b()) {
                    if (a.C0563a.a()) {
                        i3 = 2130839771;
                    } else {
                        i3 = 2130839770;
                    }
                } else if (com.ss.android.g.a.c()) {
                    if (a.C0563a.a()) {
                        i6 = 2130839765;
                    }
                    i3 = i6;
                } else {
                    i3 = 2130839764;
                }
            }
            imageView.setImageResource(i3);
            TextView textView = maskLayerOptionsViewHolder.f46692b;
            if (AbTestManager.a().cn() != 2) {
                i4 = C0906R.string.po;
            } else {
                i4 = C0906R.string.ey;
            }
            textView.setText(i4);
            maskLayerOption.mDoOrCancel = false;
        }
        maskLayerOptionsViewHolder.itemView.setOnClickListener(new b(this, maskLayerOption));
        maskLayerOptionsViewHolder.itemView.setOnTouchListener(new c(this));
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i2, float f2) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), Float.valueOf(f2)}, this, f46684a, false, 43388, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), Float.valueOf(f2)}, this, f46684a, false, 43388, new Class[]{View.class, Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        view.animate().setDuration((long) i2).scaleX(f3).scaleY(f3).setInterpolator(new c()).start();
    }
}
