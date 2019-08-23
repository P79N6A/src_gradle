package com.ss.android.ugc.aweme.shortvideo.edit;

import a.i;
import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.ap;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.p;
import com.ss.android.vesdk.runtime.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0015\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u001a\u001a\u00020\fH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0016R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/VEReverseVideoGeneratorV2;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/ReverseVideoGenerator;", "srcVEEditor", "Lcom/ss/android/vesdk/VEEditor;", "videoSegments", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment;", "startTime", "", "endTime", "(Lcom/ss/android/vesdk/VEEditor;Ljava/util/List;II)V", "isReverseReady", "", "prepareTask", "Lbolts/TaskCompletionSource;", "veEditor", "cancelReverse", "", "createTimelineParams", "Lcom/ss/android/vesdk/VETimelineParams;", "getReversedAudioPaths", "", "", "()[Ljava/lang/String;", "getReversedVideoPaths", "getTempVideoPaths", "isReversedVideoReady", "prepare", "Lbolts/Task;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class z implements u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67499a;

    /* renamed from: b  reason: collision with root package name */
    public j<Boolean> f67500b = new j<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f67501c;

    /* renamed from: d  reason: collision with root package name */
    private p f67502d;

    /* renamed from: e  reason: collision with root package name */
    private final p f67503e;

    /* renamed from: f  reason: collision with root package name */
    private final List<VEVideoSegment> f67504f;
    private final int g;
    private final int h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/VEReverseVideoGeneratorV2$prepare$1", "Lcom/ss/android/vesdk/VEListener$VEEditorGenReverseListener;", "onReverseDone", "", "ret", "", "onReverseProgress", "progress", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements VEListener.h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z f67506b;

        a(z zVar) {
            this.f67506b = zVar;
        }

        public final void a(int i) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67505a, false, 76322, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67505a, false, 76322, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            z zVar = this.f67506b;
            if (i != 0) {
                z = false;
            }
            zVar.f67501c = z;
            this.f67506b.f67500b.a(Boolean.valueOf(this.f67506b.f67501c));
        }
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f67499a, false, 76317, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67499a, false, 76317, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c() != null) {
            z = true;
        }
        return z;
    }

    @Nullable
    public final String[] c() {
        if (!PatchProxy.isSupport(new Object[0], this, f67499a, false, 76318, new Class[0], String[].class)) {
            return this.f67503e.n();
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, f67499a, false, 76318, new Class[0], String[].class);
    }

    @Nullable
    public final String[] d() {
        if (!PatchProxy.isSupport(new Object[0], this, f67499a, false, 76320, new Class[0], String[].class)) {
            return this.f67503e.p();
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, f67499a, false, 76320, new Class[0], String[].class);
    }

    @Nullable
    public final String[] e() {
        if (!PatchProxy.isSupport(new Object[0], this, f67499a, false, 76319, new Class[0], String[].class)) {
            return this.f67503e.o();
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, f67499a, false, 76319, new Class[0], String[].class);
    }

    @NotNull
    public final i<Boolean> a() {
        al alVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f67499a, false, 76315, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f67499a, false, 76315, new Class[0], i.class);
        }
        if (c() != null) {
            this.f67501c = true;
            this.f67500b.a(Boolean.valueOf(this.f67501c));
        } else if (this.f67502d == null) {
            b bVar = this.f67503e.f78038b;
            if (PatchProxy.isSupport(new Object[0], this, f67499a, false, 76321, new Class[0], al.class)) {
                alVar = (al) PatchProxy.accessDispatch(new Object[0], this, f67499a, false, 76321, new Class[0], al.class);
            } else {
                String[] strArr = new String[this.f67504f.size()];
                int i2 = 0;
                for (Object next : this.f67504f) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    strArr[i2] = ((VEVideoSegment) next).videoPath;
                    i2 = i3;
                }
                al alVar2 = new al(strArr);
                for (Object next2 : this.f67504f) {
                    int i4 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    VEVideoSegment vEVideoSegment = (VEVideoSegment) next2;
                    alVar2.f77896e[i] = vEVideoSegment.start;
                    alVar2.f77897f[i] = vEVideoSegment.getEnd();
                    alVar2.i[i] = (double) vEVideoSegment.speed;
                    alVar2.k[i] = ap.a.a(vEVideoSegment.rotate);
                    i = i4;
                }
                alVar = alVar2;
            }
            this.f67502d = p.a(bVar, alVar, this.g, this.h, (VEListener.h) new a(this));
        }
        i<TResult> iVar = this.f67500b.f1091a;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "prepareTask.task");
        return iVar;
    }

    public z(@NotNull p pVar, @NotNull List<VEVideoSegment> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(pVar, "srcVEEditor");
        Intrinsics.checkParameterIsNotNull(list, "videoSegments");
        this.f67503e = pVar;
        this.f67504f = list;
        this.g = i;
        this.h = i2;
    }
}
