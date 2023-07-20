package az.coders.chapter1.coders.enums;

import java.util.Arrays;

public enum SateteEnum {

    ACTIVE(1), DEACTIVE(0);


    Integer dbCode;

    SateteEnum(Integer code) {
        this.dbCode = code;
    }


    Integer  getCode(){
        return  this.dbCode;
    }


    public static SateteEnum findByCode(int code) {
        return Arrays.stream(SateteEnum.values())
                .filter(e -> e.getCode()==code)
                .findFirst().orElse(null);
    }


}
