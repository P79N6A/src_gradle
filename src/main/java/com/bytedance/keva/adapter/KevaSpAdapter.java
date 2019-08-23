package com.bytedance.keva.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class KevaSpAdapter implements SharedPreferences {
    public static final Executor sApplyExecutor = Executors.newCachedThreadPool();
    public static final Executor sWriterExecutor = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Keva.OnChangeListener> mChangeListenerMap = obtainMap();
    public Keva mKeva;
    public SharedPreferences mSp;

    public class Editor implements SharedPreferences.Editor {
        private boolean mClear;
        private Map<String, Object> mTempMap = KevaSpAdapter.obtainMap();

        public synchronized void apply() {
            KevaSpAdapter.sApplyExecutor.execute(new Runnable() {
                public void run() {
                    Editor.this.commit();
                }
            });
        }

        public synchronized SharedPreferences.Editor clear() {
            this.mClear = true;
            return this;
        }

        public synchronized boolean commit() {
            final Map<String, Object> map = this.mTempMap;
            final boolean z = this.mClear;
            if (KevaSpAdapter.this.mSp != null) {
                KevaSpAdapter.sWriterExecutor.execute(new Runnable() {
                    public void run() {
                        Editor.this.doWriteSp(map, z);
                    }
                });
            }
            doWriteKeva(map, z);
            this.mTempMap = KevaSpAdapter.obtainMap();
            if (this.mClear) {
                this.mClear = false;
            }
            return true;
        }

        public Editor() {
        }

        public synchronized SharedPreferences.Editor remove(String str) {
            this.mTempMap.put(str, this);
            return this;
        }

        public synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.mTempMap.put(str, Boolean.valueOf(z));
            return this;
        }

        public synchronized SharedPreferences.Editor putFloat(String str, float f2) {
            this.mTempMap.put(str, Float.valueOf(f2));
            return this;
        }

        public synchronized SharedPreferences.Editor putInt(String str, int i) {
            this.mTempMap.put(str, Integer.valueOf(i));
            return this;
        }

        public synchronized SharedPreferences.Editor putLong(String str, long j) {
            this.mTempMap.put(str, Long.valueOf(j));
            return this;
        }

        public synchronized SharedPreferences.Editor putString(String str, String str2) {
            this.mTempMap.put(str, str2);
            return this;
        }

        public synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.mTempMap.put(str, set);
            return this;
        }

        private void doWriteKeva(Map<String, Object> map, boolean z) {
            if (z) {
                KevaSpAdapter.this.mKeva.clear();
            }
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        KevaSpAdapter.this.mKeva.storeInt(str, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        KevaSpAdapter.this.mKeva.storeBoolean(str, ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        KevaSpAdapter.this.mKeva.storeString(str, (String) value);
                    } else if (value instanceof Long) {
                        KevaSpAdapter.this.mKeva.storeLong(str, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        KevaSpAdapter.this.mKeva.storeFloat(str, ((Float) value).floatValue());
                    } else if (value instanceof Set) {
                        KevaSpAdapter.this.mKeva.storeStringSet(str, (Set) value);
                    }
                }
                KevaSpAdapter.this.mKeva.erase(str);
            }
        }

        public void doWriteSp(Map<String, Object> map, boolean z) {
            SharedPreferences.Editor edit = KevaSpAdapter.this.mSp.edit();
            if (z) {
                edit.clear();
            }
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    edit.remove(str);
                } else if (value instanceof Integer) {
                    edit.putInt(str, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    edit.putString(str, (String) value);
                } else if (value instanceof Long) {
                    edit.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(str, ((Float) value).floatValue());
                } else if (value instanceof Set) {
                    edit.putStringSet(str, (Set) value);
                } else {
                    edit.remove(str);
                }
            }
            edit.commit();
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

    public synchronized Map<String, ?> getAll() {
        return this.mKeva.getAll();
    }

    public static Map obtainMap() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new ArrayMap();
        }
        return new HashMap();
    }

    private KevaSpAdapter(Keva keva) {
        this.mKeva = keva;
    }

    public synchronized boolean contains(String str) {
        return this.mKeva.contains(str);
    }

    public synchronized void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        AnonymousClass1 r0 = new Keva.OnChangeListener() {
            public void onChanged(Keva keva, String str) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(KevaSpAdapter.this, str);
            }
        };
        this.mKeva.registerChangeListener(r0);
        this.mChangeListenerMap.put(onSharedPreferenceChangeListener, r0);
    }

    public synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mKeva.unRegisterChangeListener(this.mChangeListenerMap.remove(onSharedPreferenceChangeListener));
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        return this.mKeva.getBoolean(str, z);
    }

    public synchronized float getFloat(String str, float f2) {
        return this.mKeva.getFloat(str, f2);
    }

    public synchronized int getInt(String str, int i) {
        return this.mKeva.getInt(str, i);
    }

    public synchronized long getLong(String str, long j) {
        return this.mKeva.getLong(str, j);
    }

    public synchronized String getString(String str, String str2) {
        String string = this.mKeva.getString(str, str2);
        if (string != null) {
            return string;
        }
        return str2;
    }

    public synchronized Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.mKeva.getStringSet(str, set);
        if (stringSet != null) {
            return stringSet;
        }
        return set;
    }

    public static KevaSpAdapter getSharedPreferences(Context context, String str, boolean z) {
        KevaSpAdapter kevaSpAdapter = new KevaSpAdapter(Keva.getRepoFromSp(context, str, 0));
        if (z) {
            kevaSpAdapter.mSp = context.getSharedPreferences(str, 0);
        }
        return kevaSpAdapter;
    }
}
