package com.ss.android.ugc.aweme.web.upload;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.ArrayList;
import java.util.List;

public class ImageChooseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76864a;

    /* renamed from: b  reason: collision with root package name */
    final Context f76865b;

    /* renamed from: c  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.music.b.a.a> f76866c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    List<Integer> f76867d;

    /* renamed from: e  reason: collision with root package name */
    List<Integer> f76868e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f76869f;
    public int g;
    public boolean h;
    public b i;
    public a j;
    private int k;
    private double l;
    private boolean m;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76878a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f76879b;

        /* renamed from: c  reason: collision with root package name */
        TextView f76880c;

        /* renamed from: d  reason: collision with root package name */
        FrameLayout f76881d;

        /* renamed from: e  reason: collision with root package name */
        View f76882e;

        /* renamed from: f  reason: collision with root package name */
        String f76883f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f76878a, false, 90103, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76878a, false, 90103, new Class[0], Void.TYPE);
                return;
            }
            this.f76880c.setText("");
            this.f76880c.setBackgroundResource(2130838038);
        }

        ViewHolder(View view) {
            super(view);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76878a, false, 90102, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76878a, false, 90102, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f76880c.setText(String.valueOf(i + 1));
            this.f76880c.setBackgroundResource(2130838039);
        }
    }

    public interface a {
        void a(List<String> list);
    }

    public interface b {
        void a(View view, String str);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f76864a, false, 90097, new Class[0], Integer.TYPE)) {
            return this.f76866c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76864a, false, 90097, new Class[0], Integer.TYPE)).intValue();
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76864a, false, 90094, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76864a, false, 90094, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams == null || layoutParams.width == this.k)) {
            int i2 = layoutParams.height;
            double d2 = (double) this.k;
            double d3 = this.l;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = this.k;
                double d4 = (double) this.k;
                double d5 = this.l;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f76864a, false, 90090, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f76864a, false, 90090, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.f76865b).inflate(C0906R.layout.u7, viewGroup2, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f76879b = (RemoteImageView) inflate.findViewById(C0906R.id.bm8);
        viewHolder.f76880c = (TextView) inflate.findViewById(C0906R.id.arj);
        viewHolder.f76881d = (FrameLayout) inflate.findViewById(C0906R.id.afr);
        viewHolder.f76882e = inflate.findViewById(C0906R.id.cp0);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        float f2;
        float f3;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f76864a, false, 90091, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f76864a, false, 90091, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f76864a, false, 90092, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f76864a, false, 90092, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(viewHolder2.f76879b);
        a(viewHolder2.f76882e);
        com.ss.android.ugc.aweme.music.b.a.a aVar = this.f76866c.get(i3);
        int intValue = this.f76867d.get(i3).intValue();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), viewHolder2}, this, f76864a, false, 90093, new Class[]{Integer.TYPE, ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), viewHolder2}, this, f76864a, false, 90093, new Class[]{Integer.TYPE, ViewHolder.class}, Void.TYPE);
        } else {
            float f4 = 1.0f;
            if (intValue >= 0) {
                viewHolder2.a(intValue);
                viewHolder2.f76882e.setVisibility(0);
                f2 = 1.1f;
            } else {
                viewHolder2.a();
                viewHolder2.f76882e.setVisibility(4);
                if (this.f76868e.size() >= this.g) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                f4 = f3;
                f2 = 1.0f;
            }
            if (viewHolder2.f76879b.getAlpha() != f4) {
                viewHolder2.f76879b.setAlpha(f4);
            }
            if (viewHolder2.f76879b.getScaleX() != f2) {
                viewHolder2.f76879b.setScaleX(f2);
                viewHolder2.f76879b.setScaleY(f2);
            }
        }
        String str = "file://" + aVar.f56315e;
        if (!TextUtils.equals(viewHolder2.f76883f, str)) {
            viewHolder2.f76883f = str;
            c.a(viewHolder2.f76879b, viewHolder2.f76883f, this.k, this.k);
        }
        viewHolder2.itemView.setOnClickListener(new a(this, intValue, str));
        viewHolder2.f76881d.setOnClickListener(new b(this, viewHolder2, aVar));
    }

    public ImageChooseAdapter(Context context, int i2, int i3, Boolean bool, double d2, float f2, int i4) {
        this.f76865b = context;
        this.l = 1.0d;
        this.g = i3;
        this.m = bool.booleanValue();
        context.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.k = ((UIUtils.getScreenWidth(context) - (((int) UIUtils.dip2Px(this.f76865b, 1.5f)) * 3)) + 0) / 4;
    }
}
