package android.support.v4.os;

import android.os.Build;
import android.os.LocaleList;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.Size;
import java.util.Locale;

public final class LocaleListCompat {
    static final LocaleListInterface IMPL;
    private static final LocaleListCompat sEmptyLocaleList = new LocaleListCompat();

    @RequiresApi(24)
    static class LocaleListCompatApi24Impl implements LocaleListInterface {
        private LocaleList mLocaleList = new LocaleList(new Locale[0]);

        public Object getLocaleList() {
            return this.mLocaleList;
        }

        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        @IntRange(from = 0)
        public int size() {
            return this.mLocaleList.size();
        }

        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        public String toString() {
            return this.mLocaleList.toString();
        }

        LocaleListCompatApi24Impl() {
        }

        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        @IntRange(from = -1)
        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        public void setLocaleList(@NonNull Locale... localeArr) {
            this.mLocaleList = new LocaleList(localeArr);
        }

        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        @Nullable
        public Locale getFirstMatch(String[] strArr) {
            if (this.mLocaleList != null) {
                return this.mLocaleList.getFirstMatch(strArr);
            }
            return null;
        }
    }

    static class LocaleListCompatBaseImpl implements LocaleListInterface {
        private LocaleListHelper mLocaleList = new LocaleListHelper(new Locale[0]);

        public Object getLocaleList() {
            return this.mLocaleList;
        }

        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        @IntRange(from = 0)
        public int size() {
            return this.mLocaleList.size();
        }

        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        public String toString() {
            return this.mLocaleList.toString();
        }

        LocaleListCompatBaseImpl() {
        }

        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        @IntRange(from = -1)
        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        public void setLocaleList(@NonNull Locale... localeArr) {
            this.mLocaleList = new LocaleListHelper(localeArr);
        }

        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        @Nullable
        public Locale getFirstMatch(String[] strArr) {
            if (this.mLocaleList != null) {
                return this.mLocaleList.getFirstMatch(strArr);
            }
            return null;
        }
    }

    private LocaleListCompat() {
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    public final int hashCode() {
        return IMPL.hashCode();
    }

    public final boolean isEmpty() {
        return IMPL.isEmpty();
    }

    @IntRange(from = 0)
    public final int size() {
        return IMPL.size();
    }

    @NonNull
    public final String toLanguageTags() {
        return IMPL.toLanguageTags();
    }

    public final String toString() {
        return IMPL.toString();
    }

    @Nullable
    public final Object unwrap() {
        return IMPL.getLocaleList();
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            IMPL = new LocaleListCompatApi24Impl();
        } else {
            IMPL = new LocaleListCompatBaseImpl();
        }
    }

    @Size(min = 1)
    @NonNull
    public static LocaleListCompat getAdjustedDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getAdjustedDefault());
        }
        return create(Locale.getDefault());
    }

    @Size(min = 1)
    @NonNull
    public static LocaleListCompat getDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getDefault());
        }
        return create(Locale.getDefault());
    }

    private void setLocaleListArray(Locale... localeArr) {
        IMPL.setLocaleList(localeArr);
    }

    public final boolean equals(Object obj) {
        return IMPL.equals(obj);
    }

    public final Locale get(int i) {
        return IMPL.get(i);
    }

    public final Locale getFirstMatch(String[] strArr) {
        return IMPL.getFirstMatch(strArr);
    }

    @IntRange(from = -1)
    public final int indexOf(Locale locale) {
        return IMPL.indexOf(locale);
    }

    public static LocaleListCompat create(@NonNull Locale... localeArr) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    @RequiresApi(24)
    public static LocaleListCompat wrap(Object obj) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        if (obj instanceof LocaleList) {
            localeListCompat.setLocaleList((LocaleList) obj);
        }
        return localeListCompat;
    }

    @RequiresApi(24)
    private void setLocaleList(LocaleList localeList) {
        int size = localeList.size();
        if (size > 0) {
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            IMPL.setLocaleList(localeArr);
        }
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
        Locale locale;
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        Locale[] localeArr = new Locale[split.length];
        for (int i = 0; i < localeArr.length; i++) {
            if (Build.VERSION.SDK_INT >= 21) {
                locale = Locale.forLanguageTag(split[i]);
            } else {
                locale = LocaleHelper.forLanguageTag(split[i]);
            }
            localeArr[i] = locale;
        }
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }
}
