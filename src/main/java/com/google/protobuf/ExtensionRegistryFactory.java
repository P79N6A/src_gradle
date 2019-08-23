package com.google.protobuf;

public final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();

    ExtensionRegistryFactory() {
    }

    public static ExtensionRegistryLite createEmpty() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ExtensionRegistryLite create() {
        if (EXTENSION_REGISTRY_CLASS != null) {
            try {
                return invokeSubclassFactory("newInstance");
            } catch (Exception unused) {
            }
        }
        return new ExtensionRegistryLite();
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String str) throws Exception {
        return (ExtensionRegistryLite) EXTENSION_REGISTRY_CLASS.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    static boolean isFullRegistry(ExtensionRegistryLite extensionRegistryLite) {
        if (EXTENSION_REGISTRY_CLASS == null || !EXTENSION_REGISTRY_CLASS.isAssignableFrom(extensionRegistryLite.getClass())) {
            return false;
        }
        return true;
    }
}
