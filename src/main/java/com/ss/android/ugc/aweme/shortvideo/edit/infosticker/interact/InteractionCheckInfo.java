package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class InteractionCheckInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<String> options;
    private String question;

    public List<String> getOptions() {
        return this.options;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setOptions(List<String> list) {
        this.options = list;
    }

    public void setQuestion(String str) {
        this.question = str;
    }
}
