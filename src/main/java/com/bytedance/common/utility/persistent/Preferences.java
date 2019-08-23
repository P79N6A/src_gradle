package com.bytedance.common.utility.persistent;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.ss.android.ugc.aweme.q.c;
import java.util.Map;
import java.util.Set;

@Deprecated
public class Preferences implements SharedPreferences {
    private SharedPreferences mPreference;

    public static class CustomEditor implements SharedPreferences.Editor {
        private SharedPreferences.Editor mEditor;

        public void apply() {
            this.mEditor.apply();
        }

        public SharedPreferences.Editor clear() {
            this.mEditor.clear();
            return this;
        }

        public boolean commit() {
            return this.mEditor.commit();
        }

        public CustomEditor(SharedPreferences.Editor editor) {
            this.mEditor = editor;
        }

        public SharedPreferences.Editor remove(String str) {
            this.mEditor.remove(str);
            return this;
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.mEditor.putBoolean(str, z);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f2) {
            this.mEditor.putFloat(str, f2);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.mEditor.putInt(str, i);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.mEditor.putLong(str, j);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.mEditor.putString(str, str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.mEditor.putStringSet(str, set);
            return this;
        }

        @Deprecated
        public SharedPreferences.Editor putBundle(String str, Bundle bundle) {
            this.mEditor.putString(str, Preferences.bundleToString(bundle));
            return this;
        }
    }

    public Map<String, ?> getAll() {
        return this.mPreference.getAll();
    }

    public CustomEditor edit() {
        return new CustomEditor(this.mPreference.edit());
    }

    public Preferences(SharedPreferences sharedPreferences) {
        this.mPreference = sharedPreferences;
    }

    public boolean contains(String str) {
        return this.mPreference.contains(str);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mPreference.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mPreference.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Deprecated
    public static String bundleToString(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            bundle.writeToParcel(obtain, 0);
            return Base64.encodeToString(obtain.marshall(), 0);
        } catch (Throwable unused) {
            return null;
        } finally {
            obtain.recycle();
        }
    }

    @Deprecated
    private static Bundle stringToBundle(String str) {
        byte[] decode = Base64.decode(str, 0);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            return (Bundle) Bundle.CREATOR.createFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }

    public boolean getBoolean(String str, boolean z) {
        return this.mPreference.getBoolean(str, z);
    }

    public float getFloat(String str, float f2) {
        return this.mPreference.getFloat(str, f2);
    }

    public int getInt(String str, int i) {
        return this.mPreference.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.mPreference.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.mPreference.getString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return this.mPreference.getStringSet(str, set);
    }

    public Bundle getBundle(String str, Bundle bundle) {
        String string = this.mPreference.getString(str, null);
        if (string == null) {
            return bundle;
        }
        return stringToBundle(string);
    }

    public static Preferences getById(Context context, String str) {
        return new Preferences(c.a(context, "pref_id_" + str, 0));
    }
}
