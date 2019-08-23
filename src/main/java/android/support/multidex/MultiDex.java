package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.taobao.android.dexposed.ClassUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

public final class MultiDex {
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
    private static final Set<File> installedApk = new HashSet();

    static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = 4;
        private final ElementConstructor elementConstructor;

        interface ElementConstructor {
            Object newInstance(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        static class ICSElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            ICSElementConstructor(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.elementConstructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.elementConstructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.elementConstructor.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        static class JBMR11ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR11ElementConstructor(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.elementConstructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.elementConstructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.elementConstructor.newInstance(new Object[]{file, file, dexFile});
            }
        }

        static class JBMR2ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR2ElementConstructor(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.elementConstructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.elementConstructor.setAccessible(true);
            }

            public Object newInstance(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.elementConstructor.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private V14() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                android.support.multidex.MultiDex$V14$ICSElementConstructor r1 = new android.support.multidex.MultiDex$V14$ICSElementConstructor     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                android.support.multidex.MultiDex$V14$JBMR11ElementConstructor r1 = new android.support.multidex.MultiDex$V14$JBMR11ElementConstructor     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                android.support.multidex.MultiDex$V14$JBMR2ElementConstructor r1 = new android.support.multidex.MultiDex$V14$JBMR2ElementConstructor
                r1.<init>(r0)
            L_0x001a:
                r2.elementConstructor = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.MultiDex.V14.<init>():void");
        }

        private Object[] makeDexElements(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            Object[] objArr = new Object[list.size()];
            for (int i = 0; i < objArr.length; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static String optimizedPathFor(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH) + ".dex").getPath();
        }

        static void install(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            Object[] makeDexElements = new V14().makeDexElements(list);
            try {
                MultiDex.expandFieldArray(obj, "dexElements", makeDexElements);
            } catch (NoSuchFieldException unused) {
                MultiDex.expandFieldArray(obj, "pathElements", makeDexElements);
            }
        }
    }

    static final class V19 {
        private V19() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                Field findField = MultiDex.findField(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) findField.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                findField.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    static final class V4 {
        private V4() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field findField = MultiDex.findField(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) findField.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            findField.set(classLoader, sb.toString());
            MultiDex.expandFieldArray(classLoader, "mPaths", strArr);
            MultiDex.expandFieldArray(classLoader, "mFiles", fileArr);
            MultiDex.expandFieldArray(classLoader, "mZips", zipFileArr);
            MultiDex.expandFieldArray(classLoader, "mDexs", dexFileArr);
        }
    }

    private MultiDex() {
    }

    private static ApplicationInfo getApplicationInfo(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static void clearOldDexDir(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
                file.delete();
            }
        }
    }

    private static void mkdirChecked(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            file.getParentFile();
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    public static void install(Context context) {
        if (!IS_VM_MULTIDEX_CAPABLE) {
            if (Build.VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo applicationInfo = getApplicationInfo(context);
                    if (applicationInfo != null) {
                        doInstallation(context, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
                }
            } else {
                throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4" + ClassUtils.PACKAGE_SEPARATOR);
            }
        }
    }

    static boolean isVMMultidexCapable(String str) {
        String str2;
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(str);
        if (z) {
            str2 = " has multidex support";
        } else {
            str2 = " does not have multidex support";
        }
        sb.append(str2);
        return z;
    }

    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static void installInstrumentation(Context context, Context context2) {
        String str;
        if (!IS_VM_MULTIDEX_CAPABLE) {
            if (Build.VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo applicationInfo = getApplicationInfo(context);
                    if (applicationInfo != null) {
                        ApplicationInfo applicationInfo2 = getApplicationInfo(context2);
                        if (applicationInfo2 != null) {
                            File file = new File(applicationInfo2.dataDir);
                            File file2 = new File(applicationInfo.sourceDir);
                            doInstallation(context2, file2, file, str + "secondary-dexes", str, false);
                            doInstallation(context2, new File(applicationInfo2.sourceDir), file, "secondary-dexes", "", false);
                        }
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
                }
            } else {
                throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is 4" + ClassUtils.PACKAGE_SEPARATOR);
            }
        }
    }

    private static void installSecondaryDexes(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 19) {
                V19.install(classLoader, list, file);
            } else if (Build.VERSION.SDK_INT >= 14) {
                V14.install(classLoader, list);
            } else {
                V4.install(classLoader, list);
            }
        }
    }

    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    private static File getDexDir(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            mkdirChecked(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            mkdirChecked(file2);
        }
        File file3 = new File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    public static Method findMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0042 A[SYNTHETIC, Splitter:B:32:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0044 A[Catch:{ RuntimeException -> 0x004b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void doInstallation(android.content.Context r3, java.io.File r4, java.io.File r5, java.lang.String r6, java.lang.String r7, boolean r8) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = installedApk
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = installedApk     // Catch:{ all -> 0x004d }
            boolean r1 = r1.contains(r4)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = installedApk     // Catch:{ all -> 0x004d }
            r1.add(r4)     // Catch:{ all -> 0x004d }
            java.lang.ClassLoader r1 = r3.getClassLoader()     // Catch:{ RuntimeException -> 0x004b }
            if (r1 != 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x001a:
            clearOldDexDir(r3)     // Catch:{ Throwable -> 0x001d }
        L_0x001d:
            java.io.File r5 = getDexDir(r3, r5, r6)     // Catch:{ all -> 0x004d }
            android.support.multidex.MultiDexExtractor r6 = new android.support.multidex.MultiDexExtractor     // Catch:{ all -> 0x004d }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x004d }
            r4 = 0
            r2 = 0
            java.util.List r2 = r6.load(r3, r7, r2)     // Catch:{ all -> 0x0046 }
            installSecondaryDexes(r1, r5, r2)     // Catch:{ IOException -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r2 = move-exception
            if (r8 == 0) goto L_0x0045
            r8 = 1
            java.util.List r3 = r6.load(r3, r7, r8)     // Catch:{ all -> 0x0046 }
            installSecondaryDexes(r1, r5, r3)     // Catch:{ all -> 0x0046 }
        L_0x003b:
            r6.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r4 = move-exception
        L_0x0040:
            if (r4 != 0) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x0044:
            throw r4     // Catch:{ all -> 0x004d }
        L_0x0045:
            throw r2     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r3     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.MultiDex.doInstallation(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }
}
