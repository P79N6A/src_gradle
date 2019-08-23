package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.Lists;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.g;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import com.ss.android.vesdk.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FramesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66522a;

    /* renamed from: b  reason: collision with root package name */
    public int f66523b;

    /* renamed from: c  reason: collision with root package name */
    public Context f66524c;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, Float> f66525d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public List<Pair<String, Pair<Integer, Integer>>> f66526e;

    /* renamed from: f  reason: collision with root package name */
    public g f66527f;
    public List<h> g = new ArrayList();
    public List<h> h;
    public MutableLiveData<Bitmap> i;
    public MutableLiveData<Boolean> j;
    public int k;
    public int l;
    public List<Bitmap> m = new ArrayList();
    public boolean n;
    public p o;
    private int p;

    class FrameViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66528a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f66529b = ((ImageView) this.itemView.findViewById(C0906R.id.b61));

        /* renamed from: c  reason: collision with root package name */
        CloseableReference<CloseableImage> f66530c;

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66528a, false, 75883, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66528a, false, 75883, new Class[0], Void.TYPE);
                return;
            }
            CloseableReference.closeSafely(this.f66530c);
        }

        FrameViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xo, viewGroup, false));
        }

        /* access modifiers changed from: package-private */
        public int a(String str, int i) {
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f66528a, false, 75882, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f66528a, false, 75882, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            int i3 = 0;
            while (i2 < FramesAdapter.this.h.size() && !str.equals(FramesAdapter.this.h.get(i2).f66495b)) {
                i3 = (int) (((long) i3) + FramesAdapter.this.h.get(i2).f66496c);
                i2++;
            }
            return i3 + i;
        }
    }

    public final void a(List<h> list) {
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f66522a, false, 75867, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f66522a, false, 75867, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.g = new ArrayList(list2);
        c();
        b();
    }

    /* access modifiers changed from: package-private */
    public void a(HashMap<String, Float> hashMap) {
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f66522a, false, 75876, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, this, f66522a, false, 75876, new Class[]{HashMap.class}, Void.TYPE);
            return;
        }
        b(hashMap);
        if (this.f66527f != null) {
            this.f66527f.b();
        }
        c();
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66522a, false, 75877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66522a, false, 75877, new Class[0], Void.TYPE);
            return;
        }
        if (this.f66527f != null) {
            this.f66527f.b();
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66522a, false, 75868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66522a, false, 75868, new Class[0], Void.TYPE);
            return;
        }
        if (this.n) {
            new a().a(this.k, this.l).b(this.j).a(this.i).a(this.f66524c, this.o, a((int) this.g.get(0).f66496c, this.g.get(0).f66495b), new a(this));
        }
        notifyDataSetChanged();
    }

    private void c() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f66522a, false, 75872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66522a, false, 75872, new Class[0], Void.TYPE);
            return;
        }
        if (this.f66526e == null) {
            this.f66526e = new ArrayList();
        } else {
            this.f66526e.clear();
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            h hVar = this.g.get(i4);
            if (this.f66523b == 1) {
                i2 = a((int) (hVar.f66498e - hVar.f66497d), hVar.f66495b);
            } else {
                i2 = a((int) hVar.f66496c, hVar.f66495b);
            }
            Integer valueOf = Integer.valueOf(i3);
            i3 += i2;
            this.f66526e.add(Pair.create(hVar.f66495b, Pair.create(valueOf, Integer.valueOf(i3 - 1))));
        }
    }

    public int getItemCount() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f66522a, false, 75866, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66522a, false, 75866, new Class[0], Integer.TYPE)).intValue();
        } else if (this.n) {
            return this.m.size();
        } else {
            if (Lists.isEmpty(this.g)) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.g.size(); i4++) {
                if (this.f66523b == 1) {
                    i2 = a((int) (this.g.get(i4).f66498e - this.g.get(i4).f66497d), this.g.get(i4).f66495b);
                } else {
                    i2 = a((int) this.g.get(i4).f66496c, this.g.get(i4).f66495b);
                }
                i3 += i2;
            }
            return i3;
        }
    }

    public final void a(boolean z) {
        if (this.f66527f instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) this.f66527f).f3923c = z;
        }
    }

    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f66522a, false, 75865, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f66522a, false, 75865, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewRecycled(viewHolder);
        if (viewHolder2 instanceof FrameViewHolder) {
            ((FrameViewHolder) viewHolder2).a();
        }
    }

    private void b(HashMap<String, Float> hashMap) {
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f66522a, false, 75870, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, this, f66522a, false, 75870, new Class[]{HashMap.class}, Void.TYPE);
            return;
        }
        for (String next : hashMap.keySet()) {
            this.f66525d.put(next, Float.valueOf(hashMap.get(next).floatValue() * ((float) this.k)));
        }
    }

    public final int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f66522a, false, 75869, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f66522a, false, 75869, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        for (int i3 = 0; i3 < this.f66526e.size(); i3++) {
            Pair pair = (Pair) this.f66526e.get(i3).second;
            if (i2 >= ((Integer) pair.first).intValue() && i2 <= ((Integer) pair.second).intValue()) {
                return i3;
            }
        }
        throw new IllegalArgumentException("unknow pos = " + i2);
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f66522a, false, 75863, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new FrameViewHolder(viewGroup2);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f66522a, false, 75863, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    private int a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f66522a, false, 75871, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f66522a, false, 75871, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
        }
        int round = Math.round(this.f66525d.get(str).floatValue());
        if (round <= 0) {
            ai.c("duration: " + i2 + " oneFrameDurMap" + this.f66525d.get(str) + " path: " + str);
        }
        return ((i2 + round) - 1) / round;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
        int min;
        float f2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f66522a, false, 75864, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f66522a, false, 75864, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof FrameViewHolder) {
            FrameViewHolder frameViewHolder = (FrameViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), frameViewHolder}, frameViewHolder, FrameViewHolder.f66528a, false, 75881, new Class[]{Integer.TYPE, FrameViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), frameViewHolder}, frameViewHolder, FrameViewHolder.f66528a, false, 75881, new Class[]{Integer.TYPE, FrameViewHolder.class}, Void.TYPE);
                return;
            }
            int a2 = FramesAdapter.this.a(i3);
            Pair pair = (Pair) FramesAdapter.this.f66526e.get(a2).second;
            if (FramesAdapter.this.f66523b == 1) {
                min = (int) Math.min((((float) (i3 - ((Integer) pair.first).intValue())) * FramesAdapter.this.f66525d.get(FramesAdapter.this.g.get(a2).f66495b).floatValue()) + ((float) FramesAdapter.this.g.get(a2).f66497d), (float) FramesAdapter.this.g.get(a2).f66498e);
            } else {
                min = (int) Math.min(((float) (i3 - ((Integer) pair.first).intValue())) * FramesAdapter.this.f66525d.get(FramesAdapter.this.g.get(a2).f66495b).floatValue(), (float) FramesAdapter.this.g.get(a2).f66496c);
            }
            int i4 = min;
            String str = a2 + "-" + i4;
            frameViewHolder.f66529b.setTag(str);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) frameViewHolder.f66529b.getLayoutParams();
            layoutParams.height = FramesAdapter.this.l;
            layoutParams.width = FramesAdapter.this.k;
            if (i3 == ((Integer) pair.second).intValue()) {
                if (FramesAdapter.this.f66523b == 1) {
                    f2 = ((float) (FramesAdapter.this.g.get(a2).f66498e - FramesAdapter.this.g.get(a2).f66497d)) % FramesAdapter.this.f66525d.get(FramesAdapter.this.g.get(a2).f66495b).floatValue();
                } else {
                    f2 = ((float) FramesAdapter.this.g.get(a2).f66496c) % FramesAdapter.this.f66525d.get(FramesAdapter.this.g.get(a2).f66495b).floatValue();
                }
                double d2 = (double) f2;
                Double.isNaN(d2);
                double floatValue = (double) FramesAdapter.this.f66525d.get(FramesAdapter.this.g.get(a2).f66495b).floatValue();
                Double.isNaN(floatValue);
                double d3 = (double) FramesAdapter.this.k;
                Double.isNaN(d3);
                layoutParams.width = (int) (((d2 * 1.0d) / (floatValue * 1.0d)) * d3);
            }
            frameViewHolder.f66529b.setLayoutParams(layoutParams);
            frameViewHolder.f66529b.setImageBitmap(null);
            frameViewHolder.f66529b.setBackgroundColor(FramesAdapter.this.f66524c.getResources().getColor(C0906R.color.c6));
            if (FramesAdapter.this.n) {
                frameViewHolder.f66529b.setImageBitmap(FramesAdapter.this.m.get(i3));
            } else if (FramesAdapter.this.f66527f != null) {
                String str2 = FramesAdapter.this.g.get(a2).f66495b;
                g gVar = FramesAdapter.this.f66527f;
                String str3 = FramesAdapter.this.g.get(a2).f66495b;
                int a3 = frameViewHolder.a(FramesAdapter.this.g.get(a2).f66495b, i4);
                b bVar = new b(frameViewHolder, frameViewHolder, str, i2, pair, str2);
                gVar.a(i2, str3, a3, i4, bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(LifecycleOwner lifecycleOwner, HashMap<String, Float> hashMap, int i2, boolean z) {
        HashMap<String, Float> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, hashMap2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f66522a, false, 75873, new Class[]{LifecycleOwner.class, HashMap.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, hashMap2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f66522a, false, 75873, new Class[]{LifecycleOwner.class, HashMap.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(hashMap2);
    }

    /* access modifiers changed from: package-private */
    public final void a(LifecycleOwner lifecycleOwner, HashMap<String, Float> hashMap, h hVar, boolean z) {
        HashMap<String, Float> hashMap2 = hashMap;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, hashMap2, hVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f66522a, false, 75874, new Class[]{LifecycleOwner.class, HashMap.class, h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, hashMap2, hVar2, Byte.valueOf(z)}, this, f66522a, false, 75874, new Class[]{LifecycleOwner.class, HashMap.class, h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.clear();
        this.g.add(hVar2);
        a(hashMap2);
    }

    private void a(Context context, List<h> list, HashMap<String, Float> hashMap, int i2, RecyclerView recyclerView) {
        Context context2 = context;
        List<h> list2 = list;
        HashMap<String, Float> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{context2, list2, hashMap2, Integer.valueOf(i2), recyclerView}, this, f66522a, false, 75862, new Class[]{Context.class, List.class, HashMap.class, Integer.TYPE, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, list2, hashMap2, Integer.valueOf(i2), recyclerView}, this, f66522a, false, 75862, new Class[]{Context.class, List.class, HashMap.class, Integer.TYPE, RecyclerView.class}, Void.TYPE);
            return;
        }
        this.f66524c = context2;
        this.f66523b = i2;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            h hVar = list2.get(i4);
            this.f66525d.put(hVar.f66495b, Float.valueOf(hashMap2.get(hVar.f66495b).floatValue() * ((float) this.k)));
            i3 += a((int) list2.get(i4).f66496c, hVar.f66495b);
        }
        this.p = i3;
        this.h = list2;
    }

    public FramesAdapter(Context context, int[] iArr, List<h> list, HashMap<String, Float> hashMap, int i2, RecyclerView recyclerView) {
        this.k = iArr[0];
        this.l = iArr[1];
        a(context, list, hashMap, i2, recyclerView);
        this.f66527f = new VEMediaParserFrameProviderImpl(context);
    }

    public FramesAdapter(Context context, int[] iArr, List<h> list, HashMap<String, Float> hashMap, int i2, RecyclerView recyclerView, n nVar) {
        this.k = iArr[0];
        this.l = iArr[1];
        a(context, list, hashMap, i2, recyclerView);
        this.f66527f = new com.ss.android.ugc.aweme.shortvideo.widget.a(nVar);
    }
}
