package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class d<T> implements Supplier<DataSource<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Supplier<DataSource<T>>> f23608a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23609b;

    @ThreadSafe
    class a extends a<T> {
        @GuardedBy
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<DataSource<T>> f23611b;
        @GuardedBy

        /* renamed from: c  reason: collision with root package name */
        private int f23612c;

        /* renamed from: d  reason: collision with root package name */
        private int f23613d;

        /* renamed from: e  reason: collision with root package name */
        private AtomicInteger f23614e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        private Throwable f23615f;

        /* renamed from: com.facebook.datasource.d$a$a  reason: collision with other inner class name */
        class C0259a implements DataSubscriber<T> {

            /* renamed from: b  reason: collision with root package name */
            private int f23617b;

            public final void onCancellation(DataSource<T> dataSource) {
            }

            public final void onFailure(DataSource<T> dataSource) {
                a.this.b(this.f23617b, dataSource);
            }

            public final void onProgressUpdate(DataSource<T> dataSource) {
                if (this.f23617b == 0) {
                    a.this.setProgress(dataSource.getProgress());
                }
            }

            public final void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    a.this.a(this.f23617b, dataSource);
                    return;
                }
                if (dataSource.isFinished()) {
                    a.this.b(this.f23617b, dataSource);
                }
            }

            public C0259a(int i) {
                this.f23617b = i;
            }
        }

        @Nullable
        private synchronized DataSource<T> b() {
            return a(this.f23612c);
        }

        @Nullable
        public final synchronized T getResult() {
            if (d.this.f23609b) {
                a();
            }
            DataSource b2 = b();
            if (b2 == null) {
                return null;
            }
            return b2.getResult();
        }

        public final synchronized boolean hasResult() {
            boolean z;
            if (d.this.f23609b) {
                a();
            }
            DataSource b2 = b();
            if (b2 == null || !b2.hasResult()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        private void c() {
            if (this.f23614e.incrementAndGet() == this.f23613d && this.f23615f != null) {
                a(this.f23615f);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r0 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r1 >= r0.size()) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            a(r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean close() {
            /*
                r3 = this;
                com.facebook.datasource.d r0 = com.facebook.datasource.d.this
                boolean r0 = r0.f23609b
                if (r0 == 0) goto L_0x0009
                r3.a()
            L_0x0009:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x002f }
                r1 = 0
                if (r0 != 0) goto L_0x0013
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                return r1
            L_0x0013:
                java.util.ArrayList<com.facebook.datasource.DataSource<T>> r0 = r3.f23611b     // Catch:{ all -> 0x002f }
                r2 = 0
                r3.f23611b = r2     // Catch:{ all -> 0x002f }
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
            L_0x001b:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002d
                java.lang.Object r2 = r0.get(r1)
                com.facebook.datasource.DataSource r2 = (com.facebook.datasource.DataSource) r2
                a((com.facebook.datasource.DataSource<T>) r2)
                int r1 = r1 + 1
                goto L_0x001b
            L_0x002d:
                r0 = 1
                return r0
            L_0x002f:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.d.a.close():boolean");
        }

        private void a() {
            if (this.f23614e == null) {
                synchronized (this) {
                    if (this.f23614e == null) {
                        this.f23614e = new AtomicInteger(0);
                        int size = d.this.f23608a.size();
                        this.f23613d = size;
                        this.f23612c = size;
                        this.f23611b = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            DataSource dataSource = (DataSource) d.this.f23608a.get(i).get();
                            this.f23611b.add(dataSource);
                            dataSource.subscribe(new C0259a(i), CallerThreadExecutor.getInstance());
                            if (dataSource.hasResult()) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        private static void a(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        public a() {
            if (!d.this.f23609b) {
                a();
            }
        }

        @Nullable
        private synchronized DataSource<T> a(int i) {
            if (this.f23611b == null || i >= this.f23611b.size()) {
                return null;
            }
            return this.f23611b.get(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            return null;
         */
        @javax.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized com.facebook.datasource.DataSource<T> b(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.util.ArrayList<com.facebook.datasource.DataSource<T>> r0 = r2.f23611b     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x0018
                java.util.ArrayList<com.facebook.datasource.DataSource<T>> r0 = r2.f23611b     // Catch:{ all -> 0x001a }
                int r0 = r0.size()     // Catch:{ all -> 0x001a }
                if (r3 >= r0) goto L_0x0018
                java.util.ArrayList<com.facebook.datasource.DataSource<T>> r0 = r2.f23611b     // Catch:{ all -> 0x001a }
                java.lang.Object r3 = r0.set(r3, r1)     // Catch:{ all -> 0x001a }
                com.facebook.datasource.DataSource r3 = (com.facebook.datasource.DataSource) r3     // Catch:{ all -> 0x001a }
                monitor-exit(r2)
                return r3
            L_0x0018:
                monitor-exit(r2)
                return r1
            L_0x001a:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.d.a.b(int):com.facebook.datasource.DataSource");
        }

        @Nullable
        private synchronized DataSource<T> c(int i, DataSource<T> dataSource) {
            if (dataSource == b()) {
                return null;
            }
            if (dataSource != a(i)) {
                return dataSource;
            }
            return b(i);
        }

        public final void b(int i, DataSource<T> dataSource) {
            a(c(i, dataSource));
            if (i == 0) {
                this.f23615f = dataSource.getFailureCause();
            }
            c();
        }

        public final void a(int i, DataSource<T> dataSource) {
            boolean z;
            boolean isFinished = dataSource.isFinished();
            synchronized (this) {
                int i2 = this.f23612c;
                if (dataSource == a(i)) {
                    if (i != this.f23612c) {
                        if (b() == null || (isFinished && i < this.f23612c)) {
                            this.f23612c = i;
                            i2 = i;
                        }
                        for (int i3 = this.f23612c; i3 > i2; i3--) {
                            a(b(i3));
                        }
                    }
                }
            }
            if (dataSource == b()) {
                if (i != 0 || !dataSource.isFinished()) {
                    z = false;
                } else {
                    z = true;
                }
                a(null, z);
            }
            c();
        }
    }

    public final /* synthetic */ Object get() {
        return new a();
    }

    public final int hashCode() {
        return this.f23608a.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper((Object) this).add("list", (Object) this.f23608a).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return Objects.equal(this.f23608a, ((d) obj).f23608a);
    }

    public d(List<Supplier<DataSource<T>>> list, boolean z) {
        Preconditions.checkArgument(!list.isEmpty(), "List of suppliers is empty!");
        this.f23608a = list;
        this.f23609b = z;
    }
}
