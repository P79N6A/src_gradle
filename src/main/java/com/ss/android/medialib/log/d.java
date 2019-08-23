package com.ss.android.medialib.log;

import android.support.v4.util.ArraySet;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29692a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f29693b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static int f29694c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static int f29695d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static Set<String> f29696e = new ArraySet();

    /* renamed from: f  reason: collision with root package name */
    public static Set<String> f29697f = new ArraySet();
    private static Set<String> g = new ArraySet();

    static {
        f29696e.add("iesve_record_video_encode_mode");
        f29696e.add("iesve_record_audio_encode_mode");
        f29696e.add("iesve_video_decode_mode");
        f29696e.add("iesve_audio_decode_mode");
        f29696e.add("iesve_composition_video_encode_mode");
        f29696e.add("iesve_composition_video_decode_mode");
        f29696e.add("iesve_composition_audio_encode_mode");
        f29696e.add("iesve_composition_audio_decode_mode");
        f29696e.add("completed");
        f29696e.add("iesve_record_camera_type");
        f29696e.add("iesve_use_new_record");
        f29697f.add("iesve_record_frame_rate");
        f29697f.add("iesve_record_video_frame_encode_time");
        f29697f.add("iesve_record_start_time");
        f29697f.add("iesve_record_stop_time");
        f29697f.add("iesve_record_switch_camera_time");
        f29697f.add("iesve_record_render_average_time");
        f29697f.add("iesve_record_preview_frame_rate");
        f29697f.add("iesve_record_camera_frame_rate");
        f29697f.add("iesve_video_decode_average_time");
        f29697f.add("iesve_audio_decode_average_time");
        f29697f.add("iesve_composition_fps");
        f29697f.add("iesve_composition_bit_rate");
        f29697f.add("iesve_composition_file_duration");
        f29697f.add("iesve_composition_file_size");
        f29697f.add("iesve_composition_time");
        f29697f.add("iesve_composition_video_encode_time");
        f29697f.add("iesve_composition_audio_encode_time");
        f29697f.add("iesve_composition_video_decode_time");
        f29697f.add("iesve_composition_audio_decode_time");
        f29697f.add("iesve_import_generate_thumbnail_time");
        f29697f.add("iesve_import_crop_time");
        f29697f.add("iesve_import_crop_file_duration");
        f29697f.add("iesve_record_concat_time");
        f29697f.add("iesve_import_source_file_bitrate");
        f29697f.add("iesve_import_crop_file_bitrate");
        f29697f.add("iesve_import_source_file_duration");
        f29697f.add("iesve_seek_cost_ms");
        g.add("iesve_record_resolution");
        g.add("iesve_record_video_encode_type");
        g.add("iesve_record_video_preview_resolution");
        g.add("iesve_composition_resolution");
        g.add("iesve_import_source_file_resolution");
        g.add("iesve_import_crop_file_resolution");
    }
}
