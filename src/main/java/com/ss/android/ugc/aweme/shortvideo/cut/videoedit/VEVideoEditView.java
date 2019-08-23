package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.v4.util.Pair;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.ak;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nJ\b\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\nH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VEVideoEditView;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentProgress", "", "addObservers", "", "getLeftSeekingValue", "getMultiPlayingPosition", "getMultiSeekTime", "getMultiSeekTimeInner", "seekPosition", "totalSpeed", "", "getMultiVideoPlayBoundary", "Landroid/support/v4/util/Pair;", "getPlayingPosition", "getRightSeekingValue", "getSinglePlayingPosition", "processVEProgress", "editState", "progress", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEVideoEditView extends VideoEditView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66538a;

    /* renamed from: b  reason: collision with root package name */
    public long f66539b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "progress", "", "onChanged", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEVideoEditView f66541b;

        a(VEVideoEditView vEVideoEditView) {
            this.f66541b = vEVideoEditView;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Long l = (Long) obj;
            if (PatchProxy.isSupport(new Object[]{l}, this, f66540a, false, 75899, new Class[]{Long.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{l}, this, f66540a, false, 75899, new Class[]{Long.class}, Void.TYPE);
            } else if (l != null) {
                VEVideoEditView vEVideoEditView = this.f66541b;
                Intrinsics.checkExpressionValueIsNotNull(l, AdvanceSetting.NETWORK_TYPE);
                vEVideoEditView.f66539b = l.longValue();
                this.f66541b.a(this.f66541b.u, this.f66541b.f66539b);
            }
        }
    }

    @JvmOverloads
    public VEVideoEditView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public VEVideoEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final long getLeftSeekingValue() {
        return (long) ((this.r + ((float) ak.f66359e)) * this.n.f66481f);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66538a, false, 75888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75888, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f66547f;
        Intrinsics.checkExpressionValueIsNotNull(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        cutMultiVideoViewModel.f66183e.observe(this.f66545d, new a(this));
    }

    public final long getMultiPlayingPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f66538a, false, 75892, new Class[0], Long.TYPE)) {
            return getPlayingPosition();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75892, new Class[0], Long.TYPE)).longValue();
    }

    public final long getMultiSeekTime() {
        if (!PatchProxy.isSupport(new Object[0], this, f66538a, false, 75894, new Class[0], Long.TYPE)) {
            return getSingleSeekTime();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75894, new Class[0], Long.TYPE)).longValue();
    }

    public final long getSinglePlayingPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f66538a, false, 75893, new Class[0], Long.TYPE)) {
            return getPlayingPosition();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75893, new Class[0], Long.TYPE)).longValue();
    }

    @NotNull
    public final Pair<Long, Long> getMultiVideoPlayBoundary() {
        if (PatchProxy.isSupport(new Object[0], this, f66538a, false, 75889, new Class[0], Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75889, new Class[0], Pair.class);
        }
        VideoEditViewModel videoEditViewModel = this.f66546e;
        Intrinsics.checkExpressionValueIsNotNull(videoEditViewModel, "videoEditViewModel");
        long a2 = a((long) ((this.r + ((float) ak.f66359e)) * this.n.f66481f), videoEditViewModel.d());
        VideoEditViewModel videoEditViewModel2 = this.f66546e;
        Intrinsics.checkExpressionValueIsNotNull(videoEditViewModel2, "videoEditViewModel");
        return new Pair<>(Long.valueOf(a2), Long.valueOf(a((long) ((this.r + ((float) ak.f66359e) + this.s) * this.n.f66481f), videoEditViewModel2.d())));
    }

    public final long getPlayingPosition() {
        if (PatchProxy.isSupport(new Object[0], this, f66538a, false, 75890, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75890, new Class[0], Long.TYPE)).longValue();
        }
        float f2 = this.r;
        RTLLinearLayout rTLLinearLayout = this.mCurPointerContainer;
        Intrinsics.checkExpressionValueIsNotNull(rTLLinearLayout, "mCurPointerContainer");
        float startX = f2 + rTLLinearLayout.getStartX();
        RTLImageView rTLImageView = this.h;
        Intrinsics.checkExpressionValueIsNotNull(rTLImageView, "mStartSlide");
        return (long) ((startX - rTLImageView.getStartX()) * this.n.f66481f);
    }

    public final long getRightSeekingValue() {
        if (PatchProxy.isSupport(new Object[0], this, f66538a, false, 75891, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66538a, false, 75891, new Class[0], Long.TYPE)).longValue();
        }
        float f2 = this.r;
        RTLImageView rTLImageView = this.g;
        Intrinsics.checkExpressionValueIsNotNull(rTLImageView, "mEndSlide");
        float startX = f2 + rTLImageView.getStartX();
        RTLImageView rTLImageView2 = this.h;
        Intrinsics.checkExpressionValueIsNotNull(rTLImageView2, "mStartSlide");
        return (long) ((startX - rTLImageView2.getStartX()) * this.n.f66481f);
    }

    public final void a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f66538a, false, 75896, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f66538a, false, 75896, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        RTLImageView rTLImageView = this.h;
        Intrinsics.checkExpressionValueIsNotNull(rTLImageView, "mStartSlide");
        a((rTLImageView.getStartX() + (((float) j2) / this.n.f66481f)) - this.r, false);
    }

    private final long a(long j, float f2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2)}, this, f66538a, false, 75895, new Class[]{Long.TYPE, Float.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2)}, this, f66538a, false, 75895, new Class[]{Long.TYPE, Float.TYPE}, Long.TYPE)).longValue();
        }
        VideoEditViewModel videoEditViewModel = this.f66546e;
        Intrinsics.checkExpressionValueIsNotNull(videoEditViewModel, "videoEditViewModel");
        if (videoEditViewModel.c() != null) {
            VideoEditViewModel videoEditViewModel2 = this.f66546e;
            Intrinsics.checkExpressionValueIsNotNull(videoEditViewModel2, "videoEditViewModel");
            if (!videoEditViewModel2.c().isEmpty()) {
                VideoEditViewModel videoEditViewModel3 = this.f66546e;
                Intrinsics.checkExpressionValueIsNotNull(videoEditViewModel3, "videoEditViewModel");
                List<h> c2 = videoEditViewModel3.c();
                Intrinsics.checkExpressionValueIsNotNull(c2, "videoEditViewModel.originVideoList");
                long j3 = 0;
                for (h hVar : c2) {
                    if (!hVar.j) {
                        float f3 = ((float) (hVar.f66498e - hVar.f66497d)) / (hVar.f66499f * f2);
                        float f4 = (float) j2;
                        if (f4 <= f3) {
                            return (long) ((((float) j3) + (f4 * hVar.f66499f)) * f2);
                        }
                        j3 += hVar.f66498e - hVar.f66497d;
                        j2 = (long) (f4 - f3);
                    }
                }
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VEVideoEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setLoadThumbnailDirectly(!com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VEExtractFramesAfterRender));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VEVideoEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
