package com.bytedance.crash.a;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private String f19339a;

    public e(String str) {
        this.f19339a = str;
    }

    public final List<String> a(String str, long j) {
        File file;
        File[] fileArr;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            File file2 = new File(str);
            File file3 = null;
            if (!file2.exists() || file2.listFiles() == null) {
                file = null;
            } else {
                File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                file = null;
                File file4 = null;
                int i = 0;
                long j2 = 0;
                long j3 = 0;
                while (i < length) {
                    File file5 = listFiles[i];
                    String name = file5.getName();
                    if (name.endsWith(".hot")) {
                        if (this.f19339a.contains(":")) {
                            fileArr = listFiles;
                            str2 = this.f19339a.replace(":", "-");
                        } else {
                            fileArr = listFiles;
                            str2 = this.f19339a;
                        }
                        if (name.contains(str2)) {
                            String[] split = name.split("_");
                            if (split != null && split.length >= 4) {
                                long parseLong = Long.parseLong(split[3]);
                                if (j <= 0 || parseLong <= j) {
                                    if (j2 < parseLong) {
                                        file4 = file;
                                        j3 = j2;
                                        file = file5;
                                        j2 = parseLong;
                                        i++;
                                        listFiles = fileArr;
                                    } else {
                                        if (j3 < parseLong) {
                                            j3 = parseLong;
                                        } else {
                                            file5 = file4;
                                        }
                                        file4 = file5;
                                    }
                                }
                            } else if (split != null && split.length > 1) {
                                long parseLong2 = Long.parseLong(split[0]);
                                if (j <= 0 || parseLong2 <= j) {
                                    if (j2 < parseLong2) {
                                        file4 = file;
                                        j3 = j2;
                                        file = file5;
                                        j2 = parseLong2;
                                    } else if (j3 < parseLong2) {
                                        j3 = parseLong2;
                                        file4 = file5;
                                    }
                                    i++;
                                    listFiles = fileArr;
                                } else {
                                    i++;
                                    listFiles = fileArr;
                                }
                            }
                        }
                    } else {
                        fileArr = listFiles;
                    }
                    i++;
                    listFiles = fileArr;
                }
                file3 = file4;
            }
            if (file3 != null) {
                arrayList.add(file3.getAbsolutePath());
            }
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
