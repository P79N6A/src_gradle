package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactFontManager {
    private static final String[] EXTENSIONS = {"", "_bold", "_italic", "_bold_italic"};
    private static final String[] FILE_EXTENSIONS = {".ttf", ".otf"};
    private static ReactFontManager sReactFontManagerInstance;
    private Map<String, FontFamily> mFontCache = new HashMap();

    static class FontFamily {
        private SparseArray<Typeface> mTypefaceSparseArray;

        private FontFamily() {
            this.mTypefaceSparseArray = new SparseArray<>(4);
        }

        public Typeface getTypeface(int i) {
            return this.mTypefaceSparseArray.get(i);
        }

        public void setTypeface(int i, Typeface typeface) {
            this.mTypefaceSparseArray.put(i, typeface);
        }
    }

    private ReactFontManager() {
    }

    public static ReactFontManager getInstance() {
        if (sReactFontManagerInstance == null) {
            sReactFontManagerInstance = new ReactFontManager();
        }
        return sReactFontManagerInstance;
    }

    public void setTypeface(String str, int i, Typeface typeface) {
        if (typeface != null) {
            FontFamily fontFamily = this.mFontCache.get(str);
            if (fontFamily == null) {
                fontFamily = new FontFamily();
                this.mFontCache.put(str, fontFamily);
            }
            fontFamily.setTypeface(i, typeface);
        }
    }

    @Nullable
    private static Typeface createTypeface(String str, int i, AssetManager assetManager) {
        String str2 = EXTENSIONS[i];
        String[] strArr = FILE_EXTENSIONS;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
                i2++;
            }
        }
        return Typeface.create(str, i);
    }

    @Nullable
    public Typeface getTypeface(String str, int i, AssetManager assetManager) {
        FontFamily fontFamily = this.mFontCache.get(str);
        if (fontFamily == null) {
            fontFamily = new FontFamily();
            this.mFontCache.put(str, fontFamily);
        }
        Typeface typeface = fontFamily.getTypeface(i);
        if (typeface == null) {
            typeface = createTypeface(str, i, assetManager);
            if (typeface != null) {
                fontFamily.setTypeface(i, typeface);
            }
        }
        return typeface;
    }
}
