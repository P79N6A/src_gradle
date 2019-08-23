package tv.danmaku.ijk.media.player;

import android.graphics.Rect;

public final class IjkTimedText {
    private Rect mTextBounds;
    private String mTextChars;

    public final Rect getBounds() {
        return this.mTextBounds;
    }

    public final String getText() {
        return this.mTextChars;
    }

    public IjkTimedText(Rect rect, String str) {
        this.mTextBounds = rect;
        this.mTextChars = str;
    }
}
