package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.property.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55143a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55144b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.music.b.a.a> f55145c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Set<com.ss.android.ugc.aweme.music.b.a.a> f55146d = new HashSet(9);

    /* renamed from: e  reason: collision with root package name */
    public List<Integer> f55147e;

    /* renamed from: f  reason: collision with root package name */
    public List<Integer> f55148f;
    public boolean g;
    public a h;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public boolean l;
    public List<com.ss.android.ugc.aweme.music.b.a.a> m;
    public VideoChooseFragment n;
    w o;
    public final d p = d.a();
    d.c q = new d.c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55149a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55149a, false, 58508, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55149a, false, 58508, new Class[0], Void.TYPE);
                return;
            }
            MediaAdapter.this.f55146d.clear();
            MediaAdapter.this.f55146d.addAll(MediaAdapter.this.p.c());
        }
    };
    d.a r = new d.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55151a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55151a, false, 58509, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55151a, false, 58509, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (4 == i) {
                MediaAdapter.this.f55145c.clear();
                MediaAdapter.this.f55145c.addAll(MediaAdapter.this.p.a(i));
                MediaAdapter.this.a(MediaAdapter.this.f55145c.size());
                MediaAdapter.this.n.e();
            }
        }
    };
    public k s;
    private final Context t;
    private int u;
    private int v;
    private int w = 0;
    private int x;
    private double y;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55169a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f55170b;

        /* renamed from: c  reason: collision with root package name */
        TextView f55171c;

        /* renamed from: d  reason: collision with root package name */
        TextView f55172d;

        /* renamed from: e  reason: collision with root package name */
        View f55173e;

        /* renamed from: f  reason: collision with root package name */
        FrameLayout f55174f;
        View g;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55169a, false, 58515, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55169a, false, 58515, new Class[0], Void.TYPE);
                return;
            }
            this.f55172d.setText("");
            this.f55172d.setBackgroundResource(2130838038);
        }

        ViewHolder(View view) {
            super(view);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55169a, false, 58514, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55169a, false, 58514, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f55172d.setText(String.valueOf(i + 1));
            this.f55172d.setBackgroundResource(2130838039);
        }
    }

    public interface a {
        void a(View view, com.ss.android.ugc.aweme.music.b.a.a aVar);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f55143a, false, 58502, new Class[0], Integer.TYPE)) {
            return this.f55145c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55143a, false, 58502, new Class[0], Integer.TYPE)).intValue();
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55143a, false, 58501, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55143a, false, 58501, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams == null || layoutParams.width == this.w)) {
            int i2 = layoutParams.height;
            double d2 = (double) this.w;
            double d3 = this.y;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = this.w;
                double d4 = (double) this.w;
                double d5 = this.y;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55143a, false, 58486, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55143a, false, 58486, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55148f == null) {
            this.f55148f = new ArrayList();
        } else {
            this.f55148f.clear();
        }
        if (this.f55147e == null) {
            this.f55147e = new ArrayList();
        } else {
            this.f55147e.clear();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f55147e.add(-1);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f55143a, false, 58489, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f55143a, false, 58489, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.t).inflate(C0906R.layout.aa5, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f55170b = (RemoteImageView) inflate.findViewById(C0906R.id.bm8);
        viewHolder.f55171c = (TextView) inflate.findViewById(C0906R.id.ds2);
        viewHolder.f55172d = (TextView) inflate.findViewById(C0906R.id.arj);
        viewHolder.f55173e = inflate.findViewById(C0906R.id.do9);
        viewHolder.f55173e.setVisibility(8);
        viewHolder.g = inflate.findViewById(C0906R.id.cn0);
        viewHolder.f55174f = (FrameLayout) inflate.findViewById(C0906R.id.afr);
        inflate.setTag(viewHolder);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        float f2;
        float f3;
        String str;
        final int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f55143a, false, 58490, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f55143a, false, 58490, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f55143a, false, 58491, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f55143a, false, 58491, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a((View) viewHolder2.f55170b);
        a(viewHolder2.f55173e);
        a(viewHolder2.g);
        final com.ss.android.ugc.aweme.music.b.a.a aVar = this.f55145c.get(i4);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), viewHolder2, aVar}, this, f55143a, false, 58497, new Class[]{Integer.TYPE, ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), viewHolder2, aVar}, this, f55143a, false, 58497, new Class[]{Integer.TYPE, ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
        } else {
            FrameLayout frameLayout = viewHolder2.f55174f;
            if (this.g) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            if (this.j != -1) {
                viewHolder2.f55171c.setTextColor(this.j);
            }
            if (this.k != -1) {
                viewHolder2.f55171c.setShadowLayer(6.0f, 0.0f, 3.0f, this.k);
            }
            if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f55143a, false, 58500, new Class[]{ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f55143a, false, 58500, new Class[]{ViewHolder.class}, Void.TYPE);
            } else if (!this.l) {
                viewHolder2.f55171c.setBackgroundResource(0);
            } else {
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.setCornersRadius(UIUtils.dip2Px(this.t, 2.0f));
                GenericDraweeHierarchy build = new GenericDraweeHierarchyBuilder(this.t.getResources()).build();
                build.setRoundingParams(roundingParams);
                viewHolder2.f55170b.setHierarchy(build);
                viewHolder2.f55171c.setBackgroundResource(2130840224);
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.t.getResources(), 2130841706);
                viewHolder2.f55171c.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.t, 2.0f));
                a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                viewHolder2.f55171c.setCompoundDrawables(a2, null, null, null);
            }
            if (PatchProxy.isSupport(new Object[]{viewHolder2, aVar}, this, f55143a, false, 58499, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, aVar}, this, f55143a, false, 58499, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
            } else {
                int round = Math.round((((float) aVar.h) * 1.0f) / 1000.0f);
                viewHolder2.f55173e.setVisibility(4);
                TextView textView = viewHolder2.f55171c;
                TextView textView2 = textView;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(round)}, this, f55143a, false, 58504, new Class[]{Integer.TYPE}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(round)}, this, f55143a, false, 58504, new Class[]{Integer.TYPE}, String.class);
                } else {
                    int i5 = round % 60;
                    int i6 = round / 60;
                    int i7 = i6 / 60;
                    int i8 = i6 % 60;
                    if (i7 == 0) {
                        str = String.format(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i8), Integer.valueOf(i5)});
                    } else {
                        str = String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i5)});
                    }
                }
                textView2.setText(str);
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), viewHolder2}, this, f55143a, false, 58498, new Class[]{Integer.TYPE, ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), viewHolder2}, this, f55143a, false, 58498, new Class[]{Integer.TYPE, ViewHolder.class}, Void.TYPE);
            } else {
                int intValue = this.f55147e.get(i4).intValue();
                if (intValue >= 0) {
                    viewHolder2.a(intValue);
                    viewHolder2.g.setVisibility(0);
                    f3 = 1.0f;
                    f2 = 1.1f;
                } else {
                    viewHolder2.a();
                    viewHolder2.g.setVisibility(4);
                    if (this.f55148f.size() >= 12) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    f2 = 1.0f;
                }
                if (viewHolder2.f55170b.getAlpha() != f3) {
                    viewHolder2.f55170b.setAlpha(f3);
                }
                if (viewHolder2.f55170b.getScaleX() != f2) {
                    viewHolder2.f55170b.setScaleX(f2);
                    viewHolder2.f55170b.setScaleY(f2);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{viewHolder2, aVar}, this, f55143a, false, 58496, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, aVar}, this, f55143a, false, 58496, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
        } else {
            viewHolder2.f55170b.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(viewHolder2.f55170b.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + aVar.f56315e)).setResizeOptions(new ResizeOptions(this.w, this.w)).build())).build());
        }
        if (PatchProxy.isSupport(new Object[]{viewHolder2, aVar, Integer.valueOf(i2)}, this, f55143a, false, 58492, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, aVar, Integer.valueOf(i2)}, this, f55143a, false, 58492, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55153a;

            public final void onClick(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f55153a, false, 58510, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55153a, false, 58510, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (i4 < MediaAdapter.this.f55147e.size()) {
                    if (MediaAdapter.this.f55147e.get(i4).intValue() >= 0 || MediaAdapter.this.f55148f.size() < 12) {
                        z = false;
                    }
                    if (!z) {
                        MediaAdapter.this.h.a(view, aVar);
                    }
                }
            }
        });
        viewHolder2.f55174f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55157a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f55157a, false, 58511, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55157a, false, 58511, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!MediaAdapter.this.f55144b) {
                    i.a(true, true);
                    MediaAdapter mediaAdapter = MediaAdapter.this;
                    ViewHolder viewHolder = viewHolder2;
                    int i = i4;
                    com.ss.android.ugc.aweme.music.b.a.a aVar = aVar;
                    if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapter, MediaAdapter.f55143a, false, 58493, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                        MediaAdapter mediaAdapter2 = mediaAdapter;
                        PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapter2, MediaAdapter.f55143a, false, 58493, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                        return;
                    }
                    int indexOf = mediaAdapter.f55148f.indexOf(Integer.valueOf(i));
                    if (indexOf >= 0) {
                        mediaAdapter.f55147e.set(i, -1);
                        viewHolder.a();
                        mediaAdapter.f55144b = true;
                        viewHolder.g.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(viewHolder, i) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55162a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ ViewHolder f55163b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ int f55164c;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f55162a, false, 58512, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f55162a, false, 58512, new Class[0], Void.TYPE);
                                    return;
                                }
                                this.f55163b.g.setVisibility(4);
                                this.f55163b.g.setAlpha(1.0f);
                                MediaAdapter.this.notifyItemChanged(this.f55164c);
                                MediaAdapter.this.f55144b = false;
                            }

                            {
                                this.f55163b = r2;
                                this.f55164c = r3;
                            }
                        }).start();
                        viewHolder.f55170b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                        if (mediaAdapter.m != null) {
                            mediaAdapter.m.remove(indexOf);
                        }
                        mediaAdapter.f55148f.remove(Integer.valueOf(i));
                        int size = mediaAdapter.f55148f.size();
                        while (indexOf < size) {
                            mediaAdapter.f55147e.set(mediaAdapter.f55148f.get(indexOf).intValue(), Integer.valueOf(indexOf));
                            if (size != 11) {
                                mediaAdapter.notifyItemChanged(mediaAdapter.f55148f.get(indexOf).intValue());
                            }
                            indexOf++;
                        }
                        if (size == 11) {
                            mediaAdapter.n.e();
                        }
                        if (mediaAdapter.s != null) {
                            mediaAdapter.s.a(mediaAdapter.m);
                        }
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapter, MediaAdapter.f55143a, false, 58494, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                        MediaAdapter mediaAdapter3 = mediaAdapter;
                        PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapter3, MediaAdapter.f55143a, false, 58494, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                        return;
                    }
                    Context context = viewHolder.itemView.getContext();
                    mediaAdapter.o.a(aVar, 0, -1, new e(mediaAdapter, viewHolder, i, aVar), new f(mediaAdapter, context));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(Context context, String str, Long l2, Integer num) {
        a(str, 1, l2.longValue(), "select");
        n.a("aweme_movie_import_error_rate", 1, c.a().a("errorCode", String.valueOf(num)).b());
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d.a(context, num.intValue(), -1);
        return null;
    }

    private void a(String str, int i2, long j2, String str2) {
        String str3 = str;
        long j3 = j2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), new Long(j3), str4}, this, f55143a, false, 58505, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str3, Integer.valueOf(i2), new Long(j3), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55143a, false, 58505, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j3);
            n.a("aweme_video_import_duration", jSONObject, c.a().a("status", String.valueOf(i2)).a("scene_name", str4).a("type", str3).b());
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(ViewHolder viewHolder, int i2, com.ss.android.ugc.aweme.music.b.a.a aVar, String str, Long l2) {
        ViewHolder viewHolder2 = viewHolder;
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
        a(str, 0, l2.longValue(), "select");
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), aVar2}, this, f55143a, false, 58495, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), aVar2}, this, f55143a, false, 58495, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
        } else if (this.f55148f.size() >= 12) {
            UIUtils.displayToast(this.t, this.t.getString(C0906R.string.ss));
        } else {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(aVar2);
            this.f55148f.add(Integer.valueOf(i2));
            viewHolder.a(this.f55148f.size() - 1);
            final int size = this.f55148f.size();
            this.f55147e.set(i2, Integer.valueOf(size - 1));
            this.f55144b = true;
            viewHolder2.f55170b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55166a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f55166a, false, 58513, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f55166a, false, 58513, new Class[0], Void.TYPE);
                        return;
                    }
                    int i = size;
                    MediaAdapter.this.n.e();
                    if (MediaAdapter.this.s != null) {
                        MediaAdapter.this.s.a(MediaAdapter.this.m);
                    }
                    MediaAdapter.this.f55144b = false;
                }
            }).start();
            viewHolder2.g.setAlpha(0.0f);
            viewHolder2.g.setVisibility(0);
            viewHolder2.g.animate().alpha(1.0f).setDuration(300).start();
        }
        return null;
    }

    public MediaAdapter(Context context, VideoChooseFragment videoChooseFragment, int i2, double d2, float f2, int i3) {
        this.t = context;
        this.n = videoChooseFragment;
        this.x = i2;
        this.y = 1.0d;
        this.u = com.ss.android.ugc.aweme.mediachoose.a.a.a().f55245c;
        this.v = 3600000;
        context.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.w = ((UIUtils.getScreenWidth(context) - ((this.x - 1) * ((int) UIUtils.dip2Px(this.t, 1.5f)))) - 0) / this.x;
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
            this.o = new d(context);
        } else {
            this.o = new a(context);
        }
        this.o.a(false);
        this.o.a("enter_from_multi");
    }
}
