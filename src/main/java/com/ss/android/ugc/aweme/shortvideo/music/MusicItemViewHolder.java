package com.ss.android.ugc.aweme.shortvideo.music;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.tools.music.b.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0018J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001cH\u0016J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicItemViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "itemImgView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "getItemImgView", "()Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "setItemImgView", "(Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;)V", "mAlphaAnim", "Landroid/view/animation/Animation;", "mIvwTagView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getMIvwTagView", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "setMIvwTagView", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;)V", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "bind", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "isSelected", "", "isShowLoading", "needAnimate", "hideLoadingAnim", "setSelected", "selected", "showLoadingAnim", "startAnim", "stopAnim", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class MusicItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68390a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f68391e = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public AVDmtImageTextView f68392b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public RemoteImageView f68393c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final k f68394d;

    /* renamed from: f  reason: collision with root package name */
    private Animation f68395f = new AlphaAnimation(0.0f, 1.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicItemViewHolder$Companion;", "", "()V", "createView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68399a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final View a(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
            int i;
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f68399a, false, 77746, new Class[]{LayoutInflater.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f68399a, false, 77746, new Class[]{LayoutInflater.class, ViewGroup.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            if (b.a() == 0) {
                i = C0906R.layout.fh;
            } else {
                i = C0906R.layout.fi;
            }
            View inflate = layoutInflater2.inflate(i, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(if (ABM…music_new, parent, false)");
            return inflate;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68390a, false, 77740, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68390a, false, 77740, new Class[0], Void.TYPE);
            return;
        }
        b.a();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68390a, false, 77741, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68390a, false, 77741, new Class[0], Void.TYPE);
            return;
        }
        b.a();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f68390a, false, 77742, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68390a, false, 77742, new Class[0], Void.TYPE);
            return;
        }
        AVDmtImageTextView aVDmtImageTextView = this.f68392b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(0.66f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f68392b;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.b(true);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f68390a, false, 77743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68390a, false, 77743, new Class[0], Void.TYPE);
            return;
        }
        AVDmtImageTextView aVDmtImageTextView = this.f68392b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f68392b;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.b(false);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68390a, false, 77744, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68390a, false, 77744, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        AVDmtImageTextView aVDmtImageTextView = this.f68392b;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicItemViewHolder(@NotNull final View view, @Nullable k kVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f68394d = kVar;
        this.f68392b = (AVDmtImageTextView) view.findViewById(C0906R.id.aw9);
        this.f68393c = (RemoteImageView) view.findViewById(C0906R.id.b6q);
        Animation animation = this.f68395f;
        if (animation != null) {
            animation.setDuration(1000);
        }
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68396a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MusicItemViewHolder f68397b;

            {
                this.f68397b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f68396a, false, 77745, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68396a, false, 77745, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                k kVar = this.f68397b.f68394d;
                if (kVar != null) {
                    kVar.a(view, this.f68397b.getAdapterPosition());
                }
            }
        });
    }

    public final void a(@Nullable MusicModel musicModel, boolean z, boolean z2, boolean z3) {
        String str;
        if (PatchProxy.isSupport(new Object[]{musicModel, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f68390a, false, 77739, new Class[]{MusicModel.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f68390a, false, 77739, new Class[]{MusicModel.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        AVDmtImageTextView aVDmtImageTextView = this.f68392b;
        String str2 = null;
        if (aVDmtImageTextView != null) {
            if (musicModel != null) {
                str = musicModel.getName();
            } else {
                str = null;
            }
            aVDmtImageTextView.setText(str);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f68392b;
        if (aVDmtImageTextView2 != null) {
            if (musicModel != null) {
                str2 = musicModel.getPicPremium();
            }
            aVDmtImageTextView2.a(str2);
        }
        boolean z4 = z;
        a(z);
        if (musicModel == null) {
            RemoteImageView remoteImageView = this.f68393c;
            if (remoteImageView == null) {
                Intrinsics.throwNpe();
            }
            remoteImageView.setVisibility(8);
        } else if (musicModel.isMvThemeMusic()) {
            RemoteImageView remoteImageView2 = this.f68393c;
            if (remoteImageView2 == null) {
                Intrinsics.throwNpe();
            }
            remoteImageView2.setVisibility(0);
        } else {
            RemoteImageView remoteImageView3 = this.f68393c;
            if (remoteImageView3 == null) {
                Intrinsics.throwNpe();
            }
            remoteImageView3.setVisibility(8);
        }
        if (z2) {
            AVDmtImageTextView aVDmtImageTextView3 = this.f68392b;
            if (aVDmtImageTextView3 != null) {
                aVDmtImageTextView3.a(0.66f);
            }
            AVDmtImageTextView aVDmtImageTextView4 = this.f68392b;
            if (aVDmtImageTextView4 != null) {
                aVDmtImageTextView4.b(true);
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView5 = this.f68392b;
            if (aVDmtImageTextView5 != null) {
                aVDmtImageTextView5.a(1.0f);
            }
            AVDmtImageTextView aVDmtImageTextView6 = this.f68392b;
            if (aVDmtImageTextView6 != null) {
                aVDmtImageTextView6.b(false);
            }
        }
    }
}
