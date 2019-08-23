package com.bytedance.android.livesdk.chatroom.a.b;

import android.graphics.Path;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.barrage.view.BarrageLayout;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/barrage/controller/DiggController;", "Lcom/ss/ugc/live/barrage/controller/AbsBarrageController;", "barrageView", "Lcom/ss/ugc/live/barrage/view/BarrageLayout;", "duration", "", "(Lcom/ss/ugc/live/barrage/view/BarrageLayout;I)V", "diggPathControllers", "Ljava/util/ArrayList;", "Lcom/bytedance/android/livesdk/chatroom/barrage/controller/DiggPathController;", "progress", "", "random", "Ljava/util/Random;", "addPath", "", "path", "Landroid/graphics/Path;", "getBarrageSize", "onAddBarrage", "barrage", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "onClean", "onPlayBarrage", "runBarrageList", "Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList;", "deltaTime", "Companion", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class a extends com.ss.ugc.live.barrage.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9714a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0080a f9715b = new C0080a((byte) 0);
    private final ArrayList<b> k = new ArrayList<>();
    private final Random l = new Random();
    private float m = 1.0f;
    private final BarrageLayout n;
    private final int o = 1400;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/barrage/controller/DiggController$Companion;", "", "()V", "DIGG_PROGRESS_PADDING", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a$a  reason: collision with other inner class name */
    public static final class C0080a {
        private C0080a() {
        }

        public /* synthetic */ C0080a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9714a, false, 3930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9714a, false, 3930, new Class[0], Void.TYPE);
            return;
        }
        d();
        for (b a2 : this.k) {
            a2.a();
        }
        super.a();
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f9714a, false, 3931, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f9714a, false, 3931, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = super.b();
        for (b b3 : this.k) {
            b2 += b3.b();
        }
        return b2;
    }

    public final void a(@NotNull com.ss.ugc.live.barrage.a.a aVar) {
        com.ss.ugc.live.barrage.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f9714a, false, 3927, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9714a, false, 3927, new Class[]{com.ss.ugc.live.barrage.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "barrage");
        c();
    }

    public final void a(@NotNull Path path) {
        if (PatchProxy.isSupport(new Object[]{path}, this, f9714a, false, 3928, new Class[]{Path.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{path}, this, f9714a, false, 3928, new Class[]{Path.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(path, "path");
        b bVar = new b(this.n, path, this.o);
        this.k.add(bVar);
        this.n.a(bVar, this.n.f78710a.size());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull BarrageLayout barrageLayout, int i) {
        super(barrageLayout);
        Intrinsics.checkParameterIsNotNull(barrageLayout, "barrageView");
        this.n = barrageLayout;
    }

    public final void a(@NotNull com.ss.ugc.live.barrage.a aVar, float f2) {
        if (PatchProxy.isSupport(new Object[]{aVar, Float.valueOf(f2)}, this, f9714a, false, 3929, new Class[]{com.ss.ugc.live.barrage.a.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Float.valueOf(f2)}, this, f9714a, false, 3929, new Class[]{com.ss.ugc.live.barrage.a.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "runBarrageList");
        this.m += f2 / ((float) this.o);
        if (this.m > 0.32f) {
            com.ss.ugc.live.barrage.a.a e2 = e();
            if (e2 != null) {
                this.k.get(this.l.nextInt(this.k.size())).a(e2, false);
            }
            this.m = 0.0f;
        }
    }
}
