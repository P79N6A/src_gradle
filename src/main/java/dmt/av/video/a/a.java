package dmt.av.video.a;

import a.i;
import a.j;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttve.monitor.d;
import com.ss.android.ttve.monitor.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.e;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.n.b;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.a.a;
import com.ss.android.ugc.aweme.shortvideo.edit.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.y;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.n;
import dmt.av.video.s;
import dmt.av.video.t;
import dmt.av.video.u;
import dmt.av.video.x;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82814a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Boolean> f82815b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<AudioEffectParam> f82816c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<EffectPointModel> f82817d;

    /* renamed from: e  reason: collision with root package name */
    public VEEditorAutoStartStopArbiter f82818e;

    /* renamed from: f  reason: collision with root package name */
    public Context f82819f;
    protected p g;
    public int h = -1;
    protected List<String> i;
    private u j;
    private Executor k;
    private String l;

    public final boolean a(s sVar) {
        IllegalStateException illegalStateException;
        s sVar2 = sVar;
        if (PatchProxy.isSupport(new Object[]{sVar2}, this, f82814a, false, 92137, new Class[]{s.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{sVar2}, this, f82814a, false, 92137, new Class[]{s.class}, Boolean.TYPE)).booleanValue();
        }
        if (sVar2.f83061b == 0 && this.f82818e != null) {
            if (this.f82818e.f4354b) {
                this.f82818e.a(false);
            } else {
                this.f82818e.b();
            }
        }
        if (sVar2.f83061b == 1 && this.f82818e != null) {
            this.f82818e.a(true);
        }
        if (sVar2.f83061b == 2) {
            int a2 = this.g.a((int) sVar2.f83062c, p.d.EDITOR_SEEK_FLAG_OnGoing);
            if (a2 != 0) {
                com.ss.android.ugc.aweme.framework.a.a.a("Seek failed. ret = " + a2 + " See logs for more details.");
                if (com.ss.android.ugc.aweme.g.a.a()) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, null, f82814a, true, 92157, new Class[]{Integer.TYPE}, IllegalStateException.class)) {
                        illegalStateException = (IllegalStateException) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, null, f82814a, true, 92157, new Class[]{Integer.TYPE}, IllegalStateException.class);
                    } else {
                        illegalStateException = new IllegalStateException("Seek failed. ret = " + a2 + " See logs for more details.");
                    }
                    throw illegalStateException;
                }
            }
            if (this.f82819f instanceof VEVideoPublishEditActivity) {
                ((VEVideoPublishEditActivity) this.f82819f).N();
            }
        }
        if (sVar2.f83061b == 3) {
            final j jVar = new j();
            n.a(this.g, new m() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f82820a;

                public final void a(int i, int i2, float f2, String str) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f82820a, false, 92163, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f82820a, false, 92163, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    if (i == 4101) {
                        jVar.a(null);
                        n.b(a.this.g, this);
                    }
                }
            });
            int a3 = this.g.a((int) sVar2.f83062c, p.d.EDITOR_SEEK_FLAG_LastSeek);
            if (a3 != 0) {
                try {
                    p.g l2 = this.g.l();
                    com.ss.android.ugc.aweme.framework.a.a.a("Seek failed. ret = " + a3 + " state = " + l2.ordinal());
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        throw new IllegalStateException("Seek failed. ret = " + a3 + " state = " + l2.ordinal());
                    }
                } catch (r e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        throw new IllegalStateException("Seek failed. ret = ", e2);
                    }
                }
            }
            try {
                jVar.f1091a.g();
            } catch (InterruptedException unused) {
            }
        }
        return false;
    }

    public boolean a(VEVolumeChangeOp vEVolumeChangeOp) {
        if (PatchProxy.isSupport(new Object[]{vEVolumeChangeOp}, this, f82814a, false, 92138, new Class[]{VEVolumeChangeOp.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{vEVolumeChangeOp}, this, f82814a, false, 92138, new Class[]{VEVolumeChangeOp.class}, Boolean.TYPE)).booleanValue();
        }
        if (vEVolumeChangeOp.mType == 0) {
            this.g.a(this.g.f78038b.h, this.g.f78038b.i, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            this.g.a(this.h, 1, vEVolumeChangeOp.mVolume);
        }
        return false;
    }

    public boolean a(dmt.av.video.r rVar) {
        if (PatchProxy.isSupport(new Object[]{rVar}, this, f82814a, false, 92139, new Class[]{dmt.av.video.r.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{rVar}, this, f82814a, false, 92139, new Class[]{dmt.av.video.r.class}, Boolean.TYPE)).booleanValue();
        }
        this.g.a(this.h, rVar.f83058b, rVar.f83058b + rVar.f83059c, false);
        return false;
    }

    public boolean a(t tVar) {
        if (PatchProxy.isSupport(new Object[]{tVar}, this, f82814a, false, 92140, new Class[]{t.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{tVar}, this, f82814a, false, 92140, new Class[]{t.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.h != -1) {
            this.g.d(this.h);
        }
        if (tVar.f83064b == null) {
            return false;
        }
        if (tVar.f83066d == -1) {
            tVar.f83066d = this.g.t();
        }
        this.h = this.g.a(tVar.f83064b, tVar.f83065c, tVar.f83065c + tVar.f83066d, false);
        this.g.a(this.h, 1, tVar.f83067e);
        return false;
    }

    public final boolean a(dmt.av.video.p pVar) {
        ArrayList<EffectPointModel> arrayList;
        int i2;
        dmt.av.video.p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{pVar2}, this, f82814a, false, 92144, new Class[]{dmt.av.video.p.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{pVar2}, this, f82814a, false, 92144, new Class[]{dmt.av.video.p.class}, Boolean.TYPE)).booleanValue();
        }
        ArrayList<EffectPointModel> arrayList2 = this.f82817d;
        long t = pVar2.f83055f ? ((long) this.g.t()) - pVar2.f83052c : pVar2.f83052c;
        if (pVar2.f83054e == 0) {
            int[] iArr = new int[1];
            p pVar3 = this.g;
            int i3 = (int) pVar2.f83052c;
            String str = pVar2.h;
            y.c("VEEditor", "enableFilterEffect... " + i3 + " false");
            if (i3 < 0 || i3 > pVar3.t() || TextUtils.isEmpty(str)) {
                arrayList = arrayList2;
                i2 = -100;
            } else {
                arrayList = arrayList2;
                int[] addFilters = pVar3.n.addFilters(new int[]{0}, new String[]{"video effect"}, new int[]{i3}, new int[]{pVar3.t()}, new int[]{0}, new int[]{8});
                pVar3.n.setFilterParam(addFilters[0], "effect res path", str);
                pVar3.n.setFilterParam(addFilters[0], "effect use amazing", "false");
                pVar3.n.setFilterParam(addFilters[0], "effect sticker id", new StringBuilder(PushConstants.PUSH_TYPE_NOTIFY).toString());
                pVar3.n.setFilterParam(addFilters[0], "effect req id", new StringBuilder(PushConstants.PUSH_TYPE_NOTIFY).toString());
                com.ss.android.vesdk.keyvaluepair.a aVar = new com.ss.android.vesdk.keyvaluepair.a();
                String str2 = "";
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split(File.separator);
                    if (split.length > 0) {
                        str2 = split[split.length - 1];
                    }
                }
                aVar.a("iesve_veeditor_filter_effect_id", str2);
                d.a("iesve_veeditor_filter_effect", 1, aVar);
                f.a aVar2 = new f.a();
                aVar2.f31261a = str;
                aVar2.f31262b = i3;
                pVar3.z.a(0, addFilters[0], aVar2);
                i2 = addFilters[0];
            }
            iArr[0] = i2;
            pVar2.f83051b = iArr;
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setType(1);
            effectPointModel.setSelectColor(pVar2.g);
            effectPointModel.setIndex(pVar2.f83051b[0]);
            effectPointModel.setResDir(pVar2.h);
            effectPointModel.setKey(pVar2.i);
            effectPointModel.setFromEnd(pVar2.f83055f);
            effectPointModel.setStartPoint((int) t);
            effectPointModel.setName(pVar2.j);
            effectPointModel.setDuration(pVar2.k);
            effectPointModel.setCategory(pVar2.l);
            arrayList.add(effectPointModel);
        } else {
            ArrayList<EffectPointModel> arrayList3 = arrayList2;
            if (pVar2.f83054e == 5) {
                a(pVar2, arrayList3);
            } else {
                if (pVar2.f83054e == 6) {
                    if (arrayList3.isEmpty()) {
                        return false;
                    }
                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                        if (e.b(arrayList3.get(size).getCategory())) {
                            this.g.a(new int[]{arrayList3.get(size).getIndex()});
                            arrayList3.get(size).setFromEnd(pVar2.f83055f);
                            arrayList3.get(size).setStartPoint((int) pVar2.f83052c);
                            arrayList3.get(size).setEndPoint((int) pVar2.f83053d);
                            pVar2.f83051b = this.g.a(new int[]{arrayList3.get(size).getStartPoint()}, new int[]{arrayList3.get(size).getEndPoint()}, new String[]{arrayList3.get(size).getResDir()});
                            arrayList3.get(size).setIndex(pVar2.f83051b[0]);
                            return false;
                        }
                    }
                } else if (pVar2.f83054e == 1) {
                    EffectPointModel effectPointModel2 = arrayList3.get(arrayList3.size() - 1);
                    p pVar4 = this.g;
                    int index = effectPointModel2.getIndex();
                    int i4 = (int) pVar2.f83052c;
                    y.c("VEEditor", "disableFilterEffect... " + index + " " + i4);
                    if (index >= 0 && i4 >= 0) {
                        f.a aVar3 = pVar4.z.f31258a.get(Integer.valueOf(index));
                        if (aVar3 != null) {
                            aVar3.f31263c = i4 - aVar3.f31262b;
                        }
                        pVar4.n.adjustFilterInOut(index, -1, i4);
                    }
                    effectPointModel2.setEndPoint((int) t);
                } else if (pVar2.f83054e == 2 || pVar2.f83054e == 7) {
                    a(pVar2.f83051b[0], arrayList3);
                } else if (pVar2.f83054e == 3) {
                    this.g.a(pVar2.f83051b);
                    arrayList3.clear();
                } else if (pVar2.f83054e == 4) {
                    this.g.a(pVar2.f83051b);
                    for (int i5 = 0; i5 < pVar2.f83051b.length; i5++) {
                        arrayList3.remove(arrayList3.size() - 1);
                    }
                } else if (pVar2.f83054e == 8) {
                    a(pVar2.f83051b[0], arrayList3);
                    a(pVar2, arrayList3);
                }
            }
        }
        return false;
    }

    public final boolean a(x xVar, x xVar2) {
        boolean z;
        x xVar3 = xVar;
        x xVar4 = xVar2;
        if (PatchProxy.isSupport(new Object[]{xVar3, xVar4}, this, f82814a, false, 92152, new Class[]{x.class, x.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{xVar3, xVar4}, this, f82814a, false, 92152, new Class[]{x.class, x.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f82818e != null) {
            z = this.f82818e.f4354b;
            if (!z) {
                this.f82818e.a(true);
            }
        } else {
            z = false;
        }
        if (xVar3 != null) {
            if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(xVar3.f83082b)) {
                this.f82815b.setValue(Boolean.FALSE);
            } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(xVar3.f83082b)) {
                this.g.i(xVar3.f83084d);
            } else if ("3".equals(xVar3.f83082b)) {
                this.g.k(xVar3.f83084d);
            }
        }
        if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(xVar4.f83082b)) {
            this.f82815b.setValue(Boolean.TRUE);
        } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(xVar4.f83082b)) {
            int a2 = this.g.a(0, 0, (int) xVar4.f83083c, 3, 600);
            if (a2 >= 0) {
                xVar4.f83084d = a2;
            }
        } else if ("3".equals(xVar4.f83082b)) {
            int t = this.g.t();
            int i2 = (int) xVar4.f83083c;
            float f2 = (float) t;
            int i3 = (int) (0.2f * f2);
            float f3 = f2 * 0.8f;
            if (((float) i2) > f3) {
                i2 = (int) f3;
            }
            int a3 = this.g.a(0, 0, i2, i3, 0.5f, 1.333f);
            if (a3 >= 0) {
                xVar4.f83084d = a3;
            }
        }
        if (!z && this.f82818e != null) {
            this.f82818e.a(false);
        }
        return false;
    }

    public final boolean a(com.ss.android.ugc.aweme.n.a aVar) {
        String str;
        int i2;
        com.ss.android.ugc.aweme.n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f82814a, false, 92153, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f82814a, false, 92153, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar2 == null || Lists.isEmpty(aVar2.stickers)) {
            return false;
        } else {
            for (b next : aVar2.stickers) {
                if (next != null) {
                    if (com.ss.android.ugc.aweme.video.b.b(next.path)) {
                        str = next.path;
                    } else {
                        str = aVar2.infoStickerDraftDir + File.separator + new File(next.path).getName();
                    }
                    String str2 = str;
                    if (com.ss.android.ugc.aweme.video.b.b(str2)) {
                        if (!next.isImageStickerLayer) {
                            i2 = this.g.a(str2, TextUtils.isEmpty(next.extra) ? null : new String[]{next.extra});
                        } else if (this.j == null || this.j.canvasWidth <= 0 || this.j.canvasHeight <= 0) {
                            i2 = this.g.a(str2, 0.0f, 0.0f, 1.0f, 1.0f);
                        } else {
                            i2 = this.g.b(str2, 0.0f, 0.0f, 1.0f, new BigDecimal((double) ((((float) this.j.canvasHeight) * 1.0f) / ((float) this.j.canvasWidth))).setScale(4, 4).floatValue());
                        }
                        if (i2 != -1) {
                            this.g.a(i2, next.currentOffsetX, next.currentOffsetY);
                            this.g.b(i2, next.scale);
                            this.g.a(i2, -next.rotateAngle);
                            this.g.a(i2, next.startTime, next.endTime);
                            this.g.c(i2, next.layerWeight);
                        } else if (com.ss.android.ugc.aweme.g.a.a()) {
                            throw new IllegalStateException("VeSdk add infoSticker failed " + aVar2);
                        }
                    } else if (!com.ss.android.ugc.aweme.g.a.a()) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("infoSticker not exist " + next));
                    } else {
                        throw new IllegalStateException("infoSticker not exist " + aVar2);
                    }
                } else if (com.ss.android.ugc.aweme.g.a.a()) {
                    throw new IllegalStateException("VeSdk add infoSticker failed " + aVar2);
                }
            }
            return false;
        }
    }

    public final boolean a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f82814a, false, 92154, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f82814a, false, 92154, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        this.g.a(hVar2.j, 1.0f);
        return false;
    }

    public a() {
        String str;
        Object accessDispatch;
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66932a, true, 76698, new Class[0], String.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66932a, true, 76698, new Class[0], String.class);
        } else {
            a.C0711a aVar = com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66935d;
            if (PatchProxy.isSupport(new Object[0], aVar, a.C0711a.f66936a, false, 76702, new Class[0], String.class)) {
                accessDispatch = PatchProxy.accessDispatch(new Object[0], aVar, a.C0711a.f66936a, false, 76702, new Class[0], String.class);
            } else {
                str = com.ss.android.ugc.aweme.shortvideo.edit.a.a.f66934c + File.separator;
                this.l = str;
            }
        }
        str = (String) accessDispatch;
        this.l = str;
    }

    public Executor a() {
        if (PatchProxy.isSupport(new Object[0], this, f82814a, false, 92151, new Class[0], Executor.class)) {
            return (Executor) PatchProxy.accessDispatch(new Object[0], this, f82814a, false, 92151, new Class[0], Executor.class);
        }
        if (this.k == null) {
            this.k = g.a();
        }
        return this.k;
    }

    public void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82814a, false, 92142, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82814a, false, 92142, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        p pVar = this.g;
        if (z) {
            str = this.l;
        } else {
            str = "";
        }
        pVar.a(str);
        c.a(this.f82819f, "apply hdr enhance " + z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(dmt.av.video.j jVar, i iVar) throws Exception {
        if (((Boolean) iVar.e()).booleanValue()) {
            AudioEffectParam audioEffectParam = jVar.f83009f;
            if (audioEffectParam != null) {
                audioEffectParam.setPreprocessResult(null);
                this.f82816c.setValue(audioEffectParam);
            }
        } else if (jVar.f83009f.getShowErrorToast() || com.ss.android.ugc.aweme.framework.core.a.b().f3306d) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) com.ss.android.ugc.aweme.port.in.a.f61119b, (int) C0906R.string.je).a();
        }
        return null;
    }

    private void a(int i2, ArrayList<EffectPointModel> arrayList) {
        int i3 = i2;
        ArrayList<EffectPointModel> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), arrayList2}, this, f82814a, false, 92146, new Class[]{Integer.TYPE, ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), arrayList2}, this, f82814a, false, 92146, new Class[]{Integer.TYPE, ArrayList.class}, Void.TYPE);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (arrayList2.get(i4).getIndex() == i3) {
                this.g.a(new int[]{i3});
                arrayList2.remove(i4);
                return;
            }
        }
    }

    private void a(dmt.av.video.p pVar, ArrayList<EffectPointModel> arrayList) {
        dmt.av.video.p pVar2 = pVar;
        ArrayList<EffectPointModel> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{pVar2, arrayList2}, this, f82814a, false, 92145, new Class[]{dmt.av.video.p.class, ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2, arrayList2}, this, f82814a, false, 92145, new Class[]{dmt.av.video.p.class, ArrayList.class}, Void.TYPE);
            return;
        }
        pVar2.f83051b = this.g.a(new int[]{(int) pVar2.f83052c}, new int[]{(int) pVar2.f83053d}, new String[]{pVar2.h});
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setType(1);
        effectPointModel.setSelectColor(pVar2.g);
        effectPointModel.setIndex(pVar2.f83051b[0]);
        effectPointModel.setResDir(pVar2.h);
        effectPointModel.setKey(pVar2.i);
        effectPointModel.setFromEnd(pVar2.f83055f);
        effectPointModel.setStartPoint((int) pVar2.f83052c);
        effectPointModel.setEndPoint((int) pVar2.f83053d);
        effectPointModel.setName(pVar2.j);
        effectPointModel.setCategory(pVar2.l);
        arrayList2.add(effectPointModel);
    }

    public void a(boolean z, boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f82814a, false, 92143, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f82814a, false, 92143, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.g.f(z);
        } else {
            this.g.e(z);
        }
        StringBuilder sb = new StringBuilder("apply light enhance ");
        sb.append(z);
        if (z2) {
            str = "is";
        } else {
            str = "is not";
        }
        sb.append(str);
        sb.append(" preview");
        c.a(this.f82819f, sb.toString());
    }

    public int a(Context context, p pVar, u uVar) {
        this.f82819f = context;
        this.g = pVar;
        this.j = uVar;
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(@Nullable dmt.av.video.j jVar, @NonNull dmt.av.video.j jVar2, boolean z) throws Exception {
        c(jVar, jVar2, z);
        return null;
    }

    private void c(@Nullable dmt.av.video.j jVar, @NonNull dmt.av.video.j jVar2, boolean z) {
        int i2;
        dmt.av.video.j jVar3 = jVar;
        dmt.av.video.j jVar4 = jVar2;
        if (PatchProxy.isSupport(new Object[]{jVar3, jVar4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f82814a, false, 92148, new Class[]{dmt.av.video.j.class, dmt.av.video.j.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {jVar3, jVar4, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f82814a, false, 92148, new Class[]{dmt.av.video.j.class, dmt.av.video.j.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (jVar3 != null) {
            if (z) {
                i2 = jVar3.f83006c.get();
            } else {
                i2 = jVar3.f83005b.get();
            }
            this.g.b(new int[]{i2});
            if (z) {
                AtomicInteger atomicInteger = jVar3.f83005b;
                if (PatchProxy.isSupport(new Object[]{atomicInteger}, jVar2, dmt.av.video.j.f83004a, false, 91961, new Class[]{AtomicInteger.class}, Void.TYPE)) {
                    dmt.av.video.j jVar5 = jVar2;
                    PatchProxy.accessDispatch(new Object[]{atomicInteger}, jVar5, dmt.av.video.j.f83004a, false, 91961, new Class[]{AtomicInteger.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(atomicInteger, "<set-?>");
                    jVar4.f83005b = atomicInteger;
                }
            } else {
                AtomicInteger atomicInteger2 = jVar3.f83006c;
                if (PatchProxy.isSupport(new Object[]{atomicInteger2}, jVar2, dmt.av.video.j.f83004a, false, 91962, new Class[]{AtomicInteger.class}, Void.TYPE)) {
                    dmt.av.video.j jVar6 = jVar2;
                    PatchProxy.accessDispatch(new Object[]{atomicInteger2}, jVar6, dmt.av.video.j.f83004a, false, 91962, new Class[]{AtomicInteger.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(atomicInteger2, "<set-?>");
                    jVar4.f83006c = atomicInteger2;
                }
            }
        }
        if (z) {
            jVar4.f83006c.set(-1);
        } else {
            jVar4.f83005b.set(-1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(@Nullable dmt.av.video.j jVar, @NonNull dmt.av.video.j jVar2, boolean z) throws Exception {
        int trackType;
        int trackIndex;
        int i2;
        c(jVar, jVar2, z);
        com.ss.android.vesdk.runtime.b bVar = this.g.f78038b;
        AudioEffectParam audioEffectParam = jVar2.f83009f;
        if (bVar == null || audioEffectParam == null || !bm.a(audioEffectParam.getEffectPath())) {
            return Boolean.FALSE;
        }
        if (z) {
            trackType = bVar.i;
        } else {
            trackType = audioEffectParam.getTrackType();
        }
        int i3 = trackType;
        if (z) {
            trackIndex = bVar.h;
        } else {
            trackIndex = audioEffectParam.getTrackIndex();
        }
        int i4 = trackIndex;
        p pVar = this.g;
        String effectPath = audioEffectParam.getEffectPath();
        byte[] a2 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.a().a(audioEffectParam.getEffectPath());
        int seqIn = audioEffectParam.getSeqIn();
        int seqOut = audioEffectParam.getSeqOut();
        VEListener.a aVar = f.f82839b;
        boolean z2 = true;
        if (TextUtils.isEmpty(effectPath)) {
            y.d("VEEditor", "addAudioCommonFilter failed path is null or path not exist");
            i2 = -205;
        } else {
            int[] addFilters = pVar.n.addFilters(new int[]{i4}, new String[]{"audio common filter"}, new int[]{seqIn}, new int[]{seqOut}, new int[]{i3}, new int[]{1});
            if (addFilters[0] < 0) {
                y.d("VEEditor", "Add filter failed!");
            } else {
                long[] jArr = new long[1];
                int preprocessAudioTrackForFilter = pVar.n.preprocessAudioTrackForFilter(i3, i4, effectPath, a2, jArr);
                byte[] audioCommonFilterPreprocessResult = pVar.n.getAudioCommonFilterPreprocessResult(jArr[0]);
                if (aVar != null) {
                    aVar.a(effectPath, preprocessAudioTrackForFilter, audioCommonFilterPreprocessResult);
                }
                if (preprocessAudioTrackForFilter != 0) {
                    y.d("VEEditor", "Add filter preprocess failed!");
                } else {
                    pVar.n.setFilterParam(addFilters[0], "audio_common_filter_params", effectPath);
                    pVar.n.setFilterParam(addFilters[0], "audio_common_filter_preresult", audioCommonFilterPreprocessResult);
                    i2 = addFilters[0];
                }
            }
            i2 = -1;
        }
        if (z) {
            jVar2.f83006c.set(i2);
        } else {
            jVar2.f83005b.set(i2);
        }
        if (i2 < 0) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
