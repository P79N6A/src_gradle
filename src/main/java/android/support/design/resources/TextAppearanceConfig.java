package android.support.design.resources;

public class TextAppearanceConfig {
    private static boolean shouldLoadFontSynchronously;

    public static boolean shouldLoadFontSynchronously() {
        return shouldLoadFontSynchronously;
    }

    public static void setShouldLoadFontSynchronously(boolean z) {
        shouldLoadFontSynchronously = z;
    }
}
