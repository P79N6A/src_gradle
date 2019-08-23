package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.bridge.RNJavaScriptRuntime;
import com.facebook.react.common.DebugServerException;

public abstract class JSBundleLoader {
    public boolean mDebugRemote;
    public RNJavaScriptRuntime.SplitCommonType mUseCommonSplit;

    public abstract String loadScript(CatalystInstanceImpl catalystInstanceImpl);

    public JSBundleLoader() {
        this.mUseCommonSplit = RNJavaScriptRuntime.SplitCommonType.NONE;
        this.mUseCommonSplit = RNJavaScriptRuntime.SplitCommonType.NONE;
    }

    public static JSBundleLoader createFileLoader(String str) {
        return createFileLoader(str, str, false, RNJavaScriptRuntime.SplitCommonType.NONE);
    }

    public JSBundleLoader(RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        this.mUseCommonSplit = RNJavaScriptRuntime.SplitCommonType.NONE;
        this.mUseCommonSplit = splitCommonType;
    }

    public static JSBundleLoader createFileLoader(String str, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        return createFileLoader(str, str, false, splitCommonType);
    }

    public JSBundleLoader(RNJavaScriptRuntime.SplitCommonType splitCommonType, boolean z) {
        this.mUseCommonSplit = RNJavaScriptRuntime.SplitCommonType.NONE;
        this.mUseCommonSplit = splitCommonType;
        this.mDebugRemote = z;
    }

    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z) {
        return new JSBundleLoader(RNJavaScriptRuntime.SplitCommonType.NONE) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createCachedBundleFromNetworkLoader(final String str, final String str2, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                try {
                    catalystInstanceImpl.loadScriptFromFile(str2, str, false, true);
                    return str;
                } catch (Exception e2) {
                    throw DebugServerException.makeGeneric(e2.getMessage(), e2);
                }
            }
        };
    }

    public static JSBundleLoader createRemoteDebuggerBundleLoader(final String str, final String str2, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType, true) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.setSourceURLs(str2, str);
                return str2;
            }
        };
    }

    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createFileLoader(final String str, final String str2, final boolean z, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        return new JSBundleLoader(splitCommonType) {
            public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
                catalystInstanceImpl.loadScriptFromFile(str, str2, z);
                return str;
            }
        };
    }
}
