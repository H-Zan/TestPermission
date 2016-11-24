package com.admai.permissiontest.bean;


import com.admai.permissiontest.Json.JsonNode;

import java.util.List;

/**
 * Created by macmi001 on 16/7/4.
 * 广告响应容器   bean  服务器返回来的
 */
public class MaiAd {

    //    广告位 id,即麦子互动分配给媒体的合 作广告位的唯一标识
    @JsonNode(key="pid")
    public String pid;

    //    麦子互动平台为该设备用户生成的唯 一标识
    @JsonNode(key="uuid")
    public String uuid;

    //    该次广告业务的业务 ID
    @JsonNode(key="bc")
    public String bc;

    //    物料展示类型
    //C:动态物料 V:video(嵌入式视频广告) N:Banner
    @JsonNode(key="etype")
    public String etype;

    //    物料类型
    /**
     * I:表示图片物料
     * F:表示 Flash物料
     * V:表示视频物料
     * X:表示 Flash 物料/富媒体物料 (多点击地址 Flash 物料是已嵌入 跳转地址和 Click 监测代码的物料)
     */
    @JsonNode(key="type")
    public int type;

    //    物料 URL
    @JsonNode(key="src")
    public String src;

    //    广告位宽度
    @JsonNode(key="adw")
    public int adw;

    //    广告位高度
    @JsonNode(key="adh")
    public int adh;


    //    落地页 URL 地址  两种  一种 点击图片跳转   另一种 跳到appstore 下载app
    //支持外链  支持 302 跳转          302跳转 重定向
    @JsonNode(key="ldp")
    public String ldp;


    //    点击监测 URL(s)
    /**
     * 支持多条点击监测
     * 点击监测支持 302 跳转。
     * 该值为包含点击监测地址的数组 (在 cm 数据非[]数据的情况下,媒 体需要支持并行访问数组中的 url 发送点击监测) eg. ["url1","url2", ...]
     */
    @JsonNode(key="cm")
    public List<String> cm;


    //    曝光监测 URL(s)及发送曝光监测的时机
    //    @NotProguard
    //    public Map<String, List<String>> pm;
    @JsonNode(key="pm")
    public List<String> pm;

    //    第三方点击监测 URL(s)
    @JsonNode(key="ocm")
    public List<String> ocm;

    //    第三方曝光监测 URL(s)
    @JsonNode(key="opm")
    public List<String> opm;
    
    //物料的点击行为   Duration:物料时长,视频物料  1:打开网页 2:下载应用
    @JsonNode(key="adct")
    public int adct;    
    
    @Override
    public String toString() {
        return pid + " - " + uuid + " - " + bc + " - " + etype + " - " 
               + type + " - " + src + " - " + adw + " - " + adh + " - " 
               + ldp + " - " + cm + " - " + pm + " - " + ocm + " - " + opm ;
    }

    public int getMtrType() {
        return type;
    }

    //    @NotProguard
    //    @SerializedName("pid")
    //    public String pid;
}
