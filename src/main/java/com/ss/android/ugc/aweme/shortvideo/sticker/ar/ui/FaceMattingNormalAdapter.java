package com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui;

import android.net.Uri;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.model.Face;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.c;
import java.io.File;
import java.util.ArrayList;

public class FaceMattingNormalAdapter extends RecyclerView.Adapter<FaceMattingNormalViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69447a;

    /* renamed from: b  reason: collision with root package name */
    public c f69448b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<Face> f69449c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<Face> f69450d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public Face f69451e = null;

    /* renamed from: f  reason: collision with root package name */
    public DiffUtil.Callback f69452f = new DiffUtil.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69453a;

        public int getNewListSize() {
            if (!PatchProxy.isSupport(new Object[0], this, f69453a, false, 79027, new Class[0], Integer.TYPE)) {
                return FaceMattingNormalAdapter.this.f69449c.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69453a, false, 79027, new Class[0], Integer.TYPE)).intValue();
        }

        public int getOldListSize() {
            if (!PatchProxy.isSupport(new Object[0], this, f69453a, false, 79026, new Class[0], Integer.TYPE)) {
                return FaceMattingNormalAdapter.this.f69450d.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69453a, false, 79026, new Class[0], Integer.TYPE)).intValue();
        }

        public boolean areContentsTheSame(int i, int i2) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69453a, false, 79029, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return FaceMattingNormalAdapter.this.f69450d.get(i).equals(FaceMattingNormalAdapter.this.f69449c.get(i2));
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69453a, false, 79029, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }

        public boolean areItemsTheSame(int i, int i2) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69453a, false, 79028, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return FaceMattingNormalAdapter.this.f69450d.get(i).equals(FaceMattingNormalAdapter.this.f69449c.get(i2));
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69453a, false, 79028, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
    };

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f69447a, false, 79024, new Class[0], Integer.TYPE)) {
            return this.f69449c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69447a, false, 79024, new Class[0], Integer.TYPE)).intValue();
    }

    public FaceMattingNormalAdapter(c cVar) {
        this.f69448b = cVar;
    }

    private String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f69447a, false, 79025, new Class[]{String.class}, String.class)) {
            return Uri.fromFile(new File(str2)).toString();
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f69447a, false, 79025, new Class[]{String.class}, String.class);
    }

    /* renamed from: a */
    public final FaceMattingNormalViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69447a, false, 79019, new Class[]{ViewGroup.class, Integer.TYPE}, FaceMattingNormalViewHolder.class)) {
            return (FaceMattingNormalViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69447a, false, 79019, new Class[]{ViewGroup.class, Integer.TYPE}, FaceMattingNormalViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sa, viewGroup2, false);
        final FaceMattingNormalViewHolder faceMattingNormalViewHolder = new FaceMattingNormalViewHolder(inflate);
        inflate.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69455a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f69455a, false, 79030, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f69455a, false, 79030, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                int adapterPosition = faceMattingNormalViewHolder.getAdapterPosition();
                if (FaceMattingNormalAdapter.this.f69451e == FaceMattingNormalAdapter.this.f69449c.get(adapterPosition)) {
                    faceMattingNormalViewHolder.f69459a.setVisibility(8);
                    FaceMattingNormalAdapter.this.f69451e = null;
                    if (FaceMattingNormalAdapter.this.f69448b != null) {
                        FaceMattingNormalAdapter.this.f69448b.a();
                    }
                } else {
                    int indexOf = FaceMattingNormalAdapter.this.f69449c.indexOf(FaceMattingNormalAdapter.this.f69451e);
                    FaceMattingNormalAdapter.this.f69451e = FaceMattingNormalAdapter.this.f69449c.get(adapterPosition);
                    FaceMattingNormalAdapter.this.notifyItemChanged(indexOf);
                    faceMattingNormalViewHolder.f69459a.setVisibility(0);
                    if (FaceMattingNormalAdapter.this.f69448b != null) {
                        FaceMattingNormalAdapter.this.f69448b.a(FaceMattingNormalAdapter.this.f69449c.get(adapterPosition));
                    }
                }
            }
        });
        return faceMattingNormalViewHolder;
    }

    /* renamed from: a */
    public final void onBindViewHolder(FaceMattingNormalViewHolder faceMattingNormalViewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{faceMattingNormalViewHolder, Integer.valueOf(i)}, this, f69447a, false, 79020, new Class[]{FaceMattingNormalViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceMattingNormalViewHolder, Integer.valueOf(i)}, this, f69447a, false, 79020, new Class[]{FaceMattingNormalViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f69451e == this.f69449c.get(i)) {
            faceMattingNormalViewHolder.f69459a.setVisibility(0);
        } else {
            faceMattingNormalViewHolder.f69459a.setVisibility(8);
        }
        com.ss.android.ugc.aweme.base.c.a(faceMattingNormalViewHolder.f69460b, a(this.f69449c.get(i).path));
    }
}
