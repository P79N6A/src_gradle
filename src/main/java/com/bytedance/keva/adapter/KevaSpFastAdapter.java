package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class KevaSpFastAdapter implements SharedPreferences {
    public static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();
    public File mBackupFile;
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = new ArrayMap();
    public File mFile;
    public Keva mKeva;

    public class Editor implements SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = new ArrayMap();

        public SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        public void apply() {
            KevaSpFastAdapter.sApplyExecutor.execute(new Runnable() {
                public void run() {
                    Editor.this.commit();
                }
            });
        }

        public boolean commit() {
            doWriteKeva(this.mTempMap, this.mClear);
            final Map<String, ?> all = KevaSpFastAdapter.this.mKeva.getAll();
            if (KevaSpFastAdapter.this.mFile != null) {
                KevaSpFastAdapter.sWriterExecutor.execute(new Runnable() {
                    public void run() {
                        Editor.this.doWriteSp(all);
                    }
                });
            }
            this.mTempMap = new ArrayMap();
            if (this.mClear) {
                this.mClear = false;
            }
            return true;
        }

        public Editor() {
        }

        public SharedPreferences.Editor remove(String str) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, this);
            }
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r2.this$0.mFile.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r2.this$0.mFile.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            throw r3;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x004a, B:23:0x0056] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0056=Splitter:B:23:0x0056, B:16:0x004a=Splitter:B:16:0x004a} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void doWriteSp(java.util.Map<java.lang.String, java.lang.Object> r3) {
            /*
                r2 = this;
                com.bytedance.keva.adapter.KevaSpFastAdapter r0 = com.bytedance.keva.adapter.KevaSpFastAdapter.this
                java.io.File r0 = r0.mBackupFile
                boolean r0 = r0.exists()
                com.bytedance.keva.adapter.KevaSpFastAdapter r1 = com.bytedance.keva.adapter.KevaSpFastAdapter.this
                java.io.File r1 = r1.mFile
                boolean r1 = r1.exists()
                if (r1 == 0) goto L_0x0027
                if (r0 != 0) goto L_0x0020
                com.bytedance.keva.adapter.KevaSpFastAdapter r0 = com.bytedance.keva.adapter.KevaSpFastAdapter.this
                java.io.File r0 = r0.mFile
                com.bytedance.keva.adapter.KevaSpFastAdapter r1 = com.bytedance.keva.adapter.KevaSpFastAdapter.this
                java.io.File r1 = r1.mBackupFile
                r0.renameTo(r1)
                goto L_0x0027
            L_0x0020:
                com.bytedance.keva.adapter.KevaSpFastAdapter r0 = com.bytedance.keva.adapter.KevaSpFastAdapter.this
                java.io.File r0 = r0.mFile
                r0.delete()
            L_0x0027:
                com.bytedance.keva.adapter.KevaSpFastAdapter r0 = com.bytedance.keva.adapter.KevaSpFastAdapter.this
                java.io.File r0 = r0.mFile
                java.io.FileOutputStream r0 = com.bytedance.keva.adapter.KevaSpFastAdapter.createFileOutputStream(r0)
                if (r0 != 0) goto L_0x0032
                return
            L_0x0032:
                com.bytedance.keva.adapter.xml.XmlUtils.writeMapXml(r3, r0)     // Catch:{ IOException -> 0x0056, XmlPullParserException -> 0x004a }
                java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ IOException -> 0x0056, XmlPullParserException -> 0x004a }
                r3.sync()     // Catch:{ IOException -> 0x0056, XmlPullParserException -> 0x004a }
                com.bytedance.keva.adapter.KevaSpFastAdapter r3 = com.bytedance.keva.adapter.KevaSpFastAdapter.this     // Catch:{ IOException -> 0x0056, XmlPullParserException -> 0x004a }
                java.io.File r3 = r3.mBackupFile     // Catch:{ IOException -> 0x0056, XmlPullParserException -> 0x004a }
                r3.delete()     // Catch:{ IOException -> 0x0056, XmlPullParserException -> 0x004a }
                r0.close()     // Catch:{ IOException -> 0x0047 }
                return
            L_0x0047:
                return
            L_0x0048:
                r3 = move-exception
                goto L_0x0062
            L_0x004a:
                com.bytedance.keva.adapter.KevaSpFastAdapter r3 = com.bytedance.keva.adapter.KevaSpFastAdapter.this     // Catch:{ all -> 0x0048 }
                java.io.File r3 = r3.mFile     // Catch:{ all -> 0x0048 }
                r3.delete()     // Catch:{ all -> 0x0048 }
                r0.close()     // Catch:{ IOException -> 0x0055 }
                return
            L_0x0055:
                return
            L_0x0056:
                com.bytedance.keva.adapter.KevaSpFastAdapter r3 = com.bytedance.keva.adapter.KevaSpFastAdapter.this     // Catch:{ all -> 0x0048 }
                java.io.File r3 = r3.mFile     // Catch:{ all -> 0x0048 }
                r3.delete()     // Catch:{ all -> 0x0048 }
                r0.close()     // Catch:{ IOException -> 0x0061 }
                return
            L_0x0061:
                return
            L_0x0062:
                r0.close()     // Catch:{ IOException -> 0x0065 }
            L_0x0065:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.adapter.KevaSpFastAdapter.Editor.doWriteSp(java.util.Map):void");
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, str2);
            }
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, set);
            }
            return this;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f2) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Float.valueOf(f2));
            }
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            synchronized (this.mTempMap) {
                this.mTempMap.put(str, Long.valueOf(j));
            }
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpFastAdapter.this.mKeva.clear();
            }
            synchronized (map) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    if (value == null) {
                        KevaSpFastAdapter.this.mKeva.erase(str);
                    }
                    if (value instanceof Integer) {
                        KevaSpFastAdapter.this.mKeva.storeInt(str, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpFastAdapter.this.mKeva.storeBoolean(str, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpFastAdapter.this.mKeva.storeString(str, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpFastAdapter.this.mKeva.storeLong(str, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpFastAdapter.this.mKeva.storeFloat(str, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpFastAdapter.this.mKeva.storeStringSet(str, (Set) value);
                    } else {
                        KevaSpFastAdapter.this.mKeva.erase(str);
                    }
                }
            }
        }
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    public SharedPreferences.Editor edit() {
        return new Editor();
    }

    public Map<String, ?> getAll() {
        return this.mKeva.getAll();
    }

    public boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    private KevaSpFastAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        AnonymousClass1 r0 = new Keva.OnChangeListener() {
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpFastAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r0);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r0);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    public static FileOutputStream createFileOutputStream(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
                fileOutputStream = null;
            }
        }
        return fileOutputStream;
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    public float getFloat(String str, float f2) {
        return this.mKeva.getFloat(str, f2);
    }

    public int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    public String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpFastAdapter getSharedPreferences(Context context, String str, boolean z) {
        KevaSpFastAdapter kevaSpFastAdapter = new KevaSpFastAdapter(Keva.getRepoFromSp(context, str, 0));
        if (z) {
            File filesDir = context.getFilesDir();
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            String parent = filesDir.getParent();
            kevaSpFastAdapter.mFile = new File(parent, "shared_prefs/" + str + ".xml");
            kevaSpFastAdapter.mBackupFile = new File(kevaSpFastAdapter.mFile.getPath() + ".bak");
        }
        return kevaSpFastAdapter;
    }
}
