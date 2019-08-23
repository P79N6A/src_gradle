package io.fabric.sdk.android.services.c;

import android.content.Context;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b<T> {
    protected final Context context;
    protected final k currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final c eventStorage;
    public volatile long lastRollOverTime;
    protected final List<d> rollOverListeners = new CopyOnWriteArrayList();
    protected final a<T> transform;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final File f83223a;

        /* renamed from: b  reason: collision with root package name */
        final long f83224b;

        public a(File file, long j) {
            this.f83223a = file;
            this.f83224b = j;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String generateUniqueRollOverFileName();

    /* access modifiers changed from: protected */
    public int getMaxByteSizePerFile() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.a(1);
    }

    public void deleteAllEventsFiles() {
        this.eventStorage.a(this.eventStorage.c());
        this.eventStorage.d();
    }

    public boolean rollFileOver() throws IOException {
        String str;
        boolean z = true;
        if (!this.eventStorage.b()) {
            str = generateUniqueRollOverFileName();
            this.eventStorage.a(str);
            i.a(this.context, 4, String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.lastRollOverTime = this.currentTimeProvider.a();
        } else {
            str = null;
            z = false;
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> c2 = this.eventStorage.c();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (c2.size() > maxFilesToKeep) {
            int size = c2.size() - maxFilesToKeep;
            i.a(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c2.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new Comparator<a>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    return (int) (((a) obj).f83224b - ((a) obj2).f83224b);
                }
            });
            for (File file : c2) {
                treeSet.add(new a(file, parseCreationTimestampFromFileName(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = treeSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((a) it2.next()).f83223a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.eventStorage.a((List<File>) arrayList);
        }
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.a(list);
    }

    public void registerRollOverListener(d dVar) {
        if (dVar != null) {
            this.rollOverListeners.add(dVar);
        }
    }

    public void writeEvent(T t) throws IOException {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.a(bytes);
    }

    private void triggerRollOverOnListeners(String str) {
        for (d onRollOver : this.rollOverListeners) {
            try {
                onRollOver.onRollOver(str);
            } catch (Exception unused) {
                i.b(this.context, "One of the roll over listeners threw an exception");
            }
        }
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private void rollFileOverIfNeeded(int i) throws IOException {
        if (!this.eventStorage.a(i, getMaxByteSizePerFile())) {
            i.a(this.context, 4, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.eventStorage.a()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())}));
            rollFileOver();
        }
    }

    public b(Context context2, a<T> aVar, k kVar, c cVar, int i) throws IOException {
        this.context = context2.getApplicationContext();
        this.transform = aVar;
        this.eventStorage = cVar;
        this.currentTimeProvider = kVar;
        this.lastRollOverTime = this.currentTimeProvider.a();
        this.defaultMaxFilesToKeep = i;
    }
}
