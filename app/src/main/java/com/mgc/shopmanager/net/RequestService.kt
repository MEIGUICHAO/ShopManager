package com.mgc.shopmanager.net

import com.mgc.shopmanager.base.Constants
import com.mgc.shopmanager.base.Datas
import com.mgc.shopmanager.base.ResponseData
import com.mgc.shopmanager.bean.ZTCCatalogBodyBean
import com.mgc.shopmanager.utils.SPUtils
import kotlinx.coroutines.Deferred
import retrofit2.http.*

interface RequestService {

    @GET("/sug")
    suspend fun getTBXialaSuggest(
        @Query("q") shop: String,
        @Query("code") code: String = "utf-8",
        @Query("callback") callback: String = "jsonp216",
        @Query("area") area: String = "c2c"
    ): ResponseData<String>

    //    &imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1
    @Headers(
        "urlname:${Datas.stb}",
        "referer:${Datas.referer}",
        "sec-fetch-dest:script",
        "sec-fetch-mode:no-cors",
        "sec-fetch-site:same-origin",
        "user-agent:${Constants.UserAgentString}"
    )
    @GET("/search")
    suspend fun getTitleKeyWord(
        @Query("q") shop: String,
        @Query("wq") wq: String,
        @Query("suggest_query") suggest_query: String
        ,
        @Query("data-key") datakey: String = "sale-desc",
        @Query("ajax") ajax: String = "true"
        ,
        @Query("_ksTS") _ksTS: String = "${System.currentTimeMillis()}_744",
        @Query("callback") callback: String = "jsonp745"
//   ,@Query("_ksTS") _ksTS:String ="1602137866634_744",@Query("callback") callback:String = "jsonp745"
        ,
        @Query("ie") ie: String = "utf8",
        @Query("initiative_id") initiative_id: String = "staobaoz_20201008",
        @Query("stats_click") stats_click: String = "search_radio_all%3A1"
        ,
        @Query("js") js: String = "1",
        @Query("_input_charset") _input_charset: String = "utf-8",
        @Query("source") source: String = "suggest"
        ,
        @Query("imgfile") imgfile: String = "",
        @Query("commend") commend: String = "all",
        @Query("ssid") ssid: String = "s5-e",
        @Query("search_type") search_type: String = "item",
        @Query("sourceId") sourceId: String = "tb.index",
        @Query("spm") spm: String = "a21bo.2017.201856-taobao-item.1"
    ): ResponseData<String>
//    https://subway.simba.taobao.com/openapi/param2/1/gateway.subway/traffic/cate/popular/word$
//    wordStatus: 1
//    cateId: 201273466
//    word: 广场
//    sla: json
//    isAjaxRequest: true
//    token: 79f481b1
//    _refere
//{"custId":null,"result":[{"adgroupCntIndex":"0.1186444502069417","avgPrice":"293","seNumIndex":"7810446.77861138","wordStatus":"3","word":"蓝牙音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"235","seNumIndex":"6954408.137241618","wordStatus":"3","word":"音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"103","seNumIndex":"5667148.272899447","wordStatus":"3","word":"天猫精灵","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"297","seNumIndex":"4078044.4286945537","wordStatus":"3","word":"蓝牙音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"201","seNumIndex":"2470236.3307211553","wordStatus":"3","word":"音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"321","seNumIndex":"2434069.590752791","wordStatus":"3","word":"电脑音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"162","seNumIndex":"1740070.994078286","wordStatus":"3","word":"小度智能音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"289","seNumIndex":"1697160.4504462758","wordStatus":"3","word":"音响 家用","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"134","seNumIndex":"1664815.0743971772","wordStatus":"3","word":"小度","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"123","seNumIndex":"1615726.7826944669","wordStatus":"3","word":"小爱同学智能音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"105","seNumIndex":"1510536.8857288298","wordStatus":"3","word":"小爱同学","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"60","seNumIndex":"1248259.5205170878","wordStatus":"3","word":"小米官方旗舰店","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"408","seNumIndex":"1129028.698699776","wordStatus":"3","word":"音响户外 音箱 k歌","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"282","seNumIndex":"1121612.9355689662","wordStatus":"3","word":"蓝牙音箱家用","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"276","seNumIndex":"1077494.194223553","wordStatus":"3","word":"音响电脑音响台式","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"263","seNumIndex":"1040510.3779136048","wordStatus":"3","word":"电脑音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"193","seNumIndex":"992983.1064269405","wordStatus":"3","word":"低音炮","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"282","seNumIndex":"939512.069204574","wordStatus":"3","word":"蓝牙小音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"424","seNumIndex":"866515.0806968668","wordStatus":"3","word":"广场舞音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"151","seNumIndex":"825914.6277749572","wordStatus":"3","word":"jbl音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"73","seNumIndex":"772653.4666195781","wordStatus":"3","word":"小米音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"255","seNumIndex":"764287.9020388777","wordStatus":"3","word":"低音炮音响 蓝牙","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"177","seNumIndex":"749798.3189817985","wordStatus":"3","word":"小音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"247","seNumIndex":"736923.1505253416","wordStatus":"3","word":"蓝牙音箱低音炮","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"268","seNumIndex":"681388.4903223754","wordStatus":"3","word":"音箱家用","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"164","seNumIndex":"670307.9609427471","wordStatus":"3","word":"智能音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"271","seNumIndex":"650766.680596502","wordStatus":"3","word":"音响小 便携式","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"112","seNumIndex":"641160.9036370588","wordStatus":"3","word":"jbl","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"194","seNumIndex":"631224.608954127","wordStatus":"3","word":"收款语音播报器","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"244","seNumIndex":"612239.1444124499","wordStatus":"3","word":"蓝牙音箱迷你小音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"97","seNumIndex":"561628.1435409721","wordStatus":"3","word":"天猫精灵官方旗舰店","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"206","seNumIndex":"520859.94526237785","wordStatus":"3","word":"音响低音炮","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"233","seNumIndex":"515272.3075896429","wordStatus":"3","word":"蓝牙音箱大音量","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"286","seNumIndex":"510657.7164156286","wordStatus":"3","word":"电脑音响 台式 家用","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"141","seNumIndex":"488393.9704656943","wordStatus":"3","word":"漫步者音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"322","seNumIndex":"476083.6209850051","wordStatus":"3","word":"广场舞音响带显示屏","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"307","seNumIndex":"475505.7233353761","wordStatus":"3","word":"收音机老人","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"174","seNumIndex":"473798.21465677343","wordStatus":"3","word":"小度智能机器人","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"254","seNumIndex":"464315.6788516292","wordStatus":"3","word":"音箱小型","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"224","seNumIndex":"451920.32537700114","wordStatus":"3","word":"蓝牙小音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"411","seNumIndex":"450987.18447611725","wordStatus":"3","word":"音响户外","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"358","seNumIndex":"448830.7418259607","wordStatus":"3","word":"小音响 无线蓝牙","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"140","seNumIndex":"439716.485211725","wordStatus":"3","word":"智能音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"276","seNumIndex":"409303.7735913153","wordStatus":"3","word":"蓝牙音响 小型","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"183","seNumIndex":"401659.62318523397","wordStatus":"3","word":"小音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"218","seNumIndex":"384859.3897132771","wordStatus":"3","word":"收钱语音播报器","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"216","seNumIndex":"381988.8061965901","wordStatus":"3","word":"家庭影院","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"99","seNumIndex":"376147.5247321705","wordStatus":"3","word":"小爱音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"120","seNumIndex":"358059.88061422313","wordStatus":"3","word":"漫步者","seNumChain":"0E-19"}],"cause":null,"errors":[],"analyseTraceId":null,"illogic":null,"memberId":null,"code":"200","msg":null,"success":true,"innerMsg":null}
//{"custId":null,"result":[{"adgroupCntIndex":"0.1186444502069417","avgPrice":"282","seNumIndex":"1121612.9355689662","wordStatus":"2","word":"蓝牙音箱家用","seNumChain":"21.5466537577151160000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"28985.63569859722","wordStatus":"2","word":"小米蓝牙语音遥控","seNumChain":"144.3211382113821000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"21688.01559866375","wordStatus":"2","word":"智能夜灯蓝牙音响","seNumChain":"617.3953488372093000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"21312.261982481745","wordStatus":"2","word":"天猫优品","seNumChain":"19.9302884615384600000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"13655.802234035957","wordStatus":"2","word":"影响 音箱蓝牙连接","seNumChain":"88.6540540540540600000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"9013.13081553448","wordStatus":"2","word":"emberton蓝牙音箱","seNumChain":"87.2520325203252000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"7615.987944419058","wordStatus":"2","word":"小杜官方旗舰店","seNumChain":"32.2400000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"7426.493812672497","wordStatus":"2","word":"ok公园","seNumChain":"44.6871794871794850000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"7018.580395815418","wordStatus":"2","word":"k9","seNumChain":"54.6953642384106000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"0","seNumIndex":"6104.494324112674","wordStatus":"2","word":"大功率舞台音响套装","seNumChain":"39.5222222222222260000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"5974.043369622809","wordStatus":"2","word":"15寸舞台音响套装","seNumChain":"2377.3333333333335000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"5813.976921463985","wordStatus":"2","word":"智能夜灯蓝牙音箱","seNumChain":"20.3538461538461530000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"5550.2859739186","wordStatus":"2","word":"gk12-1音箱","seNumChain":"244.1481481481481500000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"5510.011912980879","wordStatus":"2","word":"蓝牙音箱2","seNumChain":"33.5789473684210550000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"0","seNumIndex":"5087.174680536108","wordStatus":"2","word":"家庭影院音响 客厅 5.1","seNumChain":"25.6784140969163000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"5026.241618897736","wordStatus":"2","word":"太阳能 念佛机 防雨","seNumChain":"426.2857142857143000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4758.449361086057","wordStatus":"2","word":"无限蓝牙低音炮迷你小音响","seNumChain":"94.8813559322033900000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4626.5013490022275","wordStatus":"2","word":"舞台线阵音箱","seNumChain":"46.8000000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4268.19933520793","wordStatus":"2","word":"全能话筒音响一体麦克风","seNumChain":"252.1500000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3864.579396511699","wordStatus":"2","word":"anker无线充电蓝牙音箱","seNumChain":"54.1204819277108400000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"0","seNumIndex":"3714.6621074390605","wordStatus":"2","word":"店铺音响套装","seNumChain":"2196.0000000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3482.5010008340637","wordStatus":"2","word":"麦克风氛围灯","seNumChain":"2056.0000000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3354.6792421103714","wordStatus":"2","word":"博声 蓝牙","seNumChain":"29.2290076335877880000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3245.03890464388","wordStatus":"2","word":"小米10改装","seNumChain":"66.1578947368421100000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3208.475488040358","wordStatus":"2","word":"天猫国际美家直营","seNumChain":"55.4776119402985100000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2996.4035735355083","wordStatus":"2","word":"店铺装修","seNumChain":"43.6708860759493700000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2884.840622119744","wordStatus":"2","word":"利维坦电玩","seNumChain":"40.4024390243902500000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2710.658959808072","wordStatus":"2","word":"小音箱 台式 有线","seNumChain":"35.2045454545454500000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2643.0926540202995","wordStatus":"2","word":"先科广场舞音响蓝牙音箱","seNumChain":"51.6271186440678000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"0","seNumIndex":"2527.8982089643855","wordStatus":"2","word":"无线蓝牙低音炮迷你小音响","seNumChain":"28.9696969696969700000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2500.3360655868432","wordStatus":"2","word":"便携式k歌小音响","seNumChain":"24.0769230769230770000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2148.9792425658893","wordStatus":"2","word":"追剧神器创意","seNumChain":"837.0000000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2095.340862472444","wordStatus":"2","word":"小都智能音箱","seNumChain":"21.0720720720720700000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2036.6418861429236","wordStatus":"2","word":"双人卡随身听","seNumChain":"20.8348623853211020000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1926.697686457712","wordStatus":"2","word":"监牙音响低音炮","seNumChain":"20.4190476190476180000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1878.8199589515277","wordStatus":"2","word":"gental monster","seNumChain":"47.7111111111111100000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":"0","seNumIndex":"1809.8995586346641","wordStatus":"2","word":"漫步者迷你低音炮","seNumChain":"27.1333333333333330000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1699.6834121800073","wordStatus":"2","word":"库存尾货音响","seNumChain":"115.4117647058823500000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1580.047927085434","wordStatus":"2","word":"机器","seNumChain":"25.2428571428571440000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1562.3400625451907","wordStatus":"2","word":"乐延收音机插卡","seNumChain":"55.7500000000000000000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1554.749733356224","wordStatus":"2","word":"tf蓝牙音响","seNumChain":"41.0232558139534900000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1554.749733356224","wordStatus":"2","word":"伊顿收音机","seNumChain":"20.2588235294117640000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1491.467373670388","wordStatus":"2","word":"小杜智能机器人 音响百度","seNumChain":"18.9080459770114930000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1445.8704443039862","wordStatus":"2","word":"收钱码/收款码/收款牌","seNumChain":"20.2405063291139240000"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1399.3991128367502","wordStatus":"2","word":"音响代话筒","seNumChain":"230.8571428571428600000"}],"cause":null,"errors":[],"analyseTraceId":null,"illogic":null,"memberId":null,"code":"200","msg":null,"success":true,"innerMsg":null}
//{"custId":null,"result":[{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"54687.909792415776","wordStatus":"1","word":"无线蓝牙低音炮手机外小音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"17733.067354776336","wordStatus":"1","word":"迷你小唱机便携式户外音响","seNumChain":"0E-19"},{"adgroupCntIndex":"354.5103542429347","avgPrice":"106","seNumIndex":"13768.760370002898","wordStatus":"1","word":"华为freebudspro","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"10855.983237061126","wordStatus":"1","word":"震楼反击小音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"9013.13081553448","wordStatus":"1","word":"emberton蓝牙音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"8289.888956415121","wordStatus":"1","word":"西瓜视频音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"7860.065329970831","wordStatus":"1","word":"15寸户外演出音响套装","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"6719.083353338508","wordStatus":"1","word":"莓用手机","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"5550.2859739186","wordStatus":"1","word":"gk12-1音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4922.455991450919","wordStatus":"1","word":"震楼器物","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4758.449361086057","wordStatus":"1","word":"无限蓝牙低音炮迷你小音响","seNumChain":"0E-19"},{"adgroupCntIndex":"1548.8456242281002","avgPrice":"91","seNumIndex":"4633.925439471319","wordStatus":"1","word":"天猫精灵cc mini","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4294.638242169514","wordStatus":"1","word":"15寸演出音响套装","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"4289.68120022119","wordStatus":"1","word":"蓝牙小音响便携式小型家用客厅","seNumChain":"0E-19"},{"adgroupCntIndex":"91.09364122277084","avgPrice":"30","seNumIndex":"3784.2520062852027","wordStatus":"1","word":"in糖2","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3760.2298913867344","wordStatus":"1","word":"房式ktv","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3482.5010008340637","wordStatus":"1","word":"麦克风氛围灯","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3465.9062432695246","wordStatus":"1","word":"宅男必备","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3465.0764629974024","wordStatus":"1","word":"无线蓝牙低音炮手机外小音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3327.2760892078445","wordStatus":"1","word":"立体声三分频广场音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3242.5462118280084","wordStatus":"1","word":"无线hifi发烧便携音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"3028.857372760917","wordStatus":"1","word":"有线有源重低音炮游戏笔记本","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2987.2486478736864","wordStatus":"1","word":"华为freego","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2924.813388489984","wordStatus":"1","word":"广场舞音箱户外带话筒户外","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2884.840622119744","wordStatus":"1","word":"利维坦电玩","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2874.0127314873544","wordStatus":"1","word":"大型演出音响套装","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2644.7613773122057","wordStatus":"1","word":"喜多宝涅槃","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2508.688879645241","wordStatus":"1","word":"无线蓝牙迷你时钟音响闹钟","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2412.59687246671","wordStatus":"1","word":"网易云留声机","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2298.020084673829","wordStatus":"1","word":"大型户外线阵音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2225.1996490690362","wordStatus":"1","word":"几光情景蓝牙音响","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2195.0529681701655","wordStatus":"1","word":"奇声户外广场舞音箱手提便携","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2148.9792425658893","wordStatus":"1","word":"追剧神器创意","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2065.1570511261734","wordStatus":"1","word":"笔记本音箱插卡","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"2036.6418861429236","wordStatus":"1","word":"双人卡随身听","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1968.6757805942032","wordStatus":"1","word":"婚庆户外演出音响套装","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1955.2447876693102","wordStatus":"1","word":"爱 奇艺vip","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1950.207682725733","wordStatus":"1","word":"大音箱 家用型","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1927.5374291232174","wordStatus":"1","word":"刺猬","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1883.8608761860437","wordStatus":"1","word":"知复音箱","seNumChain":"0E-19"},{"adgroupCntIndex":"0.1186444502069417","avgPrice":null,"seNumIndex":"1878.8199589515277","wordStatus":"1","word":"gental monster","seNumChain":"0E-19"}],"cause":null,"errors":[],"analyseTraceId":null,"illogic":null,"memberId":null,"code":"200","msg":null,"success":true,"innerMsg":null}


