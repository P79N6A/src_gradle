package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.utils.ey;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002)*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0011J\u0016\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u000eR\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adatper", "Landroid/support/v7/widget/RecyclerView$Adapter;", "cutMusicView", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/AVCutMusicView;", "isDown", "", "isUp", "scrollDx", "", "getScrollDx", "()F", "setScrollDx", "(F)V", "scrollListener", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView$ScrollListener;", "init", "", "onTouchEvent", "e", "Landroid/view/MotionEvent;", "setAudioWaveViewData", "bean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "setScrollListener", "listener", "setWaveColor", "color", "startScrollPosition", "position", "updateProgress", "progress", "isAddStart", "ScrollListener", "SelfViewHolder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DmtCutMusicScrollView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66625a;

    /* renamed from: b  reason: collision with root package name */
    public a f66626b;

    /* renamed from: c  reason: collision with root package name */
    public a f66627c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f66628d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f66629e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.Adapter<?> f66630f;
    private float g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView$SelfViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class SelfViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SelfViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtCutMusicScrollView$ScrollListener;", "", "onScrolling", "", "progress", "", "onStopScroll", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(float f2);

        void b(float f2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66631a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtCutMusicScrollView f66632b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f66633c;

        b(DmtCutMusicScrollView dmtCutMusicScrollView, float f2) {
            this.f66632b = dmtCutMusicScrollView;
            this.f66633c = f2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66631a, false, 76087, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66631a, false, 76087, new Class[0], Void.TYPE);
                return;
            }
            a a2 = DmtCutMusicScrollView.a(this.f66632b);
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            this.f66632b.scrollBy((int) (((float) a2.getViewWidth()) * this.f66633c), 0);
        }
    }

    public final float getScrollDx() {
        return this.g;
    }

    public final void setScrollDx(float f2) {
        this.g = f2;
    }

    public static final /* synthetic */ a a(DmtCutMusicScrollView dmtCutMusicScrollView) {
        a aVar = dmtCutMusicScrollView.f66626b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicView");
        }
        return aVar;
    }

    public final void setScrollListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66625a, false, 76076, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66625a, false, 76076, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.f66627c = aVar2;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f66625a, false, 76078, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f66625a, false, 76078, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        post(new b(this, f2));
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f66625a, false, 76075, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f66625a, false, 76075, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent, "e");
        if (motionEvent.getAction() == 1) {
            this.f66628d = true;
        } else if (motionEvent.getAction() == 0) {
            this.f66629e = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioWaveViewData(@Nullable f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f66625a, false, 76077, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f66625a, false, 76077, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar != null) {
            a aVar = this.f66626b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cutMusicView");
            }
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.setAudioWaveViewData(fVar);
            RecyclerView.Adapter<?> adapter = this.f66630f;
            if (adapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adatper");
            }
            setAdapter(adapter);
        }
    }

    public final void setWaveColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66625a, false, 76080, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66625a, false, 76080, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f66626b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicView");
        }
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        aVar.setColor(i);
    }

    public final void a(float f2, boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f66625a, false, 76079, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Byte.valueOf(z)}, this, f66625a, false, 76079, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f66626b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cutMusicView");
        }
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        if (z) {
            i = (int) this.g;
        }
        aVar.a(i, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private DmtCutMusicScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[]{context}, this, f66625a, false, 76074, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f66625a, false, 76074, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f66626b = new a(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        linearLayoutManager.setReverseLayout(ey.a(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.f66630f = new DmtCutMusicScrollView$init$1(this);
        addOnScrollListener(new DmtCutMusicScrollView$init$2(this));
    }

    public /* synthetic */ DmtCutMusicScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
