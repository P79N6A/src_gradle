package com.ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.d;
import com.ss.android.ugc.aweme.base.mvvm.e;
import com.ss.android.ugc.aweme.base.utils.f;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

public class MultiTypeAdapter<T extends e> extends RecyclerView.Adapter<BaseViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35178a;

    /* renamed from: b  reason: collision with root package name */
    private Map<Class, Class> f35179b;

    /* renamed from: c  reason: collision with root package name */
    private final List<T> f35180c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f35181d;

    /* renamed from: e  reason: collision with root package name */
    private Map<Class, Integer> f35182e;

    /* renamed from: f  reason: collision with root package name */
    private List<Constructor> f35183f;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f35178a, false, 25581, new Class[0], Integer.TYPE)) {
            return this.f35180c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35178a, false, 25581, new Class[0], Integer.TYPE)).intValue();
    }

    private Object a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35178a, false, 25576, new Class[]{Integer.TYPE}, Object.class)) {
            return this.f35180c.get(i);
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35178a, false, 25576, new Class[]{Integer.TYPE}, Object.class);
    }

    public int getItemViewType(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35178a, false, 25579, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35178a, false, 25579, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int itemViewType = super.getItemViewType(i);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35178a, false, 25580, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35178a, false, 25580, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            Integer num = this.f35182e.get(a(i).getClass());
            if (num != null) {
                i2 = num.intValue();
            } else {
                throw new NullPointerException("No corresponding View match " + a(i).getClass().getName());
            }
        }
        return itemViewType + i2;
    }

    private void a(Map<Class, Class> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f35178a, false, 25574, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f35178a, false, 25574, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            if (f.a((Class) next.getKey(), e.class)) {
                if (!f.a((Class) next.getValue(), d.class)) {
                }
            }
            throw new IllegalArgumentException("All keys in dataViewMap must be <K> Class<K extends IViewModel> and All values must be <T> Class<T extends IView>");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.util.Map<java.lang.Class, java.lang.Class> r17) {
        /*
            r16 = this;
            r7 = r16
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f35178a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 25575(0x63e7, float:3.5838E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f35178a
            r3 = 0
            r4 = 25575(0x63e7, float:3.5838E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f35182e = r0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f35183f = r0
            r0 = 0
            java.util.Set r1 = r17.entrySet()     // Catch:{ NoSuchMethodException -> 0x00d5 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ NoSuchMethodException -> 0x00d5 }
        L_0x0050:
            boolean r1 = r8.hasNext()     // Catch:{ NoSuchMethodException -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            java.lang.Object r1 = r8.next()     // Catch:{ NoSuchMethodException -> 0x00d5 }
            r12 = r1
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ NoSuchMethodException -> 0x00d5 }
            java.lang.Object r1 = r12.getKey()     // Catch:{ NoSuchMethodException -> 0x00d5 }
            r13 = r1
            java.lang.Class r13 = (java.lang.Class) r13     // Catch:{ NoSuchMethodException -> 0x00d5 }
            java.lang.Object r1 = r12.getValue()     // Catch:{ NoSuchMethodException -> 0x00d5 }
            r14 = r1
            java.lang.Class r14 = (java.lang.Class) r14     // Catch:{ NoSuchMethodException -> 0x00d5 }
            java.util.Map<java.lang.Class, java.lang.Integer> r0 = r7.f35182e     // Catch:{ NoSuchMethodException -> 0x00d2 }
            boolean r0 = r0.containsKey(r13)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r11.contains(r14)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            if (r0 != 0) goto L_0x00be
            r11.add(r14)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.util.List<java.lang.reflect.Constructor> r15 = r7.f35183f     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x00d2 }
            r0[r10] = r14     // Catch:{ NoSuchMethodException -> 0x00d2 }
            com.meituan.robust.ChangeQuickRedirect r2 = f35178a     // Catch:{ NoSuchMethodException -> 0x00d2 }
            r3 = 0
            r4 = 25583(0x63ef, float:3.585E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r5[r10] = r1     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Class<java.lang.reflect.Constructor> r6 = java.lang.reflect.Constructor.class
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            if (r0 == 0) goto L_0x00b1
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x00d2 }
            r0[r10] = r14     // Catch:{ NoSuchMethodException -> 0x00d2 }
            com.meituan.robust.ChangeQuickRedirect r2 = f35178a     // Catch:{ NoSuchMethodException -> 0x00d2 }
            r3 = 0
            r4 = 25583(0x63ef, float:3.585E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r5[r10] = r1     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Class<java.lang.reflect.Constructor> r6 = java.lang.reflect.Constructor.class
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch:{ NoSuchMethodException -> 0x00d2 }
            goto L_0x00bb
        L_0x00b1:
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.reflect.Constructor r0 = r14.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x00d2 }
        L_0x00bb:
            r15.add(r0)     // Catch:{ NoSuchMethodException -> 0x00d2 }
        L_0x00be:
            java.util.Map<java.lang.Class, java.lang.Integer> r0 = r7.f35182e     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Object r1 = r12.getValue()     // Catch:{ NoSuchMethodException -> 0x00d2 }
            int r1 = r11.indexOf(r1)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NoSuchMethodException -> 0x00d2 }
            r0.put(r13, r1)     // Catch:{ NoSuchMethodException -> 0x00d2 }
        L_0x00cf:
            r0 = r14
            goto L_0x0050
        L_0x00d2:
            r0 = r14
            goto L_0x00d5
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Can't find constructor in "
            r2.<init>(r3)
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            java.lang.String r0 = ".class according to "
            r2.append(r0)
            java.lang.Class r0 = r16.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            java.lang.String r0 = "'s getConstructor(Class)!"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.widget.recyclerview.MultiTypeAdapter.b(java.util.Map):void");
    }

    private d a(int i, ViewGroup viewGroup) {
        d dVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), viewGroup}, this, f35178a, false, 25584, new Class[]{Integer.TYPE, ViewGroup.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), viewGroup}, this, f35178a, false, 25584, new Class[]{Integer.TYPE, ViewGroup.class}, d.class);
        }
        try {
            dVar = (d) this.f35183f.get(i).newInstance(new Object[]{this.f35181d});
            try {
                dVar.create(this.f35181d, viewGroup);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            dVar = null;
        }
        return dVar;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f35178a, false, 25578, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseViewHolder, Integer.valueOf(i)}, this, f35178a, false, 25578, new Class[]{BaseViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        baseViewHolder.f35176a.bind((e) this.f35180c.get(i));
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35178a, false, 25577, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class)) {
            return new BaseViewHolder(a(i, viewGroup2));
        }
        return (BaseViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f35178a, false, 25577, new Class[]{ViewGroup.class, Integer.TYPE}, BaseViewHolder.class);
    }

    public MultiTypeAdapter(Context context, List<T> list, Map<Class, Class> map) {
        Context context2 = context;
        List<T> list2 = list;
        Map<Class, Class> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, list2, map2}, this, f35178a, false, 25573, new Class[]{Context.class, List.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, list2, map2}, this, f35178a, false, 25573, new Class[]{Context.class, List.class, Map.class}, Void.TYPE);
        } else if (context2 == null) {
            throw new NullPointerException("context mustn't be null!");
        } else if (list2 != null) {
            a(map2);
        } else {
            throw new NullPointerException("viewbeans mustn't be null!");
        }
        this.f35181d = context2;
        this.f35180c = list2;
        this.f35179b = map2;
        b(map2);
    }
}
