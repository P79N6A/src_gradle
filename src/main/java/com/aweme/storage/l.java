package com.aweme.storage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static volatile StorageDatabase f7409a;

    l() {
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.aweme.storage.j a(android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.aweme.storage.StorageDatabase r1 = f7409a
            if (r1 != 0) goto L_0x0022
            java.lang.Class<com.aweme.storage.l> r1 = com.aweme.storage.l.class
            monitor-enter(r1)
            java.lang.Class<com.aweme.storage.StorageDatabase> r2 = com.aweme.storage.StorageDatabase.class
            java.lang.String r3 = "storage_db"
            android.arch.persistence.room.RoomDatabase$Builder r4 = android.arch.persistence.room.Room.databaseBuilder(r4, r2, r3)     // Catch:{ Exception -> 0x001e }
            android.arch.persistence.room.RoomDatabase r4 = r4.build()     // Catch:{ Exception -> 0x001e }
            com.aweme.storage.StorageDatabase r4 = (com.aweme.storage.StorageDatabase) r4     // Catch:{ Exception -> 0x001e }
            f7409a = r4     // Catch:{ Exception -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r4 = move-exception
            goto L_0x0020
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x0022
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r4
        L_0x0022:
            com.aweme.storage.StorageDatabase r4 = f7409a
            if (r4 == 0) goto L_0x002d
            com.aweme.storage.StorageDatabase r4 = f7409a
            com.aweme.storage.j r4 = r4.a()
            return r4
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.l.a(android.content.Context):com.aweme.storage.j");
    }

    static void a(Context context, List<m> list, int i) {
        if (context != null) {
            j a2 = a(context);
            if (a2 != null) {
                List<m> a3 = a2.a();
                ArrayList arrayList = new ArrayList();
                if (a3.size() > 0) {
                    m[] mVarArr = new m[a3.size()];
                    a3.toArray(mVarArr);
                    a2.b(mVarArr);
                    for (m next : a3) {
                        if (!(next == null || next.f7411b == null || !new File(next.f7411b).exists())) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= list.size()) {
                                    break;
                                }
                                m mVar = list.get(i2);
                                if (mVar != null && mVar.f7411b != null && mVar.f7411b.equals(next.f7411b)) {
                                    mVar.f7414e = next.f7414e + 1;
                                    mVar.f7413d = next.f7413d;
                                    break;
                                }
                                i2++;
                            }
                            if (i2 >= list.size()) {
                                next.f7414e++;
                                arrayList.add(next);
                            }
                        }
                    }
                }
                list.addAll(arrayList);
                Collections.sort(list, new Comparator<m>() {
                    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                        long j;
                        m mVar = (m) obj2;
                        long j2 = ((m) obj).f7412c;
                        if (mVar == null) {
                            j = 0;
                        } else {
                            j = mVar.f7412c;
                        }
                        if (j2 < j) {
                            return 1;
                        }
                        if (j2 == j) {
                            return 0;
                        }
                        return -1;
                    }
                });
                if (list.size() > i) {
                    list = list.subList(0, i);
                }
                m[] mVarArr2 = new m[list.size()];
                list.toArray(mVarArr2);
                a2.a(mVarArr2);
            }
        }
    }
}
