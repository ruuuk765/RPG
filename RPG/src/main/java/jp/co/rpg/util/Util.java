package jp.co.rpg.util;

public class Util {


	//文字列がNULLまたは空文字の場合はTrueを返す
    public static boolean isNullOrEmpty(Object object) {
//        if (str == null || str.isEmpty()) {
//            return true;
//        } else {
//            return false;
//        }

    	if(object instanceof Integer) {
			if(object != null) {
				return false;
			}
		}else if(object instanceof String) {
			if((object != null) && (!("".equals(object)))) {
				return false;
			}
		}
    	return true;
    }

    //文字列がInteger型に変換可能なときはTrueを返す
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return false;
        }

        return true;
    }

    //文字列をInteger型に変換して返す、変換できないときはNULLを返す
    public static Integer checkAndParseInt(String str) {
        if (isNumber(str)) {
            return Integer.parseInt(str);
        } else {
            return null;
        }
    }
}
