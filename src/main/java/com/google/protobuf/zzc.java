package com.google.protobuf;

public final class zzc {
    private static Class<?> zzcrz = zzLo();

    private static Class<?> zzLo() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzd zzLp() {
        if (zzcrz != null) {
            try {
                return (zzd) zzcrz.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return zzd.zzcrC;
    }
}