    @Headers(
        "urlname:${Datas.ztc}",
        "user-agent:${Constants.UserAgentString}",
        "authority:subway.simba.taobao.com",
        "content-type:application/x-www-form-urlencoded; charset=UTF-8",
        "origin:https://subway.simba.taobao.com"
        ,
        "referer:https://subway.simba.taobao.com/?spm=a2e2i.11816827.0.homequick11816967.39c36abbQv9Iiv",
        "sec-fetch-dest: empty",
        "sec-fetch-mode: cors",
        "sec-fetch-site: same-origin",
        "x-requested-with: XMLHttpRequest"
    )
    @FormUrlEncoded
    @POST("/openapi/param2/1/gateway.subway/traffic/word/category$")
    suspend fun getZTCCategory(
        @Field("word") word: String,
        @Field("_referer") _referer: String = "/tool/traffic-analysis/index?spm=a2e2i.11816827.0.homequick11816967.39c36abbQv9Iiv&word=${Datas.shopName}&tabValue=trend"
        ,
        @Field("isAjaxRequest") isAjaxRequest: String = "true",
        @Field("sla") sla: String = "json",
        @Field("token") token: String = "f635fa38"
    ): ResponseData<String>


    @Headers(
        "urlname:${Datas.ztc}",
        "user-agent:${Constants.UserAgentString}",
        "authority:subway.simba.taobao.com",
        "content-type:application/x-www-form-urlencoded; charset=UTF-8",
        "origin:https://subway.simba.taobao.com"
        ,
        "referer:https://subway.simba.taobao.com/?spm=a2e2i.11816827.0.homequick11816967.39c36abbQv9Iiv",
        "sec-fetch-dest: empty",
        "sec-fetch-mode: cors",
        "sec-fetch-site: same-origin",
        "x-requested-with: XMLHttpRequest"
    )
    @FormUrlEncoded
    @POST("/openapi/param2/1/gateway.subway/traffic/related/word$")
    suspend fun getZTCRelatedWord(
        @Field("word") word: String,
        @Field("wordStatus") wordStatus: String,
        @Field("cateId") cateId: String,
        @Field("_referer") _referer: String = "/tool/traffic-analysis/index?spm=a2e2i.11816827.0.homequick11816967.39c36abbQv9Iiv&word=${Datas.shopName}&tabValue=trend"
        ,
        @Field("isAjaxRequest") isAjaxRequest: String = "true",
        @Field("sla") sla: String = "json",
        @Field("token") token: String = "f635fa38"
    ): ResponseData<String>

    @Headers(
        "urlname:${Datas.ztc}",
        "user-agent:${Constants.UserAgentString}",
        "authority:subway.simba.taobao.com",
        "origin:https://subway.simba.taobao.com",
        "referer:https://subway.simba.taobao.com/"
    )
    @GET("/bpenv/getLoginUserInfo.htm")
    suspend fun getLoginUserInfo(): ResponseData<String>

    @Headers("urlname:${Datas.aliUrl}")
    @GET("/alizs/market.htm")
    suspend fun getAlizs(): String

}

