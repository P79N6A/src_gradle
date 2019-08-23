package com.bytedance.boost_multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;

public abstract class DexLoader {
    ElementConstructor mElementConstructor;

    interface ElementConstructor {
        Object newInstance(File file, Object obj);
    }

    static class ICSElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        ICSElementConstructor(Class<?> cls) {
            this.mConstructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, null, obj});
        }
    }

    static class JBMR11ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        JBMR11ElementConstructor(Class<?> cls) {
            this.mConstructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, null, obj});
        }
    }

    static class JBMR2ElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        JBMR2ElementConstructor(Class<?> cls) {
            this.mConstructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, Boolean.FALSE, null, obj});
        }
    }

    static class KKElementConstructor implements ElementConstructor {
        private final Constructor<?> mConstructor;

        KKElementConstructor(Class<?> cls) {
            this.mConstructor = Utility.findConstructor(cls, File.class, Boolean.TYPE, File.class, DexFile.class);
            this.mConstructor.setAccessible(true);
        }

        public Object newInstance(File file, Object obj) {
            return this.mConstructor.newInstance(new Object[]{file, Boolean.FALSE, null, obj});
        }
    }

    static class V14 extends DexLoader {
        private V14() {
            JBMR11ElementConstructor jBMR11ElementConstructor;
            try {
                Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
                try {
                    jBMR11ElementConstructor = new ICSElementConstructor(cls);
                } catch (Exception unused) {
                    jBMR11ElementConstructor = null;
                }
                if (jBMR11ElementConstructor == null) {
                    try {
                        jBMR11ElementConstructor = new JBMR11ElementConstructor(cls);
                    } catch (Exception unused2) {
                    }
                }
                if (jBMR11ElementConstructor == null) {
                    try {
                        jBMR11ElementConstructor = new JBMR2ElementConstructor(cls);
                    } catch (Exception unused3) {
                    }
                }
                this.mElementConstructor = jBMR11ElementConstructor;
            } catch (Exception e2) {
                Monitor.get().logError("can not find DexPathList$Element", e2);
            }
        }
    }

    static class V19 extends DexLoader {
        private V19() {
            try {
                this.mElementConstructor = new KKElementConstructor(Class.forName("dalvik.system.DexPathList$Element"));
            } catch (Throwable th) {
                Monitor.get().logError("fail to get Element constructor", th);
            }
        }
    }

    DexLoader() {
    }

    static DexLoader create(int i) {
        if (i >= 19) {
            return new V19();
        }
        if (i >= 14) {
            return new V14();
        }
        throw new UnsupportedOperationException("only support SDK_INT >= 14, give up when < 14");
    }

    private Object[] makeDexElements(List<DexHolder> list, List<DexHolder> list2) {
        Object dexListElement;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            DexHolder dexHolder = list.get(i);
            while (true) {
                dexListElement = dexHolder.toDexListElement(this.mElementConstructor);
                while (dexListElement == null && dexHolder != null) {
                    Monitor monitor = Monitor.get();
                    monitor.logWarning("Load faster dex in holder " + dexHolder.toString());
                    dexHolder = dexHolder.toFasterHolder();
                    if (dexHolder != null) {
                        list2.add(dexHolder);
                    }
                }
            }
            if (dexListElement != null) {
                Monitor monitor2 = Monitor.get();
                monitor2.logInfo("Load dex in holder " + dexHolder.toString());
                list.set(i, dexHolder);
                arrayList.add(dexListElement);
                String obj = dexHolder.toString();
                Result.get().addDexInfo(obj);
                Monitor monitor3 = Monitor.get();
                monitor3.logInfo("Add info: " + obj);
                i++;
            } else {
                throw new RuntimeException("Fail to load dex, index is " + i);
            }
        }
        return arrayList.toArray();
    }

    /* access modifiers changed from: package-private */
    public void install(ClassLoader classLoader, List<DexHolder> list, List<DexHolder> list2) {
        Utility.expandFieldArray(Utility.findFieldRecursively(classLoader.getClass(), "pathList").get(classLoader), "dexElements", makeDexElements(list, list2));
    }
}
