package com.inoapp.fonoapi;

import com.google.gson.annotations.Expose;

/**
 * Created by Trung Vo on 3/9/16.
 */
public class FonoDevice {

    public String toJson() {
        return DataAcquirer.getInstance().gson.toJson(this);
    }

    public static FonoDevice[] newInstances(String json) {
        return DataAcquirer.getInstance().gson.fromJson(json, FonoDevice[].class);
    }

    @Expose public String DeviceName;
    @Expose public String Brand;
    @Expose public String dimensions;
    @Expose public String size;
    @Expose public String resolution;

    @Expose public String technology;
    @Expose public String gprs;
    @Expose public String edge;
    @Expose public String announced;
    @Expose public String status;
    @Expose public String weight;
    @Expose public String sim;
    @Expose public String type;
    @Expose public String display_c;
    @Expose public String card_slot;
    @Expose public String alert_types;
    @Expose public String loudspeaker_;
    @Expose public String wlan;
    @Expose public String bluetooth;
    @Expose public String gps;
    @Expose public String radio;
    @Expose public String usb;
    @Expose public String messaging;
    @Expose public String browser;
    @Expose public String java;
    @Expose public String features_c;
    @Expose public String battery_c;
    @Expose public String stand_by;
    @Expose public String talk_time;
    @Expose public String colors;
    @Expose public String sar_us;
    @Expose public String sar_eu;
    @Expose public String sensors;
    @Expose public String cpu;
    @Expose public String internal;
    @Expose public String os;
    @Expose public String primary_;
    @Expose public String video;
    @Expose public String secondary;
    @Expose public String speed;
    @Expose public String chipset;
    @Expose public String features;
    @Expose public String protection;
    @Expose public String gpu;
    @Expose public String multitouch;
    @Expose public String nfc;
    @Expose public String _2g_bands;
    @Expose public String _3_5mm_jack_;
    @Expose public String _3g_bands;
    @Expose public String _4g_bands;
}

/*
[{
	"DeviceName": "Samsung I9305 Galaxy S III",
	"Brand": "Samsung",
	"technology": "GSM \/ HSPA \/ LTE",
	"gprs": "Class 12",
	"edge": "Class 12",
	"announced": "2012, September",
	"status": "Available. Released 2012, September",
	"dimensions": "136.6 x 70.6 x 8.6 mm (5.38 x 2.78 x 0.34 in)",
	"weight": "131 g (4.62 oz)",
	"sim": "Micro-SIM",
	"type": "Super AMOLED capacitive touchscreen, 16M colors",
	"size": "4.8 inches (~65.9% screen-to-body ratio)",
	"resolution": "720 x 1280 pixels (~306 ppi pixel density)",
	"display_c": "- TouchWiz UI\r\n  ",
	"card_slot": "microSD, up to 64 GB",
	"alert_types": "Vibration; MP3, WAV ringtones",
	"loudspeaker_": "Yes",
	"wlan": "Wi-Fi 802.11 a\/b\/g\/n, dual-band, Wi-Fi Direct, DLNA, hotspot",
	"bluetooth": "v4.0, A2DP, EDR, apt-X",
	"gps": "Yes, with A-GPS, GLONASS",
	"radio": "No",
	"usb": "microUSB v2.0 (MHL TV-out), USB Host",
	"messaging": "SMS(threaded view), MMS, Email, Push Mail, IM",
	"browser": "HTML, Adobe Flash",
	"java": "No",
	"features_c": "- ANT+ support\r\n  - S-Voice natural language commands and dictation\r\n  - Dropbox (50 GB cloud storage)\r\n  - Active noise cancellation with dedicated mic\r\n  - MP4\/DivX\/XviD\/WMV\/H.264 player\r\n  - MP3\/WAV\/eAAC+\/AC3\/FLAC player\r\n  - Photo\/video editor\r\n  - Document viewer",
	"battery_c": "Removable Li-Ion 2100 mAh battery",
	"stand_by": "Up to 580 h (2G) \/ Up to 390 h (LTE)\/ 510 h (3G)",
	"talk_time": "Up to 16 h (2G) \/ Up to 11 h (3G)",
	"colors": "Titanium Gray, Sapphire Black",
	"sar_us": "  0.41 W\/kg (head) &nbsp; &nbsp; 0.87 W\/kg (body) &nbsp; &nbsp; ",
	"sar_eu": "  0.24 W\/kg (head) &nbsp; &nbsp; ",
	"sensors": "Accelerometer, gyro, proximity, compass, barometer",
	"cpu": "Quad-core 1.4 GHz Cortex-A9",
	"internal": "16 GB, 2 GB RAM",
	"os": "Android OS, v4.1.1 (Jelly Bean), v4.3 (Jelly Bean), upgradable to v4.4.4 (KitKat)",
	"primary_": "8 MP, f\/2.6, autofocus, LED flash",
	"video": "1080p@30fps",
	"secondary": "1.9 MP, f\/2.6, 720p@30fps",
	"speed": "HSPA 42.2\/5.76 Mbps, LTE Cat3 100\/50 Mbps",
	"chipset": "Exynos 4412 Quad",
	"features": "1\/3\" sensor size, geo-tagging, touch focus, face\/smile detection",
	"protection": "Corning Gorilla Glass 2",
	"gpu": "Mali-400MP4",
	"multitouch": "Yes",
	"nfc": "Yes",
	"_2g_bands": "GSM 850 \/ 900 \/ 1800 \/ 1900 ",
	"_3_5mm_jack_": "Yes",
	"_3g_bands": "HSDPA 850 \/ 900 \/ 2100 ",
	"_4g_bands": "LTE band 3(1800), 7(2600), 20(800)"
}]
 */