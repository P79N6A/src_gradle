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

public class MediaAdapterB extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55175a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55176b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.music.b.a.a> f55177c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Set<com.ss.android.ugc.aweme.music.b.a.a> f55178d = new HashSet(9);

    /* renamed from: e  reason: collision with root package name */
    public List<Integer> f55179e;

    /* renamed from: f  reason: collision with root package name */
    public List<Integer> f55180f;
    public boolean g;
    public a h;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public boolean l;
    public List<com.ss.android.ugc.aweme.music.b.a.a> m;
    public d n;
    public VideoChooseFragmentB o;
    d.c p = new d.c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55181a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55181a, false, 58538, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55181a, false, 58538, new Class[0], Void.TYPE);
                return;
            }
            MediaAdapterB.this.f55178d.clear();
            MediaAdapterB.this.f55178d.addAll(MediaAdapterB.this.n.c());
        }
    };
    d.b q = new d.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55183a;

        public final void a(boolean z, int i, List<com.ss.android.ugc.aweme.music.b.a.a> list) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), list}, this, f55183a, false, 58539, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), list}, this, f55183a, false, 58539, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE);
                return;
            }
            MediaAdapterB.this.f55177c.clear();
            MediaAdapterB.this.f55177c.addAll(MediaAdapterB.this.n.a(4));
            MediaAdapterB.this.a(MediaAdapterB.this.f55177c.size());
            MediaAdapterB.this.notifyDataSetChanged();
            if (!MediaAdapterB.this.o.isDestroyed()) {
                if (MediaAdapterB.this.f55177c.size() == 0) {
                    MediaAdapterB.this.o.a(3);
                    return;
                }
                MediaAdapterB.this.o.a(2);
            }
        }
    };
    public b r;
    w s;
    private final Context t;
    private int u;
    private int v;
    private int w = 0;
    private int x;
    private double y;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55202a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f55203b;

        /* renamed from: c  reason: collision with root package name */
        TextView f55204c;

        /* renamed from: d  reason: collision with root package name */
        TextView f55205d;

        /* renamed from: e  reason: collision with root package name */
        View f55206e;

        /* renamed from: f  reason: collision with root package name */
        FrameLayout f55207f;
        View g;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55202a, false, 58545, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55202a, false, 58545, new Class[0], Void.TYPE);
                return;
            }
            this.f55205d.setText("");
            this.f55205d.setBackgroundResource(2130838038);
        }

        ViewHolder(View view) {
            super(view);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55202a, false, 58544, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55202a, false, 58544, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f55205d.setText(String.valueOf(i + 1));
            this.f55205d.setBackgroundResource(2130838039);
        }
    }

    public interface a {
        void a(View view, com.ss.android.ugc.aweme.music.b.a.a aVar);
    }

    public interface b {
        void a(List<com.ss.android.ugc.aweme.music.b.a.a> list);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f55175a, false, 58531, new Class[0], Integer.TYPE)) {
            return this.f55177c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55175a, false, 58531, new Class[0], Integer.TYPE)).intValue();
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55175a, false, 58530, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55175a, false, 58530, new Class[]{View.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55175a, false, 58517, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55175a, false, 58517, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f55180f == null) {
            this.f55180f = new ArrayList();
        } else {
            this.f55180f.clear();
        }
        if (this.f55179e == null) {
            this.f55179e = new ArrayList();
        } else {
            this.f55179e.clear();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f55179e.add(-1);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f55175a, false, 58518, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f55175a, false, 58518, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.t).inflate(C0906R.layout.aa6, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f55203b = (RemoteImageView) inflate.findViewById(C0906R.id.bm8);
        viewHolder.f55204c = (TextView) inflate.findViewById(C0906R.id.ds2);
        viewHolder.f55205d = (TextView) inflate.findViewById(C0906R.id.arj);
        viewHolder.f55206e = inflate.findViewById(C0906R.id.do9);
        viewHolder.f55206e.setVisibility(8);
        viewHolder.g = inflate.findViewById(C0906R.id.cn0);
        viewHolder.f55207f = (FrameLayout) inflate.findViewById(C0906R.id.afr);
        inflate.setTag(viewHolder);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        float f2;
        float f3;
        String str;
        final int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f55175a, false, 58519, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f55175a, false, 58519, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f55175a, false, 58520, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f55175a, false, 58520, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a((View) viewHolder2.f55203b);
        a(viewHolder2.f55206e);
        a(viewHolder2.g);
        final com.ss.android.ugc.aweme.music.b.a.a aVar = this.f55177c.get(i4);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), viewHolder2, aVar}, this, f55175a, false, 58526, new Class[]{Integer.TYPE, ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), viewHolder2, aVar}, this, f55175a, false, 58526, new Class[]{Integer.TYPE, ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
        } else {
            FrameLayout frameLayout = viewHolder2.f55207f;
            if (this.g) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            if (this.j != -1) {
                viewHolder2.f55204c.setTextColor(this.j);
            }
            if (this.k != -1) {
                viewHolder2.f55204c.setShadowLayer(6.0f, 0.0f, 3.0f, this.k);
            }
            if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f55175a, false, 58529, new Class[]{ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f55175a, false, 58529, new Class[]{ViewHolder.class}, Void.TYPE);
            } else if (!this.l) {
                viewHolder2.f55204c.setBackgroundResource(0);
            } else {
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.setCornersRadius(UIUtils.dip2Px(this.t, 2.0f));
                GenericDraweeHierarchy build = new GenericDraweeHierarchyBuilder(this.t.getResources()).build();
                build.setRoundingParams(roundingParams);
                viewHolder2.f55203b.setHierarchy(build);
                viewHolder2.f55204c.setBackgroundResource(2130840224);
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.t.getResources(), 2130841706);
                viewHolder2.f55204c.setCompoundDrawablePadding((int) UIUtils.dip2Px(this.t, 2.0f));
                a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                viewHolder2.f55204c.setCompoundDrawables(a2, null, null, null);
            }
            if (PatchProxy.isSupport(new Object[]{viewHolder2, aVar}, this, f55175a, false, 58528, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, aVar}, this, f55175a, false, 58528, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
            } else {
                int round = Math.round((((float) aVar.h) * 1.0f) / 1000.0f);
                viewHolder2.f55206e.setVisibility(4);
                TextView textView = viewHolder2.f55204c;
                TextView textView2 = textView;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(round)}, this, f55175a, false, 58534, new Class[]{Integer.TYPE}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(round)}, this, f55175a, false, 58534, new Class[]{Integer.TYPE}, String.class);
                } else {
                    int i5 = round % 60;
                    int i6 = round / 60;
                    int i7 = i6 / 60;
                    int i8 = i6 % 60;
                    if (i7 == 0) {
                        str = String.format(Locale.CHINA, "%01d:%02d", new Object[]{Integer.valueOf(i8), Integer.valueOf(i5)});
                    } else {
                        str = String.format(Locale.CHINA, "%01d:%02d:%02d", new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i5)});
                    }
                }
                textView2.setText(str);
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), viewHolder2}, this, f55175a, false, 58527, new Class[]{Integer.TYPE, ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), viewHolder2}, this, f55175a, false, 58527, new Class[]{Integer.TYPE, ViewHolder.class}, Void.TYPE);
            } else {
                int intValue = this.f55179e.get(i4).intValue();
                if (intValue >= 0) {
                    viewHolder2.a(intValue);
                    viewHolder2.g.setVisibility(0);
                    f3 = 1.0f;
                    f2 = 1.1f;
                } else {
                    viewHolder2.a();
                    viewHolder2.g.setVisibility(4);
                    if (this.f55180f.size() >= 12) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    f2 = 1.0f;
                }
                if (viewHolder2.f55203b.getAlpha() != f3) {
                    viewHolder2.f55203b.setAlpha(f3);
                }
                if (viewHolder2.f55203b.getScaleX() != f2) {
                    viewHolder2.f55203b.setScaleX(f2);
                    viewHolder2.f55203b.setScaleY(f2);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{viewHolder2, aVar}, this, f55175a, false, 58525, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, aVar}, this, f55175a, false, 58525, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
        } else {
            viewHolder2.f55203b.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(viewHolder2.f55203b.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + aVar.f56315e)).setResizeOptions(new ResizeOptions(this.w, this.w)).build())).build());
        }
        if (PatchProxy.isSupport(new Object[]{viewHolder2, aVar, Integer.valueOf(i2)}, this, f55175a, false, 58521, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, aVar, Integer.valueOf(i2)}, this, f55175a, false, 58521, new Class[]{ViewHolder.class, com.ss.android.ugc.aweme.music.b.a.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        viewHolder2.itemView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55185a;

            public final void onClick(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f55185a, false, 58540, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55185a, false, 58540, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (MediaAdapterB.this.f55179e.get(i4).intValue() >= 0 || MediaAdapterB.this.f55180f.size() < 12) {
                    z = false;
                }
                if (!z) {
                    MediaAdapterB.this.h.a(view, aVar);
                }
            }
        });
        viewHolder2.f55207f.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55189a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f55189a, false, 58541, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55189a, false, 58541, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!MediaAdapterB.this.f55176b) {
                    i.a(true, true);
                    MediaAdapterB mediaAdapterB = MediaAdapterB.this;
                    ViewHolder viewHolder = viewHolder2;
                    int i = i4;
                    com.ss.android.ugc.aweme.music.b.a.a aVar = aVar;
                    if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapterB, MediaAdapterB.f55175a, false, 58522, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                        MediaAdapterB mediaAdapterB2 = mediaAdapterB;
                        PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapterB2, MediaAdapterB.f55175a, false, 58522, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                        return;
                    }
                    int indexOf = mediaAdapterB.f55180f.indexOf(Integer.valueOf(i));
                    if (indexOf >= 0) {
                        mediaAdapterB.f55179e.set(i, -1);
                        viewHolder.a();
                        mediaAdapterB.f55176b = true;
                        viewHolder.g.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable(viewHolder, i) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55194a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ ViewHolder f55195b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ int f55196c;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f55194a, false, 58542, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f55194a, false, 58542, new Class[0], Void.TYPE);
                                    return;
                                }
                                this.f55195b.g.setVisibility(4);
                                this.f55195b.g.setAlpha(1.0f);
                                MediaAdapterB.this.notifyItemChanged(this.f55196c);
                                MediaAdapterB.this.f55176b = false;
                            }

                            {
                                this.f55195b = r2;
                                this.f55196c = r3;
                            }
                        }).start();
                        viewHolder.f55203b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                        if (mediaAdapterB.m != null) {
                            mediaAdapterB.m.remove(indexOf);
                        }
                        mediaAdapterB.f55180f.remove(Integer.valueOf(i));
                        int size = mediaAdapterB.f55180f.size();
                        while (indexOf < size) {
                            mediaAdapterB.f55179e.set(mediaAdapterB.f55180f.get(indexOf).intValue(), Integer.valueOf(indexOf));
                            if (size != 11) {
                                mediaAdapterB.notifyItemChanged(mediaAdapterB.f55180f.get(indexOf).intValue());
                            }
                            indexOf++;
                        }
                        if (size == 11) {
                            mediaAdapterB.notifyDataSetChanged();
                        }
                        if (mediaAdapterB.r != null) {
                            mediaAdapterB.r.a(mediaAdapterB.m);
                        }
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapterB, MediaAdapterB.f55175a, false, 58523, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                        MediaAdapterB mediaAdapterB3 = mediaAdapterB;
                        PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), aVar}, mediaAdapterB3, MediaAdapterB.f55175a, false, 58523, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
                        return;
                    }
                    Context context = viewHolder.itemView.getContext();
                    mediaAdapterB.s.a(aVar, 0, -1, new g(mediaAdapterB, viewHolder, i, aVar), new h(mediaAdapterB, context));
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
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), new Long(j3), str4}, this, f55175a, false, 58535, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str3, Integer.valueOf(i2), new Long(j3), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f55175a, false, 58535, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
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
        final int i3 = i2;
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
        a(str, 0, l2.longValue(), "select");
        int i4 = (int) aVar2.h;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), aVar2, Integer.valueOf(i4)}, this, f55175a, false, 58524, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), aVar2, Integer.valueOf(i4)}, this, f55175a, false, 58524, new Class[]{ViewHolder.class, Integer.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f55180f.size() >= 12) {
            UIUtils.displayToast(this.t, this.t.getString(C0906R.string.ss));
        } else {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            if (i4 > 0) {
                aVar2.h = (long) i4;
            }
            this.m.add(aVar2);
            this.f55180f.add(Integer.valueOf(i2));
            viewHolder2.a(this.f55180f.size() - 1);
            final int size = this.f55180f.size();
            this.f55179e.set(i3, Integer.valueOf(size - 1));
            this.f55176b = true;
            viewHolder2.f55203b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55198a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f55198a, false, 58543, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f55198a, false, 58543, new Class[0], Void.TYPE);
                        return;
                    }
                    if (size == 12) {
                        MediaAdapterB.this.notifyDataSetChanged();
                    } else {
                        MediaAdapterB.this.notifyItemChanged(i3);
                    }
                    if (MediaAdapterB.this.r != null) {
                        MediaAdapterB.this.r.a(MediaAdapterB.this.m);
                    }
                    MediaAdapterB.this.f55176b = false;
                }
            }).start();
            viewHolder2.g.setAlpha(0.0f);
            viewHolder2.g.setVisibility(0);
            viewHolder2.g.animate().alpha(1.0f).setDuration(300).start();
        }
        return null;
    }

    public MediaAdapterB(Context context, VideoChooseFragmentB videoChooseFragmentB, int i2, double d2, float f2, int i3) {
        this.t = context;
        this.o = videoChooseFragmentB;
        this.x = i2;
        this.y = 1.3d;
        this.u = com.ss.android.ugc.aweme.mediachoose.a.a.a().f55245c;
        this.v = 3600000;
        context.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.w = ((UIUtils.getScreenWidth(context) - ((this.x - 1) * ((int) UIUtils.dip2Px(this.t, 1.5f)))) - 0) / this.x;
        this.n = d.a();
        this.n.a(this.p);
        this.n.a(this.q);
        this.n.a(4, false);
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
            this.s = new d(context);
        } else {
            this.s = new a(context);
        }
        this.s.a(false);
        this.s.a("enter_from_multi");
    }
}
