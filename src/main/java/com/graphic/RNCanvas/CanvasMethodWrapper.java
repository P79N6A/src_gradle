package com.graphic.RNCanvas;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class CanvasMethodWrapper {
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() {
        public final Float extractArgument(Object[] objArr, int i) {
            if (objArr[i] == null) {
                return Float.valueOf(0.0f);
            }
            return new Float(objArr[i].doubleValue());
        }
    };
    private static final ArgumentExtractor<float[]> ARGUMENT_EXTRACTOR_FLOAT_LIST = new ArgumentExtractor<float[]>() {
        public final float[] extractArgument(Object[] objArr, int i) {
            ArrayList arrayList = objArr[i];
            float[] fArr = new float[arrayList.size()];
            for (int i2 = 0; i2 < fArr.length; i2++) {
                fArr[i2] = ((Double) arrayList.get(i2)).floatValue();
            }
            return fArr;
        }
    };
    private static final ArgumentExtractor<HashMap> ARGUMENT_EXTRACTOR_HASHMAP = new ArgumentExtractor<HashMap>() {
        public final HashMap extractArgument(Object[] objArr, int i) {
            return objArr[i];
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() {
        public final Integer extractArgument(Object[] objArr, int i) {
            return new Integer(objArr[i].intValue());
        }
    };
    private static final ArgumentExtractor<int[]> ARGUMENT_EXTRACTOR_INTEGER_LIST = new ArgumentExtractor<int[]>() {
        public final int[] extractArgument(Object[] objArr, int i) {
            ArrayList arrayList = objArr[i];
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = ((Double) arrayList.get(i2)).intValue();
            }
            return iArr;
        }
    };
    private ArgumentExtractor[] mArgumentExtractors;
    private final Method mMethod;
    private String mMethodName;
    private final Class[] mParameterTypes = this.mMethod.getParameterTypes();

    static class ArgumentExtractor<T> {
        private ArgumentExtractor() {
        }

        public T extractArgument(Object[] objArr, int i) {
            return objArr[i];
        }
    }

    public String getName() {
        return this.mMethodName;
    }

    private void processArguments() {
        this.mMethodName = buildName(this.mParameterTypes);
        this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
    }

    public CanvasMethodWrapper(Method method) {
        this.mMethod = method;
        this.mMethod.setAccessible(true);
        processArguments();
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            Class<HashMap> cls = clsArr[i];
            if (cls == Float.class || cls == Float.TYPE) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (cls == float[].class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT_LIST;
            } else if (cls == Integer.TYPE || cls == Integer.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (cls == int[].class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER_LIST;
            } else if (cls == HashMap.class) {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_HASHMAP;
            } else {
                argumentExtractorArr[i] = new ArgumentExtractor();
            }
        }
        return argumentExtractorArr;
    }

    private String buildName(Class[] clsArr) {
        String name = this.mMethod.getName();
        for (int i = 0; i < clsArr.length; i++) {
            if (i == 0) {
                name = name + ":";
            }
            Class cls = clsArr[i];
            name = name + paramTypeToString(cls);
            if (i < clsArr.length - 1) {
                name = name + ":";
            }
        }
        return name;
    }

    private static String paramTypeToString(Class cls) {
        if (cls == Boolean.TYPE) {
            return "boolean";
        }
        if (cls == Boolean.class) {
            return "Boolean";
        }
        if (cls == Integer.TYPE) {
            return "int";
        }
        if (cls == int[].class) {
            return "int[]";
        }
        if (cls == Integer.class) {
            return "Integer";
        }
        if (cls == Double.TYPE) {
            return "double";
        }
        if (cls == Double.class) {
            return "Double";
        }
        if (cls == Float.TYPE) {
            return "float";
        }
        if (cls == float[].class) {
            return "float[]";
        }
        if (cls == Float.class) {
            return "Float";
        }
        if (cls == String.class) {
            return "String";
        }
        if (cls == HashMap.class) {
            return "HashMap";
        }
        return "other";
    }

    public void invoke(Object obj, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        if (this.mArgumentExtractors != null) {
            for (int i = 0; i < this.mArgumentExtractors.length; i++) {
                objArr2[i] = this.mArgumentExtractors[i].extractArgument(objArr, i);
            }
            try {
                this.mMethod.invoke(obj, objArr2);
            } catch (IllegalArgumentException e2) {
                throw new RuntimeException("Could not invoke " + this.mMethodName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Could not invoke " + this.mMethodName, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Could not invoke " + this.mMethodName, e4);
            }
        } else {
            throw new Error("processArguments failed");
        }
    }
}
