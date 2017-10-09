package WS.interceptors.validators;

import WS.exceptions.BadRequestException;
import WS.interceptors.IValidator;
import org.springframework.stereotype.Component;


@Component
public class PlatformValidator implements IValidator {
    private String headerName = "Platform";
    private String iOS = "ios";
    private String Android = "android";

    public String headerKey() {
        return headerName;
    }

    public void checkHeader(String value)throws Exception  {
        if (value == null || (value.toLowerCase().equals(iOS) && value.toLowerCase().equals(Android)))
            throw new BadRequestException("Platform not supported");
    }
}
