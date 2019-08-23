package com.bytedance.android.livesdk.chatroom.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/barrage/controller/DiggPathController;", "Lcom/ss/ugc/live/barrage/controller/AbsBarrageController;", "barrageView", "Lcom/ss/ugc/live/barrage/view/BarrageLayout;", "path", "Landroid/graphics/Path;", "duration", "", "(Lcom/ss/ugc/live/barrage/view/BarrageLayout;Landroid/graphics/Path;I)V", "pathMeasure", "Landroid/graphics/PathMeasure;", "runBarrageProgressList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "startPos", "", "onAddBarrage", "", "barrage", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "onClean", "onPlayBarrage", "runBarrageList", "Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList;", "deltaTime", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class b extends com.ss.ugc.live.barrage.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9716a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f9717b = new a((byte) 0);
    private final float[] k = new float[2];
    private final CopyOnWriteArrayList<Float> l = new CopyOnWriteArrayList<>();
    private final PathMeasure m = new PathMeasure();
    private final BarrageLayout n;
    private final Path o;
    private final int p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/barrage/controller/DiggPathController$Companion;", "", "()V", "ALPHA_255", "", "DEGREES", "", "DEGREES_COUNT", "DIGG_ALPHA_IN_PROGRESS", "DIGG_ALPHA_OUT_PROGRESS", "DIGG_SCALED_IN_PROGRESS", "DIGG_SCALED_OUT_PROGRESS", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9716a, false, 3934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9716a, false, 3934, new Class[0], Void.TYPE);
            return;
        }
        d();
        this.l.clear();
        super.a();
    }

    public final void a(@NotNull com.ss.ugc.live.barrage.a.a aVar) {
        com.ss.ugc.live.barrage.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f9716a, false, 3932, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9716a, false, 3932, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "barrage");
        c();
    }

    public final void a(@NotNull com.ss.ugc.live.barrage.a aVar, float f2) {
        com.ss.ugc.live.barrage.a<com.ss.ugc.live.barrage.a.a> aVar2 = aVar;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{aVar2, Float.valueOf(f2)}, this, f9716a, false, 3933, new Class[]{com.ss.ugc.live.barrage.a.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Float.valueOf(f2)}, this, f9716a, false, 3933, new Class[]{com.ss.ugc.live.barrage.a.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "runBarrageList");
        float f3 = f2 / ((float) this.p);
        for (com.ss.ugc.live.barrage.a.a aVar3 : aVar2) {
            int indexOf = aVar2.indexOf((Object) aVar3);
            if (aVar3 instanceof com.bytedance.android.livesdk.chatroom.a.a.a) {
                Float f4 = this.l.get(indexOf);
                float[] fArr = new float[i];
                float[] fArr2 = new float[i];
                this.m.getPosTan(f4.floatValue() * this.m.getLength(), fArr, null);
                this.m.getPosTan((f4.floatValue() + f3) * this.m.getLength(), fArr2, null);
                aVar3.k.top += fArr2[1] - fArr[1];
                aVar3.k.bottom += fArr2[1] - fArr[1];
                aVar3.k.left += fArr2[0] - fArr[0];
                aVar3.k.right += fArr2[0] - fArr[0];
                if (f4.floatValue() + f3 > 0.5f) {
                    Intrinsics.checkExpressionValueIsNotNull(f4, "progress");
                    ((com.bytedance.android.livesdk.chatroom.a.a.a) aVar3).f9708c = (int) (((1.0f - f4.floatValue()) - f3) * 326.4f);
                }
                if (f4.floatValue() + f3 < 0.2f) {
                    ((com.bytedance.android.livesdk.chatroom.a.a.a) aVar3).f9709d = ((f4.floatValue() + f3) * 2.8f) + 0.24f;
                }
                com.bytedance.android.livesdk.chatroom.a.a.a aVar4 = (com.bytedance.android.livesdk.chatroom.a.a.a) aVar3;
                double d2 = aVar4.f9711f;
                double floatValue = (double) f4.floatValue();
                Double.isNaN(floatValue);
                aVar4.f9710e = (float) (Math.sin(d2 + (floatValue * 3.141592653589793d * 8.0d)) * 4.0d);
                this.l.set(indexOf, Float.valueOf(f4.floatValue() + f3));
                if (aVar4.f9708c == 0) {
                    aVar2.remove(indexOf);
                    this.l.remove(indexOf);
                }
            }
            i = 2;
        }
        for (Float f5 : this.l) {
            if (Float.compare(f5.floatValue(), 1.0f) >= 0) {
                int indexOf2 = this.l.indexOf(f5);
                aVar2.remove(indexOf2);
                this.l.remove(indexOf2);
            }
        }
        while (true) {
            com.ss.ugc.live.barrage.a.a e2 = e();
            if (e2 != null) {
                if (e2 instanceof com.bytedance.android.livesdk.chatroom.a.a.a) {
                    float width = e2.k.width();
                    float height = e2.k.height();
                    e2.k.left = this.k[0];
                    e2.k.right = this.k[0] + width;
                    e2.k.top = this.k[1];
                    e2.k.bottom = this.k[1] + height;
                    ((com.bytedance.android.livesdk.chatroom.a.a.a) e2).f9709d = 0.0f;
                    aVar2.add(e2);
                    this.l.add(Float.valueOf(0.0f));
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull BarrageLayout barrageLayout, @NotNull Path path, int i) {
        super(barrageLayout);
        Intrinsics.checkParameterIsNotNull(barrageLayout, "barrageView");
        Intrinsics.checkParameterIsNotNull(path, "path");
        this.n = barrageLayout;
        this.o = path;
        this.p = i;
        this.m.setPath(this.o, false);
        this.m.getPosTan(0.0f, this.k, null);
    }
}
