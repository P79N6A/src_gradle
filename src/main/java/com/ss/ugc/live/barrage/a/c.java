package com.ss.ugc.live.barrage.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import com.ss.ugc.live.barrage.a.a;
import com.ss.ugc.live.barrage.c.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\r\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u001a\u0010\u0016\u001a\u00020\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/ViewWrapperBarrage;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "id", "", "(Landroid/content/Context;I)V", "bitmap", "Landroid/graphics/Bitmap;", "mListener", "com/ss/ugc/live/barrage/barrage/ViewWrapperBarrage$mListener$1", "Lcom/ss/ugc/live/barrage/barrage/ViewWrapperBarrage$mListener$1;", "<set-?>", "getView", "()Landroid/view/View;", "getBitmap", "onHide", "", "onPrepared", "updateView", "barrage_release"}, k = 1, mv = {1, 1, 15})
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f78689a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public View f78690b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f78691c;

    /* renamed from: d  reason: collision with root package name */
    private int f78692d;

    /* renamed from: e  reason: collision with root package name */
    private final a f78693e = new a(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/ugc/live/barrage/barrage/ViewWrapperBarrage$mListener$1", "Lcom/ss/ugc/live/barrage/util/ImageUtil$ConvertBitmapListener;", "onConverted", "", "view", "Landroid/view/View;", "bitmap", "Landroid/graphics/Bitmap;", "barrage_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements a.C0843a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f78694a;

        a(c cVar) {
            this.f78694a = cVar;
        }

        public final void a(@NotNull View view, @NotNull Bitmap bitmap) {
            int i;
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
            this.f78694a.f78690b = view;
            int i2 = 0;
            if (bitmap.isRecycled()) {
                this.f78694a.f78689a = Bitmap.createBitmap(0, 0, Bitmap.Config.ARGB_4444);
            } else {
                this.f78694a.f78689a = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            View view2 = this.f78694a.f78690b;
            if (view2 != null) {
                view2.destroyDrawingCache();
            }
            RectF rectF = this.f78694a.k;
            float f2 = this.f78694a.k.left;
            Bitmap bitmap2 = this.f78694a.f78689a;
            if (bitmap2 != null) {
                i = bitmap2.getWidth();
            } else {
                i = 0;
            }
            rectF.right = f2 + ((float) i);
            RectF rectF2 = this.f78694a.k;
            float f3 = this.f78694a.k.top;
            Bitmap bitmap3 = this.f78694a.f78689a;
            if (bitmap3 != null) {
                i2 = bitmap3.getHeight();
            }
            rectF2.bottom = f3 + ((float) i2);
            this.f78694a.e();
        }
    }

    @Nullable
    public final Bitmap b() {
        return this.f78689a;
    }

    public final void c() {
        super.c();
        View view = this.f78690b;
        if (view != null) {
            com.ss.ugc.live.barrage.c.a.a(view, this.f78693e);
        } else {
            com.ss.ugc.live.barrage.c.a.f78709a.a(this.f78691c, this.f78692d, this.f78693e);
        }
    }

    public final void d() {
        super.d();
        View view = this.f78690b;
        if (view != null) {
            view.destroyDrawingCache();
        }
        this.f78690b = null;
        Bitmap bitmap = this.f78689a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f78689a = null;
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        a(view, -1);
    }

    public c(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        this.f78691c = context;
        a(view);
    }

    private final void a(View view, int i) {
        this.f78690b = view;
        this.f78692d = -1;
        a.C0840a aVar = this.l;
        if (Intrinsics.areEqual((Object) aVar, (Object) a.C0840a.c.f78686a) || Intrinsics.areEqual((Object) aVar, (Object) a.C0840a.d.f78687a)) {
            View view2 = this.f78690b;
            if (view2 != null) {
                com.ss.ugc.live.barrage.c.a.a(view2, this.f78693e);
                return;
            }
            com.ss.ugc.live.barrage.c.a.f78709a.a(this.f78691c, this.f78692d, this.f78693e);
        }
    }
}
