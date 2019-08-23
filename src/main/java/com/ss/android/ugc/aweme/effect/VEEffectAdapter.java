package com.ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.base.AbsVEDownloadableEffectAdapter;
import com.ss.android.ugc.aweme.effect.base.EffectDownloadState;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import kotlin.jvm.internal.Intrinsics;

public class VEEffectAdapter extends AbsVEDownloadableEffectAdapter<ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43560a;

    /* renamed from: b  reason: collision with root package name */
    public a f43561b;

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43562a;

        /* renamed from: b  reason: collision with root package name */
        public AVDmtImageTextView f43563b = ((AVDmtImageTextView) this.itemView.findViewById(C0906R.id.cvk));

        /* renamed from: c  reason: collision with root package name */
        ImageView f43564c;

        /* renamed from: d  reason: collision with root package name */
        ObjectAnimator f43565d;
        @EffectDownloadState.State

        /* renamed from: e  reason: collision with root package name */
        int f43566e = -1;

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f43562a, false, 38659, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43562a, false, 38659, new Class[0], Void.TYPE);
                return;
            }
            if (this.f43565d != null && this.f43565d.isRunning()) {
                this.f43565d.cancel();
            }
            this.f43564c.setRotation(0.0f);
            this.f43564c.setImageResource(2130837671);
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43562a, false, 38660, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43562a, false, 38660, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            AVDmtImageTextView aVDmtImageTextView = this.f43563b;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86773, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                AVDmtImageTextView aVDmtImageTextView2 = aVDmtImageTextView;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, aVDmtImageTextView2, AVDmtImageTextView.f74552a, false, 86773, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
            if (stickerImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView.a(z);
        }

        public ViewHolder(View view) {
            super(view);
            this.f43564c = (ImageView) view.findViewById(C0906R.id.b0w);
            this.f43563b.a(true, false);
            this.f43563b.setOnTouchListener(new m(this));
            this.f43563b.setOnClickListener(new n(this));
        }
    }

    public interface a {
        void a(int i, int i2, EffectModel effectModel);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f43560a, false, 38651, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43560a, false, 38651, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f43711e == null) {
            return 0;
        } else {
            return this.f43711e.size();
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43560a, false, 38654, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43560a, false, 38654, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (e.a(this.f43711e.get(i).category)) {
            return 2;
        } else {
            return 1;
        }
    }

    public VEEffectAdapter(RecyclerView recyclerView, @Nullable com.ss.android.ugc.aweme.effect.a.a aVar) {
        super(recyclerView, aVar);
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43560a, false, 38652, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
            return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43560a, false, 38652, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
        }
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tp, viewGroup2, false));
        viewHolder.f43563b.a(true, false);
        if (i == 2) {
            viewHolder.f43563b.setOnTouchListener(null);
        } else {
            viewHolder.f43563b.setOnClickListener(null);
        }
        return viewHolder;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43560a, false, 38653, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43560a, false, 38653, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        EffectModel effectModel = this.f43711e.get(i2);
        int a2 = a(i2);
        if (PatchProxy.isSupport(new Object[]{effectModel, Integer.valueOf(a2)}, viewHolder2, ViewHolder.f43562a, false, 38655, new Class[]{EffectModel.class, Integer.TYPE}, Void.TYPE)) {
            ViewHolder viewHolder3 = viewHolder2;
            PatchProxy.accessDispatch(new Object[]{effectModel, Integer.valueOf(a2)}, viewHolder3, ViewHolder.f43562a, false, 38655, new Class[]{EffectModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (effectModel != null) {
            viewHolder2.f43563b.setText(effectModel.name);
            if (PatchProxy.isSupport(new Object[]{effectModel}, viewHolder2, ViewHolder.f43562a, false, 38656, new Class[]{EffectModel.class}, Void.TYPE)) {
                ViewHolder viewHolder4 = viewHolder2;
                PatchProxy.accessDispatch(new Object[]{effectModel}, viewHolder4, ViewHolder.f43562a, false, 38656, new Class[]{EffectModel.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(viewHolder2.f43563b.getTag())) {
                if (e.a(effectModel)) {
                    viewHolder2.f43563b.a(com.ss.android.ugc.bytex.a.a.a.a(viewHolder2.f43563b.getResources(), com.ss.android.ugc.aweme.port.in.a.f61119b.getResources().getIdentifier(effectModel.iconUrl, "drawable", com.ss.android.ugc.aweme.port.in.a.f61119b.getPackageName())));
                } else {
                    AVDmtImageTextView aVDmtImageTextView = viewHolder2.f43563b;
                    String str = effectModel.iconUrl;
                    Bitmap.Config config = Bitmap.Config.RGB_565;
                    if (PatchProxy.isSupport(new Object[]{str, config}, aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86772, new Class[]{String.class, Bitmap.Config.class}, Void.TYPE)) {
                        AVDmtImageTextView aVDmtImageTextView2 = aVDmtImageTextView;
                        PatchProxy.accessDispatch(new Object[]{str, config}, aVDmtImageTextView2, AVDmtImageTextView.f74552a, false, 86772, new Class[]{String.class, Bitmap.Config.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
                        if (!TextUtils.isEmpty(str) && config != null) {
                            StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
                            if (stickerImageView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                            }
                            stickerImageView.a(str, config);
                        }
                    }
                }
                viewHolder2.f43563b.setTag(effectModel.iconUrl);
            }
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, viewHolder2, ViewHolder.f43562a, false, 38657, new Class[]{Integer.TYPE}, Void.TYPE)) {
                if (viewHolder2.f43566e != a2) {
                    viewHolder2.f43566e = a2;
                    switch (a2) {
                        case 0:
                            viewHolder2.a();
                            viewHolder2.f43564c.setVisibility(0);
                            return;
                        case 1:
                            viewHolder2.f43564c.setVisibility(8);
                            return;
                        case 2:
                            if (PatchProxy.isSupport(new Object[0], viewHolder2, ViewHolder.f43562a, false, 38658, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], viewHolder2, ViewHolder.f43562a, false, 38658, new Class[0], Void.TYPE);
                                break;
                            } else {
                                viewHolder2.f43564c.setVisibility(0);
                                viewHolder2.f43564c.setImageResource(2130837672);
                                viewHolder2.f43565d = ObjectAnimator.ofFloat(viewHolder2.f43564c, "rotation", new float[]{0.0f, 360.0f});
                                viewHolder2.f43565d.setDuration(800);
                                viewHolder2.f43565d.setRepeatMode(1);
                                viewHolder2.f43565d.setRepeatCount(-1);
                                viewHolder2.f43565d.start();
                                return;
                            }
                        case 3:
                            viewHolder2.a();
                            viewHolder2.f43564c.setVisibility(8);
                            return;
                        case 4:
                            viewHolder2.f43564c.setVisibility(0);
                            viewHolder2.a();
                            break;
                    }
                }
            } else {
                ViewHolder viewHolder5 = viewHolder2;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, viewHolder5, ViewHolder.f43562a, false, 38657, new Class[]{Integer.TYPE}, Void.TYPE);
            }
        }
    }
}
