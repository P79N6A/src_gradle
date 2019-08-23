package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;

public final class DynamiteModule {
    private static Boolean zzaSF;
    private static zzj zzaSG;
    private static zzl zzaSH;
    private static String zzaSI;
    private static final ThreadLocal<zza> zzaSJ = new ThreadLocal<>();
    private static final zzh zzaSK = new zza();
    public static final zzd zzaSL = new zzb();
    private static zzd zzaSM = new zzc();
    public static final zzd zzaSN = new zzd();
    public static final zzd zzaSO = new zze();
    public static final zzd zzaSP = new zzf();
    private final Context zzaSQ;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    static class zza {
        public Cursor zzaSR;

        private zza() {
        }

        /* synthetic */ zza(zza zza) {
            this();
        }
    }

    static class zzb implements zzh {
        private final int zzaSS;
        private final int zzaST;

        public zzb(int i, int i2) {
            this.zzaSS = i;
        }

        public final int zzE(Context context, String str) {
            return this.zzaSS;
        }

        public final int zzb(Context context, String str, boolean z) {
            return 0;
        }
    }

    public static class zzc extends Exception {
        private zzc(String str) {
            super(str);
        }

        /* synthetic */ zzc(String str, zza zza) {
            this(str);
        }

        private zzc(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ zzc(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    public interface zzd {
        zzi zza(Context context, String str, zzh zzh) throws zzc;
    }

    private DynamiteModule(Context context) {
        this.zzaSQ = (Context) zzbo.zzu(context);
    }

    public static int zzE(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            String valueOf = String.valueOf("com.google.android.gms.dynamite.descriptors.");
            String valueOf2 = String.valueOf("ModuleDescriptor");
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(valueOf2);
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!declaredField.get(null).equals(str)) {
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e2) {
            String valueOf3 = String.valueOf(e2.getMessage());
            if (valueOf3.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf3);
            } else {
                new String("Failed to load module descriptor class: ");
            }
            return 0;
        }
    }

    public static int zzF(Context context, String str) {
        return zzb(context, str, false);
    }

