package com.ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.base.AbsVEDownloadableEffectAdapter;
import com.ss.android.ugc.aweme.effect.base.EffectDownloadState;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;

public class VEStickerEffectAdapter extends AbsVEDownloadableEffectAdapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43625a;

    /* renamed from: b  reason: collision with root package name */
    public a f43626b;

    /* renamed from: c  reason: collision with root package name */
    public int f43627c = -1;

    class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43628a;

        /* renamed from: b  reason: collision with root package name */
        AVDmtImageTextView f43629b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f43630c;

        /* renamed from: d  reason: collision with root package name */
        ObjectAnimator f43631d;
        @EffectDownloadState.State

        /* renamed from: e  reason: collision with root package name */
        int f43632e = -1;

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f43628a, false, 38805, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43628a, false, 38805, new Class[0], Void.TYPE);
                return;
            }
            if (this.f43631d != null && this.f43631d.isRunning()) {
                this.f43631d.cancel();
            }
            this.f43630c.setRotation(0.0f);
            this.f43630c.setImageResource(2130837671);
        }

        ViewHolder(View view) {
            super(view);
            this.f43629b = (AVDmtImageTextView) view.findViewById(C0906R.id.cvk);
            this.f43630c = (ImageView) view.findViewById(C0906R.id.b0w);
            this.f43629b.setOnClickListener(new ak(this));
        }
    }

    public interface a {
        void a(EffectModel effectModel, int i, int i2);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f43625a, false, 38800, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43625a, false, 38800, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f43711e == null) {
            return 0;
        } else {
            return this.f43711e.size();
        }
    }

    public final void a(EffectPointModel effectPointModel) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{effectPointModel}, this, f43625a, false, 38801, new Class[]{EffectPointModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectPointModel}, this, f43625a, false, 38801, new Class[]{EffectPointModel.class}, Void.TYPE);
        } else if (effectPointModel == null) {
            if (this.f43627c != -1) {
                int i2 = this.f43627c;
                this.f43627c = -1;
                notifyItemChanged(i2);
            }
        } else {
            while (true) {
                if (i >= this.f43711e.size()) {
                    break;
                } else if (this.f43711e.get(i).key.equals(effectPointModel.getKey())) {
                    this.f43627c = i;
                    break;
                } else {
                    i++;
                }
            }
            notifyItemChanged(this.f43627c);
        }
    }

    public VEStickerEffectAdapter(RecyclerView recyclerView, @Nullable com.ss.android.ugc.aweme.effect.a.a aVar) {
        super(recyclerView, aVar);
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43625a, false, 38798, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43625a, false, 38798, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
        }
        return new ViewHolder(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C0906R.layout.a0v, viewGroup2, false));
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2 = i;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43625a, false, 38799, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {viewHolder2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f43625a, false, 38799, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int a2 = a(i2);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(a2)}, viewHolder2, ViewHolder.f43628a, false, 38802, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            ViewHolder viewHolder3 = viewHolder2;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(a2)}, viewHolder3, ViewHolder.f43628a, false, 38802, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        EffectModel effectModel = VEStickerEffectAdapter.this.f43711e.get(i2);
        if (effectModel != null) {
            viewHolder2.f43629b.a(effectModel.iconUrl);
            viewHolder2.f43629b.setText(effectModel.name);
            AVDmtImageTextView aVDmtImageTextView = viewHolder2.f43629b;
            if (i2 == VEStickerEffectAdapter.this.f43627c) {
                z = true;
            } else {
                z = false;
            }
            aVDmtImageTextView.a(z);
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, viewHolder2, ViewHolder.f43628a, false, 38803, new Class[]{Integer.TYPE}, Void.TYPE)) {
                if (viewHolder2.f43632e != a2) {
                    viewHolder2.f43632e = a2;
                    switch (a2) {
                        case 0:
                            viewHolder2.a();
                            viewHolder2.f43630c.setVisibility(0);
                            return;
                        case 1:
                            viewHolder2.f43630c.setVisibility(8);
                            return;
                        case 2:
                            if (PatchProxy.isSupport(new Object[0], viewHolder2, ViewHolder.f43628a, false, 38804, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], viewHolder2, ViewHolder.f43628a, false, 38804, new Class[0], Void.TYPE);
                                break;
                            } else {
                                viewHolder2.f43630c.setVisibility(0);
                                viewHolder2.f43630c.setImageResource(2130837672);
                                viewHolder2.f43631d = ObjectAnimator.ofFloat(viewHolder2.f43630c, "rotation", new float[]{0.0f, 360.0f});
                                viewHolder2.f43631d.setDuration(800);
                                viewHolder2.f43631d.setRepeatMode(1);
                                viewHolder2.f43631d.setRepeatCount(-1);
                                viewHolder2.f43631d.start();
                                return;
                            }
                        case 3:
                            viewHolder2.a();
                            viewHolder2.f43630c.setVisibility(8);
                            return;
                        case 4:
                            viewHolder2.f43630c.setVisibility(0);
                            viewHolder2.a();
                            break;
                    }
                }
            } else {
                ViewHolder viewHolder4 = viewHolder2;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, viewHolder4, ViewHolder.f43628a, false, 38803, new Class[]{Integer.TYPE}, Void.TYPE);
            }
        }
    }
}
