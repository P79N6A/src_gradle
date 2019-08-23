package com.tt.option.media;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public interface IFileChooseHandler {
    @AnyProcess
    void onActivityResult(int i, int i2, Intent intent);

    @AnyProcess
    void openFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);
}
