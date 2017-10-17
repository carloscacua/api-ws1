package WS;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header")
public class HeaderController {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String CheckHeader() {
        return "Success";
    }

}

