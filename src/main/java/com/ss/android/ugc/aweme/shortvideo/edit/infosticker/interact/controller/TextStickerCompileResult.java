package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.support.annotation.Keep;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;

@Keep
public class TextStickerCompileResult extends d {
    public TextStickerData textStickerData;

    public TextStickerCompileResult(String str, int i) {
        super(str, i);
    }

    public TextStickerCompileResult(TextStickerData textStickerData2, d dVar) {
        super(dVar);
        this.textStickerData = textStickerData2;
    }

    public TextStickerCompileResult(String str, int i, TextStickerData textStickerData2) {
        super(str, i);
        this.textStickerData = textStickerData2;
    }
}
