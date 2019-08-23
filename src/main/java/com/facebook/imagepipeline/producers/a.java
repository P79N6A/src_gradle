package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.b;

public final class a implements al<b> {

    /* renamed from: a  reason: collision with root package name */
    private final al<b> f24000a;

    /* renamed from: com.facebook.imagepipeline.producers.a$a  reason: collision with other inner class name */
    static class C0267a extends m<b, b> {
        private C0267a(Consumer<b> consumer) {
            super(consumer);
        }

        /* synthetic */ C0267a(Consumer consumer, byte b2) {
            this(consumer);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onNewResultImpl(Object obj, int i) {
            b bVar = (b) obj;
            if (bVar == null) {
                this.mConsumer.onNewResult(null, i);
                return;
            }
            if (!b.isMetaDataAvailable(bVar)) {
                bVar.parseMetaData();
            }
            this.mConsumer.onNewResult(bVar, i);
        }
    }

    public a(al<b> alVar) {
        this.f24000a = alVar;
    }

    public final void produceResults(Consumer<b> consumer, am amVar) {
        this.f24000a.produceResults(new C0267a(consumer, (byte) 0), amVar);
    }
}
