package com.facebook.react.bridge;

import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.NativeModule;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

public class JavaMethodWrapper implements NativeModule.NativeMethod {
    private static final ArgumentExtractor<ReadableNativeArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableNativeArray>() {
        public final ReadableNativeArray extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return readableNativeArray.getArray(i);
        }
    };
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() {
        public final Boolean extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Boolean.valueOf(readableNativeArray.getBoolean(i));
        }
    };
    public static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() {
        @Nullable
        public final Callback extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            if (readableNativeArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableNativeArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() {
        public final Double extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Double.valueOf(readableNativeArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() {
        public final Dynamic extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return DynamicFromArray.create(readableNativeArray, i);
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() {
        public final Float extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Float.valueOf((float) readableNativeArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() {
        public final Integer extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return Integer.valueOf((int) readableNativeArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() {
        public final ReadableMap extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return readableNativeArray.getMap(i);
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() {
        public final int getJSArgumentsNeeded() {
            return 2;
        }

        public final Promise extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableNativeArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableNativeArray, i + 1));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() {
        public final String extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i) {
            return readableNativeArray.getString(i);
        }
    };
    private static final boolean DEBUG = false;
    @Nullable
    private ArgumentExtractor[] mArgumentExtractors;
    @Nullable
    private Object[] mArguments;
    private boolean mArgumentsProcessed;
    @Nullable
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    @Nullable
    private String mSignature;
    private String mType = "async";

    static abstract class ArgumentExtractor<T> {
        @Nullable
        public abstract T extractArgument(JSInstance jSInstance, ReadableNativeArray readableNativeArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }

        private ArgumentExtractor() {
        }
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getType() {
        return this.mType;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) a.b(this.mSignature);
    }

    private int calculateJSArgumentsNeeded() {
        int i = 0;
        for (ArgumentExtractor jSArgumentsNeeded : (ArgumentExtractor[]) a.b(this.mArgumentExtractors)) {
            i += jSArgumentsNeeded.getJSArgumentsNeeded();
        }
        return i;
    }

    private void processArguments() {
        if (!this.mArgumentsProcessed) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModuleWrapper.getName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.mMethod.getName());
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals("sync"));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'S';
        }
        return 0;
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i += argumentExtractorArr[i].getJSArgumentsNeeded()) {
            Class<Dynamic> cls = clsArr[i];
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (cls == Integer.class || cls == Integer.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == Double.class || cls == Double.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == String.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
            } else if (cls == Callback.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (cls == Promise.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                boolean z = true;
                if (i != clsArr.length - 1) {
                    z = false;
                }
                a.a(z, "Promise must be used as last parameter only");
            } else if (cls == ReadableMap.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
            } else if (cls == ReadableArray.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
            } else if (cls == Dynamic.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
            } else {
                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
            }
        }
        return argumentExtractorArr;
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 > 1) {
            return i + "-" + ((i + i2) - 1);
        }
        return i;
    }

    public void invoke(JSInstance jSInstance, ReadableNativeArray readableNativeArray) {
        String str = this.mModuleWrapper.getName() + ClassUtils.PACKAGE_SEPARATOR + this.mMethod.getName();
        int i = 0;
        if (DEBUG) {
            Object[] objArr = {this.mModuleWrapper.getName(), this.mMethod.getName()};
        }
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        if (this.mArguments == null || this.mArgumentExtractors == null) {
            throw new Error("processArguments failed");
        } else if (this.mJSArgumentsNeeded == readableNativeArray.size()) {
            int i2 = 0;
            while (i < this.mArgumentExtractors.length) {
                try {
                    this.mArguments[i] = this.mArgumentExtractors[i].extractArgument(jSInstance, readableNativeArray, i2);
                    i2 += this.mArgumentExtractors[i].getJSArgumentsNeeded();
                    i++;
                } catch (UnexpectedNativeTypeException e2) {
                    throw new NativeArgumentsParseException(e2.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i2, this.mArgumentExtractors[i].getJSArgumentsNeeded()) + ")", e2);
                } catch (IllegalArgumentException e3) {
                    throw new RuntimeException("Could not invoke " + str, e3);
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException("Could not invoke " + str, e4);
                } catch (InvocationTargetException e5) {
                    if (e5.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e5.getCause());
                    }
                    throw new RuntimeException("Could not invoke " + str, e5);
                }
            }
            this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
        } else {
            throw new NativeArgumentsParseException(str + " got " + readableNativeArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        this.mMethod.setAccessible(true);
        this.mParameterTypes = this.mMethod.getParameterTypes();
        this.mParamLength = this.mParameterTypes.length;
        if (z) {
            this.mType = "sync";
            return;
        }
        if (this.mParamLength > 0 && this.mParameterTypes[this.mParamLength - 1] == Promise.class) {
            this.mType = "promise";
        }
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb.append(returnTypeToChar(method.getReturnType()));
            sb.append('.');
        } else {
            sb.append("v.");
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class<Promise> cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z2 = true;
                if (i != clsArr.length - 1) {
                    z2 = false;
                }
                a.a(z2, "Promise must be used as last parameter only");
            }
            sb.append(paramTypeToChar(cls));
        }
        return sb.toString();
    }
}
