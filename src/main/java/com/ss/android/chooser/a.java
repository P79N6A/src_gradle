package com.ss.android.chooser;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.chooser.e;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class a extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f27947a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Set<f> f27948b = new HashSet(9);

    /* renamed from: c  reason: collision with root package name */
    int f27949c;

    /* renamed from: d  reason: collision with root package name */
    int f27950d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27951e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27952f;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public final e j = e.a();
    e.d k = new e.d() {
        public final void a() {
            a.this.f27948b.clear();
            a.this.f27948b.addAll(a.this.j.e());
        }
    };
    e.b l = new e.b() {
        public final void a(int i) {
            a.this.f27947a.clear();
            a.this.f27947a.addAll(a.this.j.b(i));
            a.this.notifyDataSetChanged();
        }
    };
    private final Context m;
    private final int n;
    private final int o;
    private int p = 0;
    private int q;
    private double r;

    /* renamed from: com.ss.android.chooser.a$a  reason: collision with other inner class name */
    static class C0328a {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f27958a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f27959b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f27960c;

        /* renamed from: d  reason: collision with root package name */
        TextView f27961d;

        /* renamed from: e  reason: collision with root package name */
        TextView f27962e;

        /* renamed from: f  reason: collision with root package name */
        View f27963f;

        C0328a() {
        }
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final int getCount() {
        return this.f27947a.size();
    }

    /* renamed from: a */
    public final f getItem(int i2) {
        return this.f27947a.get(i2);
    }

    public final void a(Collection<? extends f> collection, Collection<? extends f> collection2) {
        this.f27947a.clear();
        this.f27947a.addAll(collection);
        this.f27948b.clear();
        this.f27948b.addAll(collection2);
        notifyDataSetChanged();
    }

    public final void a(View view, f fVar) {
        String str;
        boolean z = false;
        if (this.f27948b.contains(fVar)) {
            e eVar = this.j;
            if (fVar != null) {
                if (eVar.g.contains(fVar)) {
                    eVar.g.remove(fVar);
                }
                eVar.c();
            }
        } else if (this.j.f() >= this.o) {
            if (this.o > 1) {
                str = this.m.getString(C0906R.string.bb0, new Object[]{Integer.valueOf(this.o)});
            } else {
                str = this.m.getString(C0906R.string.bay);
            }
            UIUtils.displayToast(this.m, str);
            return;
        } else {
            this.j.a(fVar);
            z = true;
        }
        view.setSelected(z);
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        C0328a aVar;
        int i3;
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.m).inflate(C0906R.layout.aa5, null);
            aVar = new C0328a();
            aVar.f27958a = (SimpleDraweeView) view.findViewById(C0906R.id.bm8);
            aVar.f27959b = (ImageView) view.findViewById(C0906R.id.bm7);
            aVar.f27961d = (TextView) view.findViewById(R.id.media_device);
            aVar.f27960c = (ImageView) view.findViewById(R.id.media_selected_indicator);
            aVar.f27962e = (TextView) view.findViewById(C0906R.id.ds2);
            aVar.f27963f = view.findViewById(C0906R.id.cp0);
            view.setTag(aVar);
        } else {
            aVar = (C0328a) view.getTag();
        }
        ViewGroup.LayoutParams layoutParams = aVar.f27958a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.p;
            double d2 = (double) this.p;
            double d3 = this.r;
            Double.isNaN(d2);
            layoutParams.height = (int) (d2 * d3);
        }
        ImageView imageView = aVar.f27960c;
        if (this.n == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        final f fVar = this.f27947a.get(i2);
        if (fVar.f27989a == -1) {
            aVar.f27958a.setImageBitmap(null);
            aVar.f27959b.setVisibility(4);
            aVar.f27962e.setVisibility(4);
            aVar.f27963f.setVisibility(4);
            aVar.f27961d.setVisibility(0);
            aVar.f27960c.setVisibility(4);
            int i4 = fVar.f27992d;
            if (i4 == 0) {
                aVar.f27961d.setCompoundDrawablesWithIntrinsicBounds(0, 2130839114, 0, 0);
                aVar.f27961d.setText(C0906R.string.bb6);
            } else if (1 == i4) {
                aVar.f27961d.setCompoundDrawablesWithIntrinsicBounds(0, 2130839113, 0, 0);
                aVar.f27961d.setText(C0906R.string.bb5);
            }
            return view;
        }
        aVar.f27961d.setVisibility(4);
        aVar.f27962e.setVisibility(4);
        aVar.f27960c.setSelected(this.f27948b.contains(fVar));
        final ImageView imageView2 = aVar.f27960c;
        aVar.f27960c.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                a.this.a(imageView2, fVar);
            }
        });
        int i5 = fVar.f27992d;
        if (i5 == 2) {
            aVar.f27959b.setVisibility(0);
            aVar.f27959b.getDrawable().setLevel(fVar.f27992d);
        } else {
            aVar.f27959b.setVisibility(4);
        }
        if (1 == i5) {
            aVar.f27962e.setVisibility(0);
            if (this.g != -1) {
                aVar.f27962e.setTextSize(2, (float) this.g);
            }
            if (this.h != -1) {
                aVar.f27962e.setTextColor(this.h);
            }
            if (this.i != -1) {
                aVar.f27962e.setShadowLayer(1.0f, 0.0f, 1.0f, this.i);
            }
            if (!this.f27951e) {
                aVar.f27962e.setBackgroundResource(0);
            } else {
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.setCornersRadius(UIUtils.dip2Px(this.m, 2.0f));
                GenericDraweeHierarchy build = new GenericDraweeHierarchyBuilder(this.m.getResources()).build();
                build.setRoundingParams(roundingParams);
                aVar.f27958a.setHierarchy(build);
                aVar.f27962e.setBackgroundResource(2130840224);
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.m.getResources(), 2130841706);
                aVar.f27962e.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.m, 2.0f));
                a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                aVar.f27962e.setCompoundDrawables(a2, null, null, null);
            }
            int round = Math.round((float) (fVar.f27993e / 1000));
            int i6 = round * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            if (i6 < this.f27949c || i6 > this.f27950d) {
                aVar.f27963f.setVisibility(0);
            } else {
                aVar.f27963f.setVisibility(4);
            }
            TextView textView = aVar.f27962e;
            int i7 = round % 60;
            int i8 = round / 60;
            int i9 = i8 / 60;
            int i10 = i8 % 60;
            if (i9 == 0) {
                str = String.format(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i7)});
            } else {
                str = String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i7)});
            }
            textView.setText(str);
        } else {
            aVar.f27962e.setVisibility(4);
            aVar.f27963f.setVisibility(4);
        }
        aVar.f27958a.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(aVar.f27958a.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + fVar.f27990b)).setResizeOptions(new ResizeOptions(this.p, this.p)).build())).build());
        return view;
    }

    public a(Context context, int i2, int i3, int i4, double d2, int i5, int i6) {
        this.m = context;
        this.n = i2;
        this.o = i3;
        this.q = i4;
        this.r = d2;
        this.p = ((UIUtils.getScreenWidth(context) - ((this.q - 1) * (i5 != -1 ? (int) UIUtils.dip2Px(this.m, (float) i5) : context.getResources().getDimensionPixelOffset(C0906R.dimen.ij)))) - (i6 * 2)) / this.q;
    }
}
