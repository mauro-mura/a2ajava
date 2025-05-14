package io.github.vishalmysore.a2a.domain;



import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class JSONRPCError {
    private int code;
    private String message;
    private Map<String, Object> data;

    public JSONRPCError() {
    }

    public JSONRPCError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public JSONRPCError(int code, String message, Map<String, Object> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
