package com.ss.android.ugc.aweme.im.sdk.chat.input;

import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.ss.android.ugc.aweme.im.sdk.chat.input.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.i;
import com.ss.android.ugc.aweme.im.sdk.chat.view.MentionEditText;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IInputView {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PanelType {
    }

    void a();

    void a(int i);

    void a(d.a aVar);

    void a(c cVar);

    void a(MentionEditText.e eVar);

    void a(String str);

    void a(String str, String str2);

    void a(List<i> list);

    void a(List<i> list, int i);

    void b();

    void b(int i);

    void c();

    boolean d();

    void e();

    AudioRecordBar f();
}
