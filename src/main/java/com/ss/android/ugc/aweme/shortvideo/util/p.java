package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.google.common.a.f;
import com.google.common.collect.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.core.e;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71195a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f71196b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f71197c = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/DCIM/Camera/");

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, f71195a, true, 80940, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, f71195a, true, 80940, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.a(new Runnable(true) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71198a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f71198a, false, 80969, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f71198a, false, 80969, new Class[0], Void.TYPE);
                    return;
                }
                n.a("aweme_clean_cached_files", c.a().a("force", Boolean.FALSE).b());
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, p.f71195a, true, 80941, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, p.f71195a, true, 80941, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!p.f71196b) {
                    IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
                    File file = new File(shortVideoConfig.shortVideoRootDir());
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null && listFiles.length != 0) {
                            if (z || b.d(shortVideoConfig.shortVideoRootDir()) >= 52428800) {
                                p.f71196b = true;
                                p.a(listFiles, p.a());
                                p.f71196b = false;
                            }
                        }
                    }
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.io.File[] r19, java.util.Set<java.lang.String> r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f71195a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.File[]> r4 = java.io.File[].class
            r8[r10] = r4
            java.lang.Class<java.util.Set> r4 = java.util.Set.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 80943(0x13c2f, float:1.13425E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f71195a
            r15 = 1
            r16 = 80943(0x13c2f, float:1.13425E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.File[]> r1 = java.io.File[].class
            r0[r10] = r1
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            if (r0 == 0) goto L_0x00d6
            int r2 = r0.length
            if (r2 != 0) goto L_0x004c
            goto L_0x00d6
        L_0x004c:
            int r2 = r0.length
        L_0x004d:
            if (r10 >= r2) goto L_0x00d5
            r3 = r0[r10]
            boolean r4 = f71196b
            if (r4 != 0) goto L_0x0056
            return
        L_0x0056:
            if (r3 == 0) goto L_0x00d1
            boolean r4 = r3.exists()
            if (r4 == 0) goto L_0x00d1
            java.lang.String r4 = r3.getAbsolutePath()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0069
            return
        L_0x0069:
            boolean r5 = r3.isFile()
            if (r5 == 0) goto L_0x00a9
            boolean r3 = r1.contains(r4)
            if (r3 != 0) goto L_0x00d1
            java.lang.String r3 = ".mp4"
            boolean r3 = r4.endsWith(r3)
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = ".mp3"
            boolean r3 = r4.endsWith(r3)
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = ".wav"
            boolean r3 = r4.endsWith(r3)
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = "-concat-v"
            boolean r3 = r4.endsWith(r3)
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = "-concat-a"
            boolean r3 = r4.endsWith(r3)
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = "_synthetise"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L_0x00d1
        L_0x00a5:
            com.ss.android.ugc.aweme.video.b.c((java.lang.String) r4)
            goto L_0x00d1
        L_0x00a9:
            java.lang.String r4 = r3.getName()
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x00d1
            java.lang.String r4 = r3.getAbsolutePath()
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L_0x00d1
            java.io.File[] r4 = r3.listFiles()
            a((java.io.File[]) r4, (java.util.Set) r1)
            long r4 = r3.length()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00d1
            r3.delete()
        L_0x00d1:
            int r10 = r10 + 1
            goto L_0x004d
        L_0x00d5:
            return
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.p.a(java.io.File[], java.util.Set):void");
    }

    private static void a(File file, List<File> list) {
        File file2 = file;
        List<File> list2 = list;
        if (PatchProxy.isSupport(new Object[]{file2, list2}, null, f71195a, true, 80951, new Class[]{File.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file2, list2}, null, f71195a, true, 80951, new Class[]{File.class, List.class}, Void.TYPE);
        } else if (file2 != null) {
            if (file.isFile()) {
                list2.add(file2);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File a2 : listFiles) {
                    a(a2, list2);
                }
            }
        }
    }

    private static void a(List<File> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f71195a, true, 80954, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, null, f71195a, true, 80954, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null && list.size() > 0) {
            for (File next : list) {
                if (next != null && next.exists()) {
                    next.delete();
                }
            }
        }
    }

    public static Set<String> a() {
        if (PatchProxy.isSupport(new Object[0], null, f71195a, true, 80942, new Class[0], Set.class)) {
            return (Set) PatchProxy.accessDispatch(new Object[0], null, f71195a, true, 80942, new Class[0], Set.class);
        }
        List<com.ss.android.ugc.aweme.draft.a.c> queryAllDraftList = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryAllDraftList();
        HashSet hashSet = new HashSet();
        for (com.ss.android.ugc.aweme.draft.a.c next : queryAllDraftList) {
            if (next != null) {
                if (!TextUtils.isEmpty(next.f())) {
                    hashSet.add(new File(next.f()).getAbsolutePath());
                    String md5Hex = DigestUtils.md5Hex(next.f());
                    if (!TextUtils.isEmpty(md5Hex)) {
                        hashSet.add(md5Hex);
                    }
                }
                if (!TextUtils.isEmpty(next.i)) {
                    hashSet.add(new File(next.i).getAbsolutePath());
                }
                if (!TextUtils.isEmpty(next.h)) {
                    hashSet.add(new File(next.h).getAbsolutePath());
                }
                if (!TextUtils.isEmpty(next.p)) {
                    hashSet.add(new File(next.p).getAbsolutePath());
                }
                if (!TextUtils.isEmpty(next.M)) {
                    hashSet.add(new File(next.M).getAbsolutePath());
                }
                if (next.H() != null && !TextUtils.isEmpty(next.H().mvResUnzipPath)) {
                    hashSet.add(new File(next.H().mvResUnzipPath).getAbsolutePath());
                }
            }
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        hashSet.add(new File(f71197c).getAbsolutePath());
        hashSet.add(new File(iAVService.shortVideoConfig().tempDir()).getAbsolutePath());
        hashSet.add(Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + e.F().getPackageName() + "/files/splashad");
        StringBuilder sb = new StringBuilder();
        sb.append(b.c(GlobalContext.getContext()).getPath());
        sb.append("/LiveWallpaper");
        hashSet.add(sb.toString());
        hashSet.addAll(iAVService.gatherFilesToBeUploaded(GlobalContext.getContext()));
        Collection a2 = m.a((Collection<F>) hashSet, (f<? super F, T>) new f<String, String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71200a;

            public final /* synthetic */ Object apply(Object obj) {
                String str = (String) obj;
                if (!PatchProxy.isSupport(new Object[]{str}, this, f71200a, false, 80970, new Class[]{String.class}, String.class)) {
                    return str.replaceFirst("/data/data/", "/data/user/0/");
                }
                return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f71200a, false, 80970, new Class[]{String.class}, String.class);
            }
        });
        Collection a3 = m.a((Collection<F>) hashSet, (f<? super F, T>) new f<String, String>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71201a;

            public final /* synthetic */ Object apply(Object obj) {
                String str = (String) obj;
                if (!PatchProxy.isSupport(new Object[]{str}, this, f71201a, false, 80971, new Class[]{String.class}, String.class)) {
                    return str.replaceFirst("/data/user/0/", "/data/data/");
                }
                return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f71201a, false, 80971, new Class[]{String.class}, String.class);
            }
        });
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
        hashSet2.addAll(a2);
        hashSet2.addAll(a3);
        return hashSet2;
    }

    private static String b(Context context) {
        String str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80957, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80957, new Class[]{Context.class}, String.class);
        } else if (context2 == null) {
            return "";
        } else {
            if (context2.getExternalFilesDir(null) == null) {
                str = Environment.getExternalStorageDirectory().getPath();
            } else {
                str = context2.getExternalFilesDir(null).getPath();
            }
            return str + "/share/";
        }
    }

    private static List<File> b(File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f71195a, true, 80949, new Class[]{File.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{file2}, null, f71195a, true, 80949, new Class[]{File.class}, List.class);
        } else if (!file.exists()) {
            return Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            List<File> a2 = a(file2.listFiles(s.f71208b), 4);
            if (a2 != null) {
                arrayList.addAll(a2);
            }
            IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
            List<File> a3 = a(file2.listFiles(new t(shortVideoConfig)), 2);
            if (a3 != null) {
                arrayList.addAll(a3);
            }
            List<File> a4 = a(file2.listFiles(new u(shortVideoConfig)), 2);
            if (a4 != null) {
                arrayList.addAll(a4);
            }
            List<File> a5 = a(file2.listFiles(v.f71214b), 2);
            if (a5 != null) {
                arrayList.addAll(a5);
            }
            File file3 = new File(com.ss.android.ugc.b.c.a().b());
            if (file3.exists() && a(file3, 4) != null) {
                arrayList.addAll(a5);
            }
            return arrayList;
        }
    }

    private static void b(List<File> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f71195a, true, 80955, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, null, f71195a, true, 80955, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && list.size() > 0) {
            Set<String> a2 = a();
            for (File next : list) {
                if (next != null && next.exists() && !a2.contains(next.getAbsolutePath())) {
                    next.delete();
                }
            }
        }
    }

    public static void a(Context context) {
        List list;
        String str;
        String str2;
        String str3;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80956, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80956, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        f71196b = false;
        if (context2 != null && !f71196b) {
            f71196b = true;
            if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80944, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80944, new Class[]{Context.class}, Void.TYPE);
            } else if (context2 != null) {
                if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80960, new Class[]{Context.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80960, new Class[]{Context.class}, String.class);
                } else {
                    str = b(context) + "out/";
                }
                File file = new File(str);
                if (file.exists()) {
                    a(a(file, 2));
                    if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80958, new Class[]{Context.class}, String.class)) {
                        str2 = (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80958, new Class[]{Context.class}, String.class);
                    } else {
                        str2 = b(context) + "tmp/";
                    }
                    a(a(new File(str2), 2));
                    if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80959, new Class[]{Context.class}, String.class)) {
                        str3 = (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80959, new Class[]{Context.class}, String.class);
                    } else {
                        str3 = b(context) + "pic/";
                    }
                    a(a(new File(str3), 2));
                }
            }
            if (PatchProxy.isSupport(new Object[0], null, f71195a, true, 80945, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f71195a, true, 80945, new Class[0], Void.TYPE);
            } else {
                File file2 = new File(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir());
                if (file2.exists()) {
                    a(a(file2.listFiles(q.f71204b), 4));
                    b(a(file2.listFiles(r.f71206b), 2));
                }
            }
            if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80946, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80946, new Class[]{Context.class}, Void.TYPE);
            } else {
                ArrayList arrayList = new ArrayList();
                if (!(context2 == null || context.getFilesDir() == null)) {
                    arrayList.addAll(b(context.getFilesDir()));
                }
                if (!(context2 == null || context2.getExternalFilesDir(null) == null)) {
                    arrayList.addAll(b(context2.getExternalFilesDir(null)));
                }
                if (PatchProxy.isSupport(new Object[0], null, f71195a, true, 80950, new Class[0], List.class)) {
                    list = (List) PatchProxy.accessDispatch(new Object[0], null, f71195a, true, 80950, new Class[0], List.class);
                } else {
                    File parentFile = new File(fg.o).getParentFile();
                    ArrayList arrayList2 = new ArrayList();
                    if (parentFile != null && parentFile.exists()) {
                        ArrayList arrayList3 = new ArrayList();
                        a(parentFile, (List<File>) arrayList3);
                        arrayList2.addAll(arrayList3);
                    }
                    File file3 = new File(fg.z);
                    if (file3.exists()) {
                        ArrayList arrayList4 = new ArrayList();
                        a(file3, (List<File>) arrayList4);
                        arrayList2.addAll(arrayList4);
                    }
                    list = arrayList2;
                }
                arrayList.addAll(list);
                b((List<File>) arrayList);
            }
            if (PatchProxy.isSupport(new Object[]{context2}, null, f71195a, true, 80947, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, f71195a, true, 80947, new Class[]{Context.class}, Void.TYPE);
            } else {
                if (!(context2 == null || context.getFilesDir() == null)) {
                    a(context.getFilesDir());
                }
                if (!(context2 == null || context2.getExternalFilesDir(null) == null)) {
                    a(context2.getExternalFilesDir(null));
                }
            }
            f71196b = false;
        }
    }

    private static void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f71195a, true, 80948, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, null, f71195a, true, 80948, new Class[]{File.class}, Void.TYPE);
            return;
        }
        File file2 = new File(file.getAbsolutePath() + File.separator + "cache");
        if (file2.exists()) {
            File[] listFiles = file2.listFiles(new FileFilter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71202a;

                public final boolean accept(File file) {
                    if (PatchProxy.isSupport(new Object[]{file}, this, f71202a, false, 80972, new Class[]{File.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f71202a, false, 80972, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
                    } else if (file == null || !file.getName().endsWith("-concat-v")) {
                        return false;
                    } else {
                        return true;
                    }
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                b(a(listFiles, 2));
            }
        }
    }

    private static List<File> a(File file, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{file, Integer.valueOf(i)}, null, f71195a, true, 80952, new Class[]{File.class, Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{file, Integer.valueOf(i)}, null, f71195a, true, 80952, new Class[]{File.class, Integer.TYPE}, List.class);
        }
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, w.f71216b);
                if (asList.size() > i2) {
                    return asList.subList(0, asList.size() - i2);
                }
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.io.File> a(java.io.File[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f71195a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.File[]> r4 = java.io.File[].class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 80953(0x13c39, float:1.1344E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0050
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f71195a
            r15 = 1
            r16 = 80953(0x13c39, float:1.1344E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.File[]> r1 = java.io.File[].class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0050:
            if (r0 == 0) goto L_0x006e
            int r2 = r0.length
            if (r2 <= 0) goto L_0x006e
            java.util.List r0 = java.util.Arrays.asList(r19)
            java.util.Comparator r2 = com.ss.android.ugc.aweme.shortvideo.util.x.f71218b
            java.util.Collections.sort(r0, r2)
            int r2 = r0.size()
            if (r2 <= r1) goto L_0x006e
            int r2 = r0.size()
            int r2 = r2 - r1
            java.util.List r0 = r0.subList(r10, r2)
            return r0
        L_0x006e:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.p.a(java.io.File[], int):java.util.List");
    }
}
