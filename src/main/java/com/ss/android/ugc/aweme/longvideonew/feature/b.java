package com.ss.android.ugc.aweme.longvideonew.feature;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/feature/ResizeVideoHelper;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f54072a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ>\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ \u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/feature/ResizeVideoHelper$Companion;", "", "()V", "computeVideoSize", "Lcom/ss/android/ugc/aweme/longvideonew/feature/Size;", "width", "", "height", "screenWidth", "screenHeight", "videoWidth", "videoHeight", "landscape", "", "getScreenSize", "isLandscapeVideo", "resizeVideo", "", "view", "Landroid/view/View;", "resizeVideoAndCover", "activity", "Landroid/app/Activity;", "mVideoView", "mCover", "video", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "screenSize", "resizeView", "viewWidth", "viewHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54073a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final d a(int i, int i2) {
            int i3 = i;
            int i4 = i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54073a, false, 56917, new Class[]{Integer.TYPE, Integer.TYPE}, d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f54073a, false, 56917, new Class[]{Integer.TYPE, Integer.TYPE}, d.class);
            } else if (i3 > i4) {
                return new d(i4, i3);
            } else {
                return new d(i3, i4);
            }
        }

        public final void a(@Nullable Activity activity, @Nullable View view, @Nullable View view2, @Nullable Video video, @NotNull d dVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            d dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{activity, view, view2, video, dVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f54073a, false, 56918, new Class[]{Activity.class, View.class, View.class, Video.class, d.class, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {activity, view, view2, video, dVar2, Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f54073a, false, 56918, new Class[]{Activity.class, View.class, View.class, Video.class, d.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "screenSize");
            if (activity != null && view != null && view2 != null) {
                a aVar = b.f54072a;
                if (video != null) {
                    i = video.getWidth();
                } else {
                    i = 0;
                }
                if (video != null) {
                    i2 = video.getHeight();
                } else {
                    i2 = 0;
                }
                aVar.a(view, i, i2, dVar2.f54076a, dVar2.f54077b, z);
                a aVar2 = b.f54072a;
                if (video != null) {
                    i3 = video.getWidth();
                } else {
                    i3 = 0;
                }
                if (video != null) {
                    i4 = video.getHeight();
                } else {
                    i4 = 0;
                }
                aVar2.a(view2, i3, i4, dVar2.f54076a, dVar2.f54077b, z);
            }
        }

        private void a(@NotNull View view, int i, int i2, int i3, int i4, boolean z) {
            d dVar;
            int i5;
            int i6;
            int i7;
            View view2 = view;
            int i8 = i;
            int i9 = i2;
            int i10 = i3;
            int i11 = i4;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, f54073a, false, 56913, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f54073a, false, 56913, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            a aVar = this;
            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)};
            if (PatchProxy.isSupport(objArr3, aVar, f54073a, false, 56916, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, d.class)) {
                Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)};
                Object[] objArr5 = objArr4;
                a aVar2 = aVar;
                dVar = (d) PatchProxy.accessDispatch(objArr5, aVar2, f54073a, false, 56916, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, d.class);
            } else if (!z) {
                a aVar3 = aVar;
                Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                if (PatchProxy.isSupport(objArr6, aVar3, f54073a, false, 56914, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, d.class)) {
                    Object[] objArr7 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    Object[] objArr8 = objArr7;
                    a aVar4 = aVar3;
                    dVar = (d) PatchProxy.accessDispatch(objArr8, aVar4, f54073a, false, 56914, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, d.class);
                } else {
                    double d2 = (double) i8;
                    double d3 = (double) i9;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = (double) i10;
                    double d5 = d2;
                    double d6 = (double) i11;
                    Double.isNaN(d4);
                    Double.isNaN(d6);
                    if (d2 / d3 > d4 / d6) {
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        Double.isNaN(d5);
                        i11 = (int) ((d4 * d3) / d5);
                        i7 = i10;
                    } else {
                        Double.isNaN(d6);
                        Double.isNaN(d5);
                        Double.isNaN(d3);
                        i7 = (int) ((d6 * d5) / d3);
                    }
                    dVar = new d(i7, i11);
                }
            } else {
                double d7 = (double) i8;
                double d8 = (double) i9;
                Double.isNaN(d7);
                Double.isNaN(d8);
                if (d7 / d8 > 0.625d) {
                    if (i8 <= 0 || i9 <= 0) {
                        i6 = i10;
                    } else {
                        i6 = (i8 * i10) / i9;
                    }
                    i5 = i10;
                } else {
                    if (i8 <= 0 || i9 <= 0) {
                        i5 = i11;
                    } else {
                        i5 = (i9 * i11) / i8;
                    }
                    i6 = i11;
                }
                dVar = new d(i6, i5);
            }
            int i12 = dVar.f54076a;
            int i13 = dVar.f54077b;
            Object[] objArr9 = {view2, Integer.valueOf(i12), Integer.valueOf(i13)};
            if (PatchProxy.isSupport(objArr9, aVar, f54073a, false, 56915, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr10 = {view2, Integer.valueOf(i12), Integer.valueOf(i13)};
                Object[] objArr11 = objArr10;
                a aVar5 = aVar;
                PatchProxy.accessDispatch(objArr11, aVar5, f54073a, false, 56915, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (!(marginLayoutParams.width == i12 && marginLayoutParams.height == i13 && Build.VERSION.SDK_INT >= 19)) {
                    marginLayoutParams.width = i12;
                    marginLayoutParams.height = i13;
                    view2.setLayoutParams(marginLayoutParams);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
