package co.cuidamos.migracion.ds.api.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author <a href="mailto:juanp.toro@premize.com">Juan Pablo Toro
 *         Rincon</a>
 * @project mail-rest-service
 * @class JsonUtil
 * @HU_CU_REQ
 * @date 17/05/2019
 */
public class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    public static Object convertJsonToObject(String json,Object o){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, o.getClass());
        }catch (IOException e){
            logger.error(e.toString());
        }
        return null;
    }

    public static String convertObjectToJson(Object o){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(o);
        }catch (IOException e){
            logger.error(e.toString());
        }
        return null;
    }
}
