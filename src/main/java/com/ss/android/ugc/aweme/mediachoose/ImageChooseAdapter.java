package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.experiencekit.b;
import com.ss.android.experiencekit.b.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageChooseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55084a;

    /* renamed from: b  reason: collision with root package name */
    public int f55085b = 12;

    /* renamed from: c  reason: collision with root package name */
    String f55086c;

    /* renamed from: d  reason: collision with root package name */
    final Context f55087d;

    /* renamed from: e  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.music.b.a.a> f55088e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    List<Integer> f55089f;
    public List<Integer> g;
    public PhotoMovieContext h;
    public boolean i;
    public boolean j;
    public a k;
    public com.ss.android.ugc.aweme.music.b.a l;
    List<String> m = new ArrayList();
    public final d n = d.a();
    public d.a o = new d.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55090a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55090a, false, 58453, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55090a, false, 58453, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (!ImageChooseAdapter.this.j) {
                ImageChooseAdapter.this.f55088e.clear();
                ImageChooseAdapter.this.f55088e.addAll(ImageChooseAdapter.this.n.a(i));
                ImageChooseAdapter.this.a(ImageChooseAdapter.this.f55088e.size());
                ImageChooseAdapter.this.notifyDataSetChanged();
            }
        }
    };
    private final c.a p;
    private Map<Long, Float> q = new HashMap();
    private int r;
    private double s;

    static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55108a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f55109b;

        /* renamed from: c  reason: collision with root package name */
        TextView f55110c;

        /* renamed from: d  reason: collision with root package name */
        FrameLayout f55111d;

        /* renamed from: e  reason: collision with root package name */
        View f55112e;

        /* renamed from: f  reason: collision with root package name */
        String f55113f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55108a, false, 58459, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55108a, false, 58459, new Class[0], Void.TYPE);
                return;
            }
            this.f55110c.setText("");
            this.f55110c.setBackgroundResource(2130838038);
        }

        ViewHolder(View view) {
            super(view);
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55108a, false, 58458, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55108a, false, 58458, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f55110c.setText(String.valueOf(i + 1));
            this.f55110c.setBackgroundResource(2130838039);
        }
    }

    public interface a {
        void a(View view, com.ss.android.ugc.aweme.music.b.a.a aVar);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f55084a, false, 58451, new Class[0], Integer.TYPE)) {
            return this.f55088e.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55084a, false, 58451, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55084a, false, 58449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55084a, false, 58449, new Class[0], Void.TYPE);
        } else if (this.h != null && !CollectionUtils.isEmpty(this.m)) {
            StringBuilder sb = new StringBuilder();
            for (String next : this.m) {
                if (!TextUtils.isEmpty(next)) {
                    sb.append(next);
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                this.h.poiData = sb2.substring(0, sb2.length() - 1);
            }
        }
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55084a, false, 58446, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55084a, false, 58446, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams == null || layoutParams.width == this.r)) {
            int i2 = layoutParams.height;
            double d2 = (double) this.r;
            double d3 = this.s;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = this.r;
                double d4 = (double) this.r;
                double d5 = this.s;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f55084a, false, 58448, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f55084a, false, 58448, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewRecycled(viewHolder);
        a((ViewHolder) viewHolder);
    }

    private void a(ViewHolder viewHolder) {
        ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f55084a, false, 58444, new Class[]{ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f55084a, false, 58444, new Class[]{ViewHolder.class}, Void.TYPE);
            return;
        }
        Object tag = viewHolder2.f55109b.getTag(C0906R.id.b5y);
        if (tag instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) tag;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            viewHolder2.f55109b.setTag(C0906R.id.b5y, null);
        }
    }

    public static boolean a(com.ss.android.ugc.aweme.music.b.a.a aVar) {
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f55084a, true, 58450, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f55084a, true, 58450, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class}, Boolean.TYPE)).booleanValue();
        } else if (((float) aVar2.l) > ((float) aVar2.m) * 2.2f || ((float) aVar2.m) > ((float) aVar2.l) * 2.2f) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) com.ss.android.ugc.aweme.framework.e.a.a(), (int) C0906R.string.c6q).a();
            return false;
        } else {
            e.a().a(aVar2.f56315e, co.IMAGE);
            return true;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f55084a, false, 58436, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f55084a, false, 58436, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        } else {
            this.g.clear();
        }
        this.m.clear();
        if (this.f55089f == null) {
            this.f55089f = new ArrayList();
        } else {
            this.f55089f.clear();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f55089f.add(-1);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f55084a, false, 58441, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f55084a, false, 58441, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.f55087d).inflate(C0906R.layout.s2, viewGroup2, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        viewHolder.f55109b = (RemoteImageView) inflate.findViewById(C0906R.id.bm8);
        viewHolder.f55110c = (TextView) inflate.findViewById(C0906R.id.arj);
        viewHolder.f55111d = (FrameLayout) inflate.findViewById(C0906R.id.afr);
        viewHolder.f55112e = inflate.findViewById(C0906R.id.cp0);
        return viewHolder;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
            r21 = this;
            r7 = r21
            r9 = r23
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f55084a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 58442(0xe44a, float:8.1895E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f55084a
            r3 = 0
            r4 = 58442(0xe44a, float:8.1895E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r1 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004d:
            r8 = r22
            com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$ViewHolder r8 = (com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.ViewHolder) r8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f55084a
            r3 = 0
            r4 = 58443(0xe44b, float:8.1896E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$ViewHolder> r1 = com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f55084a
            r3 = 0
            r4 = 58443(0xe44b, float:8.1896E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$ViewHolder> r1 = com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.ViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0097:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f55109b
            r7.a((android.view.View) r0)
            android.view.View r0 = r8.f55112e
            r7.a((android.view.View) r0)
            java.util.List<com.ss.android.ugc.aweme.music.b.a.a> r0 = r7.f55088e
            java.lang.Object r0 = r0.get(r9)
            r13 = r0
            com.ss.android.ugc.aweme.music.b.a.a r13 = (com.ss.android.ugc.aweme.music.b.a.a) r13
            java.util.List<java.lang.Integer> r0 = r7.f55089f
            java.lang.Object r0 = r0.get(r9)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r11] = r1
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f55084a
            r3 = 0
            r4 = 58445(0xe44d, float:8.1899E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$ViewHolder> r1 = com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.ViewHolder.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00fc
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r11] = r1
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f55084a
            r3 = 0
            r4 = 58445(0xe44d, float:8.1899E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$ViewHolder> r1 = com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.ViewHolder.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0157
        L_0x00fc:
            android.widget.FrameLayout r0 = r8.f55111d
            boolean r1 = r7.i
            if (r1 == 0) goto L_0x0104
            r1 = 0
            goto L_0x0106
        L_0x0104:
            r1 = 8
        L_0x0106:
            r0.setVisibility(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 < 0) goto L_0x0119
            r8.a(r9)
            android.view.View r1 = r8.f55112e
            r1.setVisibility(r11)
            r1 = 1066192077(0x3f8ccccd, float:1.1)
            goto L_0x0134
        L_0x0119:
            r8.a()
            android.view.View r1 = r8.f55112e
            r2 = 4
            r1.setVisibility(r2)
            java.util.List<java.lang.Integer> r1 = r7.g
            int r1 = r1.size()
            int r2 = r7.f55085b
            if (r1 < r2) goto L_0x012f
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0131
        L_0x012f:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0131:
            r0 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0134:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r8.f55109b
            float r2 = r2.getAlpha()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r8.f55109b
            r2.setAlpha(r0)
        L_0x0143:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f55109b
            float r0 = r0.getScaleX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0157
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f55109b
            r0.setScaleX(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f55109b
            r0.setScaleY(r1)
        L_0x0157:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "file://"
            r0.<init>(r1)
            java.lang.String r1 = r13.f56315e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.f55113f = r0
            com.ss.android.experiencekit.b.c$a r0 = r7.p
            r1 = 0
            if (r0 == 0) goto L_0x0189
            boolean r0 = r13 instanceof com.ss.android.ugc.aweme.photo.h
            if (r0 == 0) goto L_0x0189
            com.ss.android.experiencekit.b.c$a r14 = r7.p
            long r2 = r13.f56314d
            int r15 = (int) r2
            r0 = r13
            com.ss.android.ugc.aweme.photo.h r0 = (com.ss.android.ugc.aweme.photo.h) r0
            long r2 = r0.f58543a
            r18 = 1
            r19 = 2
            r20 = 0
            r16 = r2
            android.graphics.Bitmap r0 = r14.a(r15, r16, r18, r19, r20)
            goto L_0x018a
        L_0x0189:
            r0 = r1
        L_0x018a:
            if (r0 == 0) goto L_0x0252
            java.util.Map<java.lang.Long, java.lang.Float> r2 = r7.q
            long r3 = r13.f56314d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x01ad
            java.util.Map<java.lang.Long, java.lang.Float> r2 = r7.q
            long r3 = r13.f56314d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L_0x01c3
        L_0x01ad:
            java.lang.String r2 = r8.f55113f
            int r2 = com.ss.android.ugc.aweme.shortvideo.util.g.a(r2)
            float r2 = (float) r2
            java.util.Map<java.lang.Long, java.lang.Float> r3 = r7.q
            long r4 = r13.f56314d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            r3.put(r4, r5)
        L_0x01c3:
            r7.a((com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.ViewHolder) r8)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0244
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r11] = r0
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            r14[r12] = r3
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.util.g.f71133a
            r17 = 1
            r18 = 80854(0x13bd6, float:1.133E-40)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r3[r11] = r4
            java.lang.Class r4 = java.lang.Float.TYPE
            r3[r12] = r4
            java.lang.Class<android.graphics.Bitmap> r20 = android.graphics.Bitmap.class
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x021a
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r11] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r14[r12] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.shortvideo.util.g.f71133a
            r17 = 1
            r18 = 80854(0x13bd6, float:1.133E-40)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r0[r12] = r1
            java.lang.Class<android.graphics.Bitmap> r20 = android.graphics.Bitmap.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            r1 = r0
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L_0x0218:
            r0 = r1
            goto L_0x0244
        L_0x021a:
            if (r0 != 0) goto L_0x021d
            goto L_0x0218
        L_0x021d:
            int r17 = r0.getWidth()
            int r18 = r0.getHeight()
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r1.setRotate(r2)
            r15 = 0
            r16 = 0
            r20 = 0
            r14 = r0
            r19 = r1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r14, r15, r16, r17, r18, r19, r20)
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L_0x0240
            goto L_0x0218
        L_0x0240:
            r0.recycle()
            goto L_0x0218
        L_0x0244:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r8.f55109b
            r2 = 2131167765(0x7f070a15, float:1.7949813E38)
            r1.setTag(r2, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r8.f55109b
            r1.setImageBitmap(r0)
            goto L_0x025d
        L_0x0252:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r8.f55109b
            java.lang.String r1 = r8.f55113f
            int r2 = r7.r
            int r3 = r7.r
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1, (int) r2, (int) r3)
        L_0x025d:
            android.view.View r0 = r8.itemView
            com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$2 r1 = new com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$2
            r1.<init>(r9, r13)
            r0.setOnClickListener(r1)
            android.widget.FrameLayout r0 = r8.f55111d
            com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$3 r1 = new com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter$3
            r1.<init>(r8, r13)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public ImageChooseAdapter(Context context, int i2, double d2, float f2, int i3) {
        this.f55087d = context;
        this.s = 1.0d;
        context.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.r = ((UIUtils.getScreenWidth(context) - ((i2 - 1) * ((int) UIUtils.dip2Px(this.f55087d, 1.5f)))) + 0) / i2;
        this.i = true;
        this.p = b.b().a();
        this.f55086c = this.f55087d.getString(C0906R.string.sr);
    }
}
