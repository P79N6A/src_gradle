package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.w;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

public class MvImageChooseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68565a;

    /* renamed from: b  reason: collision with root package name */
    public int f68566b = 12;

    /* renamed from: c  reason: collision with root package name */
    public String f68567c;

    /* renamed from: d  reason: collision with root package name */
    final Context f68568d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f68569e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public d f68570f;
    public c g;
    public boolean h = true;
    public boolean i;
    int j;
    w k;
    private final List<b> l = new ArrayList();
    private int m;
    private double n;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68581a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f68582b;

        /* renamed from: c  reason: collision with root package name */
        TextView f68583c;

        /* renamed from: d  reason: collision with root package name */
        TextView f68584d;

        /* renamed from: e  reason: collision with root package name */
        FrameLayout f68585e;

        /* renamed from: f  reason: collision with root package name */
        View f68586f;
        String g;
        b h;
        int i;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f68581a, false, 78023, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68581a, false, 78023, new Class[0], Void.TYPE);
                return;
            }
            this.f68583c.setText("");
            this.f68583c.setBackgroundResource(2130838038);
        }

        ViewHolder(View view) {
            super(view);
        }
    }

    interface a {
        void a();
    }

    public static class b extends com.ss.android.ugc.aweme.music.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68587a;

        /* renamed from: b  reason: collision with root package name */
        int f68588b = -1;

        private b(long j) {
            super(j);
        }

        public static b a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
            com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, null, f68587a, true, 78021, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f68587a, true, 78021, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, b.class);
            }
            b bVar = new b(aVar2.f56314d);
            bVar.f56315e = aVar2.f56315e;
            bVar.f56316f = aVar2.f56316f;
            bVar.g = aVar2.g;
            bVar.h = aVar2.h;
            bVar.i = aVar2.i;
            bVar.j = aVar2.j;
            bVar.k = aVar2.k;
            bVar.l = aVar2.l;
            bVar.m = aVar2.m;
            bVar.n = aVar2.n;
            bVar.o = aVar2.o;
            return bVar;
        }
    }

    public interface c {
        void a(com.ss.android.ugc.aweme.music.b.a.a aVar);

        void a(List<b> list);
    }

    public interface d {
        void a(View view, com.ss.android.ugc.aweme.music.b.a.a aVar);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68565a, false, 78001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68565a, false, 78001, new Class[0], Void.TYPE);
            return;
        }
        for (b bVar : this.l) {
            bVar.f68588b = -1;
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f68565a, false, 78014, new Class[0], Integer.TYPE)) {
            return this.l.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68565a, false, 78014, new Class[0], Integer.TYPE)).intValue();
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f68565a, false, 78008, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f68565a, false, 78008, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams == null || layoutParams.width == this.m)) {
            int i2 = layoutParams.height;
            double d2 = (double) this.m;
            double d3 = this.n;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = this.m;
                double d4 = (double) this.m;
                double d5 = this.n;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    public final void a(Collection<? extends b> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, this, f68565a, false, 78002, new Class[]{Collection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection}, this, f68565a, false, 78002, new Class[]{Collection.class}, Void.TYPE);
            return;
        }
        this.l.clear();
        this.l.addAll(collection);
        notifyDataSetChanged();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68565a, false, 78000, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68565a, false, 78000, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a();
        this.h = z;
        if (!Lists.isEmpty(this.f68569e)) {
            this.f68569e.clear();
            if (this.g != null) {
                this.g.a(this.f68569e);
            }
        }
        notifyDataSetChanged();
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f68565a, false, 78003, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f68565a, false, 78003, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.f68568d).inflate(C0906R.layout.s2, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f68582b = (RemoteImageView) inflate.findViewById(C0906R.id.bm8);
        viewHolder.f68583c = (TextView) inflate.findViewById(C0906R.id.arj);
        viewHolder.f68585e = (FrameLayout) inflate.findViewById(C0906R.id.afr);
        viewHolder.f68586f = inflate.findViewById(C0906R.id.cp0);
        viewHolder.f68584d = (TextView) inflate.findViewById(C0906R.id.a8_);
        TextView textView = viewHolder.f68584d;
        if (!this.i) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        return viewHolder;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        final b bVar;
        String str;
        int i3;
        float f2;
        float f3;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f68565a, false, 78004, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f68565a, false, 78004, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f68565a, false, 78005, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f68565a, false, 78005, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a((View) viewHolder2.f68582b);
        a(viewHolder2.f68586f);
        b bVar2 = this.l.get(i4);
        if (bVar2 == null) {
            ai.b("mediaModel is empty " + i4 + " cur type: " + this.j + "  " + this.l.size());
        }
        viewHolder2.h = bVar2;
        viewHolder2.i = i4;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f68565a, false, 78007, new Class[]{ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f68565a, false, 78007, new Class[]{ViewHolder.class}, Void.TYPE);
            bVar = bVar2;
        } else {
            FrameLayout frameLayout = viewHolder2.f68585e;
            if (this.h) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            frameLayout.setVisibility(i3);
            if (viewHolder2.h.f68588b >= 0) {
                viewHolder2.f68586f.setVisibility(0);
                int i5 = viewHolder2.h.f68588b;
                bVar = bVar2;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i5)}, viewHolder2, ViewHolder.f68581a, false, 78022, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i5)}, viewHolder2, ViewHolder.f68581a, false, 78022, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    viewHolder2.f68583c.setText(String.valueOf(i5));
                    viewHolder2.f68583c.setBackgroundResource(2130838039);
                }
                f3 = 1.0f;
                f2 = 1.1f;
            } else {
                bVar = bVar2;
                viewHolder2.a();
                viewHolder2.f68586f.setVisibility(4);
                if (this.f68569e.size() >= this.f68566b) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                f2 = 1.0f;
            }
            if (viewHolder2.f68582b.getAlpha() != f3) {
                viewHolder2.f68582b.setAlpha(f3);
            }
            if (viewHolder2.f68582b.getScaleX() != f2) {
                viewHolder2.f68582b.setScaleX(f2);
                viewHolder2.f68582b.setScaleY(f2);
            }
        }
        String str2 = "file://" + bVar.f56315e;
        if (!TextUtils.equals(viewHolder2.g, str2)) {
            viewHolder2.g = str2;
            com.ss.android.ugc.aweme.base.c.a(viewHolder2.f68582b, viewHolder2.g, this.m, this.m, Bitmap.Config.ARGB_4444);
        }
        viewHolder2.itemView.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68571a;

            public final void a(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f68571a, false, 78018, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68571a, false, 78018, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (viewHolder2.h.f68588b >= 0 || MvImageChooseAdapter.this.f68569e.size() < MvImageChooseAdapter.this.f68566b) {
                    z = false;
                }
                if (!z && MvImageChooseAdapter.this.f68570f != null) {
                    MvImageChooseAdapter.this.f68570f.a(view, bVar);
                }
            }
        });
        viewHolder2.f68585e.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68575a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f68575a, false, 78019, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68575a, false, 78019, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                MvImageChooseAdapter mvImageChooseAdapter = MvImageChooseAdapter.this;
                ViewHolder viewHolder = viewHolder2;
                if (PatchProxy.isSupport(new Object[]{viewHolder}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78009, new Class[]{ViewHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{viewHolder}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78009, new Class[]{ViewHolder.class}, Void.TYPE);
                } else if (viewHolder.h.f68588b >= 0) {
                    int i = viewHolder.h.f68588b;
                    viewHolder.h.f68588b = -1;
                    viewHolder.a();
                    viewHolder.f68586f.animate().alpha(0.0f).setDuration(3000).withEndAction(new Runnable(viewHolder) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f68578a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ ViewHolder f68579b;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f68578a, false, 78020, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f68578a, false, 78020, new Class[0], Void.TYPE);
                                return;
                            }
                            this.f68579b.f68586f.setVisibility(4);
                            this.f68579b.f68586f.setAlpha(1.0f);
                            MvImageChooseAdapter.this.notifyItemChanged(this.f68579b.i);
                        }

                        {
                            this.f68579b = r2;
                        }
                    }).start();
                    viewHolder.f68582b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                    int i2 = 0;
                    for (int i3 = 0; i3 < mvImageChooseAdapter.f68569e.size(); i3++) {
                        b bVar = mvImageChooseAdapter.f68569e.get(i3);
                        if (bVar.f56314d == viewHolder.h.f56314d) {
                            i2 = i3;
                        }
                        if (bVar.f68588b > i) {
                            bVar.f68588b--;
                        }
                    }
                    mvImageChooseAdapter.f68569e.remove(i2);
                    mvImageChooseAdapter.notifyDataSetChanged();
                    if (mvImageChooseAdapter.g != null) {
                        mvImageChooseAdapter.g.a(mvImageChooseAdapter.f68569e);
                    }
                } else if (mvImageChooseAdapter.f68569e.size() >= mvImageChooseAdapter.f68566b) {
                    com.bytedance.ies.dmt.ui.d.a.b(mvImageChooseAdapter.f68568d, mvImageChooseAdapter.f68567c).a();
                } else {
                    b bVar2 = viewHolder.h;
                    r rVar = new r(mvImageChooseAdapter, viewHolder);
                    if (PatchProxy.isSupport(new Object[]{bVar2, rVar}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78010, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2, rVar}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78010, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, a.class}, Void.TYPE);
                        return;
                    }
                    if (1 == mvImageChooseAdapter.j) {
                        if (PatchProxy.isSupport(new Object[]{bVar2, rVar}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78012, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar2, rVar}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78012, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, a.class}, Void.TYPE);
                        } else {
                            if (mvImageChooseAdapter.k == null) {
                                if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
                                    mvImageChooseAdapter.k = new com.ss.android.ugc.aweme.mediachoose.d(mvImageChooseAdapter.f68568d);
                                } else {
                                    mvImageChooseAdapter.k = new com.ss.android.ugc.aweme.mediachoose.a(mvImageChooseAdapter.f68568d);
                                }
                                mvImageChooseAdapter.k.a("enter_from_multi");
                            }
                            mvImageChooseAdapter.k.a(bVar2, 0, -1, new s(mvImageChooseAdapter, rVar), new t(mvImageChooseAdapter));
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[]{bVar2, rVar}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78011, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar2, rVar}, mvImageChooseAdapter, MvImageChooseAdapter.f68565a, false, 78011, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, a.class}, Void.TYPE);
                            return;
                        }
                        double d2 = (double) bVar2.l;
                        double d3 = (double) bVar2.m;
                        Double.isNaN(d3);
                        if (d2 <= d3 * 2.2d) {
                            double d4 = (double) bVar2.m;
                            double d5 = (double) bVar2.l;
                            Double.isNaN(d5);
                            if (d4 <= d5 * 2.2d) {
                                e.a().a(bVar2.f56315e, co.IMAGE);
                                rVar.a();
                            }
                        }
                        com.bytedance.ies.dmt.ui.d.a.c(mvImageChooseAdapter.f68568d, (int) C0906R.string.c6q).a();
                    }
                }
            }
        });
        if (bVar.g == 4) {
            int round = Math.round((((float) bVar.h) * 1.0f) / 1000.0f);
            TextView textView = viewHolder2.f68584d;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(round)}, this, f68565a, false, 78006, new Class[]{Integer.TYPE}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(round)}, this, f68565a, false, 78006, new Class[]{Integer.TYPE}, String.class);
            } else {
                int i6 = round % 60;
                int i7 = round / 60;
                int i8 = i7 / 60;
                int i9 = i7 % 60;
                if (i8 == 0) {
                    str = String.format(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i9), Integer.valueOf(i6)});
                } else {
                    str = String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i6)});
                }
            }
            textView.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(a aVar, String str, Long l2) {
        a(str, 0, l2.longValue(), "select");
        aVar.a();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Unit a(String str, Long l2, Integer num) {
        a(str, 1, l2.longValue(), "select");
        n.a("aweme_movie_import_error_rate", 1, com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", String.valueOf(num)).b());
        d.a(this.f68568d, num.intValue(), -1);
        return null;
    }

    private void a(String str, int i2, long j2, String str2) {
        String str3 = str;
        long j3 = j2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), new Long(j3), str4}, this, f68565a, false, 78013, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str3, Integer.valueOf(i2), new Long(j3), str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f68565a, false, 78013, new Class[]{String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j3);
            n.a("aweme_video_import_duration", jSONObject, com.ss.android.ugc.aweme.app.d.c.a().a("status", String.valueOf(i2)).a("scene_name", str4).a("type", str3).b());
        } catch (JSONException unused) {
        }
    }

    public MvImageChooseAdapter(Context context, int i2, double d2, float f2, int i3, int i4) {
        this.f68568d = context;
        this.n = 1.0d;
        context.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.m = ((UIUtils.getScreenWidth(context) - (((int) UIUtils.dip2Px(this.f68568d, 1.5f)) * 3)) + 0) / 4;
        this.f68567c = this.f68568d.getString(C0906R.string.sr);
        this.j = i4;
    }
}
