package WS;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderController {


    @RequestMapping("/header")
    public String CheckHeader() {
        return "Success";
    }

}

