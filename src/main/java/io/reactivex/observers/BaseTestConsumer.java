package io.reactivex.observers;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Notification;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected final CountDownLatch done = new CountDownLatch(1);
    protected final List<Throwable> errors = new VolatileSizeArrayList();
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List<T> values = new VolatileSizeArrayList();

    public enum TestWaitStrategy implements Runnable {
        SPIN {
            public final void run() {
            }
        },
        YIELD {
            public final void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS {
            public final void run() {
                sleep(1);
            }
        },
        SLEEP_10MS {
            public final void run() {
                sleep(10);
            }
        },
        SLEEP_100MS {
            public final void run() {
                sleep(100);
            }
        },
        SLEEP_1000MS {
            public final void run() {
                sleep(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            }
        };

        public abstract void run();

        static void sleep(int i) {
            try {
                Thread.sleep((long) i);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public abstract U assertNotSubscribed();

    public abstract U assertSubscribed();

    public final U clearTimeout() {
        this.timeout = false;
        return this;
    }

    public final long completions() {
        return this.completions;
    }

    public final List<Throwable> errors() {
        return this.errors;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final Thread lastThread() {
        return this.lastThread;
    }

    public final List<T> values() {
        return this.values;
    }

    public final U assertNoValues() {
        return assertValueCount(0);
    }

    public final int errorCount() {
        return this.errors.size();
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final U assertNoTimeout() {
        if (!this.timeout) {
            return this;
        }
        throw fail("Timeout?!");
    }

    public final U assertTimeout() {
        if (this.timeout) {
            return this;
        }
        throw fail("No timeout?!");
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean isTerminated() {
        if (this.done.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final U assertEmpty() {
        return assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public final U assertNotTerminated() {
        if (this.done.getCount() != 0) {
            return this;
        }
        throw fail("Subscriber terminated!");
    }

    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final U assertComplete() {
        long j = this.completions;
        if (j == 0) {
            throw fail("Not completed");
        } else if (j <= 1) {
            return this;
        } else {
            throw fail("Multiple completions: " + j);
        }
    }

    public final U assertNotComplete() {
        long j = this.completions;
        if (j == 1) {
            throw fail("Completed!");
        } else if (j <= 1) {
            return this;
        } else {
            throw fail("Multiple completions: " + j);
        }
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j = 0; j < this.completions; j++) {
            arrayList2.add(Notification.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final U assertTerminated() {
        if (this.done.getCount() == 0) {
            long j = this.completions;
            if (j <= 1) {
                int size = this.errors.size();
                if (size > 1) {
                    throw fail("Terminated with multiple errors: " + size);
                } else if (j == 0 || size == 0) {
                    return this;
                } else {
                    throw fail("Terminated with multiple completions and errors: " + j);
                }
            } else {
                throw fail("Terminated with multiple completions: " + j);
            }
        } else {
            throw fail("Subscriber still running!");
        }
    }

    public final U withTag(CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return assertError(Functions.isInstanceOf(cls));
    }

    public final U awaitCount(int i) {
        return awaitCount(i, TestWaitStrategy.SLEEP_10MS, 5000);
    }

    public final U assertError(Throwable th) {
        return assertError(Functions.equalsWith(th));
    }

    public final U assertResult(T... tArr) {
        return assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public final U assertValue(Predicate<T> predicate) {
        assertValueAt(0, predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertValueSequenceOnly(Iterable<? extends T> iterable) {
        return assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSetOnly(Collection<? extends T> collection) {
        return assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValuesOnly(T... tArr) {
        return assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public static String valueAndClass(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    public final U assertNever(T t) {
        int size = this.values.size();
        int i = 0;
        while (i < size) {
            if (!ObjectHelper.equals(this.values.get(i), t)) {
                i++;
            } else {
                throw fail("Value at position " + i + " is equal to " + valueAndClass(t) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final U assertValueCount(int i) {
        int size = this.values.size();
        if (size == i) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i + " but was: " + size);
    }

    public final U assertValueSet(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T next : this.values) {
            if (!collection.contains(next)) {
                throw fail("Value not in the expected collection: " + valueAndClass(next));
            }
        }
        return this;
    }

    public final U assertError(Predicate<Throwable> predicate) {
        int size = this.errors.size();
        if (size != 0) {
            boolean z = false;
            Iterator<Throwable> it2 = this.errors.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    if (predicate.test(it2.next())) {
                        z = true;
                        break;
                    }
                } catch (Exception e2) {
                    throw ExceptionHelper.wrapOrThrow(e2);
                }
            }
            if (!z) {
                throw fail("Error not present");
            } else if (size == 1) {
                return this;
            } else {
                throw fail("Error present but other errors as well");
            }
        } else {
            throw fail("No errors");
        }
    }

    public final U assertErrorMessage(String str) {
        int size = this.errors.size();
        if (size == 0) {
            throw fail("No errors");
        } else if (size == 1) {
            String message = this.errors.get(0).getMessage();
            if (ObjectHelper.equals(str, message)) {
                return this;
            }
            throw fail("Error message differs; exptected: " + str + " but was: " + message);
        } else {
            throw fail("Multiple errors");
        }
    }

    public final U assertNever(Predicate<? super T> predicate) {
        int size = this.values.size();
        int i = 0;
        while (i < size) {
            try {
                if (!predicate.test(this.values.get(i))) {
                    i++;
                } else {
                    throw fail("Value at position " + i + " matches predicate " + predicate.toString() + ", which was not expected.");
                }
            } catch (Exception e2) {
                throw ExceptionHelper.wrapOrThrow(e2);
            }
        }
        return this;
    }

    public final U assertValue(T t) {
        if (this.values.size() == 1) {
            T t2 = this.values.get(0);
            if (ObjectHelper.equals(t, t2)) {
                return this;
            }
            throw fail("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
        }
        throw fail("expected: " + valueAndClass(t) + " but was: " + this.values);
    }

    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size == tArr.length) {
            int i = 0;
            while (i < size) {
                T t = this.values.get(i);
                T t2 = tArr[i];
                if (ObjectHelper.equals(t2, t)) {
                    i++;
                } else {
                    throw fail("Values at position " + i + " differ; expected: " + valueAndClass(t2) + " but was: " + valueAndClass(t));
                }
            }
            return this;
        }
        throw fail("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.values);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final U assertValueSequence(java.lang.Iterable<? extends T> r6) {
        /*
            r5 = this;
            java.util.List<T> r0 = r5.values
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        L_0x000b:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = io.reactivex.internal.functions.ObjectHelper.equals(r2, r3)
            if (r4 == 0) goto L_0x0028
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0028:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Values at position "
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = " differ; expected: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r2)
            r6.append(r0)
            java.lang.String r0 = " but was: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L_0x0053:
            if (r3 != 0) goto L_0x0070
            if (r2 != 0) goto L_0x0058
            return r5
        L_0x0058:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Fewer values received than expected ("
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        L_0x0070:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "More values received than expected ("
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = ")"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.fail(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.BaseTestConsumer.assertValueSequence(java.lang.Iterable):io.reactivex.observers.BaseTestConsumer");
    }

    /* access modifiers changed from: protected */
    public final AssertionError fail(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (latch = ");
        sb.append(this.done.getCount());
        sb.append(", values = ");
        sb.append(this.values.size());
        sb.append(", errors = ");
        sb.append(this.errors.size());
        sb.append(", completions = ");
        sb.append(this.completions);
        if (this.timeout) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
            } else {
                assertionError.initCause(new CompositeException((Iterable<? extends Throwable>) this.errors));
            }
        }
        return assertionError;
    }

    public final U awaitCount(int i, Runnable runnable) {
        return awaitCount(i, runnable, 5000);
    }

    public final U assertFailure(Predicate<Throwable> predicate, T... tArr) {
        return assertSubscribed().assertValues(tArr).assertError(predicate).assertNotComplete();
    }

    public final U awaitDone(long j, TimeUnit timeUnit) {
        try {
            if (!this.done.await(j, timeUnit)) {
                this.timeout = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e2) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e2);
        }
    }

    public final boolean awaitTerminalEvent(long j, TimeUnit timeUnit) {
        try {
            return await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z;
        if (this.done.getCount() == 0 || this.done.await(j, timeUnit)) {
            z = true;
        } else {
            z = false;
        }
        this.timeout = !z;
        return z;
    }

    public final U assertValueAt(int i, Predicate<T> predicate) {
        if (this.values.size() == 0) {
            throw fail("No values");
        } else if (i < this.values.size()) {
            try {
                if (predicate.test(this.values.get(i))) {
                    return this;
                }
                throw fail("Value not present");
            } catch (Exception e2) {
                throw ExceptionHelper.wrapOrThrow(e2);
            }
        } else {
            throw fail("Invalid index: " + i);
        }
    }

    public final U assertValueAt(int i, T t) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        } else if (i < size) {
            T t2 = this.values.get(i);
            if (ObjectHelper.equals(t, t2)) {
                return this;
            }
            throw fail("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
        } else {
            throw fail("Invalid index: " + i);
        }
    }

    public final U assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        return assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U awaitCount(int i, Runnable runnable, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j <= 0 || System.currentTimeMillis() - currentTimeMillis < j) {
                if (this.done.getCount() == 0 || this.values.size() >= i) {
                    break;
                }
                runnable.run();
            } else {
                this.timeout = true;
                break;
            }
        }
        return this;
    }
}
