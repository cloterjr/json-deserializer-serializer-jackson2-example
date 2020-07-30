package com.example.enums;

public enum StatusEnum {
    ACTIVE("ativo"),
    INACTIVE("inativo");

    private String code;

    StatusEnum(String code){
        this.code = code;
    }

    public static StatusEnum getByCode(String code){
        for (StatusEnum e : StatusEnum.values()){
            if (e.code.equals(code))
                return e;
        }
        return ACTIVE;
    }

    public String getCode(){
        return code;
    }
}
