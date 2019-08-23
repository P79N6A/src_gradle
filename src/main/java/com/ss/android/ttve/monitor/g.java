package com.ss.android.ttve.monitor;

import android.support.v4.util.ArraySet;
import java.util.Set;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static int f31264a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static int f31265b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static int f31266c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static Set<String> f31267d = new ArraySet();

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f31268e = new ArraySet();

    /* renamed from: f  reason: collision with root package name */
    private static Set<String> f31269f = new ArraySet();

    static {
        f31267d.add("te_record_video_encode_mode");
        f31267d.add("te_record_audio_encode_mode");
        f31267d.add("te_video_decode_mode");
        f31267d.add("te_audio_decode_mode");
        f31267d.add("te_composition_video_encode_mode");
        f31267d.add("te_composition_video_decode_mode");
        f31267d.add("te_composition_audio_encode_mode");
        f31267d.add("te_composition_audio_decode_mode");
        f31267d.add("te_composition_video_sw_crf");
        f31267d.add("te_composition_video_sw_maxrate");
        f31267d.add("te_composition_video_sw_preset");
        f31267d.add("te_composition_video_gop");
        f31267d.add("completed");
        f31267d.add("te_record_camera_type");
        f31267d.add("te_composition_page_mode");
        f31268e.add("te_record_frame_rate");
        f31268e.add("te_record_video_frame_encode_time");
        f31268e.add("te_record_start_time");
        f31268e.add("te_record_stop_time");
        f31268e.add("te_record_switch_camera_time");
        f31268e.add("te_record_render_average_time");
        f31268e.add("te_record_preview_frame_rate");
        f31268e.add("te_record_camera_frame_rate");
        f31268e.add("te_video_decode_average_time");
        f31268e.add("te_audio_decode_average_time");
        f31268e.add("te_composition_fps");
        f31268e.add("te_composition_bit_rate");
        f31268e.add("te_composition_file_duration");
        f31268e.add("te_composition_file_size");
        f31268e.add("te_composition_time");
        f31268e.add("te_composition_video_encode_time");
        f31268e.add("te_composition_audio_encode_time");
        f31268e.add("te_composition_video_decode_time");
        f31268e.add("te_composition_audio_decode_time");
        f31268e.add("te_import_generate_thumbnail_time");
        f31268e.add("te_import_crop_time");
        f31268e.add("te_import_crop_file_duration");
        f31268e.add("te_record_concat_time");
        f31268e.add("te_import_source_file_bitrate");
        f31268e.add("te_import_crop_file_bitrate");
        f31268e.add("te_import_source_file_duration");
        f31269f.add("te_record_resolution");
        f31269f.add("te_record_video_encode_type");
        f31269f.add("te_record_video_preview_resolution");
        f31269f.add("te_composition_resolution");
        f31269f.add("te_import_source_file_resolution");
        f31269f.add("te_import_crop_file_resolution");
    }

    public static int a(String str) {
        if (f31267d.contains(str)) {
            return f31265b;
        }
        if (f31268e.contains(str)) {
            return f31266c;
        }
        return f31264a;
    }
}
