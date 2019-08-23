package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.animation.ObjectAnimator;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\nH\u0007J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020\u0016H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parent", "Landroid/widget/FrameLayout;", "onItemClickListener", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder$OnItemClickListener;", "(Landroid/widget/FrameLayout;Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder$OnItemClickListener;)V", "itemImgView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "mCurrentState", "", "mIvAudioDownload", "Landroid/widget/ImageView;", "mRotationAnim", "Landroid/animation/ObjectAnimator;", "mStartDownloadTime", "", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder$OnItemClickListener;", "getParent", "()Landroid/widget/FrameLayout;", "bind", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindAudioEffect", "bindOST", "cancelRotationAnim", "changeDownloadState", "state", "hideLoadingAnimation", "isOST", "", "setSelected", "selected", "startRotationAnim", "Companion", "OnItemClickListener", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AudioItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67022a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f67023f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    ImageView f67024b = ((ImageView) this.itemView.findViewById(C0906R.id.ayq));

    /* renamed from: c  reason: collision with root package name */
    AVDmtImageTextView f67025c = ((AVDmtImageTextView) this.itemView.findViewById(C0906R.id.atv));
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f67026d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final b f67027e;
    private ObjectAnimator g;
    private int h = -1;
    private long i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder$Companion;", "", "()V", "MIN_LOADING_TIME_MILLISECONDS", "", "createView", "Landroid/widget/FrameLayout;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67030a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull View view, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioItemViewHolder f67032b;

        c(AudioItemViewHolder audioItemViewHolder) {
            this.f67032b = audioItemViewHolder;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67031a, false, 76677, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67031a, false, 76677, new Class[0], Void.TYPE);
                return;
            }
            this.f67032b.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f67022a, false, 76665, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67022a, false, 76665, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getAdapterPosition() == 0) {
            z = true;
        }
        return z;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67022a, false, 76670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67022a, false, 76670, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f67024b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        d();
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67022a, false, 76671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67022a, false, 76671, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f67024b;
        if (imageView == null) {
            Intrinsics.throwNpe();
        }
        this.g = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 360.0f});
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.setDuration(800);
        }
        ObjectAnimator objectAnimator2 = this.g;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator3 = this.g;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator4 = this.g;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f67022a, false, 76672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67022a, false, 76672, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.g;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
        ImageView imageView = this.f67024b;
        if (imageView != null) {
            imageView.setRotation(0.0f);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67022a, false, 76673, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67022a, false, 76673, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AVDmtImageTextView aVDmtImageTextView = this.f67025c;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(z);
        }
    }

    @UiThread
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67022a, false, 76669, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67022a, false, 76669, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!a() && i2 != this.h) {
            int i3 = this.h;
            this.h = i2;
            switch (i2) {
                case 0:
                case 3:
                    ImageView imageView = this.f67024b;
                    if (imageView != null) {
                        imageView.setImageResource(2130839396);
                    }
                    ImageView imageView2 = this.f67024b;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    d();
                    break;
                case 1:
                    if (2 != i3 || this.i <= 0) {
                        b();
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis() - this.i;
                    if (currentTimeMillis >= 100) {
                        b();
                        return;
                    } else {
                        this.itemView.postDelayed(new c(this), 100 - currentTimeMillis);
                        return;
                    }
                case 2:
                    this.i = System.currentTimeMillis();
                    ImageView imageView3 = this.f67024b;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ImageView imageView4 = this.f67024b;
                    if (imageView4 != null) {
                        imageView4.setImageResource(2130837672);
                    }
                    c();
                    return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioItemViewHolder(@NotNull FrameLayout frameLayout, @Nullable b bVar) {
        super(frameLayout);
        Intrinsics.checkParameterIsNotNull(frameLayout, "parent");
        this.f67026d = frameLayout;
        this.f67027e = bVar;
        this.itemView.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67028a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AudioItemViewHolder f67029b;

            {
                this.f67029b = r1;
            }

            public final void onClick(View view) {
                long j;
                View view2 = view;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f67028a, false, 76675, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f67028a, false, 76675, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                b bVar = b.f67057c;
                View view3 = this.f67029b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                if (PatchProxy.isSupport(new Object[]{view3}, bVar, b.f67055a, false, 76593, new Class[]{View.class}, Boolean.TYPE)) {
                    Object[] objArr = {view3};
                    b bVar2 = bVar;
                    z = ((Boolean) PatchProxy.accessDispatch(objArr, bVar2, b.f67055a, false, 76593, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Intrinsics.checkParameterIsNotNull(view3, "target");
                    int hashCode = view3.hashCode();
                    long currentTimeMillis = System.currentTimeMillis();
                    Long l = b.f67056b.get(hashCode);
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    long j2 = currentTimeMillis - j;
                    b.f67056b.put(hashCode, Long.valueOf(currentTimeMillis));
                    if (1 > j2 || 650 <= j2) {
                        z = false;
                    }
                }
                if (!z) {
                    b bVar3 = this.f67029b.f67027e;
                    if (bVar3 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
                        bVar3.a(view2, this.f67029b.getAdapterPosition());
                    }
                }
            }
        });
    }
}
