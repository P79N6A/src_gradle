package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.c;
import com.ss.android.vesdk.p;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0016J \u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00132\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"H\u0016J\u0016\u0010#\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0010\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEVideoCutter;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/IVideoCutter;", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "timelineParam", "Lcom/ss/android/vesdk/VETimelineParams;", "(Lcom/ss/android/vesdk/VEEditor;Lcom/ss/android/vesdk/VETimelineParams;)V", "currentSelectIndex", "", "currentSelectSegment", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "compile", "", "settings", "Lcom/ss/android/ugc/aweme/shortvideo/cut/CutVideoCompileSettings;", "listener", "Lcom/ss/android/vesdk/VEListener$VEEditorCompileListener;", "destroy", "rotateFile", "", "index", "degree", "", "rotateForPreview", "scaleW", "scaleH", "selectSegment", "segment", "setBoundary", "intPoint", "outPoint", "unselect", "isConfirm", "segmentList", "", "updatePlayOrder", "videoList", "updateSegmentSpeed", "speed", "updateTotalSpeed", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ap implements ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66375a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66376b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private int f66377c;

    /* renamed from: d  reason: collision with root package name */
    private h f66378d;

    /* renamed from: e  reason: collision with root package name */
    private final p f66379e;

    /* renamed from: f  reason: collision with root package name */
    private al f66380f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEVideoCutter$Companion;", "", "()V", "addImportVideoMetaData", "", "videoSegments", "", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "getRotateDegree", "Lcom/ss/android/vesdk/ROTATE_DEGREE;", "degree", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66381a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public static c a(int i) {
            if (i == 90) {
                return c.ROTATE_90;
            }
            if (i == 180) {
                return c.ROTATE_180;
            }
            if (i != 270) {
                return c.ROTATE_NONE;
            }
            return c.ROTATE_270;
        }

        public final void a(@NotNull List<? extends h> list, @NotNull p pVar) {
            List<? extends h> list2 = list;
            p pVar2 = pVar;
            if (PatchProxy.isSupport(new Object[]{list2, pVar2}, this, f66381a, false, 75760, new Class[]{List.class, p.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2, pVar2}, this, f66381a, false, 75760, new Class[]{List.class, p.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, "videoSegments");
            Intrinsics.checkParameterIsNotNull(pVar2, "veEditor");
            if (!(!list2.isEmpty())) {
                list2 = null;
            }
            if (list2 != null) {
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                List arrayList3 = new ArrayList();
                List arrayList4 = new ArrayList();
                List arrayList5 = new ArrayList();
                for (h hVar : list2) {
                    String a2 = j.a.a(new File(hVar.f66495b));
                    hVar.o = a2;
                    arrayList2.add(Integer.valueOf((int) hVar.f66496c));
                    String str = hVar.f66495b;
                    Intrinsics.checkExpressionValueIsNotNull(str, "path");
                    arrayList.add(str);
                    arrayList3.add(Integer.valueOf(hVar.g));
                    arrayList4.add(Integer.valueOf(hVar.h));
                    arrayList5.add(a2);
                }
                pVar2.a("description", j.a(false, true, com.ss.android.ugc.aweme.port.in.a.f61119b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null));
            }
        }
    }

    public final boolean a(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f66375a, false, 75753, new Class[]{Integer.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f66375a, false, 75753, new Class[]{Integer.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return this.f66379e.a(0, i, a.a((int) f2)) == 0;
    }

    public final boolean a(float f2, float f3, float f4) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, f66375a, false, 75754, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, f66375a, false, 75754, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.f66379e.a(f3, f4, f2, 0, 0);
        return true;
    }

    public final void a(@NotNull List<? extends h> list) {
        List<? extends h> list2;
        int i;
        List<? extends h> list3 = list;
        if (PatchProxy.isSupport(new Object[]{list3}, this, f66375a, false, 75759, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3}, this, f66375a, false, 75759, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "videoList");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list3;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            int i2 = 0;
            for (Object next : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                h hVar = (h) next;
                strArr[i2] = hVar.f66495b;
                iArr[i2] = (int) hVar.f66497d;
                iArr2[i2] = (int) hVar.f66498e;
                fArr[i2] = hVar.f66499f;
                iArr3[i2] = hVar.k;
                i2 = i3;
            }
        }
        Map linkedHashMap = new LinkedHashMap();
        String[] strArr2 = this.f66380f.f77892a;
        Intrinsics.checkExpressionValueIsNotNull(strArr2, "timelineParam.videoFilePaths");
        int length = strArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            String str = strArr2[i4];
            Intrinsics.checkExpressionValueIsNotNull(str, "path");
            linkedHashMap.put(str, Integer.valueOf(i5));
            i4++;
            i5++;
        }
        al alVar = new al(strArr);
        com.ss.android.ugc.aweme.tools.b.c.a(alVar, list, iArr, iArr2, fArr, iArr3);
        this.f66380f = alVar;
        String[] strArr3 = this.f66380f.f77892a;
        Intrinsics.checkExpressionValueIsNotNull(strArr3, "timelineParam.videoFilePaths");
        int length2 = strArr3.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length2) {
            String str2 = strArr3[i6];
            int i8 = i7 + 1;
            int[] iArr4 = this.f66380f.f77893b;
            Integer num = (Integer) linkedHashMap.get(str2);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            iArr4[i7] = i;
            i6++;
            i7 = i8;
        }
        this.f66379e.b(this.f66380f);
    }

    public ap(@NotNull p pVar, @NotNull al alVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "veEditor");
        Intrinsics.checkParameterIsNotNull(alVar, "timelineParam");
        this.f66379e = pVar;
        this.f66380f = alVar;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66375a, false, 75757, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66375a, false, 75757, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f66379e.a(i, i2);
    }

    public final void b(int i, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f66375a, false, 75756, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f66375a, false, 75756, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f66380f.i[i] = (double) f2;
        this.f66379e.a(this.f66380f);
    }

    public final void a(int i, @NotNull h hVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), hVar}, this, f66375a, false, 75751, new Class[]{Integer.TYPE, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), hVar}, this, f66375a, false, 75751, new Class[]{Integer.TYPE, h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar, "segment");
        this.f66378d = hVar;
        this.f66377c = i;
        int i2 = hVar.k;
        hVar.k = 0;
        com.ss.android.ugc.aweme.tools.b.c.a(this.f66380f, i, hVar);
        this.f66379e.a(this.f66380f, (int) hVar.f66497d, (int) hVar.f66498e);
        hVar.k = i2;
        a((float) hVar.k, hVar.l, hVar.m);
    }

    public final void a(@NotNull af afVar, @NotNull VEListener.g gVar) {
        if (PatchProxy.isSupport(new Object[]{afVar, gVar}, this, f66375a, false, 75758, new Class[]{af.class, VEListener.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar, gVar}, this, f66375a, false, 75758, new Class[]{af.class, VEListener.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(afVar, "settings");
        Intrinsics.checkParameterIsNotNull(gVar, "listener");
        VEVideoEncodeSettings a2 = new VEVideoEncodeSettings.a(2).b(afVar.h).a(afVar.i).a(afVar.j).a(afVar.f66353e, afVar.f66354f).c(afVar.l).e(afVar.m).a(afVar.k).a(VEVideoEncodeSettings.b.COMPILE_TYPE_MP4).a(afVar.g).a();
        f66376b.a(afVar.f66350b, this.f66379e);
        this.f66379e.a(afVar.f66351c, afVar.f66352d, a2, gVar);
    }

    public final void a(boolean z, @Nullable List<? extends h> list) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), list}, this, f66375a, false, 75752, new Class[]{Boolean.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), list}, this, f66375a, false, 75752, new Class[]{Boolean.TYPE, List.class}, Void.TYPE);
            return;
        }
        h hVar = this.f66378d;
        if (hVar != null) {
            com.ss.android.ugc.aweme.tools.b.c.a(this.f66380f, this.f66377c, hVar, list);
            this.f66379e.a(this.f66380f);
            a(0.0f, 1.0f, 1.0f);
        }
    }
}
