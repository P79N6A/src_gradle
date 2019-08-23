package com.bytedance.android.livesdk.gift.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.d.e;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.gift.o;
import com.bytedance.android.livesdk.utils.ag;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public abstract class BasePanelViewHolder<T extends b> extends RecyclerView.ViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f15017f;
    protected final Context g;
    TextView h;
    HSImageView i;
    View j;
    TextView k;
    ImageView l;
    ImageView m;
    public a n;
    public final float o = UIUtils.dip2Px(this.g, 13.0f);

    public interface a {
        void a(BasePanelViewHolder basePanelViewHolder, b bVar);
    }

    public abstract ComboTarget a();

    public BasePanelViewHolder(View view) {
        super(view);
        this.g = view.getContext();
        this.j = view;
        this.h = (TextView) view.findViewById(C0906R.id.bpn);
        this.i = (HSImageView) view.findViewById(C0906R.id.a1a);
        this.k = (TextView) view.findViewById(C0906R.id.a4q);
        this.l = (ImageView) view.findViewById(C0906R.id.a4r);
        this.m = (ImageView) view.findViewById(C0906R.id.baz);
    }

    public void a(@NonNull T t) {
        String substring;
        final T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f15017f, false, 9724, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f15017f, false, 9724, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.l.setVisibility(8);
        if (com.bytedance.android.live.uikit.a.a.j() && t.j() == -1) {
            this.h.setTextColor(this.g.getResources().getColor(e.a().c()));
        } else if (t.j() != 0) {
            this.h.setTextColor(t.j());
        } else {
            this.h.setTextColor(this.g.getResources().getColor(C0906R.color.a_i));
        }
        this.h.setText(t.i());
        if (com.bytedance.android.live.uikit.a.a.g()) {
            TextView textView = this.h;
            String i2 = t.i();
            if (PatchProxy.isSupport(new Object[]{textView, i2}, null, ag.f17575a, true, 13733, new Class[]{TextView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView, i2}, null, ag.f17575a, true, 13733, new Class[]{TextView.class, String.class}, Void.TYPE);
            } else {
                TextPaint paint = textView.getPaint();
                float measureText = paint.measureText(i2);
                float measureText2 = paint.measureText("一二三四五一二三");
                if (measureText > measureText2) {
                    while (measureText > measureText2) {
                        int codePointCount = i2.codePointCount(0, i2.length()) - 1;
                        if (PatchProxy.isSupport(new Object[]{i2, 0, Integer.valueOf(codePointCount)}, null, ag.f17575a, true, 13734, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, String.class)) {
                            substring = (String) PatchProxy.accessDispatch(new Object[]{i2, 0, Integer.valueOf(codePointCount)}, null, ag.f17575a, true, 13734, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, String.class);
                        } else {
                            substring = i2.substring(i2.offsetByCodePoints(0, 0), i2.offsetByCodePoints(0, codePointCount));
                        }
                        i2 = substring;
                        measureText = paint.measureText(i2);
                    }
                    i2 = i2 + "…";
                }
                textView.setText(i2);
            }
        }
        if (com.bytedance.android.live.uikit.a.a.j() && t.l() == -1711276033) {
            this.k.setTextColor(this.g.getResources().getColor(e.a().d()));
        } else if (t.l() != 0) {
            this.k.setTextColor(t.l());
        } else {
            this.k.setTextColor(this.g.getResources().getColor(C0906R.color.aei));
        }
        if (t2 != null && !TextUtils.isEmpty(t.k())) {
            this.k.setText(t.k());
        }
        if (t.m() == null || TextUtils.isEmpty(t.m().getUri())) {
            this.m.setVisibility(8);
        } else {
            this.m.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.a(this.m, t.m(), (q.a) new q.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15018a;

                public final void a(ImageModel imageModel) {
                }

                public final void a(ImageModel imageModel, Exception exc) {
                }

                public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                    int i3 = i;
                    int i4 = i2;
                    if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15018a, false, 9727, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f15018a, false, 9727, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!(i3 == 0 || i4 == 0)) {
                        ViewGroup.LayoutParams layoutParams = BasePanelViewHolder.this.m.getLayoutParams();
                        layoutParams.width = (int) (((float) i3) * (BasePanelViewHolder.this.o / ((float) i4)));
                        BasePanelViewHolder.this.m.setLayoutParams(layoutParams);
                    }
                }
            });
        }
        k.a(this.i, t.n(), (q.a) new q.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15020a;

            public final void a(ImageModel imageModel) {
            }

            public final void a(ImageModel imageModel, Exception exc) {
                if (PatchProxy.isSupport(new Object[]{imageModel, exc}, this, f15020a, false, 9729, new Class[]{ImageModel.class, Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel, exc}, this, f15020a, false, 9729, new Class[]{ImageModel.class, Exception.class}, Void.TYPE);
                    return;
                }
                if (t2.f15095a == 1) {
                    o.a(t2.o(), imageModel.getUri(), exc.getMessage());
                }
            }

            public final void a(ImageModel imageModel, int i, int i2, boolean z) {
                if (PatchProxy.isSupport(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f15020a, false, 9728, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageModel, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f15020a, false, 9728, new Class[]{ImageModel.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (t2.f15095a == 1) {
                    o.a(t2.o(), imageModel.getUri());
                }
            }
        });
        if (t2.f15097c) {
            this.j.setAlpha(0.32f);
        } else {
            this.j.setAlpha(1.0f);
        }
        this.j.setOnClickListener(new a(this, t2));
    }

    public void a(@NonNull T t, @NonNull List<Object> list) {
        if (PatchProxy.isSupport(new Object[]{t, list}, this, f15017f, false, 9725, new Class[]{b.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t, list}, this, f15017f, false, 9725, new Class[]{b.class, List.class}, Void.TYPE);
            return;
        }
        a(t);
    }
}
