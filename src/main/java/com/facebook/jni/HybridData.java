package com.facebook.jni;

import com.facebook.jni.a;
import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class HybridData {
    @DoNotStrip
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends a.C0269a {
        @DoNotStrip
        public long mNativePointer;

        static native void deleteNative(long j);

        /* access modifiers changed from: package-private */
        public final void a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        Destructor(Object obj) {
            super(obj);
        }
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer != 0) {
            return true;
        }
        return false;
    }

    public synchronized void resetNative() {
        this.mDestructor.a();
    }
}
