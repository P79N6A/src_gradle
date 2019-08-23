package com.ss.android.ugc.aweme.mediachoose;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapterB;
import com.ss.android.ugc.aweme.photo.local.ImageChooseFragmentB;
import com.ss.android.ugc.aweme.photo.local.MediaChooseFragmentB;
import com.ss.android.ugc.aweme.shortvideo.util.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ImageAlbumAdapter extends RecyclerView.Adapter<MyHolder> implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55068a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<a> f55069b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    Context f55070c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f55071d;

    /* renamed from: e  reason: collision with root package name */
    private ImageChooseFragmentB f55072e;

    class MyHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55075a;

        /* renamed from: b  reason: collision with root package name */
        View f55076b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f55077c;

        /* renamed from: d  reason: collision with root package name */
        TextView f55078d;

        /* renamed from: e  reason: collision with root package name */
        TextView f55079e;

        MyHolder(View view, ImageView imageView, TextView textView, TextView textView2) {
            super(view);
            this.f55076b = view;
            this.f55077c = imageView;
            this.f55078d = textView;
            this.f55079e = textView2;
        }
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        String f55081a = "";

        /* renamed from: b  reason: collision with root package name */
        List<ImageChooseAdapterB.a> f55082b = new ArrayList();

        a() {
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f55068a, false, 58429, new Class[0], Integer.TYPE)) {
            return this.f55069b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f55068a, false, 58429, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55068a, false, 58430, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return super.getItemViewType(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55068a, false, 58430, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55068a, false, 58431, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55068a, false, 58431, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = (a) view.getTag();
        if (aVar != null) {
            ImageChooseFragmentB imageChooseFragmentB = this.f55072e;
            List<ImageChooseAdapterB.a> list = aVar.f55082b;
            if (PatchProxy.isSupport(new Object[]{list}, imageChooseFragmentB, ImageChooseFragmentB.f58573a, false, 63669, new Class[]{List.class}, Void.TYPE)) {
                ImageChooseFragmentB imageChooseFragmentB2 = imageChooseFragmentB;
                PatchProxy.accessDispatch(new Object[]{list}, imageChooseFragmentB2, ImageChooseFragmentB.f58573a, false, 63669, new Class[]{List.class}, Void.TYPE);
                return;
            }
            imageChooseFragmentB.a();
            imageChooseFragmentB.f58578f.a((Collection<? extends ImageChooseAdapterB.a>) list);
            MediaChooseFragmentB mediaChooseFragmentB = imageChooseFragmentB.k;
            if (PatchProxy.isSupport(new Object[0], mediaChooseFragmentB, MediaChooseFragmentB.f58593a, false, 63694, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mediaChooseFragmentB, MediaChooseFragmentB.f58593a, false, 63694, new Class[0], Void.TYPE);
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mediaChooseFragmentB.h, "rotation", new float[]{180.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
            mediaChooseFragmentB.l = true ^ mediaChooseFragmentB.l;
        }
    }

    public ImageAlbumAdapter(Context context, ImageChooseFragmentB imageChooseFragmentB) {
        this.f55070c = context;
        this.f55071d = LayoutInflater.from(context);
        this.f55072e = imageChooseFragmentB;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f55068a, false, 58427, new Class[]{ViewGroup.class, Integer.TYPE}, MyHolder.class)) {
            return (MyHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f55068a, false, 58427, new Class[]{ViewGroup.class, Integer.TYPE}, MyHolder.class);
        }
        View inflate = this.f55071d.inflate(C0906R.layout.vw, viewGroup, false);
        MyHolder myHolder = new MyHolder(inflate, (ImageView) inflate.findViewById(C0906R.id.b2_), (TextView) inflate.findViewById(C0906R.id.arh), (TextView) inflate.findViewById(C0906R.id.ara));
        inflate.setOnClickListener(this);
        return myHolder;
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MyHolder myHolder = (MyHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{myHolder, Integer.valueOf(i)}, this, f55068a, false, 58428, new Class[]{MyHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{myHolder, Integer.valueOf(i)}, this, f55068a, false, 58428, new Class[]{MyHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f55069b.get(i);
        if (PatchProxy.isSupport(new Object[]{aVar}, myHolder, MyHolder.f55075a, false, 58435, new Class[]{a.class}, Void.TYPE)) {
            MyHolder myHolder2 = myHolder;
            PatchProxy.accessDispatch(new Object[]{aVar}, myHolder2, MyHolder.f55075a, false, 58435, new Class[]{a.class}, Void.TYPE);
            return;
        }
        myHolder.f55076b.setTag(aVar);
        myHolder.f55078d.setText(aVar.f55081a);
        myHolder.f55079e.setText(String.valueOf(aVar.f55082b.size()));
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar.f55082b.get(0);
        if (aVar2 != null) {
            myHolder.f55077c.setImageBitmap(g.a(aVar2.f56315e, 200, 200));
        }
    }
}
