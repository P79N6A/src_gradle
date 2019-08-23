package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public final class c<T> implements Supplier<DataSource<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Supplier<DataSource<T>>> f23602a;

    @ThreadSafe
    class a extends a<T> {

        /* renamed from: b  reason: collision with root package name */
        private int f23604b;

        /* renamed from: c  reason: collision with root package name */
        private DataSource<T> f23605c;

        /* renamed from: d  reason: collision with root package name */
        private DataSource<T> f23606d;

        /* renamed from: com.facebook.datasource.c$a$a  reason: collision with other inner class name */
        class C0258a implements DataSubscriber<T> {
            public final void onCancellation(DataSource<T> dataSource) {
            }

            private C0258a() {
            }

            public final void onFailure(DataSource<T> dataSource) {
                a.this.a(dataSource);
            }

            public final void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    a.this.b(dataSource);
                    return;
                }
                if (dataSource.isFinished()) {
                    a.this.a(dataSource);
                }
            }

            public final void onProgressUpdate(DataSource<T> dataSource) {
                a.this.setProgress(Math.max(a.this.getProgress(), dataSource.getProgress()));
            }

            /* synthetic */ C0258a(a aVar, byte b2) {
                this();
            }
        }

        @Nullable
        private synchronized DataSource<T> c() {
            return this.f23606d;
        }

        public final boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                DataSource<T> dataSource = this.f23605c;
                this.f23605c = null;
                DataSource<T> dataSource2 = this.f23606d;
                this.f23606d = null;
                e(dataSource2);
                e(dataSource);
                return true;
            }
        }

        @Nullable
        public final synchronized T getResult() {
            DataSource c2 = c();
            if (c2 == null) {
                return null;
            }
            return c2.getResult();
        }

        public final synchronized boolean hasResult() {
            boolean z;
            DataSource c2 = c();
            if (c2 == null || !c2.hasResult()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        private boolean a() {
            DataSource dataSource;
            Supplier b2 = b();
            if (b2 != null) {
                dataSource = (DataSource) b2.get();
            } else {
                dataSource = null;
            }
            if (!c(dataSource) || dataSource == null) {
                e(dataSource);
                return false;
            }
            dataSource.subscribe(new C0258a(this, (byte) 0), CallerThreadExecutor.getInstance());
            return true;
        }

        @Nullable
        private synchronized Supplier<DataSource<T>> b() {
            if (isClosed() || this.f23604b >= c.this.f23602a.size()) {
                return null;
            }
            List<Supplier<DataSource<T>>> list = c.this.f23602a;
            int i = this.f23604b;
            this.f23604b = i + 1;
            return list.get(i);
        }

        private static void e(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        public a() {
            if (!a()) {
                a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        private synchronized boolean c(DataSource<T> dataSource) {
            if (isClosed()) {
                return false;
            }
            this.f23605c = dataSource;
            return true;
        }

        private synchronized boolean d(DataSource<T> dataSource) {
            if (!isClosed()) {
                if (dataSource == this.f23605c) {
                    this.f23605c = null;
                    return true;
                }
            }
            return false;
        }

        public final void a(DataSource<T> dataSource) {
            if (d(dataSource)) {
                if (dataSource != c()) {
                    e(dataSource);
                }
                if (!a()) {
                    a(dataSource.getFailureCause());
                }
            }
        }

        public final void b(DataSource<T> dataSource) {
            DataSource<T> dataSource2;
            boolean isFinished = dataSource.isFinished();
            synchronized (this) {
                if (dataSource == this.f23605c) {
                    if (dataSource != this.f23606d) {
                        if (this.f23606d != null) {
                            if (!isFinished) {
                                dataSource2 = null;
                                e(dataSource2);
                            }
                        }
                        dataSource2 = this.f23606d;
                        this.f23606d = dataSource;
                        e(dataSource2);
                    }
                }
            }
            if (dataSource == c()) {
                a(null, dataSource.isFinished());
            }
        }
    }

    public final int hashCode() {
        return this.f23602a.hashCode();
    }

    /* renamed from: a */
    public final DataSource<T> get() {
        return new a();
    }

    public final String toString() {
        return Objects.toStringHelper((Object) this).add("list", (Object) this.f23602a).toString();
    }

    public static <T> c<T> a(List<Supplier<DataSource<T>>> list) {
        return new c<>(list);
    }

    private c(List<Supplier<DataSource<T>>> list) {
        Preconditions.checkArgument(!list.isEmpty(), "List of suppliers is empty!");
        this.f23602a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return Objects.equal(this.f23602a, ((c) obj).f23602a);
    }
}
