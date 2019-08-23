package net.jpountz.xxhash;

import java.io.PrintStream;
import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.StreamingXXHash64;

public final class XXHashFactory {
    private static XXHashFactory JAVA_SAFE_INSTANCE;
    private static XXHashFactory JAVA_UNSAFE_INSTANCE;
    private static XXHashFactory NATIVE_INSTANCE;
    private final XXHash32 hash32;
    private final XXHash64 hash64;
    private final String impl;
    private final StreamingXXHash32.Factory streamingHash32Factory;
    private final StreamingXXHash64.Factory streamingHash64Factory;

    public final XXHash32 hash32() {
        return this.hash32;
    }

    public final XXHash64 hash64() {
        return this.hash64;
    }

    public static XXHashFactory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    public static synchronized XXHashFactory nativeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            xXHashFactory = NATIVE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory safeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            xXHashFactory = JAVA_SAFE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory unsafeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            xXHashFactory = JAVA_UNSAFE_INSTANCE;
        }
        return xXHashFactory;
    }

    public final String toString() {
        return getClass().getSimpleName() + ":" + this.impl;
    }

    public static XXHashFactory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public final StreamingXXHash32 newStreamingHash32(int i) {
        return this.streamingHash32Factory.newStreamingHash(i);
    }

    public final StreamingXXHash64 newStreamingHash64(long j) {
        return this.streamingHash64Factory.newStreamingHash(j);
    }

    private static XXHashFactory instance(String str) {
        try {
            return new XXHashFactory(str);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    private static <T> T classInstance(String str) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        ClassLoader classLoader = XXHashFactory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        printStream.println("Fastest instance is " + fastestInstance());
        PrintStream printStream2 = System.out;
        printStream2.println("Fastest Java instance is " + fastestJavaInstance());
    }

    private XXHashFactory(String str) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        this.impl = str;
        this.hash32 = (XXHash32) classInstance("net.jpountz.xxhash.XXHash32" + str);
        this.streamingHash32Factory = (StreamingXXHash32.Factory) classInstance("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory");
        StringBuilder sb = new StringBuilder("net.jpountz.xxhash.XXHash64");
        sb.append(str);
        this.hash64 = (XXHash64) classInstance(sb.toString());
        this.streamingHash64Factory = (StreamingXXHash64.Factory) classInstance("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory");
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int nextInt = random.nextInt();
        int hash = this.hash32.hash(bArr, 0, 100, nextInt);
        StreamingXXHash32 newStreamingHash32 = newStreamingHash32(nextInt);
        newStreamingHash32.update(bArr, 0, 100);
        int value = newStreamingHash32.getValue();
        long j = (long) nextInt;
        long hash2 = this.hash64.hash(bArr, 0, 100, j);
        StreamingXXHash64 newStreamingHash64 = newStreamingHash64(j);
        newStreamingHash64.update(bArr, 0, 100);
        long value2 = newStreamingHash64.getValue();
        if (hash != value) {
            throw new AssertionError();
        } else if (hash2 != value2) {
            throw new AssertionError();
        }
    }
}
