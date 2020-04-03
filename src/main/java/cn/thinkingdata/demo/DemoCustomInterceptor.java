package cn.thinkingdata.demo;

import cn.thinkingdata.ta.interceptor.CustomInterceptor;
import cn.thinkingdata.ta.interceptor.data.TaDataDo;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sun Zeyu
 * @date 2020/3/20 15:28
 */
public class DemoCustomInterceptor implements CustomInterceptor {

    private final static Logger logger = LoggerFactory.getLogger(DemoCustomInterceptor.class);

    public TaDataDo transFrom(String s, String s1) {
        String[] split = s.split("\\|");
        TaDataDo taDataDo = new TaDataDo();
        JSONObject json = new JSONObject();
        json.put("game_id", split[1]);
        taDataDo.setPropertyObj(json);
        return taDataDo;
    }
}
