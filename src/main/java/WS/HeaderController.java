package WS;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderController {


    @RequestMapping(value = "/header", method = RequestMethod.GET)
    public String CheckHeader() {
        return "Success";
    }

}

