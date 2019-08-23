package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;

public class RelatedSearchWordItem {
    @SerializedName("related_word")
    public String relatedWord;
    @SerializedName("word_record")
    public Word word;
}
