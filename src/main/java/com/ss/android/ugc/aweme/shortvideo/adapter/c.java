package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.l.b;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel;
import com.ss.android.ugc.aweme.tools.ao;
import com.ss.android.ugc.aweme.tools.ay;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65502a;

    /* renamed from: b  reason: collision with root package name */
    public RecordToolBarPlanCAdapter f65503b;

    /* renamed from: c  reason: collision with root package name */
    public RecordToolBarPlanCAdapter f65504c;

    /* renamed from: d  reason: collision with root package name */
    public LinkedHashMap<Integer, RecordToolBarModel> f65505d;

    /* renamed from: e  reason: collision with root package name */
    int f65506e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f65507f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private MutableLiveData<a> m = new MutableLiveData<>();
    private boolean n;
    private ShortVideoRecordingOperationPanelFragment o;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f65508a;

        /* renamed from: b  reason: collision with root package name */
        public int f65509b;

        a(int i, int i2) {
            this.f65508a = i;
            this.f65509b = i2;
        }
    }

    public final void a(boolean z, boolean z2, boolean z3, b bVar) {
        boolean z4 = z;
        boolean z5 = z3;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), bVar2}, this, f65502a, false, 75004, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), bVar2}, this, f65502a, false, 75004, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, b.class}, Void.TYPE);
            return;
        }
        this.j = z5;
        this.k = bVar2.a(z4, this.n);
        RecordToolBarModel recordToolBarModel = this.f65505d.get(5);
        if (recordToolBarModel != null) {
            this.f65505d.get(10).resId = 2130839523;
            a(9, z5);
            a(10, !z4);
            a(14, this.k);
            recordToolBarModel.shouldAnimate = z2;
            b(5);
        }
        this.f65507f = !this.f65507f;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65502a, false, 75005, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65502a, false, 75005, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(5);
        if (recordToolBarModel != null) {
            recordToolBarModel.enabled = z;
            b(5);
        }
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        boolean z4 = z;
        int i2 = 2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f65502a, false, 75007, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f65502a, false, 75007, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.n != z4) {
            this.j = z2;
            this.k = z3;
            MutableLiveData<a> mutableLiveData = this.m;
            if (!z4) {
                i2 = 3;
            }
            mutableLiveData.setValue(new a(i2, -1));
            this.n = z4;
        }
    }

    public final void a(u uVar) {
        if (PatchProxy.isSupport(new Object[]{uVar}, this, f65502a, false, 75012, new Class[]{u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar}, this, f65502a, false, 75012, new Class[]{u.class}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(10);
        if (recordToolBarModel != null) {
            int i2 = uVar.f74940b;
            if (i2 != 0) {
                switch (i2) {
                    case 5:
                        recordToolBarModel.enabled = false;
                        break;
                    case 6:
                        recordToolBarModel.enabled = true;
                        break;
                    default:
                        recordToolBarModel.resId = 2130839524;
                        break;
                }
            } else {
                recordToolBarModel.resId = 2130839523;
            }
            b(10);
        }
    }

    public final void a(az azVar) {
        if (PatchProxy.isSupport(new Object[]{azVar}, this, f65502a, false, 75014, new Class[]{az.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{azVar}, this, f65502a, false, 75014, new Class[]{az.class}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(11);
        if (recordToolBarModel != null) {
            recordToolBarModel.resId = azVar.f74644c ? 2130839540 : 2130839539;
            if (azVar.f74643b) {
                recordToolBarModel.enabled = false;
            } else {
                recordToolBarModel.enabled = true;
            }
            b(11);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65502a, false, 75008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65502a, false, 75008, new Class[0], Void.TYPE);
            return;
        }
        this.m.setValue(new a(1, 3));
        this.h = false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65502a, false, 74998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65502a, false, 74998, new Class[0], Void.TYPE);
            return;
        }
        ArrayList<RecordToolBarModel> arrayList = new ArrayList<>();
        ArrayList<RecordToolBarModel> arrayList2 = new ArrayList<>();
        for (Map.Entry next : this.f65505d.entrySet()) {
            RecordToolBarModel recordToolBarModel = (RecordToolBarModel) next.getValue();
            if (((Integer) next.getKey()).intValue() != 12 && recordToolBarModel.status == 4) {
                if (arrayList.size() < this.f65506e) {
                    arrayList.add(recordToolBarModel);
                    recordToolBarModel.status = 1;
                } else if (arrayList.size() > this.f65506e) {
                    arrayList2.add(recordToolBarModel);
                    recordToolBarModel.status = 2;
                } else {
                    RecordToolBarModel recordToolBarModel2 = this.f65505d.get(12);
                    int i2 = recordToolBarModel2.status;
                    if (i2 == 1) {
                        recordToolBarModel2.status = 1;
                        arrayList2.add(recordToolBarModel);
                    } else if (i2 == 4) {
                        RecordToolBarModel remove = arrayList.remove(this.f65506e - 1);
                        arrayList2.add(0, remove);
                        remove.status = 2;
                        arrayList2.add(recordToolBarModel);
                        recordToolBarModel.status = 2;
                        arrayList.add(recordToolBarModel2);
                        recordToolBarModel2.status = 1;
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            RecordToolBarModel recordToolBarModel3 = this.f65505d.get(12);
            if (recordToolBarModel3 != null) {
                arrayList.remove(recordToolBarModel3);
                recordToolBarModel3.status = 4;
            }
        }
        if (arrayList2.size() == 1) {
            RecordToolBarModel recordToolBarModel4 = this.f65505d.get(12);
            RecordToolBarModel remove2 = arrayList2.remove(0);
            if (recordToolBarModel4 != null) {
                arrayList.remove(recordToolBarModel4);
                recordToolBarModel4.status = 4;
                arrayList.add(remove2);
                remove2.status = 1;
            }
        }
        this.f65503b.f65472c = arrayList;
        this.f65504c.f65472c = arrayList2;
        this.f65503b.notifyDataSetChanged();
        this.f65504c.notifyDataSetChanged();
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f65502a, false, 75009, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f65502a, false, 75009, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.m.setValue(new a(0, 3));
        this.h = true;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75006, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75006, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(4);
        if (recordToolBarModel != null) {
            if (i2 == 0) {
                recordToolBarModel.resId = 2130839534;
                if (recordToolBarModel.descId > 0) {
                    recordToolBarModel.descId = C0906R.string.c9m;
                }
            } else {
                recordToolBarModel.resId = 2130839533;
                if (recordToolBarModel.descId > 0) {
                    recordToolBarModel.descId = C0906R.string.c9l;
                }
            }
            b(4);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65502a, false, 75010, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65502a, false, 75010, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(3);
        if (!(recordToolBarModel == null || recordToolBarModel.enabled == z)) {
            recordToolBarModel.enabled = z;
            b(3);
        }
    }

    public final void c(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65502a, false, 75011, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65502a, false, 75011, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(6);
        if (recordToolBarModel != null) {
            if (z) {
                i2 = 2130839509;
            } else {
                i2 = 2130839508;
            }
            recordToolBarModel.resId = i2;
            b(6);
        }
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65502a, false, 75016, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65502a, false, 75016, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(9);
        if (z) {
            recordToolBarModel.resId = 2130839506;
        } else {
            recordToolBarModel.resId = 2130839505;
        }
        b(9);
        if (!this.f65507f) {
            this.f65505d.get(10).resId = 2130839523;
            b(10);
        }
    }

    public final void e(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65502a, false, 75017, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65502a, false, 75017, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(14);
        if (z) {
            i2 = 2130839536;
        } else {
            i2 = 2130839535;
        }
        recordToolBarModel.resId = i2;
        recordToolBarModel.descId = C0906R.string.c60;
        b(14);
    }

    private void b(int i2) {
        int i3 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75002, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75002, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75001, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75001, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int a2 = this.f65503b.a(i2);
            int a3 = this.f65504c.a(i2);
            if (a2 == -1 && a3 == -1) {
                i3 = -1;
            } else if (a2 == -1) {
                i3 = 0;
            }
        }
        switch (i3) {
            case 0:
                this.f65504c.notifyItemChanged(this.f65504c.a(i2));
                break;
            case 1:
                this.f65503b.notifyItemChanged(this.f65503b.a(i2));
                return;
        }
    }

    private RecordToolBarModel c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75003, new Class[]{Integer.TYPE}, RecordToolBarModel.class)) {
            return (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 75003, new Class[]{Integer.TYPE}, RecordToolBarModel.class);
        }
        switch (this.f65505d.get(Integer.valueOf(i2)).status) {
            case 1:
                RecordToolBarModel b2 = this.f65503b.b(i2);
                if (this.f65504c.f65472c.size() == 2) {
                    this.f65503b.a(this.f65504c.c(0), 1);
                    this.f65503b.a(this.f65504c.c(0), 1);
                    c(12);
                }
                return b2;
            case 2:
                RecordToolBarModel b3 = this.f65504c.b(i2);
                if (this.f65504c.f65472c.size() == 1) {
                    this.f65503b.a(this.f65504c.c(0), 1);
                    this.f65503b.b(12);
                } else if (this.f65504c.f65472c.size() == 0) {
                    this.f65503b.b(12);
                }
                return b3;
            default:
                return null;
        }
    }

    public final void a(ao aoVar) {
        if (PatchProxy.isSupport(new Object[]{aoVar}, this, f65502a, false, 75015, new Class[]{ao.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aoVar}, this, f65502a, false, 75015, new Class[]{ao.class}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(8);
        if (recordToolBarModel != null) {
            switch (aoVar.f74627a) {
                case 1:
                    recordToolBarModel.resId = 2130839528;
                    break;
                case 2:
                    recordToolBarModel.resId = 2130839527;
                    break;
                case 3:
                    recordToolBarModel.enabled = true;
                    break;
                case 4:
                    recordToolBarModel.enabled = false;
                    break;
            }
            b(8);
        }
    }

    public final void a(ay ayVar) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{ayVar}, this, f65502a, false, 75013, new Class[]{ay.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ayVar}, this, f65502a, false, 75013, new Class[]{ay.class}, Void.TYPE);
            return;
        }
        RecordToolBarModel recordToolBarModel = this.f65505d.get(11);
        if (recordToolBarModel != null) {
            if (ayVar.f74638b) {
                if (ayVar.f74639c) {
                    i2 = 2130839539;
                } else {
                    i2 = 2130839540;
                }
                recordToolBarModel.resId = i2;
            } else {
                recordToolBarModel.enabled = false;
            }
            b(11);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z) {
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65502a, false, 75000, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f65502a, false, 75000, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 74999, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65502a, false, 74999, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (this.l) {
                    i3 = this.f65503b.a(13);
                } else {
                    i3 = this.f65503b.a(0);
                }
                RecordToolBarModel recordToolBarModel = this.f65505d.get(Integer.valueOf(i2));
                if (i2 == 7) {
                    this.f65503b.a(i3 + 1, recordToolBarModel, 1);
                } else if (i2 != 9) {
                    switch (i2) {
                        case 3:
                            RecordToolBarPlanCAdapter recordToolBarPlanCAdapter = this.f65503b;
                            if (this.j) {
                                i4 = this.f65503b.a(9) + 1;
                            } else {
                                i4 = this.f65503b.a(7) + 1;
                            }
                            recordToolBarPlanCAdapter.a(i4, recordToolBarModel, 1);
                            break;
                        case 4:
                            this.f65503b.a(this.f65503b.a(5) + 1, recordToolBarModel, 1);
                            break;
                        default:
                            int size = this.f65503b.f65472c.size();
                            RecordToolBarModel recordToolBarModel2 = this.f65505d.get(12);
                            if (size <= this.f65506e) {
                                if (size < this.f65506e) {
                                    if (recordToolBarModel2.status != 1) {
                                        this.f65503b.a(this.f65505d.get(Integer.valueOf(i2)), 1);
                                        break;
                                    } else {
                                        this.f65503b.a(this.f65503b.a(12), recordToolBarModel, 1);
                                        break;
                                    }
                                } else {
                                    int i5 = recordToolBarModel2.status;
                                    if (i5 == 1) {
                                        this.f65504c.a(recordToolBarModel, 2);
                                        break;
                                    } else {
                                        if (i5 == 4) {
                                            this.f65504c.a(0, this.f65503b.c(size - 1), 2);
                                            this.f65504c.a(recordToolBarModel, 2);
                                            this.f65503b.a(this.f65505d.get(12), 1);
                                        }
                                        return;
                                    }
                                }
                            } else {
                                this.f65504c.a(recordToolBarModel, 2);
                                break;
                            }
                    }
                } else {
                    RecordToolBarPlanCAdapter recordToolBarPlanCAdapter2 = this.f65503b;
                    if (!this.n) {
                        i3 = this.f65503b.a(7);
                    }
                    recordToolBarPlanCAdapter2.a(i3 + 1, recordToolBarModel, 1);
                }
            }
        } else {
            c(i2);
        }
    }

    public c(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this.o = shortVideoRecordingOperationPanelFragment;
        this.f65505d = linkedHashMap;
        this.f65507f = z3;
        this.g = z;
        this.i = z4;
        this.h = z2;
        this.j = z5;
        this.f65506e = i2;
        this.k = z6;
        this.l = z7;
        this.f65503b = new RecordToolBarPlanCAdapter(this.f65505d);
        this.f65504c = new RecordToolBarPlanCAdapter(this.f65505d);
        if (PatchProxy.isSupport(new Object[0], this, f65502a, false, 74996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65502a, false, 74996, new Class[0], Void.TYPE);
            return;
        }
        this.m.observe(this.o, new d(this));
    }
}
