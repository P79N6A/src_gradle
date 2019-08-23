package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.e;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.b;

public final class aq implements al<CloseableReference<e>> {

    /* renamed from: a  reason: collision with root package name */
    private final al<b> f24081a;

    class a extends m<b, CloseableReference<e>> {
        private a(Consumer<CloseableReference<e>> consumer) {
            super(consumer);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            b bVar = (b) obj;
            CloseableReference<e> closeableReference = null;
            try {
                if (b.isValid(bVar)) {
                    closeableReference = bVar.getByteBufferRef();
                }
                this.mConsumer.onNewResult(closeableReference, i);
            } finally {
                CloseableReference.closeSafely(closeableReference);
            }
        }

        /* synthetic */ a(aq aqVar, Consumer consumer, byte b2) {
            this(consumer);
        }
    }

    public aq(al<b> alVar) {
        this.f24081a = alVar;
    }

    public final void produceResults(Consumer<CloseableReference<e>> consumer, am amVar) {
        this.f24081a.produceResults(new a(this, consumer, (byte) 0), amVar);
    }
}