    private static DynamiteModule zzG(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        } else {
            new String("Selected local version of ");
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    private static Context zza(Context context, String str, int i, Cursor cursor, zzl zzl) {
        try {
            return (Context) zzn.zzE(zzl.zza(zzn.zzw(context), str, i, zzn.zzw(cursor)));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.toString());
            if (valueOf.length() != 0) {
                "Failed to load DynamiteLoader: ".concat(valueOf);
            } else {
                new String("Failed to load DynamiteLoader: ");
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1.zzaSR != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (r1.zzaSR != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule zza(android.content.Context r9, com.google.android.gms.dynamite.DynamiteModule.zzd r10, java.lang.String r11) throws com.google.android.gms.dynamite.DynamiteModule.zzc {
        /*
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r0 = zzaSJ
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.DynamiteModule$zza r0 = (com.google.android.gms.dynamite.DynamiteModule.zza) r0
            com.google.android.gms.dynamite.DynamiteModule$zza r1 = new com.google.android.gms.dynamite.DynamiteModule$zza
            r2 = 0
            r1.<init>(r2)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r3 = zzaSJ
            r3.set(r1)
            com.google.android.gms.dynamite.zzh r3 = zzaSK     // Catch:{ all -> 0x00e3 }
            com.google.android.gms.dynamite.zzi r3 = r10.zza(r9, r11, r3)     // Catch:{ all -> 0x00e3 }
            int r4 = r3.zzaSW     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x00b9
            int r4 = r3.zzaSW     // Catch:{ all -> 0x00e3 }
            r5 = -1
            if (r4 != r5) goto L_0x0026
            int r4 = r3.zzaSU     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x00b9
        L_0x0026:
            int r4 = r3.zzaSW     // Catch:{ all -> 0x00e3 }
            r6 = 1
            if (r4 != r6) goto L_0x002f
            int r4 = r3.zzaSV     // Catch:{ all -> 0x00e3 }
            if (r4 == 0) goto L_0x00b9
        L_0x002f:
            int r4 = r3.zzaSW     // Catch:{ all -> 0x00e3 }
            if (r4 != r5) goto L_0x0046
            com.google.android.gms.dynamite.DynamiteModule r9 = zzG(r9, r11)     // Catch:{ all -> 0x00e3 }
            android.database.Cursor r10 = r1.zzaSR
            if (r10 == 0) goto L_0x0040
        L_0x003b:
            android.database.Cursor r10 = r1.zzaSR
            r10.close()
        L_0x0040:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r10 = zzaSJ
            r10.set(r0)
            return r9
        L_0x0046:
            int r4 = r3.zzaSW     // Catch:{ all -> 0x00e3 }
            if (r4 != r6) goto L_0x009e
            int r4 = r3.zzaSV     // Catch:{ zzc -> 0x005f }
            com.google.android.gms.dynamite.DynamiteModule r4 = zza((android.content.Context) r9, (java.lang.String) r11, (int) r4)     // Catch:{ zzc -> 0x005f }
            android.database.Cursor r9 = r1.zzaSR
            if (r9 == 0) goto L_0x0059
            android.database.Cursor r9 = r1.zzaSR
            r9.close()
        L_0x0059:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r9 = zzaSJ
            r9.set(r0)
            return r4
        L_0x005f:
            r4 = move-exception
            java.lang.String r6 = "Failed to load remote module: "
            java.lang.String r7 = r4.getMessage()     // Catch:{ all -> 0x00e3 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00e3 }
            int r8 = r7.length()     // Catch:{ all -> 0x00e3 }
            if (r8 == 0) goto L_0x0074
            r6.concat(r7)     // Catch:{ all -> 0x00e3 }
            goto L_0x0079
        L_0x0074:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x00e3 }
            r7.<init>(r6)     // Catch:{ all -> 0x00e3 }
        L_0x0079:
            int r6 = r3.zzaSU     // Catch:{ all -> 0x00e3 }
            if (r6 == 0) goto L_0x0096
            com.google.android.gms.dynamite.DynamiteModule$zzb r6 = new com.google.android.gms.dynamite.DynamiteModule$zzb     // Catch:{ all -> 0x00e3 }
            int r3 = r3.zzaSU     // Catch:{ all -> 0x00e3 }
            r7 = 0
            r6.<init>(r3, r7)     // Catch:{ all -> 0x00e3 }
            com.google.android.gms.dynamite.zzi r10 = r10.zza(r9, r11, r6)     // Catch:{ all -> 0x00e3 }
            int r10 = r10.zzaSW     // Catch:{ all -> 0x00e3 }
            if (r10 != r5) goto L_0x0096
            com.google.android.gms.dynamite.DynamiteModule r9 = zzG(r9, r11)     // Catch:{ all -> 0x00e3 }
            android.database.Cursor r10 = r1.zzaSR
            if (r10 == 0) goto L_0x0040
            goto L_0x003b
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$zzc r9 = new com.google.android.gms.dynamite.DynamiteModule$zzc     // Catch:{ all -> 0x00e3 }
            java.lang.String r10 = "Remote load failed. No local fallback found."
            r9.<init>(r10, r4, r2)     // Catch:{ all -> 0x00e3 }
            throw r9     // Catch:{ all -> 0x00e3 }
        L_0x009e:
            com.google.android.gms.dynamite.DynamiteModule$zzc r9 = new com.google.android.gms.dynamite.DynamiteModule$zzc     // Catch:{ all -> 0x00e3 }
            int r10 = r3.zzaSW     // Catch:{ all -> 0x00e3 }
            r11 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r3.<init>(r11)     // Catch:{ all -> 0x00e3 }
            java.lang.String r11 = "VersionPolicy returned invalid code:"
            r3.append(r11)     // Catch:{ all -> 0x00e3 }
            r3.append(r10)     // Catch:{ all -> 0x00e3 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00e3 }
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.zza) r2)     // Catch:{ all -> 0x00e3 }
            throw r9     // Catch:{ all -> 0x00e3 }
        L_0x00b9:
            com.google.android.gms.dynamite.DynamiteModule$zzc r9 = new com.google.android.gms.dynamite.DynamiteModule$zzc     // Catch:{ all -> 0x00e3 }
            int r10 = r3.zzaSU     // Catch:{ all -> 0x00e3 }
            int r11 = r3.zzaSV     // Catch:{ all -> 0x00e3 }
            r3 = 91
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r4.<init>(r3)     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = "No acceptable module found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x00e3 }
            r4.append(r10)     // Catch:{ all -> 0x00e3 }
            java.lang.String r10 = " and remote version is "
            r4.append(r10)     // Catch:{ all -> 0x00e3 }
            r4.append(r11)     // Catch:{ all -> 0x00e3 }
            java.lang.String r10 = "."
            r4.append(r10)     // Catch:{ all -> 0x00e3 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x00e3 }
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.zza) r2)     // Catch:{ all -> 0x00e3 }
            throw r9     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r9 = move-exception
            android.database.Cursor r10 = r1.zzaSR
            if (r10 == 0) goto L_0x00ed
            android.database.Cursor r10 = r1.zzaSR
            r10.close()
        L_0x00ed:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r10 = zzaSJ
            r10.set(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$zzd, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule zza(Context context, String str, int i) throws zzc {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = zzaSF;
        }
        if (bool != null) {
            return bool.booleanValue() ? zzc(context, str, i) : zzb(context, str, i);
        }
        throw new zzc("Failed to determine which loading route to use.", (zza) null);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(java.lang.ClassLoader r3) throws com.google.android.gms.dynamite.DynamiteModule.zzc {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            if (r3 != 0) goto L_0x001a
            r3 = r0
            goto L_0x002e
        L_0x001a:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.zzl     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            if (r2 == 0) goto L_0x0028
            r3 = r1
            com.google.android.gms.dynamite.zzl r3 = (com.google.android.gms.dynamite.zzl) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            goto L_0x002e
        L_0x0028:
            com.google.android.gms.dynamite.zzm r1 = new com.google.android.gms.dynamite.zzm     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            r1.<init>(r3)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            r3 = r1
        L_0x002e:
            zzaSH = r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0031 }
            return
        L_0x0031:
            r3 = move-exception
            com.google.android.gms.dynamite.DynamiteModule$zzc r1 = new com.google.android.gms.dynamite.DynamiteModule$zzc
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(java.lang.ClassLoader):void");
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.IInterface] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.zzj zzaT(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.zzj r1 = zzaSG     // Catch:{ all -> 0x0069 }
            if (r1 == 0) goto L_0x000b
            com.google.android.gms.dynamite.zzj r4 = zzaSG     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x000b:
            com.google.android.gms.common.zze r1 = com.google.android.gms.common.zze.zzoW()     // Catch:{ all -> 0x0069 }
            int r1 = r1.isGooglePlayServicesAvailable(r4)     // Catch:{ all -> 0x0069 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0018:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x004d }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x004d }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r1)     // Catch:{ Exception -> 0x004d }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x004d }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x004d }
            if (r4 != 0) goto L_0x0033
            r4 = r2
            goto L_0x0047
        L_0x0033:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)     // Catch:{ Exception -> 0x004d }
            boolean r3 = r1 instanceof com.google.android.gms.dynamite.zzj     // Catch:{ Exception -> 0x004d }
            if (r3 == 0) goto L_0x0041
            r4 = r1
            com.google.android.gms.dynamite.zzj r4 = (com.google.android.gms.dynamite.zzj) r4     // Catch:{ Exception -> 0x004d }
            goto L_0x0047
        L_0x0041:
            com.google.android.gms.dynamite.zzk r1 = new com.google.android.gms.dynamite.zzk     // Catch:{ Exception -> 0x004d }
            r1.<init>(r4)     // Catch:{ Exception -> 0x004d }
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x0067
            zzaSG = r4     // Catch:{ Exception -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r4
        L_0x004d:
            r4 = move-exception
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0069 }
            int r3 = r4.length()     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0062
            r1.concat(r4)     // Catch:{ all -> 0x0069 }
            goto L_0x0067
        L_0x0062:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0069 }
            r4.<init>(r1)     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r2
        L_0x0069:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzaT(android.content.Context):com.google.android.gms.dynamite.zzj");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:39|40) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0099, code lost:
        return zzd(r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009a, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        r8 = java.lang.String.valueOf(r8.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a9, code lost:
        if (r8.length() != 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ab, code lost:
        "Failed to retrieve remote module version: ".concat(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00af, code lost:
        new java.lang.String("Failed to retrieve remote module version: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b5, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ba, code lost:
        return zzc(r8, r9, r10);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0095 A[SYNTHETIC, Splitter:B:53:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:17:0x0035=Splitter:B:17:0x0035, B:34:0x0079=Splitter:B:34:0x0079} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzb(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            java.lang.Boolean r1 = zzaSF     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x008e
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0087 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0032:
            zza(r4)     // Catch:{ zzc -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0087 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0050:
            int r4 = zzd(r8, r9, r10)     // Catch:{ zzc -> 0x007c }
            java.lang.String r5 = zzaSI     // Catch:{ zzc -> 0x007c }
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = zzaSI     // Catch:{ zzc -> 0x007c }
            boolean r5 = r5.isEmpty()     // Catch:{ zzc -> 0x007c }
            if (r5 == 0) goto L_0x0061
            goto L_0x0079
        L_0x0061:
            com.google.android.gms.dynamite.zzg r5 = new com.google.android.gms.dynamite.zzg     // Catch:{ zzc -> 0x007c }
            java.lang.String r6 = zzaSI     // Catch:{ zzc -> 0x007c }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ zzc -> 0x007c }
            r5.<init>(r6, r7)     // Catch:{ zzc -> 0x007c }
            zza(r5)     // Catch:{ zzc -> 0x007c }
            r2.set(r3, r5)     // Catch:{ zzc -> 0x007c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ zzc -> 0x007c }
            zzaSF = r5     // Catch:{ zzc -> 0x007c }
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r4
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return r4
        L_0x007c:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            r1 = r2
            goto L_0x008c
        L_0x0087:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            throw r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
        L_0x008a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00bb }
        L_0x008c:
            zzaSF = r1     // Catch:{ all -> 0x00bb }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00b6
            int r8 = zzd(r8, r9, r10)     // Catch:{ zzc -> 0x009a }
            return r8
        L_0x009a:
            r8 = move-exception
            java.lang.String r9 = "Failed to retrieve remote module version: "
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r8.length()
            if (r10 == 0) goto L_0x00af
            r9.concat(r8)
            goto L_0x00b4
        L_0x00af:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r9)
        L_0x00b4:
            r8 = 0
            return r8
        L_0x00b6:
            int r8 = zzc((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)
            return r8
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws zzc {
        zzj zzaT = zzaT(context);
        if (zzaT != null) {
            try {
                IObjectWrapper zza2 = zzaT.zza(zzn.zzw(context), str, i);
                if (zzn.zzE(zza2) != null) {
                    return new DynamiteModule((Context) zzn.zzE(zza2));
                }
                throw new zzc("Failed to load remote module.", (zza) null);
            } catch (RemoteException e2) {
                throw new zzc("Failed to load remote module.", e2, null);
            }
        } else {
            throw new zzc("Failed to create IDynamiteLoader.", (zza) null);
        }
    }

    private static int zzc(Context context, String str, boolean z) {
        zzj zzaT = zzaT(context);
        if (zzaT == null) {
            return 0;
        }
        try {
            return zzaT.zza(zzn.zzw(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            } else {
                new String("Failed to retrieve remote module version: ");
            }
            return 0;
        }
    }

    private static DynamiteModule zzc(Context context, String str, int i) throws zzc {
        zzl zzl;
        synchronized (DynamiteModule.class) {
            zzl = zzaSH;
        }
        if (zzl != null) {
            zza zza2 = zzaSJ.get();
            if (zza2 == null || zza2.zzaSR == null) {
                throw new zzc("No result cursor", (zza) null);
            }
            Context zza3 = zza(context.getApplicationContext(), str, i, zza2.zzaSR, zzl);
            if (zza3 != null) {
                return new DynamiteModule(zza3);
            }
            throw new zzc("Failed to get module context", (zza) null);
        }
        throw new zzc("DynamiteLoaderV2 was not cached.", (zza) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzd(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.zzc {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x000d
            java.lang.String r10 = "api_force_staging"
            goto L_0x000f
        L_0x0006:
            r8 = move-exception
            goto L_0x00ad
        L_0x0009:
            r8 = move-exception
            r9 = r0
            goto L_0x009e
        L_0x000d:
            java.lang.String r10 = "api"
        L_0x000f:
            java.lang.String r1 = "content://com.google.android.gms.chimera/"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            int r2 = r2 + 1
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            r3.append(r1)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            r3.append(r10)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            java.lang.String r10 = "/"
            r3.append(r10)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            r3.append(r9)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            java.lang.String r9 = r3.toString()     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0009, all -> 0x0006 }
            if (r8 == 0) goto L_0x0096
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            if (r9 == 0) goto L_0x0096
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            if (r9 <= 0) goto L_0x0087
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0084 }
            zzaSI = r1     // Catch:{ all -> 0x0084 }
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r10 = zzaSJ     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            com.google.android.gms.dynamite.DynamiteModule$zza r10 = (com.google.android.gms.dynamite.DynamiteModule.zza) r10     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            if (r10 == 0) goto L_0x0087
            android.database.Cursor r1 = r10.zzaSR     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            if (r1 != 0) goto L_0x0087
            r10.zzaSR = r8     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            r8 = r0
            goto L_0x0087
        L_0x0084:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0084 }
            throw r9     // Catch:{ Exception -> 0x0091, all -> 0x008d }
        L_0x0087:
            if (r8 == 0) goto L_0x008c
            r8.close()
        L_0x008c:
            return r9
        L_0x008d:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ad
        L_0x0091:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009e
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$zzc r9 = new com.google.android.gms.dynamite.DynamiteModule$zzc     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.zza) r0)     // Catch:{ Exception -> 0x0091, all -> 0x008d }
            throw r9     // Catch:{ Exception -> 0x0091, all -> 0x008d }
        L_0x009e:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch:{ all -> 0x00ab }
            if (r10 == 0) goto L_0x00a3
            throw r8     // Catch:{ all -> 0x00ab }
        L_0x00a3:
            com.google.android.gms.dynamite.DynamiteModule$zzc r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ab }
            throw r10     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r8 = move-exception
            r0 = r9
        L_0x00ad:
            if (r0 == 0) goto L_0x00b2
            r0.close()
        L_0x00b2:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzd(android.content.Context, java.lang.String, boolean):int");
    }

    public final IBinder zzcV(String str) throws zzc {
        try {
            return (IBinder) this.zzaSQ.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new zzc(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }

    public final Context zztC() {
        return this.zzaSQ;
    }
}
