package com.ss.ugc.live.barrage.b;

import com.ss.ugc.live.barrage.a.a;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/ugc/live/barrage/controller/R2LBarrageController;", "Lcom/ss/ugc/live/barrage/controller/AbsBarrageController;", "barrageLayout", "Lcom/ss/ugc/live/barrage/view/BarrageLayout;", "lineHeight", "", "barrageLines", "duration", "(Lcom/ss/ugc/live/barrage/view/BarrageLayout;III)V", "onAddBarrage", "", "barrage", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "onClean", "onPlayBarrage", "runningBarrageList", "Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList;", "deltaTime", "", "barrage_release"}, k = 1, mv = {1, 1, 15})
public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final BarrageLayout f78705a;

    /* renamed from: b  reason: collision with root package name */
    private final int f78706b;
    private final int k;
    private final int l = 7000;

    public final void a() {
        d();
        super.a();
    }

    public final void a(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "barrage");
        c();
    }

    public final void a(@NotNull com.ss.ugc.live.barrage.a aVar, float f2) {
        Intrinsics.checkParameterIsNotNull(aVar, "runningBarrageList");
        int width = this.f78705a.getWidth();
        int height = this.f78705a.getHeight();
        this.f78705a.postInvalidate();
        float[] fArr = new float[this.k];
        float f3 = (float) width;
        float f4 = (f2 / ((float) this.l)) * f3;
        Iterator it2 = aVar.iterator();
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            if (aVar2.k.right < 0.0f) {
                aVar.remove((Object) aVar2);
            }
            int height2 = (int) ((aVar2.k.bottom - aVar2.k.height()) / ((float) this.f78706b));
            if (aVar2.k.right > fArr[height2]) {
                fArr[height2] = aVar2.k.right;
            }
            aVar2.k.offset(-f4, 0.0f);
        }
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f78706b * i2 <= height && fArr[i2] < f3) {
                a e2 = e();
                if (e2 != null) {
                    float width2 = e2.k.width();
                    float height3 = e2.k.height();
                    e2.k.left = f3;
                    e2.k.right = width2 + f3;
                    e2.k.top = (float) (this.f78706b * i2);
                    e2.k.bottom = ((float) (this.f78706b * i2)) + height3;
                    aVar.add(e2);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull BarrageLayout barrageLayout, int i, int i2, int i3) {
        super(barrageLayout);
        Intrinsics.checkParameterIsNotNull(barrageLayout, "barrageLayout");
        this.f78705a = barrageLayout;
        this.f78706b = i;
        this.k = i2;
    }
}
