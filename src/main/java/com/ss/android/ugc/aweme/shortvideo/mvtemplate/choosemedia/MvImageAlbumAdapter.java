package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import a.g;
import a.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class MvImageAlbumAdapter extends RecyclerView.Adapter<MyHolder> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68548a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f68549b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    HashMap<String, a> f68550c;

    /* renamed from: d  reason: collision with root package name */
    int f68551d;

    /* renamed from: e  reason: collision with root package name */
    b f68552e;

    /* renamed from: f  reason: collision with root package name */
    private Context f68553f;
    private LayoutInflater g;

    class MyHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68554a;

        /* renamed from: b  reason: collision with root package name */
        View f68555b;

        /* renamed from: c  reason: collision with root package name */
        AnimatedImageView f68556c;

        /* renamed from: d  reason: collision with root package name */
        TextView f68557d;

        /* renamed from: e  reason: collision with root package name */
        TextView f68558e;

        MyHolder(View view, AnimatedImageView animatedImageView, TextView textView, TextView textView2) {
            super(view);
            this.f68555b = view;
            this.f68556c = animatedImageView;
            this.f68557d = textView;
            this.f68558e = textView2;
        }
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68560a;

        /* renamed from: b  reason: collision with root package name */
        String f68561b = "";

        /* renamed from: c  reason: collision with root package name */
        List<MvImageChooseAdapter.b> f68562c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        List<MvImageChooseAdapter.b> f68563d = new ArrayList();

        a() {
        }
    }

    public interface b {
        void a(a aVar, boolean z, int i);
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f68548a, false, 77989, new Class[0], Integer.TYPE)) {
            return this.f68549b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68548a, false, 77989, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68548a, false, 77990, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return super.getItemViewType(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68548a, false, 77990, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f68548a, false, 77992, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f68548a, false, 77992, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = (a) view.getTag();
        if (this.f68552e != null) {
            this.f68552e.a(aVar, true, this.f68551d);
        }
    }

    public MvImageAlbumAdapter(Context context, b bVar) {
        this.f68553f = context;
        this.g = LayoutInflater.from(context);
        this.f68552e = bVar;
        a aVar = new a();
        aVar.f68561b = this.f68553f.getResources().getString(C0906R.string.e7);
        this.f68549b.add(aVar);
        this.f68550c = new HashMap<>();
        Iterator<a> it2 = this.f68549b.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            this.f68550c.put(next.f68561b, next);
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f68548a, false, 77987, new Class[]{ViewGroup.class, Integer.TYPE}, MyHolder.class)) {
            return (MyHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f68548a, false, 77987, new Class[]{ViewGroup.class, Integer.TYPE}, MyHolder.class);
        }
        View inflate = this.g.inflate(C0906R.layout.xz, viewGroup, false);
        MyHolder myHolder = new MyHolder(inflate, (AnimatedImageView) inflate.findViewById(C0906R.id.b2_), (TextView) inflate.findViewById(C0906R.id.arh), (TextView) inflate.findViewById(C0906R.id.ara));
        inflate.setOnClickListener(this);
        return myHolder;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        com.ss.android.ugc.aweme.music.b.a.a aVar;
        int i2;
        MyHolder myHolder = (MyHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{myHolder, Integer.valueOf(i)}, this, f68548a, false, 77988, new Class[]{MyHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{myHolder, Integer.valueOf(i)}, this, f68548a, false, 77988, new Class[]{MyHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar2 = this.f68549b.get(i);
        if (PatchProxy.isSupport(new Object[]{aVar2}, myHolder, MyHolder.f68554a, false, 77999, new Class[]{a.class}, Void.TYPE)) {
            MyHolder myHolder2 = myHolder;
            PatchProxy.accessDispatch(new Object[]{aVar2}, myHolder2, MyHolder.f68554a, false, 77999, new Class[]{a.class}, Void.TYPE);
            return;
        }
        myHolder.f68555b.setTag(aVar2);
        myHolder.f68557d.setText(aVar2.f68561b);
        myHolder.f68558e.setText(String.valueOf(aVar2.f68562c.size() + aVar2.f68563d.size()));
        if (!(aVar2.f68562c.size() == 0 && aVar2.f68563d.size() == 0)) {
            if (Lists.isEmpty(aVar2.f68562c)) {
                aVar = aVar2.f68563d.get(0);
            } else {
                aVar = aVar2.f68562c.get(0);
            }
            if (aVar != null && com.ss.android.ugc.aweme.video.b.b(aVar.f56315e)) {
                if (myHolder.f68556c.getLayoutParams().width > 0) {
                    i2 = myHolder.f68556c.getLayoutParams().width;
                } else {
                    i2 = -1;
                }
                c.a((RemoteImageView) myHolder.f68556c, Uri.fromFile(new File(aVar.f56315e)).toString(), i2, i2, Bitmap.Config.ARGB_4444);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, MvImageChooseAdapter.b bVar, int i) {
        a aVar2 = aVar;
        MvImageChooseAdapter.b bVar2 = bVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aVar2, bVar2, Integer.valueOf(i)}, this, f68548a, false, 77995, new Class[]{a.class, MvImageChooseAdapter.b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, bVar2, Integer.valueOf(i)}, this, f68548a, false, 77995, new Class[]{a.class, MvImageChooseAdapter.b.class, Integer.TYPE}, Void.TYPE);
        } else if (bVar2 != null) {
            if (i2 == 4) {
                aVar2.f68563d.add(bVar2);
                return;
            }
            if (i2 == 3) {
                aVar2.f68562c.add(bVar2);
            }
        }
    }

    public final void a(List<MvImageChooseAdapter.b> list, int i, boolean z) {
        List<MvImageChooseAdapter.b> list2 = list;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f68548a, false, 77993, new Class[]{List.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Byte.valueOf(z)}, this, f68548a, false, 77993, new Class[]{List.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i2 == 4 || i2 == 3) {
            i.a((Callable<TResult>) new p<TResult>(this, z, i2, list)).a((g<TResult, TContinuationResult>) new q<TResult,TContinuationResult>(this, i2), i.f1052b);
        }
    }
}
