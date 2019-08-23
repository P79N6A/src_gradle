package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    private static final Object HAS_NEXT = new Object();
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    AtomicReferenceArray<Object> consumerBuffer;
    final AtomicLong consumerIndex = new AtomicLong();
    final int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    final AtomicLong producerIndex = new AtomicLong();
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;

    private static int calcDirectOffset(int i) {
        return i;
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (lvProducerIndex() == lvConsumerIndex()) {
            return true;
        }
        return false;
    }

    public final T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int i = this.consumerMask;
        T lvElement = lvElement(atomicReferenceArray, calcWrappedOffset(lpConsumerIndex, i));
        if (lvElement == HAS_NEXT) {
            return newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), lpConsumerIndex, i);
        }
        return lvElement;
    }

    public final int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }

    @Nullable
    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int i = this.consumerMask;
        int calcWrappedOffset = calcWrappedOffset(lpConsumerIndex, i);
        T lvElement = lvElement(atomicReferenceArray, calcWrappedOffset);
        if (lvElement == HAS_NEXT) {
            z = true;
        } else {
            z = false;
        }
        if (lvElement != null && !z) {
            soElement(atomicReferenceArray, calcWrappedOffset, null);
            soConsumerIndex(lpConsumerIndex + 1);
            return lvElement;
        } else if (z) {
            return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), lpConsumerIndex, i);
        } else {
            return null;
        }
    }

    private void soConsumerIndex(long j) {
        this.consumerIndex.lazySet(j);
    }

    private void soProducerIndex(long j) {
        this.producerIndex.lazySet(j);
    }

    private void adjustLookAheadStep(int i) {
        this.producerLookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP);
    }

    public SpscLinkedArrayQueue(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i2;
        adjustLookAheadStep(roundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i2;
        this.producerLookAhead = (long) (i2 - 1);
        soProducerIndex(0);
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
            long lpProducerIndex = lpProducerIndex();
            int i = this.producerMask;
            int calcWrappedOffset = calcWrappedOffset(lpProducerIndex, i);
            if (lpProducerIndex < this.producerLookAhead) {
                return writeToQueue(atomicReferenceArray, t, lpProducerIndex, calcWrappedOffset);
            }
            long j = ((long) this.producerLookAheadStep) + lpProducerIndex;
            if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
                this.producerLookAhead = j - 1;
                return writeToQueue(atomicReferenceArray, t, lpProducerIndex, calcWrappedOffset);
            } else if (lvElement(atomicReferenceArray, calcWrappedOffset(1 + lpProducerIndex, i)) == null) {
                return writeToQueue(atomicReferenceArray, t, lpProducerIndex, calcWrappedOffset);
            } else {
                resize(atomicReferenceArray, lpProducerIndex, calcWrappedOffset, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    private static int calcWrappedOffset(long j, int i) {
        return calcDirectOffset(((int) j) & i);
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int calcDirectOffset = calcDirectOffset(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, calcDirectOffset);
        soElement(atomicReferenceArray, calcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    public final boolean offer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long lvProducerIndex = lvProducerIndex();
        int i = this.producerMask;
        long j = 2 + lvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            int calcWrappedOffset = calcWrappedOffset(lvProducerIndex, i);
            soElement(atomicReferenceArray, calcWrappedOffset + 1, t2);
            soElement(atomicReferenceArray, calcWrappedOffset, t);
            soProducerIndex(j);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.producerBuffer = atomicReferenceArray2;
            int calcWrappedOffset2 = calcWrappedOffset(lvProducerIndex, i);
            soElement(atomicReferenceArray2, calcWrappedOffset2 + 1, t2);
            soElement(atomicReferenceArray2, calcWrappedOffset2, t);
            soNext(atomicReferenceArray, atomicReferenceArray2);
            soElement(atomicReferenceArray, calcWrappedOffset2, HAS_NEXT);
            soProducerIndex(j);
        }
        return true;
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.consumerBuffer = atomicReferenceArray;
        return lvElement(atomicReferenceArray, calcWrappedOffset(j, i));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.consumerBuffer = atomicReferenceArray;
        int calcWrappedOffset = calcWrappedOffset(j, i);
        T lvElement = lvElement(atomicReferenceArray, calcWrappedOffset);
        if (lvElement != null) {
            soElement(atomicReferenceArray, calcWrappedOffset, null);
            soConsumerIndex(j + 1);
        }
        return lvElement;
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        soElement(atomicReferenceArray, i, t);
        soProducerIndex(j + 1);
        return true;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j2 + j) - 1;
        soElement(atomicReferenceArray2, i, t);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i, HAS_NEXT);
        soProducerIndex(j + 1);
    }
}