package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.photo.local.ImageChooseFragmentB;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ImageChooseAdapterB extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55114a;

    /* renamed from: b  reason: collision with root package name */
    final Context f55115b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f55116c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public List<a> f55117d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f55118e;

    /* renamed from: f  reason: collision with root package name */
    public c f55119f;
    public b g;
    public ImageChooseFragmentB h;
    public final d i = d.a();
    public d.a j = new d.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55120a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55120a, false, 58474, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55120a, false, 58474, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            List<com.ss.android.ugc.aweme.music.b.a.a> a2 = ImageChooseAdapterB.this.i.a(1);
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.music.b.a.a a3 : a2) {
                arrayList.add(a.a(a3));
            }
            ImageChooseAdapterB.this.f55116c.clear();
            ImageChooseAdapterB.this.f55117d.clear();
            ImageChooseAdapterB.this.f55116c.addAll(arrayList);
            ImageChooseAdapterB.this.notifyDataSetChanged();
            ImageChooseAdapterB.this.h.a(0);
        }
    };
    private int k;
    private double l;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55135a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f55136b;

        /* renamed from: c  reason: collision with root package name */
        TextView f55137c;

        /* renamed from: d  reason: collision with root package name */
        FrameLayout f55138d;

        /* renamed from: e  reason: collision with root package name */
        View f55139e;

        /* renamed from: f  reason: collision with root package name */
        String f55140f;
        a g;
        int h;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55135a, false, 58481, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55135a, false, 58481, new Class[0], Void.TYPE);
                return;
            }
            this.f55137c.setText("");
            this.f55137c.setBackgroundResource(2130838038);
        }

        ViewHolder(View view) {
            super(view);
        }
    }

    public static class a extends com.ss.android.ugc.aweme.music.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55141a;

        /* renamed from: b  reason: collision with root package name */
        int f55142b = -1;

        private a(long j) {
            super(j);
        }

        public static a a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
            com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, null, f55141a, true, 58479, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f55141a, true, 58479, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, a.class);
            }
            a aVar3 = new a(aVar2.f56314d);
            aVar3.f56315e = aVar2.f56315e;
            aVar3.f56316f = aVar2.f56316f;
            aVar3.g = aVar2.g;
            aVar3.h = aVar2.h;
            aVar3.i = aVar2.i;
            aVar3.j = aVar2.j;
            aVar3.k = aVar2.k;
            aVar3.l = aVar2.l;
            aVar3.m = aVar2.m;
            return aVar3;
        }
    }

    public interface b {
    }

    public interface c {
        void a(View view, com.ss.android.ugc.aweme.music.b.a.a aVar);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f55114a, false, 58469, new Class[0], Integer.TYPE)) {
            return this.f55116c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55114a, false, 58469, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55114a, false, 58473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55114a, false, 58473, new Class[0], Void.TYPE);
            return;
        }
        if (this.f55117d != null) {
            for (a aVar : this.f55117d) {
                aVar.f55142b = -1;
            }
            this.f55117d.clear();
        }
    }

    public final void a(Collection<? extends a> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, this, f55114a, false, 58460, new Class[]{Collection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection}, this, f55114a, false, 58460, new Class[]{Collection.class}, Void.TYPE);
            return;
        }
        this.f55116c.clear();
        this.f55116c.addAll(collection);
        notifyDataSetChanged();
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55114a, false, 58466, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55114a, false, 58466, new Class[]{View.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f55114a, false, 58462, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f55114a, false, 58462, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.f55115b).inflate(C0906R.layout.s3, viewGroup2, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f55136b = (RemoteImageView) inflate.findViewById(C0906R.id.bm8);
        viewHolder.f55137c = (TextView) inflate.findViewById(C0906R.id.arj);
        viewHolder.f55138d = (FrameLayout) inflate.findViewById(C0906R.id.afr);
        viewHolder.f55139e = inflate.findViewById(C0906R.id.cp0);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        final ViewHolder viewHolder2;
        final a aVar;
        int i3;
        float f2;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f55114a, false, 58463, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f55114a, false, 58463, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewHolder viewHolder3 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder3, Integer.valueOf(i2)}, this, f55114a, false, 58464, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder3, Integer.valueOf(i2)}, this, f55114a, false, 58464, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a((View) viewHolder3.f55136b);
        a(viewHolder3.f55139e);
        a aVar2 = this.f55116c.get(i4);
        viewHolder3.g = aVar2;
        viewHolder3.h = i4;
        if (PatchProxy.isSupport(new Object[]{viewHolder3}, this, f55114a, false, 58465, new Class[]{ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder3}, this, f55114a, false, 58465, new Class[]{ViewHolder.class}, Void.TYPE);
            viewHolder2 = viewHolder3;
            aVar = aVar2;
        } else {
            FrameLayout frameLayout = viewHolder3.f55138d;
            if (this.f55118e) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            float f3 = 1.0f;
            if (viewHolder3.g.f55142b >= 0) {
                viewHolder3.f55139e.setVisibility(0);
                int i5 = viewHolder3.g.f55142b;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i5)}, viewHolder3, ViewHolder.f55135a, false, 58480, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr = {Integer.valueOf(i5)};
                    viewHolder2 = viewHolder3;
                    aVar = aVar2;
                    PatchProxy.accessDispatch(objArr, viewHolder2, ViewHolder.f55135a, false, 58480, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    viewHolder2 = viewHolder3;
                    aVar = aVar2;
                    viewHolder2.f55137c.setText(String.valueOf(i5));
                    viewHolder2.f55137c.setBackgroundResource(2130838039);
                }
                f2 = 1.0f;
                f3 = 1.1f;
            } else {
                viewHolder2 = viewHolder3;
                aVar = aVar2;
                viewHolder2.a();
                viewHolder2.f55139e.setVisibility(4);
                if (this.f55117d.size() >= 12) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
            }
            if (viewHolder2.f55136b.getAlpha() != f2) {
                viewHolder2.f55136b.setAlpha(f2);
            }
            if (viewHolder2.f55136b.getScaleX() != f3) {
                viewHolder2.f55136b.setScaleX(f3);
                viewHolder2.f55136b.setScaleY(f3);
            }
        }
        String str = "file://" + aVar.f56315e;
        if (!TextUtils.equals(viewHolder2.f55140f, str)) {
            viewHolder2.f55140f = str;
            com.ss.android.ugc.aweme.base.c.a(viewHolder2.f55136b, viewHolder2.f55140f, this.k, this.k);
        }
        viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55122a;

            public final void onClick(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f55122a, false, 58475, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55122a, false, 58475, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (viewHolder2.g.f55142b >= 0 || ImageChooseAdapterB.this.f55117d.size() < 12) {
                    z = false;
                }
                if (!z) {
                    ImageChooseAdapterB.this.f55119f.a(view, aVar);
                }
            }
        });
        viewHolder2.f55138d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55126a;

            public final void onClick(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f55126a, false, 58476, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55126a, false, 58476, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                i.a(true, false);
                ImageChooseAdapterB imageChooseAdapterB = ImageChooseAdapterB.this;
                ViewHolder viewHolder = viewHolder2;
                if (PatchProxy.isSupport(new Object[]{viewHolder}, imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58467, new Class[]{ViewHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{viewHolder}, imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58467, new Class[]{ViewHolder.class}, Void.TYPE);
                } else if (viewHolder.g.f55142b >= 0) {
                    int i = viewHolder.g.f55142b;
                    viewHolder.g.f55142b = -1;
                    viewHolder.a();
                    viewHolder.f55139e.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(viewHolder) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55129a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ ViewHolder f55130b;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f55129a, false, 58477, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f55129a, false, 58477, new Class[0], Void.TYPE);
                                return;
                            }
                            this.f55130b.f55139e.setVisibility(4);
                            this.f55130b.f55139e.setAlpha(1.0f);
                            ImageChooseAdapterB.this.notifyItemChanged(this.f55130b.h);
                        }

                        {
                            this.f55130b = r2;
                        }
                    }).start();
                    viewHolder.f55136b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                    int i2 = 0;
                    for (int i3 = 0; i3 < imageChooseAdapterB.f55117d.size(); i3++) {
                        a aVar = imageChooseAdapterB.f55117d.get(i3);
                        if (aVar.f56314d == viewHolder.g.f56314d) {
                            i2 = i3;
                        }
                        if (aVar.f55142b > i) {
                            aVar.f55142b--;
                        }
                    }
                    imageChooseAdapterB.f55117d.remove(i2);
                    imageChooseAdapterB.notifyDataSetChanged();
                    if (imageChooseAdapterB.g != null) {
                        imageChooseAdapterB.f55117d.size();
                    }
                } else if (imageChooseAdapterB.f55117d.size() >= 12) {
                    com.bytedance.ies.dmt.ui.d.a.b(imageChooseAdapterB.f55115b, imageChooseAdapterB.f55115b.getString(C0906R.string.sr)).a();
                } else {
                    a aVar2 = viewHolder.g;
                    if (PatchProxy.isSupport(new Object[]{aVar2}, imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58468, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, imageChooseAdapterB, ImageChooseAdapterB.f55114a, false, 58468, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Boolean.TYPE)).booleanValue();
                    } else if (((float) aVar2.l) > ((float) aVar2.m) * 2.2f || ((float) aVar2.m) > ((float) aVar2.l) * 2.2f) {
                        com.bytedance.ies.dmt.ui.d.a.c(imageChooseAdapterB.f55115b, (int) C0906R.string.c6q).a();
                        z = false;
                    } else {
                        e.a().a(aVar2.f56315e, co.IMAGE);
                    }
                    if (z) {
                        viewHolder.f55136b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable(viewHolder) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55132a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ ViewHolder f55133b;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f55132a, false, 58478, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f55132a, false, 58478, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (ImageChooseAdapterB.this.f55117d.size() == 12) {
                                    ImageChooseAdapterB.this.notifyDataSetChanged();
                                } else {
                                    ImageChooseAdapterB.this.f55117d.add(this.f55133b.g);
                                    this.f55133b.g.f55142b = ImageChooseAdapterB.this.f55117d.size();
                                    if (ImageChooseAdapterB.this.f55117d.size() == 12) {
                                        ImageChooseAdapterB.this.notifyDataSetChanged();
                                    } else {
                                        ImageChooseAdapterB.this.notifyItemChanged(this.f55133b.h);
                                    }
                                }
                                if (ImageChooseAdapterB.this.g != null) {
                                    ImageChooseAdapterB.this.f55117d.size();
                                }
                            }

                            {
                                this.f55133b = r2;
                            }
                        }).start();
                        viewHolder.f55139e.setAlpha(0.0f);
                        viewHolder.f55139e.setVisibility(0);
                        viewHolder.f55139e.animate().alpha(1.0f).setDuration(300).start();
                    }
                }
            }
        });
    }

    public ImageChooseAdapterB(Context context, ImageChooseFragmentB imageChooseFragmentB, int i2, double d2, float f2, int i3) {
        this.f55115b = context;
        this.l = 1.3d;
        this.h = imageChooseFragmentB;
        context.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.k = ((UIUtils.getScreenWidth(context) - ((i2 - 1) * ((int) UIUtils.dip2Px(this.f55115b, 1.5f)))) + 0) / i2;
        this.f55118e = true;
        this.i.a(this.j);
    }
}
