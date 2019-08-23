package com.bytedance.frameworks.plugin.pm;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class b<F extends IntentFilter, R> {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator f20041a = new Comparator() {
        public final int compare(Object obj, Object obj2) {
            int priority = ((IntentFilter) obj).getPriority();
            int priority2 = ((IntentFilter) obj2).getPriority();
            if (priority > priority2) {
                return -1;
            }
            if (priority < priority2) {
                return 1;
            }
            return 0;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<F> f20042b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, F[]> f20043c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, F[]> f20044d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, F[]> f20045e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, F[]> f20046f = new HashMap<>();
    private final HashMap<String, F[]> g = new HashMap<>();
    private final HashMap<String, F[]> h = new HashMap<>();

    /* JADX WARNING: type inference failed for: r1v0, types: [R, F] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R a(F r1, int r2, int r3) {
        /*
            r0 = this;
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.b.a(android.content.IntentFilter, int, int):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public boolean a(F f2, List<R> list) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str, F f2);

    /* access modifiers changed from: protected */
    public abstract F[] a(int i);

    /* access modifiers changed from: protected */
    public final void a(F f2) {
        String str;
        this.f20042b.add(f2);
        int a2 = a(f2, f2.schemesIterator(), this.f20046f);
        Iterator<String> typesIterator = f2.typesIterator();
        int i = 0;
        if (typesIterator != null) {
            int i2 = 0;
            while (typesIterator.hasNext()) {
                String next = typesIterator.next();
                i2++;
                int indexOf = next.indexOf(47);
                if (indexOf > 0) {
                    str = next.substring(0, indexOf).intern();
                } else {
                    str = next;
                    next = next + "/*";
                }
                a(this.f20043c, next, f2);
                if (indexOf > 0) {
                    a(this.f20044d, str, f2);
                } else {
                    a(this.f20045e, str, f2);
                }
            }
            i = i2;
        }
        if (a2 == 0 && i == 0) {
            a(f2, f2.actionsIterator(), this.g);
        }
        if (i != 0) {
            a(f2, f2.actionsIterator(), this.h);
        }
    }

    /* access modifiers changed from: protected */
    public void a(List<R> list) {
        Collections.sort(list, f20041a);
    }

    private static HashSet<String> a(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(categories);
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void b(F f2) {
        String str;
        int b2 = b(f2, f2.schemesIterator(), this.f20046f);
        Iterator<String> typesIterator = f2.typesIterator();
        int i = 0;
        if (typesIterator != null) {
            int i2 = 0;
            while (typesIterator.hasNext()) {
                String next = typesIterator.next();
                i2++;
                int indexOf = next.indexOf(47);
                if (indexOf > 0) {
                    str = next.substring(0, indexOf).intern();
                } else {
                    str = next;
                    next = next + "/*";
                }
                a(this.f20043c, next, (Object) f2);
                if (indexOf > 0) {
                    a(this.f20044d, str, (Object) f2);
                } else {
                    a(this.f20045e, str, (Object) f2);
                }
            }
            i = i2;
        }
        if (b2 == 0 && i == 0) {
            b(f2, f2.actionsIterator(), this.g);
        }
        if (i != 0) {
            b(f2, f2.actionsIterator(), this.h);
        }
        this.f20042b.remove(f2);
    }

    private final int a(F f2, Iterator<String> it2, HashMap<String, F[]> hashMap) {
        int i = 0;
        if (it2 == null) {
            return 0;
        }
        while (it2.hasNext()) {
            i++;
            a(hashMap, it2.next(), f2);
        }
        return i;
    }

    private final int b(F f2, Iterator<String> it2, HashMap<String, F[]> hashMap) {
        int i = 0;
        if (it2 == null) {
            return 0;
        }
        while (it2.hasNext()) {
            i++;
            a(hashMap, it2.next(), (Object) f2);
        }
        return i;
    }

    private final void a(HashMap<String, F[]> hashMap, String str, F f2) {
        IntentFilter[] intentFilterArr = (IntentFilter[]) hashMap.get(str);
        if (intentFilterArr == null) {
            IntentFilter[] a2 = a(2);
            hashMap.put(str, a2);
            a2[0] = f2;
            return;
        }
        int length = intentFilterArr.length;
        int i = length;
        while (i > 0 && intentFilterArr[i - 1] == null) {
            i--;
        }
        if (i < length) {
            intentFilterArr[i] = f2;
            return;
        }
        IntentFilter[] a3 = a((length * 3) / 2);
        System.arraycopy(intentFilterArr, 0, a3, 0, length);
        a3[length] = f2;
        hashMap.put(str, a3);
    }

    private final void a(HashMap<String, F[]> hashMap, String str, Object obj) {
        IntentFilter[] intentFilterArr = (IntentFilter[]) hashMap.get(str);
        if (intentFilterArr != null) {
            int length = intentFilterArr.length - 1;
            while (length >= 0 && intentFilterArr[length] == null) {
                length--;
            }
            int i = length;
            while (length >= 0) {
                if (intentFilterArr[length] == obj) {
                    int i2 = i - length;
                    if (i2 > 0) {
                        System.arraycopy(intentFilterArr, length + 1, intentFilterArr, length, i2);
                    }
                    intentFilterArr[i] = null;
                    i--;
                }
                length--;
            }
            if (i < 0) {
                hashMap.remove(str);
            } else if (i < intentFilterArr.length / 2) {
                IntentFilter[] a2 = a(i + 2);
                System.arraycopy(intentFilterArr, 0, a2, 0, i + 1);
                hashMap.put(str, a2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<R> a(android.content.Intent r18, java.lang.String r19, boolean r20, int r21) {
        /*
            r17 = this;
            r9 = r17
            r10 = r19
            java.lang.String r11 = r18.getScheme()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = 0
            if (r10 == 0) goto L_0x007a
            r1 = 47
            int r1 = r10.indexOf(r1)
            if (r1 <= 0) goto L_0x007a
            r2 = 0
            java.lang.String r2 = r10.substring(r2, r1)
            java.lang.String r3 = "*"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0066
            int r3 = r19.length()
            int r4 = r1 + 2
            if (r3 != r4) goto L_0x0049
            int r1 = r1 + 1
            char r1 = r10.charAt(r1)
            r3 = 42
            if (r1 == r3) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            java.util.HashMap<java.lang.String, F[]> r1 = r9.f20044d
            java.lang.Object r1 = r1.get(r2)
            android.content.IntentFilter[] r1 = (android.content.IntentFilter[]) r1
            java.util.HashMap<java.lang.String, F[]> r3 = r9.f20045e
            java.lang.Object r2 = r3.get(r2)
            android.content.IntentFilter[] r2 = (android.content.IntentFilter[]) r2
            goto L_0x0059
        L_0x0049:
            java.util.HashMap<java.lang.String, F[]> r1 = r9.f20043c
            java.lang.Object r1 = r1.get(r10)
            android.content.IntentFilter[] r1 = (android.content.IntentFilter[]) r1
            java.util.HashMap<java.lang.String, F[]> r3 = r9.f20045e
            java.lang.Object r2 = r3.get(r2)
            android.content.IntentFilter[] r2 = (android.content.IntentFilter[]) r2
        L_0x0059:
            java.util.HashMap<java.lang.String, F[]> r3 = r9.f20045e
            java.lang.String r4 = "*"
            java.lang.Object r3 = r3.get(r4)
            android.content.IntentFilter[] r3 = (android.content.IntentFilter[]) r3
            r13 = r2
            r14 = r3
            goto L_0x007d
        L_0x0066:
            java.lang.String r1 = r18.getAction()
            if (r1 == 0) goto L_0x007a
            java.util.HashMap<java.lang.String, F[]> r1 = r9.h
            java.lang.String r2 = r18.getAction()
            java.lang.Object r1 = r1.get(r2)
            android.content.IntentFilter[] r1 = (android.content.IntentFilter[]) r1
            r13 = r0
            goto L_0x007c
        L_0x007a:
            r1 = r0
            r13 = r1
        L_0x007c:
            r14 = r13
        L_0x007d:
            if (r11 == 0) goto L_0x0087
            java.util.HashMap<java.lang.String, F[]> r0 = r9.f20046f
            java.lang.Object r0 = r0.get(r11)
            android.content.IntentFilter[] r0 = (android.content.IntentFilter[]) r0
        L_0x0087:
            r15 = r0
            if (r10 != 0) goto L_0x00a0
            if (r11 != 0) goto L_0x00a0
            java.lang.String r0 = r18.getAction()
            if (r0 == 0) goto L_0x00a0
            java.util.HashMap<java.lang.String, F[]> r0 = r9.g
            java.lang.String r1 = r18.getAction()
            java.lang.Object r0 = r0.get(r1)
            android.content.IntentFilter[] r0 = (android.content.IntentFilter[]) r0
            r6 = r0
            goto L_0x00a1
        L_0x00a0:
            r6 = r1
        L_0x00a1:
            java.util.HashSet r16 = a((android.content.Intent) r18)
            if (r6 == 0) goto L_0x00b7
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r20
            r4 = r19
            r5 = r11
            r7 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00b7:
            if (r13 == 0) goto L_0x00ca
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r20
            r4 = r19
            r5 = r11
            r6 = r13
            r7 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00ca:
            if (r14 == 0) goto L_0x00dd
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r20
            r4 = r19
            r5 = r11
            r6 = r14
            r7 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00dd:
            if (r15 == 0) goto L_0x00f0
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r20
            r4 = r19
            r5 = r11
            r6 = r15
            r7 = r12
            r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00f0:
            r9.a((java.util.List<R>) r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.b.a(android.content.Intent, java.lang.String, boolean, int):java.util.List");
    }

    public final List<R> a(Intent intent, String str, boolean z, ArrayList<F[]> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        HashSet<String> a2 = a(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(intent, a2, z, str, scheme, (IntentFilter[]) arrayList.get(i2), arrayList2, 0);
        }
        a((List<R>) arrayList2);
        return arrayList2;
    }

    private void a(Intent intent, HashSet<String> hashSet, boolean z, String str, String str2, F[] fArr, List<R> list, int i) {
        int i2;
        F[] fArr2 = fArr;
        List<R> list2 = list;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        if (fArr2 != null) {
            i2 = fArr2.length;
        } else {
            i2 = 0;
        }
        int i3 = 0;
        while (i3 < i2) {
            F f2 = fArr2[i3];
            if (f2 != null) {
                if ((str3 == null || a(str3, f2)) && a(f2, list2)) {
                    int match = f2.match(action, str, str2, data, hashSet, "IntentResolver");
                    if (match >= 0 && (!z || f2.hasCategory("android.intent.category.DEFAULT"))) {
                        Object a2 = a((IntentFilter) f2, match, i);
                        if (a2 != null) {
                            list2.add(a2);
                        }
                        i3++;
                    }
                }
                int i4 = i;
                i3++;
            } else {
                return;
            }
        }
    }
}
